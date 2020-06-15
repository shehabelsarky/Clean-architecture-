package com.examples.data.di;

import com.examples.data.restful.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideServiceFactory(retrofitProvider);
  }

  public static ApiService provideService(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
