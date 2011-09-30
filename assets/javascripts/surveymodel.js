
var SurveyModel = function(s){
    var survey = s;

    //public methods
    this.getSurvey = function(){return survey;};

    this.updateCategory = function ( catId, newLabel ){
        getCategory( catId).label = newLabel;
    }

    this.updateSurveyTitle = function ( newTitle ){
        survey.title = newTitle;
    }

    this.getQuestion = function ( qId ){
        var quest;
        $.each(survey.categoryCollection, function( i, cateItem ){
            $.each(cateItem.questionCollection, function( i, qItem ){
               if( qItem.uiId == qId ){
                   quest = qItem;
               }
            });
        });
        return quest;
    }

    this.createNewSurvey = function(){
        survey = new Survey();
        return survey;
    }

    this.newCategory = function (){
        var newCategory = new Category();        
        survey.categoryCollection.push( newCategory );
        
        return newCategory;
    }

    this.newQuestion = function( categoryId ){
        var newQuestion = new Question();
        var category = getCategory( categoryId );
        
        category.questionCollection.push( newQuestion );
        return newQuestion;
    }

    //private methods
    function getCategory( catId ){
        var category;
        $.each(survey.categoryCollection, function( i, item ){
           if( item.uiId == catId ){
               category = item;
           }
        });
        return category;
    }
}

var Category = function(){
    var numRand = Math.floor( Math.random() * 10000 ); //TODO maybe exist better way to get rundom id
    this.label = "New Category";
    this.objectName = "category" + numRand;
    this.questionCollection = [];
}

var Question = function(){
    var numRand = Math.floor( Math.random() * 10000 ); //TODO maybe exist better way to get rundom id

    this.label = "New question";
    this.objectName = "category" + numRand;
    this.questionType = new Object();
    this.questionType.id = 1;
}

var Survey = function(){
    this.title = "New survey";
    this.categoryCollection = [];
    this.categoryCollection.push( new Category() );
}

