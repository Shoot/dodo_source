package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ou2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: DeliverablePlaceFormatter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lqu2;", "Lpu2;", "Lou2$c;", "", e.a, "f", "Lou2;", "deliverablePlace", "a", c.a, "b", DateTokenConverter.CONVERTER_KEY, "Lh8;", "Lh8;", "addressFormatter", "Lly2;", "Lly2;", "deliveryLocationFormatter", "<init>", "(Lh8;Lly2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qu2  reason: default package */
/* loaded from: classes4.dex */
public final class qu2 implements pu2 {
    private final h8 a;
    private final ly2 b;

    public qu2(h8 h8Var, ly2 ly2Var) {
        z65.h(h8Var, "addressFormatter");
        z65.h(ly2Var, "deliveryLocationFormatter");
        this.a = h8Var;
        this.b = ly2Var;
    }

    private final String e(ou2.c cVar) {
        return this.b.a(cVar.b().c());
    }

    private final String f(ou2.c cVar) {
        String str = cVar.b().c().c().get(nx2.k.getValue());
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // defpackage.pu2
    public String a(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            return this.a.b(((ou2.b) ou2Var).b());
        }
        if (ou2Var instanceof ou2.c) {
            return e((ou2.c) ou2Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.pu2
    public String b(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            return this.a.a(((ou2.b) ou2Var).b());
        }
        if (ou2Var instanceof ou2.c) {
            return e((ou2.c) ou2Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.pu2
    public String c(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            return this.a.c(((ou2.b) ou2Var).b());
        }
        if (ou2Var instanceof ou2.c) {
            return e((ou2.c) ou2Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.pu2
    public String d(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            return ((ou2.b) ou2Var).b().f();
        }
        if (ou2Var instanceof ou2.c) {
            return f((ou2.c) ou2Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
