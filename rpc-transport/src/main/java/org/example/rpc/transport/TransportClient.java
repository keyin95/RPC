package org.example.rpc.transport;

import org.example.rpc.Peer;
import java.io.InputStream;


/*
 * 1. build the connection
 * 2. send data and wait for response
 * 3. close the connection
 * */
public interface TransportClient {
    void connect(Peer peer);
    InputStream write(InputStream data);
    void close();
}