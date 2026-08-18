package DesginPattern.BehaviouralPattern.TemplatePattern;

public class RPCParser extends Parser{
    @Override
    protected void processData() {
        System.out.println("File processed with RPC parser");
    }

    protected void openFile(){
        System.out.println("File opened using RPC parser");
    }

}
