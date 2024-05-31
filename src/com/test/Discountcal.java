package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discountcal {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        float amount=0,payableAmount=0;
        System.out.println("Enter the shopping amount:");
        amount=Float.parseFloat(bufferedReader.readLine());
        if(amount>=500 && amount<=1000){
            payableAmount=amount-((amount*10)/100);
        }
        else if(amount > 1000){
            payableAmount=amount-((amount*20)/100);
        }
        System.out.println("Payable amount:"+payableAmount);

    }

}