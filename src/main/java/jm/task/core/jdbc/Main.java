package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Sergo","Billionaire", (byte) 28);
        userService.saveUser("Michel","Pivozavr", (byte) 30);
        userService.saveUser("Gosha","Frontovik", (byte) 21);
        userService.saveUser("Andrey","Comporator", (byte) 54);

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}