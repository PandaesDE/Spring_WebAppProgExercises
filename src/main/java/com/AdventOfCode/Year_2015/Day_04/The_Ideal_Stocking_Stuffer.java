package com.AdventOfCode.Year_2015.Day_04;

import com.AdventOfCode.AOCExercise;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class The_Ideal_Stocking_Stuffer extends AOCExercise {

    public String answer1() {
        return "" + getLowestNumberToGetXZeroMD5Hash(input, 5);
    }

    public String answer2() {
        return "" + getLowestNumberToGetXZeroMD5Hash(input, 6);
    }

    private static int getLowestNumberToGetXZeroMD5Hash(String input, int zeros) {
        int counter = 1;
        String compareZeros = "";
        for (int i = 0; i < zeros; i++)
            compareZeros += 0;
        String MD5 = "";
        while (true) {
            MD5 = getMD5Hash(input + counter);
            if (MD5.substring(0, zeros).equals(compareZeros))
                break;
            else
                counter++;

        }
        return counter;
    }

    private static String getMD5Hash(String input) {
        String MD5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();
            MD5 += DatatypeConverter.printHexBinary(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return MD5;
    }

}
