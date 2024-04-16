package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionMapDeliveryVOData.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0015\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0000JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b)\u0010.R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Laaa;", "", "", e.a, "g", "", "f", Image.TYPE_MEDIUM, "Ldi0;", "i", "", "n", "k", "o", "Lm8;", DateTokenConverter.CONVERTER_KEY, "Lev2;", "p", "localityId", "Ljx2;", "deliveryLocation", "r", "q", "Lf9;", "state", "Lw7;", "addressFields", "", "lastAddressDetails", "a", "toString", "hashCode", "other", "equals", "Lf9;", "l", "()Lf9;", "b", "Ljava/lang/String;", "getLocalityId", "()Ljava/lang/String;", c.a, "Ljx2;", "j", "()Ljx2;", "Lw7;", "()Lw7;", "Ljava/util/Map;", "getLastAddressDetails", "()Ljava/util/Map;", Image.TYPE_HIGH, "()Z", "canChangeCoordinates", "<init>", "(Lf9;Ljava/lang/String;Ljx2;Lw7;Ljava/util/Map;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: aaa  reason: default package */
/* loaded from: classes2.dex */
public final class aaa {
    private final f9 a;
    private final String b;
    private final jx2 c;
    private final w7 d;
    private final Map<String, String> e;

    public aaa() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ aaa b(aaa aaaVar, f9 f9Var, String str, jx2 jx2Var, w7 w7Var, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            f9Var = aaaVar.a;
        }
        if ((i & 2) != 0) {
            str = aaaVar.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            jx2Var = aaaVar.c;
        }
        jx2 jx2Var2 = jx2Var;
        if ((i & 8) != 0) {
            w7Var = aaaVar.d;
        }
        w7 w7Var2 = w7Var;
        Map<String, String> map2 = map;
        if ((i & 16) != 0) {
            map2 = aaaVar.e;
        }
        return aaaVar.a(f9Var, str2, jx2Var2, w7Var2, map2);
    }

    private final String e() {
        return this.d.d();
    }

    private final boolean f() {
        return this.a.k();
    }

    private final String g() {
        return this.c.f();
    }

    private final di0 i() {
        di0 e;
        e = baa.e(this.a, this.d, this.c.f());
        return e;
    }

    private final boolean k() {
        return this.a.s();
    }

    private final boolean m() {
        boolean f;
        f = baa.f(this.a, this.d);
        return f;
    }

    private final int n() {
        return this.a.x();
    }

    private final boolean o() {
        List<d7> c = this.d.c();
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (d7 d7Var : c) {
            if (d7Var.l() && d7Var.i().length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final aaa a(f9 f9Var, String str, jx2 jx2Var, w7 w7Var, Map<String, String> map) {
        z65.h(f9Var, "state");
        z65.h(str, "localityId");
        z65.h(jx2Var, "deliveryLocation");
        z65.h(w7Var, "addressFields");
        z65.h(map, "lastAddressDetails");
        return new aaa(f9Var, str, jx2Var, w7Var, map);
    }

    public final w7 c() {
        return this.d;
    }

    public final m8 d() {
        m8 d;
        d = baa.d(this.a);
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaa)) {
            return false;
        }
        aaa aaaVar = (aaa) obj;
        if (this.a == aaaVar.a && z65.c(this.b, aaaVar.b) && z65.c(this.c, aaaVar.c) && z65.c(this.d, aaaVar.d) && z65.c(this.e, aaaVar.e)) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.a.q();
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final jx2 j() {
        return this.c;
    }

    public final f9 l() {
        return this.a;
    }

    public final ev2 p() {
        return new ev2(e(), g(), f(), m(), i(), n(), k(), o(), this.c);
    }

    public final aaa q() {
        return b(this, f9.q, null, null, null, null, 30, null);
    }

    public final aaa r(String str, jx2 jx2Var) {
        z65.h(jx2Var, "deliveryLocation");
        if (this.a != f9.j) {
            jx2Var = oy2.b(jx2Var, this.c);
        }
        jx2 jx2Var2 = jx2Var;
        f9 f9Var = f9.m;
        w7 w7Var = this.d;
        if (str == null) {
            str = "";
        }
        return a(f9Var, str, jx2Var2, w7Var, jx2Var2.c());
    }

    public String toString() {
        f9 f9Var = this.a;
        String str = this.b;
        jx2 jx2Var = this.c;
        w7 w7Var = this.d;
        Map<String, String> map = this.e;
        return "SelectionMapDeliveryVOData(state=" + f9Var + ", localityId=" + str + ", deliveryLocation=" + jx2Var + ", addressFields=" + w7Var + ", lastAddressDetails=" + map + ")";
    }

    public aaa(f9 f9Var, String str, jx2 jx2Var, w7 w7Var, Map<String, String> map) {
        z65.h(f9Var, "state");
        z65.h(str, "localityId");
        z65.h(jx2Var, "deliveryLocation");
        z65.h(w7Var, "addressFields");
        z65.h(map, "lastAddressDetails");
        this.a = f9Var;
        this.b = str;
        this.c = jx2Var;
        this.d = w7Var;
        this.e = map;
    }

    public /* synthetic */ aaa(f9 f9Var, String str, jx2 jx2Var, w7 w7Var, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f9.j : f9Var, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? jx2.f : jx2Var, (i & 8) != 0 ? new w7(null, null, 3, null) : w7Var, (i & 16) != 0 ? g86.h() : map);
    }
}
