package defpackage;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.sq4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import kotlin.ranges.i;
/* compiled from: -HttpUrlCommon.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0010\u0019\n\u0002\b\u0016\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bl\u0010mJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002J'\u0010\u000e\u001a\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002J\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0006J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0014*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002J\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\n\u0010\u001a\u001a\u00020\u0004*\u00020\u0006J\n\u0010\u001b\u001a\u00020\u0002*\u00020\u0006J\u0012\u0010\u001c\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u001e\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0002J\u0012\u0010 \u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0002J\u0012\u0010\"\u001a\u00020\u0014*\u00020\u00142\u0006\u0010!\u001a\u00020\u0002J1\u0010&\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0018H\u0000¢\u0006\u0004\b&\u0010'J\u0012\u0010)\u001a\u00020\u0014*\u00020\u00142\u0006\u0010(\u001a\u00020\u0004J\u0014\u0010+\u001a\u00020\u0014*\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010\u0002J\u0014\u0010-\u001a\u00020\u0014*\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010\u0002J\u001c\u0010/\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0002J\u001c\u00102\u001a\u00020\u0014*\u00020\u00142\u0006\u00100\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0002J\u0014\u00104\u001a\u00020\u0014*\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\u0002J;\u00108\u001a\u00020\r*\u00020\u00142\u0006\u00105\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0018H\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u0018*\u00020\u00142\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020\u0018*\u00020\u00142\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\b<\u0010;J\u0013\u0010=\u001a\u00020\r*\u00020\u0014H\u0000¢\u0006\u0004\b=\u0010>J+\u0010@\u001a\u00020\r*\u00020\u00142\u0006\u00105\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020B*\u00020\u0002H\u0000¢\u0006\u0004\bC\u0010DJ\n\u0010E\u001a\u00020\u0006*\u00020\u0014J\u0013\u0010F\u001a\u00020\u0004*\u00020\u0014H\u0000¢\u0006\u0004\bF\u0010GJ\u0013\u0010H\u001a\u00020\u0002*\u00020\u0014H\u0000¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0000¢\u0006\u0004\bJ\u0010\u000fJ%\u0010L\u001a\u00020\u0014*\u00020\u00142\b\u0010K\u001a\u0004\u0018\u00010\u00062\u0006\u00105\u001a\u00020\u0002H\u0000¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\bN\u0010OJ#\u0010P\u001a\u00020\u0004*\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\bP\u0010OJ'\u0010Q\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\bQ\u0010OJ'\u0010R\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\bR\u0010OJ#\u0010S\u001a\u00020\u0018*\u00020\u00022\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020\u0006*\u00020\u0002H\u0000¢\u0006\u0004\bU\u0010VJ\u0015\u0010W\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0000¢\u0006\u0004\bW\u0010VR\u001a\u0010\\\u001a\u00020X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010Y\u001a\u0004\bZ\u0010[R\u0015\u0010^\u001a\u00020\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b]\u0010\u0011R\u0015\u0010`\u001a\u00020\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b_\u0010\u0011R\u0015\u0010b\u001a\u00020\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\ba\u0010\u0011R\u001b\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0017\u0010g\u001a\u0004\u0018\u00010\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010\u0011R\u0017\u0010i\u001a\u0004\u0018\u00010\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010\u0011R\u0017\u0010k\u001a\u0004\u0018\u00010\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bj\u0010\u0011¨\u0006n"}, d2 = {"Lvj1;", "", "", "scheme", "", DateTokenConverter.CONVERTER_KEY, "Lsq4;", Action.NAME_ATTRIBUTE, "p", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "", "V", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "q", "(Lsq4;)Ljava/lang/String;", ElementGenerator.TYPE_LINK, "r", "Lsq4$a;", "j", "k", "other", "", "f", Image.TYPE_HIGH, "v", Image.TYPE_SMALL, "username", "x", "password", Image.TYPE_MEDIUM, "host", "i", "pos", "limit", "plusIsSpace", "L", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "port", "n", SearchIntents.EXTRA_QUERY, "o", "encodedQuery", e.a, "value", "b", "encodedName", "encodedValue", "a", "fragment", "g", "input", "addTrailingSlash", "alreadyEncoded", "P", "(Lsq4$a;Ljava/lang/String;IIZZ)V", "H", "(Lsq4$a;Ljava/lang/String;)Z", "I", "N", "(Lsq4$a;)V", "startPos", "Q", "(Lsq4$a;Ljava/lang/String;II)V", "", "U", "(Ljava/lang/String;)Ljava/util/List;", c.a, "y", "(Lsq4$a;)I", "w", "(Lsq4$a;)Ljava/lang/String;", "T", "base", "l", "(Lsq4$a;Lsq4;Ljava/lang/String;)Lsq4$a;", "R", "(Ljava/lang/String;II)I", "S", "O", "K", "J", "(Ljava/lang/String;II)Z", "t", "(Ljava/lang/String;)Lsq4;", "u", "", "[C", "G", "()[C", "HEX_DIGITS", "E", "commonEncodedUsername", "A", "commonEncodedPassword", "B", "commonEncodedPath", "C", "(Lsq4;)Ljava/util/List;", "commonEncodedPathSegments", "D", "commonEncodedQuery", "F", "commonQuery", "z", "commonEncodedFragment", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: vj1  reason: default package */
/* loaded from: classes3.dex */
public final class vj1 {
    public static final vj1 a = new vj1();
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private vj1() {
    }

