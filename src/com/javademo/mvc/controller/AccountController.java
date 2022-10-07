package com.javademo.mvc.controller;

import com.javademo.mvc.model.Account;
import com.javademo.mvc.model.AccountRepository;
import com.javademo.mvc.util.KBInput;
import com.javademo.mvc.view.AccountMenu;

import java.io.IOException;
import java.util.UUID;

public class AccountController {

    public void startMenu() {
        String userInput = "";
        AccountMenu.displayMenuView();
        try {
            userInput = KBInput.readString("> ");
        } catch (IOException ioExc) {
            System.err.println("Invalid Input!\n" + ioExc.getMessage());
        }

        switch (userInput) {
            case "add":
                var newAccount = AccountMenu.createAccountView();
                createAccount(newAccount);
                break;
            case "read all":
                displayAllAccounts();
                break;
            case "delete":
                UUID uuidToDel = AccountMenu.deleteAccountView();
                deleteAccount(uuidToDel);
                break;
            case "help":
                AccountMenu.displayMenuView();
                break;
            case "exit":
                System.out.println("Thank you for using this program!");
                System.exit(0);
            default:
                System.out.println("Invalid Input! Please Try again.");
        }
    }

    private void createAccount(Account account) {
        // this simulates code that adds user data into the database
        AccountRepository.accounts.add(account);
    }

    private void displayAllAccounts() {
        // this simulates code that shows current accounts from the database
        AccountMenu.showAllAccountsView(AccountRepository.accounts);
    }

    private void deleteAccount(UUID accountID) {
        // this simulates code that deletes an account from the database
        AccountRepository.accounts.removeIf(acct -> acct.getID().equals(accountID));
    }
}
