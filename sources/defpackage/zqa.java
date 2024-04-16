package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
/* compiled from: SpannableBuilder.java */
/* renamed from: zqa  reason: default package */
/* loaded from: classes3.dex */
public class zqa implements Appendable, CharSequence {
    private final StringBuilder a;
    private final Deque<a> b;

    /* compiled from: SpannableBuilder.java */
    /* renamed from: zqa$a */
    /* loaded from: classes3.dex */
    public static class a {
        public final Object a;
        public int b;
        public int c;
        public final int d;

        a(@NonNull Object obj, int i, int i2, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpannableBuilder.java */
    /* renamed from: zqa$b */
    /* loaded from: classes3.dex */
    public static class b extends SpannableStringBuilder {
        b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public zqa() {
        this("");
    }

    private void e(int i, CharSequence charSequence) {
        int i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                i2 = spans.length;
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                if (z) {
                    for (int i3 = i2 - 1; i3 >= 0; i3--) {
                        Object obj = spans[i3];
                        i(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = spans[i4];
                    i(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    static boolean g(int i, int i2, int i3) {
        if (i3 > i2 && i2 >= 0 && i3 <= i) {
            return true;
        }
        return false;
    }

    public static void j(@NonNull zqa zqaVar, Object obj, int i, int i2) {
        if (obj == null || !g(zqaVar.length(), i, i2)) {
            return;
        }
        k(zqaVar, obj, i, i2);
    }

    private static void k(@NonNull zqa zqaVar, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    k(zqaVar, obj2, i, i2);
                }
                return;
            }
            zqaVar.i(obj, i, i2, 33);
        }
    }

    @Override // java.lang.Appendable
    @NonNull
    /* renamed from: a */
    public zqa append(char c) {
        this.a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* renamed from: b */
    public zqa append(@NonNull CharSequence charSequence) {
        e(length(), charSequence);
        this.a.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* renamed from: c */
    public zqa append(CharSequence charSequence, int i, int i2) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        e(length(), subSequence);
        this.a.append(subSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.a.charAt(i);
    }

    @NonNull
    public zqa d(@NonNull String str) {
        this.a.append(str);
        return this;
    }

    @NonNull
    public List<a> f(int i, int i2) {
        int i3;
        int length = length();
        if (!g(length, i, i2)) {
            return Collections.emptyList();
        }
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(this.b);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            a next = descendingIterator.next();
            int i4 = next.b;
            if ((i4 >= i && i4 < i2) || (((i3 = next.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char h() {
        return this.a.charAt(length() - 1);
    }

    @NonNull
    public zqa i(@NonNull Object obj, int i, int i2, int i3) {
        this.b.push(new a(obj, i, i2, i3));
        return this;
    }

    @NonNull
    public SpannableStringBuilder l() {
        b bVar = new b(this.a);
        for (a aVar : this.b) {
            bVar.setSpan(aVar.a, aVar.b, aVar.c, aVar.d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        List<a> f = f(i, i2);
        if (f.isEmpty()) {
            return this.a.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (a aVar : f) {
            int max = Math.max(0, aVar.b - i);
            spannableStringBuilder.setSpan(aVar.a, max, Math.min(length, (aVar.c - aVar.b) + max), aVar.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.a.toString();
    }

    public zqa(@NonNull CharSequence charSequence) {
        this.b = new ArrayDeque(8);
        this.a = new StringBuilder(charSequence);
        e(0, charSequence);
    }
}
