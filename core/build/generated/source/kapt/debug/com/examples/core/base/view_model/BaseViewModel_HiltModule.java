package com.examples.core.base.view_model;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = BaseViewModel.class
)
public interface BaseViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.examples.core.base.view_model.BaseViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(BaseViewModel_AssistedFactory factory);
}
