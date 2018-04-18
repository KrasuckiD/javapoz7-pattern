package com.sda.builder;

import java.util.Arrays;

public class UserTest {
    public static void main(String[] args) {
        User user = User.builder().firstName("Szymon").
                secondName("Nowak").birthDay("1234").phoneNumber("123456789").build();

        Arrays.asList(User.builder().firstName("Adam").secondName("Kowalski").build());

new UserWithLombok.UserWithLombokBuilder().firstName("Szymon").secondName("Nowak").build();
    }
}
