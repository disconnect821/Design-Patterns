package DesginPattern.StructuralDesignPattern.CompositePattern;

public class Client {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.addFile(new File("file1.txt",1));
        root.addFile(new File("file2.txt",1));

        Folder docs = new Folder("docs");
        docs.addFile(new File("resume.pdf",1));
        docs.addFile(new File("word.exe",1));

        root.addFile(docs);


        root.openAll(0);
        System.out.println();
        root.ls(0);
        System.out.println();
        FileSystemItem cdFolder = root.cd("docs");
        if(cdFolder!=null)
            cdFolder.ls(0);

        System.out.println("Size of " + root.getName() + " : " + root.getSize());
    }
}
