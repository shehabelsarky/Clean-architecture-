package com.examples.data.repository;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ!\u0010&\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020!0*H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/examples/data/repository/AppRepoImp;", "Lcom/examples/data/repository/AppRepository;", "cloudRepository", "Lcom/examples/data/source/cloud/BaseCloudRepository;", "database", "Lcom/examples/data/source/db/AppDatabase;", "citiesDatabase", "Lcom/examples/data/source/db/AppCitiesDatabase;", "mockJson", "Lcom/examples/data/source/local/MockJson;", "(Lcom/examples/data/source/cloud/BaseCloudRepository;Lcom/examples/data/source/db/AppDatabase;Lcom/examples/data/source/db/AppCitiesDatabase;Lcom/examples/data/source/local/MockJson;)V", "deletePopularPersonTable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCities", "", "Lcom/examples/entities/city/remote/RemoteCity;", "getPopularPersons", "Lcom/examples/entities/popular_person/remote/PopularPersonsResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByCityName", "Lcom/examples/entities/weather/remote/RemoteWeather;", "cityName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCity", "city", "Lcom/examples/entities/city/local/City;", "(Lcom/examples/entities/city/local/City;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPopularPerson", "popularPerson", "Lcom/examples/entities/popular_person/local/PopularPersons;", "(Lcom/examples/entities/popular_person/local/PopularPersons;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "popularPersonDetails", "Lcom/examples/entities/PopularActorDetails;", "personId", "searchPersons", "actorName", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAllCities", "", "selectPopularPerson", "data_debug"})
public final class AppRepoImp implements com.examples.data.repository.AppRepository {
    private final com.examples.data.source.cloud.BaseCloudRepository cloudRepository = null;
    private final com.examples.data.source.db.AppDatabase database = null;
    private final com.examples.data.source.db.AppCitiesDatabase citiesDatabase = null;
    private final com.examples.data.source.local.MockJson mockJson = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object popularPersonDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String personId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.PopularActorDetails> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchPersons(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String actorName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.popular_person.remote.PopularPersonsResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularPersons(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.popular_person.remote.PopularPersonsResponse> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertPopularPerson(@org.jetbrains.annotations.NotNull()
    com.examples.entities.popular_person.local.PopularPersons popularPerson, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object selectPopularPerson(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.examples.entities.popular_person.local.PopularPersons>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deletePopularPersonTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherByCityName(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.weather.remote.RemoteWeather> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.examples.entities.city.remote.RemoteCity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCity(@org.jetbrains.annotations.NotNull()
    com.examples.entities.city.local.City city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object selectAllCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.examples.entities.city.local.City>> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public AppRepoImp(@org.jetbrains.annotations.NotNull()
    com.examples.data.source.cloud.BaseCloudRepository cloudRepository, @org.jetbrains.annotations.NotNull()
    com.examples.data.source.db.AppDatabase database, @org.jetbrains.annotations.NotNull()
    com.examples.data.source.db.AppCitiesDatabase citiesDatabase, @org.jetbrains.annotations.NotNull()
    com.examples.data.source.local.MockJson mockJson) {
        super();
    }
}