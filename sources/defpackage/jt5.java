package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LocalityInfo.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050!\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u00101\u001a\u00020.¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u0019\u0010$R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010$R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010-\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b+\u0010,R\u0017\u00101\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b&\u00100¨\u00064"}, d2 = {"Ljt5;", "", "", "a", Action.NAME_ATTRIBUTE, "Lcqa;", Image.TYPE_HIGH, "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "id", "b", "getUuid", MessageAttributes.UUID, "Ldt5;", "Ldt5;", e.a, "()Ldt5;", "locality", DateTokenConverter.CONVERTER_KEY, "f", "mapUrl", "Leub;", "Leub;", "j", "()Leub;", "userAgreement", "", "Lwo5;", "Ljava/util/List;", "()Ljava/util/List;", "legalInformations", "g", "i", "socialNetworks", "callCenterPhone", "Z", "k", "()Z", "isLanding", "Lnk7;", "Lnk7;", "()Lnk7;", "orderTypeDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldt5;Ljava/lang/String;Leub;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLnk7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jt5  reason: default package */
/* loaded from: classes4.dex */
public final class jt5 {
    private final String a;
    private final String b;
    private final dt5 c;
    private final String d;
    private final eub e;
    private final List<wo5> f;
    private final List<cqa> g;
    private final String h;
    private final boolean i;
    private final nk7 j;

    public jt5(String str, String str2, dt5 dt5Var, String str3, eub eubVar, List<wo5> list, List<cqa> list2, String str4, boolean z, nk7 nk7Var) {
        z65.h(str, "id");
        z65.h(str2, MessageAttributes.UUID);
        z65.h(dt5Var, "locality");
        z65.h(str3, "mapUrl");
        z65.h(eubVar, "userAgreement");
        z65.h(list, "legalInformations");
        z65.h(list2, "socialNetworks");
        z65.h(str4, "callCenterPhone");
        z65.h(nk7Var, "orderTypeDiscount");
        this.a = str;
        this.b = str2;
        this.c = dt5Var;
        this.d = str3;
        this.e = eubVar;
        this.f = list;
        this.g = list2;
        this.h = str4;
        this.i = z;
        this.j = nk7Var;
    }

    public final String a() {
        return this.e.b();
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.a;
    }

    public final List<wo5> d() {
        return this.f;
    }

    public final dt5 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt5)) {
            return false;
        }
        jt5 jt5Var = (jt5) obj;
        if (z65.c(this.a, jt5Var.a) && z65.c(this.b, jt5Var.b) && z65.c(this.c, jt5Var.c) && z65.c(this.d, jt5Var.d) && z65.c(this.e, jt5Var.e) && z65.c(this.f, jt5Var.f) && z65.c(this.g, jt5Var.g) && z65.c(this.h, jt5Var.h) && this.i == jt5Var.i && z65.c(this.j, jt5Var.j)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.d;
    }

    public final nk7 g() {
        return this.j;
    }

    public final cqa h(String str) {
        Object obj;
        z65.h(str, Action.NAME_ATTRIBUTE);
        Iterator<T> it = this.g.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((cqa) obj).a(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (cqa) obj;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31) + this.j.hashCode();
    }

    public final List<cqa> i() {
        return this.g;
    }

    public final eub j() {
        return this.e;
    }

    public final boolean k() {
        return this.i;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        dt5 dt5Var = this.c;
        String str3 = this.d;
        eub eubVar = this.e;
        List<wo5> list = this.f;
        List<cqa> list2 = this.g;
        String str4 = this.h;
        boolean z = this.i;
        nk7 nk7Var = this.j;
        return "LocalityInfo(id=" + str + ", uuid=" + str2 + ", locality=" + dt5Var + ", mapUrl=" + str3 + ", userAgreement=" + eubVar + ", legalInformations=" + list + ", socialNetworks=" + list2 + ", callCenterPhone=" + str4 + ", isLanding=" + z + ", orderTypeDiscount=" + nk7Var + ")";
    }
}
