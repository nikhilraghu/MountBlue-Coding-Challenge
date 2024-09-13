 public static long strangeCounter(long t) {
    // Write your code here

    long cycleStart = 3; 
        long cycleTime = 3;  
        
        while (t > cycleTime) {
            t -= cycleTime; 
            cycleStart *= 2;
            cycleTime = cycleStart; 
        }
        
        return cycleStart - t + 1;
    }
