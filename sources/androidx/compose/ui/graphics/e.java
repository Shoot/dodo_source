package androidx.compose.ui.graphics;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0096\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010+\u001a\u00020\u000f\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\u0006\u00102\u001a\u00020\u000f\u0012\u0006\u00105\u001a\u00020\u000f\u0012\u0006\u0010=\u001a\u000206\u0012\u0006\u0010E\u001a\u00020>\u0012\u0006\u0010L\u001a\u00020F\u0012\b\u0010a\u001a\u0004\u0018\u00010`\u0012\u0006\u0010P\u001a\u00020M\u0012\u0006\u0010T\u001a\u00020M\u0012\b\b\u0002\u0010[\u001a\u00020Uø\u0001\u0001¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0004\u001a\u00020\u0003J)\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010 \u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\"\u0010$\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\"\u0010(\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\"\u0010+\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\"\u0010/\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0011\u001a\u0004\b1\u0010\u0013\"\u0004\b\u0010\u0010\u0015R\"\u00105\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0011\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010\u0015R+\u0010=\u001a\u0002068\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010'\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010P\u001a\u00020M8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b1\u00108\u001a\u0004\bN\u0010:\"\u0004\bO\u0010<R+\u0010T\u001a\u00020M8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bQ\u00108\u001a\u0004\bR\u0010:\"\u0004\bS\u0010<R+\u0010[\u001a\u00020U8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bV\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010^R$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u0014\u0010h\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010I\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/ui/graphics/e;", "Lzm5;", "Lsm6$c;", "", "o1", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "", "toString", "", "n", "F", "X", "()F", "i", "(F)V", "scaleX", "o", "z0", "scaleY", "g1", com.huawei.hms.opendevice.c.a, "alpha", "q", "p0", "t", "translationX", "r", "l0", "f", "translationY", Image.TYPE_SMALL, "l1", "Z", "shadowElevation", "r0", "k", "rotationX", "u", "w", "l", "rotationY", "v", "A", "rotationZ", "K", "j", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "x", "J", "N", "()J", "P", "(J)V", "transformOrigin", "Ltga;", "y", "Ltga;", "m1", "()Ltga;", "m0", "(Ltga;)V", "shape", "", "z", "i1", "()Z", "M", "(Z)V", "clip", "Luc1;", "h1", "H", "ambientShadowColor", "B", "n1", "Q", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "I", "j1", "()I", Image.TYPE_HIGH, "(I)V", "compositingStrategy", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Lkotlin/jvm/functions/Function1;", "layerBlock", "Lfe9;", "renderEffect", "Lfe9;", "k1", "()Lfe9;", "g", "(Lfe9;)V", "K0", "shouldAutoInvalidate", "<init>", "(FFFFFFFFFFJLtga;ZLfe9;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class e extends sm6.c implements zm5 {
    private long A;
    private long B;
    private int I;
    private Function1<? super c, Unit> X;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private long x;
    private tga y;
    private boolean z;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<c, Unit> {
        a() {
            super(1);
        }

        public final void a(c cVar) {
            z65.h(cVar, "$this$null");
            cVar.i(e.this.X());
            cVar.o(e.this.z0());
            cVar.c(e.this.g1());
            cVar.t(e.this.p0());
            cVar.f(e.this.l0());
            cVar.Z(e.this.l1());
            cVar.k(e.this.r0());
            cVar.l(e.this.w());
            cVar.n(e.this.A());
            cVar.j(e.this.K());
            cVar.P(e.this.N());
            cVar.m0(e.this.m1());
            cVar.M(e.this.i1());
            e.this.k1();
            cVar.g(null);
            cVar.H(e.this.h1());
            cVar.Q(e.this.n1());
            cVar.h(e.this.j1());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(c cVar) {
            a(cVar);
            return Unit.a;
        }
    }

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 a;
        final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(gb8 gb8Var, e eVar) {
            super(1);
            this.a = gb8Var;
            this.b = eVar;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            gb8.a.v(aVar, this.a, 0, 0, 0.0f, this.b.X, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public /* synthetic */ e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, tgaVar, z, fe9Var, j2, j3, i);
    }

    public final float A() {
        return this.v;
    }

    public final void H(long j) {
        this.A = j;
    }

    public final float K() {
        return this.w;
    }

    @Override // defpackage.sm6.c
    public boolean K0() {
        return false;
    }

    public final void M(boolean z) {
        this.z = z;
    }

    public final long N() {
        return this.x;
    }

    public final void P(long j) {
        this.x = j;
    }

    public final void Q(long j) {
        this.B = j;
    }

    public final float X() {
        return this.n;
    }

    public final void Z(float f) {
        this.s = f;
    }

    public final void c(float f) {
        this.p = f;
    }

    public final void f(float f) {
        this.r = f;
    }

    public final float g1() {
        return this.p;
    }

    public final void h(int i) {
        this.I = i;
    }

    public final long h1() {
        return this.A;
    }

    public final void i(float f) {
        this.n = f;
    }

    public final boolean i1() {
        return this.z;
    }

    public final void j(float f) {
        this.w = f;
    }

    public final int j1() {
        return this.I;
    }

    public final void k(float f) {
        this.t = f;
    }

    public final fe9 k1() {
        return null;
    }

    public final void l(float f) {
        this.u = f;
    }

    public final float l0() {
        return this.r;
    }

    public final float l1() {
        return this.s;
    }

    public final void m0(tga tgaVar) {
        z65.h(tgaVar, "<set-?>");
        this.y = tgaVar;
    }

    public final tga m1() {
        return this.y;
    }

    public final void n(float f) {
        this.v = f;
    }

    public final long n1() {
        return this.B;
    }

    public final void o(float f) {
        this.o = f;
    }

    public final void o1() {
        oz6 A1 = au2.h(this, qz6.a(2)).A1();
        if (A1 != null) {
            A1.k2(this.X, true);
        }
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        gb8 E = mb6Var.E(j);
        return ub6.b(vb6Var, E.y0(), E.e0(), null, new b(E, this), 4, null);
    }

    public final float p0() {
        return this.q;
    }

    public final float r0() {
        return this.t;
    }

    public final void t(float f) {
        this.q = f;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.n + ", scaleY=" + this.o + ", alpha = " + this.p + ", translationX=" + this.q + ", translationY=" + this.r + ", shadowElevation=" + this.s + ", rotationX=" + this.t + ", rotationY=" + this.u + ", rotationZ=" + this.v + ", cameraDistance=" + this.w + ", transformOrigin=" + ((Object) f.g(this.x)) + ", shape=" + this.y + ", clip=" + this.z + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) uc1.s(this.A)) + ", spotShadowColor=" + ((Object) uc1.s(this.B)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.a.g(this.I)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final float w() {
        return this.u;
    }

    public final float z0() {
        return this.o;
    }

    private e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, tga tgaVar, boolean z, fe9 fe9Var, long j2, long j3, int i) {
        z65.h(tgaVar, "shape");
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = f5;
        this.s = f6;
        this.t = f7;
        this.u = f8;
        this.v = f9;
        this.w = f10;
        this.x = j;
        this.y = tgaVar;
        this.z = z;
        this.A = j2;
        this.B = j3;
        this.I = i;
        this.X = new a();
    }

    public final void g(fe9 fe9Var) {
    }
}
