package org.example.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/* Represents network port
* */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
