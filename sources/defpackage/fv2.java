package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import defpackage.k9a;
import defpackage.ou2;
import defpackage.ox1;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: DeliveryAddressInteractor.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002J*\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010 \u001a\f\u0012\u0004\u0012\u00020\u00060\u001aj\u0002`\u001f2\u0006\u0010\u001e\u001a\u00020\u001dJ.\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lfv2;", "Lox1;", "", Image.TYPE_HIGH, "Lhv0$a;", "changeDeliveryLocationRequest", "", "o", "Lou2;", "newDeliverablePlace", "isEmptyCart", "", LocalityEntity.FIELD_COUNTRY_CODE, "localityUUID", "Lk9a$a;", "i", "Lou2$c;", "newDeliveryLocation", Image.TYPE_MEDIUM, "Lqw1;", MessageAttributes.COORDINATES, "Ldt5;", "l", "first", "second", "k", "Lwx;", "Liv0;", "p", "Le91;", "clientDeliveryLocation", "Lcom/dodopizza/async/AsyncJob;", "n", "j", "Lk6a;", "a", "Lk6a;", "selectLocationService", "Li00;", "b", "Li00;", "authorizationState", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lx42;", DateTokenConverter.CONVERTER_KEY, "Lx42;", "customerAddressService", "Lre4;", e.a, "Lre4;", "geocodeService", "Ljv5;", "f", "Ljv5;", "localityService", "Lj9a;", "g", "Lj9a;", "selectedAddressState", "<init>", "(Lk6a;Li00;Lhq3;Lx42;Lre4;Ljv5;Lj9a;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fv2  reason: default package */
/* loaded from: classes2.dex */
public final class fv2 implements ox1 {
    private final k6a a;
    private final i00 b;
    private final hq3 c;
    private final x42 d;
    private final re4 e;
    private final jv5 f;
    private final j9a g;

    /* compiled from: DeliveryAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk9a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressInteractor$checkSelectedDeliveryLocation$1", f = "DeliveryAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fv2$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super k9a.a>, Object> {
        int a;
        final /* synthetic */ e91 c;
        final /* synthetic */ boolean d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e91 e91Var, boolean z, String str, String str2, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
            this.d = z;
            this.e = str;
            this.f = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, this.d, this.e, this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super k9a.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return fv2.this.i(ru2.c(this.c), this.d, this.e, this.f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressInteractor$saveDeliveryLocationToProfile$1", f = "DeliveryAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fv2$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ e91 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e91 e91Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = e91Var;
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
                fv2.this.d.a(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.delivery.address.presentation.DeliveryAddressInteractor$selectDeliveryLocationAndSaveToProfile$1", f = "DeliveryAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fv2$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super iv0>, Object> {
        int a;
        final /* synthetic */ hv0.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hv0.a aVar, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super iv0> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (fv2.this.h()) {
                    fv2.this.o(this.c);
                }
                return fv2.this.a.b(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public fv2(k6a k6aVar, i00 i00Var, hq3 hq3Var, x42 x42Var, re4 re4Var, jv5 jv5Var, j9a j9aVar) {
        z65.h(k6aVar, "selectLocationService");
        z65.h(i00Var, "authorizationState");
        z65.h(hq3Var, "featureService");
        z65.h(x42Var, "customerAddressService");
        z65.h(re4Var, "geocodeService");
        z65.h(jv5Var, "localityService");
        z65.h(j9aVar, "selectedAddressState");
        this.a = k6aVar;
        this.b = i00Var;
        this.c = hq3Var;
        this.d = x42Var;
        this.e = re4Var;
        this.f = jv5Var;
        this.g = j9aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        if (this.b.b() && this.c.a(bq3.d5)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k9a.a i(ou2 ou2Var, boolean z, String str, String str2) {
        ou2 g = this.g.g();
        if (k(ou2Var, g)) {
            return new k9a.a.C0407a(ru2.e(g));
        }
        z65.f(ou2Var, "null cannot be cast to non-null type ru.dodopizza.app.domain.deliverylocation.DeliverablePlace.DeliverableLocation");
        return m((ou2.c) ou2Var, z, str, str2);
    }

    private final boolean k(ou2 ou2Var, ou2 ou2Var2) {
        if ((ou2Var instanceof ou2.c) && (ou2Var2 instanceof ou2.c)) {
            ou2.c cVar = (ou2.c) ou2Var;
            ou2.c cVar2 = (ou2.c) ou2Var2;
            if (z65.c(cVar.b().getId(), cVar2.b().getId()) && z65.c(cVar.b().c().d(), cVar2.b().c().d()) && z65.c(cVar.b().c().c(), cVar2.b().c().c())) {
                return true;
            }
            return false;
        }
        return z65.c(ou2Var, ou2Var2);
    }

    private final dt5 l(qw1 qw1Var, String str) {
        String b2 = this.e.b(qw1Var, str);
        if (b2 != null) {
            return this.f.b(str, b2);
        }
        return null;
    }

    private final k9a.a m(ou2.c cVar, boolean z, String str, String str2) {
        e91 b2 = cVar.b();
        dt5 l = l(b2.c().d(), str);
        if (l == null) {
            return new k9a.a.b(cVar);
        }
        if (z65.c(l.d(), str2)) {
            return new k9a.a.e(new k9a.b(b2, l, k9a.b.a.a));
        }
        k9a.b bVar = new k9a.b(b2, l, k9a.b.a.b);
        if (z) {
            return new k9a.a.c(bVar);
        }
        return new k9a.a.d(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(hv0.a aVar) {
        this.d.a(aVar.c());
    }

    public <T> wx<T> f(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> g(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<k9a.a> j(e91 e91Var, boolean z, String str, String str2) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return f(new a(e91Var, z, str, str2, null));
    }

    public final wx<Unit> n(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        return g(new b(e91Var, null));
    }

    public final wx<iv0> p(hv0.a aVar) {
        z65.h(aVar, "changeDeliveryLocationRequest");
        return f(new c(aVar, null));
    }
}
