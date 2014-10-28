package codedash.codedash.patterns.observer;

import org.testng.annotations.Test;

/**
 *
 */
public class NewsProviderTest {
    @Test
    public void testRegisterObserver() throws Exception {
        final NewsProvider np = new NewsProvider();
        np.registerObserver(new Observer() {
            @Override
            public void update(Observable observable) {
                System.out.println("an event was seen");
            }
        });

    }
}
