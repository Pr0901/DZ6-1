package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int start, int end) {

        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= start) & (i * i <= end)) {
                quantity++;
            }
        }
        return quantity;
    }
}
