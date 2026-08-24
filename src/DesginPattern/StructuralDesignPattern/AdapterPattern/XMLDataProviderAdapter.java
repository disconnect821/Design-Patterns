package DesginPattern.StructuralDesignPattern.AdapterPattern;

public class XMLDataProviderAdapter implements Report{
    private final XMLProvider xmlProvider ;

    public XMLDataProviderAdapter(XMLProvider xmlProvider){
        this.xmlProvider = xmlProvider;
    }

    @Override
    public void getJSONData() {
        xmlProvider.getXMLData();
        System.out.println("XML data received");
        System.out.println("XML data converted to JSON");
    }
}
