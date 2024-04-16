package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KB\t\b\u0016¢\u0006\u0004\bJ\u0010LJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001f\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u0010\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u001f\"\u0004\b\u000e\u0010 R-\u0010#\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\t\u0010$\"\u0004\b%\u0010&R-\u0010*\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b\u0017\u0010)R-\u0010.\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020+8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010)R$\u00101\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010 R-\u00104\u001a\u0002022\u0006\u0010\u0016\u001a\u0002028V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b3\u0010(\"\u0004\b\u0012\u0010)R-\u00108\u001a\u0002052\u0006\u0010\u0016\u001a\u0002058V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b6\u0010(\"\u0004\b7\u0010)R$\u0010;\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010 R-\u0010?\u001a\u00020<2\u0006\u0010\u0016\u001a\u00020<8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b=\u0010(\"\u0004\b>\u0010)R4\u0010D\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u0016\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010I\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Lwh;", "Lpp7;", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "p", "a", "Landroid/graphics/Paint;", "internalPaint", "Lpc0;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", c.a, "Landroid/graphics/Shader;", "internalShader", "Lwc1;", DateTokenConverter.CONVERTER_KEY, "Lwc1;", "internalColorFilter", "Lrr7;", "value", e.a, "Lrr7;", "l", "()Lrr7;", "g", "(Lrr7;)V", "pathEffect", "", "()F", "(F)V", "alpha", "Luc1;", RemoteMessageConst.Notification.COLOR, "()J", "k", "(J)V", Image.TYPE_MEDIUM, "()I", "(I)V", "blendMode", "Lup7;", "getStyle-TiuSbCo", "v", "style", "x", "w", "strokeWidth", "Lq0b;", "i", "strokeCap", "Ls0b;", "n", "j", "strokeJoin", "o", Image.TYPE_SMALL, "strokeMiterLimit", "Lyu3;", "u", Image.TYPE_HIGH, "filterQuality", "r", "()Landroid/graphics/Shader;", "q", "(Landroid/graphics/Shader;)V", "shader", "f", "()Lwc1;", "t", "(Lwc1;)V", "colorFilter", "<init>", "(Landroid/graphics/Paint;)V", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wh  reason: default package */
/* loaded from: classes.dex */
public final class wh implements pp7 {
    private Paint a;
    private int b;
    private Shader c;
    private wc1 d;
    private rr7 e;

    public wh(Paint paint) {
        z65.h(paint, "internalPaint");
        this.a = paint;
        this.b = pc0.b.B();
    }

    @Override // defpackage.pp7
    public float a() {
        return xh.c(this.a);
    }

    @Override // defpackage.pp7
    public long b() {
        return xh.d(this.a);
    }

    @Override // defpackage.pp7
    public void c(float f) {
        xh.k(this.a, f);
    }

    @Override // defpackage.pp7
    public void d(int i) {
        xh.r(this.a, i);
    }

    @Override // defpackage.pp7
    public void e(int i) {
        if (!pc0.G(this.b, i)) {
            this.b = i;
            xh.l(this.a, i);
        }
    }

    @Override // defpackage.pp7
    public wc1 f() {
        return this.d;
    }

    @Override // defpackage.pp7
    public void g(rr7 rr7Var) {
        xh.p(this.a, rr7Var);
        this.e = rr7Var;
    }

    @Override // defpackage.pp7
    public void h(int i) {
        xh.o(this.a, i);
    }

    @Override // defpackage.pp7
    public int i() {
        return xh.f(this.a);
    }

    @Override // defpackage.pp7
    public void j(int i) {
        xh.s(this.a, i);
    }

    @Override // defpackage.pp7
    public void k(long j) {
        xh.m(this.a, j);
    }

    @Override // defpackage.pp7
    public rr7 l() {
        return this.e;
    }

    @Override // defpackage.pp7
    public int m() {
        return this.b;
    }

    @Override // defpackage.pp7
    public int n() {
        return xh.g(this.a);
    }

    @Override // defpackage.pp7
    public float o() {
        return xh.h(this.a);
    }

    @Override // defpackage.pp7
    public Paint p() {
        return this.a;
    }

    @Override // defpackage.pp7
    public void q(Shader shader) {
        this.c = shader;
        xh.q(this.a, shader);
    }

    @Override // defpackage.pp7
    public Shader r() {
        return this.c;
    }

    @Override // defpackage.pp7
    public void s(float f) {
        xh.t(this.a, f);
    }

    @Override // defpackage.pp7
    public void t(wc1 wc1Var) {
        this.d = wc1Var;
        xh.n(this.a, wc1Var);
    }

    @Override // defpackage.pp7
    public int u() {
        return xh.e(this.a);
    }

    @Override // defpackage.pp7
    public void v(int i) {
        xh.v(this.a, i);
    }

    @Override // defpackage.pp7
    public void w(float f) {
        xh.u(this.a, f);
    }

    @Override // defpackage.pp7
    public float x() {
        return xh.i(this.a);
    }

    public wh() {
        this(xh.j());
    }
}
