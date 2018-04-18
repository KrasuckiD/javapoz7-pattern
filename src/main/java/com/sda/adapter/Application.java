package com.sda.adapter;


public class Application {
    public static void main(String[] args) {
        UsersFileFacade usersFileFacade = new UsersFileFacade("C:\\Users\\Dell\\Desktop\\projekty\\javapoz7Patterns\\src\\main\\resources\\users.txt");
        UserFileAdapter userFileAdapter = new UserFileAdapter(usersFileFacade);
        UserProgram userProgram = new UserProgram(userFileAdapter);
        userProgram.listUsers();

    }
}