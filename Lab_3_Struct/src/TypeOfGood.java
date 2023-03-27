public enum TypeOfGood {
    TYPE_GADJET,
    TYPE_APPLIANCES,
    TYPE_FOTO;
    private static TypeOfGood[] types = {
            TYPE_GADJET,
            TYPE_APPLIANCES,
            TYPE_FOTO
    };

    public static TypeOfGood getTypeOfGood(int num) {
        return types[num - 1];
    }

    public int getIndex(Goods good) {
        int buffer = 0;
        for (int i = 0; i < 6; i++) {
            if (good.getTypeofGood().equals(types[i])) buffer = i + 1;
        }
        return buffer;
    }

}
