package com.jaguar.landrover;

public class Vin{
    public static boolean checkValidity(String vin){
        String[] vinArray = vin.split("(?<=.)");
        int[] intArray = new int[10];
        int sum = 0;
        for (int i = 0; i < vinArray.length; i++) {
            intArray[i] = Integer.parseInt(vinArray[i]);
            if(i < vinArray.length - 1){
                sum += intArray[i] * i;
            }
        }
        int modulo = sum%11;
        return intArray[9] == modulo;
    }
    public static String withDash(String vin){
        String[] vinArray = vin.split("(?<=.)");
        int[] intArray = new int[10];
        StringBuilder newVinBuilder = new StringBuilder();
        for (int i = 0; i < vinArray.length; i++) {
            intArray[i] = Integer.parseInt(vinArray[i]);
            if (i < vinArray.length - 1){
                newVinBuilder.append(intArray[i]);
            }
        }
        newVinBuilder.append("-").append(vinArray[9]);
        return newVinBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println("is 0471958692 valid? "  + checkValidity("0471958692"));
        System.out.println("is 0471958690 valid? "  + checkValidity("0471958690"));
        System.out.println("is 0471606958 valid? "  + checkValidity("0471606958"));
        System.out.println("is 0471606957 valid? "  + checkValidity("0471606957"));
        System.out.println(withDash("0471958692"));
    }
}
