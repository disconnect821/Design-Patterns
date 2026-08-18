package DesginPattern.BehaviouralPattern.mementoPattern;

public class EditorMemento {

    public String content;

    public EditorMemento(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
