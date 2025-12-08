package com.learning.bank;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount customerAndri = new BankAccount();

        customerAndri.setCustomerName("Andri");
        customerAndri.setAccountNumber("77777");
        customerAndri.setBalance(1_000_000);
        customerAndri.setEmail("andripurwanto540@gmail.com");
        customerAndri.setPhoneNumber("000007");

        customerAndri.deposit(1_000_000);
        customerAndri.withdraw(1_000_000);
    }
}
