package com.examples.data.di;

import android.app.Application;
import com.examples.data.source.db.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataBaseModule_ProvideRoomDatabaseFactory implements Factory<AppDatabase> {
  private final DataBaseModule module;

  private final Provider<Application> applicationProvider;

  public DataBaseModule_ProvideRoomDatabaseFactory(DataBaseModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideRoomDatabase(module, applicationProvider.get());
  }

  public static DataBaseModule_ProvideRoomDatabaseFactory create(DataBaseModule module,
      Provider<Application> applicationProvider) {
    return new DataBaseModule_ProvideRoomDatabaseFactory(module, applicationProvider);
  }

  public static AppDatabase provideRoomDatabase(DataBaseModule instance, Application application) {
    return Preconditions.checkNotNull(instance.provideRoomDatabase(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
