package com.yyxnb.arch.base;

import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.util.Log;

import com.yyxnb.widget.interfaces.ILifecycle;

import java.io.Serializable;

/**
 * 打印页面生命周期
 *
 * @author yyx
 */
public class Java8Observer implements ILifecycle, Serializable {

    private String tag;

    public Java8Observer(String tag) {
        this.tag = tag;
    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        Log.e(tag, owner.getLifecycle().getCurrentState().name());
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        Log.w(tag, owner.getLifecycle().getCurrentState().name());
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        Log.w(tag, owner.getLifecycle().getCurrentState().name());
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        Log.w(tag, owner.getLifecycle().getCurrentState().name());
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        Log.w(tag, owner.getLifecycle().getCurrentState().name());
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        Log.e(tag, owner.getLifecycle().getCurrentState().name());
    }
}
