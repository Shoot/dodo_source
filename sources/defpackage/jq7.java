package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ParagraphStyle.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001Bt\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u0014\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007J}\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b-\u00106R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b%\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R#\u0010?\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b=\u0010>R#\u0010@\u001a\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010<\u001a\u0004\b1\u0010>R#\u0010A\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b)\u0010>\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006D"}, d2 = {"Ljq7;", "", "other", "o", "Li9b;", "textAlign", "Loab;", "textDirection", "Lwcb;", "lineHeight", "Libb;", "textIndent", "Lhc8;", "platformStyle", "Lyp5;", "lineHeightStyle", "Lvp5;", "lineBreak", "Lcr4;", "hyphens", "Lecb;", "textMotion", "a", "(Li9b;Loab;JLibb;Lhc8;Lyp5;Lvp5;Lcr4;Lecb;)Ljq7;", "", "equals", "", "hashCode", "", "toString", "Li9b;", "j", "()Li9b;", "b", "Loab;", "l", "()Loab;", c.a, "J", "g", "()J", DateTokenConverter.CONVERTER_KEY, "Libb;", Image.TYPE_MEDIUM, "()Libb;", e.a, "Lhc8;", "i", "()Lhc8;", "f", "Lyp5;", Image.TYPE_HIGH, "()Lyp5;", "Lvp5;", "()Lvp5;", "Lcr4;", "()Lcr4;", "Lecb;", "n", "()Lecb;", "I", "k", "()I", "textAlignOrDefault", "lineBreakOrDefault", "hyphensOrDefault", "<init>", "(Li9b;Loab;JLibb;Lhc8;Lyp5;Lvp5;Lcr4;Lecb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jq7  reason: default package */
/* loaded from: classes.dex */
public final class jq7 {
    private final i9b a;
    private final oab b;
    private final long c;
    private final ibb d;
    private final hc8 e;
    private final yp5 f;
    private final vp5 g;
    private final cr4 h;
    private final ecb i;
    private final int j;
    private final int k;
    private final int l;

