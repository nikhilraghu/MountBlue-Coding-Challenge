 public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        
        int middleIndex = arr.size() / 2;
        
        return arr.get(middleIndex);
    }
