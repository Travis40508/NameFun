package com.company;

import java.util.Scanner;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Responses {
    private Scanner scanner;

    public Responses() {
        scanner = new Scanner(System.in);
    }

    /**
     * Grabs user entered name.
     */
    public String getName() {
        String name = scanner.next();
        return name;
    }
}
