package com.examples.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  public NetworkModule_ProvidesOkHttpClientFactory(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    this.loggingInterceptorProvider = loggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(loggingInterceptorProvider.get());
  }

  public static NetworkModule_ProvidesOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    return new NetworkModule_ProvidesOkHttpClientFactory(loggingInterceptorProvider);
  }

  public static OkHttpClient providesOkHttpClient(HttpLoggingInterceptor loggingInterceptor) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.providesOkHttpClient(loggingInterceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
