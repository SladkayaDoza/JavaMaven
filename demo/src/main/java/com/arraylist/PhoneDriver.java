package com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDriver {
    private static final int SIZE = 5;

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", "iPhone 15", 128, 39999));
        phones.add(new Phone("Samsung", "Galaxy S24", 256, 34999));
        phones.add(new Phone("Xiaomi", "Redmi Note 13", 128, 9999));

        Scanner in = new Scanner(System.in);
        while (phones.size() < SIZE) {
            System.out.println("Phone #" + (phones.size() + 1));
            String brand = readLine(in, "Brand: ");
            String model = readLine(in, "Model: ");
            int memory = readInt(in, "Memory (GB): ");
            double price = readDouble(in, "Price: ");
            phones.add(new Phone(brand, model, memory, price));
        }

        System.out.println("\nAll phones:");
        for (Phone phone : phones) {
            System.out.println(phone);
        }

        System.out.println("\nphones[0] equals phones[1]: " + phones.get(0).equals(phones.get(1)));
    }

    private static String readLine(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = in.nextLine().trim();
            if (!line.isEmpty()) return line;
            System.out.println("Value cannot be empty.");
        }
    }

    private static int readInt(Scanner in, String prompt) {
        while (true) {
            try {
                int value = Integer.parseInt(readLine(in, prompt));
                if (value > 0) return value;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("Enter a positive integer.");
        }
    }

    private static double readDouble(Scanner in, String prompt) {
        while (true) {
            try {
                double value = Double.parseDouble(readLine(in, prompt).replace(',', '.'));
                if (value > 0) return value;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("Enter a positive number.");
        }
    }
}
