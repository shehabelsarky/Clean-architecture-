package com.examples.core.base.view_model;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002JO\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u000423\u0010\u001f\u001a/\u0012%\u0012#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0!\u0012\u0004\u0012\u00020\u001c0 j\b\u0012\u0004\u0012\u0002H\u001d`\"\u00a2\u0006\u0002\b#\u0012\u0004\u0012\u00020\u001c0 JO\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0$23\u0010\u001f\u001a/\u0012%\u0012#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0!\u0012\u0004\u0012\u00020\u001c0 j\b\u0012\u0004\u0012\u0002H\u001d`\"\u00a2\u0006\u0002\b#\u0012\u0004\u0012\u00020\u001c0 J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0010J\u000e\u0010*\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0011\u0010\u0007R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\rR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0007R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0019\u0010\u0007\u00a8\u0006+"}, d2 = {"Lcom/examples/core/base/view_model/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cancellationMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getCancellationMessage", "()Landroidx/lifecycle/MutableLiveData;", "cancellationMessage$delegate", "Lkotlin/Lazy;", "cancellationMsgLiveData", "Landroidx/lifecycle/LiveData;", "getCancellationMsgLiveData", "()Landroidx/lifecycle/LiveData;", "cancellationMsgLiveData$delegate", "error", "Lcom/examples/entities/response/ErrorModel;", "getError", "error$delegate", "errorLiveData", "getErrorLiveData", "errorLiveData$delegate", "isLoading", "", "isLoading$delegate", "isLoadingLiveData", "isLoadingLiveData$delegate", "callApi", "", "T", "data", "apiCall", "Lkotlin/Function1;", "Lcom/examples/domain/base/RemoteUseCase$Request;", "Lcom/examples/domain/base/CompletionBlock;", "Lkotlin/ExtensionFunctionType;", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "setCancellationReason", "cancellationException", "Ljava/util/concurrent/CancellationException;", "setErrorReason", "errorModel", "setLoading", "core_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy isLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy isLoadingLiveData$delegate = null;
    private final kotlin.Lazy error$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy errorLiveData$delegate = null;
    private final kotlin.Lazy cancellationMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cancellationMsgLiveData$delegate = null;
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.examples.entities.response.ErrorModel> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.examples.entities.response.ErrorModel> getErrorLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getCancellationMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getCancellationMsgLiveData() {
        return null;
    }
    
    public final void setLoading(boolean isLoading) {
    }
    
    public final void setErrorReason(@org.jetbrains.annotations.NotNull()
    com.examples.entities.response.ErrorModel errorModel) {
    }
    
    public final void setCancellationReason(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.CancellationException cancellationException) {
    }
    
    public final <T extends java.lang.Object>void callApi(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<T> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.examples.domain.base.RemoteUseCase.Request<T>, kotlin.Unit>, kotlin.Unit> apiCall) {
    }
    
    public final <T extends java.lang.Object>void callApi(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.channels.ConflatedBroadcastChannel<T> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.examples.domain.base.RemoteUseCase.Request<T>, kotlin.Unit>, kotlin.Unit> apiCall) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public BaseViewModel() {
        super();
    }
}