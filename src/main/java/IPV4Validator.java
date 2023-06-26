public class IPV4Validator {

    public static boolean validateIPv4Address(String ipAddress) {
        // Separate with .
        String[] blocks = ipAddress.split("\\.");

        // Verification of exactly 4 blocks
        if (blocks.length != 4) {
            return false;
        }

        // Verify each block
        for (String block : blocks) {
            try {
                // Just integers
                int value = Integer.parseInt(block);

                // Addresses are exactly between (0-255)
                if (value < 0 || value > 255) {
                    return false;
                }

                // No IP address .0 and no broadcast
                if (value == 0 || value == 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
//the main
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";
        boolean isValid = validateIPv4Address(ipAddress);
        System.out.println(isValid);
    }
}
