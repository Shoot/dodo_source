package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import defpackage.ey7;
import defpackage.py7;
import defpackage.zi9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PermissionImpl.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J/\u0010\u001e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lp64;", "Lny7;", "Lzi9;", "Lpy7;", "Ley7;", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "Lyi9;", "action", "Lfr6;", "ih", "", "requestCode", "", "hh", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "", "permissions", "Loz3;", "Ldy7;", "h5", "permission", "n7", "", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "b", "Lfr6;", "stateFlow", "<init>", "()V", com.huawei.hms.opendevice.c.a, "a", "permissions_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: p64  reason: default package */
/* loaded from: classes2.dex */
public final class p64 extends Fragment implements ny7, zi9, py7, ey7 {
    public static final a c = new a(null);
    private final fr6<yi9> b = mua.a(new yi9(null, 1, null));

    /* compiled from: PermissionImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lp64$a;", "", "", "PERMISSIONS_REQUEST_CODE", "I", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: p64$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PermissionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyi9;", "state", "a", "(Lyi9;)Lyi9;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: p64$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<yi9, yi9> {
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list) {
            super(1);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final yi9 invoke(yi9 yi9Var) {
            z65.h(yi9Var, "state");
            return p64.this.gh(yi9Var, this.b);
        }
    }

    /* compiled from: PermissionImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: p64$c */
    /* loaded from: classes2.dex */
    /* synthetic */ class c extends m94 implements Function2<yi9, List<? extends String>, List<? extends dy7>> {
        public static final c a = new c();

        c() {
            super(2, yi9.class, "findRequestedPermissions", "findRequestedPermissions(Ljava/util/List;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final List<dy7> invoke(yi9 yi9Var, List<String> list) {
            z65.h(yi9Var, "p0");
            z65.h(list, "p1");
            return yi9Var.b(list);
        }
    }

    /* compiled from: PermissionImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: p64$d */
    /* loaded from: classes2.dex */
    /* synthetic */ class d extends m94 implements Function1<List<? extends dy7>, oz3<? extends dy7>> {
        public static final d a = new d();

        d() {
            super(1, wz3.class, "asFlow", "asFlow(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/Flow;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final oz3<dy7> invoke(List<dy7> list) {
            z65.h(list, "p0");
            return wz3.a(list);
        }
    }

    /* compiled from: PermissionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyi9;", "mutator", "a", "(Lyi9;)Lyi9;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: p64$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<yi9, yi9> {
        final /* synthetic */ String[] b;
        final /* synthetic */ int[] c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PermissionImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "permission", "Lry7;", "a", "(Ljava/lang/String;)Lry7;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: p64$e$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<String, ry7> {
            final /* synthetic */ p64 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p64 p64Var) {
                super(1);
                this.a = p64Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final ry7 invoke(String str) {
                z65.h(str, "permission");
                p64 p64Var = this.a;
                androidx.fragment.app.d requireActivity = p64Var.requireActivity();
                z65.g(requireActivity, "requireActivity()");
                return p64Var.Pb(requireActivity, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String[] strArr, int[] iArr) {
            super(1);
            this.b = strArr;
            this.c = iArr;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final yi9 invoke(yi9 yi9Var) {
            z65.h(yi9Var, "mutator");
            p64 p64Var = p64.this;
            return p64Var.lh(yi9Var, this.b, this.c, new a(p64Var));
        }
    }

    private final boolean hh(int i) {
        if (i == 42) {
            return true;
        }
        return false;
    }

    private final fr6<yi9> ih(Function1<? super yi9, yi9> function1) {
        fr6<yi9> fr6Var = this.b;
        fr6Var.setValue(function1.invoke(fr6Var.getValue()));
        return fr6Var;
    }

    @Override // defpackage.ey7
    public ry7 Pb(Activity activity, String str) {
        return ey7.b.a(this, activity, str);
    }

    @Override // defpackage.py7
    public boolean Rg(Context context, String str) {
        return py7.a.a(this, context, str);
    }

    @Override // defpackage.ey7
    public boolean Te(Activity activity, String str) {
        return ey7.b.c(this, activity, str);
    }

    public yi9 gh(yi9 yi9Var, List<String> list) {
        return zi9.a.b(this, yi9Var, list);
    }

    @Override // defpackage.ny7
    public oz3<dy7> h5(List<String> list) {
        z65.h(list, "permissions");
        requestPermissions((String[]) list.toArray(new String[0]), 42);
        return wz3.L(wz3.x(ih(new b(list)), e3b.a(blb.a(kr7.a(c.a, list), d.a))), list.size());
    }

    public void jh(Context context, String str, boolean z) {
        py7.a.c(this, context, str, z);
    }

    public void kh(Context context, String str) {
        py7.a.d(this, context, str);
    }

    public yi9 lh(yi9 yi9Var, String[] strArr, int[] iArr, Function1<? super String, ? extends ry7> function1) {
        return zi9.a.d(this, yi9Var, strArr, iArr, function1);
    }

    @Override // defpackage.ny7
    public dy7 n7(String str) {
        z65.h(str, "permission");
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity()");
        return new dy7(str, Pb(requireActivity, str), false, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        z65.h(strArr, "permissions");
        z65.h(iArr, "grantResults");
        for (String str : strArr) {
            Context requireContext = requireContext();
            z65.g(requireContext, "onRequestPermissionsResult$lambda$2$lambda$1");
            kh(requireContext, str);
            androidx.fragment.app.d requireActivity = requireActivity();
            z65.g(requireActivity, "requireActivity()");
            jh(requireContext, str, Te(requireActivity, str));
        }
        if (hh(i)) {
            ih(new e(strArr, iArr));
        }
    }

    @Override // defpackage.py7
    public boolean vc(Context context, String str) {
        return py7.a.b(this, context, str);
    }
}
