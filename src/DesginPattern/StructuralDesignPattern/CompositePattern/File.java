package DesginPattern.StructuralDesignPattern.CompositePattern;

public class File implements FileSystemItem{
    private final String fileName;
    private final int size;

    public File(String fileName, int size){
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void ls(int space) {
        System.out.println(" ".repeat(space) + fileName);
    }

    @Override
    public void openAll(int space) {
        System.out.println(" ".repeat(space) + fileName);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public FileSystemItem cd(String name) {
        return null;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}
