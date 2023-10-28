package com.systechafrica.encapsulation;

public class DbCreds {

    // ! can't be accessed directly
    private final String url = "jdbc:mysql:\\localhost:8080";
    private String userName = "Admin";
    private String pass = "12345Admin";

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "DbCreds [userName=" + userName + ", pass=" + pass + "]";
    }

}
