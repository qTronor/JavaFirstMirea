package ru.mirea.task26;

public interface Strategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
