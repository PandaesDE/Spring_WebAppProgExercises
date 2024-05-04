package com.AdventOfCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Conveniencer {

    public static List<String> convertTextToLines(String text)
    {
        return Arrays.stream(text.split("\n")).toList();
    }

    public static List<String> tokenizeString(String line)
    {
        return Arrays.stream(line.split(" ")).toList();
    }

    public static int stringToInt(String s) {
        try {
            int i = Integer.parseInt(s);
            return i;
        } catch (NumberFormatException e) {
            System.out.println("\"" + s + "\" can not be parsed to an int value, returned int = 0");
            return 0;
        }
    }

    // https://stackoverflow.com/questions/767759/find-the-number-of-occurrences-of-a-substring-in-a-string
    public static int getOccurrenceAmount(String s, String subS) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = s.indexOf(subS, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subS.length();
            }
        }

        return count;
    }

    /*https://gist.github.com/jaycobbcruz/cbabc1eb49f51bfe2ed1db10a06a2b26*/
    public static class Permutations {

        public static <T> Stream<Stream<T>> of(final List<T> items) {
            return IntStream.range(0, factorial(items.size())).mapToObj(i -> permutation(i, items).stream());
        }

        private static int factorial(final int num) {
            return IntStream.rangeClosed(2, num).reduce(1, (x, y) -> x * y);
        }

        private static <T> List<T> permutation(final int count, final LinkedList<T> input, final List<T> output) {
            if (input.isEmpty()) { return output; }

            final int factorial = factorial(input.size() - 1);
            output.add(input.remove(count / factorial));
            return permutation(count % factorial, input, output);
        }

        private static <T> List<T> permutation(final int count, final List<T> items) {
            return permutation(count, new LinkedList<>(items), new ArrayList<>());
        }

    }
}
