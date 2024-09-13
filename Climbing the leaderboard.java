public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> uniqueRanks = new LinkedHashSet<>(ranked);
        List<Integer> distinctRanks = new ArrayList<>(uniqueRanks);
        List<Integer> result = new ArrayList<>();
        
        int index = distinctRanks.size();
        
        for (int score : player) {
            while (index > 0 && score >= distinctRanks.get(index - 1)) {
                index--;
            }
            result.add(index + 1);
        }
        
        return result;
    }
