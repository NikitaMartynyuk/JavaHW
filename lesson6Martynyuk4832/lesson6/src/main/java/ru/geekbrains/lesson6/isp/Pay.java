package ru.geekbrains.lesson6.isp;

public interface Pay {

    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);

}
