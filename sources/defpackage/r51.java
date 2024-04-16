package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d41;
import defpackage.e22;
import defpackage.fnb;
import defpackage.ii7;
import defpackage.iq1;
import defpackage.li7;
import defpackage.t51;
import defpackage.ts7;
import defpackage.u51;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CheckoutOrderProcessingService.kt */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010P\u001a\u00020N\u0012\u0006\u0010S\u001a\u00020Q\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010e\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020f\u0012\u0006\u0010n\u001a\u00020\u0002¢\u0006\u0004\bo\u0010pJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0002J.\u0010\u0016\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096\u0001J\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u0004*\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001J\u0015\u0010#\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\"\u001a\u00020\u0019H\u0096\u0001J\r\u0010$\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\u001e\u0010&\u001a\u00020\u0004*\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b&\u0010\u001eJ\r\u0010'\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\r\u0010(\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\u0015\u0010+\u001a\u00020\u0004*\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0096\u0001J\u0015\u0010,\u001a\u00020\u0004*\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0096\u0001J\u0015\u0010/\u001a\u00020\u0004*\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0096\u0001J\u0015\u00100\u001a\u00020\u0004*\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0096\u0001J\u001e\u00101\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b1\u0010\u001eJ\r\u00102\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\r\u00103\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J \u00107\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u00104\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u000105H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016J.\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00032\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0012H\u0016J.\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00032\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0012H\u0016J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00032\u0006\u00109\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012H\u0016J\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020G0\u00032\u0006\u00109\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0016J\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u00032\u0006\u00109\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010gR\u001c\u0010m\u001a\n j*\u0004\u0018\u00010i0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006q"}, d2 = {"Lr51;", "Lq51;", "Lh61;", "Loz3;", "Lb61;", "M", "L", "Lfnb;", "Lt51;", "checkoutResult", "Lu51;", "N", "Ljp7;", "result", "Lii7;", "O", "", CrashHianalyticsData.TIME, "", "title", "", "isSuggested", "o", "(Lb61;Ljava/lang/Long;Ljava/lang/String;Z)Lb61;", "", "Ld41;", "errors", "F", "x", "B", "(Lb61;Ljava/lang/Long;)Lb61;", "Lou2;", "deliverablePlace", "w", "error", "z", "G", "loadingTime", "v", "t", "D", "Ljw7;", "paymentWay", "u", "A", "Ld88;", "pizzeria", "C", "y", "n", "k", "E", "checkoutState", "Lhn6;", "cashNotes", Image.TYPE_SMALL, "i", "paymentId", "Lrs7;", "paymentAuthorization3DS", "pares", "md", "Liq1;", Image.TYPE_HIGH, "paymentSum", "gateway", "merchantId", "googlePayCreatePaymentRequestData", "Le22;", "p", "token", "Lts7;", "a", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "f", com.huawei.hms.push.e.a, "q", "b", "Lx51;", "Lx51;", "checkoutService", "Lt61;", "Lt61;", "checkoutStateProvider", "Lf8c;", com.huawei.hms.opendevice.c.a, "Lf8c;", "workflowIdProvider", "Lt52;", DateTokenConverter.CONVERTER_KEY, "Lt52;", "customerService", "Lad;", "Lad;", "analyticsHelper", "Lli7;", "Lli7;", "orderService", "Lew7;", "g", "Lew7;", "paymentService", "Ldh4;", "Ldh4;", "googlePaymentService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "checkoutStateLogic", "<init>", "(Lx51;Lt61;Lf8c;Lt52;Lad;Lli7;Lew7;Ldh4;Lh61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: r51  reason: default package */
/* loaded from: classes4.dex */
public final class r51 implements q51, h61 {
    private final x51 a;
    private final t61 b;
    private final f8c c;
    private final t52 d;
    private final ad e;
    private final li7 f;
    private final ew7 g;
    private final dh4 h;
    private final /* synthetic */ h61 i;
    private final Logger j;

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r51$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[lp7.values().length];
            try {
                iArr[lp7.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lp7.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lp7.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lp7.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lii7;", "orderResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$waitForPayedOrder$4", f = "CheckoutOrderProcessingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r51$a0 */
    /* loaded from: classes4.dex */
    static final class a0 extends f3b implements Function2<ii7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ii7 ii7Var, cv1<? super Unit> cv1Var) {
            return ((a0) create(ii7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ii7 ii7Var = (ii7) this.b;
                String a = ji7.a(ii7Var);
                if (!(ii7Var instanceof ii7.b) && !(ii7Var instanceof ii7.a)) {
                    if (ii7Var instanceof ii7.c) {
                        r51.this.e.l(a, ((ii7.c) ii7Var).b());
                    } else if (ii7Var instanceof ii7.e) {
                        r51.this.e.m(a, "Unknown error!");
                    }
                } else {
                    try {
                        r51.this.a.b();
                    } catch (Throwable th) {
                        r51.this.j.warn("Failed to prepare for new workflow after order was created. ", th);
                    }
                    r51.this.e.n(a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lts7;", "a", "()Lts7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<ts7> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ts7 invoke() {
            return new ts7.b(r51.this.g.i(this.b, this.c, false), r51.this.L());
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$chargePayment$2", f = "CheckoutOrderProcessingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r51$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = r51.this.j;
                String str = this.d;
                logger.error("Failed to charge payment " + str + ". ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lts7;", "a", "(Ljava/lang/Throwable;)Lts7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<Throwable, ts7> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ts7 invoke(Throwable th) {
            z65.h(th, "it");
            r51 r51Var = r51.this;
            return new ts7.a(r51Var.D(r51Var.L()));
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lts7;", "a", "()Lts7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<ts7> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ts7 invoke() {
            return new ts7.b(r51.this.g.e(this.b, this.c), r51.this.L());
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$chargeSavedCardPayment$2", f = "CheckoutOrderProcessingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r51$f */
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.d, cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = r51.this.j;
                String str = this.d;
                logger.error("Failed to charge saved card payment " + str + ". ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lts7;", "a", "(Ljava/lang/Throwable;)Lts7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function1<Throwable, ts7> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ts7 invoke(Throwable th) {
            z65.h(th, "it");
            r51 r51Var = r51.this;
            return new ts7.a(r51Var.D(r51Var.L()));
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lts7;", "a", "()Lts7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$h */
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function0<ts7> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ts7 invoke() {
            return new ts7.b(r51.this.g.f(this.b, this.c), r51.this.L());
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$chargeSbpPayment$2", f = "CheckoutOrderProcessingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r51$i */
    /* loaded from: classes4.dex */
    static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, cv1<? super i> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i iVar = new i(this.d, cv1Var);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = r51.this.j;
                String str = this.d;
                logger.error("Failed to charge payment " + str + ". ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lts7;", "a", "(Ljava/lang/Throwable;)Lts7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$j */
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<Throwable, ts7> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ts7 invoke(Throwable th) {
            z65.h(th, "it");
            r51 r51Var = r51.this;
            return new ts7.a(r51Var.D(r51Var.L()));
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Liq1;", "a", "()Liq1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$k */
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function0<iq1> {
        final /* synthetic */ String b;
        final /* synthetic */ rs7 c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, rs7 rs7Var, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = rs7Var;
            this.d = str2;
            this.e = str3;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final iq1 invoke() {
            r51.this.g.j(this.b, this.c, this.d, this.e);
            return iq1.b.a;
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Liq1;", "a", "(Ljava/lang/Throwable;)Liq1;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$l */
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<Throwable, iq1> {
        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final iq1 invoke(Throwable th) {
            z65.h(th, "it");
            r51 r51Var = r51.this;
            return new iq1.a(r51Var.D(r51Var.L()));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r51$m */
    /* loaded from: classes4.dex */
    public static final class m implements oz3<e22.c> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ r51 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$m$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ r51 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$createGooglePayRequest$$inlined$map$1$2", f = "CheckoutOrderProcessingService.kt", l = {223}, m = "emit")
            /* renamed from: r51$m$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0495a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0495a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, r51 r51Var) {
                this.a = pz3Var;
                this.b = r51Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof defpackage.r51.m.a.C0495a
                    if (r0 == 0) goto L13
                    r0 = r7
                    r51$m$a$a r0 = (defpackage.r51.m.a.C0495a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    r51$m$a$a r0 = new r51$m$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    e22$c r2 = new e22$c
                    r51 r4 = r5.b
                    b61 r6 = r4.G(r6)
                    r2.<init>(r6)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.m.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public m(oz3 oz3Var, r51 r51Var) {
            this.a = oz3Var;
            this.b = r51Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super e22.c> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le22;", "data", "a", "(Le22;)Le22;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$n */
    /* loaded from: classes4.dex */
    static final class n extends ej5 implements Function1<e22, e22> {
        final /* synthetic */ hn6 b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutOrderProcessingService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le22;", "a", "()Le22;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<e22> {
            final /* synthetic */ r51 a;
            final /* synthetic */ hn6 b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r51 r51Var, hn6 hn6Var, String str, String str2, String str3) {
                super(0);
                this.a = r51Var;
                this.b = hn6Var;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final e22 invoke() {
                return new e22.a(this.a.h.b(this.b, this.c, this.d, this.e));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutOrderProcessingService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Le22;", "a", "(Ljava/lang/Throwable;)Le22;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$n$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<Throwable, e22> {
            final /* synthetic */ r51 a;
            final /* synthetic */ e22 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(r51 r51Var, e22 e22Var) {
                super(1);
                this.a = r51Var;
                this.b = e22Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final e22 invoke(Throwable th) {
                z65.h(th, "it");
                r51 r51Var = this.a;
                e22 e22Var = this.b;
                z65.f(e22Var, "null cannot be cast to non-null type ru.dodopizza.app.presentation.checkout.state.orderprocessing.CreateGooglePayRequestResult.RequestInProgress");
                return new e22.b(r51Var.D(((e22.c) e22Var).a()), th);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(hn6 hn6Var, String str, String str2, String str3) {
            super(1);
            this.b = hn6Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final e22 invoke(e22 e22Var) {
            z65.h(e22Var, "data");
            return (e22) hnb.d(fnb.a.a(new a(r51.this, this.b, this.c, this.d, this.e)), new b(r51.this, e22Var)).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$getCurrentCheckoutStateFlow$1", f = "CheckoutOrderProcessingService.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: r51$o */
    /* loaded from: classes4.dex */
    public static final class o extends f3b implements Function2<pz3<? super b61>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, cv1<? super Unit> cv1Var) {
            return ((o) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                b61 L = r51.this.L();
                this.a = 1;
                if (((pz3) this.b).emit(L, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt51;", "result", "Lu51;", "a", "(Lt51;)Lu51;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$p */
    /* loaded from: classes4.dex */
    public static final class p extends ej5 implements Function1<t51, u51> {
        p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final u51 invoke(t51 t51Var) {
            z65.h(t51Var, "result");
            b61 L = r51.this.L();
            if (t51Var instanceof t51.a) {
                return new u51.a(t51Var, r51.this.F(L, e41.a(((t51.a) t51Var).a())));
            }
            return new u51.a(t51Var, r51.this.G(L));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lu51;", "a", "(Ljava/lang/Throwable;)Lu51;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$q */
    /* loaded from: classes4.dex */
    public static final class q extends ej5 implements Function1<Throwable, u51> {
        q() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
            if (r8 != null) goto L5;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final defpackage.u51 invoke(java.lang.Throwable r8) {
            /*
                r7 = this;
                java.lang.String r0 = "throwable"
                defpackage.z65.h(r8, r0)
                r51 r0 = defpackage.r51.this
                b61 r0 = defpackage.r51.g(r0)
                cu7 r1 = r0.n()
                jw7 r1 = r1.a()
                if (r1 == 0) goto L3e
                r51 r2 = defpackage.r51.this
                org.slf4j.Logger r3 = defpackage.r51.m(r2)
                f8c r4 = defpackage.r51.I(r2)
                java.lang.String r4 = r4.b()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Payment Unknown Error. Workflow: "
                r5.append(r6)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r3.error(r4, r8)
                b61 r8 = r2.A(r0, r1)
                if (r8 == 0) goto L3e
                goto L46
            L3e:
                r51 r8 = defpackage.r51.this
                d41$i r1 = defpackage.d41.i.c
                b61 r8 = r8.z(r0, r1)
            L46:
                u51$b r0 = new u51$b
                r0.<init>(r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.q.invoke(java.lang.Throwable):u51");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r51$r */
    /* loaded from: classes4.dex */
    public static final class r implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ r51 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$r$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ r51 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$handlePaymentCanceled$$inlined$map$1$2", f = "CheckoutOrderProcessingService.kt", l = {223}, m = "emit")
            /* renamed from: r51$r$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0496a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0496a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, r51 r51Var) {
                this.a = pz3Var;
                this.b = r51Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.r51.r.a.C0496a
                    if (r0 == 0) goto L13
                    r0 = r6
                    r51$r$a$a r0 = (defpackage.r51.r.a.C0496a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    r51$r$a$a r0 = new r51$r$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    b61 r5 = (defpackage.b61) r5
                    r51 r2 = r4.b
                    b61 r5 = r2.x(r5)
                    b61 r5 = r2.k(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.r.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public r(oz3 oz3Var, r51 r51Var) {
            this.a = oz3Var;
            this.b = r51Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r51$s */
    /* loaded from: classes4.dex */
    public static final class s implements oz3<u51> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ r51 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$s$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ r51 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$requestCheckout$$inlined$map$1$2", f = "CheckoutOrderProcessingService.kt", l = {223}, m = "emit")
            /* renamed from: r51$s$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0497a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0497a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, r51 r51Var) {
                this.a = pz3Var;
                this.b = r51Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof defpackage.r51.s.a.C0497a
                    if (r0 == 0) goto L13
                    r0 = r7
                    r51$s$a$a r0 = (defpackage.r51.s.a.C0497a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    r51$s$a$a r0 = new r51$s$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    u51$c r2 = new u51$c
                    r51 r4 = r5.b
                    b61 r6 = r4.G(r6)
                    r2.<init>(r6)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.s.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public s(oz3 oz3Var, r51 r51Var) {
            this.a = oz3Var;
            this.b = r51Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super u51> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$requestCheckout$1", f = "CheckoutOrderProcessingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r51$t */
    /* loaded from: classes4.dex */
    static final class t extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new t(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((t) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                r51.this.e.o();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$requestCheckout$2", f = "CheckoutOrderProcessingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r51$u */
    /* loaded from: classes4.dex */
    static final class u extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ b61 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(b61 b61Var, cv1<? super u> cv1Var) {
            super(2, cv1Var);
            this.c = b61Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new u(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((u) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            du7 c;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ad adVar = r51.this.e;
                jw7 a = this.c.n().a();
                if (a != null && (c = a.c()) != null) {
                    str = c.name();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                adVar.d(str);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu51;", "it", "a", "(Lu51;)Lu51;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$v */
    /* loaded from: classes4.dex */
    static final class v extends ej5 implements Function1<u51, u51> {
        final /* synthetic */ hn6 b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutOrderProcessingService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt51;", "a", "()Lt51;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$v$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<t51> {
            final /* synthetic */ u51 a;
            final /* synthetic */ r51 b;
            final /* synthetic */ hn6 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u51 u51Var, r51 r51Var, hn6 hn6Var) {
                super(0);
                this.a = u51Var;
                this.b = r51Var;
                this.c = hn6Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final t51 invoke() {
                return this.b.a.c(j61.a.c(this.a.a(), this.b.c.b(), this.b.d.f().h(), this.c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(hn6 hn6Var) {
            super(1);
            this.b = hn6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final u51 invoke(u51 u51Var) {
            z65.h(u51Var, "it");
            return r51.this.N(fnb.a.a(new a(u51Var, r51.this, this.b)));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r51$w */
    /* loaded from: classes4.dex */
    public static final class w implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ r51 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$w$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ r51 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$setPaymentError$$inlined$map$1$2", f = "CheckoutOrderProcessingService.kt", l = {223}, m = "emit")
            /* renamed from: r51$w$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0498a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0498a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, r51 r51Var) {
                this.a = pz3Var;
                this.b = r51Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.r51.w.a.C0498a
                    if (r0 == 0) goto L13
                    r0 = r6
                    r51$w$a$a r0 = (defpackage.r51.w.a.C0498a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    r51$w$a$a r0 = new r51$w$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    b61 r5 = (defpackage.b61) r5
                    r51 r2 = r4.b
                    b61 r5 = r2.D(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.w.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public w(oz3 oz3Var, r51 r51Var) {
            this.a = oz3Var;
            this.b = r51Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r51$x */
    /* loaded from: classes4.dex */
    public static final class x implements oz3<ii7> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ r51 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: r51$x$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ r51 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$waitForPayedOrder$$inlined$map$1$2", f = "CheckoutOrderProcessingService.kt", l = {223}, m = "emit")
            /* renamed from: r51$x$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0499a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0499a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, r51 r51Var) {
                this.a = pz3Var;
                this.b = r51Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.r51.x.a.C0499a
                    if (r0 == 0) goto L13
                    r0 = r6
                    r51$x$a$a r0 = (defpackage.r51.x.a.C0499a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    r51$x$a$a r0 = new r51$x$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    fnb r5 = (defpackage.fnb) r5
                    r51 r2 = r4.b
                    ii7 r5 = defpackage.r51.K(r2, r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.x.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public x(oz3 oz3Var, r51 r51Var) {
            this.a = oz3Var;
            this.b = r51Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super ii7> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljp7;", "a", "()Ljp7;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r51$y */
    /* loaded from: classes4.dex */
    static final class y extends ej5 implements Function0<jp7> {
        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final jp7 invoke() {
            return li7.a.a(r51.this.f, r51.this.c.b(), 0, 2, null);
        }
    }

    /* compiled from: CheckoutOrderProcessingService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lii7;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.orderprocessing.CheckoutOrderProcessingServiceImpl$waitForPayedOrder$3", f = "CheckoutOrderProcessingService.kt", l = {164}, m = "invokeSuspend")
    /* renamed from: r51$z */
    /* loaded from: classes4.dex */
    static final class z extends f3b implements Function2<pz3<? super ii7>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        z(cv1<? super z> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z zVar = new z(cv1Var);
            zVar.b = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super ii7> pz3Var, cv1<? super Unit> cv1Var) {
            return ((z) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                r51 r51Var = r51.this;
                ii7.d dVar = new ii7.d(r51Var.G(r51Var.L()));
                this.a = 1;
                if (((pz3) this.b).emit(dVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public r51(x51 x51Var, t61 t61Var, f8c f8cVar, t52 t52Var, ad adVar, li7 li7Var, ew7 ew7Var, dh4 dh4Var, h61 h61Var) {
        z65.h(x51Var, "checkoutService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(t52Var, "customerService");
        z65.h(adVar, "analyticsHelper");
        z65.h(li7Var, "orderService");
        z65.h(ew7Var, "paymentService");
        z65.h(dh4Var, "googlePaymentService");
        z65.h(h61Var, "checkoutStateLogic");
        this.a = x51Var;
        this.b = t61Var;
        this.c = f8cVar;
        this.d = t52Var;
        this.e = adVar;
        this.f = li7Var;
        this.g = ew7Var;
        this.h = dh4Var;
        this.i = h61Var;
        this.j = LoggerFactory.getLogger("CheckoutOperationService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b61 L() {
        return this.b.get();
    }

    private final oz3<b61> M() {
        return wz3.z(new o(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u51 N(fnb<t51> fnbVar) {
        return (u51) hnb.d(hnb.a(fnbVar, new p()), new q()).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ii7 O(fnb<jp7> fnbVar) {
        ii7 cVar;
        if (fnbVar instanceof fnb.b) {
            return new ii7.e(z(L(), d41.i.c));
        }
        if (fnbVar instanceof fnb.c) {
            fnb.c cVar2 = (fnb.c) fnbVar;
            int i2 = a.$EnumSwitchMapping$0[((jp7) cVar2.d()).c().ordinal()];
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return new ii7.b(G(L()));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        cVar = new ii7.a(((jp7) cVar2.d()).b(), G(L()));
                    }
                } else {
                    cVar = new ii7.c(((jp7) cVar2.d()).a(), D(L()));
                }
                return cVar;
            }
            return new ii7.e(z(L(), d41.i.c));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.h61
    public b61 A(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.i.A(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 B(b61 b61Var, Long l2) {
        z65.h(b61Var, "<this>");
        return this.i.B(b61Var, l2);
    }

    @Override // defpackage.h61
    public b61 C(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.i.C(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 D(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.i.D(b61Var);
    }

    @Override // defpackage.h61
    public b61 E(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.i.E(b61Var);
    }

    @Override // defpackage.h61
    public b61 F(b61 b61Var, Collection<? extends d41> collection) {
        z65.h(b61Var, "<this>");
        z65.h(collection, "errors");
        return this.i.F(b61Var, collection);
    }

    @Override // defpackage.h61
    public b61 G(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.i.G(b61Var);
    }

    @Override // defpackage.q51
    public oz3<ts7> a(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, "token");
        return gnb.a(gnb.b(gnb.c(new b(str, str2)), new c(str, null)), new d());
    }

    @Override // defpackage.q51
    public oz3<b61> b() {
        return new w(M(), this);
    }

    @Override // defpackage.q51
    public oz3<ts7> e(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        return gnb.a(gnb.b(gnb.c(new e(str, str2)), new f(str, null)), new g());
    }

    @Override // defpackage.q51
    public oz3<ts7> f(String str, String str2) {
        z65.h(str, "paymentId");
        z65.h(str2, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        return gnb.a(gnb.b(gnb.c(new h(str, str2)), new i(str, null)), new j());
    }

    @Override // defpackage.q51
    public oz3<iq1> h(String str, rs7 rs7Var, String str2, String str3) {
        z65.h(str, "paymentId");
        z65.h(rs7Var, "paymentAuthorization3DS");
        z65.h(str2, "pares");
        z65.h(str3, "md");
        return gnb.a(gnb.c(new k(str, rs7Var, str2, str3)), new l());
    }

    @Override // defpackage.q51
    public oz3<ii7> i() {
        return wz3.F(wz3.H(new x(gnb.c(new y()), this), new z(null)), new a0(null));
    }

    @Override // defpackage.h61
    public b61 k(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.i.k(b61Var);
    }

    @Override // defpackage.h61
    public b61 n(b61 b61Var, Long l2) {
        z65.h(b61Var, "<this>");
        return this.i.n(b61Var, l2);
    }

    @Override // defpackage.h61
    public b61 o(b61 b61Var, Long l2, String str, boolean z2) {
        z65.h(b61Var, "<this>");
        z65.h(str, "title");
        return this.i.o(b61Var, l2, str, z2);
    }

    @Override // defpackage.q51
    public oz3<e22> p(hn6 hn6Var, String str, String str2, String str3) {
        z65.h(hn6Var, "paymentSum");
        z65.h(str, "gateway");
        z65.h(str2, "merchantId");
        z65.h(str3, "googlePayCreatePaymentRequestData");
        return uz3.a.c(new m(M(), this), new n(hn6Var, str, str2, str3));
    }

    @Override // defpackage.q51
    public oz3<b61> q() {
        return new r(M(), this);
    }

    @Override // defpackage.q51
    public oz3<u51> s(b61 b61Var, hn6 hn6Var) {
        z65.h(b61Var, "checkoutState");
        return uz3.a.c(new s(wz3.F(wz3.F(wz3.A(b61Var), new t(null)), new u(b61Var, null)), this), new v(hn6Var));
    }

    @Override // defpackage.h61
    public b61 t(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.i.t(b61Var);
    }

    @Override // defpackage.h61
    public b61 u(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.i.u(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 v(b61 b61Var, Long l2) {
        z65.h(b61Var, "<this>");
        return this.i.v(b61Var, l2);
    }

    @Override // defpackage.h61
    public b61 w(b61 b61Var, ou2 ou2Var) {
        z65.h(b61Var, "<this>");
        z65.h(ou2Var, "deliverablePlace");
        return this.i.w(b61Var, ou2Var);
    }

    @Override // defpackage.h61
    public b61 x(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.i.x(b61Var);
    }

    @Override // defpackage.h61
    public b61 y(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.i.y(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 z(b61 b61Var, d41 d41Var) {
        z65.h(b61Var, "<this>");
        z65.h(d41Var, "error");
        return this.i.z(b61Var, d41Var);
    }
}
