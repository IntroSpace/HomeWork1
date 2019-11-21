package com.example.myapplication;

import java.util.Arrays;

public class Bank implements BankInterface{
    private BankClient[] clients = new BankClient[2];
    public static int clientsCount = 0;
    private String name;
    private int indexOne, indexTwo;
    public Bank(String name) throws Exception {
        this.setName(name);
    }
    @Override
    public boolean transaction(float sum,
           Client clientFrom, Client ClientTo) throws Exception {
        if (this.clients[0].client==clientFrom) {
            indexOne=0;
        } else if (this.clients[1].client==clientFrom) {
            indexOne=1;
        } else throw new Exception();
        if (this.clients[0].client==ClientTo) {
            indexTwo=0;
        } else if (this.clients[1].client==ClientTo) {
            indexTwo=1;
        } else throw new Exception();
        this.clients[indexOne].setBankCash((int) (this.clients[indexOne].getBankCash()-sum));
        this.clients[indexTwo].setBankCash((int) (this.clients[indexTwo].getBankCash()+sum));
        return true;
    }

    @Override
    public void registration(Client client)
            throws Exception {
        this.clients[clientsCount] =
                new BankClient(client);
        clientsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
            throws Exception {
        if (name.length() == 0) {
            throw new Exception("Empty bank name");
        }
        this.name = name;
    }
}
