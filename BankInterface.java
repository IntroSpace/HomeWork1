package com.example.myapplication;

public interface BankInterface {
    public boolean transaction(float sum,
                               Client clientFrom, Client ClientTo) throws Exception;
    public void registration(Client client) throws Exception;
}
