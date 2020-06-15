package com.examples.data.mapper;

import com.google.gson.Gson;
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
public final class CloudErrorMapper_Factory implements Factory<CloudErrorMapper> {
  private final Provider<Gson> gsonProvider;

  public CloudErrorMapper_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public CloudErrorMapper get() {
    return newInstance(gsonProvider.get());
  }

  public static CloudErrorMapper_Factory create(Provider<Gson> gsonProvider) {
    return new CloudErrorMapper_Factory(gsonProvider);
  }

  public static CloudErrorMapper newInstance(Gson gson) {
    return new CloudErrorMapper(gson);
  }
}
