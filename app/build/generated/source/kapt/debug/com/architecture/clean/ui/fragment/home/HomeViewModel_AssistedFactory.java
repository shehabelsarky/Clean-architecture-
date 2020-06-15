package com.architecture.clean.ui.fragment.home;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.examples.domain.popular_persons.PopularPersonsUseCase;
import com.examples.domain.search_popular_persons.SearchPopularPersonsUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<PopularPersonsUseCase> popularPersonsUseCase;

  private final Provider<SearchPopularPersonsUseCase> searchPopularPersonsUseCase;

  @Inject
  HomeViewModel_AssistedFactory(Provider<PopularPersonsUseCase> popularPersonsUseCase,
      Provider<SearchPopularPersonsUseCase> searchPopularPersonsUseCase) {
    this.popularPersonsUseCase = popularPersonsUseCase;
    this.searchPopularPersonsUseCase = searchPopularPersonsUseCase;
  }

  @Override
  @NonNull
  public HomeViewModel create(@NonNull SavedStateHandle arg0) {
    return new HomeViewModel(popularPersonsUseCase.get(), searchPopularPersonsUseCase.get());
  }
}
