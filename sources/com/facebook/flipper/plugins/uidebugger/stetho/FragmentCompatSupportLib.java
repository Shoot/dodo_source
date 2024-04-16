package com.facebook.flipper.plugins.uidebugger.stetho;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FragmentCompatSupportLib.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 $2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004$%&'B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006("}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/c;", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/d;", "fragmentManager", "Landroid/view/View;", "view", "", "findFragmentForViewInFragmentManager", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentAccessorSupportLib;", "forFragment", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$DialogFragmentAccessorSupportLib;", "forDialogFragment", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentManagerAccessor;", "forFragmentManager", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentActivityAccessorSupportLib;", "forFragmentActivity", "Landroid/app/Activity;", "activity", "", "getFragments", "findFragmentForViewInActivity", "fragment", "findFragmentForViewInFragment", "Ljava/lang/Class;", "getFragmentClass", "()Ljava/lang/Class;", "fragmentClass", "getDialogFragmentClass", "dialogFragmentClass", "getFragmentActivityClass", "fragmentActivityClass", "<init>", "()V", "Companion", "DialogFragmentAccessorSupportLib", "FragmentAccessorSupportLib", "FragmentActivityAccessorSupportLib", "android_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class FragmentCompatSupportLib extends FragmentCompat<Fragment, c, FragmentManager, d> {
    public static final Companion Companion = new Companion(null);
    private static final FragmentAccessorSupportLib fragmentAccessor = new FragmentAccessorSupportLib();
    private static final DialogFragmentAccessorSupportLib dialogFragmentAccessor = new DialogFragmentAccessorSupportLib();
    private static final FragmentCompat.FragmentManagerAccessorViaReflection<FragmentManager, Fragment> fragmentManagerAccessor = new FragmentCompat.FragmentManagerAccessorViaReflection<>();
    private static final FragmentActivityAccessorSupportLib fragmentActivityAccessor = new FragmentActivityAccessorSupportLib();

    /* compiled from: FragmentCompatSupportLib.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$Companion;", "", "()V", "dialogFragmentAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$DialogFragmentAccessorSupportLib;", "fragmentAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentAccessorSupportLib;", "fragmentActivityAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentActivityAccessorSupportLib;", "fragmentManagerAccessor", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat$FragmentManagerAccessorViaReflection;", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/Fragment;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FragmentCompatSupportLib.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$DialogFragmentAccessorSupportLib;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentAccessorSupportLib;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/DialogFragmentAccessor;", "Landroidx/fragment/app/c;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "dialogFragment", "Landroid/app/Dialog;", "getDialog", "<init>", "()V", "android_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class DialogFragmentAccessorSupportLib extends FragmentAccessorSupportLib implements DialogFragmentAccessor<c, Fragment, FragmentManager> {
        @Override // com.facebook.flipper.plugins.uidebugger.stetho.DialogFragmentAccessor
        public Dialog getDialog(c cVar) {
            z65.h(cVar, "dialogFragment");
            return cVar.getDialog();
        }
    }

    /* compiled from: FragmentCompatSupportLib.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentAccessorSupportLib;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "()V", "getChildFragmentManager", "fragment", "getFragmentManager", "getId", "", "getResources", "Landroid/content/res/Resources;", "getTag", "", "getView", "Landroid/view/View;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static class FragmentAccessorSupportLib implements FragmentAccessor<Fragment, FragmentManager> {
        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getChildFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getChildFragmentManager();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public FragmentManager getFragmentManager(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getFragmentManager();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public int getId(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getId();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public Resources getResources(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getResources();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public String getTag(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getTag();
        }

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentAccessor
        public View getView(Fragment fragment) {
            z65.h(fragment, "fragment");
            return fragment.getView();
        }
    }

    /* compiled from: FragmentCompatSupportLib.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompatSupportLib$FragmentActivityAccessorSupportLib;", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentActivityAccessor;", "Landroidx/fragment/app/d;", "Landroidx/fragment/app/FragmentManager;", "activity", "getFragmentManager", "<init>", "()V", "android_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class FragmentActivityAccessorSupportLib implements FragmentActivityAccessor<d, FragmentManager> {
        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentActivityAccessor
        public FragmentManager getFragmentManager(d dVar) {
            z65.h(dVar, "activity");
            return dVar.getSupportFragmentManager();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object findFragmentForViewInFragmentManager(androidx.fragment.app.FragmentManager r6, android.view.View r7) {
        /*
            r5 = this;
            com.facebook.flipper.plugins.uidebugger.stetho.FragmentManagerAccessor r0 = r5.forFragmentManager()
            r1 = 0
            if (r0 != 0) goto L8
            goto Le
        L8:
            java.util.List r6 = r0.getAddedFragments(r6)     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
        Le:
            r6 = r1
        Lf:
            if (r6 == 0) goto L2c
            int r0 = r6.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2c
            r2 = 0
        L1a:
            int r3 = r2 + 1
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r4 = r5.findFragmentForViewInFragment(r4, r7)
            if (r4 == 0) goto L27
            return r4
        L27:
            if (r2 != r0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L1a
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompatSupportLib.findFragmentForViewInFragmentManager(androidx.fragment.app.FragmentManager, android.view.View):java.lang.Object");
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Object findFragmentForViewInActivity(Activity activity, View view) {
        FragmentManager fragmentManager;
        z65.h(activity, "activity");
        z65.h(view, "view");
        if (!getFragmentActivityClass().isInstance(activity)) {
            return null;
        }
        FragmentActivityAccessor<d, FragmentManager> forFragmentActivity = forFragmentActivity();
        if (forFragmentActivity == null) {
            fragmentManager = null;
        } else {
            fragmentManager = forFragmentActivity.getFragmentManager((d) activity);
        }
        if (fragmentManager == null) {
            return null;
        }
        return findFragmentForViewInFragmentManager(fragmentManager, view);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Object findFragmentForViewInFragment(Object obj, View view) {
        FragmentAccessor<Fragment, FragmentManager> forFragment;
        z65.h(obj, "fragment");
        z65.h(view, "view");
        if (!getFragmentClass().isInstance(obj) || (forFragment = forFragment()) == null) {
            return null;
        }
        Fragment fragment = (Fragment) obj;
        if (forFragment.getView(fragment) == view) {
            return obj;
        }
        FragmentManager childFragmentManager = forFragment.getChildFragmentManager(fragment);
        if (childFragmentManager == null) {
            return null;
        }
        return findFragmentForViewInFragmentManager(childFragmentManager, view);
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public DialogFragmentAccessor<c, Fragment, FragmentManager> forDialogFragment() {
        return dialogFragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public FragmentAccessor<Fragment, FragmentManager> forFragment() {
        return fragmentAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public FragmentActivityAccessor<d, FragmentManager> forFragmentActivity() {
        return fragmentActivityAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager() {
        return fragmentManagerAccessor;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Class<c> getDialogFragmentClass() {
        return c.class;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Class<d> getFragmentActivityClass() {
        return d.class;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public Class<Fragment> getFragmentClass() {
        return Fragment.class;
    }

    @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat
    public List<Object> getFragments(Activity activity) {
        FragmentManager fragmentManager;
        List<Object> l;
        List<Object> l2;
        List<Object> l3;
        z65.h(activity, "activity");
        if (!getFragmentActivityClass().isInstance(activity)) {
            l3 = kc1.l();
            return l3;
        }
        FragmentActivityAccessor<d, FragmentManager> forFragmentActivity = forFragmentActivity();
        List<Fragment> list = null;
        if (forFragmentActivity == null) {
            fragmentManager = null;
        } else {
            fragmentManager = forFragmentActivity.getFragmentManager((d) activity);
        }
        if (fragmentManager == null) {
            l2 = kc1.l();
            return l2;
        }
        FragmentManagerAccessor<FragmentManager, Fragment> forFragmentManager = forFragmentManager();
        if (forFragmentManager != null) {
            try {
                list = forFragmentManager.getAddedFragments(fragmentManager);
            } catch (Exception unused) {
            }
        }
        if (list == null) {
            l = kc1.l();
            return l;
        }
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Fragment fragment = list.get(i);
                Class<c> dialogFragmentClass = getDialogFragmentClass();
                if (dialogFragmentClass != null) {
                    arrayList.add(Boolean.valueOf(dialogFragmentClass.isInstance(fragment)));
                }
                if (i == size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}
