package com.architecture.clean.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/architecture/clean/di/module/AppModule;", "", "()V", "bindAppRepository", "Lcom/examples/data/repository/AppRepository;", "appRepoImp", "Lcom/examples/data/repository/AppRepoImp;", "app_debug"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.examples.data.repository.AppRepository bindAppRepository(@org.jetbrains.annotations.NotNull()
    com.examples.data.repository.AppRepoImp appRepoImp);
    
    public AppModule() {
        super();
    }
}