class CustomStack {
    ArrayList<Integer> arr;
    int maxSize;

    public CustomStack(int maxSize) {
        arr = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (arr.size() == maxSize) {
            return;
        } else {
            arr.add(x);
        }
    }

    public int pop() {
        if (arr.size() == 0) {
            return -1;
        } else {
            return arr.remove(arr.size() - 1);
        }

    }

    public void increment(int k, int val) {
        if (arr.size() < k) {
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) + val);
            }
        } else {
            for (int i = 0; i < k; i++) {
                arr.set(i, arr.get(i) + val);
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */