package fileExplore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Folder {

    private HashMap<String, Folder> childFolders;
    private File firstFile;

    public Folder() {
        childFolders = new HashMap<>();
    }

    public void addFolder(String folderName, Folder f) {
        childFolders.put(folderName, f);
    }

    public void addFile(File f) {
        if (firstFile == null) {
            this.firstFile = f;
            return;
        }

        f.setNext(firstFile);
        this.firstFile = f;
    }

    public File getFile(String fileName) {
        File currentFile = firstFile;
        while (currentFile != null) {
            if (currentFile.getFileName().equals(fileName)) {
                return currentFile;
            }

            currentFile = currentFile.getNext();
        }

        return null;
    }

    public Folder getFolder(String folderName) {
        return childFolders.get(folderName);
    }
}
