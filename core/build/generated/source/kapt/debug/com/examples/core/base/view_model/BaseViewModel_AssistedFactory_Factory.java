package com.examples.core.base.view_model;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseViewModel_AssistedFactory_Factory implements Factory<BaseViewModel_AssistedFactory> {
  @Override
  public BaseViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static BaseViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BaseViewModel_AssistedFactory newInstance() {
    return new BaseViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final BaseViewModel_AssistedFactory_Factory INSTANCE = new BaseViewModel_AssistedFactory_Factory();
  }
}
