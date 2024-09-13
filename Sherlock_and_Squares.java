public static int squares(int a, int b) {
    // Write your code here
        int cnt=0;
        a = (int)Math.ceil(Math.sqrt(a));
        b = (int)Math.floor(Math.sqrt(b));
        
        cnt=b-a+1;
        return cnt;

    }



