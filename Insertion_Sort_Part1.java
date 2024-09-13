    public static void insertionSort1(int n, List<Integer> arr) {
        int valueToInsert = arr.get(n - 1);
        int i = n - 2;
        
        while (i >= 0 && arr.get(i) > valueToInsert) {
            arr.set(i + 1, arr.get(i)); /
            printArray(arr); 
            i--;
        }
        
        arr.set(i + 1, valueToInsert);
        printArray(arr); 
    }
    
    private static void printArray(List<Integer> arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
