package ru.akorsa.lambda.lesson4;

import java.util.Scanner;

public class FilterLoggerMapper {
    public static void main(String[] args) {
        String targetUser = "user10";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] splittedData = line.split("\t");
            if (splittedData[1].equals(targetUser)) {
                System.out.println(line);
            }
        }
    }
}
