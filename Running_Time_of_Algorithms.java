public static int runningTime(List<Integer> arr) {
    int shifts = 0;

    for (int i = 1; i < arr.size(); i++) {
        int value = arr.get(i);
        int j = i - 1;

        while (j >= 0 && arr.get(j) > value) {
            arr.set(j + 1, arr.get(j));
            shifts++;
            j--;
        }

        arr.set(j + 1, value);
    }

    return shifts;
}
