package SlidePrecenter.AutoGenerateEmail;

import java.util.Random;

public class EmailGenerator {
    private static final String STRING_VALUES = "0123456789" + "abcdefghijklmnopqrstuvxyz" + "QWERTYUIO";

    public static String generateString(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(STRING_VALUES.charAt(new Random().nextInt(STRING_VALUES.length())));
        }
        return sb.toString();
    }
    public static String getRandomPassword(int size) {
        return generateString(size);
    }
    public static String getRandomSename(int size) {
        return generateString(size);
    }
    public static final String GENERATE_RANDOM_EMAIL(int size) {
        return generateString(size) + "@test.com";
    }
}
