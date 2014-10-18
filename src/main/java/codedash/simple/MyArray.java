package codedash.simple;

/**
 * Collection backed by an array
 */
public class MyArray {
    private String[] values;
    private int top;
    private int size;

    public MyArray(int size) {
        this.size = size;
        this.values = new String[size];
        this.top = 0;
    }

    public void add(String s) {
        if (this.top >= size) {
            throw new RuntimeException("My Array is full: error adding " + s);
        }

        if (s == null) {
            throw new RuntimeException("cannot add null");
        }

        this.values[ this.top ] = s;
        this.top++;
    }

    public void delete(String s) {
        if (s == null) {
            return;
        }

        for (int i = 0; i < this.top; i++) {
            if (this.values[ i ].equals(s)) {
                moveUpTill(i);
            }
        }

    }

    public String get(int index) {
        if (index >= this.top || index < 0) {
            throw new RuntimeException("Bad index");
        }

        return this.values[ index ];
    }

    private void moveUpTill(int index) {
        for (int i = index+1; i < this.top; i++) {
            this.values[ i - 1] = this.values[ i ];
        }
    }
}
