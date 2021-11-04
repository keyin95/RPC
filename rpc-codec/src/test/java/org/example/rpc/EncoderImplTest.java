package org.example.rpc;
import org.junit.Assert;
import org.junit.Test;

public class EncoderImplTest {
    @Test
    public void testEncode() {
        Encoder encoder = new EncoderImpl();
        TestBean bean = new TestBean();
        bean.setName("Stacy");
        bean.setAge(20);

        byte[] bytes = encoder.encode(bean);
        Assert.assertNotNull(bytes);

    }
}