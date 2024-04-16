package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import defpackage.tmb;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryLocationDetailsInteractor.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b0\u00101J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0011\u0010$R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001e\u0010+R \u0010/\u001a\b\u0012\u0004\u0012\u00020-0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b\u0019\u0010+¨\u00062"}, d2 = {"Ltx2;", "Lsx2;", "Lox1;", "Lqw1;", MessageAttributes.COORDINATES, "Lwx;", "", DateTokenConverter.CONVERTER_KEY, "Lre4;", "a", "Lre4;", "geocodeService", "Lcy2;", "b", "Lcy2;", "deliveryLocationDetailsService", "Lh7;", com.huawei.hms.opendevice.c.a, "Lh7;", "addressDetailsFieldDesignService", "Lay1;", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "Lfr6;", "", "f", "Lfr6;", "_currentLocalityId", "Lkua;", "g", "Lkua;", "()Lkua;", "currentLocalityId", "Loz3;", "", "Lg7;", Image.TYPE_HIGH, "Loz3;", "()Loz3;", "oldFields", "Lnv5;", "i", "newFields", "<init>", "(Lre4;Lcy2;Lh7;Lay1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: tx2  reason: default package */
/* loaded from: classes4.dex */
public final class tx2 implements sx2, ox1 {
    private final re4 a;
    private final cy2 b;
    private final h7 c;
    private final ay1 d;
    private final Logger e;
    private final fr6<String> f;
    private final kua<String> g;
    private final oz3<List<g7>> h;
    private final oz3<nv5> i;

    /* compiled from: DeliveryLocationDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lg7;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tx2$a */
    /* loaded from: classes4.dex */
    static final class a extends ej5 implements Function0<List<? extends g7>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends g7> invoke() {
            return tx2.this.b.a(tx2.this.d.getCode());
        }
    }

    /* compiled from: DeliveryLocationDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsInteractorImpl$setLocality$1", f = "DeliveryLocationDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tx2$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ qw1 c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryLocationDetailsInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: tx2$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function0<String> {
            final /* synthetic */ tx2 a;
            final /* synthetic */ qw1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(tx2 tx2Var, qw1 qw1Var) {
                super(0);
                this.a = tx2Var;
                this.b = qw1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return this.a.a.b(this.b, this.a.d.getCode());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryLocationDetailsInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: tx2$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0679b extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ tx2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0679b(tx2 tx2Var) {
                super(1);
                this.a = tx2Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                z65.h(th, "it");
                this.a.e.warn("Can't fetch localityId", th);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qw1 qw1Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = qw1Var;
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
                tx2.this.f.setValue(hnb.b(fnb.a.a(new a(tx2.this, this.c)), new C0679b(tx2.this)).b());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tx2$c */
    /* loaded from: classes4.dex */
    public static final class c implements oz3<nv5> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ tx2 b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: tx2$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ tx2 b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsInteractorImpl$special$$inlined$map$1$2", f = "DeliveryLocationDetailsInteractor.kt", l = {223}, m = "emit")
            /* renamed from: tx2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0680a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0680a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, tx2 tx2Var) {
                this.a = pz3Var;
                this.b = tx2Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, defpackage.cv1 r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof defpackage.tx2.c.a.C0680a
                    if (r0 == 0) goto L13
                    r0 = r8
                    tx2$c$a$a r0 = (defpackage.tx2.c.a.C0680a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    tx2$c$a$a r0 = new tx2$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r8)
                    goto L5d
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    defpackage.vk9.b(r8)
                    pz3 r8 = r6.a
                    java.lang.String r7 = (java.lang.String) r7
                    nv5 r2 = new nv5
                    tx2 r4 = r6.b
                    h7 r4 = defpackage.tx2.a(r4)
                    tx2 r5 = r6.b
                    ay1 r5 = defpackage.tx2.b(r5)
                    java.lang.String r5 = r5.getCode()
                    ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto r4 = r4.d(r5)
                    defpackage.z65.e(r4)
                    r2.<init>(r7, r4)
                    r0.b = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tx2.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var, tx2 tx2Var) {
            this.a = oz3Var;
            this.b = tx2Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super nv5> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public tx2(re4 re4Var, cy2 cy2Var, h7 h7Var, ay1 ay1Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(cy2Var, "deliveryLocationDetailsService");
        z65.h(h7Var, "addressDetailsFieldDesignService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        this.a = re4Var;
        this.b = cy2Var;
        this.c = h7Var;
        this.d = ay1Var;
        this.e = LoggerFactory.getLogger("DeliveryLocationDetailsInteractorImpl");
        fr6<String> a2 = mua.a(null);
        this.f = a2;
        this.g = wz3.d(a2);
        this.h = l(new a());
        this.i = wz3.B(wz3.o(new c(a2, this)), v33.b());
    }

    @Override // defpackage.sx2
    public kua<String> c() {
        return this.g;
    }

    @Override // defpackage.sx2
    public wx<Unit> d(qw1 qw1Var) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        return k(new b(qw1Var, null));
    }

    @Override // defpackage.sx2
    public oz3<nv5> e() {
        return this.i;
    }

    @Override // defpackage.sx2
    public oz3<List<g7>> f() {
        return this.h;
    }

    public <T> wx<T> k(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public <T> oz3<T> l(Function0<? extends T> function0) {
        return ox1.a.b(this, function0);
    }
}
