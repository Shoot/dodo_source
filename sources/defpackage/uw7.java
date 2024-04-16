package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.jw7;
import defpackage.qm;
import defpackage.tt9;
import defpackage.xm;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
/* compiled from: PaymentWayService.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 .2\u00020\u0001:\u0001\u0007B?\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010+\u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!¨\u0006/"}, d2 = {"Luw7;", "Ltw7;", "", "Ljw7;", "paymentWays", "", com.huawei.hms.opendevice.c.a, "a", "Lqw7;", "Lqw7;", "paymentWayRepository", "Lsp0;", "b", "Lsp0;", "cardRepository", "Ldh4;", "Ldh4;", "googlePaymentService", "Lut9;", DateTokenConverter.CONVERTER_KEY, "Lut9;", "sberPayFeatureStateResolver", "Lrm;", com.huawei.hms.push.e.a, "Lrm;", "app2AppFeatureStateResolver", "Lkw7;", "f", "Lkw7;", "paymentWayAcquirerFilter", "Lkotlin/Function1;", "", "g", "Lkotlin/jvm/functions/Function1;", "newCardAvailabilityFilter", Image.TYPE_HIGH, "googlePayAvailabilityFilter", "i", "sberPayAvailabilityFilter", "j", "kaspiPayAvailabilityFilter", "k", "momoAvailabilityFilter", "isNewCardPaymentEnabled", "<init>", "(Lqw7;Lsp0;Ldh4;Lut9;Lrm;Lkw7;Z)V", "l", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: uw7  reason: default package */
/* loaded from: classes2.dex */
public final class uw7 implements tw7 {
    public static final a l = new a(null);
    private static final du7[] m = {du7.h, du7.j};
    private final qw7 a;
    private final sp0 b;
    private final dh4 c;
    private final ut9 d;
    private final rm e;
    private final kw7 f;
    private final Function1<jw7, Boolean> g;
    private final Function1<jw7, Boolean> h;
    private final Function1<jw7, Boolean> i;
    private final Function1<jw7, Boolean> j;
    private final Function1<jw7, Boolean> k;

    /* compiled from: PaymentWayService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Luw7$a;", "", "", "Ldu7;", "UNSUPPORTED_CARD_PAYMENT_TYPE", "[Ldu7;", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: uw7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PaymentWayService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw7;", "paymentWay", "", "a", "(Ljw7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uw7$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<jw7, Boolean> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(jw7 jw7Var) {
            boolean z;
            z65.h(jw7Var, "paymentWay");
            if ((jw7Var instanceof jw7.e) && !uw7.this.c.a(jw7Var)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PaymentWayService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw7;", "paymentWay", "", "a", "(Ljw7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uw7$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<jw7, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(jw7 jw7Var) {
            boolean z;
            z65.h(jw7Var, "paymentWay");
            if ((jw7Var instanceof jw7.a) && z65.c(((jw7.a) jw7Var).i().i(), "kaspi") && !(uw7.this.e.a(xm.a.a) instanceof qm.b)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PaymentWayService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw7;", "paymentWay", "", "a", "(Ljw7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uw7$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<jw7, Boolean> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(jw7 jw7Var) {
            boolean z;
            z65.h(jw7Var, "paymentWay");
            if ((jw7Var instanceof jw7.a) && z65.c(((jw7.a) jw7Var).i().i(), "momo") && !(uw7.this.e.a(xm.b.a) instanceof qm.b)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PaymentWayService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw7;", "it", "", "a", "(Ljw7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uw7$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<jw7, Boolean> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(jw7 jw7Var) {
            boolean z;
            boolean A;
            z65.h(jw7Var, "it");
            if (!this.a) {
                A = yr.A(uw7.m, jw7Var.c());
                if (A) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PaymentWayService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw7;", "paymentWay", "", "a", "(Ljw7;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: uw7$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<jw7, Boolean> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(jw7 jw7Var) {
            boolean z;
            z65.h(jw7Var, "paymentWay");
            if ((jw7Var instanceof jw7.h) && !(uw7.this.d.a() instanceof tt9.b)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public uw7(qw7 qw7Var, sp0 sp0Var, dh4 dh4Var, ut9 ut9Var, rm rmVar, kw7 kw7Var, boolean z) {
        z65.h(qw7Var, "paymentWayRepository");
        z65.h(sp0Var, "cardRepository");
        z65.h(dh4Var, "googlePaymentService");
        z65.h(ut9Var, "sberPayFeatureStateResolver");
        z65.h(rmVar, "app2AppFeatureStateResolver");
        z65.h(kw7Var, "paymentWayAcquirerFilter");
        this.a = qw7Var;
        this.b = sp0Var;
        this.c = dh4Var;
        this.d = ut9Var;
        this.e = rmVar;
        this.f = kw7Var;
        this.g = new e(z);
        this.h = new b();
        this.i = new f();
        this.j = new c();
        this.k = new d();
    }

    @Override // defpackage.tw7
    public Collection<jw7> a() {
        Sequence P;
        Sequence j;
        Sequence j2;
        Sequence j3;
        Sequence j4;
        Sequence j5;
        List s;
        P = sc1.P(this.a.b());
        j = dca.j(P, this.i);
        j2 = dca.j(j, this.j);
        j3 = dca.j(j2, this.k);
        j4 = dca.j(j3, this.h);
        j5 = dca.j(j4, this.g);
        s = dca.s(j5);
        return s;
    }

    @Override // defpackage.tw7
    public void c(Collection<? extends jw7> collection) {
        z65.h(collection, "paymentWays");
        Collection<jw7> a2 = this.f.a(collection);
        this.a.clear();
        this.b.clear();
        this.a.save(a2);
    }
}
