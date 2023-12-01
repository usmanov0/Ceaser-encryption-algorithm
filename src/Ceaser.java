public class Ceaser {
    public static String encrypt(String plainText, int shift) {
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);
            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';


                char encryptedChar = (char) ((((currentChar - base + shift) % 26) + 26) % 26 + base);
                cipher.append(encryptedChar);
            } else {
                cipher.append(currentChar);
            }
        }
        return cipher.toString();
    }
    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }
}

