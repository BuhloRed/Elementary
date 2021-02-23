package ua.hilel.hw4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jewels {

    public void numJewelsInStones() {
        String jewels = "[sSmy]";
        String stones = "SoMe SyMbOlS";
        int matches = 0;

        Pattern pattern = Pattern.compile(jewels);
        Matcher matcher = pattern.matcher(stones);
        while (matcher.find()) {
            matches++;
            System.out.print(matcher.group());
        }
        System.out.println("\ncount=" + matches);
    }
}
