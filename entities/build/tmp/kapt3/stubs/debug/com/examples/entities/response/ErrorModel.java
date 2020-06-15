package com.examples.entities.response;

import java.lang.System;

/**
 * Default error model that comes from server if something goes wrong with a repository call
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J0\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/examples/entities/response/ErrorModel;", "", "errorStatus", "Lcom/examples/entities/response/ErrorStatus;", "(Lcom/examples/entities/response/ErrorStatus;)V", "message", "", "code", "", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/examples/entities/response/ErrorStatus;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorStatus", "()Lcom/examples/entities/response/ErrorStatus;", "setErrorStatus", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/examples/entities/response/ErrorStatus;)Lcom/examples/entities/response/ErrorModel;", "equals", "", "other", "hashCode", "toString", "entities_debug"})
public final class ErrorModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.NotNull()
    private transient com.examples.entities.response.ErrorStatus errorStatus;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.entities.response.ErrorStatus getErrorStatus() {
        return null;
    }
    
    public final void setErrorStatus(@org.jetbrains.annotations.NotNull()
    com.examples.entities.response.ErrorStatus p0) {
    }
    
    public ErrorModel(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer code, @org.jetbrains.annotations.NotNull()
    com.examples.entities.response.ErrorStatus errorStatus) {
        super();
    }
    
    public ErrorModel(@org.jetbrains.annotations.NotNull()
    com.examples.entities.response.ErrorStatus errorStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.entities.response.ErrorStatus component3() {
        return null;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @org.jetbrains.annotations.NotNull()
    public final com.examples.entities.response.ErrorModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer code, @org.jetbrains.annotations.NotNull()
    com.examples.entities.response.ErrorStatus errorStatus) {
        return null;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}