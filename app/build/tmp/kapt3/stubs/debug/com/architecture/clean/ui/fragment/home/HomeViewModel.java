package com.architecture.clean.ui.fragment.home;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/architecture/clean/ui/fragment/home/HomeViewModel;", "Lcom/examples/core/base/view_model/BaseViewModel;", "popularPersonsUseCase", "Lcom/examples/domain/popular_persons/PopularPersonsUseCase;", "searchPopularPersonsUseCase", "Lcom/examples/domain/search_popular_persons/SearchPopularPersonsUseCase;", "(Lcom/examples/domain/popular_persons/PopularPersonsUseCase;Lcom/examples/domain/search_popular_persons/SearchPopularPersonsUseCase;)V", "TAG", "", "popularPersonsChannel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "", "Lcom/examples/entities/popular_person/local/PopularPersons;", "getPopularPersonsChannel", "()Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "popularPersonsChannel$delegate", "Lkotlin/Lazy;", "searchPopularPersonsData", "Landroidx/lifecycle/MutableLiveData;", "getSearchPopularPersonsData", "()Landroidx/lifecycle/MutableLiveData;", "searchPopularPersonsData$delegate", "searchPopularPersonsLiveData", "Landroidx/lifecycle/LiveData;", "getSearchPopularPersonsLiveData", "()Landroidx/lifecycle/LiveData;", "getPopularPersons", "", "parameters", "Lcom/examples/entities/popular_person/parameters/PopularPersonsQuery;", "onCleared", "searchPopularPersons", "app_debug"})
public final class HomeViewModel extends com.examples.core.base.view_model.BaseViewModel {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy popularPersonsChannel$delegate = null;
    private final kotlin.Lazy searchPopularPersonsData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.examples.entities.popular_person.local.PopularPersons>> searchPopularPersonsLiveData = null;
    private final com.examples.domain.popular_persons.PopularPersonsUseCase popularPersonsUseCase = null;
    private final com.examples.domain.search_popular_persons.SearchPopularPersonsUseCase searchPopularPersonsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.ConflatedBroadcastChannel<java.util.List<com.examples.entities.popular_person.local.PopularPersons>> getPopularPersonsChannel() {
        return null;
    }
    
    public final void getPopularPersons(@org.jetbrains.annotations.NotNull()
    com.examples.entities.popular_person.parameters.PopularPersonsQuery parameters) {
    }
    
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.examples.entities.popular_person.local.PopularPersons>> getSearchPopularPersonsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.examples.entities.popular_person.local.PopularPersons>> getSearchPopularPersonsLiveData() {
        return null;
    }
    
    public final void searchPopularPersons(@org.jetbrains.annotations.NotNull()
    com.examples.entities.popular_person.parameters.PopularPersonsQuery parameters) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.examples.domain.popular_persons.PopularPersonsUseCase popularPersonsUseCase, @org.jetbrains.annotations.NotNull()
    com.examples.domain.search_popular_persons.SearchPopularPersonsUseCase searchPopularPersonsUseCase) {
        super();
    }
}