public static List<Integer> countingSort(List<Integer> arr) {
    int max = Collections.max(arr);
    int[] counts = new int[max + 1];
    
    for (int num : arr) {
        counts[num]++;
    }
    
    List<Integer> sorted = new ArrayList<>();
    for (int i = 0; i < counts.length; i++) {
        while (counts[i] > 0) {
            sorted.add(i);
            counts[i]--;
        }
    }
    
    return sorted;
}
