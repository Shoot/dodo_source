package defpackage;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: ViewTreeLifecycleOwner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lop5;", "lifecycleOwner", "", "b", "(Landroid/view/View;Lop5;)V", "a", "(Landroid/view/View;)Lop5;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: v0c  reason: default package */
/* loaded from: classes.dex */
public final class v0c {

    /* compiled from: ViewTreeLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "currentView", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v0c$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<View, View> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(View view) {
            z65.h(view, "currentView");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "viewParent", "Lop5;", "a", "(Landroid/view/View;)Lop5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v0c$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, op5> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final op5 invoke(View view) {
            z65.h(view, "viewParent");
            Object tag = view.getTag(ty8.a);
            if (tag instanceof op5) {
                return (op5) tag;
            }
            return null;
        }
    }

    public static final op5 a(View view) {
        Sequence e;
        Sequence r;
        Object m;
        z65.h(view, "<this>");
        e = bca.e(view, a.a);
        r = dca.r(e, b.a);
        m = dca.m(r);
        return (op5) m;
    }

    public static final void b(View view, op5 op5Var) {
        z65.h(view, "<this>");
        view.setTag(ty8.a, op5Var);
    }
}
