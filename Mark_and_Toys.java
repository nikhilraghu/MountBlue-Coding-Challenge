 public static int maximumToys(List<Integer> prices, int k) {
        // Sort the prices in ascending order
        Collections.sort(prices);

        int numToys = 0;
        int totalCost = 0;

       
        for (int price : prices) {
            if (totalCost + price <= k) {
                totalCost += price;  
                numToys++;          
            } else {
                break;
            }
        }

        return numToys;
    }
