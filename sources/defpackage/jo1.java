package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001aK\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0007*\u00020\u0006\"\b\b\u0001\u0010\b*\u00020\u0006*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lwp;", "applier", "Ldo1;", "parent", "Lco1;", "a", "", "K", "V", "Lkt4;", "Llt4;", Action.KEY_ATTRIBUTE, "value", "", DateTokenConverter.CONVERTER_KEY, "(Lkt4;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "PendingApplyNoModifications", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: jo1 */
/* loaded from: classes.dex */
public final class jo1 {
    private static final Object a = new Object();

    public static final co1 a(wp<?> wpVar, do1 do1Var) {
        z65.h(wpVar, "applier");
        z65.h(do1Var, "parent");
        return new io1(do1Var, wpVar, null, 4, null);
    }

    public static final /* synthetic */ void b(kt4 kt4Var, Object obj, Object obj2) {
        d(kt4Var, obj, obj2);
    }

    public static final /* synthetic */ Object c() {
        return a;
    }

    public static final <K, V> void d(kt4<K, lt4<V>> kt4Var, K k, V v) {
        if (kt4Var.c(k)) {
            lt4<V> f = kt4Var.f(k);
            if (f != null) {
                f.add(v);
                return;
            }
            return;
        }
        lt4<V> lt4Var = new lt4<>();
        lt4Var.add(v);
        Unit unit = Unit.a;
        kt4Var.l(k, lt4Var);
    }
}
