package com.examples.domain.search_popular_persons;

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
public final class SearchPopularPersonsUseCase_Factory implements Factory<SearchPopularPersonsUseCase> {
  private final Provider<CloudErrorMapper> errorUtilProvider;

  private final Provider<AppRepository> appRepositoryProvider;

  private final Provider<PopularPersonsMapper> mapperProvider;

  public SearchPopularPersonsUseCase_Factory(Provider<CloudErrorMapper> errorUtilProvider,
      Provider<AppRepository> appRepositoryProvider,
      Provider<PopularPersonsMapper> mapperProvider) {
    this.errorUtilProvider = errorUtilProvider;
    this.appRepositoryProvider = appRepositoryProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public SearchPopularPersonsUseCase get() {
    return newInstance(errorUtilProvider.get(), appRepositoryProvider.get(), mapperProvider.get());
  }

  public static SearchPopularPersonsUseCase_Factory create(
      Provider<CloudErrorMapper> errorUtilProvider, Provider<AppRepository> appRepositoryProvider,
      Provider<PopularPersonsMapper> mapperProvider) {
    return new SearchPopularPersonsUseCase_Factory(errorUtilProvider, appRepositoryProvider, mapperProvider);
  }

  public static SearchPopularPersonsUseCase newInstance(CloudErrorMapper errorUtil,
      AppRepository appRepository, PopularPersonsMapper mapper) {
    return new SearchPopularPersonsUseCase(errorUtil, appRepository, mapper);
  }
}
