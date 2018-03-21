class Validate {
    public static void main(String[] args) {
        System.out.println(Validate.validatePassword("    "));
        System.out.println(Validate.validatePassword("nfjsdfjsd"));
        System.out.println(Validate.validatePassword("1fgfhjgd"));
    }

    public static String validatePassword(String password) {
        String response;
        if (password.trim().isEmpty()) {
            response = "Error! Password contains an empty string!";
            return response;
        } else if (password.length() != 8) {
            response = "Error! Password must be 8 characters!";
            return response;
        } else {
            boolean hasInteger = false;
            for (char item : password.toCharArray()) {
                try {
                    Integer.valueOf(item);
                    hasInteger = true;
                    break;
                } catch (NumberFormatException e) {
                    hasInteger = false;
                }
            }
            if (hasInteger) {
                response = "Good! Password contains at least one digit!";
            } else {
                response = "Error! Password must contain at least one digit!";
            }
        }
        return response;
    }
}