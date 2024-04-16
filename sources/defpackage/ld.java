package defpackage;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Llia;", "cart", "Ldc;", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ld  reason: default package */
/* loaded from: classes2.dex */
public final class ld {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ld$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ lia a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(lia liaVar) {
            super(1);
            this.a = liaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            int w;
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "currency", this.a.n().c(), false, 4, null);
            bc.e(bcVar, "value", Double.valueOf(this.a.n().a()), false, 4, null);
            ArrayList<nq0> arrayList = new ArrayList();
            for (Object obj : this.a.f()) {
                if (((nq0) obj).d() > 0) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (nq0 nq0Var : arrayList) {
                arrayList2.add(new od(nq0Var.u(), nq0Var.t(), Double.valueOf(nq0Var.w().a()), null, vc.d(nq0Var.m()), uc.a.c(nq0Var.n()), Integer.valueOf(nq0Var.d()), 8, null));
            }
            return nv3.b(bcVar, arrayList2);
        }
    }

    public static final dc a(lia liaVar) {
        z65.h(liaVar, "cart");
        return ec.a("view_cart", new a(liaVar));
    }
}
