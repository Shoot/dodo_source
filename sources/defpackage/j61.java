package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import defpackage.bq0;
import defpackage.nk9;
import defpackage.ou2;
import defpackage.uu2;
import defpackage.wo7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: CheckoutStateMapper.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0002H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J$\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0013"}, d2 = {"Lj61;", "", "Lwk7;", "", "b", "Lw6;", "a", "Lwo7;", "Lxo7;", DateTokenConverter.CONVERTER_KEY, "Lb61;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "clientName", "Lhn6;", "cashNotes", "Ls51;", c.a, "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j61  reason: default package */
/* loaded from: classes4.dex */
public final class j61 {
    public static final j61 a = new j61();

    private j61() {
    }

    private final w6 a(wk7 wk7Var) {
        ou2 e;
        if (!(wk7Var instanceof uu2.a.C0694a)) {
            wk7Var = null;
        }
        uu2.a.C0694a c0694a = (uu2.a.C0694a) wk7Var;
        if (c0694a == null || (e = c0694a.e()) == null) {
            return null;
        }
        if (!(e instanceof ou2.b)) {
            e = null;
        }
        ou2.b bVar = (ou2.b) e;
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    private final String b(wk7 wk7Var) {
        if (wk7Var instanceof bq0.a.C0072a) {
            return ((bq0.a.C0072a) wk7Var).e().getId();
        }
        if (wk7Var instanceof nk9.b.a) {
            return ((nk9.b.a) wk7Var).e().getId();
        }
        return null;
    }

    private final xo7 d(wo7 wo7Var) {
        if (wo7Var instanceof wo7.a) {
            return xo7.c;
        }
        if (wo7Var instanceof wo7.b) {
            if (((wo7.b) wo7Var).g()) {
                return xo7.b;
            }
            return xo7.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final s51 c(b61 b61Var, String str, String str2, hn6 hn6Var) {
        z65.h(b61Var, "<this>");
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "clientName");
        hx2 hx2Var = new hx2(k61.a(b61Var.k()), a(b61Var.k()), b(b61Var.k()), b61Var.e().a(), b61Var.m().R(), b61Var.m().g0(), d(b61Var.l()));
        jw7 a2 = b61Var.n().a();
        if (a2 != null) {
            return new s51(str, str2, hx2Var, new ct7(a2, hn6Var));
        }
        throw new IllegalArgumentException("Payment way should be defined".toString());
    }
}
