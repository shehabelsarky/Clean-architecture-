package com.examples.data.repository;

import com.examples.data.source.cloud.BaseCloudRepository;
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

  public AppRepoImp_Factory(Provider<BaseCloudRepository> cloudRepositoryProvider) {
    this.cloudRepositoryProvider = cloudRepositoryProvider;
  }

  @Override
  public AppRepoImp get() {
    return newInstance(cloudRepositoryProvider.get());
  }

  public static AppRepoImp_Factory create(Provider<BaseCloudRepository> cloudRepositoryProvider) {
    return new AppRepoImp_Factory(cloudRepositoryProvider);
  }

  public static AppRepoImp newInstance(BaseCloudRepository cloudRepository) {
    return new AppRepoImp(cloudRepository);
  }
}
