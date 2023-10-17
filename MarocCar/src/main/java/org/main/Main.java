package org.main;

import org.main.dbConnection.AuthDbOperations;

public class Main {
    public static void main(String[] args) {
        AuthDbOperations authDbOperations = new AuthDbOperations();
        System.out.println("Opened database successfully");
        authDbOperations.getToutClient();
    }
}