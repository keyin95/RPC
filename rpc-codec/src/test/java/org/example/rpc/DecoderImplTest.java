package org.example.rpc;

import junit.framework.TestCase;
import org.junit.Assert;

public class DecoderImplTest extends TestCase {

    public void testDecode() {
        Encoder encoder = new EncoderImpl();
        Decoder decoder = new DecoderImpl();
        TestBean bean = new TestBean();
        bean.setName("Stacy");
        bean.setAge(20);
        byte[] bytes = encoder.encode(bean);
        TestBean bean2 = decoder.decode(bytes, TestBean.class);
        Assert.assertEquals(bean.getAge(), bean2.getAge());
        Assert.assertEquals(bean.getName(), bean2.getName());
    }
}