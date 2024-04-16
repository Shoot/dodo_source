package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
/* compiled from: StringsJVM.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\fH\u0007\u001a \u0010\u0011\u001a\u00020\u0000*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007\u001a\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0007\u001a\u001c\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\u0018\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\u0002*\u00020\u0019\u001a4\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\u001f\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0007\u001a\u0012\u0010$\u001a\u00020\u0000*\u00020\u00192\u0006\u0010#\u001a\u00020\u000e\"%\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00000&j\b\u0012\u0004\u0012\u00020\u0000`'*\u00020%8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"", "other", "", "ignoreCase", "v", "", "oldChar", "newChar", "C", "oldValue", "newValue", "D", "", "q", "", "startIndex", "endIndex", "r", "", Image.TYPE_SMALL, "prefix", "H", "G", "suffix", "t", "", "y", "thisOffset", "otherOffset", "length", "z", "o", "Ljava/util/Locale;", "locale", "p", "n", "B", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "x", "(Lpza;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* renamed from: l0b */
/* loaded from: classes3.dex */
public class l0b extends k0b {
    public static /* synthetic */ boolean A(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        boolean z2;
        boolean z3;
        if ((i4 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        z3 = z(str, i, str2, i2, i3, z2);
        return z3;
    }

    public static String B(CharSequence charSequence, int i) {
        z65.h(charSequence, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return "";
            }
            if (i != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i);
                    q55 it = new IntRange(1, i).iterator();
                    while (it.hasNext()) {
                        it.b();
                        sb.append(charSequence);
                    }
                    String sb2 = sb.toString();
                    z65.e(sb2);
                    return sb2;
                }
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                for (int i2 = 0; i2 < i; i2++) {
                    cArr[i2] = charAt;
                }
                return new String(cArr);
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + CoreConstants.DOT).toString());
    }

    public static final String C(String str, char c, char c2, boolean z) {
        z65.h(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            z65.g(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (ow0.f(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public static final String D(String str, String str2, String str3, boolean z) {
        int e;
        z65.h(str, "<this>");
        z65.h(str2, "oldValue");
        z65.h(str3, "newValue");
        int i = 0;
        int V = m0b.V(str, str2, 0, z);
        if (V < 0) {
            return str;
        }
        int length = str2.length();
        e = i.e(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, V);
                sb.append(str3);
                i = V + length;
                if (V >= str.length()) {
                    break;
                }
                V = m0b.V(str, str2, V + e, z);
            } while (V > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            z65.g(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String E(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return C(str, c, c2, z);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return D(str, str2, str3, z);
    }

    public static boolean G(String str, String str2, int i, boolean z) {
        boolean z2;
        z65.h(str, "<this>");
        z65.h(str2, "prefix");
        if (z) {
            z2 = z(str, i, str2, 0, str2.length(), z);
            return z2;
        }
        return str.startsWith(str2, i);
    }

    public static boolean H(String str, String str2, boolean z) {
        boolean z2;
        z65.h(str, "<this>");
        z65.h(str2, "prefix");
        if (z) {
            z2 = z(str, 0, str2, 0, str2.length(), z);
            return z2;
        }
        return str.startsWith(str2);
    }

    public static /* synthetic */ boolean I(String str, String str2, int i, boolean z, int i2, Object obj) {
        boolean G;
        if ((i2 & 4) != 0) {
            z = false;
        }
        G = G(str, str2, i, z);
        return G;
    }

    public static /* synthetic */ boolean J(String str, String str2, boolean z, int i, Object obj) {
        boolean H;
        if ((i & 2) != 0) {
            z = false;
        }
        H = H(str, str2, z);
        return H;
    }

    public static String o(String str) {
        z65.h(str, "<this>");
        Locale locale = Locale.getDefault();
        z65.g(locale, "getDefault(...)");
        return p(str, locale);
    }

    public static final String p(String str, Locale locale) {
        z65.h(str, "<this>");
        z65.h(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    z65.g(substring, "substring(...)");
                    z65.f(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    z65.g(upperCase, "toUpperCase(...)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                z65.g(substring2, "substring(...)");
                sb.append(substring2);
                String sb2 = sb.toString();
                z65.g(sb2, "toString(...)");
                return sb2;
            }
            return str;
        }
        return str;
    }

    public static String q(char[] cArr) {
        z65.h(cArr, "<this>");
        return new String(cArr);
    }

    public static String r(char[] cArr, int i, int i2) {
        z65.h(cArr, "<this>");
        n1.a.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static byte[] s(String str) {
        z65.h(str, "<this>");
        byte[] bytes = str.getBytes(rw0.b);
        z65.g(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean t(String str, String str2, boolean z) {
        boolean z2;
        z65.h(str, "<this>");
        z65.h(str2, "suffix");
        if (z) {
            z2 = z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
            return z2;
        }
        return str.endsWith(str2);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z, int i, Object obj) {
        boolean t;
        if ((i & 2) != 0) {
            z = false;
        }
        t = t(str, str2, z);
        return t;
    }

    public static boolean v(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z, int i, Object obj) {
        boolean v;
        if ((i & 2) != 0) {
            z = false;
        }
        v = v(str, str2, z);
        return v;
    }

    public static Comparator<String> x(pza pzaVar) {
        z65.h(pzaVar, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        z65.g(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean y(CharSequence charSequence) {
        z65.h(charSequence, "<this>");
        if (charSequence.length() != 0) {
            IntRange S = m0b.S(charSequence);
            if (!(S instanceof Collection) || !((Collection) S).isEmpty()) {
                Iterator<Integer> it = S.iterator();
                while (it.hasNext()) {
                    if (!nw0.c(charSequence.charAt(((q55) it).b()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean z(String str, int i, String str2, int i2, int i3, boolean z) {
        z65.h(str, "<this>");
        z65.h(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
