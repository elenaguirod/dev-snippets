static String pathSeparator(String path){
    String separatorSlash = "\\";
    try {
        // If we are on Windows
        if (File.separator.equals(separatorSlash)) {
            separatorSlash = "/";
        // Replace all strings that have a match with the regular expression for the string File.separator.
        }
        return path.replaceAll(separatorSlash, File.separator); 
    } catch (Exception e) {
        // If a java.util.regex.PatternSyntaxException happens.
        return path.replaceAll(separatorSlash + separatorSlash, File.separator);
    } 
}
