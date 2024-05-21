package cse305;

public class Client {
    public Contract requestCreateRentalContract(String type) {
        switch (type) {
            case "Permanent":
                return new Permanent();
            case "LongTerm":
                return new LongTerm();
            case "ShortTerm":
                return new ShortTerm();

        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        Contract permanentContract = client.requestCreateRentalContract("Permanent");
        permanentContract.buildContractID("C123");
        permanentContract.buildPropertyID("P456");
        permanentContract.buildTenantID("T789");
        permanentContract.buildRentAmount(1200.0);
        Contract signedPermanentContract = permanentContract.signContract();

        Contract longTermContract = client.requestCreateRentalContract("LongTerm");
        longTermContract.buildContractID("C124");
        longTermContract.buildPropertyID("P457");
        longTermContract.buildTenantID("T790");
        longTermContract.buildRentAmount(1500.0);
        Contract signedLongTermContract = longTermContract.signContract();

        Contract shortTermContract = client.requestCreateRentalContract("ShortTerm");
        shortTermContract.buildContractID("C125");
        shortTermContract.buildPropertyID("P458");
        shortTermContract.buildTenantID("T791");
        shortTermContract.buildRentAmount(800.0);
        Contract signedShortTermContract = shortTermContract.signContract();
    }
}
