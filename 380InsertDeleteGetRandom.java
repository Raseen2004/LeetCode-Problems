class RandomizedSet {
    HashSet<Integer> set;

    public RandomizedSet() {
        set = new HashSet();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        boolean flag = false;
        if (set.contains(val)) {
            flag = set.remove(val);
        }
        return flag;
    }

    public int getRandom() {
        ArrayList<Integer> list = new ArrayList<>(set);
        Random rand = new Random();
        int randomValue = list.get(rand.nextInt(list.size()));
        return randomValue;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */