package org.example;

import java.util.Scanner;
import org.example.utils.StringUtils;

public class GenerativeAiProgram {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");
        final String password = scanner.next();

        System.out.println("Enter maximum password length:");
        final int length = scanner.nextInt();

        System.out.println(StringUtils.isStrongPassword(password, length));
    }
}
