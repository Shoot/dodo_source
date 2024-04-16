package androidx.compose.ui.graphics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: GraphicsLayerScope.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b_\u0010`J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0015\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\"\u0010\u0019\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\"\u0010\u001c\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR+\u0010#\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 \"\u0004\b!\u0010\"R+\u0010'\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\"\u0010*\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\"\u0010.\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR\"\u00101\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\nR\"\u00103\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0006\u001a\u0004\b2\u0010\b\"\u0004\b+\u0010\nR+\u00108\u001a\u0002048\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R\"\u0010?\u001a\u0002098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010D\u001a\u00020@8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0016\u0010A\"\u0004\bB\u0010CR+\u0010J\u001a\u00020E8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b5\u0010H\"\u0004\b$\u0010IR+\u0010N\u001a\u00020K8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001f\u001a\u0004\bL\u0010 \"\u0004\bM\u0010\"R\"\u0010U\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\bR\u0014\u0010Y\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\bR$\u0010[\u001a\u0004\u0018\u00010Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\bF\u0010]\"\u0004\b\u001e\u0010^\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/ui/graphics/d;", "Landroidx/compose/ui/graphics/c;", "", "v", "", "a", "F", "X", "()F", "i", "(F)V", "scaleX", "b", "z0", "o", "scaleY", com.huawei.hms.opendevice.c.a, "alpha", DateTokenConverter.CONVERTER_KEY, "p0", "t", "translationX", com.huawei.hms.push.e.a, "l0", "f", "translationY", "q", "Z", "shadowElevation", "Luc1;", "g", "J", "()J", "H", "(J)V", "ambientShadowColor", Image.TYPE_HIGH, "u", "Q", "spotShadowColor", "r0", "k", "rotationX", "j", "w", "l", "rotationY", "A", "n", "rotationZ", "K", "cameraDistance", "Landroidx/compose/ui/graphics/f;", Image.TYPE_MEDIUM, "N", "P", "transformOrigin", "Ltga;", "Ltga;", "r", "()Ltga;", "m0", "(Ltga;)V", "shape", "", "()Z", "M", "(Z)V", "clip", "Landroidx/compose/ui/graphics/a;", "p", "I", "()I", "(I)V", "compositingStrategy", "Lcna;", "getSize-NH-jbRc", "B", "size", "La03;", "La03;", "getGraphicsDensity$ui_release", "()La03;", "x", "(La03;)V", "graphicsDensity", "getDensity", "density", "k0", "fontScale", "Lfe9;", "renderEffect", "Lfe9;", "()Lfe9;", "(Lfe9;)V", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d implements c {
    private float d;
    private float e;
    private float f;
    private float i;
    private float j;
    private float k;
    private boolean o;
    private float a = 1.0f;
    private float b = 1.0f;
    private float c = 1.0f;
    private long g = hi4.a();
    private long h = hi4.a();
    private float l = 8.0f;
    private long m = f.a.a();
    private tga n = s99.a();
    private int p = a.a.a();
    private long q = cna.b.a();
    private a03 r = c03.b(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.c
    public float A() {
        return this.k;
    }

    public void B(long j) {
        this.q = j;
    }

    @Override // androidx.compose.ui.graphics.c
    public void H(long j) {
        this.g = j;
    }

    @Override // androidx.compose.ui.graphics.c
    public float K() {
        return this.l;
    }

    @Override // androidx.compose.ui.graphics.c
    public void M(boolean z) {
        this.o = z;
    }

    @Override // androidx.compose.ui.graphics.c
    public long N() {
        return this.m;
    }

    @Override // defpackage.a03
    public /* synthetic */ int O(float f) {
        return zz2.a(this, f);
    }

    @Override // androidx.compose.ui.graphics.c
    public void P(long j) {
        this.m = j;
    }

    @Override // androidx.compose.ui.graphics.c
    public void Q(long j) {
        this.h = j;
    }

    @Override // defpackage.a03
    public /* synthetic */ float S(long j) {
        return zz2.b(this, j);
    }

    @Override // androidx.compose.ui.graphics.c
    public float X() {
        return this.a;
    }

    @Override // androidx.compose.ui.graphics.c
    public void Z(float f) {
        this.f = f;
    }

    public float b() {
        return this.c;
    }

    @Override // androidx.compose.ui.graphics.c
    public void c(float f) {
        this.c = f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        return this.o;
    }

    @Override // androidx.compose.ui.graphics.c
    public void f(float f) {
        this.e = f;
    }

    @Override // defpackage.a03
    public float getDensity() {
        return this.r.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void h(int i) {
        this.p = i;
    }

    @Override // androidx.compose.ui.graphics.c
    public void i(float f) {
        this.a = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(float f) {
        this.l = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void k(float f) {
        this.i = f;
    }

    @Override // defpackage.a03
    public float k0() {
        return this.r.k0();
    }

    @Override // androidx.compose.ui.graphics.c
    public void l(float f) {
        this.j = f;
    }

    @Override // androidx.compose.ui.graphics.c
    public float l0() {
        return this.e;
    }

    public int m() {
        return this.p;
    }

    @Override // androidx.compose.ui.graphics.c
    public void m0(tga tgaVar) {
        z65.h(tgaVar, "<set-?>");
        this.n = tgaVar;
    }

    @Override // androidx.compose.ui.graphics.c
    public void n(float f) {
        this.k = f;
    }

    @Override // defpackage.a03
    public /* synthetic */ float n0(float f) {
        return zz2.c(this, f);
    }

    @Override // androidx.compose.ui.graphics.c
    public void o(float f) {
        this.b = f;
    }

    public fe9 p() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.c
    public float p0() {
        return this.d;
    }

    public float q() {
        return this.f;
    }

    public tga r() {
        return this.n;
    }

    @Override // androidx.compose.ui.graphics.c
    public float r0() {
        return this.i;
    }

    @Override // androidx.compose.ui.graphics.c
    public void t(float f) {
        this.d = f;
    }

    public long u() {
        return this.h;
    }

    public final void v() {
        i(1.0f);
        o(1.0f);
        c(1.0f);
        t(0.0f);
        f(0.0f);
        Z(0.0f);
        H(hi4.a());
        Q(hi4.a());
        k(0.0f);
        l(0.0f);
        n(0.0f);
        j(8.0f);
        P(f.a.a());
        m0(s99.a());
        M(false);
        g(null);
        h(a.a.a());
        B(cna.b.a());
    }

    @Override // androidx.compose.ui.graphics.c
    public float w() {
        return this.j;
    }

    @Override // defpackage.a03
    public /* synthetic */ long w0(long j) {
        return zz2.d(this, j);
    }

    public final void x(a03 a03Var) {
        z65.h(a03Var, "<set-?>");
        this.r = a03Var;
    }

    @Override // defpackage.a03
    public /* synthetic */ long z(float f) {
        return zz2.e(this, f);
    }

    @Override // androidx.compose.ui.graphics.c
    public float z0() {
        return this.b;
    }

    @Override // androidx.compose.ui.graphics.c
    public void g(fe9 fe9Var) {
    }
}
