package com.facebook.flipper.plugins.uidebugger.stetho;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FragmentCompat.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b'\u0018\u0000  *\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\b\b\u0003\u0010\u0004*\u00020\u00052\u00020\u0006:\u0002 !B\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H&J\u001c\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0017H&J\u0016\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0019H&J\u0016\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001bH&J\u0016\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\u0006\u0010\u0011\u001a\u00020\u0005H&R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0003\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;", "FRAGMENT", "DIALOG_FRAGMENT", "FRAGMENT_MANAGER", "FRAGMENT_ACTIVITY", "Landroid/app/Activity;", "", "()V", "dialogFragmentClass", "Ljava/lang/Class;", "getDialogFragmentClass", "()Ljava/lang/Class;", "fragmentActivityClass", "getFragmentActivityClass", "fragmentClass", "getFragmentClass", "findFragmentForViewInActivity", "activity", "view", "Landroid/view/View;", "findFragmentForViewInFragment", "fragment", "forDialogFragment", "Lcom/facebook/flipper/plugins/uidebugger/stetho/DialogFragmentAccessor;", "forFragment", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentAccessor;", "forFragmentActivity", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentActivityAccessor;", "forFragmentManager", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentManagerAccessor;", "getFragments", "", "Companion", "FragmentManagerAccessorViaReflection", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FragmentCompat<FRAGMENT, DIALOG_FRAGMENT, FRAGMENT_MANAGER, FRAGMENT_ACTIVITY extends Activity> {
    public static final Companion Companion = new Companion(null);
    private static FragmentCompat<?, ?, ?, ?> frameworkInstance;
    private static boolean hasSupportFragment;
    private static FragmentCompat<?, ?, ?, ?> supportInstance;

    /* compiled from: FragmentCompat.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0001R.\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u000b\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat$Companion;", "", "()V", "frameworkInstance", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;", "getFrameworkInstance", "()Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;", "setFrameworkInstance", "(Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat;)V", "hasSupportFragment", "", "supportInstance", "getSupportInstance", "setSupportInstance", "findFragmentForView", "view", "Landroid/view/View;", "findFragmentForViewInActivity", "activity", "Landroid/app/Activity;", "isDialogFragment", "fragment", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object findFragmentForViewInActivity(Activity activity, View view) {
            Object findFragmentForViewInActivity;
            Class<?> fragmentActivityClass;
            Object findFragmentForViewInActivity2;
            FragmentCompat<?, ?, ?, ?> supportInstance = getSupportInstance();
            if (supportInstance != null && (fragmentActivityClass = supportInstance.getFragmentActivityClass()) != null && fragmentActivityClass.isInstance(activity) && (findFragmentForViewInActivity2 = supportInstance.findFragmentForViewInActivity(activity, view)) != null) {
                return findFragmentForViewInActivity2;
            }
            FragmentCompat<?, ?, ?, ?> frameworkInstance = getFrameworkInstance();
            if (frameworkInstance != null && (findFragmentForViewInActivity = frameworkInstance.findFragmentForViewInActivity(activity, view)) != null) {
                return findFragmentForViewInActivity;
            }
            return null;
        }

        public final Object findFragmentForView(View view) {
            z65.h(view, "view");
            Activity tryGetActivity = ViewUtil.INSTANCE.tryGetActivity(view);
            if (tryGetActivity == null) {
                return null;
            }
            return findFragmentForViewInActivity(tryGetActivity, view);
        }

        public final FragmentCompat<?, ?, ?, ?> getFrameworkInstance() {
            if (FragmentCompat.frameworkInstance == null) {
                FragmentCompat.frameworkInstance = new FragmentCompatFramework();
            }
            return FragmentCompat.frameworkInstance;
        }

        public final FragmentCompat<?, ?, ?, ?> getSupportInstance() {
            if (FragmentCompat.supportInstance == null && FragmentCompat.hasSupportFragment) {
                FragmentCompat.supportInstance = new FragmentCompatSupportLib();
            }
            return FragmentCompat.supportInstance;
        }

        public final boolean isDialogFragment(Object obj) {
            Class<?> dialogFragmentClass;
            Class<?> dialogFragmentClass2;
            z65.h(obj, "fragment");
            FragmentCompat<?, ?, ?, ?> supportInstance = getSupportInstance();
            if (supportInstance != null && (dialogFragmentClass2 = supportInstance.getDialogFragmentClass()) != null && dialogFragmentClass2.isInstance(obj)) {
                return true;
            }
            FragmentCompat<?, ?, ?, ?> frameworkInstance = getFrameworkInstance();
            if (frameworkInstance != null && (dialogFragmentClass = frameworkInstance.getDialogFragmentClass()) != null && dialogFragmentClass.isInstance(obj)) {
                return true;
            }
            return false;
        }

        public final void setFrameworkInstance(FragmentCompat<?, ?, ?, ?> fragmentCompat) {
            FragmentCompat.frameworkInstance = fragmentCompat;
        }

        public final void setSupportInstance(FragmentCompat<?, ?, ?, ?> fragmentCompat) {
            FragmentCompat.supportInstance = fragmentCompat;
        }
    }

    /* compiled from: FragmentCompat.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000*\u0004\b\u0004\u0010\u0001*\u0004\b\u0005\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00050\b2\u0006\u0010\t\u001a\u00028\u0004H\u0016¢\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentCompat$FragmentManagerAccessorViaReflection;", "FRAGMENT_MANAGER", "FRAGMENT", "Lcom/facebook/flipper/plugins/uidebugger/stetho/FragmentManagerAccessor;", "()V", "fieldMAdded", "Ljava/lang/reflect/Field;", "getAddedFragments", "", "fragmentManager", "(Ljava/lang/Object;)Ljava/util/List;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class FragmentManagerAccessorViaReflection<FRAGMENT_MANAGER, FRAGMENT> implements FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
        private Field fieldMAdded;

        @Override // com.facebook.flipper.plugins.uidebugger.stetho.FragmentManagerAccessor
        public List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragment_manager) {
            List<FRAGMENT> l;
            Field declaredField;
            if (this.fieldMAdded == null && fragment_manager != null && (declaredField = fragment_manager.getClass().getDeclaredField("mAdded")) != null) {
                declaredField.setAccessible(true);
                this.fieldMAdded = declaredField;
            }
            Field field = this.fieldMAdded;
            if (field == null) {
                l = kc1.l();
                return l;
            }
            ReflectionUtil reflectionUtil = ReflectionUtil.INSTANCE;
            try {
                Object obj = field.get(fragment_manager);
                if (obj != null) {
                    return (List) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<FRAGMENT of com.facebook.flipper.plugins.uidebugger.stetho.FragmentCompat.FragmentManagerAccessorViaReflection.getAddedFragments$lambda-1>");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        boolean z;
        Object obj = null;
        ReflectionUtil reflectionUtil = ReflectionUtil.INSTANCE;
        try {
            int i = Fragment.a;
            obj = Fragment.class;
        } catch (ClassNotFoundException unused) {
        }
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        hasSupportFragment = z;
    }

    public abstract Object findFragmentForViewInActivity(Activity activity, View view);

    public abstract Object findFragmentForViewInFragment(Object obj, View view);

    public abstract DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> forDialogFragment();

    public abstract FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> forFragment();

    public abstract FragmentActivityAccessor<FRAGMENT_ACTIVITY, FRAGMENT_MANAGER> forFragmentActivity();

    public abstract FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> forFragmentManager();

    public abstract Class<DIALOG_FRAGMENT> getDialogFragmentClass();

    public abstract Class<FRAGMENT_ACTIVITY> getFragmentActivityClass();

    public abstract Class<FRAGMENT> getFragmentClass();

    public abstract List<Object> getFragments(Activity activity);
}
