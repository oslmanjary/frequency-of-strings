/* Program for the calculation of frequency of strings */
import java.util.*;
public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(String s:strings){
            if(hm.containsKey(s)){
                int freq = hm.get(s);
                freq = freq+1;
                hm.put(s,freq);
            }
            else{
                hm.put(s,1);
            }
        }
        int frequencies[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if(hm.containsKey(queries[i])){
                frequencies[i]=hm.get(queries[i]);
            }
            else frequencies[i]=0;
        }
        return frequencies;


    }

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalStrings = sc.nextInt();
		String strings[] = new String[totalStrings];
		for(int i=0;i<totalStrings;i++){
			strings[i] = sc.next();
		}
		int queriesLength = sc.nextInt();
		String queries[] = new String[queriesLength];
		for(int i=0;i<queriesLength;i++){
			queries[i] = sc.next();
		}
		int result[]  =  matchingStrings(strings,queries);
		/*
		for(int i:result){
			System.out.println(i);
		}
		*/
    }
}
