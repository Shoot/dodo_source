package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\u000f\u001a\u00020\u0006*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000H\u0000\"\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e\"\u0017\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"", "textDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "j", "topPadding", "bottomPadding", "Lfyb;", "a", "(II)J", "Lybb;", "k", "(Lybb;)J", "", "Lzp5;", "lineHeightSpans", Image.TYPE_HIGH, "(Lybb;[Lzp5;)J", "Landroid/text/TextPaint;", "textPaint", "frameworkTextDir", "Landroid/graphics/Paint$FontMetricsInt;", "g", "(Lybb;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Lzp5;)Landroid/graphics/Paint$FontMetricsInt;", "i", "(Lybb;)[Lzp5;", "Landroid/text/Layout;", "lineIndex", "", "l", "Ldab;", "Ldab;", "SharedTextAndroidCanvas", "b", "J", "ZeroVerticalPadding", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: acb  reason: default package */
/* loaded from: classes.dex */
public final class acb {
    private static final dab a = new dab();
    private static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return fyb.a((i2 & 4294967295L) | (i << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(ybb ybbVar, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, zp5[] zp5VarArr) {
        boolean z;
        Object D;
        boolean e;
        StaticLayout a2;
        int k = ybbVar.k() - 1;
        if (ybbVar.g().getLineStart(k) == ybbVar.g().getLineEnd(k)) {
            if (zp5VarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (true ^ z) {
                SpannableString spannableString = new SpannableString("\u200b");
                D = yr.D(zp5VarArr);
                zp5 zp5Var = (zp5) D;
                int length = spannableString.length();
                if (k != 0 && zp5Var.e()) {
                    e = false;
                } else {
                    e = zp5Var.e();
                }
                spannableString.setSpan(zp5Var.b(0, length, e), 0, spannableString.length(), 33);
                a2 = gwa.a.a(spannableString, (r47 & 2) != 0 ? 0 : 0, (r47 & 4) != 0 ? spannableString.length() : spannableString.length(), textPaint, Integer.MAX_VALUE, (r47 & 32) != 0 ? lm5.a.b() : textDirectionHeuristic, (r47 & 64) != 0 ? lm5.a.a() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & 256) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & 1024) != 0 ? 1.0f : 0.0f, (r47 & 2048) != 0 ? 0.0f : 0.0f, (r47 & 4096) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : ybbVar.f(), (r47 & 16384) != 0 ? true : ybbVar.c(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = a2.getLineAscent(0);
                fontMetricsInt.descent = a2.getLineDescent(0);
                fontMetricsInt.top = a2.getLineTop(0);
                fontMetricsInt.bottom = a2.getLineBottom(0);
                return fontMetricsInt;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(ybb ybbVar, zp5[] zp5VarArr) {
        int i = 0;
        int i2 = 0;
        for (zp5 zp5Var : zp5VarArr) {
            if (zp5Var.c() < 0) {
                i = Math.max(i, Math.abs(zp5Var.c()));
            }
            if (zp5Var.d() < 0) {
                i2 = Math.max(i, Math.abs(zp5Var.d()));
            }
        }
        if (i == 0 && i2 == 0) {
            return b;
        }
        return a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp5[] i(ybb ybbVar) {
        if (!(ybbVar.A() instanceof Spanned)) {
            return new zp5[0];
        }
        CharSequence A = ybbVar.A();
        z65.f(A, "null cannot be cast to non-null type android.text.Spanned");
        zp5[] zp5VarArr = (zp5[]) ((Spanned) A).getSpans(0, ybbVar.A().length(), zp5.class);
        z65.g(zp5VarArr, "lineHeightStyleSpans");
        if (zp5VarArr.length == 0) {
            return new zp5[0];
        }
        return zp5VarArr;
    }

    public static final TextDirectionHeuristic j(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                z65.g(textDirectionHeuristic, "FIRSTSTRONG_LTR");
                                return textDirectionHeuristic;
                            }
                            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.LOCALE;
                            z65.g(textDirectionHeuristic2, "LOCALE");
                            return textDirectionHeuristic2;
                        }
                        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.ANYRTL_LTR;
                        z65.g(textDirectionHeuristic3, "ANYRTL_LTR");
                        return textDirectionHeuristic3;
                    }
                    TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    z65.g(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
                    return textDirectionHeuristic4;
                }
                TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                z65.g(textDirectionHeuristic5, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic5;
            }
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.RTL;
            z65.g(textDirectionHeuristic6, "RTL");
            return textDirectionHeuristic6;
        }
        TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LTR;
        z65.g(textDirectionHeuristic7, "LTR");
        return textDirectionHeuristic7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(ybb ybbVar) {
        int topPadding;
        int bottomPadding;
        if (!ybbVar.f() && !ybbVar.B()) {
            TextPaint paint = ybbVar.g().getPaint();
            CharSequence text = ybbVar.g().getText();
            z65.g(paint, "paint");
            z65.g(text, "text");
            Rect c = rp7.c(paint, text, ybbVar.g().getLineStart(0), ybbVar.g().getLineEnd(0));
            int lineAscent = ybbVar.g().getLineAscent(0);
            int i = c.top;
            if (i < lineAscent) {
                topPadding = lineAscent - i;
            } else {
                topPadding = ybbVar.g().getTopPadding();
            }
            if (ybbVar.k() != 1) {
                int k = ybbVar.k() - 1;
                c = rp7.c(paint, text, ybbVar.g().getLineStart(k), ybbVar.g().getLineEnd(k));
            }
            int lineDescent = ybbVar.g().getLineDescent(ybbVar.k() - 1);
            int i2 = c.bottom;
            if (i2 > lineDescent) {
                bottomPadding = i2 - lineDescent;
            } else {
                bottomPadding = ybbVar.g().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return b;
            }
            return a(topPadding, bottomPadding);
        }
        return b;
    }

    public static final boolean l(Layout layout, int i) {
        z65.h(layout, "<this>");
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }
}
