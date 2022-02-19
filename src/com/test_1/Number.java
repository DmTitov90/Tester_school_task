package com.test_1;

class Number {
    private int userNumber;
    private int sum;
    private boolean check;

    public Number(String userNumber) {
        this.userNumber = Integer.parseInt(userNumber);
    }

    public void start() {
        System.out.println("Сумма простых чисел : " + checker());
    }

    private int checker() {
        for (int primeNumber = 1; primeNumber < userNumber; primeNumber++) {
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    break;
                }
            }
            if (check) sum = sum + primeNumber;
            else check = true;
        }
        return sum;
    }
}