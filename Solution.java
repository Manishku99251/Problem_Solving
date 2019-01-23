/*
 John works at a clothing store. 
 He has a large pile of socks that he must pair by color for sale.
  Given an array of integers representing the color of each sock,
   determine how many pairs of socks with matching colors there are.

For example, there are n=7 socks with colors ar =[1,2,1,2,1,3,2] . 
There is one pair of color 1 and one of color 2.
 There are three odd socks left, one of each color. The number of pairs is 2
 */







import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        Arrays.sort(ar);
        int pairs=0;
        for(int i =0;i<ar.length-1;i++){
            
            if(ar[i]-ar[i+1]==0){
                pairs++;
                i=i+1;

            }
            
        }
    return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
