package com.internship;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please insert the count of candies you have gathered: ");
        int length = scn.nextInt();
        int[] candies = new int[length];
        System.out.println("Please insert the sugar grams of the candies you have gathered: ");

        for (int i = 0; i < candies.length; i++){
            candies[i] = scn.nextInt();
        }

        System.out.println("Please insert the amount of sugar grams you can eat: ");
        int threshold = scn.nextInt();

        Map<Integer, Integer> candiesAndIndexes = new HashMap<Integer, Integer>();

        for (int i = 0; i < candies.length; i++)
            candiesAndIndexes.put(candies[i], i);

        Arrays.sort(candies);

        ArrayList<Integer> eatenCandies = new ArrayList<Integer>();

        int grams = 0;

        for (int i = 0; i < candies.length; i++) {
            if (grams + candies[i] >= threshold)
                break;

            grams += candies[i];
            eatenCandies.add(candiesAndIndexes.get(candies[i]));
        }

        Collections.sort(eatenCandies);
        int[] result = new int[eatenCandies.size()];
        for (int i = 0; i < eatenCandies.size(); i++)
            result[i] = eatenCandies.get(i);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}