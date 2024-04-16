package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.hi9;
import defpackage.k65;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HeadersFillerInterceptor.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0003B9\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lhn4;", "Lk65;", "", "a", "Lk65$a;", "chain", "externalLocalityId", DateTokenConverter.CONVERTER_KEY, "languageCode", c.a, "countryCodeString", "b", "Lik9;", "intercept", "Lf89;", "Lf89;", "realmDataSource", "Le00;", "Le00;", "authorizationRepository", "Ljv5;", "Ljv5;", "localityService", "Ls13;", "Ls13;", "deviceIdProvider", "Lmh0;", e.a, "Lmh0;", "buildInfo", "Li32;", "f", "Li32;", "currentLocaleProvider", "<init>", "(Lf89;Le00;Ljv5;Ls13;Lmh0;Li32;)V", "g", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hn4  reason: default package */
/* loaded from: classes3.dex */
public final class hn4 implements k65 {
    public static final a g = new a(null);
    private final f89 a;
    private final e00 b;
    private final jv5 c;
    private final s13 d;
    private final mh0 e;
    private final i32 f;

    /* compiled from: HeadersFillerInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lhn4$a;", "", "", "AUTHORIZATION", "Ljava/lang/String;", "BEARER", "COUNTRY_CODE", "LANGUAGE_CODE", "LOCALITY_ID", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hn4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public hn4(f89 f89Var, e00 e00Var, jv5 jv5Var, s13 s13Var, mh0 mh0Var, i32 i32Var) {
        z65.h(f89Var, "realmDataSource");
        z65.h(e00Var, "authorizationRepository");
        z65.h(jv5Var, "localityService");
        z65.h(s13Var, "deviceIdProvider");
        z65.h(mh0Var, "buildInfo");
        z65.h(i32Var, "currentLocaleProvider");
        this.a = f89Var;
        this.b = e00Var;
        this.c = jv5Var;
        this.d = s13Var;
        this.e = mh0Var;
        this.f = i32Var;
    }

    private final String a() {
        Object Z;
        Z = sc1.Z(this.f.a());
        String languageTag = ((Locale) Z).toLanguageTag();
        z65.g(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    private final String b(k65.a aVar, String str) {
        Object Z;
        if (aVar.request().e().k().contains("CountryCode")) {
            Z = sc1.Z(aVar.request().e().v("CountryCode"));
            return (String) Z;
        }
        return str;
    }

    private final String c(k65.a aVar, String str) {
        Object Z;
        if (aVar.request().e().k().contains("LanguageCode")) {
            Z = sc1.Z(aVar.request().e().v("LanguageCode"));
            return (String) Z;
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }

    private final String d(k65.a aVar, String str) {
        Object Z;
        if (aVar.request().e().k().contains("LocalityId")) {
            Z = sc1.Z(aVar.request().e().v("LocalityId"));
            return (String) Z;
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        boolean y;
        String str;
        String str2;
        boolean O;
        z65.h(aVar, "chain");
        hi9.a i = aVar.request().i();
        String b = this.b.b();
        y = l0b.y(b);
        String str3 = null;
        if (!y) {
            O = m0b.O(aVar.request().l().toString(), "api/v3/localities", false, 2, null);
            if (!O) {
                i.j("Authorization", "Bearer " + b);
            }
        }
        dt5 i2 = this.c.i();
        if (i2 != null) {
            str = i2.getId();
        } else {
            str = null;
        }
        if (i2 != null) {
            str2 = i2.a();
        } else {
            str2 = null;
        }
        String c = c(aVar, a());
        String b2 = b(aVar, (String) mh5.c(str2, "643"));
        String d = d(aVar, str);
        String a2 = this.d.a();
        StateEntity h = this.a.h(d);
        if (h != null) {
            str3 = h.getWorkflowId();
        }
        if (str3 == null) {
            str3 = "";
        }
        i.j("CountryCode", b2).j("LocalityId", d).j("LanguageCode", c).j("Client", this.e.e()).j("ApiVersion", this.e.a()).j("DeviceId", a2).j("WorkflowId", str3).j("ClientVersion", this.e.h());
        return aVar.b(i.b());
    }
}
