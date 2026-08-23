package DesginPattern.StructuralDesignPattern.AdapterPattern;

public class Client {
    public void getReport(Report report){
        report.getJSONData();
        System.out.println("JSON data received");
    }
    public static void main(String[] args) {
        //Create adaptee
        XMLProvider xmlProvider = new XMLProvider();

        //Create adapter
        Report xmlDataProviderAdapter = new XMLDataProviderAdapter(xmlProvider);

        Client client = new Client();

        //Get JSON data from report
        client.getReport(xmlDataProviderAdapter);
    }
}
