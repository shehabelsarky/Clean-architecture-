package com.examples.entities.popular_person.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001a\u00a8\u0006%"}, d2 = {"Lcom/examples/entities/popular_person/remote/Result;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()I", "setId", "(I)V", "isAdult", "", "()Z", "setAdult", "(Z)V", "knownFor", "", "Lcom/examples/entities/popular_person/remote/KnownFor;", "getKnownFor", "()Ljava/util/List;", "setKnownFor", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "popularity", "", "getPopularity", "()F", "setPopularity", "(F)V", "profilePath", "getProfilePath", "setProfilePath", "Companion", "entities_debug"})
public final class Result implements java.io.Serializable {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private float popularity;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "profile_path")
    private java.lang.String profilePath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "known_for")
    private java.util.List<com.examples.entities.popular_person.remote.KnownFor> knownFor;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "adult")
    private boolean isAdult;
    private static final long serialVersionUID = -3162855886569890092L;
    public static final com.examples.entities.popular_person.remote.Result.Companion Companion = null;
    
    public final float getPopularity() {
        return 0.0F;
    }
    
    public final void setPopularity(float p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfilePath() {
        return null;
    }
    
    public final void setProfilePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.examples.entities.popular_person.remote.KnownFor> getKnownFor() {
        return null;
    }
    
    public final void setKnownFor(@org.jetbrains.annotations.Nullable()
    java.util.List<com.examples.entities.popular_person.remote.KnownFor> p0) {
    }
    
    public final boolean isAdult() {
        return false;
    }
    
    public final void setAdult(boolean p0) {
    }
    
    public Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/examples/entities/popular_person/remote/Result$Companion;", "", "()V", "serialVersionUID", "", "entities_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}