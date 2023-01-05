import proxy.*;

import java.util.List;

public class Client {
    public static void main(String[] args) throws JAXBException_Exception {
        ReleveWebService stub = new ReleveWS().getReleveWebServicePort();
        Releve rel1 = stub.getReleve();
        //System.out.println(rel1.toString());
        Operations ops  = stub.getReleve().getOperations();
        List<Operation> operations = stub.getReleve().getOperations().getOperation();
        System.out.println("RIB : " +rel1.getRib());
        System.out.println("Solde : " +rel1.getSolde());
        System.out.println("de "+ops.getDateDebut() + "\tvers "+ ops.getDateFin());
        for (int i =0 ; i< operations.size();i++)
            System.out.println(operations.get(i).getType() + "\t" + operations.get(i).getMontant()+"\t"+operations.get(i).getDescription()+"\t"+operations.get(i).getDate());
    }


}