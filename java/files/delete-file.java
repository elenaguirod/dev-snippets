try {
    // We create the object that encapsules the file.
    File newFile = new File ("pathComplete");
    // From the File object we delete the file physically.
    if (newFile.exists()) {
        newFile.delete();
            System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (Exception ioe) {
    ioe.getMessage();
}
