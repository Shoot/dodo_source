package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextLayoutResult.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020&ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002J\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0002J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010+\u001a\u00020&8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u00102\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u001f\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014038\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106R\u0011\u00109\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u00108R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b'\u00108R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u00108R\u0011\u0010>\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006A"}, d2 = {"Lbcb;", "", "", "lineIndex", Image.TYPE_MEDIUM, "", "visibleEnd", "i", "", "n", "offset", "k", "vertical", "l", "Lkj9;", "q", "Ls67;", "position", "p", "(J)I", "Lk99;", "a", "other", "equals", "hashCode", "", "toString", "Lzbb;", "Lzbb;", "g", "()Lzbb;", "layoutInput", "Lrp6;", "b", "Lrp6;", "o", "()Lrp6;", "multiParagraph", "Lw55;", c.a, "J", Image.TYPE_SMALL, "()J", "size", DateTokenConverter.CONVERTER_KEY, "F", "()F", "firstBaseline", e.a, "f", "lastBaseline", "", "Ljava/util/List;", "r", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "didOverflowWidth", "hasVisualOverflow", Image.TYPE_HIGH, "()I", "lineCount", "<init>", "(Lzbb;Lrp6;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bcb  reason: default package */
/* loaded from: classes.dex */
public final class bcb {
    private final zbb a;
    private final rp6 b;
    private final long c;
    private final float d;
    private final float e;
    private final List<k99> f;

    public /* synthetic */ bcb(zbb zbbVar, rp6 rp6Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(zbbVar, rp6Var, j);
    }

    public static /* synthetic */ int j(bcb bcbVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return bcbVar.i(i, z);
    }

    public final k99 a(int i) {
        return this.b.b(i);
    }

    public final boolean b() {
        if (!this.b.c() && w55.f(this.c) >= this.b.e()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (w55.g(this.c) < this.b.r()) {
            return true;
        }
        return false;
    }

    public final float d() {
        return this.d;
    }

    public final boolean e() {
        if (!c() && !b()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcb)) {
            return false;
        }
        bcb bcbVar = (bcb) obj;
        if (z65.c(this.a, bcbVar.a) && z65.c(this.b, bcbVar.b) && w55.e(this.c, bcbVar.c) && this.d == bcbVar.d && this.e == bcbVar.e && z65.c(this.f, bcbVar.f)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.e;
    }

    public final zbb g() {
        return this.a;
    }

    public final int h() {
        return this.b.h();
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + w55.h(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(int i, boolean z) {
        return this.b.i(i, z);
    }

    public final int k(int i) {
        return this.b.j(i);
    }

    public final int l(float f) {
        return this.b.k(f);
    }

    public final int m(int i) {
        return this.b.l(i);
    }

    public final float n(int i) {
        return this.b.m(i);
    }

    public final rp6 o() {
        return this.b;
    }

    public final int p(long j) {
        return this.b.n(j);
    }

    public final kj9 q(int i) {
        return this.b.o(i);
    }

    public final List<k99> r() {
        return this.f;
    }

    public final long s() {
        return this.c;
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) w55.i(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private bcb(zbb zbbVar, rp6 rp6Var, long j) {
        z65.h(zbbVar, "layoutInput");
        z65.h(rp6Var, "multiParagraph");
        this.a = zbbVar;
        this.b = rp6Var;
        this.c = j;
        this.d = rp6Var.d();
        this.e = rp6Var.g();
        this.f = rp6Var.q();
    }
}
