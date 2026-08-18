// Creates a new file if it does not already exist.

try {
    File newFile = new File ("pathComplete");
    if (newFile.createNewFile()) {
        System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (IOException ioe) {
    System.out.println(ioe.getMessage());
}
