// Creates a directory or a complete directory structure.

try {
    String directoryPath = "folderPath";
    String nestedDirectoryPath = "folder1/folder2/folder3";
    // Creates a single directory.
    boolean success = new File(directoryPath).mkdir();
    if (success) {
        System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
    // Creates the directory structure, including missing parent directories.
    success = new File(nestedDirectoryPath).mkdirs();
    if (success) {
        System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (Exception e) {
    System.out.println(e.getMessage());
}
