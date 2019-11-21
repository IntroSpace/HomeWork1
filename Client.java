package com.example.myapplication;

public class Client {
    private float cash;
    private String name;
    private String password;
    public Client(String name, float cash)
            throws Exception {
        this.setName(name);
        this.setCash(cash);
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) throws Exception {
        if (cash < 0) {
            throw new Exception("Negative cash");
        }
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.length() == 0) {
            throw new Exception("Empty name");
        }
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
