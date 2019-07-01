package com.stackroute.PE3;

public class ConsecutiveChecker {
    public String consecutiveChecker(int input) {
        String string = Integer.toString(input);
        String[] arraystring = string.split("");
        int i;
        if (input>0) {
            for (i = 0; i < arraystring.length - 1; i++) {
                if (Math.abs(arraystring[i].charAt(0) - arraystring[i + 1].charAt(0)) == 1) {
                    continue;

                } else
                    break;
            }
            if (i == arraystring.length - 1)
                return "contains consecutive numbers";
            else

                return "doesn't contains consecutive numbers";
        }
        else
            return "invalid data";


    }
}
