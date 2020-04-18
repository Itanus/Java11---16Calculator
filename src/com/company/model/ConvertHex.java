package com.company.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * Convert16 class is used for converting numbers in decimal system to hexagonal and vice versa.
 */
public class ConvertHex {
    /**
     * toDec method is used to change numbers in hexagonal system(String) to decimal(double).
     *
     * @param number number in hexagonal system that is changed to decimal system.
     * @return is a number in decimal system.
     */
    public double toDec(@NotNull String number) {
        int temp = 0;
        for (int i = 0; i < number.length(); i++) {
            final double pow = Math.pow(16.0, number.length() - i - 1);
            switch (number.toCharArray()[i]) {
                case '0':
                    temp += pow * 0;
                    break;
                case '1':
                    temp += pow * 1;
                    break;
                case '2':
                    temp += pow * 2;
                    break;
                case '3':
                    temp += pow * 3;
                    break;
                case '4':
                    temp += pow * 4;
                    break;
                case '5':
                    temp += pow * 5;
                    break;
                case '6':
                    temp += pow * 6;
                    break;
                case '7':
                    temp += pow * 7;
                    break;
                case '8':
                    temp += pow * 8;
                    break;
                case '9':
                    temp += pow * 9;
                    break;
                case 'A':
                    temp += pow * 10;
                    break;
                case 'B':
                    temp += pow * 11;
                    break;
                case 'C':
                    temp += pow * 12;
                    break;
                case 'D':
                    temp += pow * 13;
                    break;
                case 'E':
                    temp += pow * 14;
                    break;
                case 'F':
                    temp += pow * 15;
                    break;
                default:
                    return temp;
            }
        }
        return temp;
    }

    /**
     * to16 method is used to change numbers in decimal system(double) to hexagonal(String).
     *
     * @param number number in decimal system that is changed to hexagonal system.
     * @return is a number in hexagonal system.
     */
    public String toHex(double number) {
        StringBuilder num = new StringBuilder();
        ArrayList<String> tempArray = new ArrayList<>();
        int temp;
        while (number >= 0) {
            temp = (int) number % 16;
            tempArray.add(numToString(temp));
            if (number < 16) break;
            number /= 16;
        }
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            num.append(tempArray.get(i));
        }
        return num.toString();
    }

    /**
     * numToString method is used to convert a specific number less than 16 to a hexagonal system(one char).
     *
     * @param number in a decimal system that is changed to hexagonal system.
     * @return is a number parameter in hexagonal system.
     */
    @Nullable
    @Contract(pure = true)
    private String numToString(int number) {
        switch (number) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return null;
        }
    }
}
