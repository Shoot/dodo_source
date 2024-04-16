package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.uc1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpanStyle.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001aÃ\u0001\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a\u0018\u0010(\u001a\u0004\u0018\u00010!*\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010!H\u0002\"\u0017\u0010+\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010*\"\u0017\u0010,\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010*\"\u0017\u0010-\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010*\"\u0017\u0010.\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0002\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lvqa;", "style", DateTokenConverter.CONVERTER_KEY, "Luc1;", RemoteMessageConst.Notification.COLOR, "Lmg0;", "brush", "", "alpha", "Lwcb;", "fontSize", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "Lw24;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lv80;", "baselineShift", "Lgbb;", "textGeometricTransform", "Lns5;", "localeList", "background", "Lkab;", "textDecoration", "Loga;", "shadow", "Lkc8;", "platformStyle", "Lz73;", "drawStyle", "b", "(Lvqa;JLmg0;FJLv34;Lq34;Lr34;Lw24;Ljava/lang/String;JLv80;Lgbb;Lns5;JLkab;Loga;Lkc8;Lz73;)Lvqa;", "other", c.a, "a", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: wqa  reason: default package */
/* loaded from: classes.dex */
public final class wqa {
    private static final long a = xcb.e(14);
    private static final long b = xcb.e(0);
    private static final long c;
    private static final long d;

    /* compiled from: SpanStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcbb;", "a", "()Lcbb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wqa$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<cbb> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final cbb invoke() {
            return cbb.a.b(wqa.d);
        }
    }

    static {
        uc1.a aVar = uc1.b;
        c = aVar.d();
        d = aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (defpackage.uc1.l(r21, r20.t().b()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (defpackage.z65.c(r6, r20.l()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (defpackage.z65.c(r5, r20.n()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r30 != r20.i()) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (defpackage.wcb.e(r32, r20.o()) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (defpackage.wcb.e(r25, r20.k()) == false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vqa b(defpackage.vqa r20, long r21, defpackage.mg0 r23, float r24, long r25, defpackage.v34 r27, defpackage.q34 r28, defpackage.r34 r29, defpackage.w24 r30, java.lang.String r31, long r32, defpackage.v80 r34, defpackage.gbb r35, defpackage.ns5 r36, long r37, defpackage.kab r39, defpackage.oga r40, defpackage.kc8 r41, defpackage.z73 r42) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqa.b(vqa, long, mg0, float, long, v34, q34, r34, w24, java.lang.String, long, v80, gbb, ns5, long, kab, oga, kc8, z73):vqa");
    }

    private static final kc8 c(vqa vqaVar, kc8 kc8Var) {
        vqaVar.q();
        return kc8Var;
    }

    public static final vqa d(vqa vqaVar) {
        long k;
        int b2;
        int a2;
        long o;
        float a3;
        z65.h(vqaVar, "style");
        cbb c2 = vqaVar.t().c(a.a);
        if (xcb.f(vqaVar.k())) {
            k = a;
        } else {
            k = vqaVar.k();
        }
        long j = k;
        v34 n = vqaVar.n();
        if (n == null) {
            n = v34.b.e();
        }
        v34 v34Var = n;
        q34 l = vqaVar.l();
        if (l != null) {
            b2 = l.i();
        } else {
            b2 = q34.b.b();
        }
        q34 c3 = q34.c(b2);
        r34 m = vqaVar.m();
        if (m != null) {
            a2 = m.j();
        } else {
            a2 = r34.b.a();
        }
        r34 b3 = r34.b(a2);
        w24 i = vqaVar.i();
        if (i == null) {
            i = w24.b.b();
        }
        w24 w24Var = i;
        String j2 = vqaVar.j();
        if (j2 == null) {
            j2 = "";
        }
        String str = j2;
        if (xcb.f(vqaVar.o())) {
            o = b;
        } else {
            o = vqaVar.o();
        }
        long j3 = o;
        v80 e = vqaVar.e();
        if (e != null) {
            a3 = e.h();
        } else {
            a3 = v80.b.a();
        }
        v80 b4 = v80.b(a3);
        gbb u = vqaVar.u();
        if (u == null) {
            u = gbb.c.a();
        }
        gbb gbbVar = u;
        ns5 p = vqaVar.p();
        if (p == null) {
            p = ns5.c.a();
        }
        ns5 ns5Var = p;
        long d2 = vqaVar.d();
        if (d2 == uc1.b.e()) {
            d2 = c;
        }
        long j4 = d2;
        kab s = vqaVar.s();
        if (s == null) {
            s = kab.b.b();
        }
        kab kabVar = s;
        oga r = vqaVar.r();
        if (r == null) {
            r = oga.d.a();
        }
        oga ogaVar = r;
        vqaVar.q();
        z73 h = vqaVar.h();
        if (h == null) {
            h = uu3.a;
        }
        return new vqa(c2, j, v34Var, c3, b3, w24Var, str, j3, b4, gbbVar, ns5Var, j4, kabVar, ogaVar, (kc8) null, h, (DefaultConstructorMarker) null);
    }
}
