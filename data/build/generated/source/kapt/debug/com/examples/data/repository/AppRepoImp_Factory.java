package com.examples.data.repository;

import com.examples.data.source.cloud.BaseCloudRepository;
import com.examples.data.source.db.AppCitiesDatabase;
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

  private final Provider<AppCitiesDatabase> citiesDatabaseProvider;

  private final Provider<MockJson> mockJsonProvider;

  public AppRepoImp_Factory(Provider<BaseCloudRepository> cloudRepositoryProvider,
      Provider<AppDatabase> databaseProvider, Provider<AppCitiesDatabase> citiesDatabaseProvider,
      Provider<MockJson> mockJsonProvider) {
    this.cloudRepositoryProvider = cloudRepositoryProvider;
    this.databaseProvider = databaseProvider;
    this.citiesDatabaseProvider = citiesDatabaseProvider;
    this.mockJsonProvider = mockJsonProvider;
  }

  @Override
  public AppRepoImp get() {
    return newInstance(cloudRepositoryProvider.get(), databaseProvider.get(), citiesDatabaseProvider.get(), mockJsonProvider.get());
  }

  public static AppRepoImp_Factory create(Provider<BaseCloudRepository> cloudRepositoryProvider,
      Provider<AppDatabase> databaseProvider, Provider<AppCitiesDatabase> citiesDatabaseProvider,
      Provider<MockJson> mockJsonProvider) {
    return new AppRepoImp_Factory(cloudRepositoryProvider, databaseProvider, citiesDatabaseProvider, mockJsonProvider);
  }

  public static AppRepoImp newInstance(BaseCloudRepository cloudRepository, AppDatabase database,
      AppCitiesDatabase citiesDatabase, MockJson mockJson) {
    return new AppRepoImp(cloudRepository, database, citiesDatabase, mockJson);
  }
}
