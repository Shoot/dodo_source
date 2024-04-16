package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.pja;
import defpackage.rq0;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CartItemDataFactoryImpl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0018"}, d2 = {"Ltq0;", "Lsq0;", "Lnq0;", "cartItem", "Lrq0$a;", "b", "", "shoppingItemId", e.a, "Lpja;", "shoppingData", "a", "cartItemId", "Lrq0$b;", c.a, "Lng4;", "goodModel", "Lrq0$c;", DateTokenConverter.CONVERTER_KEY, "Luja;", "Luja;", "shoppingItemRepository", "<init>", "(Luja;)V", "cart"}, k = 1, mv = {1, 9, 0})
/* renamed from: tq0  reason: default package */
/* loaded from: classes.dex */
public final class tq0 implements sq0 {
    private final uja a;

    public tq0(uja ujaVar) {
        z65.h(ujaVar, "shoppingItemRepository");
        this.a = ujaVar;
    }

    @Override // defpackage.sq0
    public rq0.a a(pja pjaVar) {
        z65.h(pjaVar, "shoppingData");
        return rq0.a.q.a(pjaVar);
    }

    @Override // defpackage.sq0
    public rq0.a b(nq0 nq0Var) {
        z65.h(nq0Var, "cartItem");
        String u = nq0Var.u();
        String k = nq0Var.k();
        hn6 h = nq0Var.h();
        String X = nq0Var.X();
        String id = nq0Var.m().getId();
        List<dq0> w0 = nq0Var.w0();
        List<mr0> z = nq0Var.z();
        qq0 I = nq0Var.I();
        return new rq0.a(u, k, nq0Var.f(), nq0Var.i(), nq0Var.n(), nq0Var.o(), h, X, id, nq0Var.v0(), w0, z, I, nq0Var.e(), 0, 16384, null);
    }

    @Override // defpackage.sq0
    public rq0.b c(String str, pja pjaVar) {
        z65.h(str, "cartItemId");
        z65.h(pjaVar, "shoppingData");
        return rq0.b.g.a(str, pjaVar);
    }

    @Override // defpackage.sq0
    public rq0.c d(ng4 ng4Var) {
        z65.h(ng4Var, "goodModel");
        return new rq0.c(ng4Var.a().j(), ng4Var.b());
    }

    @Override // defpackage.sq0
    public rq0.a e(String str) {
        z65.h(str, "shoppingItemId");
        tja a = this.a.a(str);
        if (a != null) {
            return a(new pja.d(a));
        }
        throw new IllegalArgumentException("ShoppingItem with id " + str + " not found");
    }
}
