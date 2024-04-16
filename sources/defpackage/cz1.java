package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CourierTipsAnalytics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcz1;", "", "", "orderId", "Lqd;", "sender", "Ldc;", "b", "", "tipsAmount", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cz1  reason: default package */
/* loaded from: classes4.dex */
public final class cz1 {
    public static final cz1 a = new cz1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CourierTipsAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cz1$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i, qd qdVar) {
            super(1);
            this.a = str;
            this.b = i;
            this.c = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.t(bcVar, this.a);
            bc.e(bcVar, "tips", Integer.valueOf(this.b), false, 4, null);
            return vc.z(bcVar, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CourierTipsAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cz1$b */
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

    private cz1() {
    }

    public final dc a(String str, int i, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        return ec.a("click_on_tips", new a(str, i, qdVar));
    }

    public final dc b(String str, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        return ec.a("tips_module_shown", new b(str, qdVar));
    }
}
