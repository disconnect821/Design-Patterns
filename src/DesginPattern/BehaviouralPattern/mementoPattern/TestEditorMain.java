package DesginPattern.BehaviouralPattern.mementoPattern;

public class TestEditorMain {
    public static void main(String[] args) {

        EditorHistory editorHistory = new EditorHistory();

        TextEditor textEditor = new TextEditor();
        textEditor.writeContent("First");
        editorHistory.saveState(textEditor);

        textEditor.writeContent("second");
        editorHistory.saveState(textEditor);

        textEditor.writeContent("third");
        editorHistory.saveState(textEditor);


        System.out.println(textEditor.getContent());
        editorHistory.undo(textEditor);

    }
}
