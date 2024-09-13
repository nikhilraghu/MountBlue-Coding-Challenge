public static long flippingBits(long n) {
        long allBitsSet = 0xFFFFFFFFL;
        return n ^ allBitsSet;
    }
