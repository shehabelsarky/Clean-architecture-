package com.examples.domain.base;

import java.lang.System;

/**
 * @type in P paramater
 * @type R DTO result
 * @type FR(final result) mapped DTO to BO
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0001\u001dB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u000f\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00002\'\u0010\u0015\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u0016j\b\u0012\u0004\u0012\u00028\u0002`\u0018\u00a2\u0006\u0002\b\u0019\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\u001c\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/examples/domain/base/UseCase;", "P", "R", "FR", "", "errorUtil", "Lcom/examples/data/mapper/CloudErrorMapper;", "(Lcom/examples/data/mapper/CloudErrorMapper;)V", "backgroundContext", "Lkotlin/coroutines/CoroutineContext;", "getErrorUtil", "()Lcom/examples/data/mapper/CloudErrorMapper;", "foregroundContext", "parentJob", "Lkotlinx/coroutines/Job;", "convert", "dto", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "", "parameters", "block", "Lkotlin/Function1;", "Lcom/examples/domain/base/UseCase$Request;", "Lcom/examples/domain/base/CompletionBlock;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "executeOnBackground", "unsubscribe", "Request", "domain_debug"})
public abstract class UseCase<P extends java.lang.Object, R extends java.lang.Object, FR extends java.lang.Object> {
    private kotlinx.coroutines.Job parentJob;
    private kotlin.coroutines.CoroutineContext backgroundContext;
    private kotlin.coroutines.CoroutineContext foregroundContext;
    @org.jetbrains.annotations.NotNull()
    private final com.examples.data.mapper.CloudErrorMapper errorUtil = null;
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object executeOnBackground(P parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p1);
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object convert(R dto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super FR> p1);
    
    public final void execute(P parameters, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.examples.domain.base.UseCase.Request<FR>, kotlin.Unit> block) {
    }
    
    public final void unsubscribe() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.data.mapper.CloudErrorMapper getErrorUtil() {
        return null;
    }
    
    public UseCase(@org.jetbrains.annotations.NotNull()
    com.examples.data.mapper.CloudErrorMapper errorUtil) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0003H\u0086\u0002\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006H\u0086\u0002J\u0015\u0010\u000e\u001a\u00020\u00072\n\u0010\u0011\u001a\u00060\tj\u0002`\nH\u0086\u0002J\u001a\u0010\u0004\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u001e\u0010\b\u001a\u00020\u00072\u0016\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00070\u0005J\u001a\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00070\u0005J\u001a\u0010\f\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/examples/domain/base/UseCase$Request;", "T", "", "()V", "isLoading", "Lkotlin/Function1;", "", "", "onCancel", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "onComplete", "onError", "Lcom/examples/entities/response/ErrorModel;", "invoke", "result", "(Ljava/lang/Object;)V", "error", "loading", "block", "domain_debug"})
    public static final class Request<T extends java.lang.Object> {
        private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isLoading;
        private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onComplete;
        private kotlin.jvm.functions.Function1<? super com.examples.entities.response.ErrorModel, kotlin.Unit> onError;
        private kotlin.jvm.functions.Function1<? super java.util.concurrent.CancellationException, kotlin.Unit> onCancel;
        
        public final void isLoading(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isLoading) {
        }
        
        public final void onComplete(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        }
        
        public final void onError(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.examples.entities.response.ErrorModel, kotlin.Unit> block) {
        }
        
        public final void onCancel(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.concurrent.CancellationException, kotlin.Unit> block) {
        }
        
        public final void invoke(boolean loading) {
        }
        
        public final void invoke(T result) {
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        com.examples.entities.response.ErrorModel error) {
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        java.util.concurrent.CancellationException error) {
        }
        
        public Request() {
            super();
        }
    }
}