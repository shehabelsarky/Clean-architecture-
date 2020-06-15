package com.examples.entities.popular_person.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010!\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/examples/entities/popular_person/remote/Profile;", "Ljava/io/Serializable;", "()V", "aspectRatio", "", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "iso6391", "", "getIso6391", "()Ljava/lang/Object;", "setIso6391", "(Ljava/lang/Object;)V", "voteAverage", "getVoteAverage", "setVoteAverage", "voteCount", "getVoteCount", "setVoteCount", "width", "getWidth", "setWidth", "Companion", "entities_debug"})
public final class Profile implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "iso_639_1")
    private java.lang.Object iso6391;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "width")
    private int width;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "height")
    private int height;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private int voteCount;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private float voteAverage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "file_path")
    private java.lang.String filePath;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "aspect_ratio")
    private float aspectRatio;
    private static final long serialVersionUID = -1264620972366786161L;
    public static final com.examples.entities.popular_person.remote.Profile.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIso6391() {
        return null;
    }
    
    public final void setIso6391(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public final void setWidth(int p0) {
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setHeight(int p0) {
    }
    
    public final int getVoteCount() {
        return 0;
    }
    
    public final void setVoteCount(int p0) {
    }
    
    public final float getVoteAverage() {
        return 0.0F;
    }
    
    public final void setVoteAverage(float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilePath() {
        return null;
    }
    
    public final void setFilePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final float getAspectRatio() {
        return 0.0F;
    }
    
    public final void setAspectRatio(float p0) {
    }
    
    public Profile() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/examples/entities/popular_person/remote/Profile$Companion;", "", "()V", "serialVersionUID", "", "entities_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}