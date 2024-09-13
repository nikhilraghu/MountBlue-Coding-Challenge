   public static void insertionSort2(int n, List<Integer> arr) {
   for (int i = 1; i < n; i++) {
        int value = arr.get(i); 
        int j = i - 1;
        
       
        while (j >= 0 && arr.get(j) > value) {
            arr.set(j + 1, arr.get(j));
            j--;
        }
        
        arr.set(j + 1, value);
        System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
