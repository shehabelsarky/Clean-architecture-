package com.examples.data.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesGsonFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return providesGson();
  }

  public static NetworkModule_ProvidesGsonFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson providesGson() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.providesGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesGsonFactory INSTANCE = new NetworkModule_ProvidesGsonFactory();
  }
}
