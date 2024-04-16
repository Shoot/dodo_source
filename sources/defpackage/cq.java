package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ApplyedPromoOfferRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcq;", "Lbq;", "Lw18;", "a", "Lop8;", DateTokenConverter.CONVERTER_KEY, "action", "", "b", "", c.a, "Lzz7;", "personalOffer", e.a, "Lk63;", "Lk63;", "getDomainEvents", "()Lk63;", "domainEvents", "Lo63;", "Lo63;", "getDomainState", "()Lo63;", "domainState", "Lw18;", "promoAction", "<init>", "(Lk63;Lo63;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cq  reason: default package */
/* loaded from: classes4.dex */
public final class cq implements bq {
    private final k63 a;
    private final o63 b;
    private w18 c;

    public cq(k63 k63Var, o63 o63Var) {
        z65.h(k63Var, "domainEvents");
        z65.h(o63Var, "domainState");
        this.a = k63Var;
        this.b = o63Var;
        this.c = w18.h.a();
    }

    @Override // defpackage.bq
    public w18 a() {
        return this.c;
    }

    @Override // defpackage.bq
    public void b(w18 w18Var) {
        z65.h(w18Var, "action");
        if (!z65.c(this.c, w18Var)) {
            this.c = w18Var;
            this.a.b(j63.b);
        }
    }

    @Override // defpackage.bq
    public boolean c() {
        if ((a().d().length() > 0 && a().h()) || d().d().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bq
    public op8 d() {
        return this.b.a();
    }

    @Override // defpackage.bq
    public boolean e(zz7 zz7Var) {
        z65.h(zz7Var, "personalOffer");
        if (!z65.c(d().d(), zz7Var.l()) && (!z65.c(a().d(), zz7Var.f()) || !a().h())) {
            return false;
        }
        return true;
    }
}
