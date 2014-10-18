package codedash.simple;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class SentenceTest {

    @Test
    public void testReverseWords() throws Exception {
        List<Pair<String, String>> testCases = new ArrayList<Pair<String, String>>();
        testCases.add(new ImmutablePair<String, String>("my name sriram",
                "sriram name my"));
        testCases.add(new ImmutablePair<String, String>("aa bbbb",
                "bbbb aa"));
        testCases.add(new ImmutablePair<String, String>("a bc def ghij",
                "ghij def bc a"));

        for (Pair<String, String> tc : testCases) {
            Sentence s = new Sentence(tc.getKey());
            s.reverseWords();
            Assert.assertEquals(s.toString(), tc.getValue());
        }
    }

    @Test
    public void testReverseSentence() throws Exception {
        List<Pair<String, String>> testCases = new ArrayList<Pair<String, String>>();
        testCases.add(new ImmutablePair<String, String>("my name sriram",
                "marirs eman ym"));
        testCases.add(new ImmutablePair<String, String>("aa bbbb",
                "bbbb aa"));
        testCases.add(new ImmutablePair<String, String>("1 2 3",
                "3 2 1"));
        testCases.add(new ImmutablePair<String, String>("1 2 3 4",
                "4 3 2 1"));
        testCases.add(new ImmutablePair<String, String>("123",
                "321"));
        testCases.add(new ImmutablePair<String, String>("1234",
                "4321"));

        for (Pair<String, String> tc : testCases) {
            Sentence s = new Sentence(tc.getKey());
            s.reverseSentence();
            Assert.assertEquals(s.toString(), tc.getValue());
        }
    }
}
