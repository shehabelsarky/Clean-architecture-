package com.examples.domain.popular_persons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0095@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/examples/domain/popular_persons/PopularPersonsUseCase;", "Lcom/examples/domain/base/UseCase;", "Lcom/examples/entities/popular_person/parameters/PopularPersonsQuery;", "Lcom/examples/entities/popular_person/remote/PopularPersonsResponse;", "", "Lcom/examples/entities/popular_person/local/PopularPersons;", "errorUtil", "Lcom/examples/data/mapper/CloudErrorMapper;", "appRepository", "Lcom/examples/data/repository/AppRepository;", "mapper", "Lcom/examples/domain/mappers/popular_persons/PopularPersonsMapper;", "(Lcom/examples/data/mapper/CloudErrorMapper;Lcom/examples/data/repository/AppRepository;Lcom/examples/domain/mappers/popular_persons/PopularPersonsMapper;)V", "convert", "dto", "(Lcom/examples/entities/popular_person/remote/PopularPersonsResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeOnBackground", "parameters", "(Lcom/examples/entities/popular_person/parameters/PopularPersonsQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class PopularPersonsUseCase extends com.examples.domain.base.UseCase<com.examples.entities.popular_person.parameters.PopularPersonsQuery, com.examples.entities.popular_person.remote.PopularPersonsResponse, java.util.List<? extends com.examples.entities.popular_person.local.PopularPersons>> {
    private final com.examples.data.repository.AppRepository appRepository = null;
    private final com.examples.domain.mappers.popular_persons.PopularPersonsMapper mapper = null;
    
    @org.jetbrains.annotations.Nullable()
    @kotlinx.coroutines.FlowPreview()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    protected java.lang.Object convert(@org.jetbrains.annotations.NotNull()
    com.examples.entities.popular_person.remote.PopularPersonsResponse dto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.examples.entities.popular_person.local.PopularPersons>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object executeOnBackground(@org.jetbrains.annotations.NotNull()
    com.examples.entities.popular_person.parameters.PopularPersonsQuery parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.examples.entities.popular_person.remote.PopularPersonsResponse> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public PopularPersonsUseCase(@org.jetbrains.annotations.NotNull()
    com.examples.data.mapper.CloudErrorMapper errorUtil, @org.jetbrains.annotations.NotNull()
    com.examples.data.repository.AppRepository appRepository, @org.jetbrains.annotations.NotNull()
    com.examples.domain.mappers.popular_persons.PopularPersonsMapper mapper) {
        super(null);
    }
}