package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    private int code ;
    @XmlTransient
    private Date dateCreation ;
    private double solde ;

    public Compte() {
    }

    public Compte(int code, Date dateCreation, double solde) {
        this.code = code;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
