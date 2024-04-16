package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\bU\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002JK\u0010\u0013\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!JO\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#Jg\u0010,\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-JW\u00100\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101JW\u00102\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103JG\u00106\u001a\u00020\u001f2\u0006\u00105\u001a\u0002042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107JG\u00108\u001a\u00020\u001f2\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109R \u0010A\u001a\u00020:8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R\u001a\u0010F\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006V"}, d2 = {"Lsn0;", "Ly73;", "Lpp7;", "r", "u", "Lz73;", "drawStyle", "v", "Lmg0;", "brush", "style", "", "alpha", "Lwc1;", "colorFilter", "Lpc0;", "blendMode", "Lyu3;", "filterQuality", e.a, "(Lmg0;Lz73;FLwc1;II)Lpp7;", "Luc1;", RemoteMessageConst.Notification.COLOR, "b", "(JLz73;FLwc1;II)Lpp7;", "q", "(JF)J", "Ls67;", "topLeft", "Lcna;", "size", "", "A0", "(Lmg0;JJFLz73;Lwc1;I)V", "t0", "(JJJFLz73;Lwc1;I)V", "Leu4;", ElementGenerator.TYPE_IMAGE, "Ls55;", "srcOffset", "Lw55;", "srcSize", "dstOffset", "dstSize", "c0", "(Leu4;JJJJFLz73;Lwc1;II)V", "Lbx1;", "cornerRadius", "R", "(Lmg0;JJJFLz73;Lwc1;I)V", "q0", "(JJJJLz73;FLwc1;I)V", "Lor7;", "path", "g0", "(Lor7;JFLz73;Lwc1;I)V", "s0", "(Lor7;Lmg0;FLz73;Lwc1;I)V", "Lsn0$a;", "a", "Lsn0$a;", "p", "()Lsn0$a;", "getDrawParams$annotations", "()V", "drawParams", "Ls73;", "Ls73;", "o0", "()Ls73;", "drawContext", c.a, "Lpp7;", "fillPaint", DateTokenConverter.CONVERTER_KEY, "strokePaint", "Lqm5;", "getLayoutDirection", "()Lqm5;", "layoutDirection", "getDensity", "()F", "density", "k0", "fontScale", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sn0  reason: default package */
/* loaded from: classes.dex */
public final class sn0 implements y73 {
    private final a a = new a(null, null, null, 0, 15, null);
    private final s73 b = new b();
    private pp7 c;
    private pp7 d;

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010(\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\t\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010(\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010'\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lsn0$a;", "", "La03;", "a", "Lqm5;", "b", "Lqn0;", c.a, "Lcna;", DateTokenConverter.CONVERTER_KEY, "()J", "", "toString", "", "hashCode", "other", "", "equals", "La03;", "f", "()La03;", "j", "(La03;)V", "density", "Lqm5;", "g", "()Lqm5;", "k", "(Lqm5;)V", "layoutDirection", "Lqn0;", e.a, "()Lqn0;", "i", "(Lqn0;)V", "canvas", "J", Image.TYPE_HIGH, "l", "(J)V", "size", "<init>", "(La03;Lqm5;Lqn0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sn0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a03 a;
        private qm5 b;
        private qn0 c;
        private long d;

        public /* synthetic */ a(a03 a03Var, qm5 qm5Var, qn0 qn0Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(a03Var, qm5Var, qn0Var, j);
        }

        public final a03 a() {
            return this.a;
        }

        public final qm5 b() {
            return this.b;
        }

        public final qn0 c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final qn0 e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && this.b == aVar.b && z65.c(this.c, aVar.c) && cna.f(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public final a03 f() {
            return this.a;
        }

        public final qm5 g() {
            return this.b;
        }

        public final long h() {
            return this.d;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + cna.j(this.d);
        }

        public final void i(qn0 qn0Var) {
            z65.h(qn0Var, "<set-?>");
            this.c = qn0Var;
        }

        public final void j(a03 a03Var) {
            z65.h(a03Var, "<set-?>");
            this.a = a03Var;
        }

        public final void k(qm5 qm5Var) {
            z65.h(qm5Var, "<set-?>");
            this.b = qm5Var;
        }

        public final void l(long j) {
            this.d = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) cna.l(this.d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private a(a03 a03Var, qm5 qm5Var, qn0 qn0Var, long j) {
            z65.h(a03Var, "density");
            z65.h(qm5Var, "layoutDirection");
            z65.h(qn0Var, "canvas");
            this.a = a03Var;
            this.b = qm5Var;
            this.c = qn0Var;
            this.d = j;
        }

        public /* synthetic */ a(a03 a03Var, qm5 qm5Var, qn0 qn0Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? tn0.a : a03Var, (i & 2) != 0 ? qm5.Ltr : qm5Var, (i & 4) != 0 ? new gg3() : qn0Var, (i & 8) != 0 ? cna.b.b() : j, null);
        }
    }

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR-\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"sn0$b", "Ls73;", "Lc83;", "a", "Lc83;", "t", "()Lc83;", "transform", "Lqn0;", "u", "()Lqn0;", "canvas", "Lcna;", "value", Image.TYPE_SMALL, "()J", "v", "(J)V", "size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sn0$b */
    /* loaded from: classes.dex */
    public static final class b implements s73 {
        private final c83 a;

        b() {
            c83 c;
            c = tn0.c(this);
            this.a = c;
        }

        @Override // defpackage.s73
        public long s() {
            return sn0.this.p().h();
        }

        @Override // defpackage.s73
        public c83 t() {
            return this.a;
        }

        @Override // defpackage.s73
        public qn0 u() {
            return sn0.this.p().e();
        }

        @Override // defpackage.s73
        public void v(long j) {
            sn0.this.p().l(j);
        }
    }

    private final pp7 b(long j, z73 z73Var, float f, wc1 wc1Var, int i, int i2) {
        pp7 v = v(z73Var);
        long q = q(j, f);
        if (!uc1.l(v.b(), q)) {
            v.k(q);
        }
        if (v.r() != null) {
            v.q(null);
        }
        if (!z65.c(v.f(), wc1Var)) {
            v.t(wc1Var);
        }
        if (!pc0.G(v.m(), i)) {
            v.e(i);
        }
        if (!yu3.d(v.u(), i2)) {
            v.h(i2);
        }
        return v;
    }

    static /* synthetic */ pp7 d(sn0 sn0Var, long j, z73 z73Var, float f, wc1 wc1Var, int i, int i2, int i3, Object obj) {
        int i4;
        if ((i3 & 32) != 0) {
            i4 = y73.L.b();
        } else {
            i4 = i2;
        }
        return sn0Var.b(j, z73Var, f, wc1Var, i, i4);
    }

    private final pp7 e(mg0 mg0Var, z73 z73Var, float f, wc1 wc1Var, int i, int i2) {
        pp7 v = v(z73Var);
        if (mg0Var != null) {
            mg0Var.a(s(), v, f);
        } else if (v.a() != f) {
            v.c(f);
        }
        if (!z65.c(v.f(), wc1Var)) {
            v.t(wc1Var);
        }
        if (!pc0.G(v.m(), i)) {
            v.e(i);
        }
        if (!yu3.d(v.u(), i2)) {
            v.h(i2);
        }
        return v;
    }

    static /* synthetic */ pp7 m(sn0 sn0Var, mg0 mg0Var, z73 z73Var, float f, wc1 wc1Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = y73.L.b();
        }
        return sn0Var.e(mg0Var, z73Var, f, wc1Var, i, i2);
    }

    private final long q(long j, float f) {
        if (f != 1.0f) {
            return uc1.j(j, uc1.m(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j;
    }

    private final pp7 r() {
        pp7 pp7Var = this.c;
        if (pp7Var == null) {
            pp7 a2 = xh.a();
            a2.v(up7.a.a());
            this.c = a2;
            return a2;
        }
        return pp7Var;
    }

    private final pp7 u() {
        pp7 pp7Var = this.d;
        if (pp7Var == null) {
            pp7 a2 = xh.a();
            a2.v(up7.a.b());
            this.d = a2;
            return a2;
        }
        return pp7Var;
    }

    private final pp7 v(z73 z73Var) {
        if (z65.c(z73Var, uu3.a)) {
            return r();
        }
        if (z73Var instanceof p0b) {
            pp7 u = u();
            p0b p0bVar = (p0b) z73Var;
            if (u.x() != p0bVar.e()) {
                u.w(p0bVar.e());
            }
            if (!q0b.g(u.i(), p0bVar.a())) {
                u.d(p0bVar.a());
            }
            if (u.o() != p0bVar.c()) {
                u.s(p0bVar.c());
            }
            if (!s0b.g(u.n(), p0bVar.b())) {
                u.j(p0bVar.b());
            }
            if (!z65.c(u.l(), p0bVar.d())) {
                u.g(p0bVar.d());
            }
            return u;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.y73
    public void A0(mg0 mg0Var, long j, long j2, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        this.a.e().p(s67.l(j), s67.m(j), s67.l(j) + cna.i(j2), s67.m(j) + cna.g(j2), m(this, mg0Var, z73Var, f, wc1Var, i, 0, 32, null));
    }

    @Override // defpackage.a03
    public /* synthetic */ int O(float f) {
        return zz2.a(this, f);
    }

    @Override // defpackage.y73
    public void R(mg0 mg0Var, long j, long j2, long j3, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        this.a.e().j(s67.l(j), s67.m(j), s67.l(j) + cna.i(j2), s67.m(j) + cna.g(j2), bx1.d(j3), bx1.e(j3), m(this, mg0Var, z73Var, f, wc1Var, i, 0, 32, null));
    }

    @Override // defpackage.a03
    public /* synthetic */ float S(long j) {
        return zz2.b(this, j);
    }

    @Override // defpackage.y73
    public void c0(eu4 eu4Var, long j, long j2, long j3, long j4, float f, z73 z73Var, wc1 wc1Var, int i, int i2) {
        z65.h(eu4Var, ElementGenerator.TYPE_IMAGE);
        z65.h(z73Var, "style");
        this.a.e().e(eu4Var, j, j2, j3, j4, e(null, z73Var, f, wc1Var, i, i2));
    }

    @Override // defpackage.y73
    public void g0(or7 or7Var, long j, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(or7Var, "path");
        z65.h(z73Var, "style");
        this.a.e().k(or7Var, d(this, j, z73Var, f, wc1Var, i, 0, 32, null));
    }

    @Override // defpackage.a03
    public float getDensity() {
        return this.a.f().getDensity();
    }

    @Override // defpackage.y73
    public qm5 getLayoutDirection() {
        return this.a.g();
    }

    @Override // defpackage.a03
    public float k0() {
        return this.a.f().k0();
    }

    @Override // defpackage.a03
    public /* synthetic */ float n0(float f) {
        return zz2.c(this, f);
    }

    @Override // defpackage.y73
    public s73 o0() {
        return this.b;
    }

    public final a p() {
        return this.a;
    }

    @Override // defpackage.y73
    public void q0(long j, long j2, long j3, long j4, z73 z73Var, float f, wc1 wc1Var, int i) {
        z65.h(z73Var, "style");
        this.a.e().j(s67.l(j2), s67.m(j2), s67.l(j2) + cna.i(j3), s67.m(j2) + cna.g(j3), bx1.d(j4), bx1.e(j4), d(this, j, z73Var, f, wc1Var, i, 0, 32, null));
    }

    @Override // defpackage.y73
    public /* synthetic */ long s() {
        return x73.b(this);
    }

    @Override // defpackage.y73
    public void s0(or7 or7Var, mg0 mg0Var, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(or7Var, "path");
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        this.a.e().k(or7Var, m(this, mg0Var, z73Var, f, wc1Var, i, 0, 32, null));
    }

    @Override // defpackage.y73
    public void t0(long j, long j2, long j3, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(z73Var, "style");
        this.a.e().p(s67.l(j2), s67.m(j2), s67.l(j2) + cna.i(j3), s67.m(j2) + cna.g(j3), d(this, j, z73Var, f, wc1Var, i, 0, 32, null));
    }

    @Override // defpackage.y73
    public /* synthetic */ long u0() {
        return x73.a(this);
    }

    @Override // defpackage.a03
    public /* synthetic */ long w0(long j) {
        return zz2.d(this, j);
    }

    @Override // defpackage.a03
    public /* synthetic */ long z(float f) {
        return zz2.e(this, f);
    }
}
