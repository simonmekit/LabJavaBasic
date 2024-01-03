package perscholas.java_basic;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result2 {

    /*
     * Complete the 'minDiff' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minDiff(List<Integer> arr) {
        // Write your code here
        List<Integer> newArr = new ArrayList<>();
        int n;
        for(int i=0; i<arr.size(); i++){
            n = arr.get(i);
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(j)<n)
                    n = arr.get(j);
            }
            newArr.add(n);
        }
        int sum = 0;
        for(int l = 0; l<newArr.size()-1; l++){
            sum += Math.abs(newArr.get(l) - newArr.get(l+1));
        }
        return sum;
    }

}

public class SumOfDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result2.minDiff(arr);

        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

