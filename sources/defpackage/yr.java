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
/* compiled from: _Arrays.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0012\u0010\u0010\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u0012\u0010\u0011\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\n\u0010\u0012\u001a\u00020\u000f*\u00020\u000e\u001a!\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u0007\u001a+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u0000*\u00020\u0014*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0019\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0018\"\b\b\u0001\u0010\u0000*\u00020\u0014*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001b\u001a\u0012\u0010\u001f\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d\u001a9\u0010\u0000\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b\u0000\u0010\u001b\u001a%\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b \u0010\u0017\u001a%\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010\u0017\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0!*\u00020#\u001a%\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010'\u001a\u007f\u00103\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u0004*\u00060(j\u0002`)*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010*\u001a\u00028\u00012\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+\u0018\u000101¢\u0006\u0004\b3\u00104\u001aq\u00105\u001a\u00028\u0000\"\f\b\u0000\u0010\u0004*\u00060(j\u0002`)*\u00020\u000e2\u0006\u0010*\u001a\u00028\u00002\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0018\u000101¢\u0006\u0004\b5\u00106\u001ai\u00108\u001a\u000207\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+\u0018\u000101¢\u0006\u0004\b8\u00109\u001aT\u0010:\u001a\u000207*\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020+2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0018\u000101\"#\u0010=\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0015\u0010=\u001a\u00020\b*\u00020#8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"T", "", "element", "", "A", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "D", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "G", "([Ljava/lang/Object;I)Ljava/lang/Object;", "I", "([Ljava/lang/Object;Ljava/lang/Object;)I", "", "", "H", "P", "Q", "R", "", "", "B", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "", "Lkotlin/ranges/IntRange;", "indices", "S", "U", "", "W", "", "V", "", "X", "([Ljava/lang/Object;)Ljava/util/Set;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "K", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "J", "([CLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "M", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "L", "F", "([Ljava/lang/Object;)I", "lastIndex", "E", "([I)I", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/ArraysKt")
/* renamed from: yr */
/* loaded from: classes3.dex */
public class yr extends xr {
    public static <T> boolean A(T[] tArr, T t) {
        int I;
        z65.h(tArr, "<this>");
        I = I(tArr, t);
        if (I >= 0) {
            return true;
        }
        return false;
    }

    public static <T> List<T> B(T[] tArr) {
        z65.h(tArr, "<this>");
        return (List) C(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C C(T[] tArr, C c) {
        z65.h(tArr, "<this>");
        z65.h(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> T D(T[] tArr) {
        z65.h(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int E(int[] iArr) {
        z65.h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static <T> int F(T[] tArr) {
        z65.h(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T G(T[] tArr, int i) {
        int F;
        z65.h(tArr, "<this>");
        if (i >= 0) {
            F = F(tArr);
            if (i <= F) {
                return tArr[i];
            }
        }
        return null;
    }

    public static int H(char[] cArr, char c) {
        z65.h(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int I(T[] tArr, T t) {
        z65.h(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (z65.c(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <A extends Appendable> A J(char[] cArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super Character, ? extends CharSequence> function1) {
        z65.h(cArr, "<this>");
        z65.h(a, "buffer");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                a.append(function1.invoke(Character.valueOf(c)));
            } else {
                a.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T, A extends Appendable> A K(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(tArr, "<this>");
        z65.h(a, "buffer");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            d0b.a(a, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final String L(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super Character, ? extends CharSequence> function1) {
        z65.h(cArr, "<this>");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        String sb = ((StringBuilder) J(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        z65.g(sb, "toString(...)");
        return sb;
    }

    public static final <T> String M(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        z65.h(tArr, "<this>");
        z65.h(charSequence, "separator");
        z65.h(charSequence2, "prefix");
        z65.h(charSequence3, "postfix");
        z65.h(charSequence4, "truncated");
        String sb = ((StringBuilder) K(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
        z65.g(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String N(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return L(cArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static /* synthetic */ String O(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return M(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static int P(char[] cArr, char c) {
        z65.h(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (c == cArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static char Q(char[] cArr) {
        z65.h(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T R(T[] tArr) {
        z65.h(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static byte[] S(byte[] bArr, IntRange intRange) {
        byte[] m;
        z65.h(bArr, "<this>");
        z65.h(intRange, "indices");
        if (!intRange.isEmpty()) {
            m = xr.m(bArr, intRange.z().intValue(), intRange.x().intValue() + 1);
            return m;
        }
        return new byte[0];
    }

    public static final <T, C extends Collection<? super T>> C T(T[] tArr, C c) {
        z65.h(tArr, "<this>");
        z65.h(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static <T> List<T> U(T[] tArr) {
        List<T> l;
        List<T> e;
        List<T> W;
        z65.h(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            l = kc1.l();
            return l;
        } else if (length != 1) {
            W = W(tArr);
            return W;
        } else {
            e = jc1.e(tArr[0]);
            return e;
        }
    }

    public static List<Integer> V(int[] iArr) {
        z65.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static <T> List<T> W(T[] tArr) {
        z65.h(tArr, "<this>");
        return new ArrayList(kc1.i(tArr));
    }

    public static final <T> Set<T> X(T[] tArr) {
        Set<T> e;
        Set<T> d;
        int e2;
        z65.h(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            e = sfa.e();
            return e;
        } else if (length != 1) {
            e2 = f86.e(tArr.length);
            return (Set) T(tArr, new LinkedHashSet(e2));
        } else {
            d = rfa.d(tArr[0]);
            return d;
        }
    }
}
