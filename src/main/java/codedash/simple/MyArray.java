package codedash.simple;

/**
 * Collection backed by an array
 */
public class MyArray {
    private String[] values;
    private int top;
    private int capacity;

    public MyArray(int capacity) {
        this.capacity = capacity;
        this.values = new String[capacity];
        this.top = 0;
    }

    public int getLength() {
        return this.top;
    }

    public void add(String s) {
        if (this.top >= this.capacity) {
            throw new RuntimeException("My Array is full: error adding " + s);
        }

        if (s == null) {
            throw new RuntimeException("cannot add null");
        }

        this.values[ this.top ] = s;
        this.top++;
    }

    public int deleteFirst(String s) {
        if (s == null) {
            return -1;
        }

        for (int i = 0; i < this.top; i++) {
            if (this.values[ i ].equals(s)) {
                moveUpTill(i);
                return i;
            }
        }

        return -1;
    }

    public int deleteAll(String s) {
        if (s == null) {
            return -1;
        }

        int i = 0;
        int count = 0;
        while (i < this.top) {
            if (this.values[ i ].equals(s)) {
                count++;
                int j = i + 1;
                for (; j < this.top && !this.values[ j ].equals(s); j++) {
                    this.values[ j - 1 ] = this.values[ j ];
                }
                i = j;
            } else {
                i++;
            }
        }

        return count;
    }

    public String get(int index) {
        if (index >= this.top || index < 0) {
            throw new RuntimeException("Bad index");
        }

        return this.values[ index ];
    }

    private void moveUpTill(int index) {
        for (int i = index+1; i < this.top; i++) {
            this.values[ i - 1 ] = this.values[ i ];
        }
    }
}
