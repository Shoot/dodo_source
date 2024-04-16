package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BÂ\u0001\b\u0000\u0012\u0006\u00100\u001a\u00020,\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0001¢\u0006\u0004\bd\u0010eBÄ\u0001\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0001¢\u0006\u0004\bd\u0010fJ\u0014\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007JË\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020$2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010&\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b(\u0010'J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020\u0010H\u0016R\u001a\u00100\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u00104R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010K\u001a\u0004\b=\u0010LR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bG\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b3\u0010P\u001a\u0004\bQ\u0010RR \u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b9\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b?\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b7\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bJ\u0010Y\u001a\u0004\bI\u0010ZR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bE\u00104R\u0013\u0010`\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\bA\u0010_R\u0011\u0010c\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\b5\u0010b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006g"}, d2 = {"Lvqa;", "", "other", "x", "Luc1;", RemoteMessageConst.Notification.COLOR, "Lwcb;", "fontSize", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "Lw24;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lv80;", "baselineShift", "Lgbb;", "textGeometricTransform", "Lns5;", "localeList", "background", "Lkab;", "textDecoration", "Loga;", "shadow", "Lkc8;", "platformStyle", "Lz73;", "drawStyle", "a", "(JJLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Lkc8;Lz73;)Lvqa;", "", "equals", "v", "(Lvqa;)Z", "w", "", "hashCode", "toString", "Lcbb;", "Lcbb;", "t", "()Lcbb;", "textForegroundStyle", "b", "J", "k", "()J", c.a, "Lv34;", "n", "()Lv34;", DateTokenConverter.CONVERTER_KEY, "Lq34;", "l", "()Lq34;", e.a, "Lr34;", Image.TYPE_MEDIUM, "()Lr34;", "f", "Lw24;", "i", "()Lw24;", "g", "Ljava/lang/String;", "j", "()Ljava/lang/String;", Image.TYPE_HIGH, "o", "Lv80;", "()Lv80;", "Lgbb;", "u", "()Lgbb;", "Lns5;", "p", "()Lns5;", "Lkab;", Image.TYPE_SMALL, "()Lkab;", "Loga;", "r", "()Loga;", "Lz73;", "()Lz73;", "Lkc8;", "q", "()Lkc8;", "Lmg0;", "()Lmg0;", "brush", "", "()F", "alpha", "<init>", "(Lcbb;JLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Lkc8;Lz73;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Lkc8;Lz73;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vqa  reason: default package */
/* loaded from: classes.dex */
public final class vqa {
    private final cbb a;
    private final long b;
    private final v34 c;
    private final q34 d;
    private final r34 e;
    private final w24 f;
    private final String g;
    private final long h;
    private final v80 i;
    private final gbb j;
    private final ns5 k;
    private final long l;
    private final kab m;
    private final oga n;
    private final z73 o;

    public /* synthetic */ vqa(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, kc8Var, z73Var);
    }

    public static /* synthetic */ vqa b(vqa vqaVar, long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var, int i, Object obj) {
        kc8 kc8Var2;
        long g = (i & 1) != 0 ? vqaVar.g() : j;
        long j5 = (i & 2) != 0 ? vqaVar.b : j2;
        v34 v34Var2 = (i & 4) != 0 ? vqaVar.c : v34Var;
        q34 q34Var2 = (i & 8) != 0 ? vqaVar.d : q34Var;
        r34 r34Var2 = (i & 16) != 0 ? vqaVar.e : r34Var;
        w24 w24Var2 = (i & 32) != 0 ? vqaVar.f : w24Var;
        String str2 = (i & 64) != 0 ? vqaVar.g : str;
        long j6 = (i & 128) != 0 ? vqaVar.h : j3;
        v80 v80Var2 = (i & 256) != 0 ? vqaVar.i : v80Var;
        gbb gbbVar2 = (i & 512) != 0 ? vqaVar.j : gbbVar;
        ns5 ns5Var2 = (i & 1024) != 0 ? vqaVar.k : ns5Var;
        gbb gbbVar3 = gbbVar2;
        long j7 = (i & 2048) != 0 ? vqaVar.l : j4;
        kab kabVar2 = (i & 4096) != 0 ? vqaVar.m : kabVar;
        oga ogaVar2 = (i & 8192) != 0 ? vqaVar.n : ogaVar;
        if ((i & 16384) != 0) {
            vqaVar.getClass();
            kc8Var2 = null;
        } else {
            kc8Var2 = kc8Var;
        }
        return vqaVar.a(g, j5, v34Var2, q34Var2, r34Var2, w24Var2, str2, j6, v80Var2, gbbVar3, ns5Var2, j7, kabVar2, ogaVar2, kc8Var2, (i & 32768) != 0 ? vqaVar.o : z73Var);
    }

    public final vqa a(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var) {
        cbb b;
        if (uc1.l(j, g())) {
            b = this.a;
        } else {
            b = cbb.a.b(j);
        }
        return new vqa(b, j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, kc8Var, z73Var, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.a.a();
    }

    public final long d() {
        return this.l;
    }

    public final v80 e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqa)) {
            return false;
        }
        vqa vqaVar = (vqa) obj;
        if (v(vqaVar) && w(vqaVar)) {
            return true;
        }
        return false;
    }

    public final mg0 f() {
        return this.a.e();
    }

    public final long g() {
        return this.a.b();
    }

    public final z73 h() {
        return this.o;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int r = uc1.r(g()) * 31;
        mg0 f = f();
        int i12 = 0;
        if (f != null) {
            i = f.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((((r + i) * 31) + Float.floatToIntBits(c())) * 31) + wcb.i(this.b)) * 31;
        v34 v34Var = this.c;
        if (v34Var != null) {
            i2 = v34Var.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (floatToIntBits + i2) * 31;
        q34 q34Var = this.d;
        if (q34Var != null) {
            i3 = q34.g(q34Var.i());
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        r34 r34Var = this.e;
        if (r34Var != null) {
            i4 = r34.f(r34Var.j());
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        w24 w24Var = this.f;
        if (w24Var != null) {
            i5 = w24Var.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        String str = this.g;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (((i16 + i6) * 31) + wcb.i(this.h)) * 31;
        v80 v80Var = this.i;
        if (v80Var != null) {
            i7 = v80.f(v80Var.h());
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        gbb gbbVar = this.j;
        if (gbbVar != null) {
            i8 = gbbVar.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        ns5 ns5Var = this.k;
        if (ns5Var != null) {
            i9 = ns5Var.hashCode();
        } else {
            i9 = 0;
        }
        int r2 = (((i19 + i9) * 31) + uc1.r(this.l)) * 31;
        kab kabVar = this.m;
        if (kabVar != null) {
            i10 = kabVar.hashCode();
        } else {
            i10 = 0;
        }
        int i20 = (r2 + i10) * 31;
        oga ogaVar = this.n;
        if (ogaVar != null) {
            i11 = ogaVar.hashCode();
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 961;
        z73 z73Var = this.o;
        if (z73Var != null) {
            i12 = z73Var.hashCode();
        }
        return i21 + i12;
    }

    public final w24 i() {
        return this.f;
    }

    public final String j() {
        return this.g;
    }

    public final long k() {
        return this.b;
    }

    public final q34 l() {
        return this.d;
    }

    public final r34 m() {
        return this.e;
    }

    public final v34 n() {
        return this.c;
    }

    public final long o() {
        return this.h;
    }

    public final ns5 p() {
        return this.k;
    }

    public final kc8 q() {
        return null;
    }

    public final oga r() {
        return this.n;
    }

    public final kab s() {
        return this.m;
    }

    public final cbb t() {
        return this.a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) uc1.s(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) wcb.j(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) wcb.j(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) uc1.s(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + ((Object) null) + ", drawStyle=" + this.o + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final gbb u() {
        return this.j;
    }

    public final boolean v(vqa vqaVar) {
        z65.h(vqaVar, "other");
        if (this == vqaVar) {
            return true;
        }
        if (wcb.e(this.b, vqaVar.b) && z65.c(this.c, vqaVar.c) && z65.c(this.d, vqaVar.d) && z65.c(this.e, vqaVar.e) && z65.c(this.f, vqaVar.f) && z65.c(this.g, vqaVar.g) && wcb.e(this.h, vqaVar.h) && z65.c(this.i, vqaVar.i) && z65.c(this.j, vqaVar.j) && z65.c(this.k, vqaVar.k) && uc1.l(this.l, vqaVar.l) && z65.c(null, null)) {
            return true;
        }
        return false;
    }

    public final boolean w(vqa vqaVar) {
        z65.h(vqaVar, "other");
        if (!z65.c(this.a, vqaVar.a) || !z65.c(this.m, vqaVar.m) || !z65.c(this.n, vqaVar.n) || !z65.c(this.o, vqaVar.o)) {
            return false;
        }
        return true;
    }

    public final vqa x(vqa vqaVar) {
        if (vqaVar == null) {
            return this;
        }
        return wqa.b(this, vqaVar.a.b(), vqaVar.a.e(), vqaVar.a.a(), vqaVar.b, vqaVar.c, vqaVar.d, vqaVar.e, vqaVar.f, vqaVar.g, vqaVar.h, vqaVar.i, vqaVar.j, vqaVar.k, vqaVar.l, vqaVar.m, vqaVar.n, null, vqaVar.o);
    }

    public /* synthetic */ vqa(cbb cbbVar, long j, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j2, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j3, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cbbVar, j, v34Var, q34Var, r34Var, w24Var, str, j2, v80Var, gbbVar, ns5Var, j3, kabVar, ogaVar, kc8Var, z73Var);
    }

    private vqa(cbb cbbVar, long j, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j2, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j3, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var) {
        z65.h(cbbVar, "textForegroundStyle");
        this.a = cbbVar;
        this.b = j;
        this.c = v34Var;
        this.d = q34Var;
        this.e = r34Var;
        this.f = w24Var;
        this.g = str;
        this.h = j2;
        this.i = v80Var;
        this.j = gbbVar;
        this.k = ns5Var;
        this.l = j3;
        this.m = kabVar;
        this.n = ogaVar;
        this.o = z73Var;
    }

    public /* synthetic */ vqa(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? uc1.b.e() : j, (i & 2) != 0 ? wcb.b.a() : j2, (i & 4) != 0 ? null : v34Var, (i & 8) != 0 ? null : q34Var, (i & 16) != 0 ? null : r34Var, (i & 32) != 0 ? null : w24Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? wcb.b.a() : j3, (i & 256) != 0 ? null : v80Var, (i & 512) != 0 ? null : gbbVar, (i & 1024) != 0 ? null : ns5Var, (i & 2048) != 0 ? uc1.b.e() : j4, (i & 4096) != 0 ? null : kabVar, (i & 8192) != 0 ? null : ogaVar, (i & 16384) != 0 ? null : kc8Var, (i & 32768) != 0 ? null : z73Var, (DefaultConstructorMarker) null);
    }

    private vqa(long j, long j2, v34 v34Var, q34 q34Var, r34 r34Var, w24 w24Var, String str, long j3, v80 v80Var, gbb gbbVar, ns5 ns5Var, long j4, kab kabVar, oga ogaVar, kc8 kc8Var, z73 z73Var) {
        this(cbb.a.b(j), j2, v34Var, q34Var, r34Var, w24Var, str, j3, v80Var, gbbVar, ns5Var, j4, kabVar, ogaVar, kc8Var, z73Var, (DefaultConstructorMarker) null);
    }
}
