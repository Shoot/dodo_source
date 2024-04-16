package defpackage;

import android.text.TextPaint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.kab;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: AndroidTextPaint.android.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R4\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\u001a\u0004\b\u0019\u0010(\"\u0004\b\u001c\u0010)*\u0004\b*\u0010+\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00062"}, d2 = {"Lwi;", "Landroid/text/TextPaint;", "Lkab;", "textDecoration", "", "g", "Loga;", "shadow", "f", "Luc1;", RemoteMessageConst.Notification.COLOR, DateTokenConverter.CONVERTER_KEY, "(J)V", "Lmg0;", "brush", "Lcna;", "size", "", "alpha", c.a, "(Lmg0;JF)V", "Lz73;", "drawStyle", e.a, "Lpp7;", "a", "Lpp7;", "composePaint", "b", "Lkab;", "Loga;", "getShadow$ui_text_release", "()Loga;", "setShadow$ui_text_release", "(Loga;)V", "getShadow$ui_text_release$annotations", "()V", "Lz73;", "Lpc0;", "<set-?>", "()I", "(I)V", "getBlendMode-0nO6VwU$delegate", "(Lwi;)Ljava/lang/Object;", "blendMode", "", "flags", "density", "<init>", "(IF)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wi  reason: default package */
/* loaded from: classes.dex */
public final class wi extends TextPaint {
    private final pp7 a;
    private kab b;
    private oga c;
    private z73 d;

    public wi(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.a = xh.b(this);
        this.b = kab.b.b();
        this.c = oga.d.a();
    }

    public final int a() {
        return this.a.m();
    }

    public final void b(int i) {
        this.a.e(i);
    }

    public final void c(mg0 mg0Var, long j, float f) {
        float k;
        if (((mg0Var instanceof jqa) && ((jqa) mg0Var).b() != uc1.b.e()) || ((mg0Var instanceof mga) && j != cna.b.a())) {
            pp7 pp7Var = this.a;
            if (!Float.isNaN(f)) {
                k = i.k(f, 0.0f, 1.0f);
            } else {
                k = this.a.a();
            }
            mg0Var.a(j, pp7Var, k);
        } else if (mg0Var == null) {
            this.a.q(null);
        }
    }

    public final void d(long j) {
        if (j != uc1.b.e()) {
            this.a.k(j);
            this.a.q(null);
        }
    }

    public final void e(z73 z73Var) {
        if (z73Var != null && !z65.c(this.d, z73Var)) {
            this.d = z73Var;
            if (z65.c(z73Var, uu3.a)) {
                this.a.v(up7.a.a());
            } else if (z73Var instanceof p0b) {
                this.a.v(up7.a.b());
                p0b p0bVar = (p0b) z73Var;
                this.a.w(p0bVar.e());
                this.a.s(p0bVar.c());
                this.a.j(p0bVar.b());
                this.a.d(p0bVar.a());
                this.a.g(p0bVar.d());
            }
        }
    }

    public final void f(oga ogaVar) {
        if (ogaVar != null && !z65.c(this.c, ogaVar)) {
            this.c = ogaVar;
            if (z65.c(ogaVar, oga.d.a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(hcb.b(this.c.b()), s67.l(this.c.d()), s67.m(this.c.d()), yc1.f(this.c.c()));
            }
        }
    }

    public final void g(kab kabVar) {
        if (kabVar != null && !z65.c(this.b, kabVar)) {
            this.b = kabVar;
            kab.a aVar = kab.b;
            setUnderlineText(kabVar.d(aVar.c()));
            setStrikeThruText(this.b.d(aVar.a()));
        }
    }
}
