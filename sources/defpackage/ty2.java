package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.suggestions.presentation.f;
import com.dodopizza.geo.feature.suggestions.presentation.g;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c2b;
import defpackage.hv0;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: DeliveryLocationSuggestionsInteractor.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00100\u001a\u00020\u0003\u0012\b\u00104\u001a\u0004\u0018\u000101\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bE\u0010FJ \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J2\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00110\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lty2;", "Lsy2;", "Lox1;", "", "input", "Lov5;", "userLocation", "", "Le2b;", "q", "", "p", "Lhv0$a;", "changeDeliveryLocationRequest", "", "r", "Loz3;", "Lkotlin/Pair;", "a", "addressId", "Lwx;", "Lcom/dodopizza/geo/feature/suggestions/presentation/g;", DateTokenConverter.CONVERTER_KEY, "Liv0;", "b", com.huawei.hms.opendevice.c.a, "La2b;", "La2b;", "mapper", "Lc2b;", "Lc2b;", "suggestionService", "Lmz2;", "Lmz2;", "deliveryLocationSuggestionsService", "Lhq3;", "Lhq3;", "featureService", "Lk6a;", e.a, "Lk6a;", "selectLocationService", "Lx42;", "f", "Lx42;", "customerAddressService", "g", "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Ltl5;", Image.TYPE_HIGH, "Ltl5;", "currentLanguage", "Lmh4;", "i", "Lmh4;", "sessionIdRepository", "Lcom/dodopizza/geo/feature/suggestions/presentation/f;", "j", "Lcom/dodopizza/geo/feature/suggestions/presentation/f;", "selectedSuggestionFactory", "Li00;", "k", "Li00;", "authorizationState", "Lh7;", "l", "Lh7;", "addressDetailsFieldDesignService", "<init>", "(La2b;Lc2b;Lmz2;Lhq3;Lk6a;Lx42;Ljava/lang/String;Ltl5;Lmh4;Lcom/dodopizza/geo/feature/suggestions/presentation/f;Li00;Lh7;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ty2  reason: default package */
/* loaded from: classes2.dex */
public final class ty2 implements sy2, ox1 {
    private final a2b a;
    private final c2b b;
    private final mz2 c;
    private final hq3 d;
    private final k6a e;
    private final x42 f;
    private final String g;
    private final tl5 h;
    private final mh4 i;
    private final f j;
    private final i00 k;
    private final h7 l;

    /* compiled from: DeliveryLocationSuggestionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsInteractorImpl$getAddressFieldHint$1", f = "DeliveryLocationSuggestionsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ty2$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryLocationSuggestionsInteractor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "a", "()Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ty2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0681a extends ej5 implements Function0<AddressDetailsFieldDesignDto> {
            final /* synthetic */ ty2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0681a(ty2 ty2Var) {
                super(0);
                this.a = ty2Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final AddressDetailsFieldDesignDto invoke() {
                return this.a.l.d(this.a.g);
            }
        }

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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = (AddressDetailsFieldDesignDto) fnb.a.a(new C0681a(ty2.this)).b();
                if (addressDetailsFieldDesignDto != null) {
                    return addressDetailsFieldDesignDto.getMainFieldTitle();
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "", "Le2b;", "a", "()Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ty2$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<Pair<? extends String, ? extends List<? extends e2b>>> {
        final /* synthetic */ String a;
        final /* synthetic */ ty2 b;
        final /* synthetic */ ov5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, ty2 ty2Var, ov5 ov5Var) {
            super(0);
            this.a = str;
            this.b = ty2Var;
            this.c = ov5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Pair<String, List<e2b>> invoke() {
            String str = this.a;
            return new Pair<>(str, this.b.q(str, this.c));
        }
    }

    /* compiled from: DeliveryLocationSuggestionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsInteractorImpl$selectAddress$1", f = "DeliveryLocationSuggestionsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ty2$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super g>, Object> {
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
        public final Object invoke(cv1<? super g> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return ty2.this.j.a(ty2.this.c.a(this.c, ty2.this.i.getSessionId(), ty2.this.g));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsInteractorImpl$selectDeliveryLocationAndSaveToProfile$1", f = "DeliveryLocationSuggestionsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ty2$d */
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super iv0>, Object> {
        int a;
        final /* synthetic */ hv0.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(hv0.a aVar, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super iv0> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (ty2.this.p()) {
                    ty2.this.r(this.c);
                }
                return ty2.this.e.b(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ty2(a2b a2bVar, c2b c2bVar, mz2 mz2Var, hq3 hq3Var, k6a k6aVar, x42 x42Var, String str, tl5 tl5Var, mh4 mh4Var, f fVar, i00 i00Var, h7 h7Var) {
        z65.h(a2bVar, "mapper");
        z65.h(c2bVar, "suggestionService");
        z65.h(mz2Var, "deliveryLocationSuggestionsService");
        z65.h(hq3Var, "featureService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(x42Var, "customerAddressService");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(mh4Var, "sessionIdRepository");
        z65.h(fVar, "selectedSuggestionFactory");
        z65.h(i00Var, "authorizationState");
        z65.h(h7Var, "addressDetailsFieldDesignService");
        this.a = a2bVar;
        this.b = c2bVar;
        this.c = mz2Var;
        this.d = hq3Var;
        this.e = k6aVar;
        this.f = x42Var;
        this.g = str;
        this.h = tl5Var;
        this.i = mh4Var;
        this.j = fVar;
        this.k = i00Var;
        this.l = h7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        if (this.k.b() && this.d.a(bq3.d5)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<e2b> q(String str, ov5 ov5Var) {
        c2b.a aVar;
        int w;
        c2b c2bVar = this.b;
        String sessionId = this.i.getSessionId();
        String str2 = this.g;
        if (ov5Var != null) {
            aVar = new c2b.a(ov5Var.b(), ov5Var.c());
        } else {
            aVar = null;
        }
        List<w1b> a2 = c2bVar.a(new c2b.b(str, sessionId, str2, aVar));
        a2b a2bVar = this.a;
        w = lc1.w(a2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (w1b w1bVar : a2) {
            arrayList.add(a2bVar.a(w1bVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(hv0.a aVar) {
        this.f.a(aVar.c());
    }

    @Override // defpackage.sy2
    public oz3<Pair<String, List<e2b>>> a(String str, ov5 ov5Var) {
        z65.h(str, "input");
        return o(new b(str, this, ov5Var));
    }

    @Override // defpackage.sy2
    public wx<iv0> b(hv0.a aVar) {
        z65.h(aVar, "changeDeliveryLocationRequest");
        return n(new d(aVar, null));
    }

    @Override // defpackage.sy2
    public wx<String> c() {
        return n(new a(null));
    }

    @Override // defpackage.sy2
    public wx<g> d(String str) {
        z65.h(str, "addressId");
        return n(new c(str, null));
    }

    public <T> wx<T> n(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public <T> oz3<T> o(Function0<? extends T> function0) {
        return ox1.a.b(this, function0);
    }
}
