package com.facebook.flipper.plugins.uidebugger.stetho;

import kotlin.Metadata;
/* compiled from: FragmentActivityAccessor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentActivityAccessor;", "Activity", "FRAGMENT_MANAGER", "", "getFragmentManager", "activity", "(Ljava/lang/Object;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FragmentActivityAccessor<Activity, FRAGMENT_MANAGER> {
    FRAGMENT_MANAGER getFragmentManager(Activity activity);
}
