package com.example.myapplication;

public class BankClient {
    public Client client;
    private int bankCash;
    public BankClient(Client client)
            throws Exception {
        this.client = client;
        this.setBankCash(0);
    }

    public int getBankCash() {
        return bankCash;
    }

    public void setBankCash(int bankCash) throws Exception {
        if (bankCash < 0){
            throw new Exception("negative bankCash");
        }
        this.bankCash = bankCash;
    }
}
