package com.facebook.flipper.plugins.uidebugger.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import com.facebook.flipper.plugins.uidebugger.core.RootViewResolver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ApplicationObserver.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "activities", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activitiesStack", "", "getActivitiesStack", "()Ljava/util/List;", "activityDestroyedListener", "Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationObserver$ActivityDestroyedListener;", "activityStackChangedlistener", "Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationObserver$ActivityStackChangedListener;", "getApplication", "()Landroid/app/Application;", "rootViews", "Landroid/view/View;", "getRootViews", "rootsResolver", "Lcom/facebook/flipper/plugins/uidebugger/core/RootViewResolver;", "onActivityCreated", "", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "setActivityDestroyedListener", "listener", "setActivityStackChangedListener", "ActivityDestroyedListener", "ActivityStackChangedListener", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApplicationObserver implements Application.ActivityLifecycleCallbacks {
    private final List<WeakReference<Activity>> activities;
    private ActivityDestroyedListener activityDestroyedListener;
    private ActivityStackChangedListener activityStackChangedlistener;
    private final Application application;
    private final RootViewResolver rootsResolver;

    /* compiled from: ApplicationObserver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationObserver$ActivityDestroyedListener;", "", "onActivityDestroyed", "", "activity", "Landroid/app/Activity;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface ActivityDestroyedListener {
        void onActivityDestroyed(Activity activity);
    }

    /* compiled from: ApplicationObserver.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/core/ApplicationObserver$ActivityStackChangedListener;", "", "onActivityStackChanged", "", "stack", "", "Landroid/app/Activity;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface ActivityStackChangedListener {
        void onActivityStackChanged(List<? extends Activity> list);
    }

    public ApplicationObserver(Application application) {
        z65.h(application, "application");
        this.application = application;
        this.rootsResolver = new RootViewResolver();
        application.registerActivityLifecycleCallbacks(this);
        this.activities = new ArrayList();
    }

    public final List<Activity> getActivitiesStack() {
        ArrayList arrayList = new ArrayList(this.activities.size());
        Iterator<WeakReference<Activity>> it = this.activities.iterator();
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

    public final Application getApplication() {
        return this.application;
    }

    public final List<View> getRootViews() {
        List<View> l;
        List<RootViewResolver.RootView> listActiveRootViews = this.rootsResolver.listActiveRootViews();
        if (listActiveRootViews == null) {
            l = kc1.l();
            return l;
        }
        ArrayList arrayList = new ArrayList(listActiveRootViews.size());
        for (RootViewResolver.RootView rootView : listActiveRootViews) {
            arrayList.add(rootView.getView());
        }
        return arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        z65.h(activity, "activity");
        this.activities.add(new WeakReference<>(activity));
        ActivityStackChangedListener activityStackChangedListener = this.activityStackChangedlistener;
        if (activityStackChangedListener != null) {
            activityStackChangedListener.onActivityStackChanged(getActivitiesStack());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        z65.h(activity, "activity");
        Iterator<WeakReference<Activity>> it = this.activities.iterator();
        while (it.hasNext()) {
            if (it.next().get() == activity) {
                it.remove();
            }
        }
        ActivityDestroyedListener activityDestroyedListener = this.activityDestroyedListener;
        if (activityDestroyedListener != null) {
            activityDestroyedListener.onActivityDestroyed(activity);
        }
        ActivityStackChangedListener activityStackChangedListener = this.activityStackChangedlistener;
        if (activityStackChangedListener != null) {
            activityStackChangedListener.onActivityStackChanged(getActivitiesStack());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        z65.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        z65.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        z65.h(activity, "activity");
        z65.h(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        z65.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        z65.h(activity, "activity");
    }

    public final void setActivityDestroyedListener(ActivityDestroyedListener activityDestroyedListener) {
        this.activityDestroyedListener = activityDestroyedListener;
    }

    public final void setActivityStackChangedListener(ActivityStackChangedListener activityStackChangedListener) {
        this.activityStackChangedlistener = activityStackChangedListener;
    }
}
