package session_2_assignment.class_problems;

public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            String errorMsg = "Invalid phone number";
            System.out.println(errorMsg);
            return errorMsg;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                String errorMsg = "Invalid phone number";
                System.out.println(errorMsg);
                return errorMsg;
            }
        }

        StringBuilder sb = new StringBuilder("XXXXXX");
        sb.append(phone.substring(6));
        sb.insert(6, "-");

        String masked = sb.toString();
        System.out.println(masked);
        return masked;
    }

    public static void main(String[] args) {
        // Test Case 1
        maskPhoneNumber("9876543210");

        // Test Case 2
        maskPhoneNumber("98765");
    }
}
