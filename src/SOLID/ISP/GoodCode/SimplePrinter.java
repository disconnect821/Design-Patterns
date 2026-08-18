package SOLID.ISP.GoodCode;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document document){
        System.out.println("printing the document");
    }
}
