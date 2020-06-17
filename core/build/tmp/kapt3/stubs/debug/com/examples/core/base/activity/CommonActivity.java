package com.examples.core.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/examples/core/base/activity/CommonActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "Lcom/examples/core/utils/LoadingListener;", "()V", "navController", "Landroidx/navigation/NavController;", "navFragment", "Landroidx/navigation/fragment/NavHostFragment;", "navGraphResourceId", "", "getNavGraphResourceId", "()I", "setNavGraphResourceId", "(I)V", "requestPermissions", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "kotlin.jvm.PlatformType", "changeBackButtonVisibility", "", "isVisible", "", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setNavFragment", "showLoading", "show", "Companion", "core_debug"})
public abstract class CommonActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, com.examples.core.utils.LoadingListener {
    private androidx.navigation.fragment.NavHostFragment navFragment;
    private androidx.navigation.NavController navController;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissions = null;
    private static final java.lang.String[] permissions = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public static final com.examples.core.base.activity.CommonActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getNavGraphResourceId();
    
    public abstract void setNavGraphResourceId(int p0);
    
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/examples/core/base/activity/CommonActivity$Companion;", "", "()V", "permissions", "", "", "[Ljava/lang/String;", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}