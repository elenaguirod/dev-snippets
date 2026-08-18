// Normalizes path separators according to the current operating system.

static String normalizePath(String path){
    String separatorSlash = "\\";
    try {
        // If we are on Windows
        if (File.separator.equals(separatorSlash)) {
            separatorSlash = "/";
        }
        return path.replaceAll(separatorSlash, File.separator); 
    } catch (PatternSyntaxException e) {
        return path.replaceAll(separatorSlash + separatorSlash, File.separator);
    } 
}
