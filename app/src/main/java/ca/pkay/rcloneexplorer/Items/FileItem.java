package ca.pkay.rcloneexplorer.Items;

public class FileItem {

    private String remote;
    private String path;
    private String name;
    private long size;
    private String modTime;
    private boolean isDir;

    public FileItem(String remote, String path, String name, long size, String modTime, boolean isDir) {
        this.remote = remote;
        this.path = path;
        this.name = name;
        this.size = size;
        this.modTime = modTime;
        this.isDir = isDir;
    }

    public String getRemote() {
        return remote;
    }
    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getModTime() {
        return modTime;
    }

    public boolean isDir() {
        return isDir;
    }
}
