package com.examples.data.di;

import com.examples.data.restful.ApiService;
import com.examples.data.source.cloud.BaseCloudRepository;
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
public final class NetworkModule_ProvideCloudRepositoryFactory implements Factory<BaseCloudRepository> {
  private final Provider<ApiService> apIsProvider;

  public NetworkModule_ProvideCloudRepositoryFactory(Provider<ApiService> apIsProvider) {
    this.apIsProvider = apIsProvider;
  }

  @Override
  public BaseCloudRepository get() {
    return provideCloudRepository(apIsProvider.get());
  }

  public static NetworkModule_ProvideCloudRepositoryFactory create(
      Provider<ApiService> apIsProvider) {
    return new NetworkModule_ProvideCloudRepositoryFactory(apIsProvider);
  }

  public static BaseCloudRepository provideCloudRepository(ApiService apIs) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideCloudRepository(apIs), "Cannot return null from a non-@Nullable @Provides method");
  }
}
