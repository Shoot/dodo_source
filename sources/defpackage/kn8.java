package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.b;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.fda;
import defpackage.ox1;
import defpackage.zw9;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ProfileInteractor.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001 B\u008b\u0001\b\u0007\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A\u0012\u0006\u0010H\u001a\u00020E\u0012\u0006\u0010L\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020Q\u0012\u0006\u0010X\u001a\u00020U\u0012\u0006\u0010\\\u001a\u00020Y\u0012\u0006\u0010`\u001a\u00020]\u0012\b\b\u0001\u0010d\u001a\u00020a¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010J\u0010\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u0011J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u001c\u001a\u00020\u001aJ\u0018\u0010 \u001a\f\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u00112\u0006\u0010\u001f\u001a\u00020\u001eJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0010J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0010J\u0010\u0010%\u001a\u00020\rH\u0086@¢\u0006\u0004\b%\u0010\u000fR\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001c\u0010i\u001a\n f*\u0004\u0018\u00010e0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006m"}, d2 = {"Lkn8;", "Lox1;", "Lx06;", "mission", "Lul6;", "C", "", "A", "B", "Loz3;", "", "Lwl7;", "D", "", "G", "(Lcv1;)Ljava/lang/Object;", "Lwx;", "Lcom/dodopizza/async/AsyncJob;", "H", "Lem6;", "v", "F", "Llp7;", "w", "Lgub;", "z", "", "x", "milliseconds", "E", "", "missionId", "a", "Liv2;", "u", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "y", "I", "Lt52;", "Lt52;", "customerService", "Lli7;", "b", "Lli7;", "orderService", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lf5b;", DateTokenConverter.CONVERTER_KEY, "Lf5b;", "systemTimeProvider", "Lfda;", com.huawei.hms.push.e.a, "Lfda;", "dateTimeParser", "Li00;", "f", "Li00;", "authorizationState", "Lgc;", "g", "Lgc;", "analytics", "Lqi7;", Image.TYPE_HIGH, "Lqi7;", "orderStateVOConverter", "Lld9;", "i", "Lld9;", "remoteConfigService", "Lx26;", "j", "Lx26;", "loyaltyService", "Lto8;", "k", "Lto8;", "profileSubscriptionService", "Ljv2;", "l", "Ljv2;", "deliveryAddressListDataFactory", "Lf5a;", Image.TYPE_MEDIUM, "Lf5a;", "selectDeliveryAddressDataFactory", "Lx42;", "n", "Lx42;", "customerAddressService", "Lv52;", "o", "Lv52;", "customerSettingsService", "Lkx1;", "p", "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "q", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lt52;Lli7;Lhq3;Lf5b;Lfda;Li00;Lgc;Lqi7;Lld9;Lx26;Lto8;Ljv2;Lf5a;Lx42;Lv52;Lkx1;)V", "r", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kn8  reason: default package */
/* loaded from: classes4.dex */
public final class kn8 implements ox1 {
    public static final a r = new a(null);
    private static final long s;
    private static final long t;
    private static final long u;
    private final t52 a;
    private final li7 b;
    private final hq3 c;
    private final f5b d;
    private final fda e;
    private final i00 f;
    private final gc g;
    private final qi7 h;
    private final ld9 i;
    private final x26 j;
    private final to8 k;
    private final jv2 l;
    private final f5a m;
    private final x42 n;
    private final v52 o;
    private final kx1 p;
    private final Logger q;

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lkn8$a;", "", "", "COINS_SOON_EXPIRATION_DATE_IN_MILLIS", "J", "", "MAX_REFERRAL_ANIM_COUNTER", "I", "MISSION_SOON_EXPIRATION_DATE_IN_MILLIS", "UPDATE_ORDERS_INTERVAL_MILLIS", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kn8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$acceptMission$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$b */
    /* loaded from: classes4.dex */
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
                kn8.this.g.a(new p26(this.c, u26.b));
                kn8.this.j.c(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$getDeliveryAddressListData$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super iv2>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super iv2> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return kn8.this.l.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lem6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$getLoyaltyMissionsInfo$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$d */
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function1<cv1<? super em6>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super em6> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                t16 loyaltyMissionsInfo = kn8.this.j.getLoyaltyMissionsInfo();
                String a = loyaltyMissionsInfo.a();
                List<x06> b = loyaltyMissionsInfo.b();
                kn8 kn8Var = kn8.this;
                w = lc1.w(b, 10);
                ArrayList arrayList = new ArrayList(w);
                for (x06 x06Var : b) {
                    arrayList.add(kn8Var.C(x06Var));
                }
                return new em6(a, arrayList);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Llp7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$getPaidOrderState$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$e */
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function1<cv1<? super lp7>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super lp7> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return kn8.this.b.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$getPreviousSubscriptionTime$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$f */
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function1<cv1<? super Long>, Object> {
        int a;

        f(cv1<? super f> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Long> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.d(kn8.this.k.a(kn8.this.a.f().m().toString()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$getSelectDeliveryAddressData$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$g */
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function1<cv1<? super com.dodopizza.geo.feature.selectdeliveryaddress.b>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super com.dodopizza.geo.feature.selectdeliveryaddress.b> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return kn8.this.m.a(new b.a.c(true), zo9.S2.d(), ck1.q);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lgub;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$getUserData$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$h */
    /* loaded from: classes4.dex */
    static final class h extends f3b implements Function1<cv1<? super gub>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super gub> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (kn8.this.c.a(bq3.U4)) {
                    str = kn8.this.i.a("profile_message_of_the_day");
                } else {
                    str = "";
                }
                String str2 = str;
                boolean z4 = false;
                if (kn8.this.f.b() && kn8.this.c.a(bq3.T5) && kn8.this.c.a(bq3.X5)) {
                    z = kn8.this.A();
                } else {
                    z = false;
                }
                boolean a = kn8.this.c.a(bq3.l6);
                int a2 = kn8.this.o.a("referral_widget_anim_counter");
                if (a && a2 <= 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean b = kn8.this.f.b();
                n42 f = kn8.this.a.f();
                hq3 hq3Var = kn8.this.c;
                bq3 bq3Var = bq3.u;
                boolean a3 = hq3Var.a(bq3Var);
                if (kn8.this.c.a(bq3Var) && kn8.this.c.a(bq3.e5)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kn8.this.c.a(bq3Var) && kn8.this.c.a(bq3.k6)) {
                    z4 = true;
                }
                return new gub(b, f, str2, new fub(a3, z, z3, z4, a, z2, kn8.this.B()), kn8.this.n.getAll().size());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lwl7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$observeActiveOrders$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$i */
    /* loaded from: classes4.dex */
    static final class i extends f3b implements Function1<cv1<? super List<? extends wl7>>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<wl7>> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection<bc7> activeOrders = kn8.this.b.getActiveOrders();
                kn8 kn8Var = kn8.this;
                w = lc1.w(activeOrders, 10);
                ArrayList arrayList = new ArrayList(w);
                for (bc7 bc7Var : activeOrders) {
                    arrayList.add(new wl7(bc7Var, kn8Var.h.a(bc7Var), bc7Var.x() - kn8Var.d.b()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$setPreviousSubscriptionTime$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$j */
    /* loaded from: classes4.dex */
    static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.c = j;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                kn8.this.k.b(kn8.this.a.f().m().toString(), this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$subscribeToPersonalOffers$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$k */
    /* loaded from: classes4.dex */
    static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                kn8.this.a.x(true);
                kn8.this.g.a(new yx6(xx6.b, zx6.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$trackProfileFirstOpening$2", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$l */
    /* loaded from: classes4.dex */
    static final class l extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new l(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((l) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int a = kn8.this.o.a("referral_widget_anim_counter");
                if (a <= 3) {
                    kn8.this.o.d("referral_widget_anim_counter", a + 1);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$trackProfileOpening$1", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$m */
    /* loaded from: classes4.dex */
    static final class m extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((m) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            double d;
            int i;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (kn8.this.f.b() && kn8.this.c.a(bq3.u)) {
                    d = kn8.this.a.f().k();
                    i = kn8.this.a.k().size();
                } else {
                    d = -1.0d;
                    i = -1;
                }
                kn8.this.g.a(new zw9.h(d, i));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.profile.ProfileInteractor$trackReferralScreenOpen$2", f = "ProfileInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: kn8$n */
    /* loaded from: classes4.dex */
    static final class n extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((n) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                kn8.this.o.d("referral_widget_anim_counter", 3);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        s = timeUnit.toMillis(2L);
        t = timeUnit.toMillis(14L);
        u = TimeUnit.SECONDS.toMillis(15L);
    }

    public kn8(t52 t52Var, li7 li7Var, hq3 hq3Var, f5b f5bVar, fda fdaVar, i00 i00Var, gc gcVar, qi7 qi7Var, ld9 ld9Var, x26 x26Var, to8 to8Var, jv2 jv2Var, f5a f5aVar, x42 x42Var, v52 v52Var, kx1 kx1Var) {
        z65.h(t52Var, "customerService");
        z65.h(li7Var, "orderService");
        z65.h(hq3Var, "featureService");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(fdaVar, "dateTimeParser");
        z65.h(i00Var, "authorizationState");
        z65.h(gcVar, "analytics");
        z65.h(qi7Var, "orderStateVOConverter");
        z65.h(ld9Var, "remoteConfigService");
        z65.h(x26Var, "loyaltyService");
        z65.h(to8Var, "profileSubscriptionService");
        z65.h(jv2Var, "deliveryAddressListDataFactory");
        z65.h(f5aVar, "selectDeliveryAddressDataFactory");
        z65.h(x42Var, "customerAddressService");
        z65.h(v52Var, "customerSettingsService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = t52Var;
        this.b = li7Var;
        this.c = hq3Var;
        this.d = f5bVar;
        this.e = fdaVar;
        this.f = i00Var;
        this.g = gcVar;
        this.h = qi7Var;
        this.i = ld9Var;
        this.j = x26Var;
        this.k = to8Var;
        this.l = jv2Var;
        this.m = f5aVar;
        this.n = x42Var;
        this.o = v52Var;
        this.p = kx1Var;
        this.q = LoggerFactory.getLogger("ProfileInteractor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A() {
        try {
            Collection<wa1> a2 = this.j.a().a();
            if ((a2 instanceof Collection) && a2.isEmpty()) {
                return false;
            }
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                if (fda.a.a(this.e, ((wa1) it.next()).b(), null, 2, null) - Calendar.getInstance().getTimeInMillis() <= t) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            this.q.error("Failed to get coins soon expiration", (Throwable) e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B() {
        try {
            if (this.c.a(bq3.k6) || !this.c.a(bq3.n6)) {
                return false;
            }
            return this.j.getEnterCodeAvailability();
        } catch (Exception e2) {
            this.q.error("Failed to get enter code available", (Throwable) e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ul6 C(x06 x06Var) {
        kn3 kn3Var;
        boolean z;
        if (x06Var.b() != null) {
            fda fdaVar = this.e;
            String b2 = x06Var.b();
            z65.e(b2);
            long a2 = fda.a.a(fdaVar, b2, null, 2, null);
            if (a2 - Calendar.getInstance().getTimeInMillis() <= s) {
                z = true;
            } else {
                z = false;
            }
            kn3Var = new kn3(a2, z);
        } else {
            kn3Var = null;
        }
        return new ul6(x06Var.getId(), x06Var.c(), x06Var.d(), x06Var.f(), x06Var.a(), x06Var.i(), x06Var.e(), kn3Var, false, 256, null);
    }

    public final oz3<List<wl7>> D() {
        return wz3.B(uz3.a.d(u, new i(null)), this.p);
    }

    public final wx<Unit> E(long j2) {
        return s(new j(j2, null));
    }

    public final wx<Unit> F() {
        return t(new k(null));
    }

    public final Object G(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.p, new l(null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final wx<Unit> H() {
        return t(new m(null));
    }

    public final Object I(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.p, new n(null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final wx<Unit> a(String str) {
        z65.h(str, "missionId");
        return t(new b(str, null));
    }

    public <T> wx<T> s(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> t(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<iv2> u() {
        return s(new c(null));
    }

    public final wx<em6> v() {
        return s(new d(null));
    }

    public final wx<lp7> w() {
        return s(new e(null));
    }

    public final wx<Long> x() {
        return s(new f(null));
    }

    public final wx<com.dodopizza.geo.feature.selectdeliveryaddress.b> y() {
        return s(new g(null));
    }

    public final wx<gub> z() {
        return s(new h(null));
    }
}
