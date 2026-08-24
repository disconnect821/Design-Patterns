package DesginPattern.StructuralDesignPattern.CompositePattern;

public interface FileSystemItem {
    void ls(int space);
    void openAll(int space);
    int getSize();
    String getName();
    FileSystemItem cd(String name);
    boolean isFolder();
}
