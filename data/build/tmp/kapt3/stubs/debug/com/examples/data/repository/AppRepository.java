package com.examples.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/examples/data/repository/AppRepository;", "", "getPopularPersons", "Lcom/examples/entities/popular_person/remote/PopularPersonsResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPopularPerson", "", "popularPerson", "Lcom/examples/entities/popular_person/local/PopularPersons;", "(Lcom/examples/entities/popular_person/local/PopularPersons;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "popularPersonDetails", "Lcom/examples/entities/PopularActorDetails;", "personId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchPersons", "actorName", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectPopularPerson", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
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
}