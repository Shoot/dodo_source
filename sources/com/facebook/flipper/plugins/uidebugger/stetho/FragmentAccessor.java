package com.facebook.flipper.plugins.uidebugger.stetho;

import android.content.res.Resources;
import android.view.View;
import kotlin.Metadata;
/* compiled from: FragmentAccessor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0014J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "FRAGMENT", "FRAGMENT_MANAGER", "", "getChildFragmentManager", "fragment", "(Ljava/lang/Object;)Ljava/lang/Object;", "getFragmentManager", "getId", "", "(Ljava/lang/Object;)I", "getResources", "Landroid/content/res/Resources;", "(Ljava/lang/Object;)Landroid/content/res/Resources;", "getTag", "", "(Ljava/lang/Object;)Ljava/lang/String;", "getView", "Landroid/view/View;", "(Ljava/lang/Object;)Landroid/view/View;", "Companion", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NO_ID = 0;

    /* compiled from: FragmentAccessor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor$Companion;", "", "()V", "NO_ID", "", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NO_ID = 0;

        private Companion() {
        }
    }

    FRAGMENT_MANAGER getChildFragmentManager(FRAGMENT fragment);

    FRAGMENT_MANAGER getFragmentManager(FRAGMENT fragment);

    int getId(FRAGMENT fragment);

    Resources getResources(FRAGMENT fragment);

    String getTag(FRAGMENT fragment);

    View getView(FRAGMENT fragment);
}
