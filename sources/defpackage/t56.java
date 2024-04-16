package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MakePaymentService.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lt56;", "Ls56;", "Los7;", "payment", "Lkotlin/Function0;", "", "Lcom/dodopizza/payment/charge/StartPaymentAction;", "startPaymentAction", "Lqs7;", "a", "Lme8;", "Lme8;", "pollingPaymentStatusService", "Lq56;", "b", "Lq56;", "analytics", "Lan;", com.huawei.hms.opendevice.c.a, "Lan;", "appBackgroundStateDetector", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lme8;Lq56;Lan;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t56  reason: default package */
/* loaded from: classes2.dex */
public final class t56 implements s56 {
    private final me8 a;
    private final q56 b;
    private final an c;
    private final Logger d;

    /* compiled from: MakePaymentService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t56$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ca7.values().length];
            try {
                iArr[ca7.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ca7.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ca7.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ca7.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MakePaymentService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t56$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t56.this.b.a();
        }
    }

    /* compiled from: MakePaymentService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t56$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ ea9<ba7> a;
        final /* synthetic */ t56 b;
        final /* synthetic */ os7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ea9<ba7> ea9Var, t56 t56Var, os7 os7Var) {
            super(0);
            this.a = ea9Var;
            this.b = t56Var;
            this.c = os7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, ba7] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.a = this.b.a.a(this.c.a(), this.c.e());
        }
    }

    public t56(me8 me8Var, q56 q56Var, an anVar) {
        z65.h(me8Var, "pollingPaymentStatusService");
        z65.h(q56Var, "analytics");
        z65.h(anVar, "appBackgroundStateDetector");
        this.a = me8Var;
        this.b = q56Var;
        this.c = anVar;
        this.d = LoggerFactory.getLogger("MakePaymentServiceImpl");
    }

    @Override // defpackage.s56
    public qs7 a(os7 os7Var, Function0<Unit> function0) {
        ba7 ba7Var;
        boolean z;
        z65.h(os7Var, "payment");
        z65.h(function0, "startPaymentAction");
        function0.invoke();
        this.b.c(os7Var.a());
        ea9 ea9Var = new ea9();
        this.c.c(new b()).a(new c(ea9Var, this, os7Var));
        T t = ea9Var.a;
        ba7 ba7Var2 = null;
        if (t == 0) {
            z65.z("ongoingPaymentState");
            ba7Var = null;
        } else {
            ba7Var = (ba7) t;
        }
        if (ba7Var.d() == ca7.e) {
            z = true;
        } else {
            z = false;
        }
        this.b.b(os7Var.a(), z);
        T t2 = ea9Var.a;
        if (t2 == 0) {
            z65.z("ongoingPaymentState");
        } else {
            ba7Var2 = (ba7) t2;
        }
        int i = a.$EnumSwitchMapping$0[ba7Var2.d().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return qs7.b.b(os7Var.a(), ba7Var2.b());
                    }
                    throw new IllegalStateException("Payment is in invalid state [paymentId=" + os7Var.a() + "]");
                }
                this.d.warn("Authorize payment failure");
                return qs7.b.a(os7Var.a());
            }
            return qs7.b.d(os7Var.a(), ba7Var2.b(), ba7Var2.e(), ba7Var2.c(), ba7Var2.a());
        }
        return qs7.b.c(os7Var.a());
    }
}
