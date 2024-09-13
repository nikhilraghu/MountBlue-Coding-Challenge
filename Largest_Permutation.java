public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        int n = arr.size();
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr.get(i), i);
        }

      
        for (int i = 0; i < n && k > 0; i++) {
           
            int targetValue = n - i;
            if (arr.get(i) == targetValue) {
                continue; 
            }

         
            int targetIndex = indexMap.get(targetValue);

           
            Collections.swap(arr, i, targetIndex);

          
            indexMap.put(arr.get(targetIndex), targetIndex);
            indexMap.put(arr.get(i), i);

            k--;
        }

        return arr;
    }
