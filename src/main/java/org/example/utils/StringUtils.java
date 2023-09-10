package org.example.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtils {

    private StringUtils() {
    }

    /**
     * This function validates whether the input password contains at least one lower character,
     * at least one upper character, at least one digit, at least one of the following signs !"#$%&'()*+,\-./:;<=>?@\[\]^_`{|}~ ,
     * has the maximum defined length, and doesn't contain any whitespace characters
     *
     * @param password is the input string to match the rules
     * @param length is the maximum defined password length
     * @return the matching result
     */
    public static boolean isStrongPassword(final String password, final int length) {
        final Pattern strongPasswordPattern = Pattern.compile(
            "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!\"#$%&'()*+,\\-./:;<=>?@\\[\\]^_`{|}~])(?=.{0," + length + "}$)^[\\S]+$"
        );
        final Matcher matcher = strongPasswordPattern.matcher(password);
        return matcher.matches();
    }
}
