package com.librarymanagement.models;

public class User{

    protected String name;
    protected String UserName;
    private Role role;
    private String password;

    User(String name, String UserName, Role role, String password){
        this.name = name;
        this.UserName = UserName;
        this.role = role;
        this.password = password;
    } //end constructor method

    public String getName(){
        return name;
    }

    public Role getRole(){
        return role;
    }

    public String getUserName(){
        return UserName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUserName(String name){
        this.UserName=name;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
}