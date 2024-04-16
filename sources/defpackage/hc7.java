package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderCompletedAnalytics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lhc7;", "", "", "orderId", "Lqd;", "sender", "Ldc;", "b", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hc7  reason: default package */
/* loaded from: classes4.dex */
public final class hc7 {
    public static final hc7 a = new hc7();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderCompletedAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hc7$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderCompletedAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hc7$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ qd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, qd qdVar) {
            super(1);
            this.a = str;
            this.b = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            return vc.z(bcVar, this.b);
        }
    }

    private hc7() {
    }

    public final dc a(String str) {
        z65.h(str, "orderId");
        return ec.a("close_order_completed", new a(str));
    }

    public final dc b(String str, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        return ec.a("screen_order_completed", new b(str, qdVar));
    }
}
