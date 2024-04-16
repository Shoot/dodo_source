package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.backend.domain.address.dto.HouseAutoResultDto;
/* compiled from: HouseAutocompleteInteractor.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lnp4;", "Lox1;", "Lbza;", "street", "", "housePart", "Lwx;", "", "f", "Lru/dodopizza/app/domain/DodopizzaApi;", "a", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Ljv5;", "b", "Ljv5;", "localityService", "Ldt5;", c.a, "Ldt5;", "locality", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lru/dodopizza/app/domain/DodopizzaApi;Ljv5;Ldt5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: np4  reason: default package */
/* loaded from: classes4.dex */
public final class np4 implements ox1 {
    private final DodopizzaApi a;
    private final jv5 b;
    private final dt5 c;
    private final Logger d;

    /* compiled from: HouseAutocompleteInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addressform.HouseAutocompleteInteractor$getHouses$1", f = "HouseAutocompleteInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: np4$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super List<? extends String>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ bza d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, bza bzaVar, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = bzaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<String>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List l;
            List<String> l2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    DodopizzaApi dodopizzaApi = np4.this.a;
                    String str = this.c;
                    String b = this.d.b();
                    z65.g(b, "getStreetId(...)");
                    HouseAutoResultDto houseAutoComplete = dodopizzaApi.houseAutoComplete(str, b, np4.this.c.getId(), np4.this.b.a());
                    if (!houseAutoComplete.getWasSearchPerformed()) {
                        l2 = kc1.l();
                    } else {
                        l2 = houseAutoComplete.getNumbers();
                    }
                    return l2;
                } catch (Exception e) {
                    Logger logger = np4.this.d;
                    z65.g(logger, "access$getLogger$p(...)");
                    hq4.a(logger, e, "автокомплит дома");
                    l = kc1.l();
                    return l;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public np4(DodopizzaApi dodopizzaApi, jv5 jv5Var, dt5 dt5Var) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        z65.h(jv5Var, "localityService");
        z65.h(dt5Var, "locality");
        this.a = dodopizzaApi;
        this.b = jv5Var;
        this.c = dt5Var;
        this.d = LoggerFactory.getLogger("HouseAutocompleteInteractor");
    }

    public <T> wx<T> e(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<List<String>> f(bza bzaVar, String str) {
        z65.h(bzaVar, "street");
        z65.h(str, "housePart");
        return e(new a(str, bzaVar, null));
    }
}
