package fileExplore;

public class File {

    private Object content;
    private String fileName;
    private File next;

    public File(String fileName, Object content) {
        this.content = content;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setNext(File next) {
        this.next = next;
    }

    public File getNext() {
        return next;
    }

    public Object getContent() {
        return content;
    }
}