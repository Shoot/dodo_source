package com.facebook.flipper.plugins.uidebugger.stetho;

import java.util.List;
import kotlin.Metadata;
/* compiled from: FragmentManagerAccessor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentManagerAccessor;", "FRAGMENT_MANAGER", "FRAGMENT", "", "getAddedFragments", "", "fragmentManager", "(Ljava/lang/Object;)Ljava/util/List;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
    List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragment_manager);
}
