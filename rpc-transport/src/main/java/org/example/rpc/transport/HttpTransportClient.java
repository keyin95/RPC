package org.example.rpc.transport;

import org.apache.commons.io.IOUtils;
import org.example.rpc.Peer;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpTransportClient implements TransportClient {
    private String url;

    @Override
    public void connect(Peer peer) {
        this.url = "http://" + peer.getHost() + ":" + peer.getPort();
    }

    @Override
    public InputStream write(InputStream data) {
        try {
            HttpURLConnection httpConn = (HttpURLConnection) new URL(url).openConnection();
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            httpConn.setUseCaches(false);
            httpConn.setRequestMethod("POST");

            httpConn.connect();
            IOUtils.copy(data, httpConn.getOutputStream());

            int resultCode = httpConn.getResponseCode();
            if(resultCode == HttpURLConnection.HTTP_OK){
                return httpConn.getInputStream();
            }else{
                return httpConn.getErrorStream();
            }

        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() {

    }
}