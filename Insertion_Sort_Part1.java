public static void insertionSort1(int n, List<Integer> arr) {
    int key = arr.get(n - 1);
    int i = n - 2;
    
    while (i >= 0 && arr.get(i) > key) {
        arr.set(i + 1, arr.get(i));
        System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        i--;
    }
    
    arr.set(i + 1, key);
    System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
}
