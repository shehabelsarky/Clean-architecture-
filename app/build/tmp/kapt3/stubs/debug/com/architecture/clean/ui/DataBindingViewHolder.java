package com.architecture.clean.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\r\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/architecture/clean/ui/DataBindingViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "layoutId", "", "parent", "Landroid/view/ViewGroup;", "attachToParent", "", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)V", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "onBind", "", "t", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class DataBindingViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ViewDataBinding dataBinding = null;
    
    public abstract void onBind(T t);
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ViewDataBinding getDataBinding() {
        return null;
    }
    
    public DataBindingViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding dataBinding) {
        super(null);
    }
    
    public DataBindingViewHolder(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.LayoutInflater inflater, @androidx.annotation.IdRes()
    int layoutId, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.ViewGroup parent, @androidx.annotation.NonNull()
    boolean attachToParent) {
        super(null);
    }
}