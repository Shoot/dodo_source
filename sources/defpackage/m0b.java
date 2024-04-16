package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
import kotlin.sequences.Sequence;
/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u001a\u0012\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u001a\u001c\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u001a\u0012\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000\u001a\u0012\u0010\u0017\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0000\u001a\u001a\u0010\u0018\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000\u001a\u0012\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\r\u001a\u00020\u0000\u001a4\u0010\u001f\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u001a\u001c\u0010 \u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001c\u0010!\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a&\u0010%\u001a\u00020\u0002*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a&\u0010&\u001a\u00020\u0002*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a=\u0010)\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*\u001aG\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010-*\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070+2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010/\u001a&\u00101\u001a\u00020\u0002*\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a&\u00103\u001a\u00020\u0002*\u00020\u00002\u0006\u00102\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a&\u00104\u001a\u00020\u0002*\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a&\u00105\u001a\u00020\u0002*\u00020\u00002\u0006\u00102\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u001a\u001f\u00106\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0086\u0002\u001a\u001f\u00107\u001a\u00020\u001d*\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0086\u0002\u001a?\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0:*\u00020\u00002\u0006\u00108\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\b;\u0010<\u001aG\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0:*\u00020\u00002\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070=2\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0010\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u0002H\u0000\u001a?\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070:*\u00020\u00002\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070=\"\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u0002¢\u0006\u0004\bB\u0010C\u001a?\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070D*\u00020\u00002\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070=\"\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u0002¢\u0006\u0004\bE\u0010F\u001a0\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070:*\u00020\u00002\n\u00108\u001a\u00020\"\"\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u0002\u001a0\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070D*\u00020\u00002\n\u00108\u001a\u00020\"\"\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00109\u001a\u00020\u0002\u001a1\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070D*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\bI\u0010J\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070:*\u00020\u0000\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070D*\u00020\u0000\"\u0015\u0010O\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0015\u0010R\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"", "R0", "", "length", "", "padChar", "i0", "", "j0", "Lkotlin/ranges/IntRange;", "range", "G0", "F0", "delimiter", "missingDelimiterValue", "N0", "O0", "H0", "I0", "L0", "prefix", "p0", "suffix", "q0", "s0", "r0", "thisOffset", "other", "otherOffset", "", "ignoreCase", "o0", "D0", "P", "", "chars", "startIndex", "a0", "f0", "endIndex", "last", "W", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "R", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "char", "U", "string", "V", "b0", "c0", "M", "L", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "k0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "l0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "t0", "A0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "", "v0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "z0", "u0", "w0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "g0", "h0", "S", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "T", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* renamed from: m0b */
/* loaded from: classes3.dex */
public class m0b extends l0b {

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0b$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
        final /* synthetic */ char[] a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z) {
            super(2);
            this.a = cArr;
            this.b = z;
        }

        public final Pair<Integer, Integer> a(CharSequence charSequence, int i) {
            z65.h(charSequence, "$this$$receiver");
            int a0 = m0b.a0(charSequence, this.a, i, this.b);
            if (a0 < 0) {
                return null;
            }
            return lnb.a(Integer.valueOf(a0), 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0b$b */
    /* loaded from: classes3.dex */
    public static final class b extends ej5 implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List<String> a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z) {
            super(2);
            this.a = list;
            this.b = z;
        }

        public final Pair<Integer, Integer> a(CharSequence charSequence, int i) {
            z65.h(charSequence, "$this$$receiver");
            Pair R = m0b.R(charSequence, this.a, i, this.b, false);
            if (R != null) {
                return lnb.a(R.c(), Integer.valueOf(((String) R.d()).length()));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/IntRange;", "it", "", "a", "(Lkotlin/ranges/IntRange;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0b$c */
    /* loaded from: classes3.dex */
    public static final class c extends ej5 implements Function1<IntRange, String> {
        final /* synthetic */ CharSequence a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(IntRange intRange) {
            z65.h(intRange, "it");
            return m0b.F0(this.a, intRange);
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/IntRange;", "it", "", "a", "(Lkotlin/ranges/IntRange;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0b$d */
    /* loaded from: classes3.dex */
    public static final class d extends ej5 implements Function1<IntRange, String> {
        final /* synthetic */ CharSequence a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(IntRange intRange) {
            z65.h(intRange, "it");
            return m0b.F0(this.a, intRange);
        }
    }

    public static final Sequence<String> A0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        Sequence<String> q;
        z65.h(charSequence, "<this>");
        z65.h(strArr, "delimiters");
        q = dca.q(n0(charSequence, strArr, 0, z, i, 2, null), new c(charSequence));
        return q;
    }

    public static /* synthetic */ Sequence B0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return z0(charSequence, cArr, z, i);
    }

    public static /* synthetic */ Sequence C0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return A0(charSequence, strArr, z, i);
    }

    public static boolean D0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean J;
        z65.h(charSequence, "<this>");
        z65.h(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            J = l0b.J((String) charSequence, (String) charSequence2, false, 2, null);
            return J;
        }
        return o0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean E0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean D0;
        if ((i & 2) != 0) {
            z = false;
        }
        D0 = D0(charSequence, charSequence2, z);
        return D0;
    }

    public static final String F0(CharSequence charSequence, IntRange intRange) {
        z65.h(charSequence, "<this>");
        z65.h(intRange, "range");
        return charSequence.subSequence(intRange.z().intValue(), intRange.x().intValue() + 1).toString();
    }

    public static final String G0(String str, IntRange intRange) {
        z65.h(str, "<this>");
        z65.h(intRange, "range");
        String substring = str.substring(intRange.z().intValue(), intRange.x().intValue() + 1);
        z65.g(substring, "substring(...)");
        return substring;
    }

    public static final String H0(String str, char c2, String str2) {
        int Y;
        z65.h(str, "<this>");
        z65.h(str2, "missingDelimiterValue");
        Y = Y(str, c2, 0, false, 6, null);
        if (Y != -1) {
            String substring = str.substring(Y + 1, str.length());
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    public static String I0(String str, String str2, String str3) {
        int Z;
        z65.h(str, "<this>");
        z65.h(str2, "delimiter");
        z65.h(str3, "missingDelimiterValue");
        Z = Z(str, str2, 0, false, 6, null);
        if (Z != -1) {
            String substring = str.substring(Z + str2.length(), str.length());
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str3;
    }

    public static /* synthetic */ String J0(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return H0(str, c2, str2);
    }

    public static /* synthetic */ String K0(String str, String str2, String str3, int i, Object obj) {
        String I0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        I0 = I0(str, str2, str3);
        return I0;
    }

    public static final boolean L(CharSequence charSequence, char c2, boolean z) {
        int Y;
        z65.h(charSequence, "<this>");
        Y = Y(charSequence, c2, 0, z, 2, null);
        if (Y >= 0) {
            return true;
        }
        return false;
    }

    public static String L0(String str, char c2, String str2) {
        int d0;
        z65.h(str, "<this>");
        z65.h(str2, "missingDelimiterValue");
        d0 = d0(str, c2, 0, false, 6, null);
        if (d0 != -1) {
            String substring = str.substring(d0 + 1, str.length());
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    public static boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int Z;
        z65.h(charSequence, "<this>");
        z65.h(charSequence2, "other");
        if (charSequence2 instanceof String) {
            Z = Z(charSequence, (String) charSequence2, 0, z, 2, null);
            if (Z < 0) {
                return false;
            }
        } else if (X(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String M0(String str, char c2, String str2, int i, Object obj) {
        String L0;
        if ((i & 2) != 0) {
            str2 = str;
        }
        L0 = L0(str, c2, str2);
        return L0;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return L(charSequence, c2, z);
    }

    public static final String N0(String str, char c2, String str2) {
        int Y;
        z65.h(str, "<this>");
        z65.h(str2, "missingDelimiterValue");
        Y = Y(str, c2, 0, false, 6, null);
        if (Y != -1) {
            String substring = str.substring(0, Y);
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean M;
        if ((i & 2) != 0) {
            z = false;
        }
        M = M(charSequence, charSequence2, z);
        return M;
    }

    public static String O0(String str, String str2, String str3) {
        int Z;
        z65.h(str, "<this>");
        z65.h(str2, "delimiter");
        z65.h(str3, "missingDelimiterValue");
        Z = Z(str, str2, 0, false, 6, null);
        if (Z != -1) {
            String substring = str.substring(0, Z);
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str3;
    }

    public static final boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean u;
        z65.h(charSequence, "<this>");
        z65.h(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            u = l0b.u((String) charSequence, (String) charSequence2, false, 2, null);
            return u;
        }
        return o0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ String P0(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return N0(str, c2, str2);
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return P(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String Q0(String str, String str2, String str3, int i, Object obj) {
        String O0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        O0 = O0(str, str2, str3);
        return O0;
    }

    public static final Pair<Integer, String> R(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int h;
        kotlin.ranges.d n;
        Object obj;
        Object obj2;
        boolean z3;
        int e;
        Object t0;
        if (!z && collection.size() == 1) {
            t0 = sc1.t0(collection);
            String str = (String) t0;
            int Z = !z2 ? Z(charSequence, str, i, false, 4, null) : e0(charSequence, str, i, false, 4, null);
            if (Z < 0) {
                return null;
            }
            return lnb.a(Integer.valueOf(Z), str);
        }
        if (!z2) {
            e = i.e(i, 0);
            n = new IntRange(e, charSequence.length());
        } else {
            h = i.h(i, T(charSequence));
            n = i.n(h, 0);
        }
        if (charSequence instanceof String) {
            int h2 = n.h();
            int k = n.k();
            int p = n.p();
            if ((p > 0 && h2 <= k) || (p < 0 && k <= h2)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            z3 = l0b.z(str2, 0, (String) charSequence, h2, str2.length(), z);
                            if (z3) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return lnb.a(Integer.valueOf(h2), str3);
                    }
                    if (h2 == k) {
                        break;
                    }
                    h2 += p;
                }
            }
        } else {
            int h3 = n.h();
            int k2 = n.k();
            int p2 = n.p();
            if ((p2 > 0 && h3 <= k2) || (p2 < 0 && k2 <= h3)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (o0(str4, 0, charSequence, h3, str4.length(), z)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return lnb.a(Integer.valueOf(h3), str5);
                    }
                    if (h3 == k2) {
                        break;
                    }
                    h3 += p2;
                }
            }
        }
        return null;
    }

    public static CharSequence R0(CharSequence charSequence) {
        int i;
        z65.h(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c2 = nw0.c(charSequence.charAt(i));
            if (!z) {
                if (!c2) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c2) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final IntRange S(CharSequence charSequence) {
        z65.h(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static final int T(CharSequence charSequence) {
        z65.h(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int U(CharSequence charSequence, char c2, int i, boolean z) {
        z65.h(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i);
        }
        return a0(charSequence, new char[]{c2}, i, z);
    }

    public static final int V(CharSequence charSequence, String str, int i, boolean z) {
        z65.h(charSequence, "<this>");
        z65.h(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return X(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    private static final int W(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int h;
        int e;
        kotlin.ranges.d n;
        boolean z3;
        int e2;
        int h2;
        if (!z2) {
            e2 = i.e(i, 0);
            h2 = i.h(i2, charSequence.length());
            n = new IntRange(e2, h2);
        } else {
            h = i.h(i, T(charSequence));
            e = i.e(i2, 0);
            n = i.n(h, e);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int h3 = n.h();
            int k = n.k();
            int p = n.p();
            if ((p <= 0 || h3 > k) && (p >= 0 || k > h3)) {
                return -1;
            }
            while (true) {
                z3 = l0b.z((String) charSequence2, 0, (String) charSequence, h3, charSequence2.length(), z);
                if (z3) {
                    return h3;
                }
                if (h3 != k) {
                    h3 += p;
                } else {
                    return -1;
                }
            }
        } else {
            int h4 = n.h();
            int k2 = n.k();
            int p2 = n.p();
            if ((p2 > 0 && h4 <= k2) || (p2 < 0 && k2 <= h4)) {
                while (!o0(charSequence2, 0, charSequence, h4, charSequence2.length(), z)) {
                    if (h4 != k2) {
                        h4 += p2;
                    } else {
                        return -1;
                    }
                }
                return h4;
            }
            return -1;
        }
    }

    static /* synthetic */ int X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        boolean z3;
        if ((i3 & 16) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        return W(charSequence, charSequence2, i, i2, z, z3);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return U(charSequence, c2, i, z);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return V(charSequence, str, i, z);
    }

    public static final int a0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int e;
        char Q;
        z65.h(charSequence, "<this>");
        z65.h(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            e = i.e(i, 0);
            q55 it = new IntRange(e, T(charSequence)).iterator();
            while (it.hasNext()) {
                int b2 = it.b();
                char charAt = charSequence.charAt(b2);
                for (char c2 : cArr) {
                    if (ow0.f(c2, charAt, z)) {
                        return b2;
                    }
                }
            }
            return -1;
        }
        Q = yr.Q(cArr);
        return ((String) charSequence).indexOf(Q, i);
    }

    public static final int b0(CharSequence charSequence, char c2, int i, boolean z) {
        z65.h(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        return f0(charSequence, new char[]{c2}, i, z);
    }

    public static final int c0(CharSequence charSequence, String str, int i, boolean z) {
        z65.h(charSequence, "<this>");
        z65.h(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return W(charSequence, str, i, 0, z, true);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = T(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b0(charSequence, c2, i, z);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = T(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c0(charSequence, str, i, z);
    }

    public static final int f0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int h;
        char Q;
        z65.h(charSequence, "<this>");
        z65.h(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (h = i.h(i, T(charSequence)); -1 < h; h--) {
                char charAt = charSequence.charAt(h);
                for (char c2 : cArr) {
                    if (ow0.f(c2, charAt, z)) {
                        return h;
                    }
                }
            }
            return -1;
        }
        Q = yr.Q(cArr);
        return ((String) charSequence).lastIndexOf(Q, i);
    }

    public static final Sequence<String> g0(CharSequence charSequence) {
        z65.h(charSequence, "<this>");
        return C0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> h0(CharSequence charSequence) {
        List<String> s;
        z65.h(charSequence, "<this>");
        s = dca.s(g0(charSequence));
        return s;
    }

    public static final CharSequence i0(CharSequence charSequence, int i, char c2) {
        z65.h(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            q55 it = new IntRange(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.b();
                sb.append(c2);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
    }

    public static String j0(String str, int i, char c2) {
        z65.h(str, "<this>");
        return i0(str, i, c2).toString();
    }

    private static final Sequence<IntRange> k0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        t0(i2);
        return new ku2(charSequence, i, i2, new a(cArr, z));
    }

    private static final Sequence<IntRange> l0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List c2;
        t0(i2);
        c2 = xr.c(strArr);
        return new ku2(charSequence, i, i2, new b(c2, z));
    }

    static /* synthetic */ Sequence m0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return k0(charSequence, cArr, i, z, i2);
    }

    static /* synthetic */ Sequence n0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return l0(charSequence, strArr, i, z, i2);
    }

    public static final boolean o0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        z65.h(charSequence, "<this>");
        z65.h(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ow0.f(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String p0(String str, CharSequence charSequence) {
        boolean E0;
        z65.h(str, "<this>");
        z65.h(charSequence, "prefix");
        E0 = E0(str, charSequence, false, 2, null);
        if (E0) {
            String substring = str.substring(charSequence.length());
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String q0(String str, CharSequence charSequence) {
        boolean Q;
        z65.h(str, "<this>");
        z65.h(charSequence, "suffix");
        Q = Q(str, charSequence, false, 2, null);
        if (Q) {
            String substring = str.substring(0, str.length() - charSequence.length());
            z65.g(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String r0(String str, CharSequence charSequence) {
        z65.h(str, "<this>");
        z65.h(charSequence, "delimiter");
        return s0(str, charSequence, charSequence);
    }

    public static final String s0(String str, CharSequence charSequence, CharSequence charSequence2) {
        boolean E0;
        boolean Q;
        z65.h(str, "<this>");
        z65.h(charSequence, "prefix");
        z65.h(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            E0 = E0(str, charSequence, false, 2, null);
            if (E0) {
                Q = Q(str, charSequence2, false, 2, null);
                if (Q) {
                    String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
                    z65.g(substring, "substring(...)");
                    return substring;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static final void t0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final List<String> u0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        Iterable<IntRange> g;
        int w;
        z65.h(charSequence, "<this>");
        z65.h(cArr, "delimiters");
        if (cArr.length != 1) {
            g = dca.g(m0(charSequence, cArr, 0, z, i, 2, null));
            w = lc1.w(g, 10);
            ArrayList arrayList = new ArrayList(w);
            for (IntRange intRange : g) {
                arrayList.add(F0(charSequence, intRange));
            }
            return arrayList;
        }
        return w0(charSequence, String.valueOf(cArr[0]), z, i);
    }

    public static final List<String> v0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        Iterable<IntRange> g;
        int w;
        z65.h(charSequence, "<this>");
        z65.h(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return w0(charSequence, str, z, i);
            }
        }
        g = dca.g(n0(charSequence, strArr, 0, z, i, 2, null));
        w = lc1.w(g, 10);
        ArrayList arrayList = new ArrayList(w);
        for (IntRange intRange : g) {
            arrayList.add(F0(charSequence, intRange));
        }
        return arrayList;
    }

    private static final List<String> w0(CharSequence charSequence, String str, boolean z, int i) {
        List<String> e;
        boolean z2;
        t0(i);
        int i2 = 0;
        int V = V(charSequence, str, 0, z);
        if (V == -1 || i == 1) {
            e = jc1.e(charSequence.toString());
            return e;
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = i.h(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, V).toString());
            i2 = str.length() + V;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            V = V(charSequence, str, i2, z);
        } while (V != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List x0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return u0(charSequence, cArr, z, i);
    }

    public static /* synthetic */ List y0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return v0(charSequence, strArr, z, i);
    }

    public static final Sequence<String> z0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        Sequence<String> q;
        z65.h(charSequence, "<this>");
        z65.h(cArr, "delimiters");
        q = dca.q(m0(charSequence, cArr, 0, z, i, 2, null), new d(charSequence));
        return q;
    }
}
