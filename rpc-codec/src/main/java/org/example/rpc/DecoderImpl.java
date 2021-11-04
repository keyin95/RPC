package org.example.rpc;


import com.fasterxml.jackson.databind.ObjectMapper;

public class DecoderImpl implements Decoder{

    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper();
        T obj = null;
        try{
            obj = objectMapper.readValue(bytes, clazz);
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
