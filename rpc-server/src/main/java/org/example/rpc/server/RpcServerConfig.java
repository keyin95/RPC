package org.example.rpc.server;

import lombok.Data;
import org.example.rpc.Decoder;
import org.example.rpc.DecoderImpl;
import org.example.rpc.Encoder;
import org.example.rpc.EncoderImpl;
import org.example.rpc.transport.HttpTransportServer;
import org.example.rpc.transport.TransportServer;

@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass = EncoderImpl.class;
    private Class<? extends Decoder> decoderClass = DecoderImpl.class;
    private int port = 3000;
}
