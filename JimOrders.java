public static List<Integer> jimOrders(List<List<Integer>> orders) {
        List<int[]> orderTimes = new ArrayList<>();
        
        for (int i = 0; i < orders.size(); i++) {
            List<Integer> order = orders.get(i);
            int orderTime = order.get(0) + order.get(1);
            orderTimes.add(new int[]{orderTime, i + 1}); // Store time and index
        }
        
        orderTimes.sort(Comparator.comparingInt(a -> a[0])); // Sort by time
        // If times are the same, sorting by index is natural due to original order in list
        
        List<Integer> result = new ArrayList<>();
        for (int[] entry : orderTimes) {
            result.add(entry[1]);
        }
        
        return result;
    }
