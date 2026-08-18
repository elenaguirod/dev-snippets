// Deletes the specified file if it exists.

try {
    File File = new File ("pathComplete");
    if (File.exists()) {
        File.delete();
            System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (Exception e) {
    System.out.println(ioe.getMessage());
}
