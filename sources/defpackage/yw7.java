package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: PaymentWorkflowBrokenInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lyw7;", "Lxw7;", "Lox1;", "Lwx;", "", "a", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "b", "Ljv5;", "localityService", "Lrt5;", c.a, "Lrt5;", "localityInfoService", "Le98;", DateTokenConverter.CONVERTER_KEY, "Le98;", "pizzeriaService", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;Ljv5;Lrt5;Le98;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yw7  reason: default package */
/* loaded from: classes4.dex */
public final class yw7 implements xw7, ox1 {
    private final CountryService a;
    private final jv5 b;
    private final rt5 c;
    private final e98 d;

    /* compiled from: PaymentWorkflowBrokenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.paymentbrokendialog.PaymentWorkflowBrokenInteractorImpl$getCallCenterPhone$1", f = "PaymentWorkflowBrokenInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yw7$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dt5 i = yw7.this.b.i();
                if (i != null) {
                    str = i.a();
                } else {
                    str = null;
                }
                ay1 c = yw7.this.a.c((String) mh5.c(str, "643"));
                if (c.e().b().length() <= 0) {
                    jt5 a = yw7.this.c.a((dt5) mh5.b(yw7.this.b.i(), "Selected locality must be defined at this time!"));
                    if (a.b().length() > 0) {
                        return a.b();
                    }
                    String E = yw7.this.d.b().E();
                    if (E == null) {
                        return "";
                    }
                    return E;
                }
                return c.e().b();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public yw7(CountryService countryService, jv5 jv5Var, rt5 rt5Var, e98 e98Var) {
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        z65.h(e98Var, "pizzeriaService");
        this.a = countryService;
        this.b = jv5Var;
        this.c = rt5Var;
        this.d = e98Var;
    }

    @Override // defpackage.xw7
    public wx<String> a() {
        return f(new a(null));
    }

    public <T> wx<T> f(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
