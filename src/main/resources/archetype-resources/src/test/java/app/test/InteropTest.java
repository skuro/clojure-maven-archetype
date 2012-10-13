package app.test;

import interop.Sample;

import org.junit.Test;

public class InteropTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testInteropCall() {
        Sample sample = new Sample();
        sample.main(new String[] {"Clojure"});
    }
}