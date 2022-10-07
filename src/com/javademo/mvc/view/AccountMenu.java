package com.javademo.mvc.view;

import com.javademo.mvc.model.Account;
import com.javademo.mvc.util.KBInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class AccountMenu {

    public static void displayMenuView() {
        System.out.println("Welcome to basic CRUD Application.");
        System.out.println();
        System.out.println("'add' -- Adds an account to the app.");
        System.out.println("'read all' -- Reads all accounts in the app.");
        System.out.println("'update' -- Update an account.");
        System.out.println("'delete' -- Deletes an account from the app.");
        System.out.println("'help' -- Show this menu for command reference.");
        System.out.println("'exit' -- Exits the app.");
        System.out.println();
    }

    public static Account createAccountView() {

        Account accInput = new Account();

        try {
            System.out.println("========== CREATE NEW ACCOUNT ==========");
            accInput.setFirstName(KBInput.readString("Enter First Name: "));
            accInput.setLastName(KBInput.readString("Enter Last Name: "));
            accInput.setGender(KBInput.readString("Enter Gender: "));
            accInput.setBio(KBInput.readString("Enter Bio: "));
            System.out.println("========================================");
        } catch (IOException ioExc) {
            System.err.println("Invalid Input!\n" + ioExc.getMessage());
        }

        return accInput;
    }

    public static void showAllAccountsView(ArrayList<Account> accounts) {
        if(accounts.isEmpty()) {
            System.out.println("There are no accounts at the moment.");
            System.out.println("Type 'add' to add a new account.");
            return;
        }

        accounts.forEach((acct) -> {
            System.out.println();
            System.out.println("ID: " + acct.getID());
            System.out.println("Name: " + acct.getLastName() + ", " + acct.getFirstName());
            System.out.println("Gender: " + acct.getGender());
            System.out.println("Bio: " + acct.getBio());
            System.out.println();
        });
    }

    public static UUID deleteAccountView() {
        UUID idToDel = null;
        try {
            System.out.println("========== DELETE NEW ACCOUNT ==========");
            idToDel = KBInput.readUUID("Enter ID to Delete: ");
            System.out.println("========================================");
        } catch (IOException ioExc) {
            System.err.println("Invalid Input!\n" + ioExc.getMessage());
        }

        return idToDel;
    }
}
