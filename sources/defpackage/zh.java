package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.e;
import defpackage.ml;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidParagraphHelper.android.kt */
@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u001a\u001a\u0083\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000\u001a\f\u0010\u0019\u001a\u00020\u0015*\u00020\u0004H\u0000\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"", "text", "", "contextFontSize", "Lrcb;", "contextTextStyle", "", "Lml$a;", "Lvqa;", "spanStyles", "Ljb8;", "placeholders", "La03;", "density", "Lkotlin/Function4;", "Lw24;", "Lv34;", "Lq34;", "Lr34;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "b", "zh$a", "Lzh$a;", "NoopSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: zh  reason: default package */
/* loaded from: classes.dex */
public final class zh {
    private static final a a = new a();

    public static final CharSequence a(String str, float f, rcb rcbVar, List<ml.a<vqa>> list, List<ml.a<jb8>> list2, a03 a03Var, a94<? super w24, ? super v34, ? super q34, ? super r34, ? extends Typeface> a94Var, boolean z) {
        CharSequence charSequence;
        Spannable spannableString;
        z65.h(str, "text");
        z65.h(rcbVar, "contextTextStyle");
        z65.h(list, "spanStyles");
        z65.h(list2, "placeholders");
        z65.h(a03Var, "density");
        z65.h(a94Var, "resolveTypeface");
        if (z && e.h()) {
            charSequence = e.b().o(str);
            z65.e(charSequence);
        } else {
            charSequence = str;
        }
        z65.g(charSequence, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if (list.isEmpty() && list2.isEmpty() && z65.c(rcbVar.D(), ibb.c.a()) && xcb.f(rcbVar.s())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (z65.c(rcbVar.A(), kab.b.c())) {
            ara.t(spannableString, a, 0, str.length());
        }
        if (b(rcbVar) && rcbVar.t() == null) {
            ara.q(spannableString, rcbVar.s(), f, a03Var);
        } else {
            yp5 t = rcbVar.t();
            if (t == null) {
                t = yp5.c.a();
            }
            Spannable spannable = spannableString;
            ara.p(spannable, rcbVar.s(), f, a03Var, t);
        }
        ara.x(spannableString, rcbVar.D(), f, a03Var);
        ara.v(spannableString, rcbVar, list, a03Var, a94Var);
        kb8.d(spannableString, list2, a03Var);
        return spannableString;
    }

    public static final boolean b(rcb rcbVar) {
        hc8 a2;
        z65.h(rcbVar, "<this>");
        rc8 w = rcbVar.w();
        if (w != null && (a2 = w.a()) != null) {
            return a2.b();
        }
        return true;
    }

    /* compiled from: AndroidParagraphHelper.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"zh$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "", "updateDrawState", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zh$a */
    /* loaded from: classes.dex */
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
