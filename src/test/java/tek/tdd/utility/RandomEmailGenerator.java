package tek.tdd.utility;

import java.util.Random;

public class RandomEmailGenerator {
    public static String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder localPart = new StringBuilder(10);
        for (int i = 0; i < 10; i++){
            localPart.append(characters.charAt(random.nextInt(characters.length())));
        }
        return localPart + "@gmail.com";
    }
}
