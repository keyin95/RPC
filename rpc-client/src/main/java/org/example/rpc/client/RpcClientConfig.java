package org.example.rpc.client;

import lombok.Data;
import org.example.rpc.*;
import org.example.rpc.transport.HttpTransportClient;
import org.example.rpc.transport.TransportClient;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HttpTransportClient.class;
    private Class<? extends Encoder> encoderClass = EncoderImpl.class;
    private Class<? extends Decoder> decoderClass = DecoderImpl.class;
    private Class<? extends  TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1",3000)
    );
}
