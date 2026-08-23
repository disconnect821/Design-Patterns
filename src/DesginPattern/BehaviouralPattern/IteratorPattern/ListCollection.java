package DesginPattern.BehaviouralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ListCollection<T> implements Iterable<T>{
    private List<T> list = new ArrayList<>();
    public void addElement(T element){
        list.add(element);
    }
    @Override
    public Iterator<T> getIterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator<T>{
        int position = 0;
        @Override
        public T next() {
            return list.get(position++);
        }

        @Override
        public boolean hasNext() {
            if(list.size()<=position){
                return false;
            }
            return true;
        }
    }
}
