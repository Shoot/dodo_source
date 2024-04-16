package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: wrappers.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0001\u001a\"\u0010\r\u001a\u00020\n*\u00020\u00072\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/p;", "", "containerViewId", "Lvm9;", "data", "themeResId", "a", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function1;", "", "", "Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalFormAvailabilityListener;", "listener", "b", "controlling_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: x8c  reason: default package */
/* loaded from: classes.dex */
public final class x8c {
    public static final p a(p pVar, int i, vm9 vm9Var, int i2) {
        z65.h(pVar, "<this>");
        z65.h(vm9Var, "data");
        p w = pVar.w(i, xm9.class, xm9.g.b(vm9Var, i2), null);
        z65.g(w, "replace(containerViewId, F::class.java, args, tag)");
        return w;
    }

    public static final void b(Fragment fragment, Function1<? super Boolean, Unit> function1) {
        z65.h(fragment, "<this>");
        z65.h(function1, "listener");
        xm9.g.d(fragment, function1);
    }
}