    public static /* synthetic */ String M(vj1 vj1Var, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return vj1Var.L(str, i, i2, z);
    }

    public static final int d(String str) {
        z65.h(str, "scheme");
        if (z65.c(str, "http")) {
            return 80;
        }
        if (z65.c(str, "https")) {
            return 443;
        }
        return -1;
    }

    public final String A(sq4 sq4Var) {
        int Y;
        int Y2;
        z65.h(sq4Var, "<this>");
        if (sq4Var.p().length() != 0) {
            Y = m0b.Y(sq4Var.j(), CoreConstants.COLON_CHAR, sq4Var.w().length() + 3, false, 4, null);
            Y2 = m0b.Y(sq4Var.j(), '@', 0, false, 6, null);
            String substring = sq4Var.j().substring(Y + 1, Y2);
            z65.g(substring, "substring(...)");
            return substring;
        }
        return "";
    }

    public final String B(sq4 sq4Var) {
        int Y;
        z65.h(sq4Var, "<this>");
        Y = m0b.Y(sq4Var.j(), '/', sq4Var.w().length() + 3, false, 4, null);
        String substring = sq4Var.j().substring(Y, zdc.k(sq4Var.j(), "?#", Y, sq4Var.j().length()));
        z65.g(substring, "substring(...)");
        return substring;
    }

    public final List<String> C(sq4 sq4Var) {
        int Y;
        z65.h(sq4Var, "<this>");
        Y = m0b.Y(sq4Var.j(), '/', sq4Var.w().length() + 3, false, 4, null);
        int k = zdc.k(sq4Var.j(), "?#", Y, sq4Var.j().length());
        ArrayList arrayList = new ArrayList();
        while (Y < k) {
            int i = Y + 1;
            int j = zdc.j(sq4Var.j(), '/', i, k);
            String substring = sq4Var.j().substring(i, j);
            z65.g(substring, "substring(...)");
            arrayList.add(substring);
            Y = j;
        }
        return arrayList;
    }

    public final String D(sq4 sq4Var) {
        int Y;
        z65.h(sq4Var, "<this>");
        if (sq4Var.i() != null) {
            Y = m0b.Y(sq4Var.j(), '?', 0, false, 6, null);
            int i = Y + 1;
            String substring = sq4Var.j().substring(i, zdc.j(sq4Var.j(), '#', i, sq4Var.j().length()));
            z65.g(substring, "substring(...)");
            return substring;
        }
        return null;
    }

    public final String E(sq4 sq4Var) {
        z65.h(sq4Var, "<this>");
        if (sq4Var.z().length() == 0) {
            return "";
        }
        int length = sq4Var.w().length() + 3;
        String substring = sq4Var.j().substring(length, zdc.k(sq4Var.j(), ":@", length, sq4Var.j().length()));
        z65.g(substring, "substring(...)");
        return substring;
    }

