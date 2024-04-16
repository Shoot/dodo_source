package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: GeoChooseOrderTypeInteractor.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u00060\bj\u0002`\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lsd4;", "Lrd4;", "Lox1;", "Ldt5;", "locality", "", c.a, "(Ldt5;Lcv1;)Ljava/lang/Object;", "", LocalityEntity.FIELD_COUNTRY_CODE, "Loz3;", "a", "Lru/dodopizza/app/domain/country/models/CountryCode;", "Ltl5;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "Ljv5;", "localityService", "Lny1;", "Lny1;", "languageConfigs", "Lpy1;", DateTokenConverter.CONVERTER_KEY, "Lpy1;", "countryNameService", "Lkx1;", e.a, "Lkx1;", "ioDispatcher", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;Ljv5;Lny1;Lpy1;Lkx1;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sd4  reason: default package */
/* loaded from: classes2.dex */
public final class sd4 implements rd4, ox1 {
    private final CountryService a;
    private final jv5 b;
    private final ny1 c;
    private final py1 d;
    private final kx1 e;

    /* compiled from: GeoChooseOrderTypeInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sd4$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<oz3<? extends String>> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<String> invoke() {
            return wz3.A(sd4.this.d.a(sd4.this.a.c(this.b).f()));
        }
    }

    /* compiled from: GeoChooseOrderTypeInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypeInteractorImpl$isLandingLocality$2", f = "GeoChooseOrderTypeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: sd4$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;
        final /* synthetic */ dt5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dt5 dt5Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = dt5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(sd4.this.b.g(this.c));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public sd4(CountryService countryService, jv5 jv5Var, ny1 ny1Var, py1 py1Var, kx1 kx1Var) {
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(ny1Var, "languageConfigs");
        z65.h(py1Var, "countryNameService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = countryService;
        this.b = jv5Var;
        this.c = ny1Var;
        this.d = py1Var;
        this.e = kx1Var;
    }

    @Override // defpackage.rd4
    public oz3<String> a(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return g(new a(str));
    }

    @Override // defpackage.rd4
    public tl5 b(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return this.c.c(str);
    }

    @Override // defpackage.rd4
    public Object c(dt5 dt5Var, cv1<? super Boolean> cv1Var) {
        return qh0.g(this.e, new b(dt5Var, null), cv1Var);
    }

    public <T> oz3<T> g(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }

    public /* synthetic */ sd4(CountryService countryService, jv5 jv5Var, ny1 ny1Var, py1 py1Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(countryService, jv5Var, ny1Var, py1Var, (i & 16) != 0 ? v33.b() : kx1Var);
    }
}
