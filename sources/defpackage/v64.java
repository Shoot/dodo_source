package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FragmentStrictMode.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003.\u0005\"B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J0\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001eH\u0002J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002R\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lv64;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lv64$c;", "b", "", "previousFragmentId", "", "f", "Landroid/view/ViewGroup;", "container", "g", "k", Image.TYPE_HIGH, "", "isVisibleToUser", Image.TYPE_MEDIUM, "violatingFragment", "targetFragment", "", "requestCode", "l", "j", "i", "n", "Landroidx/fragment/app/strictmode/Violation;", "violation", e.a, "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "p", com.huawei.hms.opendevice.c.a, "Ljava/lang/Runnable;", "runnable", "o", "Lv64$c;", "getDefaultPolicy", "()Lv64$c;", "setDefaultPolicy", "(Lv64$c;)V", "defaultPolicy", "<init>", "()V", "a", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: v64  reason: default package */
/* loaded from: classes.dex */
public final class v64 {
    public static final v64 a = new v64();
    private static c b = c.d;

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lv64$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v64$a */
    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv64$b;", "", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v64$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0004BC\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012 \u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00150\b¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R4\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0019"}, d2 = {"Lv64$c;", "", "", "Lv64$a;", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "flags", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "b", "Ljava/util/Map;", com.huawei.hms.opendevice.c.a, "()Ljava/util/Map;", "mAllowedViolations", "Lv64$b;", "listener", "Lv64$b;", "()Lv64$b;", "", "allowedViolations", "<init>", "(Ljava/util/Set;Lv64$b;Ljava/util/Map;)V", "fragment_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v64$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final a c = new a(null);
        public static final c d;
        private final Set<a> a;
        private final Map<String, Set<Class<? extends Violation>>> b;

        /* compiled from: FragmentStrictMode.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lv64$c$a;", "", "Lv64$c;", "LAX", "Lv64$c;", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: v64$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            Set e;
            Map h;
            e = sfa.e();
            h = g86.h();
            d = new c(e, null, h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends Violation>>> map) {
            z65.h(set, "flags");
            z65.h(map, "allowedViolations");
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set<a> a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.b;
        }
    }

    private v64() {
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                z65.g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.F0() != null) {
                    c F0 = parentFragmentManager.F0();
                    z65.e(F0);
                    return F0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return b;
    }

    private final void c(c cVar, final Violation violation) {
        Fragment a2 = violation.a();
        final String name = a2.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            o(a2, new Runnable() { // from class: u64
                @Override // java.lang.Runnable
                public final void run() {
                    v64.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        z65.h(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.a().getClass().getName(), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Fragment fragment, String str) {
        z65.h(fragment, "fragment");
        z65.h(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        v64 v64Var = a;
        v64Var.e(fragmentReuseViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_FRAGMENT_REUSE) && v64Var.p(b2, fragment.getClass(), fragmentReuseViolation.getClass())) {
            v64Var.c(b2, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        z65.h(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        v64 v64Var = a;
        v64Var.e(fragmentTagUsageViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && v64Var.p(b2, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            v64Var.c(b2, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Fragment fragment) {
        z65.h(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        v64 v64Var = a;
        v64Var.e(getRetainInstanceUsageViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && v64Var.p(b2, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            v64Var.c(b2, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Fragment fragment) {
        z65.h(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        v64 v64Var = a;
        v64Var.e(getTargetFragmentRequestCodeUsageViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && v64Var.p(b2, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            v64Var.c(b2, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Fragment fragment) {
        z65.h(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        v64 v64Var = a;
        v64Var.e(getTargetFragmentUsageViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && v64Var.p(b2, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            v64Var.c(b2, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(Fragment fragment) {
        z65.h(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        v64 v64Var = a;
        v64Var.e(setRetainInstanceUsageViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && v64Var.p(b2, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            v64Var.c(b2, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(Fragment fragment, Fragment fragment2, int i) {
        z65.h(fragment, "violatingFragment");
        z65.h(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        v64 v64Var = a;
        v64Var.e(setTargetFragmentUsageViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && v64Var.p(b2, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            v64Var.c(b2, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(Fragment fragment, boolean z) {
        z65.h(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        v64 v64Var = a;
        v64Var.e(setUserVisibleHintViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && v64Var.p(b2, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            v64Var.c(b2, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(Fragment fragment, ViewGroup viewGroup) {
        z65.h(fragment, "fragment");
        z65.h(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        v64 v64Var = a;
        v64Var.e(wrongFragmentContainerViolation);
        c b2 = v64Var.b(fragment);
        if (b2.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && v64Var.p(b2, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            v64Var.c(b2, wrongFragmentContainerViolation);
        }
    }

    private final void o(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler g = fragment.getParentFragmentManager().z0().g();
            z65.g(g, "fragment.parentFragmentManager.host.handler");
            if (z65.c(g.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                g.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean p(c cVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        boolean Q;
        Set<Class<? extends Violation>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!z65.c(cls2.getSuperclass(), Violation.class)) {
            Q = sc1.Q(set, cls2.getSuperclass());
            if (Q) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