    public final String F(sq4 sq4Var) {
        z65.h(sq4Var, "<this>");
        if (sq4Var.i() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        V(sq4Var.i(), sb);
        return sb.toString();
    }

    public final char[] G() {
        return b;
    }

    public final boolean H(sq4.a aVar, String str) {
        boolean v;
        z65.h(aVar, "<this>");
        z65.h(str, "input");
        if (!z65.c(str, ".")) {
            v = l0b.v(str, "%2e", true);
            if (v) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean I(sq4.a aVar, String str) {
        boolean v;
        boolean v2;
        boolean v3;
        z65.h(aVar, "<this>");
        z65.h(str, "input");
        if (!z65.c(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
            v = l0b.v(str, "%2e.", true);
            if (!v) {
                v2 = l0b.v(str, ".%2e", true);
                if (!v2) {
                    v3 = l0b.v(str, "%2e%2e", true);
                    if (v3) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean J(String str, int i, int i2) {
        z65.h(str, "<this>");
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && zdc.D(str.charAt(i + 1)) != -1 && zdc.D(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    public final int K(String str, int i, int i2) {
        z65.h(str, "input");
        try {
            int parseInt = Integer.parseInt(tq4.b(tq4.a, str, i, i2, "", false, false, false, false, 120, null));
            if (1 > parseInt || parseInt >= 65536) {
                return -1;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String L(String str, int i, int i2, boolean z) {
        z65.h(str, "<this>");
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                yg0 yg0Var = new yg0();
                yg0Var.k0(str, i, i3);
                tq4.a.c(yg0Var, str, i3, i2, z);
                return yg0Var.L();
            }
        }
        String substring = str.substring(i, i2);
        z65.g(substring, "substring(...)");
        return substring;
    }

    public final void N(sq4.a aVar) {
        z65.h(aVar, "<this>");
        if (aVar.h().remove(aVar.h().size() - 1).length() == 0 && (!aVar.h().isEmpty())) {
            aVar.h().set(aVar.h().size() - 1, "");
        } else {
            aVar.h().add("");
        }
    }

    public final int O(String str, int i, int i2) {
        z65.h(str, "input");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == '[') {
                do {
                    i++;
                    if (i < i2) {
                    }
                } while (str.charAt(i) != ']');
            } else if (charAt == ':') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public final void P(sq4.a aVar, String str, int i, int i2, boolean z, boolean z2) {
        z65.h(aVar, "<this>");
        z65.h(str, "input");
        String b2 = tq4.b(tq4.a, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, 112, null);
        if (H(aVar, b2)) {
            return;
        }
        if (I(aVar, b2)) {
            N(aVar);
            return;
        }
        if (aVar.h().get(aVar.h().size() - 1).length() == 0) {
            aVar.h().set(aVar.h().size() - 1, b2);
        } else {
            aVar.h().add(b2);
        }
        if (z) {
            aVar.h().add("");
        }
    }

    public final void Q(sq4.a aVar, String str, int i, int i2) {
        boolean z;
        z65.h(aVar, "<this>");
        z65.h(str, "input");
        if (i == i2) {
            return;
        }
        char charAt = str.charAt(i);
        if (charAt != '/' && charAt != '\\') {
            aVar.h().set(aVar.h().size() - 1, "");
        } else {
            aVar.h().clear();
            aVar.h().add("");
            i++;
        }
        while (true) {
            int i3 = i;
            while (i3 < i2) {
                i = zdc.k(str, "/\\", i3, i2);
                if (i < i2) {
                    z = true;
                } else {
                    z = false;
                }
                P(aVar, str, i3, i, z, true);
                if (z) {
                    i3 = i + 1;
                }
            }
            return;
        }
    }

    public final int R(String str, int i, int i2) {
        z65.h(str, "input");
        if (i2 - i < 2) {
            return -1;
        }
        char charAt = str.charAt(i);
        if ((z65.j(charAt, 97) < 0 || z65.j(charAt, 122) > 0) && (z65.j(charAt, 65) < 0 || z65.j(charAt, 90) > 0)) {
            return -1;
        }
        while (true) {
            i++;
            if (i >= i2) {
                return -1;
            }
            char charAt2 = str.charAt(i);
            if ('a' > charAt2 || charAt2 >= '{') {
                if ('A' > charAt2 || charAt2 >= '[') {
                    if ('0' > charAt2 || charAt2 >= ':') {
                        if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                            if (charAt2 != ':') {
                                return -1;
                            }
                            return i;
                        }
                    }
                }
            }
        }
    }

    public final int S(String str, int i, int i2) {
        z65.h(str, "<this>");
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            i3++;
            i++;
        }
        return i3;
    }

    public final void T(List<String> list, StringBuilder sb) {
        z65.h(list, "<this>");
        z65.h(sb, "out");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> U(String str) {
        int Y;
        int Y2;
        z65.h(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            Y = m0b.Y(str, '&', i, false, 4, null);
            if (Y == -1) {
                Y = str.length();
            }
            int i2 = Y;
            Y2 = m0b.Y(str, '=', i, false, 4, null);
            if (Y2 != -1 && Y2 <= i2) {
                String substring = str.substring(i, Y2);
                z65.g(substring, "substring(...)");
                arrayList.add(substring);
                String substring2 = str.substring(Y2 + 1, i2);
                z65.g(substring2, "substring(...)");
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i, i2);
                z65.g(substring3, "substring(...)");
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i = i2 + 1;
        }
        return arrayList;
    }

    public final void V(List<String> list, StringBuilder sb) {
        IntRange q;
        d p;
        z65.h(list, "<this>");
        z65.h(sb, "out");
        q = i.q(0, list.size());
        p = i.p(q, 2);
        int h = p.h();
        int k = p.k();
        int p2 = p.p();
        if ((p2 <= 0 || h > k) && (p2 >= 0 || k > h)) {
            return;
        }
        while (true) {
            String str = list.get(h);
            String str2 = list.get(h + 1);
            if (h > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (h != k) {
                h += p2;
            } else {
                return;
            }
        }
    }

    public final sq4.a a(sq4.a aVar, String str, String str2) {
        String str3;
        z65.h(aVar, "<this>");
        z65.h(str, "encodedName");
        if (aVar.i() == null) {
            aVar.w(new ArrayList());
        }
        List<String> i = aVar.i();
        z65.e(i);
        tq4 tq4Var = tq4.a;
        i.add(tq4.b(tq4Var, str, 0, 0, " \"'<>#&=", true, false, true, false, 83, null));
        List<String> i2 = aVar.i();
        z65.e(i2);
        if (str2 != null) {
            str3 = tq4.b(tq4Var, str2, 0, 0, " \"'<>#&=", true, false, true, false, 83, null);
        } else {
            str3 = null;
        }
        i2.add(str3);
        return aVar;
    }

    public final sq4.a b(sq4.a aVar, String str, String str2) {
        String str3;
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        if (aVar.i() == null) {
            aVar.w(new ArrayList());
        }
        List<String> i = aVar.i();
        z65.e(i);
        tq4 tq4Var = tq4.a;
        i.add(tq4.b(tq4Var, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
        List<String> i2 = aVar.i();
        z65.e(i2);
        if (str2 != null) {
            str3 = tq4.b(tq4Var, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null);
        } else {
            str3 = null;
        }
        i2.add(str3);
        return aVar;
    }

    public final sq4 c(sq4.a aVar) {
        int w;
        ArrayList arrayList;
        int w2;
        String str;
        z65.h(aVar, "<this>");
        String m = aVar.m();
        if (m != null) {
            String M = M(this, aVar.j(), 0, 0, false, 7, null);
            String M2 = M(this, aVar.g(), 0, 0, false, 7, null);
            String k = aVar.k();
            if (k != null) {
                int y = y(aVar);
                List<String> h = aVar.h();
                w = lc1.w(h, 10);
                ArrayList arrayList2 = new ArrayList(w);
                for (String str2 : h) {
                    arrayList2.add(M(a, str2, 0, 0, false, 7, null));
                }
                List<String> i = aVar.i();
                String str3 = null;
                if (i != null) {
                    List<String> list = i;
                    w2 = lc1.w(list, 10);
                    ArrayList arrayList3 = new ArrayList(w2);
                    for (String str4 : list) {
                        if (str4 != null) {
                            str = M(a, str4, 0, 0, true, 3, null);
                        } else {
                            str = null;
                        }
                        arrayList3.add(str);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                String f = aVar.f();
                if (f != null) {
                    str3 = M(this, f, 0, 0, false, 7, null);
                }
                return new sq4(m, M, M2, k, y, arrayList2, arrayList, str3, aVar.toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final sq4.a e(sq4.a aVar, String str) {
        List<String> list;
        String b2;
        z65.h(aVar, "<this>");
        if (str != null && (b2 = tq4.b(tq4.a, str, 0, 0, " \"'<>#", true, false, true, false, 83, null)) != null) {
            list = a.U(b2);
        } else {
            list = null;
        }
        aVar.w(list);
        return aVar;
    }

    public final boolean f(sq4 sq4Var, Object obj) {
        z65.h(sq4Var, "<this>");
        if ((obj instanceof sq4) && z65.c(((sq4) obj).j(), sq4Var.j())) {
            return true;
        }
        return false;
    }

    public final sq4.a g(sq4.a aVar, String str) {
        String str2;
        z65.h(aVar, "<this>");
        if (str != null) {
            str2 = tq4.b(tq4.a, str, 0, 0, "", false, false, false, true, 59, null);
        } else {
            str2 = null;
        }
        aVar.u(str2);
        return aVar;
    }

    public final int h(sq4 sq4Var) {
        z65.h(sq4Var, "<this>");
        return sq4Var.j().hashCode();
    }

    public final sq4.a i(sq4.a aVar, String str) {
        z65.h(aVar, "<this>");
        z65.h(str, "host");
        String k = rdc.k(M(a, str, 0, 0, false, 7, null));
        if (k != null) {
            aVar.y(k);
            return aVar;
        }
        throw new IllegalArgumentException("unexpected host: " + str);
    }

    public final sq4.a j(sq4 sq4Var) {
        int i;
        z65.h(sq4Var, "<this>");
        sq4.a aVar = new sq4.a();
        aVar.A(sq4Var.w());
        aVar.x(sq4Var.f());
        aVar.v(sq4Var.b());
        aVar.y(sq4Var.k());
        if (sq4Var.r() != d(sq4Var.w())) {
            i = sq4Var.r();
        } else {
            i = -1;
        }
        aVar.z(i);
        aVar.h().clear();
        aVar.h().addAll(sq4Var.d());
        aVar.d(sq4Var.e());
        aVar.u(sq4Var.a());
        return aVar;
    }

    public final sq4.a k(sq4 sq4Var, String str) {
        z65.h(sq4Var, "<this>");
        z65.h(str, ElementGenerator.TYPE_LINK);
        try {
            return new sq4.a().o(sq4Var, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final sq4.a l(sq4.a aVar, sq4 sq4Var, String str) {
        String str2;
        String Z0;
        int k;
        int i;
        String str3;
        int i2;
        String str4;
        boolean z;
        int i3;
        String str5;
        char c;
        boolean G;
        boolean G2;
        z65.h(aVar, "<this>");
        z65.h(str, "input");
        boolean z2 = false;
        int u = zdc.u(str, 0, 0, 3, null);
        int w = zdc.w(str, u, 0, 2, null);
        int R = R(str, u, w);
        char c2 = 65535;
        if (R != -1) {
            G = l0b.G(str, "https:", u, true);
            if (!G) {
                G2 = l0b.G(str, "http:", u, true);
                if (G2) {
                    aVar.A("http");
                    u += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, R);
                    z65.g(substring, "substring(...)");
                    sb.append(substring);
                    sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                aVar.A("https");
                u += 6;
            }
        } else if (sq4Var != null) {
            aVar.A(sq4Var.w());
        } else {
            if (str.length() > 6) {
                StringBuilder sb2 = new StringBuilder();
                Z0 = o0b.Z0(str, 6);
                sb2.append(Z0);
                sb2.append("...");
                str2 = sb2.toString();
            } else {
                str2 = str;
            }
            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
        }
        int S = S(str, u, w);
        char c3 = '?';
        char c4 = '#';
        if (S < 2 && sq4Var != null && z65.c(sq4Var.w(), aVar.m())) {
            aVar.x(sq4Var.f());
            aVar.v(sq4Var.b());
            aVar.y(sq4Var.k());
            aVar.z(sq4Var.r());
            aVar.h().clear();
            aVar.h().addAll(sq4Var.d());
            if (u == w || str.charAt(u) == '#') {
                aVar.d(sq4Var.e());
            }
            i2 = w;
            str4 = str;
        } else {
            int i4 = u + S;
            boolean z3 = false;
            while (true) {
                k = zdc.k(str, "@/\\?#", i4, w);
                char charAt = k != w ? str.charAt(k) : (char) 65535;
                if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                    break;
                } else if (charAt == '@') {
                    if (!z2) {
                        int j = zdc.j(str, CoreConstants.COLON_CHAR, i4, k);
                        tq4 tq4Var = tq4.a;
                        String b2 = tq4.b(tq4Var, str, i4, j, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                        if (z3) {
                            b2 = aVar.j() + "%40" + b2;
                        }
                        aVar.x(b2);
                        if (j != k) {
                            aVar.v(tq4.b(tq4Var, str, j + 1, k, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            z = true;
                        } else {
                            z = z2;
                        }
                        z2 = z;
                        z3 = true;
                    } else {
                        aVar.v(aVar.g() + "%40" + tq4.b(tq4.a, str, i4, k, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                    }
                    i4 = k + 1;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
            }
            int O = O(str, i4, k);
            int i5 = O + 1;
            if (i5 < k) {
                i = k;
                i2 = w;
                str4 = str;
                aVar.y(rdc.k(M(this, str, i4, O, false, 4, null)));
                aVar.z(K(str4, i5, i));
                if (aVar.l() == -1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid URL port: \"");
                    String substring2 = str4.substring(i5, i);
                    z65.g(substring2, "substring(...)");
                    sb3.append(substring2);
                    sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                str3 = "substring(...)";
            } else {
                i = k;
                str3 = "substring(...)";
                i2 = w;
                str4 = str;
                aVar.y(rdc.k(M(this, str, i4, O, false, 4, null)));
                sq4.b bVar = sq4.j;
                String m = aVar.m();
                z65.e(m);
                aVar.z(bVar.a(m));
            }
            if (aVar.k() == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Invalid URL host: \"");
                String substring3 = str4.substring(i4, O);
                z65.g(substring3, str3);
                sb4.append(substring3);
                sb4.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            u = i;
        }
        int k2 = zdc.k(str4, "?#", u, i2);
        Q(aVar, str4, u, k2);
        if (k2 >= i2 || str4.charAt(k2) != '?') {
            i3 = i2;
            str5 = str4;
            c = '#';
        } else {
            c = '#';
            int j2 = zdc.j(str4, '#', k2, i2);
            i3 = i2;
            str5 = str4;
            aVar.w(U(tq4.b(tq4.a, str, k2 + 1, j2, " \"'<>#", true, false, true, false, 80, null)));
            k2 = j2;
        }
        if (k2 < i3 && str5.charAt(k2) == c) {
            aVar.u(tq4.b(tq4.a, str, k2 + 1, i3, "", true, false, false, true, 48, null));
        }
        return aVar;
    }

    public final sq4.a m(sq4.a aVar, String str) {
        z65.h(aVar, "<this>");
        z65.h(str, "password");
        aVar.v(tq4.b(tq4.a, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null));
        return aVar;
    }

    public final sq4.a n(sq4.a aVar, int i) {
        z65.h(aVar, "<this>");
        if (1 <= i && i < 65536) {
            aVar.z(i);
            return aVar;
        }
        throw new IllegalArgumentException(("unexpected port: " + i).toString());
    }

    public final sq4.a o(sq4.a aVar, String str) {
        List<String> list;
        String b2;
        z65.h(aVar, "<this>");
        if (str != null && (b2 = tq4.b(tq4.a, str, 0, 0, " \"'<>#", false, false, true, false, 91, null)) != null) {
            list = a.U(b2);
        } else {
            list = null;
        }
        aVar.w(list);
        return aVar;
    }

    public final String p(sq4 sq4Var, String str) {
        IntRange q;
        d p;
        z65.h(sq4Var, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        if (sq4Var.i() != null) {
            q = i.q(0, sq4Var.i().size());
            p = i.p(q, 2);
            int h = p.h();
            int k = p.k();
            int p2 = p.p();
            if ((p2 > 0 && h <= k) || (p2 < 0 && k <= h)) {
                while (!z65.c(str, sq4Var.i().get(h))) {
                    if (h != k) {
                        h += p2;
                    }
                }
                return sq4Var.i().get(h + 1);
            }
            return null;
        }
        return null;
    }

    public final String q(sq4 sq4Var) {
        z65.h(sq4Var, "<this>");
        sq4.a n = sq4Var.n("/...");
        z65.e(n);
        return n.B("").p("").c().toString();
    }

    public final sq4 r(sq4 sq4Var, String str) {
        z65.h(sq4Var, "<this>");
        z65.h(str, ElementGenerator.TYPE_LINK);
        sq4.a n = sq4Var.n(str);
        if (n != null) {
            return n.c();
        }
        return null;
    }

    public final sq4.a s(sq4.a aVar, String str) {
        boolean v;
        boolean v2;
        z65.h(aVar, "<this>");
        z65.h(str, "scheme");
        v = l0b.v(str, "http", true);
        if (!v) {
            v2 = l0b.v(str, "https", true);
            if (v2) {
                aVar.A("https");
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
        } else {
            aVar.A("http");
        }
        return aVar;
    }

    public final sq4 t(String str) {
        z65.h(str, "<this>");
        return new sq4.a().o(null, str).c();
    }

    public final sq4 u(String str) {
        z65.h(str, "<this>");
        try {
            return t(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String v(sq4 sq4Var) {
        z65.h(sq4Var, "<this>");
        return sq4Var.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
        if (r1 != r3.a(r4)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String w(defpackage.sq4.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.m()
            if (r1 == 0) goto L1d
            java.lang.String r1 = r7.m()
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L22
        L1d:
            java.lang.String r1 = "//"
            r0.append(r1)
        L22:
            java.lang.String r1 = r7.j()
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L2f
            goto L39
        L2f:
            java.lang.String r1 = r7.g()
            int r1 = r1.length()
            if (r1 <= 0) goto L59
        L39:
            java.lang.String r1 = r7.j()
            r0.append(r1)
            java.lang.String r1 = r7.g()
            int r1 = r1.length()
            if (r1 <= 0) goto L54
            r0.append(r2)
            java.lang.String r1 = r7.g()
            r0.append(r1)
        L54:
            r1 = 64
            r0.append(r1)
        L59:
            java.lang.String r1 = r7.k()
            if (r1 == 0) goto L88
            java.lang.String r1 = r7.k()
            defpackage.z65.e(r1)
            r3 = 2
            r4 = 0
            r5 = 0
            boolean r1 = defpackage.c0b.N(r1, r2, r5, r3, r4)
            if (r1 == 0) goto L81
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r7.k()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L88
        L81:
            java.lang.String r1 = r7.k()
            r0.append(r1)
        L88:
            int r1 = r7.l()
            r3 = -1
            if (r1 != r3) goto L95
            java.lang.String r1 = r7.m()
            if (r1 == 0) goto Lb6
        L95:
            vj1 r1 = defpackage.vj1.a
            int r1 = r1.y(r7)
            java.lang.String r3 = r7.m()
            if (r3 == 0) goto Lb0
            sq4$b r3 = defpackage.sq4.j
            java.lang.String r4 = r7.m()
            defpackage.z65.e(r4)
            int r3 = r3.a(r4)
            if (r1 == r3) goto Lb6
        Lb0:
            r0.append(r2)
            r0.append(r1)
        Lb6:
            vj1 r1 = defpackage.vj1.a
            java.util.List r2 = r7.h()
            r1.T(r2, r0)
            java.util.List r2 = r7.i()
            if (r2 == 0) goto Ld4
            r2 = 63
            r0.append(r2)
            java.util.List r2 = r7.i()
            defpackage.z65.e(r2)
            r1.V(r2, r0)
        Ld4:
            java.lang.String r1 = r7.f()
            if (r1 == 0) goto Le6
            r1 = 35
            r0.append(r1)
            java.lang.String r7 = r7.f()
            r0.append(r7)
        Le6:
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "toString(...)"
            defpackage.z65.g(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj1.w(sq4$a):java.lang.String");
    }

    public final sq4.a x(sq4.a aVar, String str) {
        z65.h(aVar, "<this>");
        z65.h(str, "username");
        aVar.x(tq4.b(tq4.a, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null));
        return aVar;
    }

    public final int y(sq4.a aVar) {
        z65.h(aVar, "<this>");
        if (aVar.l() != -1) {
            return aVar.l();
        }
        sq4.b bVar = sq4.j;
        String m = aVar.m();
        z65.e(m);
        return bVar.a(m);
    }

    public final String z(sq4 sq4Var) {
        int Y;
        z65.h(sq4Var, "<this>");
        if (sq4Var.g() != null) {
            Y = m0b.Y(sq4Var.j(), '#', 0, false, 6, null);
            String substring = sq4Var.j().substring(Y + 1);
            z65.g(substring, "substring(...)");
            return substring;
        }
        return null;
    }
}
