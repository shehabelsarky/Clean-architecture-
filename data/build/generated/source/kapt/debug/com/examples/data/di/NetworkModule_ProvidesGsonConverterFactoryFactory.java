package com.examples.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesGsonConverterFactoryFactory implements Factory<GsonConverterFactory> {
  @Override
  public GsonConverterFactory get() {
    return providesGsonConverterFactory();
  }

  public static NetworkModule_ProvidesGsonConverterFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GsonConverterFactory providesGsonConverterFactory() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.providesGsonConverterFactory(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesGsonConverterFactoryFactory INSTANCE = new NetworkModule_ProvidesGsonConverterFactoryFactory();
  }
}
