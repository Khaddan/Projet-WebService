package Releve_Ser_Deser;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;

public class TestDeserialisation {
    public static void main(String[] args) throws JAXBException {
        //Deserialization
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        List<Operation> operationList = releve.getOperations().getOperation();

        for (Operation oper:operationList){
            System.out.println("---------------------");
            System.out.println("Type: "+oper.getType());
            System.out.println("Date: "+oper.getDate());
            System.out.println("Montant: "+oper.getMontant());
            System.out.println("Description: "+oper.getDescription());

        }
        System.out.println(operationList.toString());

    }
}
