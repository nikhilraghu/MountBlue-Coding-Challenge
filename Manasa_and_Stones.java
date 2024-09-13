public static List<Integer> stones(int n, int a, int b) {
        Set<Integer> distinctStones = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            int value = (i * a) + ((n - 1 - i) * b);
            distinctStones.add(value);
        }
        
        return new ArrayList<>(distinctStones);
    }
