package session_2_assignment.assigment_problems;

public class LibraryIsbnNormalizerValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) {
            return "";
        }
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code == null || code.length() != 13) {
            String errorMsg = "Invalid: wrong length";
            System.out.println(errorMsg);
            return errorMsg;
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                String errorMsg = "Invalid: publisher code must be 3 letters";
                System.out.println(errorMsg);
                return errorMsg;
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                String errorMsg = "Invalid: non-digit body";
                System.out.println(errorMsg);
                return errorMsg;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(code.substring(0, 3)).append("] YEAR: ")
          .append(code.substring(3, 7)).append(" | CATALOG: ")
          .append(code.substring(7));

        String result = sb.toString();
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        String normalized1 = normalizeCode(" pen2026004251 ");
        validateAndFormat(normalized1);

        // Test Case 2
        String normalized2 = normalizeCode("12N2026004251");
        validateAndFormat(normalized2);
    }
}
