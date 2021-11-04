package org.example.rpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/*
* getting requests
* */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
