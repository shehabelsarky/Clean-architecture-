package com.examples.entities.response;

import java.lang.System;

/**
 * various error status to know what happened if something goes wrong with a repository call
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/examples/entities/response/ErrorStatus;", "", "(Ljava/lang/String;I)V", "NO_CONNECTION", "BAD_RESPONSE", "TIMEOUT", "EMPTY_RESPONSE", "NOT_DEFINED", "UNAUTHORIZED", "entities_debug"})
public enum ErrorStatus {
    /*public static final*/ NO_CONNECTION /* = new NO_CONNECTION() */,
    /*public static final*/ BAD_RESPONSE /* = new BAD_RESPONSE() */,
    /*public static final*/ TIMEOUT /* = new TIMEOUT() */,
    /*public static final*/ EMPTY_RESPONSE /* = new EMPTY_RESPONSE() */,
    /*public static final*/ NOT_DEFINED /* = new NOT_DEFINED() */,
    /*public static final*/ UNAUTHORIZED /* = new UNAUTHORIZED() */;
    
    ErrorStatus() {
    }
}