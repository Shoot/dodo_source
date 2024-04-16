package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: DeliveryAddressMapVOService.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lsw2;", "Lrw2;", "Ldm9;", "address", "", LocalityEntity.FIELD_COUNTRY_CODE, "La66;", "g", "Le91;", "f", "", "lat", "lon", "Loz3;", "a", "Lre4;", "Lre4;", "geocodeService", "Lru/dodopizza/app/domain/country/CountryService;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", c.a, "Ljv5;", "localityService", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "Lht4;", e.a, "Lht4;", "identifierGenerator", "<init>", "(Lre4;Lru/dodopizza/app/domain/country/CountryService;Ljv5;Ljava/lang/String;Lht4;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sw2  reason: default package */
/* loaded from: classes.dex */
public final class sw2 implements rw2 {
    private final re4 a;
    private final CountryService b;
    private final jv5 c;
    private final String d;
    private final ht4 e;

    /* compiled from: DeliveryAddressMapVOService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La66;", "it", "a", "(La66;)La66;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sw2$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<a66, a66> {
        final /* synthetic */ double b;
        final /* synthetic */ double c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryAddressMapVOService.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La66;", "a", "()La66;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: sw2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0669a extends ej5 implements Function0<a66> {
            final /* synthetic */ sw2 a;
            final /* synthetic */ double b;
            final /* synthetic */ double c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DeliveryAddressMapVOService.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La66;", "a", "()La66;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: sw2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0670a extends ej5 implements Function0<a66> {
                public static final C0670a a = new C0670a();

                C0670a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final a66 invoke() {
                    return p7.j;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0669a(sw2 sw2Var, double d, double d2) {
                super(0);
                this.a = sw2Var;
                this.b = d;
                this.c = d2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final a66 invoke() {
                a66 a66Var;
                dm9 a = this.a.a.a(new qw1(this.b, this.c), this.a.d, this.a.b.h(this.a.d));
                if (a != null) {
                    sw2 sw2Var = this.a;
                    a66Var = sw2Var.g(a, sw2Var.d);
                } else {
                    a66Var = null;
                }
                return (a66) mh5.d(a66Var, C0670a.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryAddressMapVOService.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "La66;", "a", "(Ljava/lang/Throwable;)La66;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: sw2$a$b */
        /* loaded from: classes.dex */
        public static final class b extends ej5 implements Function1<Throwable, a66> {
            public static final b a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final a66 invoke(Throwable th) {
                z65.h(th, "it");
                return p7.j;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(double d, double d2) {
            super(1);
            this.b = d;
            this.c = d2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final a66 invoke(a66 a66Var) {
            z65.h(a66Var, "it");
            return (a66) fnb.a.a(new C0669a(sw2.this, this.b, this.c)).a(b.a);
        }
    }

    public sw2(re4 re4Var, CountryService countryService, jv5 jv5Var, String str, ht4 ht4Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(ht4Var, "identifierGenerator");
        this.a = re4Var;
        this.b = countryService;
        this.c = jv5Var;
        this.d = str;
        this.e = ht4Var;
    }

    private final e91 f(dm9 dm9Var) {
        Map h;
        String a2 = this.e.a();
        String d = dm9Var.d();
        qw1 qw1Var = new qw1(dm9Var.c().b(), dm9Var.c().c());
        h = g86.h();
        return new e91(a2, new jx2(d, qw1Var, h, dm9Var.b()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a66 g(dm9 dm9Var, String str) {
        boolean z;
        if (dm9Var.e() != null && dm9Var.f() != null) {
            z = true;
        } else {
            z = false;
        }
        e91 f = f(dm9Var);
        if (z) {
            jv5 jv5Var = this.c;
            String e = dm9Var.e();
            z65.e(e);
            dt5 b = jv5Var.b(str, e);
            if (b != null) {
                return new i9(dm9Var.d(), dm9Var.a(), b, f);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return new gqb(dm9Var.d(), f);
    }

    @Override // defpackage.rw2
    public oz3<a66> a(double d, double d2) {
        return uz3.a.c(wz3.A(l13.j), new a(d, d2));
    }
}
