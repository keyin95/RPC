package org.example.rpc;

import lombok.Data;
/* Represents RPC requests
* */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;

}
