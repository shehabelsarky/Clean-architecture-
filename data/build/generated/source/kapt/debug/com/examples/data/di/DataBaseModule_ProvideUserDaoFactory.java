package com.examples.data.di;

import com.examples.data.source.db.AppDatabase;
import com.examples.data.source.db.PopularPersonsDao;
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
public final class DataBaseModule_ProvideUserDaoFactory implements Factory<PopularPersonsDao> {
  private final DataBaseModule module;

  private final Provider<AppDatabase> appDataBaseProvider;

  public DataBaseModule_ProvideUserDaoFactory(DataBaseModule module,
      Provider<AppDatabase> appDataBaseProvider) {
    this.module = module;
    this.appDataBaseProvider = appDataBaseProvider;
  }

  @Override
  public PopularPersonsDao get() {
    return provideUserDao(module, appDataBaseProvider.get());
  }

  public static DataBaseModule_ProvideUserDaoFactory create(DataBaseModule module,
      Provider<AppDatabase> appDataBaseProvider) {
    return new DataBaseModule_ProvideUserDaoFactory(module, appDataBaseProvider);
  }

  public static PopularPersonsDao provideUserDao(DataBaseModule instance, AppDatabase appDataBase) {
    return Preconditions.checkNotNull(instance.provideUserDao(appDataBase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
