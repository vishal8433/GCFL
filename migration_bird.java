/* problem----------------------------------------------------------------------------------------------------------------------

You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested 
in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your
 array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your 
task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the 
smallest ID number.

Sample Input
6
1 4 4 4 5 3

Sample Output
4

-------------------------------------------------------------------------------------------------------------------------------*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    

    // Complete the migratoryBirds function below.

//---------------------logic start--------------------
    static int migratoryBirds(List<Integer> arr) {
int []f_a=new int[6];
for(int l:arr){
    f_a[l]++;
}
   int max=0;
        int idx=0;
        for(int i=0;i<=5;i++){
            if(max<f_a[i]){
                max=f_a[i];
                idx=i;
            }
        }
    return idx;

    }
//logic end----------------------------------------------
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
