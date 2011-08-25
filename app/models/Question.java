/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import play.data.validation.Required;
import play.db.jpa.Model;


@Entity
public class Question extends Model {
    
    @Required
    @Column( nullable= false)
    public String objectName;
    
    @Lob
    @Column(nullable=false)
    public  String label;
    
    @Lob
    public String hint;
    
    public String constraintText;
    
    public Integer required;
    
    public Integer readonly;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question" )
    public Collection<Answer> answerCollection;
    
    @ManyToOne(optional = false)
    public Survey survey;
    
    @ManyToOne(optional = false)
    public QuestionType questionType;
    
    @ManyToOne
    public DefaultAnswer defaultAnswer;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    public Collection<QuestionOption> questionOptionCollection;


    @Override
    public String toString() {
        return "br.org.indt.ndg.server.persistence.structure.Questions[ id=" +  " ]";
    }
    
}
