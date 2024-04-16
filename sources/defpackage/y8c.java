package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import com.huawei.hms.opendevice.c;
import defpackage.y08;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: wrappers.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a.\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\r"}, d2 = {"Landroidx/fragment/app/Fragment;", "parentFragment", "", "containerViewId", "Lo08;", "personalOffersData", "Lkotlin/Function0;", "", "emptyStateListener", "a", c.a, "Ly08;", "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: y8c  reason: default package */
/* loaded from: classes2.dex */
public final class y8c {
    public static final void a(Fragment fragment, int i, o08 o08Var, Function0<Unit> function0) {
        z65.h(fragment, "parentFragment");
        z65.h(o08Var, "personalOffersData");
        z65.h(function0, "emptyStateListener");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.l0("personal_offers_fragment") == null) {
            p p = childFragmentManager.p();
            z65.g(p, "beginTransaction()");
            p.c(i, b(o08Var, fragment, function0), "personal_offers_fragment");
            p.n();
        }
    }

    private static final y08 b(o08 o08Var, Fragment fragment, Function0<Unit> function0) {
        y08.a aVar = y08.s;
        return aVar.g(aVar.f(aVar.d(o08Var)), fragment, function0);
    }

    public static final void c(Fragment fragment, int i, o08 o08Var, Function0<Unit> function0) {
        z65.h(fragment, "parentFragment");
        z65.h(o08Var, "personalOffersData");
        z65.h(function0, "emptyStateListener");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.l0("personal_offers_fragment") != null) {
            p p = childFragmentManager.p();
            z65.g(p, "beginTransaction()");
            p.v(i, b(o08Var, fragment, function0), "personal_offers_fragment");
            p.n();
        }
    }
}
