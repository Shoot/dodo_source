package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Country.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u000f\u0012\n\u0010\u0016\u001a\u00060\u0002j\u0002`\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020\"\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020&\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0&\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00109\u001a\u000204\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0004\u0012\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00060\u0002j\u0002`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0016\u001a\u00060\u0002j\u0002`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\u001d\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020,0&8\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b\u0018\u0010*R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b:\u0010=R\u0017\u0010B\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b5\u0010AR\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u000b\u001a\u0004\bE\u0010\r¨\u0006I"}, d2 = {"Lay1;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lru/dodopizza/app/domain/country/models/CountryCode;", "b", "getCode", "code", "Lru/dodopizza/app/domain/country/models/CountryIsoName;", c.a, "f", "isoName", "Lf32;", DateTokenConverter.CONVERTER_KEY, "Lf32;", "()Lf32;", "currency", "Li28;", e.a, "Li28;", "l", "()Li28;", "phoneCountryPattern", "Lnq3;", "Lnq3;", "()Lnq3;", "feedback", "", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "languages", "Lbq3;", Image.TYPE_HIGH, "features", "Lyy1;", "Lyy1;", Image.TYPE_MEDIUM, "()Lyy1;", "state", "Lk4c;", "j", "Lk4c;", "n", "()Lk4c;", "websites", "k", "baseUrl", "I", "()I", BonusActionEntity.ORDER, "Lc66;", "Lc66;", "()Lc66;", "mapBounds", "defaultLanguage", "o", "getDefaultLanguageOnly", "defaultLanguageOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf32;Li28;Lnq3;Ljava/util/List;Ljava/util/List;Lyy1;Lk4c;Ljava/lang/String;ILc66;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ay1  reason: default package */
/* loaded from: classes4.dex */
public final class ay1 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final f32 d;
    private final i28 e;
    private final nq3 f;
    private final List<String> g;
    private final List<bq3> h;
    private final yy1 i;
    private final k4c j;
    private final String k;
    private final int l;
    private final c66 m;
    private final String n;
    private final String o;

    /* JADX WARN: Multi-variable type inference failed */
    public ay1(String str, String str2, String str3, f32 f32Var, i28 i28Var, nq3 nq3Var, List<String> list, List<? extends bq3> list2, yy1 yy1Var, k4c k4cVar, String str4, int i, c66 c66Var) {
        String Q0;
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "code");
        z65.h(str3, "isoName");
        z65.h(f32Var, "currency");
        z65.h(i28Var, "phoneCountryPattern");
        z65.h(nq3Var, "feedback");
        z65.h(list, "languages");
        z65.h(list2, "features");
        z65.h(yy1Var, "state");
        z65.h(k4cVar, "websites");
        z65.h(str4, "baseUrl");
        z65.h(c66Var, "mapBounds");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f32Var;
        this.e = i28Var;
        this.f = nq3Var;
        this.g = list;
        this.h = list2;
        this.i = yy1Var;
        this.j = k4cVar;
        this.k = str4;
        this.l = i;
        this.m = c66Var;
        this.n = list.get(0);
        Q0 = m0b.Q0(list.get(0), "-", null, 2, null);
        this.o = (String) mh5.c(Q0, "ru");
    }

    public final String a() {
        return this.k;
    }

    public final f32 b() {
        return this.d;
    }

    public final String c() {
        return this.n;
    }

    public final List<bq3> d() {
        return this.h;
    }

    public final nq3 e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay1)) {
            return false;
        }
        ay1 ay1Var = (ay1) obj;
        if (z65.c(this.a, ay1Var.a) && z65.c(this.b, ay1Var.b) && z65.c(this.c, ay1Var.c) && z65.c(this.d, ay1Var.d) && z65.c(this.e, ay1Var.e) && z65.c(this.f, ay1Var.f) && z65.c(this.g, ay1Var.g) && z65.c(this.h, ay1Var.h) && this.i == ay1Var.i && z65.c(this.j, ay1Var.j) && z65.c(this.k, ay1Var.k) && this.l == ay1Var.l && z65.c(this.m, ay1Var.m)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public final String getCode() {
        return this.b;
    }

    public final String getName() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m.hashCode();
    }

    public final List<String> i() {
        return this.g;
    }

    public final c66 j() {
        return this.m;
    }

    public final int k() {
        return this.l;
    }

    public final i28 l() {
        return this.e;
    }

    public final yy1 m() {
        return this.i;
    }

    public final k4c n() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        f32 f32Var = this.d;
        i28 i28Var = this.e;
        nq3 nq3Var = this.f;
        List<String> list = this.g;
        List<bq3> list2 = this.h;
        yy1 yy1Var = this.i;
        k4c k4cVar = this.j;
        String str4 = this.k;
        int i = this.l;
        c66 c66Var = this.m;
        return "Country(name=" + str + ", code=" + str2 + ", isoName=" + str3 + ", currency=" + f32Var + ", phoneCountryPattern=" + i28Var + ", feedback=" + nq3Var + ", languages=" + list + ", features=" + list2 + ", state=" + yy1Var + ", websites=" + k4cVar + ", baseUrl=" + str4 + ", order=" + i + ", mapBounds=" + c66Var + ")";
    }
}
