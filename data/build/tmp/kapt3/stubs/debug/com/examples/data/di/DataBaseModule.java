package com.examples.data.di;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/examples/data/di/DataBaseModule;", "", "()V", "provideCityDao", "Lcom/examples/data/source/db/CitiesDao;", "appDataBase", "Lcom/examples/data/source/db/AppCitiesDatabase;", "provideRoomCitiesDatabase", "application", "Landroid/app/Application;", "provideRoomDatabase", "Lcom/examples/data/source/db/AppDatabase;", "provideUserDao", "Lcom/examples/data/source/db/PopularPersonsDao;", "data_debug"})
@dagger.Module()
public final class DataBaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.examples.data.source.db.AppDatabase provideRoomDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.examples.data.source.db.PopularPersonsDao provideUserDao(@org.jetbrains.annotations.NotNull()
    com.examples.data.source.db.AppDatabase appDataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.examples.data.source.db.AppCitiesDatabase provideRoomCitiesDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.examples.data.source.db.CitiesDao provideCityDao(@org.jetbrains.annotations.NotNull()
    com.examples.data.source.db.AppCitiesDatabase appDataBase) {
        return null;
    }
    
    public DataBaseModule() {
        super();
    }
}