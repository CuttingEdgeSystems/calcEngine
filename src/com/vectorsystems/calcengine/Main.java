package com.vectorsystems.calcengine;

import javax.swing.*;

/*
10/22
Rchisman
Calculator
 */
public class Main {

    public static void main(String[] args) throws Exception {
        double[]leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[]rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[]opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
	    /*double value1 = 100.0d;
	    double value2 = 0.0d;
	    double result = 0.0d;
        char opcode ='d';*/

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;

                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;

                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;

                case 'd': {
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                        /*  if (value2 != 0)
                        result = value1 / value2;*/
                }
                break;
                default:
                    System.out.println("Invalid opCode:" + opCodes[i]);
                    results[i] = 0.0d;
                    break;

            }
        }
         for (double currentResult : results)
         System.out.println(currentResult);



    }
}


