package org.example.rpc;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Encoder {
    byte[] encode(Object obj);
}
