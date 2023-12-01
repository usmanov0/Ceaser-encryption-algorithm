import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input string: ");
        String plaintext = scanner.nextLine();

        System.out.print("shift (count step): ");
        int shift = scanner.nextInt();

        String ciphertext = Ceaser.encrypt(plaintext,shift);
        System.out.println("Encoding string: " + ciphertext);

        String deCipher= Ceaser.decrypt(ciphertext,shift);
        System.out.println("Decoding string:" +deCipher);

        scanner.close();
    }
}