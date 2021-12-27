package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static void fizzBuzz() {
        int n = 1;
        for (n = 1; n <= 100; n++)

            if (n % 15 == 0)
                System.out.println("FizzBuzz");
            else if (n % 3 == 0)
                System.out.print("Fizz");
            else if (n % 5 == 0)
                System.out.print("Buzz");
            else
                System.out.print(n);
    }

    int countStars(String[] result) {
        int totalStars = 0;
        for (String r : result) {
            if (r == "---") {
            } else if (r == "--*") {
                totalStars += 1;
            } else if (r == "-**") {
                totalStars += 2;
            } else if (r == "***") {
                totalStars += 3;
            }
        }
        return totalStars;
    }

    int creepyMoments(String[] moments) {
        int beeps = 0;
        for (int i = 0; i < moments.length; i++) {
            char a = moments[i].charAt(0);
            char b = moments[i].charAt(1);
            char c = moments[i].charAt(3);
            char d = moments[i].charAt(4);
            //AB:AB
            if (a == c & b==d){
                beeps += 1;
            }
            //AA:BB
            if (a == b & c==d){
                beeps += 1;
            }
            //AB:BA
            if (a == d & b==c){
                beeps += 1;
            }
            //AA:AA
            if (a == b & b== c & c ==d){
                beeps += 1;
            }
        }
    return beeps;}

    int championPoints(int[]wins,int[]ties){
        List<Integer> results = new ArrayList<>();
        for(int i=0; i < wins.length;i++){
            int points = wins[i] * 3 +ties[i];
            results.add(points);
        }
        return results.stream().sorted().findFirst().get();
    }
}
