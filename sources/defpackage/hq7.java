package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ij6;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ParagraphLayoutCache.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001aø\u0001\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J#\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\rJK\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u0004\u0018\u00010\u001fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001f\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(R.\u00101\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00106\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00102\u001a\u0004\b'\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b!\u00107\"\u0004\b8\u00109R+\u0010@\u001a\u00020;8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010<\u001a\u0004\b#\u0010=\"\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001f\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bJ\u0010<R\u0016\u0010M\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010(R\u0016\u0010O\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010(R\u0014\u0010Q\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010P\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006T"}, d2 = {"Lhq7;", "", "Lqm5;", "layoutDirection", "Leq7;", "j", "Lnr1;", "constraints", "Lbq7;", e.a, "(JLqm5;)Lbq7;", "", Image.TYPE_HIGH, "(JLqm5;)Z", "", "g", "f", "", "text", "Lrcb;", "style", "Lw24$b;", "fontFamilyResolver", "Lgcb;", "overflow", "softWrap", "", "maxLines", "minLines", "l", "(Ljava/lang/String;Lrcb;Lw24$b;IZII)V", "Lbcb;", "k", "a", "Ljava/lang/String;", "b", "Lrcb;", c.a, "Lw24$b;", DateTokenConverter.CONVERTER_KEY, "I", "Z", "La03;", "value", "La03;", "getDensity$foundation_release", "()La03;", "i", "(La03;)V", "density", "Lbq7;", "()Lbq7;", "setParagraph$foundation_release", "(Lbq7;)V", "paragraph", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "Lw55;", "J", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "Lij6;", "Lij6;", "mMinLinesConstrainer", Image.TYPE_MEDIUM, "Leq7;", "paragraphIntrinsics", "n", "Lqm5;", "intrinsicsLayoutDirection", "o", "prevConstraints", "p", "cachedIntrinsicHeightInputWidth", "q", "cachedIntrinsicHeight", "()Lkotlin/Unit;", "observeFontChanges", "<init>", "(Ljava/lang/String;Lrcb;Lw24$b;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hq7  reason: default package */
/* loaded from: classes.dex */
public final class hq7 {
    private String a;
    private rcb b;
    private w24.b c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private a03 h;
    private bq7 i;
    private boolean j;
    private long k;
    private ij6 l;
    private eq7 m;
    private qm5 n;
    private long o;
    private int p;
    private int q;

    public /* synthetic */ hq7(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rcbVar, bVar, i, z, i2, i3);
    }

    private final bq7 e(long j, qm5 qm5Var) {
        eq7 j2 = j(qm5Var);
        return gq7.c(j2, mn5.a(j, this.e, this.d, j2.b()), mn5.b(this.e, this.d, this.f), gcb.e(this.d, gcb.a.b()));
    }

    private final void g() {
        this.i = null;
        this.m = null;
        this.n = null;
        this.p = -1;
        this.q = -1;
        this.o = nr1.b.c(0, 0);
        this.k = x55.a(0, 0);
        this.j = false;
    }

    private final boolean h(long j, qm5 qm5Var) {
        eq7 eq7Var;
        bq7 bq7Var = this.i;
        if (bq7Var == null || (eq7Var = this.m) == null || eq7Var.a() || qm5Var != this.n) {
            return true;
        }
        if (nr1.g(j, this.o)) {
            return false;
        }
        if (nr1.n(j) != nr1.n(this.o) || nr1.m(j) < bq7Var.getHeight() || bq7Var.h()) {
            return true;
        }
        return false;
    }

    private final eq7 j(qm5 qm5Var) {
        eq7 eq7Var = this.m;
        if (eq7Var == null || qm5Var != this.n || eq7Var.a()) {
            this.n = qm5Var;
            String str = this.a;
            rcb c = tcb.c(this.b, qm5Var);
            a03 a03Var = this.h;
            z65.e(a03Var);
            eq7Var = fq7.b(str, c, null, null, a03Var, this.c, 12, null);
        }
        this.m = eq7Var;
        return eq7Var;
    }

    public final boolean a() {
        return this.j;
    }

    public final long b() {
        return this.k;
    }

    public final Unit c() {
        eq7 eq7Var = this.m;
        if (eq7Var != null) {
            eq7Var.a();
        }
        return Unit.a;
    }

    public final bq7 d() {
        return this.i;
    }

    public final boolean f(long j, qm5 qm5Var) {
        z65.h(qm5Var, "layoutDirection");
        boolean z = true;
        if (this.g > 1) {
            ij6.a aVar = ij6.h;
            ij6 ij6Var = this.l;
            rcb rcbVar = this.b;
            a03 a03Var = this.h;
            z65.e(a03Var);
            ij6 a = aVar.a(ij6Var, qm5Var, rcbVar, a03Var, this.c);
            this.l = a;
            j = a.c(j, this.g);
        }
        boolean z2 = false;
        if (!h(j, qm5Var)) {
            if (!nr1.g(j, this.o)) {
                bq7 bq7Var = this.i;
                z65.e(bq7Var);
                long d = qr1.d(j, x55.a(nab.a(bq7Var.getWidth()), nab.a(bq7Var.getHeight())));
                this.k = d;
                if (gcb.e(this.d, gcb.a.c()) || (w55.g(d) >= bq7Var.getWidth() && w55.f(d) >= bq7Var.getHeight())) {
                    z = false;
                }
                this.j = z;
            }
            return false;
        }
        bq7 e = e(j, qm5Var);
        this.o = j;
        long d2 = qr1.d(j, x55.a(nab.a(e.getWidth()), nab.a(e.getHeight())));
        this.k = d2;
        if (!gcb.e(this.d, gcb.a.c()) && (w55.g(d2) < e.getWidth() || w55.f(d2) < e.getHeight())) {
            z2 = true;
        }
        this.j = z2;
        this.i = e;
        return true;
    }

    public final void i(a03 a03Var) {
        a03 a03Var2 = this.h;
        if (a03Var2 == null) {
            this.h = a03Var;
        } else if (a03Var == null) {
            this.h = a03Var;
            g();
        } else if (a03Var2.getDensity() != a03Var.getDensity() || a03Var2.k0() != a03Var.k0()) {
            this.h = a03Var;
            g();
        }
    }

    public final bcb k() {
        a03 a03Var;
        List l;
        List l2;
        qm5 qm5Var = this.n;
        if (qm5Var == null || (a03Var = this.h) == null) {
            return null;
        }
        ml mlVar = new ml(this.a, null, null, 6, null);
        if (this.i == null || this.m == null) {
            return null;
        }
        long e = nr1.e(this.o, 0, 0, 0, 0, 10, null);
        rcb rcbVar = this.b;
        l = kc1.l();
        zbb zbbVar = new zbb(mlVar, rcbVar, l, this.f, this.e, this.d, a03Var, qm5Var, this.c, e, (DefaultConstructorMarker) null);
        rcb rcbVar2 = this.b;
        l2 = kc1.l();
        return new bcb(zbbVar, new rp6(new sp6(mlVar, rcbVar2, l2, a03Var, this.c), e, this.f, gcb.e(this.d, gcb.a.b()), null), this.k, null);
    }

    public final void l(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.a = str;
        this.b = rcbVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        g();
    }

    private hq7(String str, rcb rcbVar, w24.b bVar, int i, boolean z, int i2, int i3) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(bVar, "fontFamilyResolver");
        this.a = str;
        this.b = rcbVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.k = x55.a(0, 0);
        this.o = nr1.b.c(0, 0);
        this.p = -1;
        this.q = -1;
    }
}
