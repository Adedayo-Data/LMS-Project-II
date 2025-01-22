package com.librarymanagement.models;

public abstract class User {

    protected String name;
    protected String userName;
    private String password;
    private Role role;

    User(String name, String userName, String password, Role role){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    // reset passoword
    public void resetPassword(){
        this.password = "0000";

        /*
         * get the user details
         * save the password for that user
         */
    }

    public abstract void profileInfo();
    // {
    //     System.out.println("---------------------------");
    //     System.out.println("Name: " + name);
    //     System.out.println("UserName: "+ userName);
    //     System.out.println("Books currently borrowed: ");
    // }

    // set password
    public void setPassword(String pass){
        password = pass;
    }

    public String getPassword(){
        return password;
    }
    
    // get userId
    public abstract String getUserId();
}
