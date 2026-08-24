package DesginPattern.BehaviouralPattern.TemplatePattern;

public abstract class Parser {

    public final void parse(){
        openFile();
        processData();
        closeFile();
    }

    protected void openFile() {
        System.out.println("File opened through Default parser");
    }

    protected abstract void processData();

    protected void closeFile(){
        System.out.println("File closed through Default parser");
    }
}
