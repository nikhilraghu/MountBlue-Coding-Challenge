public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer, Integer> arrCount = new HashMap<>();
        Map<Integer, Integer> brrCount = new HashMap<>();
        
        for (int num : arr) {
            arrCount.put(num, arrCount.getOrDefault(num, 0) + 1);
        }
        
        for (int num : brr) {
            brrCount.put(num, brrCount.getOrDefault(num, 0) + 1);
        }
        
        Set<Integer> missingNumbers = new TreeSet<>();
        
        for (Map.Entry<Integer, Integer> entry : brrCount.entrySet()) {
            int num = entry.getKey();
            int countInBrr = entry.getValue();
            int countInArr = arrCount.getOrDefault(num, 0);
            
            if (countInArr < countInBrr) {
                missingNumbers.add(num);
            }
        }
        
        return new ArrayList<>(missingNumbers);
    }
