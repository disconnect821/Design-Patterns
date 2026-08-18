package DesginPattern.BehaviouralPattern.mementoPattern;

import java.util.Stack;

//Caretaker - which manages mementos
public class EditorHistory {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor){
        EditorMemento memento = editor.saveState();
        history.push(memento);
    }
    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            history.pop();
            //Last state
            EditorMemento lastMemento = history.peek();
            editor.restore(lastMemento);

        }
    }

}
