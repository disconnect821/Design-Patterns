package SOLID.ISP.GoodCode;

public class MultiPurposeMachine implements Printer, Scanner, Copier{
    @Override
    public void copy(Document document) {
        System.out.println("Copying the Document");
    }

    @Override
    public void print(Document document) {
        System.out.println("Printing the Document");
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning the Document");
    }
}
