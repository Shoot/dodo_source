package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"Ldc;", "b", "Lm9a;", "orderType", "a", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: id  reason: default package */
/* loaded from: classes4.dex */
public final class id {

    /* compiled from: analytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: id$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ m9a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m9a m9aVar) {
            super(1);
            this.a = m9aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "delivery_type", this.a.getValue(), false, 4, null);
        }
    }

    public static final dc a(m9a m9aVar) {
        z65.h(m9aVar, "orderType");
        return ec.a("order_type_variant_click", new a(m9aVar));
    }

    public static final dc b() {
        return ec.b("screen_order_type_show", null, 2, null);
    }
}
