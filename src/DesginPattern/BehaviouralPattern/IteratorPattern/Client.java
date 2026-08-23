package DesginPattern.BehaviouralPattern.IteratorPattern;

public class Client {
    public static void main(String[] args) {
        ListCollection<Integer> list = new ListCollection<>();
        list.addElement(12);
        list.addElement(11);
        list.addElement(10);
        list.addElement(16);

        Iterator<Integer> listIterator = list.getIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
