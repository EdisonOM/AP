/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SomeDude(Edison)
 */
public class MathFunctions extends Test {

    public static void SquareRootAndAddThree(int p) {
        List<MathFunctions> result = new ArrayList();
        double rag = Math.sqrt(p);
        boolean done = false;
        double j = rag;
        while (!done) {
            j++;
            if (j == rag + 3) {
                done = true;
            }

        }
        result.add(new result(j));

//                for (MathFunctions y:result){
//                int count = 0;
//                y += count;
        if (j > 1000) {

            double sum = 0;
            for (int i = 0; i < result.size(); i++) {
                System.out.println("The sum is " + sum);
            }

        }
    }
}
