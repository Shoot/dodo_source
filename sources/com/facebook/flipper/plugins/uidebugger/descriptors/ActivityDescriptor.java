package com.facebook.flipper.plugins.uidebugger.descriptors;

import android.app.Activity;
import android.view.Window;
import com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ActivityDescriptor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J&\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/descriptors/ActivityDescriptor;", "Lcom/facebook/flipper/plugins/uidebugger/descriptors/AbstractChainedDescriptor;", "Landroid/app/Activity;", "()V", "getFragments", "", "", "compat", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;", "activity", "onGetChildren", "", "children", "", "onGetData", "builder", "", "", "onGetId", "onGetName", "onInit", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityDescriptor extends AbstractChainedDescriptor<Activity> {
    private final List<Object> getFragments(FragmentCompat<?, ?, ?, ?> fragmentCompat, Activity activity) {
        List<Object> l;
        if (fragmentCompat == null) {
            l = kc1.l();
            return l;
        }
        return fragmentCompat.getFragments(activity);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetChildren(Activity activity, List list) {
        onGetChildren2(activity, (List<Object>) list);
    }

    /* renamed from: onGetData  reason: avoid collision after fix types in other method */
    public void onGetData2(Activity activity, Map<String, Object> map) {
        z65.h(activity, "activity");
        z65.h(map, "builder");
    }

    /* renamed from: onGetChildren  reason: avoid collision after fix types in other method */
    public void onGetChildren2(Activity activity, List<Object> list) {
        z65.h(activity, "activity");
        z65.h(list, "children");
        if (activity.getWindow() != null) {
            Window window = activity.getWindow();
            z65.g(window, "activity.window");
            list.add(window);
        }
        for (Object obj : getFragments(FragmentCompat.Companion.getSupportInstance(), activity)) {
            list.add(obj);
        }
        for (Object obj2 : getFragments(FragmentCompat.Companion.getFrameworkInstance(), activity)) {
            list.add(obj2);
        }
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public /* bridge */ /* synthetic */ void onGetData(Activity activity, Map map) {
        onGetData2(activity, (Map<String, Object>) map);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetId(Activity activity) {
        z65.h(activity, "activity");
        String num = Integer.toString(System.identityHashCode(activity));
        z65.g(num, "toString(System.identityHashCode(activity))");
        return num;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public String onGetName(Activity activity) {
        z65.h(activity, "activity");
        String simpleName = activity.getClass().getSimpleName();
        z65.g(simpleName, "activity.javaClass.simpleName");
        return simpleName;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.descriptors.AbstractChainedDescriptor
    public void onInit() {
    }
}
