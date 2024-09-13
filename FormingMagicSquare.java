public static int formingMagicSquare(List<List<Integer>> s) {
        int[][] magicSquares = {
            {8, 1, 6, 3, 5, 7, 4, 9, 2},
            {6, 1, 8, 7, 5, 3, 2, 9, 4},
            {4, 9, 2, 3, 5, 7, 8, 1, 6},
            {2, 9, 4, 7, 5, 3, 6, 1, 8},
            {8, 3, 4, 1, 5, 9, 6, 7, 2},
            {4, 3, 8, 9, 5, 1, 2, 7, 6},
            {6, 7, 2, 1, 5, 9, 8, 3, 4},
            {2, 7, 6, 9, 5, 1, 4, 3, 8}
        };

        int[] sArray = new int[9];
        int idx = 0;
        for (List<Integer> row : s) {
            for (int num : row) {
                sArray[idx++] = num;
            }
        }

        int minCost = Integer.MAX_VALUE;

        for (int[] magicSquare : magicSquares) {
            int cost = 0;
            for (int i = 0; i < 9; i++) {
                cost += Math.abs(sArray[i] - magicSquare[i]);
            }
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
