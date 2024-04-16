package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaEntity;
import com.dodopizza.persistence.entity.prizoteka.PrizotekaLevelEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderSummaryInteractor.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001\u001bBk\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\b\b\u0001\u0010H\u001a\u00020E¢\u0006\u0004\bI\u0010JJ \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00112\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lnj7;", "Lmj7;", "Lox1;", "", "Lsv5;", "items", "Ltv5;", "t", "Lbc7;", "activeOrder", "Ldta;", "u", "", "orderId", "Lwx;", "", "b", "Loz3;", "Ldk7;", DateTokenConverter.CONVERTER_KEY, "Lqd;", "sender", "Lcom/dodopizza/async/AsyncJob;", com.huawei.hms.push.e.a, "Lhn6;", "totalPrice", "Lik8;", "a", "Lxf8;", com.huawei.hms.opendevice.c.a, "Lgc;", "Lgc;", "analytics", "Lqi7;", "Lqi7;", "orderStateVOConverter", "Lli7;", "Lli7;", "orderService", "Lf5b;", "Lf5b;", "systemTimeProvider", "Le78;", "Le78;", "pizzaConceptService", "Lkr3;", "f", "Lkr3;", "feedbackService", "Lcz6;", "g", "Lcz6;", "noGlovesService", "Lhk7;", Image.TYPE_HIGH, "Lhk7;", "orderTrackingPhoneConverter", "Lava;", "i", "Lava;", "stateProvider", "Lhq3;", "j", "Lhq3;", "featureService", "Lx26;", "k", "Lx26;", "loyaltyService", "Lkx1;", "l", "Lkx1;", "ioDispatcher", "<init>", "(Lgc;Lqi7;Lli7;Lf5b;Le78;Lkr3;Lcz6;Lhk7;Lava;Lhq3;Lx26;Lkx1;)V", Image.TYPE_MEDIUM, "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nj7  reason: default package */
/* loaded from: classes.dex */
public final class nj7 implements mj7, ox1 {
    public static final a m = new a(null);
    private static final long n;
    private static final long o;
    private final gc a;
    private final qi7 b;
    private final li7 c;
    private final f5b d;
    private final e78 e;
    private final kr3 f;
    private final cz6 g;
    private final hk7 h;
    private final ava i;
    private final hq3 j;
    private final x26 k;
    private final kx1 l;

