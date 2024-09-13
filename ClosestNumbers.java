public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        
        List<Integer> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(arr.get(i - 1));
                result.add(arr.get(i));
            } else if (diff == minDiff) {
                result.add(arr.get(i - 1));
                result.add(arr.get(i));
            }
        }
        
        return result;
    }
