/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
@Table(name = "company")
public class Company extends  Model {
  
    @Required
    @Column(nullable=false, name = "company_name")
    public String companyName;
    
    @Required
    @Column(nullable=false, name = "company_type")
    public String companyType;
    
    @Required
    @Column(nullable=false, name = "company_country")
    public String companyCountry;
    
    @Required
    @Column(nullable=false, name = "company_industry")
    public String companyIndustry;
    
    @Required
    @Column(nullable=false, name = "company_size")
    public String companySize;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    public Collection<NdgUser> userCollection;

    public Company() {
    }

    public Company(String companyName, String companyType, String companyCountry, String companyIndustry, String companySize) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyCountry = companyCountry;
        this.companyIndustry = companyIndustry;
        this.companySize = companySize;
    }

  
    @Override
    public String toString() {
        return "br.org.indt.ndg.server.persistence.structure.Company[ idCompany=" + getId() + " ]";
    }
    
}
