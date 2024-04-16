package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import defpackage.kab;
import defpackage.ml;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidAccessibilitySpannableString.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a4\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0010"}, d2 = {"Lml;", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "Lspb;", "urlSpanCache", "Landroid/text/SpannableString;", "b", "Lvqa;", "spanStyle", "", "start", "end", "", "a", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: de  reason: default package */
/* loaded from: classes.dex */
public final class de {
    private static final void a(SpannableString spannableString, vqa vqaVar, int i, int i2, a03 a03Var, w24.b bVar) {
        int b;
        int a;
        ara.j(spannableString, vqaVar.g(), i, i2);
        ara.n(spannableString, vqaVar.k(), a03Var, i, i2);
        if (vqaVar.n() != null || vqaVar.l() != null) {
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
            spannableString.setSpan(new StyleSpan(xg.c(n, b)), i, i2, 33);
        }
        if (vqaVar.i() != null) {
            if (vqaVar.i() instanceof jd4) {
                spannableString.setSpan(new TypefaceSpan(((jd4) vqaVar.i()).t()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                w24 i3 = vqaVar.i();
                r34 m = vqaVar.m();
                if (m != null) {
                    a = m.j();
                } else {
                    a = r34.b.a();
                }
                Object value = x24.a(bVar, i3, null, 0, a, 6, null).getValue();
                z65.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(bm.a.a((Typeface) value), i, i2, 33);
            }
        }
        if (vqaVar.s() != null) {
            kab s = vqaVar.s();
            kab.a aVar = kab.b;
            if (s.d(aVar.c())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (vqaVar.s().d(aVar.a())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (vqaVar.u() != null) {
            spannableString.setSpan(new ScaleXSpan(vqaVar.u().b()), i, i2, 33);
        }
        ara.r(spannableString, vqaVar.p(), i, i2);
        ara.g(spannableString, vqaVar.d(), i, i2);
    }

    public static final SpannableString b(ml mlVar, a03 a03Var, w24.b bVar, spb spbVar) {
        z65.h(mlVar, "<this>");
        z65.h(a03Var, "density");
        z65.h(bVar, "fontFamilyResolver");
        z65.h(spbVar, "urlSpanCache");
        SpannableString spannableString = new SpannableString(mlVar.h());
        List<ml.a<vqa>> g = mlVar.g();
        if (g != null) {
            int size = g.size();
            for (int i = 0; i < size; i++) {
                ml.a<vqa> aVar = g.get(i);
                a(spannableString, vqa.b(aVar.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), aVar.b(), aVar.c(), a03Var, bVar);
            }
        }
        List<ml.a<jnb>> i2 = mlVar.i(0, mlVar.length());
        int size2 = i2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ml.a<jnb> aVar2 = i2.get(i3);
            spannableString.setSpan(knb.a(aVar2.a()), aVar2.b(), aVar2.c(), 33);
        }
        List<ml.a<stb>> j = mlVar.j(0, mlVar.length());
        int size3 = j.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ml.a<stb> aVar3 = j.get(i4);
            spannableString.setSpan(spbVar.a(aVar3.a()), aVar3.b(), aVar3.c(), 33);
        }
        return spannableString;
    }
}
