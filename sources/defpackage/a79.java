package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: RawDeepLinkData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tBe\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015j\u0002`\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015j\u0002`\u001f¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0013\u0010\fR)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015j\u0002`\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u000e\u0010\u001dR)\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015j\u0002`\u001f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\t\u0010\u0019¨\u0006#"}, d2 = {"La79;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "fullUri", "b", "g", "schema", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, e.a, "path", "", "Lru/dodopizza/app/application/subnavigation/routing/RawDeepLinkQuery;", "Ljava/util/Map;", "f", "()Ljava/util/Map;", SearchIntents.EXTRA_QUERY, "La79$a;", "La79$a;", "()La79$a;", "attributionData", "Lru/dodopizza/app/application/subnavigation/routing/RawDeepLinkArguments;", "additionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;La79$a;Ljava/util/Map;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a79  reason: default package */
/* loaded from: classes3.dex */
public final class a79 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Map<String, String> e;
    private final a f;
    private final Map<String, String> g;

    /* compiled from: RawDeepLinkData.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"La79$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "campaign", "b", "mediaSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a79$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            z65.h(str, "campaign");
            z65.h(str2, "mediaSource");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            return "AttributionData(campaign=" + str + ", mediaSource=" + str2 + ")";
        }
    }

    public a79(String str, String str2, String str3, String str4, Map<String, String> map, a aVar, Map<String, String> map2) {
        z65.h(str, "fullUri");
        z65.h(str2, "schema");
        z65.h(str3, Action.NAME_ATTRIBUTE);
        z65.h(str4, "path");
        z65.h(map, SearchIntents.EXTRA_QUERY);
        z65.h(map2, "additionalInfo");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = aVar;
        this.g = map2;
    }

    public final Map<String, String> a() {
        return this.g;
    }

    public final a b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a79)) {
            return false;
        }
        a79 a79Var = (a79) obj;
        if (z65.c(this.a, a79Var.a) && z65.c(this.b, a79Var.b) && z65.c(this.c, a79Var.c) && z65.c(this.d, a79Var.d) && z65.c(this.e, a79Var.e) && z65.c(this.f, a79Var.f) && z65.c(this.g, a79Var.g)) {
            return true;
        }
        return false;
    }

    public final Map<String, String> f() {
        return this.e;
    }

    public final String g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        a aVar = this.f;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        Map<String, String> map = this.e;
        a aVar = this.f;
        Map<String, String> map2 = this.g;
        return "RawDeepLinkData(fullUri=" + str + ", schema=" + str2 + ", name=" + str3 + ", path=" + str4 + ", query=" + map + ", attributionData=" + aVar + ", additionalInfo=" + map2 + ")";
    }
}
