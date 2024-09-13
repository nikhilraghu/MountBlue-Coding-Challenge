public static String balancedSums(List<Integer> arr) {
        int totalSum = arr.stream().mapToInt(Integer::intValue).sum();
        int leftSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if (leftSum == (totalSum - leftSum - current)) {
                return "YES";
            }
            leftSum += current;
        }
        
        return "NO";
    }
