package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MapAddressStateVOImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001\u0014BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\bE\u0010FJG\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0014\u0010.\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00101\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010-R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u00108\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010-R\u0014\u0010;\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010-R\u0014\u0010A\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010-R\u0014\u0010C\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010-R\u0014\u0010D\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010-¨\u0006G"}, d2 = {"Lx56;", "Lw56;", "Lf9;", "state", "", "localityId", "Lw7;", "addressFields", "Ljx2;", "deliveryLocation", "", "lastAddressDetails", "q", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lf9;", "u", "()Lf9;", "b", "Ljava/lang/String;", "getLocalityId", "()Ljava/lang/String;", c.a, "Lw7;", "l", "()Lw7;", DateTokenConverter.CONVERTER_KEY, "Ljx2;", Image.TYPE_SMALL, "()Ljx2;", e.a, "Ljava/util/Map;", "t", "()Ljava/util/Map;", "o", "addressMainFieldHint", Image.TYPE_HIGH, "addressMainFieldText", "f", "()Z", "addressMainFieldIsEnabled", Image.TYPE_MEDIUM, "addressMainFieldHasErrorBackground", "warningIsVisible", "Ldi0;", "g", "()Ldi0;", "confirmButtonState", "i", "deleteButtonState", "errorIconIsVisible", "n", "()I", "warningTextRes", "Lye0;", "j", "()Lye0;", "bottomSheetAddressFieldsState", "isDesignProgress", "canChangeCoordinates", "k", "myLocationButtonIsVisible", "showAddressCatcher", "<init>", "(Lf9;Ljava/lang/String;Lw7;Ljx2;Ljava/util/Map;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x56  reason: default package */
/* loaded from: classes2.dex */
public final class x56 implements w56 {
    public static final a f = new a(null);
    private static final x56 g = new x56(f9.j, null, null, null, null, 30, null);
    private final f9 a;
    private final String b;
    private final w7 c;
    private final jx2 d;
    private final Map<String, String> e;

    /* compiled from: MapAddressStateVOImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lx56$a;", "", "Lx56;", "startState", "Lx56;", "a", "()Lx56;", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: x56$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x56 a() {
            return x56.g;
        }
    }

    public x56() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ x56 r(x56 x56Var, f9 f9Var, String str, w7 w7Var, jx2 jx2Var, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            f9Var = x56Var.a;
        }
        if ((i & 2) != 0) {
            str = x56Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            w7Var = x56Var.c;
        }
        w7 w7Var2 = w7Var;
        if ((i & 8) != 0) {
            jx2Var = x56Var.d;
        }
        jx2 jx2Var2 = jx2Var;
        Map<String, String> map2 = map;
        if ((i & 16) != 0) {
            map2 = x56Var.e;
        }
        return x56Var.q(f9Var, str2, w7Var2, jx2Var2, map2);
    }

    @Override // defpackage.w56
    public boolean a() {
        return this.a.q();
    }

    @Override // defpackage.w56
    public boolean b() {
        return this.a.E();
    }

    @Override // defpackage.w56
    public boolean c() {
        return y56.c(this.a, l());
    }

    @Override // defpackage.w56
    public boolean d() {
        return this.a.s();
    }

    @Override // defpackage.w56
    public boolean e() {
        return this.a.w();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x56)) {
            return false;
        }
        x56 x56Var = (x56) obj;
        if (this.a == x56Var.a && z65.c(this.b, x56Var.b) && z65.c(this.c, x56Var.c) && z65.c(this.d, x56Var.d) && z65.c(this.e, x56Var.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.w56
    public boolean f() {
        return this.a.k();
    }

    @Override // defpackage.w56
    public di0 g() {
        return y56.a(this.a, l(), this.d.f());
    }

    @Override // defpackage.w56
    public String h() {
        return this.d.f();
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.w56
    public di0 i() {
        return y56.b(this.a);
    }

    @Override // defpackage.w56
    public ye0 j() {
        return this.a.o();
    }

    @Override // defpackage.w56
    public boolean k() {
        return this.a.u();
    }

    @Override // defpackage.w56
    public w7 l() {
        return this.c;
    }

    @Override // defpackage.w56
    public boolean m() {
        return this.a.i();
    }

    @Override // defpackage.w56
    public int n() {
        return this.a.x();
    }

    @Override // defpackage.w56
    public String o() {
        return l().d();
    }

    public final x56 q(f9 f9Var, String str, w7 w7Var, jx2 jx2Var, Map<String, String> map) {
        z65.h(f9Var, "state");
        z65.h(str, "localityId");
        z65.h(w7Var, "addressFields");
        z65.h(jx2Var, "deliveryLocation");
        z65.h(map, "lastAddressDetails");
        return new x56(f9Var, str, w7Var, jx2Var, map);
    }

    public final jx2 s() {
        return this.d;
    }

    public final Map<String, String> t() {
        return this.e;
    }

    public String toString() {
        f9 f9Var = this.a;
        String str = this.b;
        w7 w7Var = this.c;
        jx2 jx2Var = this.d;
        Map<String, String> map = this.e;
        return "MapAddressStateVOImpl(state=" + f9Var + ", localityId=" + str + ", addressFields=" + w7Var + ", deliveryLocation=" + jx2Var + ", lastAddressDetails=" + map + ")";
    }

    public final f9 u() {
        return this.a;
    }

    public x56(f9 f9Var, String str, w7 w7Var, jx2 jx2Var, Map<String, String> map) {
        z65.h(f9Var, "state");
        z65.h(str, "localityId");
        z65.h(w7Var, "addressFields");
        z65.h(jx2Var, "deliveryLocation");
        z65.h(map, "lastAddressDetails");
        this.a = f9Var;
        this.b = str;
        this.c = w7Var;
        this.d = jx2Var;
        this.e = map;
    }

    public /* synthetic */ x56(f9 f9Var, String str, w7 w7Var, jx2 jx2Var, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f9.j : f9Var, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new w7(null, null, 3, null) : w7Var, (i & 8) != 0 ? jx2.f : jx2Var, (i & 16) != 0 ? g86.h() : map);
    }
}
