package defpackage;

import android.graphics.Outline;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cna;
import defpackage.jm7;
import kotlin.Metadata;
/* compiled from: OutlineResolver.android.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u0014\u001a\u00020\u0013*\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u001b\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J\u001b\u0010&\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010(R\u0016\u0010+\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0016\u00106\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010*R\u0016\u00107\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0016\u0010<\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010;R\u001f\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b=\u00101R\u001f\u0010@\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b?\u00101R\u0016\u0010B\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010*R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00103R\u0018\u0010H\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00103R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0013\u0010N\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010MR\u0011\u0010P\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b0\u0010OR\u0013\u0010R\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010Q\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006U"}, d2 = {"Llm7;", "", "", "i", "Lk99;", "rect", "k", "Lgo9;", "roundRect", "l", "Lor7;", "composePath", "j", "Ls67;", "offset", "Lcna;", "size", "", "radius", "", "f", "(Lgo9;JJF)Z", "Ltga;", "shape", "alpha", "clipToOutline", "elevation", "Lqm5;", "layoutDirection", "La03;", "density", "g", "position", e.a, "(J)Z", "Lqn0;", "canvas", "a", Image.TYPE_HIGH, "(J)V", "La03;", "b", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", c.a, "Landroid/graphics/Outline;", "cachedOutline", DateTokenConverter.CONVERTER_KEY, "J", "Ltga;", "Lor7;", "cachedRrectPath", "outlinePath", "cacheIsDirty", "usePathForClip", "tmpPath", "Lgo9;", "tmpRoundRect", "F", "roundedCornerRadius", Image.TYPE_MEDIUM, "rectTopLeft", "n", "rectSize", "o", "outlineNeeded", "p", "Lqm5;", "q", "tmpTouchPointPath", "r", "tmpOpPath", "Ljm7;", Image.TYPE_SMALL, "Ljm7;", "calculatedOutline", "()Landroid/graphics/Outline;", "outline", "()Z", "outlineClipSupported", "()Lor7;", "clipPath", "<init>", "(La03;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lm7  reason: default package */
/* loaded from: classes.dex */
public final class lm7 {
    private a03 a;
    private boolean b;
    private final Outline c;
    private long d;
    private tga e;
    private or7 f;
    private or7 g;
    private boolean h;
    private boolean i;
    private or7 j;
    private go9 k;
    private float l;
    private long m;
    private long n;
    private boolean o;
    private qm5 p;
    private or7 q;
    private or7 r;
    private jm7 s;

    public lm7(a03 a03Var) {
        z65.h(a03Var, "density");
        this.a = a03Var;
        this.b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        cna.a aVar = cna.b;
        this.d = aVar.b();
        this.e = s99.a();
        this.m = s67.b.c();
        this.n = aVar.b();
        this.p = qm5.Ltr;
    }

    private final boolean f(go9 go9Var, long j, long j2, float f) {
        if (go9Var == null || !ho9.d(go9Var) || go9Var.e() != s67.l(j) || go9Var.g() != s67.m(j) || go9Var.f() != s67.l(j) + cna.i(j2) || go9Var.a() != s67.m(j) + cna.g(j2) || bx1.d(go9Var.h()) != f) {
            return false;
        }
        return true;
    }

    private final void i() {
        if (this.h) {
            this.m = s67.b.c();
            long j = this.d;
            this.n = j;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            if (this.o && cna.i(j) > 0.0f && cna.g(this.d) > 0.0f) {
                this.b = true;
                jm7 a = this.e.a(this.d, this.p, this.a);
                this.s = a;
                if (a instanceof jm7.b) {
                    k(((jm7.b) a).a());
                    return;
                } else if (a instanceof jm7.c) {
                    l(((jm7.c) a).a());
                    return;
                } else if (a instanceof jm7.a) {
                    j(((jm7.a) a).a());
                    return;
                } else {
                    return;
                }
            }
            this.c.setEmpty();
        }
    }

