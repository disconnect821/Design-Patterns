package SOLID.LSP.GoodCode;

public class Operation {
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadableFile();
        readableFile.read();

        WriteableFile writeableFile = new WriteableFile();
        writeableFile.read();
        writeableFile.write();

        //Any file is now readable
        //But read only file is not writeable.
        readAnyFile(readableFile);
        readAnyFile(writeableFile);
    }
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
}
