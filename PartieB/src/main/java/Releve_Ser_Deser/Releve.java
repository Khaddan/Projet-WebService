package Releve_Ser_Deser;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name = "releve")
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute
    private String RIB;
    @XmlElement
    private Date dateReleve;
    @XmlElement
    private double Solde;
    @XmlElement
    private Operations operations;

    public Releve() {
    }

    public Releve(String RIB, Date dateReleve, double solde, Operations op) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        Solde = solde;
        this.operations = op;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return Solde;
    }

    public void setSolde(double solde) {
        Solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Releve{" +
                "RIB='" + RIB + '\'' +
                ", dateReleve=" + dateReleve +
                ", Solde=" + Solde +
                ", operations=" + operations +
                '}';
    }
}

