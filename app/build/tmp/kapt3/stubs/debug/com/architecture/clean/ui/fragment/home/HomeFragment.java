package com.architecture.clean.ui.fragment.home;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J \u0010\u001c\u001a\u00020\u00192\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/architecture/clean/ui/fragment/home/HomeFragment;", "Lcom/examples/core/base/fragment/BaseFragment;", "Lcom/architecture/clean/ui/fragment/home/HomeViewModel;", "()V", "TAG", "", "layoutResourceId", "", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "popularPersonsGroupAdapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "popularPersonsList", "Ljava/util/ArrayList;", "Lcom/examples/entities/popular_person/local/PopularPersons;", "Lkotlin/collections/ArrayList;", "viewModel", "getViewModel", "()Lcom/architecture/clean/ui/fragment/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "setData", "data", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.examples.core.base.fragment.BaseFragment<com.architecture.clean.ui.fragment.home.HomeViewModel> {
    private int layoutResourceId = com.architecture.clean.R.layout.fragment_home;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.lang.String TAG = null;
    private final java.util.ArrayList<com.examples.entities.popular_person.local.PopularPersons> popularPersonsList = null;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.ViewHolder> popularPersonsGroupAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutResourceId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setLayoutResourceId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.architecture.clean.ui.fragment.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setData(java.util.ArrayList<com.examples.entities.popular_person.local.PopularPersons> data) {
    }
    
    public HomeFragment() {
        super();
    }
}