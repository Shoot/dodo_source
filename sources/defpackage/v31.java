package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: CheckoutAnalytics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b\u001a \u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0013"}, d2 = {"", "paymentId", "Ldu7;", "paymentMethodType", "Ldc;", com.huawei.hms.push.e.a, "", "isError", "f", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Loe8;", "pollingType", "b", "Ld88;", "pizzeria", "Lqd;", "sender", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: v31  reason: default package */
/* loaded from: classes4.dex */
public final class v31 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v31$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ d88 a;
        final /* synthetic */ du7 b;
        final /* synthetic */ qd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d88 d88Var, du7 du7Var, qd qdVar) {
            super(1);
            this.a = d88Var;
            this.b = du7Var;
            this.c = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.w(bcVar, this.a);
            vc.v(bcVar, this.b);
            return vc.z(bcVar, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v31$b */
    /* loaded from: classes4.dex */
    public static final class b extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ oe8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(oe8 oe8Var) {
            super(1);
            this.a = oe8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "polling_type", this.a.i(), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v31$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ du7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(du7 du7Var) {
            super(1);
            this.a = du7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.u(bcVar, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v31$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ du7 a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(du7 du7Var, boolean z) {
            super(1);
            this.a = du7Var;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            vc.u(bcVar, this.a);
            return bc.e(bcVar, "is_error", Boolean.valueOf(this.b), false, 4, null);
        }
    }

    /* compiled from: CheckoutAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v31$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ du7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, du7 du7Var) {
            super(1);
            this.a = str;
            this.b = du7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "payment_id", this.a, false, 4, null);
            return vc.u(bcVar, this.b);
        }
    }

    /* compiled from: CheckoutAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: v31$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ String a;
        final /* synthetic */ du7 b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, du7 du7Var, boolean z) {
            super(1);
            this.a = str;
            this.b = du7Var;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            bc.e(bcVar, "payment_id", this.a, false, 4, null);
            vc.u(bcVar, this.b);
            return bc.e(bcVar, "is_error", Boolean.valueOf(this.c), false, 4, null);
        }
    }

    public static final dc a(d88 d88Var, du7 du7Var, qd qdVar) {
        z65.h(du7Var, "paymentMethodType");
        z65.h(qdVar, "sender");
        return ec.a("change_payment_type", new a(d88Var, du7Var, qdVar));
    }

    public static final dc b(oe8 oe8Var) {
        z65.h(oe8Var, "pollingType");
        return ec.a("close_app_during_polling", new b(oe8Var));
    }

    public static final dc c(du7 du7Var) {
        z65.h(du7Var, "paymentMethodType");
        return ec.a("start_order_polling_after_payment", new c(du7Var));
    }

    public static final dc d(du7 du7Var, boolean z) {
        z65.h(du7Var, "paymentMethodType");
        return ec.a("stop_order_polling_after_payment", new d(du7Var, z));
    }

    public static final dc e(String str, du7 du7Var) {
        z65.h(str, "paymentId");
        z65.h(du7Var, "paymentMethodType");
        return ec.a("start_payment_polling", new e(str, du7Var));
    }

    public static final dc f(String str, du7 du7Var, boolean z) {
        z65.h(str, "paymentId");
        z65.h(du7Var, "paymentMethodType");
        return ec.a("stop_payment_polling", new f(str, du7Var, z));
    }
}
