package com.examples.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvidesRetrofitFactory(
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return providesRetrofit(gsonConverterFactoryProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitFactory create(
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvidesRetrofitFactory(gsonConverterFactoryProvider, okHttpClientProvider);
  }

  public static Retrofit providesRetrofit(GsonConverterFactory gsonConverterFactory,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.providesRetrofit(gsonConverterFactory, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
