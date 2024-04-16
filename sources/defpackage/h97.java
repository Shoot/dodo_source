package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: OnboardingData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010+\u001a\u00020'¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\n\u0010*¨\u0006."}, d2 = {"Lh97;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "j", "()Z", "isFirstAppStart", "b", "f", "isAppRestarted", "Ldt5;", c.a, "Ldt5;", "()Ldt5;", "currentLocality", DateTokenConverter.CONVERTER_KEY, "i", "isEmptyCart", e.a, "Ljava/lang/String;", "()Ljava/lang/String;", "deviceLocalityCode", "Li97;", "Li97;", "()Li97;", "forceOnboardingFlow", "Lqw1;", "g", "Lqw1;", "()Lqw1;", "pinCoordinates", "Lck1;", Image.TYPE_HIGH, "Lck1;", "()Lck1;", "commonSender", "<init>", "(ZZLdt5;ZLjava/lang/String;Li97;Lqw1;Lck1;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h97  reason: default package */
/* loaded from: classes2.dex */
public final class h97 implements Serializable {
    private final boolean a;
    private final boolean b;
    private final dt5 c;
    private final boolean d;
    private final String e;
    private final i97 f;
    private final qw1 g;
    private final ck1 h;

    public h97(boolean z, boolean z2, dt5 dt5Var, boolean z3, String str, i97 i97Var, qw1 qw1Var, ck1 ck1Var) {
        z65.h(str, "deviceLocalityCode");
        z65.h(ck1Var, "commonSender");
        this.a = z;
        this.b = z2;
        this.c = dt5Var;
        this.d = z3;
        this.e = str;
        this.f = i97Var;
        this.g = qw1Var;
        this.h = ck1Var;
    }

    public final ck1 a() {
        return this.h;
    }

    public final dt5 b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final i97 d() {
        return this.f;
    }

    public final qw1 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h97)) {
            return false;
        }
        h97 h97Var = (h97) obj;
        if (this.a == h97Var.a && this.b == h97Var.b && z65.c(this.c, h97Var.c) && this.d == h97Var.d && z65.c(this.e, h97Var.e) && z65.c(this.f, h97Var.f) && z65.c(this.g, h97Var.g) && this.h == h97Var.h) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a = ((a91.a(this.a) * 31) + a91.a(this.b)) * 31;
        dt5 dt5Var = this.c;
        int i = 0;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        int a2 = (((((a + hashCode) * 31) + a91.a(this.d)) * 31) + this.e.hashCode()) * 31;
        i97 i97Var = this.f;
        if (i97Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = i97Var.hashCode();
        }
        int i2 = (a2 + hashCode2) * 31;
        qw1 qw1Var = this.g;
        if (qw1Var != null) {
            i = qw1Var.hashCode();
        }
        return ((i2 + i) * 31) + this.h.hashCode();
    }

    public final boolean i() {
        return this.d;
    }

    public final boolean j() {
        return this.a;
    }

    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        dt5 dt5Var = this.c;
        boolean z3 = this.d;
        String str = this.e;
        i97 i97Var = this.f;
        qw1 qw1Var = this.g;
        ck1 ck1Var = this.h;
        return "OnboardingData(isFirstAppStart=" + z + ", isAppRestarted=" + z2 + ", currentLocality=" + dt5Var + ", isEmptyCart=" + z3 + ", deviceLocalityCode=" + str + ", forceOnboardingFlow=" + i97Var + ", pinCoordinates=" + qw1Var + ", commonSender=" + ck1Var + ")";
    }
}
