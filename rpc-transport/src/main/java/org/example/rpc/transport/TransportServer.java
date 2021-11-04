package org.example.rpc.transport;

/*
 * 1. start and monitor
 * 2. receive the request
 * 3. stop
 * */
public interface TransportServer {
    void init(int port, RequestHandler handler);
    void start();
    void stop();
}
