package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ViewItemAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0010"}, d2 = {"Lzi1;", "comboProduct", "Lhn6;", "price", "Lym$d;", "screen", "Ldc;", "b", "Lqd6;", "menuItem", "Lqd;", "sender", c.a, "Lod;", "analyticsProduct", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: lzb  reason: default package */
/* loaded from: classes4.dex */
public final class lzb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewItemAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lzb$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ od a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(od odVar, qd qdVar) {
            super(1);
            this.a = odVar;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "currency", this.a.b(), false, 4, null);
            bc.e(bcVar, "value", this.a.e(), false, 4, null);
            vc.z(bcVar, this.b);
            return nv3.c(bcVar, this.a);
        }
    }

    private static final dc a(od odVar, qd qdVar) {
        return ec.a("view_item", new a(odVar, qdVar));
    }

    public static final dc b(zi1 zi1Var, hn6 hn6Var, ym.d dVar) {
        z65.h(zi1Var, "comboProduct");
        z65.h(hn6Var, "price");
        z65.h(dVar, "screen");
        return a(new od(zi1Var.getName(), zi1Var.getId(), Double.valueOf(hn6Var.a()), hn6Var.c(), vc.d(kl8.i), null, null, 96, null), lx9.a(dVar));
    }

    public static final dc c(qd6 qd6Var, qd qdVar) {
        z65.h(qd6Var, "menuItem");
        z65.h(qdVar, "sender");
        return a(new od(qd6Var.i(), vc.b(qd6Var.f()), Double.valueOf(qd6Var.k().a()), qd6Var.k().c(), vc.d(qd6Var.b()), null, null, 96, null), qdVar);
    }
}