    private final void j(or7 or7Var) {
        if (Build.VERSION.SDK_INT <= 28 && !or7Var.a()) {
            this.b = false;
            this.c.setEmpty();
            this.i = true;
        } else {
            Outline outline = this.c;
            if (or7Var instanceof ei) {
                outline.setConvexPath(((ei) or7Var).q());
                this.i = !this.c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.g = or7Var;
    }

    private final void k(k99 k99Var) {
        int c;
        int c2;
        int c3;
        int c4;
        this.m = x67.a(k99Var.f(), k99Var.i());
        this.n = ina.a(k99Var.j(), k99Var.e());
        Outline outline = this.c;
        c = la6.c(k99Var.f());
        c2 = la6.c(k99Var.i());
        c3 = la6.c(k99Var.g());
        c4 = la6.c(k99Var.c());
        outline.setRect(c, c2, c3, c4);
    }

    private final void l(go9 go9Var) {
        int c;
        int c2;
        int c3;
        int c4;
        float d = bx1.d(go9Var.h());
        this.m = x67.a(go9Var.e(), go9Var.g());
        this.n = ina.a(go9Var.j(), go9Var.d());
        if (ho9.d(go9Var)) {
            Outline outline = this.c;
            c = la6.c(go9Var.e());
            c2 = la6.c(go9Var.g());
            c3 = la6.c(go9Var.f());
            c4 = la6.c(go9Var.a());
            outline.setRoundRect(c, c2, c3, c4, d);
            this.l = d;
            return;
        }
        or7 or7Var = this.f;
        if (or7Var == null) {
            or7Var = ji.a();
            this.f = or7Var;
        }
        or7Var.reset();
        or7Var.h(go9Var);
        j(or7Var);
    }

    public final void a(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        or7 b = b();
        if (b != null) {
            pn0.c(qn0Var, b, 0, 2, null);
            return;
        }
        float f = this.l;
        if (f > 0.0f) {
            or7 or7Var = this.j;
            go9 go9Var = this.k;
            if (or7Var == null || !f(go9Var, this.m, this.n, f)) {
                go9 c = ho9.c(s67.l(this.m), s67.m(this.m), s67.l(this.m) + cna.i(this.n), s67.m(this.m) + cna.g(this.n), cx1.b(this.l, 0.0f, 2, null));
                if (or7Var == null) {
                    or7Var = ji.a();
                } else {
                    or7Var.reset();
                }
                or7Var.h(c);
                this.k = c;
                this.j = or7Var;
            }
            pn0.c(qn0Var, or7Var, 0, 2, null);
            return;
        }
        pn0.d(qn0Var, s67.l(this.m), s67.m(this.m), s67.l(this.m) + cna.i(this.n), s67.m(this.m) + cna.g(this.n), 0, 16, null);
    }

    public final or7 b() {
        i();
        return this.g;
    }

    public final Outline c() {
        i();
        if (this.o && this.b) {
            return this.c;
        }
        return null;
    }

    public final boolean d() {
        return !this.i;
    }

    public final boolean e(long j) {
        jm7 jm7Var;
        if (!this.o || (jm7Var = this.s) == null) {
            return true;
        }
        return wga.b(jm7Var, s67.l(j), s67.m(j), this.q, this.r);
    }

    public final boolean g(tga tgaVar, float f, boolean z, float f2, qm5 qm5Var, a03 a03Var) {
        boolean z2;
        z65.h(tgaVar, "shape");
        z65.h(qm5Var, "layoutDirection");
        z65.h(a03Var, "density");
        this.c.setAlpha(f);
        boolean z3 = !z65.c(this.e, tgaVar);
        if (z3) {
            this.e = tgaVar;
            this.h = true;
        }
        if (!z && f2 <= 0.0f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.o != z2) {
            this.o = z2;
            this.h = true;
        }
        if (this.p != qm5Var) {
            this.p = qm5Var;
            this.h = true;
        }
        if (!z65.c(this.a, a03Var)) {
            this.a = a03Var;
            this.h = true;
        }
        return z3;
    }

    public final void h(long j) {
        if (!cna.f(this.d, j)) {
            this.d = j;
            this.h = true;
        }
    }
}
