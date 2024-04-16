package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.cj6;
import kotlin.Metadata;
/* compiled from: MinDeliveryPriceInfoProvider.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0018"}, d2 = {"Lej6;", "", "Lqz2;", "deliveryPrice", "Lcj6$b;", "a", "Lhn6;", "minDeliveryPrice", "Llia;", "shoppingCart", c.a, "Lcj6;", "b", "Lcs0;", "Lcs0;", "cartRepository", "Lfq0;", "Lfq0;", "cartContentService", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lcs0;Lfq0;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ej6  reason: default package */
/* loaded from: classes4.dex */
public final class ej6 {
    private final cs0 a;
    private final fq0 b;
    private final hq3 c;

    public ej6(cs0 cs0Var, fq0 fq0Var, hq3 hq3Var) {
        z65.h(cs0Var, "cartRepository");
        z65.h(fq0Var, "cartContentService");
        z65.h(hq3Var, "featureService");
        this.a = cs0Var;
        this.b = fq0Var;
        this.c = hq3Var;
    }

    private final cj6.b a(qz2 qz2Var) {
        hn6 d;
        if (qz2Var.a().e()) {
            d = qz2Var.a();
        } else {
            d = qz2Var.d();
        }
        hn6 hn6Var = d;
        return new cj6.b(qz2Var.d(), hn6Var, qz2Var.d(), qz2Var.a(), qz2Var.c(), qz2Var.a().e(), c(hn6Var, this.b.a()), qz2Var.e(), qz2Var.b());
    }

    private final hn6 c(hn6 hn6Var, lia liaVar) {
        if (this.c.a(bq3.E6)) {
            return rn6.d(hn6Var, liaVar.h());
        }
        if (this.c.a(bq3.p5)) {
            return rn6.d(hn6Var, liaVar.i());
        }
        return rn6.d(hn6Var, liaVar.j());
    }

    public final cj6 b() {
        if (!this.c.a(bq3.g6)) {
            hn6 c = c(this.a.c(), this.b.a());
            if (c.e()) {
                return new cj6.d(c);
            }
            return cj6.c.b;
        }
        return a(this.a.d());
    }
}
