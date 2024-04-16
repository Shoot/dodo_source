package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import java.util.stream.IntStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public class m implements Spannable {
    private boolean a = false;
    @NonNull
    private Spannable b;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            IntStream chars;
            chars = charSequence.chars();
            return chars;
        }

        static IntStream b(CharSequence charSequence) {
            IntStream codePoints;
            codePoints = charSequence.codePoints();
            return codePoints;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof dh8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.m.b
        boolean a(CharSequence charSequence) {
            if (!ng8.a(charSequence) && !(charSequence instanceof dh8)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@NonNull Spannable spannable) {
        this.b = spannable;
    }

    private void a() {
        Spannable spannable = this.b;
        if (!this.a && c().a(spannable)) {
            this.b = new SpannableString(spannable);
        }
        this.a = true;
    }

    static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Spannable b() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream chars() {
        return a.a(this.b);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public IntStream codePoints() {
        return a.b(this.b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(@NonNull CharSequence charSequence) {
        this.b = new SpannableString(charSequence);
    }
}
