package DesginPattern.BehaviouralPattern.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        Parser jsonParser = new JSONParser();
        jsonParser.parse();

        Parser xmlParser = new XMLParser();
        xmlParser.parse();

        Parser rpcParser = new RPCParser();
        rpcParser.parse();
    }
}
