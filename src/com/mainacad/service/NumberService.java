package com.mainacad.service;

public class NumberService {

    public Integer getSumByDivision(int number) {

        Integer result = 0;
        result = number % 100;
        return result;
    }

    public Integer getSumByTypeManipulation(int number) {

        Integer result = 0;
        String numberAsString = String.valueOf(number);

        // "12345" -> {'1', '2', '3', '4', '5'}
        char[] symbols = numberAsString.toCharArray();

        // The 1 Variant
        for (int i = 0; i < symbols.length; i++) {
            result += Integer.parseInt(String.valueOf(symbols[i]));
        }

        // The 2 Variant
//        for (char symbol :symbols) {
//            result += Integer.parseInt(String.valueOf(symbol));
//        }

        // The 3 Variant
//        int i = 0;
//        while (i < symbols.length){
//            result += Integer.parseInt(String.valueOf(symbols[i]));
//            i++;
//        }

        // The 4 Variant
//        int i = 0;
//        do{
//            result += Integer.parseInt(String.valueOf(symbols[i]));
//            i++;
//        } while (i < symbols.length);

        return result;
    }
}
