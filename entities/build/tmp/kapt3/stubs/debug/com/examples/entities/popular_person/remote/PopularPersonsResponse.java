package com.examples.entities.popular_person.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/examples/entities/popular_person/remote/PopularPersonsResponse;", "Ljava/io/Serializable;", "()V", "page", "", "getPage", "()I", "setPage", "(I)V", "profiles", "", "Lcom/examples/entities/popular_person/remote/Profile;", "getProfiles", "()Ljava/util/List;", "setProfiles", "(Ljava/util/List;)V", "results", "Lcom/examples/entities/popular_person/remote/Result;", "getResults", "setResults", "totalPages", "getTotalPages", "setTotalPages", "totalResults", "getTotalResults", "setTotalResults", "Companion", "entities_debug"})
public final class PopularPersonsResponse implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "profiles")
    private java.util.List<com.examples.entities.popular_person.remote.Profile> profiles;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "page")
    private int page;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private int totalResults;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private int totalPages;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.examples.entities.popular_person.remote.Result> results;
    private static final long serialVersionUID = 4522600775503096196L;
    public static final com.examples.entities.popular_person.remote.PopularPersonsResponse.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.examples.entities.popular_person.remote.Profile> getProfiles() {
        return null;
    }
    
    public final void setProfiles(@org.jetbrains.annotations.Nullable()
    java.util.List<com.examples.entities.popular_person.remote.Profile> p0) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final void setTotalResults(int p0) {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final void setTotalPages(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.examples.entities.popular_person.remote.Result> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable()
    java.util.List<com.examples.entities.popular_person.remote.Result> p0) {
    }
    
    public PopularPersonsResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/examples/entities/popular_person/remote/PopularPersonsResponse$Companion;", "", "()V", "serialVersionUID", "", "entities_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}