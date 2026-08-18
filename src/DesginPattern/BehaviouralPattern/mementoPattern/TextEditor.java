package DesginPattern.BehaviouralPattern.mementoPattern;

public class TextEditor {
    private String content;

    public void writeContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public EditorMemento saveState(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContent();
    }
}
