package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
/* compiled from: PrecomputedTextCompat.java */
/* renamed from: dh8  reason: default package */
/* loaded from: classes.dex */
public class dh8 implements Spannable {
    private static final Object d = new Object();
    @NonNull
    private final Spannable a;
    @NonNull
    private final a b;
    private final PrecomputedText c;

    @NonNull
    public a a() {
        return this.b;
    }

    public PrecomputedText b() {
        if (ng8.a(this.a)) {
            return og8.a(this.a);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.c.getSpans(i, i2, cls);
            return (T[]) spans;
        }
        return (T[]) this.a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.a.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.c.removeSpan(obj);
                return;
            } else {
                this.a.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.c.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.a.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.a.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* renamed from: dh8$a */
    /* loaded from: classes.dex */
    public static final class a {
        @NonNull
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final PrecomputedText.Params e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: dh8$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0286a {
            @NonNull
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public C0286a(@NonNull TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @NonNull
            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }

            public C0286a b(int i) {
                this.c = i;
                return this;
            }

            public C0286a c(int i) {
                this.d = i;
                return this;
            }

            public C0286a d(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        a(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = tg8.a(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.e = build;
            } else {
                this.e = null;
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public boolean a(@NonNull a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.c != aVar.b() || this.d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX() || this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = this.a.getTextLocales();
                textLocales2 = aVar.e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        @NonNull
        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.b == aVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                textLocales = this.a.getTextLocales();
                return p57.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), textLocales, this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            return p57.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocales = this.a.getTextLocales();
                sb2.append(textLocales);
                sb.append(sb2.toString());
            } else {
                sb.append(", textLocale=" + this.a.getTextLocale());
            }
            sb.append(", typeface=" + this.a.getTypeface());
            if (i >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        public a(@NonNull PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.a = textPaint;
            textDirection = params.getTextDirection();
            this.b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.d = hyphenationFrequency;
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
