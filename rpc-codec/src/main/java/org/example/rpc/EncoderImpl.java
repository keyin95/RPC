package org.example.rpc;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EncoderImpl implements Encoder{

    @Override
    public byte[] encode(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] bytes = new byte[0];
        try{
            bytes = objectMapper.writeValueAsBytes(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
        return bytes;
    }

}
