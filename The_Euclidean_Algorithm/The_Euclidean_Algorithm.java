package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int findGCD(int x,int y){
        int rem = x%y;
        if (rem == 0) return y;
        return findGCD(y,rem);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int gcd = findGCD(Integer.parseInt(input.readLine()),Integer.parseInt(input.readLine()));
        System.out.println(gcd);

    }
}
