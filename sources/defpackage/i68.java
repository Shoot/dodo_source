package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.g00;
import defpackage.lz;
import defpackage.ox1;
import defpackage.tmb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PinCodeLoginInteractor.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>¢\u0006\u0004\bG\u0010HJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\u0018\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b2\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010F\u001a\n C*\u0004\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, d2 = {"Li68;", "Lox1;", "", "pin", "phoneNumber", "Lwx;", "Lg00$a;", "p", "Ln42;", "q", "", "Lcom/dodopizza/async/AsyncJob;", "r", "Lru/dodopizza/app/presentation/phonenumberlogin/e$a;", "loginRequestContext", "", "isNewUser", Image.TYPE_SMALL, "Lt52;", "a", "Lt52;", "customerService", "Lg00;", "b", "Lg00;", "authorizationService", "Lcl6;", com.huawei.hms.opendevice.c.a, "Lcl6;", "mindboxService", "Ldua;", DateTokenConverter.CONVERTER_KEY, "Ldua;", "stateAnalyzer", "Lgc;", e.a, "Lgc;", "analytics", "Lxda;", "f", "Lxda;", "servicePushService", "Lvg7;", "g", "Lvg7;", "orderPizzeriaStateService", "Lru/dodopizza/app/presentation/phonenumberlogin/a;", Image.TYPE_HIGH, "Lru/dodopizza/app/presentation/phonenumberlogin/a;", "analyticsSenderMapper", "Ldt5;", "i", "Ldt5;", "currentLocality", "Lay1;", "j", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lv53;", "k", "Lv53;", "domainState", "Lx42;", "l", "Lx42;", "customerAddressService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lt52;Lg00;Lcl6;Ldua;Lgc;Lxda;Lvg7;Lru/dodopizza/app/presentation/phonenumberlogin/a;Ldt5;Lay1;Lv53;Lx42;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: i68  reason: default package */
/* loaded from: classes4.dex */
public final class i68 implements ox1 {
    private final t52 a;
    private final g00 b;
    private final cl6 c;
    private final dua d;
    private final gc e;
    private final xda f;
    private final vg7 g;
    private final ru.dodopizza.app.presentation.phonenumberlogin.a h;
    private final dt5 i;
    private final ay1 j;
    private final v53 k;
    private final x42 l;
    private final Logger m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lg00$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginInteractor$authorize$1", f = "PinCodeLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: i68$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function1<cv1<? super g00.a>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super g00.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                g00.a a = i68.this.b.a(this.c, this.d, i68.this.a.f(), i68.this.i);
                try {
                    t52.C(i68.this.a, false, 1, null);
                    i68.this.d.c();
                    i68.this.l.a(i68.this.k.j());
                } catch (Throwable th) {
                    i68.this.m.error("Failed to update customer", th);
                }
                return a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ln42;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginInteractor$getCustomer$1", f = "PinCodeLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: i68$b */
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super n42>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super n42> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return i68.this.a.f();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginInteractor$sendSms$1", f = "PinCodeLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: i68$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                i68.this.b.h(this.c, i68.this.i);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinCodeLoginInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginInteractor$trackLogin$1", f = "PinCodeLoginInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: i68$d */
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e.a c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e.a aVar, boolean z, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = aVar;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                i68.this.e.a(new lz.d(i68.this.h.a(this.c), i68.this.g.b(), this.d));
                i68.this.c.d(f52.b(i68.this.a.f()));
                i68.this.c.b(i68.this.i.getName(), i68.this.j.getName());
                i68.this.f.c();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i68(t52 t52Var, g00 g00Var, cl6 cl6Var, dua duaVar, gc gcVar, xda xdaVar, vg7 vg7Var, ru.dodopizza.app.presentation.phonenumberlogin.a aVar, dt5 dt5Var, ay1 ay1Var, v53 v53Var, x42 x42Var) {
        z65.h(t52Var, "customerService");
        z65.h(g00Var, "authorizationService");
        z65.h(cl6Var, "mindboxService");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(gcVar, "analytics");
        z65.h(xdaVar, "servicePushService");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(aVar, "analyticsSenderMapper");
        z65.h(dt5Var, "currentLocality");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(v53Var, "domainState");
        z65.h(x42Var, "customerAddressService");
        this.a = t52Var;
        this.b = g00Var;
        this.c = cl6Var;
        this.d = duaVar;
        this.e = gcVar;
        this.f = xdaVar;
        this.g = vg7Var;
        this.h = aVar;
        this.i = dt5Var;
        this.j = ay1Var;
        this.k = v53Var;
        this.l = x42Var;
        this.m = LoggerFactory.getLogger("PinCodeLoginInteractor");
    }

    public <T> wx<T> n(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> o(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<g00.a> p(String str, String str2) {
        z65.h(str, "pin");
        z65.h(str2, "phoneNumber");
        return n(new a(str, str2, null));
    }

    public final wx<n42> q() {
        return n(new b(null));
    }

    public final wx<Unit> r(String str) {
        z65.h(str, "phoneNumber");
        return o(new c(str, null));
    }

    public final wx<Unit> s(e.a aVar, boolean z) {
        z65.h(aVar, "loginRequestContext");
        return o(new d(aVar, z, null));
    }
}
