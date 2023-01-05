package Releve_Ser_Deser;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    @XmlAttribute
    private String type;
    @XmlAttribute
    private Date date;
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(String type, Date date, double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}

