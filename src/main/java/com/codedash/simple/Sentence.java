package com.codedash.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * View a string as a sequence of words and support forward and reverse views
 */
public class Sentence {

    private char[] value;

    public Sentence(String value) {
        this.value = value.toCharArray();
    }

    /**
     * Reverse words
     * my name sriram =>
     * marirs eman ym
     * sriram name my
     *
     */
    public void reverseWords() {
        this.reverseSentence();
        int s = 0;
        int e;
        while ((e=indexOf(' ', s)) != -1) {
            if (s == e) {
                s++;
                continue;
            }

            this.reverse(s, e - 1);
            s = e + 1;
        }

        if (s < value.length - 1) {
            this.reverse(s, value.length -1);
        }
    }

    public int indexOf(char ch, int startIndex) {
        for (int i = startIndex; i < value.length; i++) {
            if (value[i] == ch)
                return i;
        }
        return -1;
    }

    public void reverseSentence() {
        reverse(0, this.value.length - 1);
    }

    public void reverse(int startIndex, int endIndex) {
        // check index out of bounds

        int j = endIndex;
        for (int i = startIndex; i < j; i++, j--) {
            swap(i, j);
        }
    }

    public void swap(int i, int j) {
        char t = value[i];
        value[i] = value[j];
        value[j] = t;
    }

    @Override
    public String toString() {
        return new String(value);
    }
}
