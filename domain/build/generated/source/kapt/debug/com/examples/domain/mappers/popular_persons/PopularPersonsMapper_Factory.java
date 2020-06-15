package com.examples.domain.mappers.popular_persons;

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
public final class PopularPersonsMapper_Factory implements Factory<PopularPersonsMapper> {
  @Override
  public PopularPersonsMapper get() {
    return newInstance();
  }

  public static PopularPersonsMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PopularPersonsMapper newInstance() {
    return new PopularPersonsMapper();
  }

  private static final class InstanceHolder {
    private static final PopularPersonsMapper_Factory INSTANCE = new PopularPersonsMapper_Factory();
  }
}
