package defpackage;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Lnt9;", "owner", "", "b", "(Landroid/view/View;Lnt9;)V", "a", "(Landroid/view/View;)Lnt9;", "savedstate_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: x0c  reason: default package */
/* loaded from: classes.dex */
public final class x0c {

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0c$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<View, View> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(View view) {
            z65.h(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lnt9;", "a", "(Landroid/view/View;)Lnt9;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0c$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, nt9> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final nt9 invoke(View view) {
            z65.h(view, "view");
            Object tag = view.getTag(qx8.a);
            if (tag instanceof nt9) {
                return (nt9) tag;
            }
            return null;
        }
    }

    public static final nt9 a(View view) {
        Sequence e;
        Sequence r;
        Object m;
        z65.h(view, "<this>");
        e = bca.e(view, a.a);
        r = dca.r(e, b.a);
        m = dca.m(r);
        return (nt9) m;
    }

    public static final void b(View view, nt9 nt9Var) {
        z65.h(view, "<this>");
        view.setTag(qx8.a, nt9Var);
    }
}
