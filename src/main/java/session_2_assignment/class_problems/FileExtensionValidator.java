package session_2_assignment.class_problems;

public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {
        if (filename == null || !filename.contains(".")) {
            String msg = "Rejected \u2014 invalid file type";
            System.out.println(msg);
            return msg;
        }

        int lastDotIndex = filename.lastIndexOf('.');
        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            String msg = "Rejected \u2014 invalid file type";
            System.out.println(msg);
            return msg;
        }

        String extension = filename.substring(lastDotIndex + 1);
        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {
            System.out.println("Accepted");
            return "Accepted";
        } else {
            String msg = "Rejected \u2014 invalid file type";
            System.out.println(msg);
            return msg;
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        validateFileExtension("Assignment1.PDF");

        // Test Case 2
        validateFileExtension("notes.txt");
    }
}
