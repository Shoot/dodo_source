package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.cl6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: MindboxPushInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lok6;", "", "Lcl6;", "b", "", "uniqueKey", "", c.a, "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "newToken", DateTokenConverter.CONVERTER_KEY, "Ldl6;", "a", "Ldl6;", "mindboxServiceFactory", "Ljv5;", "Ljv5;", "localityService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Ldl6;Ljv5;Lru/dodopizza/app/domain/country/CountryService;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ok6  reason: default package */
/* loaded from: classes4.dex */
public final class ok6 {
    private final dl6 a;
    private final jv5 b;
    private final CountryService c;
    private final kx1 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPushInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.mindbox.MindboxPushInteractor$sendPushClick$2", f = "MindboxPushInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ok6$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                cl6.a.a(ok6.this.b(), this.c, null, 2, null);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxPushInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.infrastracture.mindbox.MindboxPushInteractor$updateToken$2", f = "MindboxPushInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ok6$b */
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ok6.this.b().a(this.c);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ok6(dl6 dl6Var, jv5 jv5Var, CountryService countryService, kx1 kx1Var) {
        z65.h(dl6Var, "mindboxServiceFactory");
        z65.h(jv5Var, "localityService");
        z65.h(countryService, "countryService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = dl6Var;
        this.b = jv5Var;
        this.c = countryService;
        this.d = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cl6 b() {
        dt5 i = this.b.i();
        if (i != null) {
            return el6.a(this.a, this.c.c(i.a()), i);
        }
        throw new IllegalArgumentException("Current locality is not available".toString());
    }

    public final Object c(String str, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.d, new a(str, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }

    public final Object d(String str, cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.d, new b(str, null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }
}
