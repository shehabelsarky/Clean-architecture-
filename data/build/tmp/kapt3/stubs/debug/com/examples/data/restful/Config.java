package com.examples.data.restful;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/examples/data/restful/Config;", "", "()V", "API_KEY", "", "BASE_IMAGE_URL", "BASE_URL", "POPULAR_ACTORS", "POPULAR_ACTOR_DETAILS", "POPULAR_ACTOR_IMAGES", "POPULAR_PERSON", "SEARCH_ACTORS", "WEATHER", "data_debug"})
public final class Config {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "7a2a3b395dcd864324bcf7236a551ece";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEATHER = "weather";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_IMAGE_URL = "http://image.tmdb.org/t/p/w342";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR_ACTORS = "person/popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_ACTORS = "search/person";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR_PERSON = "person_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR_ACTOR_IMAGES = "person/{person_id}/images";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR_ACTOR_DETAILS = "person/{person_id}";
    public static final com.examples.data.restful.Config INSTANCE = null;
    
    private Config() {
        super();
    }
}