    /* compiled from: OrderSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lnj7$a;", "", "", "UPDATE_ORDERS_INTERVAL_MILLIS", "J", "UPDATE_POSITION_COURIER_INTERVAL_MILLIS", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nj7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OrderSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryInteractorImpl$cancelOrder$1", f = "OrderSummaryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nj7$b */
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                nj7.this.c.b(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lik8;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryInteractorImpl$getNiceBonusCurrentLevelInfo$1", f = "OrderSummaryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nj7$c */
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function1<cv1<? super ik8>, Object> {
        int a;
        final /* synthetic */ hn6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hn6 hn6Var, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = hn6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ik8> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                PrizotekaEntity prizoteka = nj7.this.i.e().getPrizoteka();
                if (prizoteka != null) {
                    hn6 hn6Var = this.c;
                    hk8 hk8Var = hk8.a;
                    k0<PrizotekaLevelEntity> levels = prizoteka.getLevels();
                    w = lc1.w(levels, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (PrizotekaLevelEntity prizotekaLevelEntity : levels) {
                        arrayList.add(new jk8(prizotekaLevelEntity.getMinCartValue(), prizotekaLevelEntity.getProgressDescription(), prizotekaLevelEntity.getGiftDescription()));
                    }
                    return hk8Var.a(arrayList, hn6Var);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lxf8;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryInteractorImpl$getPositionCourier$1", f = "OrderSummaryInteractor.kt", l = {183, 194}, m = "invokeSuspend")
    /* renamed from: nj7$d */
    /* loaded from: classes.dex */
    static final class d extends f3b implements Function2<pz3<? super xf8>, cv1<? super Unit>, Object> {
        Object a;
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.e = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.e, cv1Var);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super xf8> pz3Var, cv1<? super Unit> cv1Var) {
            return ((d) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008f -> B:11:0x0036). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r11.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r11.c
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r12)
                r12 = r11
                r4 = r1
                goto L36
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                java.lang.Object r1 = r11.a
                wf8 r1 = (defpackage.wf8) r1
                java.lang.Object r4 = r11.c
                pz3 r4 = (defpackage.pz3) r4
                defpackage.vk9.b(r12)
                r12 = r11
                goto L60
            L2d:
                defpackage.vk9.b(r12)
                java.lang.Object r12 = r11.c
                pz3 r12 = (defpackage.pz3) r12
                r4 = r12
                r12 = r11
            L36:
                nj7 r1 = defpackage.nj7.this
                li7 r1 = defpackage.nj7.k(r1)
                java.lang.String r5 = r12.e
                wf8 r1 = r1.c(r5)
                if (r1 == 0) goto L60
                xf8 r5 = new xf8
                java.lang.String r6 = r12.e
                java.lang.Double r7 = r1.a()
                java.lang.Double r8 = r1.b()
                r5.<init>(r6, r7, r8)
                r12.c = r4
                r12.a = r1
                r12.b = r3
                java.lang.Object r5 = r4.emit(r5, r12)
                if (r5 != r0) goto L60
                return r0
            L60:
                r5 = 0
                if (r1 == 0) goto L81
                java.lang.Long r1 = r1.c()
                if (r1 == 0) goto L81
                long r6 = r1.longValue()
                r8 = 0
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 <= 0) goto L74
                goto L75
            L74:
                r1 = r5
            L75:
                if (r1 == 0) goto L81
                long r6 = r1.longValue()
                r1 = 1000(0x3e8, float:1.401E-42)
                long r8 = (long) r1
                long r6 = r6 * r8
                goto L85
            L81:
                long r6 = defpackage.nj7.q()
            L85:
                r12.c = r4
                r12.a = r5
                r12.b = r2
                java.lang.Object r1 = defpackage.xt2.a(r6, r12)
                if (r1 != r0) goto L36
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nj7.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: OrderSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ldk7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryInteractorImpl$observeOrderSummary$1", f = "OrderSummaryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nj7$e */
    /* loaded from: classes.dex */
    static final class e extends f3b implements Function1<cv1<? super dk7>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super dk7> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            String str;
            gg7 gg7Var;
            gg7 gg7Var2;
            String str2;
            int w2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 bc7Var = (bc7) mh5.c(nj7.this.c.g(this.c), bc7.B.a());
                String t = bc7Var.t();
                int e = bc7Var.e();
                pi7 a = nj7.this.b.a(bc7Var);
                int i = 0;
                for (yf7 yf7Var : bc7Var.u()) {
                    i += yf7Var.j();
                }
                hn6 D = bc7Var.D();
                String h = bc7Var.h();
                jk7 a2 = jk7.b.a(bc7Var.E());
                String I = bc7Var.I();
                boolean i2 = bc7Var.i();
                boolean K = bc7Var.K();
                boolean J = bc7Var.J();
                long x = bc7Var.x() - nj7.this.d.b();
                long v = bc7Var.v();
                long w3 = bc7Var.w();
                List<yf7> u = bc7Var.u();
                nj7 nj7Var = nj7.this;
                w = lc1.w(u, 10);
                ArrayList arrayList = new ArrayList(w);
                Iterator it = u.iterator();
                while (it.hasNext()) {
                    yf7 yf7Var2 = (yf7) it.next();
                    String p = yf7Var2.p();
                    kl8 l = yf7Var2.l();
                    int o = yf7Var2.o();
                    String h2 = yf7Var2.h();
                    hn6 k = yf7Var2.k();
                    boolean r = yf7Var2.r();
                    String m = yf7Var2.m();
                    String n = yf7Var2.n();
                    if (n == null) {
                        str2 = "";
                    } else {
                        str2 = n;
                    }
                    nb6 i3 = yf7Var2.i();
                    List<bg7> c = yf7Var2.d().c();
                    Iterator it2 = it;
                    boolean z = i2;
                    w2 = lc1.w(c, 10);
                    ArrayList arrayList2 = new ArrayList(w2);
                    for (bg7 bg7Var : c) {
                        arrayList2.add(bg7Var.a());
                    }
                    arrayList.add(new eg7(p, l, o, h2, k, r, m, str2, i3, arrayList2, nj7Var.e.a()));
                    it = it2;
                    i2 = z;
                }
                boolean z2 = i2;
                hk7 hk7Var = nj7.this.h;
                String E = bc7Var.B().E();
                if (E == null) {
                    E = "";
                }
                com.dodopizza.activeorder.feature.ordersummary.presentation.b a3 = hk7Var.a(E, nj7.this.f.a());
                String a4 = nj7.this.g.a();
                Integer C = bc7Var.C();
                d88 B = bc7Var.B();
                String H = bc7Var.H();
                fg7 q = bc7Var.q();
                if (q != null) {
                    str = I;
                    gg7Var = new gg7(q.a(), q.b());
                } else {
                    str = I;
                    gg7Var = null;
                }
                fg7 G = bc7Var.G();
                if (G != null) {
                    gg7Var2 = new gg7(G.a(), G.b());
                } else {
                    gg7Var2 = null;
                }
                return new dk7(t, e, a, i, D, h, a2, str, z2, K, J, x, v, w3, arrayList, a3, a4, C, B, H, nj7.this.u(bc7Var), gg7Var, gg7Var2, nj7.this.t(bc7Var.p()), nj7.this.t(bc7Var.F()), nj7.this.t(bc7Var.k()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.activeorder.feature.ordersummary.presentation.OrderSummaryInteractorImpl$trackOrderScreen$1", f = "OrderSummaryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nj7$f */
    /* loaded from: classes.dex */
    static final class f extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ qd d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, qd qdVar, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = qdVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 g = nj7.this.c.g(this.c);
                if (g != null) {
                    nj7.this.a.a(new ec7(g, this.d));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n = timeUnit.toMillis(15L);
        o = timeUnit.toMillis(30L);
    }

    public nj7(gc gcVar, qi7 qi7Var, li7 li7Var, f5b f5bVar, e78 e78Var, kr3 kr3Var, cz6 cz6Var, hk7 hk7Var, ava avaVar, hq3 hq3Var, x26 x26Var, kx1 kx1Var) {
        z65.h(gcVar, "analytics");
        z65.h(qi7Var, "orderStateVOConverter");
        z65.h(li7Var, "orderService");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(kr3Var, "feedbackService");
        z65.h(cz6Var, "noGlovesService");
        z65.h(hk7Var, "orderTrackingPhoneConverter");
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(x26Var, "loyaltyService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = gcVar;
        this.b = qi7Var;
        this.c = li7Var;
        this.d = f5bVar;
        this.e = e78Var;
        this.f = kr3Var;
        this.g = cz6Var;
        this.h = hk7Var;
        this.i = avaVar;
        this.j = hq3Var;
        this.k = x26Var;
        this.l = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<tv5> t(List<sv5> list) {
        int w;
        tv5 tv5Var;
        List<sv5> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (sv5 sv5Var : list2) {
            if (sv5Var != null) {
                tv5Var = new tv5(sv5Var.b(), sv5Var.c(), sv5Var.a());
            } else {
                tv5Var = null;
            }
            arrayList.add(tv5Var);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dta u(bc7 bc7Var) {
        boolean y;
        Object Z;
        try {
            if (this.j.a(bq3.t6)) {
                y = l0b.y(bc7Var.H());
                if (!(!y) || !this.k.b(bc7Var.H()).g()) {
                    return null;
                }
                Z = sc1.Z(bc7Var.s());
                return new dta((oc4) Z);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.mj7
    public wx<ik8> a(hn6 hn6Var) {
        z65.h(hn6Var, "totalPrice");
        return r(new c(hn6Var, null));
    }

    @Override // defpackage.mj7
    public wx<Unit> b(String str) {
        z65.h(str, "orderId");
        return r(new b(str, null));
    }

    @Override // defpackage.mj7
    public oz3<xf8> c(String str) {
        z65.h(str, "orderId");
        return wz3.B(wz3.z(new d(str, null)), this.l);
    }

    @Override // defpackage.mj7
    public oz3<dk7> d(String str) {
        z65.h(str, "orderId");
        return wz3.B(uz3.a.d(n, new e(str, null)), this.l);
    }

    @Override // defpackage.mj7
    public wx<Unit> e(String str, qd qdVar) {
        z65.h(str, "orderId");
        z65.h(qdVar, "sender");
        return s(new f(str, qdVar, null));
    }

    public <T> wx<T> r(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> s(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
