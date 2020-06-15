package com.architecture.clean.ui.fragment.home;

import com.examples.domain.popular_persons.PopularPersonsUseCase;
import com.examples.domain.search_popular_persons.SearchPopularPersonsUseCase;
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
public final class HomeViewModel_AssistedFactory_Factory implements Factory<HomeViewModel_AssistedFactory> {
  private final Provider<PopularPersonsUseCase> popularPersonsUseCaseProvider;

  private final Provider<SearchPopularPersonsUseCase> searchPopularPersonsUseCaseProvider;

  public HomeViewModel_AssistedFactory_Factory(
      Provider<PopularPersonsUseCase> popularPersonsUseCaseProvider,
      Provider<SearchPopularPersonsUseCase> searchPopularPersonsUseCaseProvider) {
    this.popularPersonsUseCaseProvider = popularPersonsUseCaseProvider;
    this.searchPopularPersonsUseCaseProvider = searchPopularPersonsUseCaseProvider;
  }

  @Override
  public HomeViewModel_AssistedFactory get() {
    return newInstance(popularPersonsUseCaseProvider, searchPopularPersonsUseCaseProvider);
  }

  public static HomeViewModel_AssistedFactory_Factory create(
      Provider<PopularPersonsUseCase> popularPersonsUseCaseProvider,
      Provider<SearchPopularPersonsUseCase> searchPopularPersonsUseCaseProvider) {
    return new HomeViewModel_AssistedFactory_Factory(popularPersonsUseCaseProvider, searchPopularPersonsUseCaseProvider);
  }

  public static HomeViewModel_AssistedFactory newInstance(
      Provider<PopularPersonsUseCase> popularPersonsUseCase,
      Provider<SearchPopularPersonsUseCase> searchPopularPersonsUseCase) {
    return new HomeViewModel_AssistedFactory(popularPersonsUseCase, searchPopularPersonsUseCase);
  }
}
