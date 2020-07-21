package com.architecture.clean.core;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.details.ui.activity.DetailsActivity;
import com.example.details.ui.fragments.DetailsFragment;
import com.example.details.ui.fragments.DetailsViewModel_AssistedFactory;
import com.example.details.ui.fragments.DetailsViewModel_AssistedFactory_Factory;
import com.example.popularpersons.ui.activity.MainActivity;
import com.example.popularpersons.ui.fragment.home.HomeFragment;
import com.example.popularpersons.ui.fragment.home.HomeViewModel_AssistedFactory;
import com.example.popularpersons.ui.fragment.home.HomeViewModel_AssistedFactory_Factory;
import com.examples.core.base.view_model.BaseViewModel_AssistedFactory;
import com.examples.core.base.view_model.BaseViewModel_AssistedFactory_Factory;
import com.examples.data.di.DataBaseModule;
import com.examples.data.di.DataBaseModule_ProvideRoomDatabaseFactory;
import com.examples.data.di.NetworkModule;
import com.examples.data.di.NetworkModule_LoggingInterceptorFactory;
import com.examples.data.di.NetworkModule_ProvideCloudRepositoryFactory;
import com.examples.data.di.NetworkModule_ProvideServiceFactory;
import com.examples.data.di.NetworkModule_ProvidesGsonConverterFactoryFactory;
import com.examples.data.di.NetworkModule_ProvidesGsonFactory;
import com.examples.data.di.NetworkModule_ProvidesOkHttpClientFactory;
import com.examples.data.di.NetworkModule_ProvidesRetrofitFactory;
import com.examples.data.mapper.CloudErrorMapper;
import com.examples.data.repository.AppRepoImp;
import com.examples.data.restful.ApiService;
import com.examples.data.source.cloud.BaseCloudRepository;
import com.examples.data.source.db.AppDatabase;
import com.examples.domain.mappers.popular_persons.PopularPersonsMapper;
import com.examples.domain.popular_persons.DropPopularPersonsUseCase;
import com.examples.domain.popular_persons.InsertPopularPersonUseCase;
import com.examples.domain.popular_persons.PopularPersonsRemoteUseCase;
import com.examples.domain.popular_persons.SelectPopularPersonsUseCase;
import com.examples.domain.search_popular_persons.SearchPopularPersonsRemoteUseCase;
import com.google.gson.Gson;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApp_HiltComponents_ApplicationC extends App_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final DataBaseModule dataBaseModule;

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object gsonConverterFactory = new MemoizedSentinel();

  private volatile Object httpLoggingInterceptor = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object apiService = new MemoizedSentinel();

  private volatile Object appDatabase = new MemoizedSentinel();

  private DaggerApp_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam, DataBaseModule dataBaseModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.dataBaseModule = dataBaseModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Gson getGson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidesGsonFactory.providesGson();
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private GsonConverterFactory getGsonConverterFactory() {
    Object local = gsonConverterFactory;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gsonConverterFactory;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidesGsonConverterFactoryFactory.providesGsonConverterFactory();
          gsonConverterFactory = DoubleCheck.reentrantCheck(gsonConverterFactory, local);
        }
      }
    }
    return (GsonConverterFactory) local;
  }

  private HttpLoggingInterceptor getHttpLoggingInterceptor() {
    Object local = httpLoggingInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = httpLoggingInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_LoggingInterceptorFactory.loggingInterceptor();
          httpLoggingInterceptor = DoubleCheck.reentrantCheck(httpLoggingInterceptor, local);
        }
      }
    }
    return (HttpLoggingInterceptor) local;
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidesOkHttpClientFactory.providesOkHttpClient(getHttpLoggingInterceptor());
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidesRetrofitFactory.providesRetrofit(getGsonConverterFactory(), getOkHttpClient());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ApiService getApiService() {
    Object local = apiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = apiService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideServiceFactory.provideService(getRetrofit());
          apiService = DoubleCheck.reentrantCheck(apiService, local);
        }
      }
    }
    return (ApiService) local;
  }

  private BaseCloudRepository getBaseCloudRepository() {
    return NetworkModule_ProvideCloudRepositoryFactory.provideCloudRepository(getApiService());
  }

  private AppDatabase getAppDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DataBaseModule_ProvideRoomDatabaseFactory.provideRoomDatabase(dataBaseModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private AppRepoImp getAppRepoImp() {
    return new AppRepoImp(getBaseCloudRepository(), getAppDatabase());
  }

  @Override
  public void injectApp(App app) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private DataBaseModule dataBaseModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder dataBaseModule(DataBaseModule dataBaseModule) {
      this.dataBaseModule = Preconditions.checkNotNull(dataBaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public App_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (dataBaseModule == null) {
        this.dataBaseModule = new DataBaseModule();
      }
      return new DaggerApp_HiltComponents_ApplicationC(applicationContextModule, dataBaseModule);
    }
  }

  private final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public App_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends App_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<BaseViewModel_AssistedFactory> baseViewModel_AssistedFactoryProvider;

      private volatile Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider;

      private volatile Provider<PopularPersonsRemoteUseCase> popularPersonsRemoteUseCaseProvider;

      private volatile Provider<SearchPopularPersonsRemoteUseCase> searchPopularPersonsRemoteUseCaseProvider;

      private volatile Provider<InsertPopularPersonUseCase> insertPopularPersonUseCaseProvider;

      private volatile Provider<SelectPopularPersonsUseCase> selectPopularPersonsUseCaseProvider;

      private volatile Provider<DropPopularPersonsUseCase> dropPopularPersonsUseCaseProvider;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private Provider<BaseViewModel_AssistedFactory> getBaseViewModel_AssistedFactoryProvider() {
        Object local = baseViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          baseViewModel_AssistedFactoryProvider = (Provider<BaseViewModel_AssistedFactory>) local;
        }
        return (Provider<BaseViewModel_AssistedFactory>) local;
      }

      private Provider<DetailsViewModel_AssistedFactory> getDetailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          detailsViewModel_AssistedFactoryProvider = (Provider<DetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailsViewModel_AssistedFactory>) local;
      }

      private CloudErrorMapper getCloudErrorMapper() {
        return new CloudErrorMapper(DaggerApp_HiltComponents_ApplicationC.this.getGson());
      }

      private PopularPersonsRemoteUseCase getPopularPersonsRemoteUseCase() {
        return new PopularPersonsRemoteUseCase(getCloudErrorMapper(), DaggerApp_HiltComponents_ApplicationC.this.getAppRepoImp(), new PopularPersonsMapper());
      }

      private Provider<PopularPersonsRemoteUseCase> getPopularPersonsRemoteUseCaseProvider() {
        Object local = popularPersonsRemoteUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          popularPersonsRemoteUseCaseProvider = (Provider<PopularPersonsRemoteUseCase>) local;
        }
        return (Provider<PopularPersonsRemoteUseCase>) local;
      }

      private SearchPopularPersonsRemoteUseCase getSearchPopularPersonsRemoteUseCase() {
        return new SearchPopularPersonsRemoteUseCase(getCloudErrorMapper(), DaggerApp_HiltComponents_ApplicationC.this.getAppRepoImp(), new PopularPersonsMapper());
      }

      private Provider<SearchPopularPersonsRemoteUseCase> getSearchPopularPersonsRemoteUseCaseProvider(
          ) {
        Object local = searchPopularPersonsRemoteUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          searchPopularPersonsRemoteUseCaseProvider = (Provider<SearchPopularPersonsRemoteUseCase>) local;
        }
        return (Provider<SearchPopularPersonsRemoteUseCase>) local;
      }

      private InsertPopularPersonUseCase getInsertPopularPersonUseCase() {
        return new InsertPopularPersonUseCase(DaggerApp_HiltComponents_ApplicationC.this.getAppRepoImp());
      }

      private Provider<InsertPopularPersonUseCase> getInsertPopularPersonUseCaseProvider() {
        Object local = insertPopularPersonUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          insertPopularPersonUseCaseProvider = (Provider<InsertPopularPersonUseCase>) local;
        }
        return (Provider<InsertPopularPersonUseCase>) local;
      }

      private SelectPopularPersonsUseCase getSelectPopularPersonsUseCase() {
        return new SelectPopularPersonsUseCase(DaggerApp_HiltComponents_ApplicationC.this.getAppRepoImp());
      }

      private Provider<SelectPopularPersonsUseCase> getSelectPopularPersonsUseCaseProvider() {
        Object local = selectPopularPersonsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          selectPopularPersonsUseCaseProvider = (Provider<SelectPopularPersonsUseCase>) local;
        }
        return (Provider<SelectPopularPersonsUseCase>) local;
      }

      private DropPopularPersonsUseCase getDropPopularPersonsUseCase() {
        return new DropPopularPersonsUseCase(DaggerApp_HiltComponents_ApplicationC.this.getAppRepoImp());
      }

      private Provider<DropPopularPersonsUseCase> getDropPopularPersonsUseCaseProvider() {
        Object local = dropPopularPersonsUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(7);
          dropPopularPersonsUseCaseProvider = (Provider<DropPopularPersonsUseCase>) local;
        }
        return (Provider<DropPopularPersonsUseCase>) local;
      }

      private HomeViewModel_AssistedFactory getHomeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance(getPopularPersonsRemoteUseCaseProvider(), getSearchPopularPersonsRemoteUseCaseProvider(), getInsertPopularPersonUseCaseProvider(), getSelectPopularPersonsUseCaseProvider(), getDropPopularPersonsUseCaseProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> getHomeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("com.examples.core.base.view_model.BaseViewModel", (Provider) getBaseViewModel_AssistedFactoryProvider()).put("com.example.details.ui.fragments.DetailsViewModel", (Provider) getDetailsViewModel_AssistedFactoryProvider()).put("com.example.popularpersons.ui.fragment.home.HomeViewModel", (Provider) getHomeViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectDetailsActivity(DetailsActivity arg0) {
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public App_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends App_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectDetailsFragment(DetailsFragment arg0) {
        }

        @Override
        public void injectHomeFragment(HomeFragment arg0) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public App_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public App_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends App_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.examples.core.base.view_model.BaseViewModel_AssistedFactory 
            return (T) BaseViewModel_AssistedFactory_Factory.newInstance();

            case 1: // com.example.details.ui.fragments.DetailsViewModel_AssistedFactory 
            return (T) DetailsViewModel_AssistedFactory_Factory.newInstance();

            case 2: // com.example.popularpersons.ui.fragment.home.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeViewModel_AssistedFactory();

            case 3: // com.examples.domain.popular_persons.PopularPersonsRemoteUseCase 
            return (T) ActivityCImpl.this.getPopularPersonsRemoteUseCase();

            case 4: // com.examples.domain.search_popular_persons.SearchPopularPersonsRemoteUseCase 
            return (T) ActivityCImpl.this.getSearchPopularPersonsRemoteUseCase();

            case 5: // com.examples.domain.popular_persons.InsertPopularPersonUseCase 
            return (T) ActivityCImpl.this.getInsertPopularPersonUseCase();

            case 6: // com.examples.domain.popular_persons.SelectPopularPersonsUseCase 
            return (T) ActivityCImpl.this.getSelectPopularPersonsUseCase();

            case 7: // com.examples.domain.popular_persons.DropPopularPersonsUseCase 
            return (T) ActivityCImpl.this.getDropPopularPersonsUseCase();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
