package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.bq0;
import defpackage.nk9;
import defpackage.ou2;
import defpackage.uu2;
import kotlin.Metadata;
/* compiled from: OrderTypeState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\"\u0017\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwk7;", "Le91;", c.a, "", "b", "Ld88;", "a", "(Lwk7;)Ld88;", "pizzeria", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: yk7  reason: default package */
/* loaded from: classes4.dex */
public final class yk7 {
    public static final d88 a(wk7 wk7Var) {
        z65.h(wk7Var, "<this>");
        if (wk7Var instanceof bq0.a) {
            return ((bq0.a) wk7Var).e();
        }
        if (wk7Var instanceof nk9.b) {
            return ((nk9.b) wk7Var).e();
        }
        return null;
    }

    public static final boolean b(wk7 wk7Var) {
        z65.h(wk7Var, "<this>");
        e91 c = c(wk7Var);
        if (c != null) {
            return c.d();
        }
        return false;
    }

    public static final e91 c(wk7 wk7Var) {
        ou2 e;
        z65.h(wk7Var, "<this>");
        if (!(wk7Var instanceof uu2.a)) {
            wk7Var = null;
        }
        uu2.a aVar = (uu2.a) wk7Var;
        if (aVar == null || (e = aVar.e()) == null) {
            return null;
        }
        if (!(e instanceof ou2.c)) {
            e = null;
        }
        ou2.c cVar = (ou2.c) e;
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }
}
