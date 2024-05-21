package cse305;

import java.util.Scanner;

public class Client {

    public Contract requestCreateRentalContract(String contractType, String propertyID, String tenantID,
            double rentAmount) {
        Contract contract = null;

        switch (contractType) {
            case "Permanent":
                contract = new Permanent();
                break;
            case "LongTerm":
                contract = new LongTerm();
                break;
            case "ShortTerm":
                contract = new ShortTerm();
                break;
            default:
                throw new IllegalArgumentException("Unknown contract type: " + contractType);
        }

        contract.buildContractID();
        contract.buildPropertyID(propertyID);
        contract.buildTenantID(tenantID);
        contract.buildRentAmount(rentAmount);
        return contract.signContract();
    }

    public Document createDocument(String docType) {
        Document document = null;

        switch (docType) {
            case "Normal":
                document = new NormalDoc();
                break;
            case "Confidential":
                document = new ConfidentialDoc();
                break;
            default:
                throw new IllegalArgumentException("Unknown document type: " + docType);
        }

        document.setExtension();
        document.setEncryption();
        return document.buildDoc();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Do you want to create a rental contract? (yes/no): ");
        String createContract = scanner.nextLine();

        if (createContract.equalsIgnoreCase("yes")) {
            System.out.println("Enter contract type (Permanent, LongTerm, ShortTerm): ");
            String contractType = scanner.nextLine();

            System.out.println("Enter property ID: ");
            String propertyID = scanner.nextLine();

            System.out.println("Enter tenant ID: ");
            String tenantID = scanner.nextLine();

            System.out.println("Enter rent amount: ");
            double rentAmount = scanner.nextDouble();
            scanner.nextLine(); // consume the newline

            Contract contract = client.requestCreateRentalContract(contractType, propertyID, tenantID, rentAmount);

            System.out.println(contractType + " Contract created with ID: " + contract.getContractID());
        }

        System.out.println("Do you want to create a document? (yes/no): ");
        String createDocument = scanner.nextLine();

        if (createDocument.equalsIgnoreCase("yes")) {
            System.out.println("Enter document type (Normal, Confidential): ");
            String docType = scanner.nextLine();

            Document document = client.createDocument(docType);

            if (document instanceof NormalDoc) {
                System.out.println("Normal Document created with Extension: " + ((NormalDoc) document).getExtension() +
                        " and Encryption: " + ((NormalDoc) document).getEncryption());
            } else if (document instanceof ConfidentialDoc) {
                System.out.println(
                        "Confidential Document created with Extension: " + ((ConfidentialDoc) document).getExtension() +
                                " and Encryption: " + ((ConfidentialDoc) document).getEncryption());
            }
        }

        scanner.close();
    }
}