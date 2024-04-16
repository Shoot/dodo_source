package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeferredIntervalItemVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\"\u0010#JP\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lms2;", "", "", "title", "", "deferredTime", "Lks2;", "comment", "", "isDisabled", "isSuggested", "isSelected", "a", "(Ljava/lang/String;Ljava/lang/Long;Lks2;ZZZ)Lms2;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "b", "Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", c.a, "Lks2;", "()Lks2;", "Z", "f", "()Z", Image.TYPE_HIGH, "g", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lks2;ZZZ)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ms2  reason: default package */
/* loaded from: classes4.dex */
public final class ms2 {
    private final String a;
    private final Long b;
    private final ks2 c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public ms2(String str, Long l, ks2 ks2Var, boolean z, boolean z2, boolean z3) {
        z65.h(str, "title");
        this.a = str;
        this.b = l;
        this.c = ks2Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static /* synthetic */ ms2 b(ms2 ms2Var, String str, Long l, ks2 ks2Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ms2Var.a;
        }
        if ((i & 2) != 0) {
            l = ms2Var.b;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            ks2Var = ms2Var.c;
        }
        ks2 ks2Var2 = ks2Var;
        if ((i & 8) != 0) {
            z = ms2Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = ms2Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = ms2Var.f;
        }
        return ms2Var.a(str, l2, ks2Var2, z4, z5, z3);
    }

    public final ms2 a(String str, Long l, ks2 ks2Var, boolean z, boolean z2, boolean z3) {
        z65.h(str, "title");
        return new ms2(str, l, ks2Var, z, z2, z3);
    }

    public final ks2 c() {
        return this.c;
    }

    public final Long d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms2)) {
            return false;
        }
        ms2 ms2Var = (ms2) obj;
        if (z65.c(this.a, ms2Var.a) && z65.c(this.b, ms2Var.b) && z65.c(this.c, ms2Var.c) && this.d == ms2Var.d && this.e == ms2Var.e && this.f == ms2Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.b;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        ks2 ks2Var = this.c;
        if (ks2Var != null) {
            i = ks2Var.hashCode();
        }
        return ((((((i2 + i) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        Long l = this.b;
        ks2 ks2Var = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        return "DeferredIntervalItemVO(title=" + str + ", deferredTime=" + l + ", comment=" + ks2Var + ", isDisabled=" + z + ", isSuggested=" + z2 + ", isSelected=" + z3 + ")";
    }

    public /* synthetic */ ms2(String str, Long l, ks2 ks2Var, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, ks2Var, z, z2, (i & 32) != 0 ? false : z3);
    }
}