    public /* synthetic */ jq7(i9b i9bVar, oab oabVar, long j, ibb ibbVar, hc8 hc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i9bVar, oabVar, j, ibbVar, hc8Var, yp5Var, vp5Var, cr4Var, ecbVar);
    }

    public static /* synthetic */ jq7 b(jq7 jq7Var, i9b i9bVar, oab oabVar, long j, ibb ibbVar, hc8 hc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar, int i, Object obj) {
        i9b i9bVar2;
        oab oabVar2;
        long j2;
        ibb ibbVar2;
        hc8 hc8Var2;
        yp5 yp5Var2;
        vp5 vp5Var2;
        cr4 cr4Var2;
        ecb ecbVar2;
        if ((i & 1) != 0) {
            i9bVar2 = jq7Var.a;
        } else {
            i9bVar2 = i9bVar;
        }
        if ((i & 2) != 0) {
            oabVar2 = jq7Var.b;
        } else {
            oabVar2 = oabVar;
        }
        if ((i & 4) != 0) {
            j2 = jq7Var.c;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            ibbVar2 = jq7Var.d;
        } else {
            ibbVar2 = ibbVar;
        }
        if ((i & 16) != 0) {
            hc8Var2 = jq7Var.e;
        } else {
            hc8Var2 = hc8Var;
        }
        if ((i & 32) != 0) {
            yp5Var2 = jq7Var.f;
        } else {
            yp5Var2 = yp5Var;
        }
        if ((i & 64) != 0) {
            vp5Var2 = jq7Var.g;
        } else {
            vp5Var2 = vp5Var;
        }
        if ((i & 128) != 0) {
            cr4Var2 = jq7Var.h;
        } else {
            cr4Var2 = cr4Var;
        }
        if ((i & 256) != 0) {
            ecbVar2 = jq7Var.i;
        } else {
            ecbVar2 = ecbVar;
        }
        return jq7Var.a(i9bVar2, oabVar2, j2, ibbVar2, hc8Var2, yp5Var2, vp5Var2, cr4Var2, ecbVar2);
    }

    public final jq7 a(i9b i9bVar, oab oabVar, long j, ibb ibbVar, hc8 hc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar) {
        return new jq7(i9bVar, oabVar, j, ibbVar, hc8Var, yp5Var, vp5Var, cr4Var, ecbVar, null);
    }

    public final cr4 c() {
        return this.h;
    }

    public final int d() {
        return this.l;
    }

    public final vp5 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq7)) {
            return false;
        }
        jq7 jq7Var = (jq7) obj;
        if (z65.c(this.a, jq7Var.a) && z65.c(this.b, jq7Var.b) && wcb.e(this.c, jq7Var.c) && z65.c(this.d, jq7Var.d) && z65.c(this.e, jq7Var.e) && z65.c(this.f, jq7Var.f) && z65.c(this.g, jq7Var.g) && z65.c(this.h, jq7Var.h) && z65.c(this.i, jq7Var.i)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.k;
    }

    public final long g() {
        return this.c;
    }

    public final yp5 h() {
        return this.f;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        i9b i9bVar = this.a;
        int i8 = 0;
        if (i9bVar != null) {
            i = i9b.k(i9bVar.m());
        } else {
            i = 0;
        }
        int i9 = i * 31;
        oab oabVar = this.b;
        if (oabVar != null) {
            i2 = oab.j(oabVar.l());
        } else {
            i2 = 0;
        }
        int i10 = (((i9 + i2) * 31) + wcb.i(this.c)) * 31;
        ibb ibbVar = this.d;
        if (ibbVar != null) {
            i3 = ibbVar.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        hc8 hc8Var = this.e;
        if (hc8Var != null) {
            i4 = hc8Var.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        yp5 yp5Var = this.f;
        if (yp5Var != null) {
            i5 = yp5Var.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        vp5 vp5Var = this.g;
        if (vp5Var != null) {
            i6 = vp5.i(vp5Var.k());
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        cr4 cr4Var = this.h;
        if (cr4Var != null) {
            i7 = cr4.g(cr4Var.i());
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        ecb ecbVar = this.i;
        if (ecbVar != null) {
            i8 = ecbVar.hashCode();
        }
        return i15 + i8;
    }

    public final hc8 i() {
        return this.e;
    }

    public final i9b j() {
        return this.a;
    }

    public final int k() {
        return this.j;
    }

    public final oab l() {
        return this.b;
    }

    public final ibb m() {
        return this.d;
    }

    public final ecb n() {
        return this.i;
    }

    public final jq7 o(jq7 jq7Var) {
        if (jq7Var == null) {
            return this;
        }
        return kq7.a(this, jq7Var.a, jq7Var.b, jq7Var.c, jq7Var.d, jq7Var.e, jq7Var.f, jq7Var.g, jq7Var.h, jq7Var.i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.a + ", textDirection=" + this.b + ", lineHeight=" + ((Object) wcb.j(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + this.g + ", hyphens=" + this.h + ", textMotion=" + this.i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private jq7(i9b i9bVar, oab oabVar, long j, ibb ibbVar, hc8 hc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar) {
        this.a = i9bVar;
        this.b = oabVar;
        this.c = j;
        this.d = ibbVar;
        this.e = hc8Var;
        this.f = yp5Var;
        this.g = vp5Var;
        this.h = cr4Var;
        this.i = ecbVar;
        this.j = i9bVar != null ? i9bVar.m() : i9b.b.f();
        this.k = vp5Var != null ? vp5Var.k() : vp5.b.a();
        this.l = cr4Var != null ? cr4Var.i() : cr4.b.b();
        if (wcb.e(j, wcb.b.a()) || wcb.h(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + wcb.h(j) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public /* synthetic */ jq7(i9b i9bVar, oab oabVar, long j, ibb ibbVar, hc8 hc8Var, yp5 yp5Var, vp5 vp5Var, cr4 cr4Var, ecb ecbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : i9bVar, (i & 2) != 0 ? null : oabVar, (i & 4) != 0 ? wcb.b.a() : j, (i & 8) != 0 ? null : ibbVar, (i & 16) != 0 ? null : hc8Var, (i & 32) != 0 ? null : yp5Var, (i & 64) != 0 ? null : vp5Var, (i & 128) != 0 ? null : cr4Var, (i & 256) == 0 ? ecbVar : null, null);
    }
}
