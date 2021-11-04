package org.example.rpc.client;

import org.example.rpc.Peer;
import org.example.rpc.transport.TransportClient;

import java.util.List;

public interface TransportSelector {
    /**
     * Init selector
     * @param peers available servers
     * @param count the count of connections
     * @param clazz client impl class
     */
    void init(List<Peer> peers, int count, Class<? extends TransportClient> clazz);

    /*Choose one transport for server*/
    TransportClient select();

    void release(TransportClient client);

    void close();
}
