package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: CombinedSelectionMapInteractor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ljg1;", "Lox1;", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lwx;", "Lru/dodopizza/app/domain/country/models/CountryIsoName;", c.a, "Lru/dodopizza/app/domain/country/CountryService;", "a", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jg1  reason: default package */
/* loaded from: classes2.dex */
public final class jg1 implements ox1 {
    private final CountryService a;

    /* compiled from: CombinedSelectionMapInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u008a@"}, d2 = {"", "Lru/dodopizza/app/domain/country/models/CountryIsoName;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapInteractor$getCountryName$1", f = "CombinedSelectionMapInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: jg1$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super String>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return jg1.this.a.c(this.c).f();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public jg1(CountryService countryService) {
        z65.h(countryService, "countryService");
        this.a = countryService;
    }

    public <T> wx<T> b(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<String> c(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return b(new a(str, null));
    }
}
