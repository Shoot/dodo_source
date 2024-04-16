package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderHistoryAnalytics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "orderId", "Ldc;", "a", "orderhistory_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: be7  reason: default package */
/* loaded from: classes2.dex */
public final class be7 {

    /* compiled from: OrderHistoryAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: be7$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.t(bcVar, this.a);
        }
    }

    public static final dc a(String str) {
        z65.h(str, "orderId");
        return ec.a("share_receipt_click", new a(str));
    }
}
