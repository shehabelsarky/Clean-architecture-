package com.examples.data.repository;

import com.examples.data.source.cloud.BaseCloudRepository;
import com.examples.data.source.db.AppDatabase;
import com.examples.data.source.local.MockJson;
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

  private final Provider<MockJson> mockJsonProvider;

  public AppRepoImp_Factory(Provider<BaseCloudRepository> cloudRepositoryProvider,
      Provider<AppDatabase> databaseProvider, Provider<MockJson> mockJsonProvider) {
    this.cloudRepositoryProvider = cloudRepositoryProvider;
    this.databaseProvider = databaseProvider;
    this.mockJsonProvider = mockJsonProvider;
  }

  @Override
  public AppRepoImp get() {
    return newInstance(cloudRepositoryProvider.get(), databaseProvider.get(), mockJsonProvider.get());
  }

  public static AppRepoImp_Factory create(Provider<BaseCloudRepository> cloudRepositoryProvider,
      Provider<AppDatabase> databaseProvider, Provider<MockJson> mockJsonProvider) {
    return new AppRepoImp_Factory(cloudRepositoryProvider, databaseProvider, mockJsonProvider);
  }

  public static AppRepoImp newInstance(BaseCloudRepository cloudRepository, AppDatabase database,
      MockJson mockJson) {
    return new AppRepoImp(cloudRepository, database, mockJson);
  }
}
