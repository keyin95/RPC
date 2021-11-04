package org.example.rpc;

import java.io.IOException;

public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
