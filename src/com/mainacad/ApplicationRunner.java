package com.mainacad;

import com.mainacad.service.NumberService;

public class ApplicationRunner {

    public static void main(String[] args) {

        NumberService numberService = new NumberService();

        int result1 = numberService.getSumByDivision(12345);
        System.out.println("GetSumByDivision " + result1);

        int result2 = numberService.getSumByTypeManipulation(12345);
        System.out.println("GetSumByTypeManipulation " + result2);
    }
}
