package perscholas.java_basic;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.*;

class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinDeletions(String s) {
        // Write your code here
        StringBuffer sb = new StringBuffer();
        char[] st = s.toCharArray();

        char[] l = new char[26];
        try {
            Arrays.fill(l, '0');
//            for(int k=0; k<26; k++)
//                l[k] = '0';
        } catch (java.lang.Exception e) {
            System.out.println("Exception");
        }
        int flag;
        int n=0;


        for(int i=0; i<st.length; i++){

            flag = 1;
            for(int j=0; j<=n; j++) {
                if (st[i] == l[j]) {
                    flag = 0;
                    break;
                }
            }
                try{
                    if(flag == 1){
                        l[n] = st[i];
                        n++;
                    }
                }
                catch(Exception e){
                    System.out.println("Notes" + e.getMessage());
                }

        }
        int minDel = st.length - n;
        return minDel;
    }
}

public class StringReduction {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        System.out.println("Enter String: ");
        String s = bufferedReader.readLine();

        int result = Result.getMinDeletions(s);
        System.out.println(result);

       // bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}

