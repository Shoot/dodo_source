package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sl5;
import defpackage.xl0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.country.CountryApi;
import ru.dodopizza.backend.domain.country.dto.addressformat.AddressDetailsFieldDesignDto;
/* compiled from: AddressDetailsFieldDesignService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B)\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J \u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\n\u001a\u0004\u0018\u00010\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\f\u001a\u0004\u0018\u00010\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Li7;", "Lh7;", "Lxl0;", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", LocalityEntity.FIELD_COUNTRY_CODE, "Ltl5;", "language", "Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "l", "k", "j", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/backend/domain/country/CountryApi;", "Lru/dodopizza/backend/domain/country/CountryApi;", "countryApi", "Lsl5$a;", e.a, "Lsl5$a;", "cacheKeysFactory", "Lml0;", "f", "Lml0;", "cacheInspector", "Li32;", "g", "Li32;", "currentLocaleProvider", "Ljava/util/concurrent/ConcurrentHashMap;", Image.TYPE_HIGH, "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lru/dodopizza/backend/domain/country/CountryApi;Lsl5$a;Lml0;Li32;)V", "i", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i7  reason: default package */
/* loaded from: classes4.dex */
public final class i7 extends xl0 implements h7 {
    public static final a i = new a(null);
    private static final long j = TimeUnit.MINUTES.toMillis(30);
    private final CountryApi d;
    private final sl5.a e;
    private final ml0 f;
    private final i32 g;
    private final ConcurrentHashMap<String, AddressDetailsFieldDesignDto> h;

    /* compiled from: AddressDetailsFieldDesignService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0005\u001a\u00020\u00022\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Li7$a;", "", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", LocalityEntity.FIELD_COUNTRY_CODE, "b", "", "CACHE_DURATION", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String str) {
            return "AddressDetailsFieldDesign.get." + str + ".";
        }
    }

    /* compiled from: AddressDetailsFieldDesignService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "a", "()Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i7$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<AddressDetailsFieldDesignDto> {
        final /* synthetic */ String b;
        final /* synthetic */ tl5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tl5 tl5Var) {
            super(0);
            this.b = str;
            this.c = tl5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AddressDetailsFieldDesignDto invoke() {
            return i7.this.l(this.b, this.c);
        }
    }

    /* compiled from: AddressDetailsFieldDesignService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxl0$a;", "a", "()Lxl0$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i7$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<xl0.a> {
        final /* synthetic */ String b;
        final /* synthetic */ tl5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tl5 tl5Var) {
            super(0);
            this.b = str;
            this.c = tl5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xl0.a invoke() {
            i7.this.k(this.b, this.c);
            return xl0.a.C0743a.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddressDetailsFieldDesignService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;", "a", "()Lru/dodopizza/backend/domain/country/dto/addressformat/AddressDetailsFieldDesignDto;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: i7$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function0<AddressDetailsFieldDesignDto> {
        final /* synthetic */ String b;
        final /* synthetic */ tl5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tl5 tl5Var) {
            super(0);
            this.b = str;
            this.c = tl5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AddressDetailsFieldDesignDto invoke() {
            String str;
            CountryApi countryApi = i7.this.d;
            String str2 = this.b;
            tl5 tl5Var = this.c;
            if (tl5Var != null) {
                str = tl5Var.a();
            } else {
                str = null;
            }
            return countryApi.getAddressDetailsFieldsDesign(str2, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(CountryApi countryApi, sl5.a aVar, ml0 ml0Var, i32 i32Var) {
        super(ml0Var);
        z65.h(countryApi, "countryApi");
        z65.h(aVar, "cacheKeysFactory");
        z65.h(ml0Var, "cacheInspector");
        z65.h(i32Var, "currentLocaleProvider");
        this.d = countryApi;
        this.e = aVar;
        this.f = ml0Var;
        this.g = i32Var;
        this.h = new ConcurrentHashMap<>();
    }

    private final tl5 j() {
        return ul5.a(this.g.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressDetailsFieldDesignDto k(String str, tl5 tl5Var) {
        AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = (AddressDetailsFieldDesignDto) fnb.a.a(new d(str, tl5Var)).b();
        if (addressDetailsFieldDesignDto != null) {
            this.h.put(str, addressDetailsFieldDesignDto);
            return addressDetailsFieldDesignDto;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressDetailsFieldDesignDto l(String str, tl5 tl5Var) {
        AddressDetailsFieldDesignDto addressDetailsFieldDesignDto = this.h.get(str);
        if (addressDetailsFieldDesignDto == null) {
            addressDetailsFieldDesignDto = k(str, tl5Var);
        }
        return addressDetailsFieldDesignDto;
    }

    @Override // defpackage.h7
    public AddressDetailsFieldDesignDto d(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        tl5 j2 = j();
        sl5 b2 = this.e.b(i.b(str), str, j2);
        ol0.a(this.f, b2.b());
        return (AddressDetailsFieldDesignDto) f(new b(str, j2), new c(str, j2), new ql0(b2.a(), j, false, 4, null));
    }
}
