package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Loab;", "textDirection", "Lns5;", "localeList", "", DateTokenConverter.CONVERTER_KEY, "(Loab;Lns5;)I", "", "text", "Lrcb;", "style", "", "Lml$a;", "Lvqa;", "spanStyles", "Ljb8;", "placeholders", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "Leq7;", "a", "", c.a, "(Lrcb;)Z", "hasEmojiCompat", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: bi  reason: default package */
/* loaded from: classes.dex */
public final class bi {
    public static final eq7 a(String str, rcb rcbVar, List<ml.a<vqa>> list, List<ml.a<jb8>> list2, a03 a03Var, w24.b bVar) {
        z65.h(str, "text");
        z65.h(rcbVar, "style");
        z65.h(list, "spanStyles");
        z65.h(list2, "placeholders");
        z65.h(a03Var, "density");
        z65.h(bVar, "fontFamilyResolver");
        return new ai(str, rcbVar, list, list2, bVar, a03Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(rcb rcbVar) {
        vf3 vf3Var;
        boolean f;
        hc8 a;
        rc8 w = rcbVar.w();
        if (w != null && (a = w.a()) != null) {
            vf3Var = vf3.c(a.a());
        } else {
            vf3Var = null;
        }
        int b = vf3.b.b();
        if (vf3Var == null) {
            f = false;
        } else {
            f = vf3.f(vf3Var.i(), b);
        }
        return !f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r6 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(defpackage.oab r6, defpackage.ns5 r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.l()
            goto Ld
        L7:
            oab$a r6 = defpackage.oab.b
            int r6 = r6.a()
        Ld:
            oab$a r0 = defpackage.oab.b
            int r1 = r0.b()
            boolean r1 = defpackage.oab.i(r6, r1)
            r2 = 2
            if (r1 == 0) goto L1b
            goto L6f
        L1b:
            int r1 = r0.c()
            boolean r1 = defpackage.oab.i(r6, r1)
            r3 = 3
            if (r1 == 0) goto L28
        L26:
            r2 = 3
            goto L6f
        L28:
            int r1 = r0.d()
            boolean r1 = defpackage.oab.i(r6, r1)
            r4 = 0
            if (r1 == 0) goto L35
            r2 = 0
            goto L6f
        L35:
            int r1 = r0.e()
            boolean r1 = defpackage.oab.i(r6, r1)
            r5 = 1
            if (r1 == 0) goto L42
            r2 = 1
            goto L6f
        L42:
            int r0 = r0.a()
            boolean r6 = defpackage.oab.i(r6, r0)
            if (r6 == 0) goto L70
            if (r7 == 0) goto L63
            is5 r6 = r7.g(r4)
            ec8 r6 = r6.a()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            defpackage.z65.f(r6, r7)
            jh r6 = (defpackage.jh) r6
            java.util.Locale r6 = r6.b()
            if (r6 != 0) goto L67
        L63:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L67:
            int r6 = defpackage.adb.a(r6)
            if (r6 == 0) goto L6f
            if (r6 == r5) goto L26
        L6f:
            return r2
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.d(oab, ns5):int");
    }
}
