package com.examples.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/examples/data/mapper/CloudErrorMapper;", "", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "getHttpError", "Lcom/examples/entities/response/ErrorModel;", "body", "Lokhttp3/ResponseBody;", "mapToDomainErrorException", "throwable", "", "data_debug"})
public final class CloudErrorMapper {
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.entities.response.ErrorModel mapToDomainErrorException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        return null;
    }
    
    /**
     * attempts to parse http response body and get error data from it
     *
     * @param body retrofit response body
     * @return returns an instance of [ErrorModel] with parsed data or NOT_DEFINED status
     */
    private final com.examples.entities.response.ErrorModel getHttpError(okhttp3.ResponseBody body) {
        return null;
    }
    
    @javax.inject.Inject()
    public CloudErrorMapper(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
}