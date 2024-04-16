package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kab;
import defpackage.ml;
import defpackage.ycb;
import defpackage.yp5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a9\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a[\u0010&\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\r\u001a\u00020\f2&\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0001\u001a\"\u0010(\u001a\u00020\u0006*\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\r\u001a\u00020\fH\u0002\u001aS\u0010)\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2&\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fH\u0002ø\u0001\u0001\u001aF\u0010-\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u001e\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060+H\u0000\u001a'\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a&\u00104\u001a\u00020\u0006*\u00020\u00002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u00107\u001a\u00020\u0006*\u00020\u00002\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a1\u0010:\u001a\u00020\u0006*\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;\u001a&\u0010>\u001a\u00020\u0006*\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010A\u001a\u00020\u0006*\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010D\u001a\u00020\u0006*\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a9\u0010F\u001a\u00020\u0006*\u00020\u00002\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010G\u001a&\u0010J\u001a\u00020\u0006*\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010;\u001a3\u0010N\u001a\u00020\u0006*\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a.\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010R\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010U\u001a\u00020T*\u00020\u0019H\u0002\u001a\u0016\u0010W\u001a\u00020\u001d*\u0004\u0018\u00010\u001d2\u0006\u0010V\u001a\u00020\u001dH\u0002\"\u0018\u0010Z\u001a\u00020T*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006["}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "t", "Libb;", "textIndent", "", "contextFontSize", "La03;", "density", "x", "Lwcb;", "lineHeight", "Lyp5;", "lineHeightStyle", "p", "(Landroid/text/Spannable;JFLa03;Lyp5;)V", "q", "(Landroid/text/Spannable;JFLa03;)V", "f", "(JFLa03;)F", "Lrcb;", "contextTextStyle", "", "Lml$a;", "Lvqa;", "spanStyles", "Lkotlin/Function4;", "Lw24;", "Lv34;", "Lq34;", "Lr34;", "Landroid/graphics/Typeface;", "resolveTypeface", "v", "spanStyleRange", "u", "l", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "a", "(JLa03;)Landroid/text/style/MetricAffectingSpan;", "Loga;", "shadow", Image.TYPE_SMALL, "Lz73;", "drawStyle", "k", "Luc1;", RemoteMessageConst.Notification.COLOR, "g", "(Landroid/text/Spannable;JII)V", "Lns5;", "localeList", "r", "Lgbb;", "textGeometricTransform", "o", "", "fontFeatureSettings", Image.TYPE_MEDIUM, "fontSize", "n", "(Landroid/text/Spannable;JLa03;II)V", "Lkab;", "textDecoration", "w", "j", "Lv80;", "baselineShift", Image.TYPE_HIGH, "(Landroid/text/Spannable;Lv80;II)V", "Lmg0;", "brush", "alpha", "i", "", DateTokenConverter.CONVERTER_KEY, "spanStyle", e.a, c.a, "(Lvqa;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ara  reason: default package */
/* loaded from: classes.dex */
public final class ara {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpannableExtensions.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvqa;", "spanStyle", "", "start", "end", "", "a", "(Lvqa;II)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ara$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements y84<vqa, Integer, Integer, Unit> {
        final /* synthetic */ Spannable a;
        final /* synthetic */ a94<w24, v34, q34, r34, Typeface> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, a94<? super w24, ? super v34, ? super q34, ? super r34, ? extends Typeface> a94Var) {
            super(3);
            this.a = spannable;
            this.b = a94Var;
        }

