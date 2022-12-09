package com.bridgelabz.interaction;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        int i, j;
        int row = 4;
        int pattern =1;
        int space = row -1;
        //for printing rows
        for (i = 0; i < row; i++) {
            //for spaces
            for (j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            //for pattern
            for (j = 1; j <= pattern; j++) {
                System.out.print("* ");
            }
            pattern= pattern+2;
            space--;//for next line
            System.out.println();
        }
    }
}
