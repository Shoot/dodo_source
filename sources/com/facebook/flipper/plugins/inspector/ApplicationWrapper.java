package com.facebook.flipper.plugins.inspector;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AndroidRootResolver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class ApplicationWrapper implements Application.ActivityLifecycleCallbacks {
    private final List<WeakReference<Activity>> mActivities;
    private ActivityDestroyedListener mActivityDestroyedListener;
    private final AndroidRootResolver mAndroidRootsResolver = new AndroidRootResolver();
    private final Application mApplication;
    private final Handler mHandler;
    private ActivityStackChangedListener mListener;

    /* loaded from: classes2.dex */
    public interface ActivityDestroyedListener {
        void onActivityDestroyed(Activity activity);
    }

    /* loaded from: classes2.dex */
    public interface ActivityStackChangedListener {
        void onActivityStackChanged(List<Activity> list);
    }

    public ApplicationWrapper(Application application) {
        this.mApplication = application;
        application.registerActivityLifecycleCallbacks(this);
        this.mActivities = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    private void notifyListener() {
        ActivityStackChangedListener activityStackChangedListener = this.mListener;
        if (activityStackChangedListener != null) {
            activityStackChangedListener.onActivityStackChanged(getActivityStack());
        }
    }

    public List<Activity> getActivityStack() {
        ArrayList arrayList = new ArrayList(this.mActivities.size());
        Iterator<WeakReference<Activity>> it = this.mActivities.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == null) {
                it.remove();
            } else {
                arrayList.add(activity);
            }
        }
        return arrayList;
    }

    public Application getApplication() {
        return this.mApplication;
    }

    public List<View> getViewRoots() {
        List<AndroidRootResolver.Root> listActiveRoots = this.mAndroidRootsResolver.listActiveRoots();
        if (listActiveRoots == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listActiveRoots.size());
        for (AndroidRootResolver.Root root : listActiveRoots) {
            arrayList.add(root.view);
        }
        return arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.mActivities.add(new WeakReference<>(activity));
        notifyListener();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator<WeakReference<Activity>> it = this.mActivities.iterator();
        ActivityDestroyedListener activityDestroyedListener = this.mActivityDestroyedListener;
        if (activityDestroyedListener != null) {
            activityDestroyedListener.onActivityDestroyed(activity);
        }
        while (it.hasNext()) {
            if (it.next().get() == activity) {
                it.remove();
            }
        }
        notifyListener();
    }

    public void postDelayed(Runnable runnable, long j) {
        this.mHandler.postDelayed(runnable, j);
    }

    public void setActivityDestroyedListener(ActivityDestroyedListener activityDestroyedListener) {
        this.mActivityDestroyedListener = activityDestroyedListener;
    }

    public void setListener(ActivityStackChangedListener activityStackChangedListener) {
        this.mListener = activityStackChangedListener;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
