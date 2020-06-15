package com.examples.core.base.view_model;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class BaseViewModel_AssistedFactory implements ViewModelAssistedFactory<BaseViewModel> {
  @Inject
  BaseViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public BaseViewModel create(@NonNull SavedStateHandle arg0) {
    return new BaseViewModel();
  }
}
