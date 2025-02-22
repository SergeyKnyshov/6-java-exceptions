package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12){
            return "winter";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            return "spring";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
            return "summer";
        } else if (monthNumber == 9|| monthNumber == 10 || monthNumber == 11){
            return "autumn";
        } else {
            throw new MyException(String.format("monthNumber %d is invalid, month number should be between 1..12", monthNumber));
        }
    }

}