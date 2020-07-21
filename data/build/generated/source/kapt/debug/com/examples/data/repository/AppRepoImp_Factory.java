package com.examples.data.repository;

import com.examples.data.source.cloud.BaseCloudRepository;
import com.examples.data.source.db.AppDatabase;
import dagger.internal.Factory;
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
public final class AppRepoImp_Factory implements Factory<AppRepoImp> {
  private final Provider<BaseCloudRepository> cloudRepositoryProvider;

  private final Provider<AppDatabase> databaseProvider;

  public AppRepoImp_Factory(Provider<BaseCloudRepository> cloudRepositoryProvider,
      Provider<AppDatabase> databaseProvider) {
    this.cloudRepositoryProvider = cloudRepositoryProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public AppRepoImp get() {
    return newInstance(cloudRepositoryProvider.get(), databaseProvider.get());
  }

  public static AppRepoImp_Factory create(Provider<BaseCloudRepository> cloudRepositoryProvider,
      Provider<AppDatabase> databaseProvider) {
    return new AppRepoImp_Factory(cloudRepositoryProvider, databaseProvider);
  }

  public static AppRepoImp newInstance(BaseCloudRepository cloudRepository, AppDatabase database) {
    return new AppRepoImp(cloudRepository, database);
  }
}
