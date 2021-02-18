package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 50.0d, 25.0d, 60.0d};
        double[] rightVals = {5.0d, 76.0d, 35.0d, 20.0d};
        char[] opCodes = {'a', 'd', 's', 'm'};
        double[] results = new double[opCodes.length];
//	    double value1 = 5.0d;
//	    double value2 = 10.0d;
//	    double result;
//	    char opCode = 'd';
        for(int i = 0; i< opCodes.length; i++){
            if(opCodes[i] =='a'){
                results[i] = leftVals[i] + rightVals[i];
            }else if(opCodes[i] == 's'){
                results[i] = leftVals[i] - rightVals[i];
            }else if(opCodes[i] == 'm'){
                results[i] = leftVals[i] * rightVals[i];
            }else if(opCodes[i] == 'd'){
                results[i] = leftVals[i] / rightVals[i];
            }else{
                results[i] = 0;
            }

//            System.out.println(results[i]);
        }
        for(double val:results){
            System.out.println("the answer is " + val);
        }

    }
}
