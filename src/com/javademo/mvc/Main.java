package com.javademo.mvc;

import com.javademo.mvc.controller.*;

public class Main {
    public static void main(String[] args) {
        AccountController acctController = new AccountController();
        while(true) {
            acctController.startMenu();
        }
    }
}
