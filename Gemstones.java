

class Result {

    /*
     * Complete the 'gameOfStones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER n as parameter.
     */
    
    public static String gameOfStones(int n) {
        boolean[] dp = new boolean[n + 1];
        
        if (n >= 1) dp[1] = false; 
        if (n >= 2) dp[2] = true;  
        if (n >= 3) dp[3] = true; 
        if (n >= 4) dp[4] = true;  
        if (n >= 5) dp[5] = true;  
        
        for (int i = 6; i <= n; i++) {
            dp[i] = !dp[i - 2] || !dp[i - 3] || !dp[i - 5];
        }
        
       
        return dp[n] ? "First" : "Second";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String result = Result.gameOfStones(n);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}
