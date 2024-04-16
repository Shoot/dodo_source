package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.backend.domain.address.dto.StreetAutoResultDto;
import ru.dodopizza.backend.domain.address.dto.StreetResultDto;
/* compiled from: StreetAutocompleteInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Ldza;", "Lox1;", "", RemoteMessageConst.MessageBody.PARAM, "Lwx;", "", "Lbza;", "f", "Lru/dodopizza/app/domain/DodopizzaApi;", "a", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Ljv5;", "b", "Ljv5;", "localityService", "Ldt5;", c.a, "Ldt5;", "locality", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lru/dodopizza/app/domain/DodopizzaApi;Ljv5;Ldt5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dza  reason: default package */
/* loaded from: classes4.dex */
public final class dza implements ox1 {
    private final DodopizzaApi a;
    private final jv5 b;
    private final dt5 c;
    private final Logger d;

    /* compiled from: StreetAutocompleteInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lbza;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.addressform.StreetAutocompleteInteractor$getStreets$1", f = "StreetAutocompleteInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: dza$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super List<? extends bza>>, Object> {
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
        public final Object invoke(cv1<? super List<? extends bza>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List l;
            List l2;
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                try {
                    StreetAutoResultDto streetAutoComplete = dza.this.a.streetAutoComplete(this.c, dza.this.c.getId(), dza.this.b.a());
                    if (!streetAutoComplete.getWasSearchPerformed()) {
                        l2 = kc1.l();
                        return l2;
                    }
                    List<StreetResultDto> resultDto = streetAutoComplete.getResultDto();
                    w = lc1.w(resultDto, 10);
                    ArrayList arrayList = new ArrayList(w);
                    for (StreetResultDto streetResultDto : resultDto) {
                        arrayList.add(new bza(streetResultDto.getId(), streetResultDto.getName(), streetResultDto.getShortName()));
                    }
                    return arrayList;
                } catch (Exception e) {
                    Logger logger = dza.this.d;
                    z65.g(logger, "access$getLogger$p(...)");
                    hq4.a(logger, e, "автокомплит улицы");
                    l = kc1.l();
                    return l;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public dza(DodopizzaApi dodopizzaApi, jv5 jv5Var, dt5 dt5Var) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        z65.h(jv5Var, "localityService");
        z65.h(dt5Var, "locality");
        this.a = dodopizzaApi;
        this.b = jv5Var;
        this.c = dt5Var;
        this.d = LoggerFactory.getLogger("StreetAutocompleteInteractor");
    }

    public <T> wx<T> e(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<List<bza>> f(String str) {
        z65.h(str, RemoteMessageConst.MessageBody.PARAM);
        return e(new a(str, null));
    }
}
