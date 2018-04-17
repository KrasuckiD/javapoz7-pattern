package com.sda.builder;

public class User {
    private String firstName;
    private String secondName;
    private String birthDay;
    private String phoneNumber;

    public User() {
    }

    public static UserBuilder builder (){
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String firstName;
        private String secondName;
        private String birthDay;
        private String phoneNumber;

        public User build(){
            User user = new User();
            user.setFirstName(this.firstName);
            user.setSecondName(this.secondName);
            user.setBirthDay(this.birthDay);
            user.setPhoneNumber(this.phoneNumber);
            return user;
        }

        public UserBuilder firstName(String value){
            this.firstName= value;
           return this;
        }
        public UserBuilder secondName(String value){
            this.secondName=value;
           return this;
        }
        public UserBuilder birthDay(String value){
            this.birthDay=value;
           return this;
        }
        public UserBuilder phoneNumber(String value){
            this.phoneNumber=value;
           return this;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
