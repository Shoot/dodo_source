package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.psb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: wrappers.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007\u001a<\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007\u001a4\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002\u001a4\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/Fragment;", "parentFragment", "", "containerViewId", "Lkotlin/Function0;", "", "emptyStateListener", "Lkotlin/Function1;", "", "onItemClickListener", "b", "a", "resultListener", "Lpsb;", c.a, DateTokenConverter.CONVERTER_KEY, "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: z8c  reason: default package */
/* loaded from: classes2.dex */
public final class z8c {
    public static final void a(Fragment fragment, int i, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        z65.h(fragment, "parentFragment");
        z65.h(function0, "emptyStateListener");
        z65.h(function1, "onItemClickListener");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.l0("upsale_fragment") == null) {
            p p = childFragmentManager.p();
            z65.g(p, "beginTransaction()");
            p.c(i, d(fragment, function0, function1), "upsale_fragment");
            p.n();
        }
    }

    public static final void b(Fragment fragment, int i, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        z65.h(fragment, "parentFragment");
        z65.h(function0, "emptyStateListener");
        z65.h(function1, "onItemClickListener");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.l0("upsale_fragment") == null) {
            p p = childFragmentManager.p();
            z65.g(p, "beginTransaction()");
            p.c(i, c(fragment, function0, function1), "upsale_fragment");
            p.n();
        }
    }

    private static final psb c(Fragment fragment, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        psb.a aVar = psb.j;
        return aVar.c(aVar.b(), fragment, function1, function0);
    }

    private static final psb d(Fragment fragment, Function0<Unit> function0, Function1<? super String, Unit> function1) {
        return psb.j.c(z05.n.a(), fragment, function1, function0);
    }
}
