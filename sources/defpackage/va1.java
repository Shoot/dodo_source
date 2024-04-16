package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CoinAnalytics.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000¨\u0006\u0003"}, d2 = {"Ldc;", "b", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: va1  reason: default package */
/* loaded from: classes4.dex */
public final class va1 {

    /* compiled from: CoinAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: va1$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function1<bc, bc> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, ck1.e);
        }
    }

    /* compiled from: CoinAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: va1$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<bc, bc> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, ck1.e);
        }
    }

    public static final dc a() {
        return ec.a("coin_balance_click", a.a);
    }

    public static final dc b() {
        return ec.a("coin_balance_shown", b.a);
    }
}