        public final void a(vqa vqaVar, int i, int i2) {
            int b;
            int a;
            z65.h(vqaVar, "spanStyle");
            Spannable spannable = this.a;
            a94<w24, v34, q34, r34, Typeface> a94Var = this.b;
            w24 i3 = vqaVar.i();
            v34 n = vqaVar.n();
            if (n == null) {
                n = v34.b.e();
            }
            q34 l = vqaVar.l();
            if (l != null) {
                b = l.i();
            } else {
                b = q34.b.b();
            }
            q34 c = q34.c(b);
            r34 m = vqaVar.m();
            if (m != null) {
                a = m.j();
            } else {
                a = r34.b.a();
            }
            spannable.setSpan(new xob(a94Var.q(i3, n, c, r34.b(a))), i, i2, 33);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(vqa vqaVar, Integer num, Integer num2) {
            a(vqaVar, num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    private static final MetricAffectingSpan a(long j, a03 a03Var) {
        long g = wcb.g(j);
        ycb.a aVar = ycb.b;
        if (ycb.g(g, aVar.b())) {
            return new zo5(a03Var.S(j));
        }
        if (ycb.g(g, aVar.a())) {
            return new yo5(wcb.h(j));
        }
        return null;
    }

    public static final void b(vqa vqaVar, List<ml.a<vqa>> list, y84<? super vqa, ? super Integer, ? super Integer, Unit> y84Var) {
        Object D;
        z65.h(list, "spanStyles");
        z65.h(y84Var, "block");
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                y84Var.invoke(e(vqaVar, list.get(0).e()), Integer.valueOf(list.get(0).f()), Integer.valueOf(list.get(0).d()));
                return;
            }
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ml.a<vqa> aVar = list.get(i3);
            numArr[i3] = Integer.valueOf(aVar.f());
            numArr[i3 + size] = Integer.valueOf(aVar.d());
        }
        xr.x(numArr);
        D = yr.D(numArr);
        int intValue = ((Number) D).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            int intValue2 = numArr[i4].intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                vqa vqaVar2 = vqaVar;
                for (int i5 = 0; i5 < size3; i5++) {
                    ml.a<vqa> aVar2 = list.get(i5);
                    if (aVar2.f() != aVar2.d() && nl.f(intValue, intValue2, aVar2.f(), aVar2.d())) {
                        vqaVar2 = e(vqaVar2, aVar2.e());
                    }
                }
                if (vqaVar2 != null) {
                    y84Var.invoke(vqaVar2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean c(vqa vqaVar) {
        long g = wcb.g(vqaVar.o());
        ycb.a aVar = ycb.b;
        if (!ycb.g(g, aVar.b()) && !ycb.g(wcb.g(vqaVar.o()), aVar.a())) {
            return false;
        }
        return true;
    }

    private static final boolean d(rcb rcbVar) {
        if (!hcb.d(rcbVar.K()) && rcbVar.n() == null) {
            return false;
        }
        return true;
    }

    private static final vqa e(vqa vqaVar, vqa vqaVar2) {
        if (vqaVar == null) {
            return vqaVar2;
        }
        return vqaVar.x(vqaVar2);
    }

    private static final float f(long j, float f, a03 a03Var) {
        long g = wcb.g(j);
        ycb.a aVar = ycb.b;
        if (ycb.g(g, aVar.b())) {
            return a03Var.S(j);
        }
        if (ycb.g(g, aVar.a())) {
            return wcb.h(j) * f;
        }
        return Float.NaN;
    }

    public static final void g(Spannable spannable, long j, int i, int i2) {
        z65.h(spannable, "$this$setBackground");
        if (j != uc1.b.e()) {
            t(spannable, new BackgroundColorSpan(yc1.f(j)), i, i2);
        }
    }

    private static final void h(Spannable spannable, v80 v80Var, int i, int i2) {
        if (v80Var != null) {
            t(spannable, new w80(v80Var.h()), i, i2);
        }
    }

    private static final void i(Spannable spannable, mg0 mg0Var, float f, int i, int i2) {
        if (mg0Var != null) {
            if (mg0Var instanceof jqa) {
                j(spannable, ((jqa) mg0Var).b(), i, i2);
            } else if (mg0Var instanceof mga) {
                t(spannable, new nga((mga) mg0Var, f), i, i2);
            }
        }
    }

    public static final void j(Spannable spannable, long j, int i, int i2) {
        z65.h(spannable, "$this$setColor");
        if (j != uc1.b.e()) {
            t(spannable, new ForegroundColorSpan(yc1.f(j)), i, i2);
        }
    }

    private static final void k(Spannable spannable, z73 z73Var, int i, int i2) {
        if (z73Var != null) {
            t(spannable, new a83(z73Var), i, i2);
        }
    }

    private static final void l(Spannable spannable, rcb rcbVar, List<ml.a<vqa>> list, a94<? super w24, ? super v34, ? super q34, ? super r34, ? extends Typeface> a94Var) {
        vqa vqaVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ml.a<vqa> aVar = list.get(i);
            ml.a<vqa> aVar2 = aVar;
            if (hcb.d(aVar2.e()) || aVar2.e().m() != null) {
                arrayList.add(aVar);
            }
        }
        if (d(rcbVar)) {
            vqaVar = new vqa(0L, 0L, rcbVar.o(), rcbVar.m(), rcbVar.n(), rcbVar.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null);
        } else {
            vqaVar = null;
        }
        b(vqaVar, arrayList, new a(spannable, a94Var));
    }

    private static final void m(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            t(spannable, new d34(str), i, i2);
        }
    }

    public static final void n(Spannable spannable, long j, a03 a03Var, int i, int i2) {
        int c;
        z65.h(spannable, "$this$setFontSize");
        z65.h(a03Var, "density");
        long g = wcb.g(j);
        ycb.a aVar = ycb.b;
        if (ycb.g(g, aVar.b())) {
            c = la6.c(a03Var.S(j));
            t(spannable, new AbsoluteSizeSpan(c, false), i, i2);
        } else if (ycb.g(g, aVar.a())) {
            t(spannable, new RelativeSizeSpan(wcb.h(j)), i, i2);
        }
    }

    private static final void o(Spannable spannable, gbb gbbVar, int i, int i2) {
        if (gbbVar != null) {
            t(spannable, new ScaleXSpan(gbbVar.b()), i, i2);
            t(spannable, new qna(gbbVar.c()), i, i2);
        }
    }

    public static final void p(Spannable spannable, long j, float f, a03 a03Var, yp5 yp5Var) {
        int length;
        char X0;
        z65.h(spannable, "$this$setLineHeight");
        z65.h(a03Var, "density");
        z65.h(yp5Var, "lineHeightStyle");
        float f2 = f(j, f, a03Var);
        if (!Float.isNaN(f2)) {
            if (spannable.length() != 0) {
                X0 = o0b.X0(spannable);
                if (X0 != '\n') {
                    length = spannable.length();
                    t(spannable, new zp5(f2, 0, length, yp5.c.e(yp5Var.c()), yp5.c.f(yp5Var.c()), yp5Var.b()), 0, spannable.length());
                }
            }
            length = spannable.length() + 1;
            t(spannable, new zp5(f2, 0, length, yp5.c.e(yp5Var.c()), yp5.c.f(yp5Var.c()), yp5Var.b()), 0, spannable.length());
        }
    }

    public static final void q(Spannable spannable, long j, float f, a03 a03Var) {
        z65.h(spannable, "$this$setLineHeight");
        z65.h(a03Var, "density");
        float f2 = f(j, f, a03Var);
        if (!Float.isNaN(f2)) {
            t(spannable, new xp5(f2), 0, spannable.length());
        }
    }

    public static final void r(Spannable spannable, ns5 ns5Var, int i, int i2) {
        is5 g;
        Object localeSpan;
        z65.h(spannable, "<this>");
        if (ns5Var != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = ts5.a.a(ns5Var);
            } else {
                if (ns5Var.isEmpty()) {
                    g = is5.b.a();
                } else {
                    g = ns5Var.g(0);
                }
                localeSpan = new LocaleSpan(ms5.a(g));
            }
            t(spannable, localeSpan, i, i2);
        }
    }

    private static final void s(Spannable spannable, oga ogaVar, int i, int i2) {
        if (ogaVar != null) {
            t(spannable, new qga(yc1.f(ogaVar.c()), s67.l(ogaVar.d()), s67.m(ogaVar.d()), hcb.b(ogaVar.b())), i, i2);
        }
    }

    public static final void t(Spannable spannable, Object obj, int i, int i2) {
        z65.h(spannable, "<this>");
        z65.h(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void u(Spannable spannable, ml.a<vqa> aVar, a03 a03Var) {
        int f = aVar.f();
        int d = aVar.d();
        vqa e = aVar.e();
        h(spannable, e.e(), f, d);
        j(spannable, e.g(), f, d);
        i(spannable, e.f(), e.c(), f, d);
        w(spannable, e.s(), f, d);
        n(spannable, e.k(), a03Var, f, d);
        m(spannable, e.j(), f, d);
        o(spannable, e.u(), f, d);
        r(spannable, e.p(), f, d);
        g(spannable, e.d(), f, d);
        s(spannable, e.r(), f, d);
        k(spannable, e.h(), f, d);
    }

    public static final void v(Spannable spannable, rcb rcbVar, List<ml.a<vqa>> list, a03 a03Var, a94<? super w24, ? super v34, ? super q34, ? super r34, ? extends Typeface> a94Var) {
        MetricAffectingSpan a2;
        z65.h(spannable, "<this>");
        z65.h(rcbVar, "contextTextStyle");
        z65.h(list, "spanStyles");
        z65.h(a03Var, "density");
        z65.h(a94Var, "resolveTypeface");
        l(spannable, rcbVar, list, a94Var);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ml.a<vqa> aVar = list.get(i);
            int f = aVar.f();
            int d = aVar.d();
            if (f >= 0 && f < spannable.length() && d > f && d <= spannable.length()) {
                u(spannable, aVar, a03Var);
                if (c(aVar.e())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ml.a<vqa> aVar2 = list.get(i2);
                int f2 = aVar2.f();
                int d2 = aVar2.d();
                vqa e = aVar2.e();
                if (f2 >= 0 && f2 < spannable.length() && d2 > f2 && d2 <= spannable.length() && (a2 = a(e.o(), a03Var)) != null) {
                    t(spannable, a2, f2, d2);
                }
            }
        }
    }

    public static final void w(Spannable spannable, kab kabVar, int i, int i2) {
        z65.h(spannable, "<this>");
        if (kabVar != null) {
            kab.a aVar = kab.b;
            t(spannable, new lab(kabVar.d(aVar.c()), kabVar.d(aVar.a())), i, i2);
        }
    }

    public static final void x(Spannable spannable, ibb ibbVar, float f, a03 a03Var) {
        float f2;
        z65.h(spannable, "<this>");
        z65.h(a03Var, "density");
        if (ibbVar != null) {
            if ((!wcb.e(ibbVar.b(), xcb.e(0)) || !wcb.e(ibbVar.c(), xcb.e(0))) && !xcb.f(ibbVar.b()) && !xcb.f(ibbVar.c())) {
                long g = wcb.g(ibbVar.b());
                ycb.a aVar = ycb.b;
                float f3 = 0.0f;
                if (ycb.g(g, aVar.b())) {
                    f2 = a03Var.S(ibbVar.b());
                } else if (ycb.g(g, aVar.a())) {
                    f2 = wcb.h(ibbVar.b()) * f;
                } else {
                    f2 = 0.0f;
                }
                long g2 = wcb.g(ibbVar.c());
                if (ycb.g(g2, aVar.b())) {
                    f3 = a03Var.S(ibbVar.c());
                } else if (ycb.g(g2, aVar.a())) {
                    f3 = wcb.h(ibbVar.c()) * f;
                }
                t(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f2), (int) Math.ceil(f3)), 0, spannable.length());
            }
        }
    }
}
