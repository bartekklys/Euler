package euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value
 * by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
 * is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 */
public class NamesScores {

    public static void main(String[] args) throws IOException {
        String allNames = readFromFile("resources/names.txt");
        List<String> names = new ArrayList<>();
        String[] array = allNames.split(",");
        for (String s :
                array) {
            names.add(s);
        }
        List<String> sortedNames = new ArrayList<>();
        while (!names.isEmpty()) {
            String maxName = Collections.min(names);
            sortedNames.add(maxName);
            names.remove(names.indexOf(maxName));
        }
        BigInteger totalScore = new BigInteger("0");
        for (String s :
                sortedNames) {
            BigInteger wordSum = new BigInteger(String.valueOf(getSumOfWord(s, sortedNames.indexOf(s))));
            totalScore = totalScore.add(wordSum);
        }
        System.out.println(totalScore);
    }

    static int getSumOfWord(String word, int index) {
        int sum = 0;
        char[] charArray = word.toCharArray();
        for (char c :
                charArray) {
            if (c == '"' || c == '\r' || c == '\n') {
                continue;
            } else {
                sum += (Integer.valueOf(c) - 64);
            }
        }
        return sum * (index + 1);
    }

    static String readFromFile(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        String everything = sb.toString();
        return everything;
    }
}
