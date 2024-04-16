package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.i97;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectLocationFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001\nBQ\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010#\u001a\u00020 \u0012\b\b\u0002\u0010(\u001a\u00020$¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010#\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\u0018\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\n\u0010'¨\u0006,"}, d2 = {"Lj6a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "i", "()Z", "isFirstAppStart", "Ldt5;", "b", "Ldt5;", "()Ldt5;", "currentLocality", c.a, "f", "isEmptyCart", "Li97;", DateTokenConverter.CONVERTER_KEY, "Li97;", "()Li97;", "forceOnboardingFlow", e.a, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "selectDeliverablePlaceResult", "Lqw1;", "Lqw1;", "()Lqw1;", "pinCoordinates", "Lck1;", "g", "Lck1;", "()Lck1;", "commonSender", "<init>", "(ZLdt5;ZLi97;Ljava/lang/Integer;Lqw1;Lck1;)V", Image.TYPE_HIGH, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: j6a */
/* loaded from: classes4.dex */
public final class j6a implements Serializable {
    public static final a h = new a(null);
    private final boolean a;
    private final dt5 b;
    private final boolean c;
    private final i97 d;
    private final Integer e;
    private final qw1 f;
    private final ck1 g;

    /* compiled from: SelectLocationFragment.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\fJ(\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fJJ\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0018\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u000e¨\u0006\u0019"}, d2 = {"Lj6a$a;", "", "Ldt5;", "currentLocality", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", "currentCountryCode", "", "isEmptyCart", "", "selectDeliverablePlaceResult", "currentAddress", "Lck1;", "commonSender", "Lj6a;", "b", c.a, "Lqw1;", "pinCoordinates", e.a, "a", "g", Image.TYPE_HIGH, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: j6a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ j6a d(a aVar, dt5 dt5Var, String str, boolean z, int i, String str2, ck1 ck1Var, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i2 & 32) != 0) {
                ck1Var = ck1.v;
            }
            return aVar.b(dt5Var, str, z, i, str3, ck1Var);
        }

        public static /* synthetic */ j6a f(a aVar, dt5 dt5Var, String str, boolean z, int i, String str2, qw1 qw1Var, ck1 ck1Var, int i2, Object obj) {
            String str3;
            ck1 ck1Var2;
            if ((i2 & 16) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if ((i2 & 64) != 0) {
                ck1Var2 = ck1.v;
            } else {
                ck1Var2 = ck1Var;
            }
            return aVar.e(dt5Var, str, z, i, str3, qw1Var, ck1Var2);
        }

        public final j6a a() {
            return new j6a(true, null, true, null, null, null, ck1.v, 56, null);
        }

        public final j6a b(dt5 dt5Var, String str, boolean z, int i, String str2, ck1 ck1Var) {
            z65.h(str, "currentCountryCode");
            z65.h(ck1Var, "commonSender");
            return new j6a(false, dt5Var, z, new i97.c(str, ha4.b, str2), Integer.valueOf(i), null, ck1Var, 32, null);
        }

        public final j6a c(dt5 dt5Var, boolean z, int i, ck1 ck1Var) {
            z65.h(dt5Var, "currentLocality");
            z65.h(ck1Var, "commonSender");
            return new j6a(false, dt5Var, z, new i97.c(dt5Var.a(), ha4.b, null, 4, null), Integer.valueOf(i), null, ck1Var, 32, null);
        }

        public final j6a e(dt5 dt5Var, String str, boolean z, int i, String str2, qw1 qw1Var, ck1 ck1Var) {
            z65.h(str, "currentCountryCode");
            z65.h(qw1Var, "pinCoordinates");
            z65.h(ck1Var, "commonSender");
            return new j6a(false, dt5Var, z, new i97.c(str, ha4.c, str2), Integer.valueOf(i), qw1Var, ck1Var);
        }

        public final j6a g(dt5 dt5Var, boolean z) {
            return new j6a(false, dt5Var, z, null, null, null, null, 120, null);
        }

        public final j6a h() {
            return new j6a(false, null, false, i97.d.a, null, null, null, 118, null);
        }
    }

    public j6a(boolean z, dt5 dt5Var, boolean z2, i97 i97Var, Integer num, qw1 qw1Var, ck1 ck1Var) {
        z65.h(qw1Var, "pinCoordinates");
        z65.h(ck1Var, "commonSender");
        this.a = z;
        this.b = dt5Var;
        this.c = z2;
        this.d = i97Var;
        this.e = num;
        this.f = qw1Var;
        this.g = ck1Var;
    }

    public final ck1 a() {
        return this.g;
    }

    public final dt5 b() {
        return this.b;
    }

    public final i97 c() {
        return this.d;
    }

    public final qw1 d() {
        return this.f;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6a)) {
            return false;
        }
        j6a j6aVar = (j6a) obj;
        if (this.a == j6aVar.a && z65.c(this.b, j6aVar.b) && this.c == j6aVar.c && z65.c(this.d, j6aVar.d) && z65.c(this.e, j6aVar.e) && z65.c(this.f, j6aVar.f) && this.g == j6aVar.g) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a2 = a91.a(this.a) * 31;
        dt5 dt5Var = this.b;
        int i = 0;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        int a3 = (((a2 + hashCode) * 31) + a91.a(this.c)) * 31;
        i97 i97Var = this.d;
        if (i97Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = i97Var.hashCode();
        }
        int i2 = (a3 + hashCode2) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return ((((i2 + i) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final boolean i() {
        return this.a;
    }

    public String toString() {
        boolean z = this.a;
        dt5 dt5Var = this.b;
        boolean z2 = this.c;
        i97 i97Var = this.d;
        Integer num = this.e;
        qw1 qw1Var = this.f;
        ck1 ck1Var = this.g;
        return "SelectLocationScreenArg(isFirstAppStart=" + z + ", currentLocality=" + dt5Var + ", isEmptyCart=" + z2 + ", forceOnboardingFlow=" + i97Var + ", selectDeliverablePlaceResult=" + num + ", pinCoordinates=" + qw1Var + ", commonSender=" + ck1Var + ")";
    }

    public /* synthetic */ j6a(boolean z, dt5 dt5Var, boolean z2, i97 i97Var, Integer num, qw1 qw1Var, ck1 ck1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : dt5Var, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : i97Var, (i & 16) == 0 ? num : null, (i & 32) != 0 ? qw1.c.a() : qw1Var, (i & 64) != 0 ? ck1.v : ck1Var);
    }
}
