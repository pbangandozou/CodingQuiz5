import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {

    // make a new list for both the words
    for (i : s1){
        String newlist = [];
        sublist = s1[0]
        sublist2 = s1[1]
        sublist+sublist2.append(newlist)
    for (e : s2){
        String newlist2 = [];
        newlist2.append(e)
    }
    //check each list and comapare if they have the same letters
    elem = [0];
    for (i: newlist && newlist2)
    if(elem: newlist == elem: newlist2)
        return "YES"
    else
        return "NO"
    //if they do print Yes if not print no
    }
    
    
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
