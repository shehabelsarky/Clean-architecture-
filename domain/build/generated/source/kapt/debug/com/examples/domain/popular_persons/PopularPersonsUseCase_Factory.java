package com.examples.domain.popular_persons;

import com.examples.data.mapper.CloudErrorMapper;
import com.examples.data.repository.AppRepository;
import com.examples.domain.mappers.popular_persons.PopularPersonsMapper;
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
public final class PopularPersonsUseCase_Factory implements Factory<PopularPersonsRemoteUseCase> {
  private final Provider<CloudErrorMapper> errorUtilProvider;

  private final Provider<AppRepository> appRepositoryProvider;

  private final Provider<PopularPersonsMapper> mapperProvider;

  public PopularPersonsUseCase_Factory(Provider<CloudErrorMapper> errorUtilProvider,
      Provider<AppRepository> appRepositoryProvider,
      Provider<PopularPersonsMapper> mapperProvider) {
    this.errorUtilProvider = errorUtilProvider;
    this.appRepositoryProvider = appRepositoryProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public PopularPersonsRemoteUseCase get() {
    return newInstance(errorUtilProvider.get(), appRepositoryProvider.get(), mapperProvider.get());
  }

  public static PopularPersonsUseCase_Factory create(Provider<CloudErrorMapper> errorUtilProvider,
      Provider<AppRepository> appRepositoryProvider,
      Provider<PopularPersonsMapper> mapperProvider) {
    return new PopularPersonsUseCase_Factory(errorUtilProvider, appRepositoryProvider, mapperProvider);
  }

  public static PopularPersonsRemoteUseCase newInstance(CloudErrorMapper errorUtil,
                                                        AppRepository appRepository, PopularPersonsMapper mapper) {
    return new PopularPersonsRemoteUseCase(errorUtil, appRepository, mapper);
  }
}
