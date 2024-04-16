package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.vp5;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010C\u001a\u00020?\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010K\u001a\u00020%\u0012\u0006\u0010P\u001a\u00020Lø\u0001\u0001¢\u0006\u0004\bz\u0010{J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002JJ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000bH\u0016J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0016J\u0018\u0010'\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016JK\u00108\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109JS\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00162\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010C\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b,\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010K\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010P\u001a\u00020L8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010QR \u0010Y\u001a\u00020S8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b'\u0010T\u0012\u0004\bW\u0010X\u001a\u0004\bU\u0010VR\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0014\u0010k\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010gR\u0014\u0010m\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010gR\u0014\u0010n\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010JR\u001a\u0010s\u001a\u00020o8@X\u0081\u0004¢\u0006\f\u0012\u0004\br\u0010X\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010FR\u001a\u0010y\u001a\u00020u8@X\u0081\u0004¢\u0006\f\u0012\u0004\bx\u0010X\u001a\u0004\bv\u0010w\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006|"}, d2 = {"Lyh;", "Lbq7;", "Lybb;", "", "Lnga;", "u", "(Lybb;)[Lnga;", "Lqn0;", "canvas", "", "x", "", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "maxLines", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "q", "", "vertical", "i", "Ls67;", "position", DateTokenConverter.CONVERTER_KEY, "(J)I", "offset", "Lk99;", "n", "lineIndex", "b", "t", "(I)F", e.a, "", "visibleEnd", "f", Image.TYPE_MEDIUM, "usePrimaryDirection", Image.TYPE_SMALL, "Lkj9;", "a", "r", "Luc1;", RemoteMessageConst.Notification.COLOR, "Loga;", "shadow", "Lkab;", "textDecoration", "Lz73;", "drawStyle", "Lpc0;", "blendMode", "l", "(Lqn0;JLoga;Lkab;Lz73;I)V", "Lmg0;", "brush", "alpha", "j", "(Lqn0;Lmg0;FLoga;Lkab;Lz73;I)V", "Lai;", "Lai;", "getParagraphIntrinsics", "()Lai;", "paragraphIntrinsics", "I", "getMaxLines", "()I", c.a, "Z", "getEllipsis", "()Z", "ellipsis", "Lnr1;", "J", "getConstraints-msEJaDk", "()J", "constraints", "Lybb;", "layout", "", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "g", "Ljava/util/List;", "o", "()Ljava/util/List;", "placeholderRects", "Lr6c;", Image.TYPE_HIGH, "Lrn5;", "getWordBoundary", "()Lr6c;", "wordBoundary", "getWidth", "()F", "width", "getHeight", "height", "firstBaseline", "k", "lastBaseline", "didExceedMaxLines", "Ljava/util/Locale;", "v", "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "lineCount", "Lwi;", "w", "()Lwi;", "getTextPaint$ui_text_release$annotations", "textPaint", "<init>", "(Lai;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yh  reason: default package */
/* loaded from: classes.dex */
public final class yh implements bq7 {
    private final ai a;
    private final int b;
    private final boolean c;
    private final long d;
    private final ybb e;
    private final CharSequence f;
    private final List<k99> g;
    private final rn5 h;

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: yh$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kj9.values().length];
            try {
                iArr[kj9.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kj9.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AndroidParagraph.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lr6c;", "a", "()Lr6c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: yh$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<r6c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final r6c invoke() {
            return new r6c(yh.this.v(), yh.this.e.A());
        }
    }

    public /* synthetic */ yh(ai aiVar, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiVar, i, z, j);
    }

    private final ybb q(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return new ybb(this.f, getWidth(), w(), i, truncateAt, this.a.j(), 1.0f, 0.0f, zh.b(this.a.i()), true, i3, i5, i6, i7, i4, i2, null, null, this.a.h(), 196736, null);
    }

    private final nga[] u(ybb ybbVar) {
        if (!(ybbVar.A() instanceof Spanned)) {
            return new nga[0];
        }
        CharSequence A = ybbVar.A();
        z65.f(A, "null cannot be cast to non-null type android.text.Spanned");
        nga[] ngaVarArr = (nga[]) ((Spanned) A).getSpans(0, ybbVar.A().length(), nga.class);
        z65.g(ngaVarArr, "brushSpans");
        if (ngaVarArr.length == 0) {
            return new nga[0];
        }
        return ngaVarArr;
    }

    private final void x(qn0 qn0Var) {
        Canvas c = tf.c(qn0Var);
        if (h()) {
            c.save();
            c.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.e.D(c);
        if (h()) {
            c.restore();
        }
    }

    @Override // defpackage.bq7
    public kj9 a(int i) {
        if (this.e.v(this.e.o(i)) == 1) {
            return kj9.Ltr;
        }
        return kj9.Rtl;
    }

    @Override // defpackage.bq7
    public float b(int i) {
        return this.e.s(i);
    }

    @Override // defpackage.bq7
    public float c() {
        return t(0);
    }

    @Override // defpackage.bq7
    public int d(long j) {
        return this.e.u(this.e.p((int) s67.m(j)), s67.l(j));
    }

    @Override // defpackage.bq7
    public int e(int i) {
        return this.e.r(i);
    }

    @Override // defpackage.bq7
    public int f(int i, boolean z) {
        if (z) {
            return this.e.t(i);
        }
        return this.e.n(i);
    }

    @Override // defpackage.bq7
    public int g() {
        return this.e.k();
    }

    @Override // defpackage.bq7
    public float getHeight() {
        return this.e.d();
    }

    @Override // defpackage.bq7
    public float getWidth() {
        return nr1.n(this.d);
    }

    @Override // defpackage.bq7
    public boolean h() {
        return this.e.b();
    }

    @Override // defpackage.bq7
    public int i(float f) {
        return this.e.p((int) f);
    }

    @Override // defpackage.bq7
    public void j(qn0 qn0Var, mg0 mg0Var, float f, oga ogaVar, kab kabVar, z73 z73Var, int i) {
        z65.h(qn0Var, "canvas");
        z65.h(mg0Var, "brush");
        int a2 = w().a();
        wi w = w();
        w.c(mg0Var, ina.a(getWidth(), getHeight()), f);
        w.f(ogaVar);
        w.g(kabVar);
        w.e(z73Var);
        w.b(i);
        x(qn0Var);
        w().b(a2);
    }

    @Override // defpackage.bq7
    public float k() {
        return t(g() - 1);
    }

    @Override // defpackage.bq7
    public void l(qn0 qn0Var, long j, oga ogaVar, kab kabVar, z73 z73Var, int i) {
        z65.h(qn0Var, "canvas");
        int a2 = w().a();
        wi w = w();
        w.d(j);
        w.f(ogaVar);
        w.g(kabVar);
        w.e(z73Var);
        w.b(i);
        x(qn0Var);
        w().b(a2);
    }

    @Override // defpackage.bq7
    public int m(int i) {
        return this.e.o(i);
    }

    @Override // defpackage.bq7
    public k99 n(int i) {
        RectF a2 = this.e.a(i);
        return new k99(a2.left, a2.top, a2.right, a2.bottom);
    }

    @Override // defpackage.bq7
    public List<k99> o() {
        return this.g;
    }

    public kj9 r(int i) {
        if (this.e.C(i)) {
            return kj9.Rtl;
        }
        return kj9.Ltr;
    }

    public float s(int i, boolean z) {
        if (z) {
            return ybb.x(this.e, i, false, 2, null);
        }
        return ybb.z(this.e, i, false, 2, null);
    }

    public final float t(int i) {
        return this.e.i(i);
    }

    public final Locale v() {
        Locale textLocale = this.a.k().getTextLocale();
        z65.g(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    public final wi w() {
        return this.a.k();
    }

    private yh(ai aiVar, int i, boolean z, long j) {
        CharSequence f;
        List<k99> list;
        k99 k99Var;
        float s;
        float i2;
        int b2;
        float s2;
        float f2;
        float i3;
        rn5 a2;
        int e;
        z65.h(aiVar, "paragraphIntrinsics");
        this.a = aiVar;
        this.b = i;
        this.c = z;
        this.d = j;
        if (nr1.o(j) != 0 || nr1.p(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i >= 1) {
            rcb i4 = aiVar.i();
            if (di.c(i4, z)) {
                f = di.a(aiVar.f());
            } else {
                f = aiVar.f();
            }
            this.f = f;
            int d = di.d(i4.z());
            i9b z2 = i4.z();
            int i5 = z2 == null ? 0 : i9b.j(z2.m(), i9b.b.c()) ? 1 : 0;
            int f3 = di.f(i4.v().c());
            vp5 r = i4.r();
            int e2 = di.e(r != null ? vp5.b.d(vp5.f(r.k())) : null);
            vp5 r2 = i4.r();
            int g = di.g(r2 != null ? vp5.c.e(vp5.g(r2.k())) : null);
            vp5 r3 = i4.r();
            int h = di.h(r3 != null ? vp5.d.c(vp5.h(r3.k())) : null);
            TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
            ybb q = q(d, i5, truncateAt, i, f3, e2, g, h);
            if (!z || q.d() <= nr1.m(j) || i <= 1) {
                this.e = q;
            } else {
                int b3 = di.b(q, nr1.m(j));
                if (b3 >= 0 && b3 != i) {
                    e = i.e(b3, 1);
                    q = q(d, i5, truncateAt, e, f3, e2, g, h);
                }
                this.e = q;
            }
            w().c(i4.g(), ina.a(getWidth(), getHeight()), i4.d());
            for (nga ngaVar : u(this.e)) {
                ngaVar.a(ina.a(getWidth(), getHeight()));
            }
            CharSequence charSequence = this.f;
            if (!(charSequence instanceof Spanned)) {
                list = kc1.l();
            } else {
                Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), mb8.class);
                z65.g(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    mb8 mb8Var = (mb8) obj;
                    Spanned spanned = (Spanned) charSequence;
                    int spanStart = spanned.getSpanStart(mb8Var);
                    int spanEnd = spanned.getSpanEnd(mb8Var);
                    int o = this.e.o(spanStart);
                    boolean z3 = o >= this.b;
                    boolean z4 = this.e.l(o) > 0 && spanEnd > this.e.m(o);
                    boolean z5 = spanEnd > this.e.n(o);
                    if (z4 || z5 || z3) {
                        k99Var = null;
                    } else {
                        int i6 = a.$EnumSwitchMapping$0[r(spanStart).ordinal()];
                        if (i6 == 1) {
                            s = s(spanStart, true);
                        } else if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            s = s(spanStart, true) - mb8Var.d();
                        }
                        float d2 = mb8Var.d() + s;
                        ybb ybbVar = this.e;
                        switch (mb8Var.c()) {
                            case 0:
                                i2 = ybbVar.i(o);
                                b2 = mb8Var.b();
                                s2 = i2 - b2;
                                break;
                            case 1:
                                s2 = ybbVar.s(o);
                                break;
                            case 2:
                                i2 = ybbVar.j(o);
                                b2 = mb8Var.b();
                                s2 = i2 - b2;
                                break;
                            case 3:
                                s2 = ((ybbVar.s(o) + ybbVar.j(o)) - mb8Var.b()) / 2;
                                break;
                            case 4:
                                f2 = mb8Var.a().ascent;
                                i3 = ybbVar.i(o);
                                s2 = f2 + i3;
                                break;
                            case 5:
                                s2 = (mb8Var.a().descent + ybbVar.i(o)) - mb8Var.b();
                                break;
                            case 6:
                                Paint.FontMetricsInt a3 = mb8Var.a();
                                f2 = ((a3.ascent + a3.descent) - mb8Var.b()) / 2;
                                i3 = ybbVar.i(o);
                                s2 = f2 + i3;
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                        k99Var = new k99(s, s2, d2, mb8Var.b() + s2);
                    }
                    arrayList.add(k99Var);
                }
                list = arrayList;
            }
            this.g = list;
            a2 = yn5.a(fo5.c, new b());
            this.h = a2;
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
}
