package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.d41;
import defpackage.jw7;
import defpackage.lk7;
import defpackage.nk9;
import defpackage.ou2;
import defpackage.uu2;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: CheckoutStateService.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010\\\u001a\u00020Z\u0012\u0006\u0010_\u001a\u00020]\u0012\u0006\u0010b\u001a\u00020`\u0012\u0006\u0010m\u001a\u00020\u0002\u0012\u0006\u0010e\u001a\u00020c\u0012\u0006\u0010h\u001a\u00020f¢\u0006\u0004\bn\u0010oJ<\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002JE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J.\u0010$\u001a\u00020\u0004*\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001b\u0010)\u001a\u00020\u0004*\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0096\u0001J\r\u0010*\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\u001e\u0010+\u001a\u00020\u0004*\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u0015\u0010/\u001a\u00020\u0004*\u00020\u00042\u0006\u0010.\u001a\u00020'H\u0096\u0001J\r\u00100\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\u001e\u00102\u001a\u00020\u0004*\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u001fH\u0096\u0001¢\u0006\u0004\b2\u0010,J\r\u00103\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\r\u00104\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\u0015\u00105\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001J\u0015\u00106\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001J\u0015\u00107\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u0015\u00108\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u001e\u00109\u001a\u00020\u0004*\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0001¢\u0006\u0004\b9\u0010,J\r\u0010:\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J\r\u0010;\u001a\u00020\u0004*\u00020\u0004H\u0096\u0001J.\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010>\u001a\u00020=H\u0016J&\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016J7\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bA\u0010BJ\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010F\u001a\u00020\fH\u0016J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010I\u001a\u00020HH\u0016J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010L\u001a\u00020\fH\u0016J\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bN\u0010OJ?\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010P\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\fH\u0016¢\u0006\u0004\bR\u0010SJ\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010T\u001a\u00020\fH\u0016R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010gR\u001c\u0010l\u001a\n j*\u0004\u0018\u00010i0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010k¨\u0006p"}, d2 = {"Lw61;", "Lv61;", "Lh61;", "Loz3;", "Lb61;", "checkoutStateFlow", "Lou2;", "deliverablePlace", "Llk7$a;", "addressSource", "Lqd;", "analyticsSender", "", "setDeliveryOrderType", "T", "Ld88;", "pizzeria", "Llk7$d;", "pizzeriaSource", "Lbd8;", "U", "isNearestPizzeria", "V", "(Loz3;Ld88;Llk7$d;Lqd;Ljava/lang/Boolean;)Lbd8;", "S", "R", "Ljw7;", "paymentWay", "X", "state", "Z", "", CrashHianalyticsData.TIME, "", "title", "isSuggested", "o", "(Lb61;Ljava/lang/Long;Ljava/lang/String;Z)Lb61;", "", "Ld41;", "errors", "F", "x", "B", "(Lb61;Ljava/lang/Long;)Lb61;", "w", "error", "z", "G", "loadingTime", "v", "t", "D", "u", "A", "C", "y", "n", "k", "E", com.huawei.hms.push.e.a, "Le91;", "clientDeliveryLocation", com.huawei.hms.opendevice.c.a, "i", Image.TYPE_HIGH, "(Ld88;Llk7$d;Lqd;Ljava/lang/Boolean;)Loz3;", Image.TYPE_MEDIUM, "p", "j", "isTakeaway", "Y", "", "tableNumber", "W", "f", "isRedirectSaveCardEnabled", "l", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Loz3;", "currentState", "persistCurrentTimes", "r", "(Lb61;Ljava/lang/Long;Ljava/lang/String;ZZ)Loz3;", "isSelected", "b", "Lc61;", "a", "Lc61;", "checkoutStateEditService", "Lt61;", "Lt61;", "checkoutStateProvider", "Lad;", "Lad;", "analyticsHelper", "Lqi8;", "Lqi8;", "preferredOrderLocationService", "Li00;", "Li00;", "authorizationState", "Lhq3;", "Lhq3;", "featureService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "checkoutStateLogic", "<init>", "(Lc61;Lt61;Lad;Lqi8;Lh61;Li00;Lhq3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w61  reason: default package */
/* loaded from: classes4.dex */
public final class w61 implements v61, h61 {
    private final c61 a;
    private final t61 b;
    private final ad c;
    private final qi8 d;
    private final i00 e;
    private final hq3 f;
    private final /* synthetic */ h61 g;
    private final Logger h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lb61;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$getCurrentCheckoutStateFlow$1", f = "CheckoutStateService.kt", l = {229}, m = "invokeSuspend")
    /* renamed from: w61$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<pz3<? super b61>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super b61> pz3Var, cv1<? super Unit> cv1Var) {
            return ((a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                b61 R = w61.this.R();
                this.a = 1;
                if (((pz3) this.b).emit(R, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "state", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$switchToDelivery$1", f = "CheckoutStateService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w61$a0 */
    /* loaded from: classes4.dex */
    static final class a0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
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
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((a0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wk7 k = ((b61) this.b).k();
                if (k instanceof bq0.a) {
                    w61.this.d.a(((bq0.a) k).e());
                } else if (k instanceof nk9.b) {
                    w61.this.d.a(((nk9.b) k).e());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$b */
    /* loaded from: classes4.dex */
    public static final class b implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$b$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$refreshCheckoutDetails$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0706a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0706a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var) {
                this.a = pz3Var;
                this.b = w61Var;
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
                    boolean r0 = r6 instanceof defpackage.w61.b.a.C0706a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w61$b$a$a r0 = (defpackage.w61.b.a.C0706a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$b$a$a r0 = new w61$b$a$a
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
                    w61 r2 = r4.b
                    b61 r5 = r2.x(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var, w61 w61Var) {
            this.a = oz3Var;
            this.b = w61Var;
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

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "state", "Loz3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$switchToDelivery$2", f = "CheckoutStateService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w61$b0 */
    /* loaded from: classes4.dex */
    static final class b0 extends f3b implements Function2<b61, cv1<? super oz3<? extends b61>>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ qd d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$b0$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<b61, b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ qd b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutStateService.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: w61$b0$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0707a extends ej5 implements Function0<b61> {
                final /* synthetic */ w61 a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0707a(w61 w61Var) {
                    super(0);
                    this.a = w61Var;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final b61 invoke() {
                    return this.a.a.i();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutStateService.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "state", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: w61$b0$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function1<b61, Unit> {
                final /* synthetic */ w61 a;
                final /* synthetic */ qd b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(w61 w61Var, qd qdVar) {
                    super(1);
                    this.a = w61Var;
                    this.b = qdVar;
                }

                public final void a(b61 b61Var) {
                    z65.h(b61Var, "state");
                    if (b61Var.k() instanceof uu2.a) {
                        this.a.d.b(((uu2.a) b61Var.k()).e());
                    }
                    this.a.c.j(lk7.a.d, b61Var.k(), this.b);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                    a(b61Var);
                    return Unit.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutStateService.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: w61$b0$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function1<Throwable, Unit> {
                final /* synthetic */ w61 a;
                final /* synthetic */ qd b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(w61 w61Var, qd qdVar) {
                    super(1);
                    this.a = w61Var;
                    this.b = qdVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    z65.h(th, "throwable");
                    this.a.c.i(th.getMessage(), this.b);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CheckoutStateService.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: w61$b0$a$d */
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function1<Throwable, b61> {
                final /* synthetic */ w61 a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(w61 w61Var) {
                    super(1);
                    this.a = w61Var;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final b61 invoke(Throwable th) {
                    z65.h(th, "it");
                    w61 w61Var = this.a;
                    return w61Var.z(w61Var.R(), d41.b.c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = qdVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(b61 b61Var) {
                z65.h(b61Var, "it");
                return (b61) hnb.b(hnb.c(fnb.a.a(new C0707a(this.a)), new b(this.a, this.b)), new c(this.a, this.b)).a(new d(this.a));
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: w61$b0$b */
        /* loaded from: classes4.dex */
        public static final class b implements oz3<b61> {
            final /* synthetic */ oz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: w61$b0$b$a */
            /* loaded from: classes4.dex */
            public static final class a<T> implements pz3 {
                final /* synthetic */ pz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$switchToDelivery$2$invokeSuspend$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
                /* renamed from: w61$b0$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0708a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0708a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(pz3 pz3Var) {
                    this.a = pz3Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r23, defpackage.cv1 r24) {
                    /*
                        r22 = this;
                        r0 = r22
                        r1 = r24
                        boolean r2 = r1 instanceof defpackage.w61.b0.b.a.C0708a
                        if (r2 == 0) goto L17
                        r2 = r1
                        w61$b0$b$a$a r2 = (defpackage.w61.b0.b.a.C0708a) r2
                        int r3 = r2.b
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L17
                        int r3 = r3 - r4
                        r2.b = r3
                        goto L1c
                    L17:
                        w61$b0$b$a$a r2 = new w61$b0$b$a$a
                        r2.<init>(r1)
                    L1c:
                        java.lang.Object r1 = r2.a
                        java.lang.Object r3 = defpackage.a75.d()
                        int r4 = r2.b
                        r5 = 1
                        if (r4 == 0) goto L35
                        if (r4 != r5) goto L2d
                        defpackage.vk9.b(r1)
                        goto L61
                    L2d:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L35:
                        defpackage.vk9.b(r1)
                        pz3 r1 = r0.a
                        r6 = r23
                        b61 r6 = (defpackage.b61) r6
                        r7 = 0
                        uu2$b r8 = defpackage.uu2.b.e
                        r9 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 0
                        r16 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 8189(0x1ffd, float:1.1475E-41)
                        r21 = 0
                        b61 r4 = defpackage.b61.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                        r2.b = r5
                        java.lang.Object r1 = r1.emit(r4, r2)
                        if (r1 != r3) goto L61
                        return r3
                    L61:
                        kotlin.Unit r1 = kotlin.Unit.a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.b0.b.a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public b(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(qd qdVar, cv1<? super b0> cv1Var) {
            super(2, cv1Var);
            this.d = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b0 b0Var = new b0(this.d, cv1Var);
            b0Var.b = obj;
            return b0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super oz3<b61>> cv1Var) {
            return ((b0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b61 b61Var = (b61) this.b;
                ou2 c = w61.this.d.get().c();
                if (b61Var.k().b()) {
                    return wz3.A(b61Var);
                }
                if (c != null) {
                    return w61.this.T(wz3.A(b61Var), c, lk7.a.d, this.d, true);
                }
                return uz3.a.c(new b(wz3.A(b61Var)), new a(w61.this, this.d));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$c */
    /* loaded from: classes4.dex */
    public static final class c implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ ou2 c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ ou2 c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$selectDeliverablePlaceInternal$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0709a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0709a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, ou2 ou2Var) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = ou2Var;
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
                    boolean r0 = r7 instanceof defpackage.w61.c.a.C0709a
                    if (r0 == 0) goto L13
                    r0 = r7
                    w61$c$a$a r0 = (defpackage.w61.c.a.C0709a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$c$a$a r0 = new w61$c$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    w61 r2 = r5.b
                    ou2 r4 = r5.c
                    b61 r6 = r2.w(r6, r4)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var, w61 w61Var, ou2 ou2Var) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = ou2Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "state", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$switchToRestaurant$1", f = "CheckoutStateService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w61$c0 */
    /* loaded from: classes4.dex */
    static final class c0 extends f3b implements Function2<b61, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c0(cv1<? super c0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c0 c0Var = new c0(cv1Var);
            c0Var.b = obj;
            return c0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super Unit> cv1Var) {
            return ((c0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b61 b61Var = (b61) this.b;
                if (b61Var.k() instanceof uu2.a) {
                    w61.this.d.b(((uu2.a) b61Var.k()).e());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ ou2 b;
        final /* synthetic */ boolean c;
        final /* synthetic */ lk7.a d;
        final /* synthetic */ qd e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ ou2 b;
            final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, ou2 ou2Var, boolean z) {
                super(0);
                this.a = w61Var;
                this.b = ou2Var;
                this.c = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.j(this.b, this.c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "state", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<b61, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ ou2 b;
            final /* synthetic */ lk7.a c;
            final /* synthetic */ qd d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var, ou2 ou2Var, lk7.a aVar, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = ou2Var;
                this.c = aVar;
                this.d = qdVar;
            }

            public final void a(b61 b61Var) {
                z65.h(b61Var, "state");
                this.a.d.b(this.b);
                this.a.c.j(this.c, b61Var.k(), this.d);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                a(b61Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$d$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ qd b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = qdVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, "throwable");
                this.a.c.i(th.getMessage(), this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$d$d  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0710d extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0710d(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.b.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ou2 ou2Var, boolean z, lk7.a aVar, qd qdVar) {
            super(1);
            this.b = ou2Var;
            this.c = z;
            this.d = aVar;
            this.e = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.b(hnb.c(fnb.a.a(new a(w61.this, this.b, this.c)), new b(w61.this, this.b, this.d, this.e)), new c(w61.this, this.e)).a(new C0710d(w61.this));
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lb61;", "state", "Loz3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$switchToRestaurant$2", f = "CheckoutStateService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w61$d0 */
    /* loaded from: classes4.dex */
    static final class d0 extends f3b implements Function2<b61, cv1<? super oz3<? extends b61>>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ qd d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(qd qdVar, cv1<? super d0> cv1Var) {
            super(2, cv1Var);
            this.d = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(this.d, cv1Var);
            d0Var.b = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b61 b61Var, cv1<? super oz3<b61>> cv1Var) {
            return ((d0) create(b61Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b61 b61Var = (b61) this.b;
                d88 d = w61.this.d.get().d();
                if (b61Var.k().d()) {
                    return wz3.A(b61Var);
                }
                if (w61.this.e.b() && d != null) {
                    return d.G().contains(ib7.e) ? w61.this.V(wz3.A(b61Var), d, lk7.d.d, this.d, null) : w61.this.U(wz3.A(b61Var), d, lk7.d.d, this.d);
                }
                return w61.this.Z(b61Var, this.d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$e */
    /* loaded from: classes4.dex */
    public static final class e implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ d88 c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$e$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ d88 c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$selectPizzeriaInternal$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0711a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0711a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, d88 d88Var) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = d88Var;
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
                    boolean r0 = r7 instanceof defpackage.w61.e.a.C0711a
                    if (r0 == 0) goto L13
                    r0 = r7
                    w61$e$a$a r0 = (defpackage.w61.e.a.C0711a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$e$a$a r0 = new w61$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    w61 r2 = r5.b
                    d88 r4 = r5.c
                    b61 r6 = r2.C(r6, r4)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.e.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e(oz3 oz3Var, w61 w61Var, d88 d88Var) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = d88Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$f */
    /* loaded from: classes4.dex */
    public static final class f extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ d88 b;
        final /* synthetic */ lk7.d c;
        final /* synthetic */ qd d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ d88 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, d88 d88Var) {
                super(0);
                this.a = w61Var;
                this.b = d88Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.e(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "state", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<b61, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ d88 b;
            final /* synthetic */ lk7.d c;
            final /* synthetic */ qd d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var, d88 d88Var, lk7.d dVar, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = d88Var;
                this.c = dVar;
                this.d = qdVar;
            }

            public final void a(b61 b61Var) {
                z65.h(b61Var, "state");
                this.a.d.a(this.b);
                this.a.c.f(this.c, b61Var.k(), this.d);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                a(b61Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$f$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ d88 b;
            final /* synthetic */ lk7.d c;
            final /* synthetic */ qd d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var, d88 d88Var, lk7.d dVar, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = d88Var;
                this.c = dVar;
                this.d = qdVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, "throwable");
                this.a.c.e(this.b, this.c, th.getMessage(), this.d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$f$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.n.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(d88 d88Var, lk7.d dVar, qd qdVar) {
            super(1);
            this.b = d88Var;
            this.c = dVar;
            this.d = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.b(hnb.c(fnb.a.a(new a(w61.this, this.b)), new b(w61.this, this.b, this.c, this.d)), new c(w61.this, this.b, this.c, this.d)).a(new d(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$g */
    /* loaded from: classes4.dex */
    public static final class g implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ d88 c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$g$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ d88 c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$selectRestaurantPizzeriaInternal$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0712a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0712a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, d88 d88Var) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = d88Var;
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
                    boolean r0 = r7 instanceof defpackage.w61.g.a.C0712a
                    if (r0 == 0) goto L13
                    r0 = r7
                    w61$g$a$a r0 = (defpackage.w61.g.a.C0712a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$g$a$a r0 = new w61$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    w61 r2 = r5.b
                    d88 r4 = r5.c
                    b61 r6 = r2.y(r6, r4)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.g.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g(oz3 oz3Var, w61 w61Var, d88 d88Var) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = d88Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$h */
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ d88 b;
        final /* synthetic */ lk7.d c;
        final /* synthetic */ Boolean d;
        final /* synthetic */ qd e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ d88 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, d88 d88Var) {
                super(0);
                this.a = w61Var;
                this.b = d88Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.h(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "state", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$h$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<b61, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ d88 b;
            final /* synthetic */ lk7.d c;
            final /* synthetic */ Boolean d;
            final /* synthetic */ qd e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var, d88 d88Var, lk7.d dVar, Boolean bool, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = d88Var;
                this.c = dVar;
                this.d = bool;
                this.e = qdVar;
            }

            public final void a(b61 b61Var) {
                z65.h(b61Var, "state");
                this.a.d.c(this.b);
                if (this.a.f.a(bq3.d6)) {
                    this.a.c.g(this.b, this.c, this.d);
                } else {
                    this.a.c.q(this.c, b61Var.k(), this.e);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                a(b61Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$h$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ d88 b;
            final /* synthetic */ lk7.d c;
            final /* synthetic */ qd d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var, d88 d88Var, lk7.d dVar, qd qdVar) {
                super(1);
                this.a = w61Var;
                this.b = d88Var;
                this.c = dVar;
                this.d = qdVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, "throwable");
                this.a.c.p(this.b, this.c, th.getMessage(), this.d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$h$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.n.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(d88 d88Var, lk7.d dVar, Boolean bool, qd qdVar) {
            super(1);
            this.b = d88Var;
            this.c = dVar;
            this.d = bool;
            this.e = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.b(hnb.c(fnb.a.a(new a(w61.this, this.b)), new b(w61.this, this.b, this.c, this.d, this.e)), new c(w61.this, this.b, this.c, this.e)).a(new d(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$i */
    /* loaded from: classes4.dex */
    public static final class i implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ Long c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$i$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ Long c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setDeferredTime$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0713a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0713a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, Long l) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = l;
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
                    boolean r0 = r7 instanceof defpackage.w61.i.a.C0713a
                    if (r0 == 0) goto L13
                    r0 = r7
                    w61$i$a$a r0 = (defpackage.w61.i.a.C0713a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$i$a$a r0 = new w61$i$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    w61 r2 = r5.b
                    java.lang.Long r4 = r5.c
                    b61 r6 = r2.B(r6, r4)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.i.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public i(oz3 oz3Var, w61 w61Var, Long l) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = l;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$j */
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ Long b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ Long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, Long l) {
                super(0);
                this.a = w61Var;
                this.b = l;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.d(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "it", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$j$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<b61, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ Long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var, Long l) {
                super(1);
                this.a = w61Var;
                this.b = l;
            }

            public final void a(b61 b61Var) {
                z65.h(b61Var, "it");
                this.a.c.h(this.b, b61Var.f().b(), b61Var.e());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                a(b61Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.huawei.hms.push.e.a, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$j$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, com.huawei.hms.push.e.a);
                this.a.h.error("Failed to set deferred time. ", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$j$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.e.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Long l) {
            super(1);
            this.b = l;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.b(hnb.c(fnb.a.a(new a(w61.this, this.b)), new b(w61.this, this.b)), new c(w61.this)).a(new d(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$k */
    /* loaded from: classes4.dex */
    public static final class k implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ ou2.c c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$k$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ ou2.c c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setDeliveryLocationDetails$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$k$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0714a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0714a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, ou2.c cVar) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = cVar;
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
                    boolean r0 = r7 instanceof defpackage.w61.k.a.C0714a
                    if (r0 == 0) goto L13
                    r0 = r7
                    w61$k$a$a r0 = (defpackage.w61.k.a.C0714a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$k$a$a r0 = new w61$k$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    w61 r2 = r5.b
                    ou2$c r4 = r5.c
                    b61 r6 = r2.w(r6, r4)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.k.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public k(oz3 oz3Var, w61 w61Var, ou2.c cVar) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = cVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$l */
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ e91 b;
        final /* synthetic */ ou2.c c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ e91 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, e91 e91Var) {
                super(0);
                this.a = w61Var;
                this.b = e91Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.c(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "it", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$l$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<b61, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ ou2.c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var, ou2.c cVar) {
                super(1);
                this.a = w61Var;
                this.b = cVar;
            }

            public final void a(b61 b61Var) {
                z65.h(b61Var, "it");
                this.a.d.b(this.b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                a(b61Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$l$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.b.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e91 e91Var, ou2.c cVar) {
            super(1);
            this.b = e91Var;
            this.c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.c(fnb.a.a(new a(w61.this, this.b)), new b(w61.this, this.c)).a(new c(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$m */
    /* loaded from: classes4.dex */
    public static final class m implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$m$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setDeliveryTableNumber$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$m$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0715a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0715a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var) {
                this.a = pz3Var;
                this.b = w61Var;
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
                    boolean r0 = r6 instanceof defpackage.w61.m.a.C0715a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w61$m$a$a r0 = (defpackage.w61.m.a.C0715a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$m$a$a r0 = new w61$m$a$a
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
                    w61 r2 = r4.b
                    b61 r5 = r2.t(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.m.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public m(oz3 oz3Var, w61 w61Var) {
            this.a = oz3Var;
            this.b = w61Var;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$n */
    /* loaded from: classes4.dex */
    public static final class n extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, int i) {
                super(0);
                this.a = w61Var;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.f(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.huawei.hms.push.e.a, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$n$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, com.huawei.hms.push.e.a);
                this.a.h.error("Failed to set delivery table number. ", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$n$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.g.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i) {
            super(1);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            fnb b2 = hnb.b(fnb.a.a(new a(w61.this, this.b)), new b(w61.this));
            w61.this.c.k();
            return (b61) b2.a(new c(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$o */
    /* loaded from: classes4.dex */
    public static final class o implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ Long c;
        final /* synthetic */ String d;
        final /* synthetic */ boolean e;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$o$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ Long c;
            final /* synthetic */ String d;
            final /* synthetic */ boolean e;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setNewDeferredTime$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$o$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0716a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0716a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, Long l, String str, boolean z) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = l;
                this.d = str;
                this.e = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, defpackage.cv1 r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof defpackage.w61.o.a.C0716a
                    if (r0 == 0) goto L13
                    r0 = r9
                    w61$o$a$a r0 = (defpackage.w61.o.a.C0716a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$o$a$a r0 = new w61$o$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r9)
                    goto L59
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    defpackage.vk9.b(r9)
                    pz3 r9 = r7.a
                    b61 r8 = (defpackage.b61) r8
                    w61 r2 = r7.b
                    java.lang.Long r4 = r7.c
                    java.lang.String r5 = r7.d
                    boolean r6 = r7.e
                    b61 r8 = r2.o(r8, r4, r5, r6)
                    java.lang.Long r4 = r7.c
                    b61 r8 = r2.n(r8, r4)
                    java.lang.Long r4 = r7.c
                    b61 r8 = r2.v(r8, r4)
                    r0.b = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L59
                    return r1
                L59:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.o.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public o(oz3 oz3Var, w61 w61Var, Long l, String str, boolean z) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = l;
            this.d = str;
            this.e = z;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c, this.d, this.e), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$p */
    /* loaded from: classes4.dex */
    static final class p extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ Long b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$p$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ Long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, Long l) {
                super(0);
                this.a = w61Var;
                this.b = l;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.d(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb61;", "it", "", "a", "(Lb61;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$p$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<b61, Unit> {
            final /* synthetic */ w61 a;
            final /* synthetic */ Long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var, Long l) {
                super(1);
                this.a = w61Var;
                this.b = l;
            }

            public final void a(b61 b61Var) {
                z65.h(b61Var, "it");
                this.a.c.h(this.b, b61Var.f().b(), b61Var.e());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(b61 b61Var) {
                a(b61Var);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.huawei.hms.push.e.a, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$p$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, com.huawei.hms.push.e.a);
                this.a.h.error("Failed to set deferred time. ", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$p$d */
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.e.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Long l) {
            super(1);
            this.b = l;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.b(hnb.c(fnb.a.a(new a(w61.this, this.b)), new b(w61.this, this.b)), new c(w61.this)).a(new d(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$q */
    /* loaded from: classes4.dex */
    public static final class q implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$q$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setPaymentMethodIsRedirectSaveCardEnabled$$inlined$filterIsInstance$1$2", f = "CheckoutStateService.kt", l = {224}, m = "emit")
            /* renamed from: w61$q$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0717a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0717a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
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
                    boolean r0 = r6 instanceof defpackage.w61.q.a.C0717a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w61$q$a$a r0 = (defpackage.w61.q.a.C0717a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$q$a$a r0 = new w61$q$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof defpackage.jw7.b
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.q.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public q(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$r */
    /* loaded from: classes4.dex */
    public static final class r implements oz3<jw7> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$r$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setPaymentMethodIsRedirectSaveCardEnabled$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$r$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0718a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0718a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
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
                    boolean r0 = r6 instanceof defpackage.w61.r.a.C0718a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w61$r$a$a r0 = (defpackage.w61.r.a.C0718a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$r$a$a r0 = new w61$r$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    b61 r5 = (defpackage.b61) r5
                    cu7 r5 = r5.n()
                    jw7 r5 = r5.a()
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.r.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public r(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super jw7> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$s */
    /* loaded from: classes4.dex */
    public static final class s implements oz3<jw7.b> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ boolean b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$s$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ boolean b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setPaymentMethodIsRedirectSaveCardEnabled$$inlined$map$2$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$s$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0719a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0719a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, boolean z) {
                this.a = pz3Var;
                this.b = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r13, defpackage.cv1 r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof defpackage.w61.s.a.C0719a
                    if (r0 == 0) goto L13
                    r0 = r14
                    w61$s$a$a r0 = (defpackage.w61.s.a.C0719a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$s$a$a r0 = new w61$s$a$a
                    r0.<init>(r14)
                L18:
                    java.lang.Object r14 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r14)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    defpackage.vk9.b(r14)
                    pz3 r14 = r12.a
                    r4 = r13
                    jw7$b r4 = (defpackage.jw7.b) r4
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    boolean r9 = r12.b
                    r10 = 15
                    r11 = 0
                    jw7$b r13 = defpackage.jw7.b.j(r4, r5, r6, r7, r8, r9, r10, r11)
                    r0.b = r3
                    java.lang.Object r13 = r14.emit(r13, r0)
                    if (r13 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.Unit r13 = kotlin.Unit.a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.s.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public s(oz3 oz3Var, boolean z) {
            this.a = oz3Var;
            this.b = z;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super jw7.b> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljw7$b;", "cardPaymentMethod", "Loz3;", "Lb61;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setPaymentMethodIsRedirectSaveCardEnabled$3", f = "CheckoutStateService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: w61$t */
    /* loaded from: classes4.dex */
    static final class t extends f3b implements Function2<jw7.b, cv1<? super oz3<? extends b61>>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(jw7.b bVar, cv1<? super oz3<b61>> cv1Var) {
            return ((t) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return w61.this.X((jw7.b) this.b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$u */
    /* loaded from: classes4.dex */
    public static final class u implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ jw7 c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$u$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ jw7 c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setPaymentMethodLoading$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$u$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0720a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0720a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, jw7 jw7Var) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = jw7Var;
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
                    boolean r0 = r7 instanceof defpackage.w61.u.a.C0720a
                    if (r0 == 0) goto L13
                    r0 = r7
                    w61$u$a$a r0 = (defpackage.w61.u.a.C0720a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$u$a$a r0 = new w61$u$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    b61 r6 = (defpackage.b61) r6
                    w61 r2 = r5.b
                    jw7 r4 = r5.c
                    b61 r6 = r2.u(r6, r4)
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.u.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public u(oz3 oz3Var, w61 w61Var, jw7 jw7Var) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = jw7Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$v */
    /* loaded from: classes4.dex */
    public static final class v extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ jw7 b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$v$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ jw7 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, jw7 jw7Var) {
                super(0);
                this.a = w61Var;
                this.b = jw7Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.g(this.b, this.a.R());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.huawei.hms.push.e.a, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$v$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, com.huawei.hms.push.e.a);
                this.a.h.error("Failed to select payment method. ", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$v$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.j.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(jw7 jw7Var) {
            super(1);
            this.b = jw7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return (b61) hnb.b(fnb.a.a(new a(w61.this, this.b)), new b(w61.this)).a(new c(w61.this));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$w */
    /* loaded from: classes4.dex */
    public static final class w implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;
        final /* synthetic */ boolean c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$w$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;
            final /* synthetic */ boolean c;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setReusablePackageSelected$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$w$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0721a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0721a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var, boolean z) {
                this.a = pz3Var;
                this.b = w61Var;
                this.c = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r23, defpackage.cv1 r24) {
                /*
                    r22 = this;
                    r0 = r22
                    r1 = r24
                    boolean r2 = r1 instanceof defpackage.w61.w.a.C0721a
                    if (r2 == 0) goto L17
                    r2 = r1
                    w61$w$a$a r2 = (defpackage.w61.w.a.C0721a) r2
                    int r3 = r2.b
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L17
                    int r3 = r3 - r4
                    r2.b = r3
                    goto L1c
                L17:
                    w61$w$a$a r2 = new w61$w$a$a
                    r2.<init>(r1)
                L1c:
                    java.lang.Object r1 = r2.a
                    java.lang.Object r3 = defpackage.a75.d()
                    int r4 = r2.b
                    r5 = 1
                    if (r4 == 0) goto L35
                    if (r4 != r5) goto L2d
                    defpackage.vk9.b(r1)
                    goto L7c
                L2d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L35:
                    defpackage.vk9.b(r1)
                    pz3 r1 = r0.a
                    r6 = r23
                    b61 r6 = (defpackage.b61) r6
                    wo7 r4 = r6.l()
                    boolean r4 = r4 instanceof defpackage.wo7.b
                    if (r4 == 0) goto L7f
                    w61 r4 = r0.b
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    wo7 r19 = r6.l()
                    r5 = r19
                    wo7$b r5 = (defpackage.wo7.b) r5
                    boolean r15 = r0.c
                    wo7$b r19 = r5.J(r15)
                    r20 = 4095(0xfff, float:5.738E-42)
                    r21 = 0
                    r5 = 0
                    r15 = r5
                    b61 r5 = defpackage.b61.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    b61 r4 = r4.G(r5)
                    r5 = 1
                    r2.b = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L7c
                    return r3
                L7c:
                    kotlin.Unit r1 = kotlin.Unit.a
                    return r1
                L7f:
                    java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                    java.lang.String r2 = "Failed requirement."
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.w.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public w(oz3 oz3Var, w61 w61Var, boolean z) {
            this.a = oz3Var;
            this.b = w61Var;
            this.c = z;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super b61> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b, this.c), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$x */
    /* loaded from: classes4.dex */
    static final class x extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(boolean z) {
            super(1);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            return w61.this.a.b(this.b);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w61$y */
    /* loaded from: classes4.dex */
    public static final class y implements oz3<b61> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ w61 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$y$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ w61 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.checkout.state.CheckoutStateServiceImpl$setTakeaway$$inlined$map$1$2", f = "CheckoutStateService.kt", l = {223}, m = "emit")
            /* renamed from: w61$y$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0722a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0722a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, w61 w61Var) {
                this.a = pz3Var;
                this.b = w61Var;
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
                    boolean r0 = r6 instanceof defpackage.w61.y.a.C0722a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w61$y$a$a r0 = (defpackage.w61.y.a.C0722a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    w61$y$a$a r0 = new w61$y$a$a
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
                    w61 r2 = r4.b
                    b61 r5 = r2.t(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.w61.y.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public y(oz3 oz3Var, w61 w61Var) {
            this.a = oz3Var;
            this.b = w61Var;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckoutStateService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb61;", "it", "a", "(Lb61;)Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w61$z */
    /* loaded from: classes4.dex */
    public static final class z extends ej5 implements Function1<b61, b61> {
        final /* synthetic */ boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$z$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<b61> {
            final /* synthetic */ w61 a;
            final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w61 w61Var, boolean z) {
                super(0);
                this.a = w61Var;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final b61 invoke() {
                return this.a.a.a(this.b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.huawei.hms.push.e.a, "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: w61$z$b */
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, com.huawei.hms.push.e.a);
                this.a.h.error("Failed to set takeaway. ", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CheckoutStateService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lb61;", "a", "(Ljava/lang/Throwable;)Lb61;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: w61$z$c */
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<Throwable, b61> {
            final /* synthetic */ w61 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w61 w61Var) {
                super(1);
                this.a = w61Var;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final b61 invoke(Throwable th) {
                z65.h(th, "it");
                w61 w61Var = this.a;
                return w61Var.z(w61Var.R(), d41.s.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(boolean z) {
            super(1);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final b61 invoke(b61 b61Var) {
            z65.h(b61Var, "it");
            fnb b2 = hnb.b(fnb.a.a(new a(w61.this, this.b)), new b(w61.this));
            w61 w61Var = w61.this;
            w61Var.c.r(this.b);
            return (b61) b2.a(new c(w61.this));
        }
    }

    public w61(c61 c61Var, t61 t61Var, ad adVar, qi8 qi8Var, h61 h61Var, i00 i00Var, hq3 hq3Var) {
        z65.h(c61Var, "checkoutStateEditService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(adVar, "analyticsHelper");
        z65.h(qi8Var, "preferredOrderLocationService");
        z65.h(h61Var, "checkoutStateLogic");
        z65.h(i00Var, "authorizationState");
        z65.h(hq3Var, "featureService");
        this.a = c61Var;
        this.b = t61Var;
        this.c = adVar;
        this.d = qi8Var;
        this.e = i00Var;
        this.f = hq3Var;
        this.g = h61Var;
        this.h = LoggerFactory.getLogger("CheckoutStateServiceImpl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b61 R() {
        return this.b.get();
    }

    private final oz3<b61> S() {
        return wz3.z(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<b61> T(oz3<b61> oz3Var, ou2 ou2Var, lk7.a aVar, qd qdVar, boolean z2) {
        return uz3.a.c(new c(oz3Var, this, ou2Var), new d(ou2Var, z2, aVar, qdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bd8<b61> U(oz3<b61> oz3Var, d88 d88Var, lk7.d dVar, qd qdVar) {
        return uz3.a.c(new e(oz3Var, this, d88Var), new f(d88Var, dVar, qdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bd8<b61> V(oz3<b61> oz3Var, d88 d88Var, lk7.d dVar, qd qdVar, Boolean bool) {
        return uz3.a.c(new g(oz3Var, this, d88Var), new h(d88Var, dVar, bool, qdVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bd8<b61> X(jw7 jw7Var) {
        return uz3.a.c(new u(S(), this, jw7Var), new v(jw7Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<b61> Z(b61 b61Var, qd qdVar) {
        b61 E = E(b61Var);
        if (!this.f.a(bq3.d6)) {
            this.c.q(lk7.d.d, E.k(), qdVar);
        }
        return wz3.A(E);
    }

    @Override // defpackage.h61
    public b61 A(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.g.A(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 B(b61 b61Var, Long l2) {
        z65.h(b61Var, "<this>");
        return this.g.B(b61Var, l2);
    }

    @Override // defpackage.h61
    public b61 C(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.g.C(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 D(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.g.D(b61Var);
    }

    @Override // defpackage.h61
    public b61 E(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.g.E(b61Var);
    }

    @Override // defpackage.h61
    public b61 F(b61 b61Var, Collection<? extends d41> collection) {
        z65.h(b61Var, "<this>");
        z65.h(collection, "errors");
        return this.g.F(b61Var, collection);
    }

    @Override // defpackage.h61
    public b61 G(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.g.G(b61Var);
    }

    @Override // defpackage.v61
    /* renamed from: W */
    public bd8<b61> g(int i2) {
        return uz3.a.c(new m(S(), this), new n(i2));
    }

    @Override // defpackage.v61
    /* renamed from: Y */
    public bd8<b61> a(boolean z2) {
        return uz3.a.c(new y(S(), this), new z(z2));
    }

    @Override // defpackage.v61
    public oz3<b61> b(boolean z2) {
        return uz3.a.c(new w(S(), this, z2), new x(z2));
    }

    @Override // defpackage.v61
    public oz3<b61> c(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        ou2.c cVar = new ou2.c(e91Var);
        return uz3.a.c(new k(S(), this, cVar), new l(e91Var, cVar));
    }

    @Override // defpackage.v61
    public oz3<b61> d(Long l2) {
        return uz3.a.c(new i(S(), this, l2), new j(l2));
    }

    @Override // defpackage.v61
    public oz3<b61> e(ou2 ou2Var, boolean z2, lk7.a aVar, qd qdVar) {
        z65.h(ou2Var, "deliverablePlace");
        z65.h(aVar, "addressSource");
        z65.h(qdVar, "analyticsSender");
        return T(S(), ou2Var, aVar, qdVar, z2);
    }

    @Override // defpackage.v61
    public oz3<b61> f(jw7 jw7Var) {
        z65.h(jw7Var, "paymentWay");
        return X(jw7Var);
    }

    @Override // defpackage.v61
    public oz3<b61> h(d88 d88Var, lk7.d dVar, qd qdVar, Boolean bool) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, "pizzeriaSource");
        z65.h(qdVar, "analyticsSender");
        return V(S(), d88Var, dVar, qdVar, bool);
    }

    @Override // defpackage.v61
    public oz3<b61> i(d88 d88Var, lk7.d dVar, qd qdVar) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, "pizzeriaSource");
        z65.h(qdVar, "analyticsSender");
        return U(S(), d88Var, dVar, qdVar);
    }

    @Override // defpackage.v61
    public oz3<b61> j(qd qdVar) {
        z65.h(qdVar, "analyticsSender");
        return wz3.x(wz3.F(S(), new c0(null)), new d0(qdVar, null));
    }

    @Override // defpackage.h61
    public b61 k(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.g.k(b61Var);
    }

    @Override // defpackage.v61
    public oz3<b61> l(boolean z2) {
        return wz3.x(new s(new q(wz3.t(new r(S()))), z2), new t(null));
    }

    @Override // defpackage.v61
    public oz3<b61> m() {
        return new b(S(), this);
    }

    @Override // defpackage.h61
    public b61 n(b61 b61Var, Long l2) {
        z65.h(b61Var, "<this>");
        return this.g.n(b61Var, l2);
    }

    @Override // defpackage.h61
    public b61 o(b61 b61Var, Long l2, String str, boolean z2) {
        z65.h(b61Var, "<this>");
        z65.h(str, "title");
        return this.g.o(b61Var, l2, str, z2);
    }

    @Override // defpackage.v61
    public oz3<b61> p(qd qdVar) {
        z65.h(qdVar, "analyticsSender");
        return wz3.x(wz3.F(S(), new a0(null)), new b0(qdVar, null));
    }

    @Override // defpackage.v61
    public oz3<b61> r(b61 b61Var, Long l2, String str, boolean z2, boolean z3) {
        z65.h(b61Var, "currentState");
        z65.h(str, "title");
        this.h.trace("Set deferred time");
        return uz3.a.c(new o(wz3.A(b61Var), this, l2, str, z2), new p(l2));
    }

    @Override // defpackage.h61
    public b61 t(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.g.t(b61Var);
    }

    @Override // defpackage.h61
    public b61 u(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.g.u(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 v(b61 b61Var, Long l2) {
        z65.h(b61Var, "<this>");
        return this.g.v(b61Var, l2);
    }

    @Override // defpackage.h61
    public b61 w(b61 b61Var, ou2 ou2Var) {
        z65.h(b61Var, "<this>");
        z65.h(ou2Var, "deliverablePlace");
        return this.g.w(b61Var, ou2Var);
    }

    @Override // defpackage.h61
    public b61 x(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.g.x(b61Var);
    }

    @Override // defpackage.h61
    public b61 y(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.g.y(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 z(b61 b61Var, d41 d41Var) {
        z65.h(b61Var, "<this>");
        z65.h(d41Var, "error");
        return this.g.z(b61Var, d41Var);
    }
}
