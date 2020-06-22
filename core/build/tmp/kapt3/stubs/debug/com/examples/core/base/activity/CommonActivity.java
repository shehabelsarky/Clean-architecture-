package com.examples.core.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0018H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\u00020\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/examples/core/base/activity/CommonActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "Lcom/examples/core/utils/LoadingListener;", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "navController", "Landroidx/navigation/NavController;", "navFragment", "Landroidx/navigation/fragment/NavHostFragment;", "navGraphResourceId", "", "getNavGraphResourceId", "()I", "setNavGraphResourceId", "(I)V", "changeBackButtonVisibility", "", "isVisible", "", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "setNavFragment", "showLoading", "show", "core_debug"})
public abstract class CommonActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, com.examples.core.utils.LoadingListener {
    private androidx.navigation.fragment.NavHostFragment navFragment;
    private androidx.navigation.NavController navController;
    @org.jetbrains.annotations.NotNull()
    protected android.os.Bundle bundle;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getNavGraphResourceId();
    
    public abstract void setNavGraphResourceId(int p0);
    
    @org.jetbrains.annotations.NotNull()
    protected final android.os.Bundle getBundle() {
        return null;
    }
    
    protected final void setBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void setNavFragment() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public void changeBackButtonVisibility(boolean isVisible) {
    }
    
    @java.lang.Override()
    public void showLoading(boolean show) {
    }
    
    public CommonActivity() {
        super();
    }
}