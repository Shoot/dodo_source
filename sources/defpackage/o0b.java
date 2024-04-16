package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004\u001a\u0012\u0010\u000f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r\u001a\u0012\u0010\u0010\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004\u001a+\u0010\u0014\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0012*\n\u0012\u0006\b\u0000\u0012\u00020\u00010\u0011*\u00020\u00002\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u0000\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0007\u001a.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0019*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007\u001aH\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u001f*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000 H\u0007¨\u0006#"}, d2 = {"", "", "V0", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", "index", "W0", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "X0", "", "n", "T0", "U0", "Lkotlin/ranges/IntRange;", "indices", "Y0", "Z0", "", "C", "destination", "a1", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "", "b1", "size", "", "S0", "step", "", "partialWindows", "c1", "R", "Lkotlin/Function1;", "transform", "d1", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* renamed from: o0b  reason: default package */
/* loaded from: classes3.dex */
public class o0b extends n0b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: _Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/CharSequence;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0b$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function1<CharSequence, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(CharSequence charSequence) {
            z65.h(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static List<String> S0(CharSequence charSequence, int i) {
        z65.h(charSequence, "<this>");
        return c1(charSequence, i, i, true);
    }

    public static String T0(String str, int i) {
        int h;
        z65.h(str, "<this>");
        if (i >= 0) {
            h = i.h(i, str.length());
            String substring = str.substring(h);
            z65.g(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static String U0(String str, int i) {
        int e;
        String Z0;
        z65.h(str, "<this>");
        if (i >= 0) {
            e = i.e(str.length() - i, 0);
            Z0 = Z0(str, e);
            return Z0;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static Character V0(CharSequence charSequence) {
        z65.h(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character W0(CharSequence charSequence, int i) {
        z65.h(charSequence, "<this>");
        if (i >= 0 && i <= m0b.T(charSequence)) {
            return Character.valueOf(charSequence.charAt(i));
        }
        return null;
    }

    public static char X0(CharSequence charSequence) {
        z65.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m0b.T(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String Y0(String str, IntRange intRange) {
        z65.h(str, "<this>");
        z65.h(intRange, "indices");
        if (intRange.isEmpty()) {
            return "";
        }
        return m0b.G0(str, intRange);
    }

    public static String Z0(String str, int i) {
        int h;
        z65.h(str, "<this>");
        if (i >= 0) {
            h = i.h(i, str.length());
            String substring = str.substring(0, h);
            z65.g(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static final <C extends Collection<? super Character>> C a1(CharSequence charSequence, C c) {
        z65.h(charSequence, "<this>");
        z65.h(c, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            c.add(Character.valueOf(charSequence.charAt(i)));
        }
        return c;
    }

    public static Set<Character> b1(CharSequence charSequence) {
        Set<Character> e;
        Set<Character> d;
        int h;
        int e2;
        z65.h(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            e = sfa.e();
            return e;
        } else if (length != 1) {
            h = i.h(charSequence.length(), 128);
            e2 = f86.e(h);
            return (Set) a1(charSequence, new LinkedHashSet(e2));
        } else {
            d = rfa.d(Character.valueOf(charSequence.charAt(0)));
            return d;
        }
    }

    public static final List<String> c1(CharSequence charSequence, int i, int i2, boolean z) {
        z65.h(charSequence, "<this>");
        return d1(charSequence, i, i2, z, a.a);
    }

    public static final <R> List<R> d1(CharSequence charSequence, int i, int i2, boolean z, Function1<? super CharSequence, ? extends R> function1) {
        int i3;
        z65.h(charSequence, "<this>");
        z65.h(function1, "transform");
        tna.a(i, i2);
        int length = charSequence.length();
        int i4 = length / i2;
        int i5 = 0;
        if (length % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList(i4 + i3);
        while (i5 >= 0 && i5 < length) {
            int i6 = i5 + i;
            if (i6 < 0 || i6 > length) {
                if (!z) {
                    break;
                }
                i6 = length;
            }
            arrayList.add(function1.invoke(charSequence.subSequence(i5, i6)));
            i5 += i2;
        }
        return arrayList;
    }
}
