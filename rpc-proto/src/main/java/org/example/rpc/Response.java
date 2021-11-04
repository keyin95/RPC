package org.example.rpc;

import lombok.Data;

/* Represents RPC response
* */
@Data
public class Response {
    // Response return code 0-success, !0 - failure
    private int code = 0;
    // detailed error message
    private String message = "ok";
    private Object data;
}
