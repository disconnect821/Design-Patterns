package DesginPattern.StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{
    private final String folderName;
    private List<FileSystemItem> childItems;

    public Folder(String folderName){
        this.folderName = folderName;
        childItems = new ArrayList<>();
    }

    public void addFile(FileSystemItem item){
        childItems.add(item);
    }

    @Override
    public void ls(int space) {
        for(FileSystemItem child : childItems){
            if(child.isFolder()){
                System.out.println(" ".repeat(space) + "+ " +  child.getName());
            }else{
                System.out.println(" ".repeat(space) + child.getName());
            }
        }
    }

    @Override
    public void openAll(int space) {
        System.out.println(" ".repeat(space) + "+ " + folderName);
        for(FileSystemItem child : childItems){
            child.openAll(space + 4);
        }
    }

    @Override
    public int getSize() {
        int folderSize = 0;
        for(FileSystemItem child : childItems){
            folderSize+=child.getSize();
        }
        return folderSize;
    }

    @Override
    public String getName() {
        return folderName;
    }

    @Override
    public FileSystemItem cd(String targetFolder) {
        FileSystemItem target = null;
        for(FileSystemItem child : childItems){
            if(child.isFolder() &&  child.getName().equals(targetFolder)){
                target = child;
                break;
            }
        }
        return target;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
