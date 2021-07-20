package com.statefarm;

public class SumOfPositivesCLI {

    public static void main(String[] args) {

        int sumTotal = 0;

        for(int i = 0; i < args.length; i++){
            int currIndex = Integer.parseInt(args[i]);

            if(currIndex > 0){
                sumTotal += currIndex;
            }
        }

        if(args.length == 0) {
            System.out.println("0");
        } else {
            System.out.println(sumTotal);
        }
    }
}
