  public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);  // The pivot element
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        for (int num : arr) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                equal.add(num);
            }
        }
        
        // Combine left, equal, and right lists
        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);
        
        return result;
    }
