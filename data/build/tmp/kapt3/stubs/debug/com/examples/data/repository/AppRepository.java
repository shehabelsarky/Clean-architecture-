package com.examples.data.repository;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/examples/data/repository/AppRepository;", "", "deletePopularPersonTable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCities", "", "Lcom/examples/entities/city/remote/RemoteCity;", "getPopularPersons", "Lcom/examples/entities/popular_person/remote/PopularPersonsResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByCityName", "Lcom/examples/entities/weather/remote/RemoteWeather;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPopularPerson", "popularPerson", "Lcom/examples/entities/popular_person/local/PopularPersons;", "(Lcom/examples/entities/popular_person/local/PopularPersons;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "popularPersonDetails", "Lcom/examples/entities/PopularActorDetails;", "personId", "searchPersons", "actorName", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectPopularPerson", "", "data_debug"})
public abstract interface AppRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPopularPersons(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.popular_person.remote.PopularPersonsResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object popularPersonDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String personId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.PopularActorDetails> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchPersons(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String actorName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.popular_person.remote.PopularPersonsResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertPopularPerson(@org.jetbrains.annotations.NotNull()
    com.examples.entities.popular_person.local.PopularPersons popularPerson, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object selectPopularPerson(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.examples.entities.popular_person.local.PopularPersons>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePopularPersonTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.weather.remote.RemoteWeather> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.examples.entities.city.remote.RemoteCity>> p0);
}