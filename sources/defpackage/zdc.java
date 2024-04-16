package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ji9;
import defpackage.kk9;
import defpackage.lk0;
import defpackage.zb7;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.MatchResult;
/* compiled from: -UtilCommon.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aI\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\nj\n\u0012\u0006\b\u0000\u0012\u00020\b`\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aE\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u001a\u0010\f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0\nj\n\u0012\u0006\b\u0000\u0012\u00020\b`\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0019\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0000\u001a \u0010\u001a\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u001b\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u001a&\u0010\u001d\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u001a&\u0010 \u001a\u00020\u0003*\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u001a\f\u0010!\u001a\u00020\u0003*\u00020\bH\u0000\u001a\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\bH\u0000\u001a\f\u0010$\u001a\u00020\u0003*\u00020\u001eH\u0000\u001a\u0015\u0010'\u001a\u00020\u0003*\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010)\u001a\u00020\u0003*\u00020(2\u0006\u0010&\u001a\u00020\u0003H\u0080\u0004\u001a\u0015\u0010+\u001a\u00020**\u00020\u00032\u0006\u0010&\u001a\u00020*H\u0080\u0004\u001a\u0014\u0010/\u001a\u00020.*\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0000\u001a\f\u00101\u001a\u00020\u0003*\u000200H\u0000\u001a\u0014\u00103\u001a\u00020\u0003*\u0002022\u0006\u0010'\u001a\u00020%H\u0000\u001a\u0016\u00104\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0003H\u0000\u001a\u0012\u00106\u001a\u00020**\u00020\b2\u0006\u00105\u001a\u00020*\u001a\u0016\u00107\u001a\u00020\u0003*\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020\u0003H\u0000\u001a\u000e\u0010:\u001a\u00020.*\u000608j\u0002`9\u001a\u0014\u0010>\u001a\u00020\u000f*\u00020;2\u0006\u0010=\u001a\u00020<H\u0000\u001a\u0014\u0010@\u001a\u00020.*\u00020;2\u0006\u0010?\u001a\u00020<H\u0000\u001a\u0014\u0010B\u001a\u00020.*\u00020;2\u0006\u0010A\u001a\u00020<H\u0000\u001a'\u0010E\u001a\u00020.\"\u0004\b\u0000\u00101*\b\u0012\u0004\u0012\u00028\u00000C2\u0006\u0010D\u001a\u00028\u0000H\u0000¢\u0006\u0004\bE\u0010F\u001a\"\u0010L\u001a\u00020K*\u00060Gj\u0002`H2\u0010\u0010J\u001a\f\u0012\b\u0012\u00060Gj\u0002`H0IH\u0000\u001a \u0010P\u001a\u00020.2\u0006\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020*2\u0006\u0010O\u001a\u00020*H\u0000\u001a0\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000I\"\u0004\b\u0000\u0010Q2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000R2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000RH\u0000\"\u0014\u0010V\u001a\u00020T8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010U\"\u001a\u0010[\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010X\u001a\u0004\bY\u0010Z\"\u0017\u0010`\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b)\u0010]\u001a\u0004\b^\u0010_\"\u0017\u0010e\u001a\u00020a8\u0006¢\u0006\f\n\u0004\b+\u0010b\u001a\u0004\bc\u0010d\"\u0017\u0010j\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bP\u0010g\u001a\u0004\bh\u0010i¨\u0006k"}, d2 = {"Lec9;", "", "input", "", "index", "Lkotlin/text/MatchResult;", "C", "", "", "other", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "z", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "", "q", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "value", "r", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "g", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "t", "v", "I", "delimiters", "k", "", "delimiter", "j", Image.TYPE_SMALL, Action.NAME_ATTRIBUTE, "B", "D", "", "mask", "b", "", c.a, "", DateTokenConverter.CONVERTER_KEY, "Leh0;", "medium", "", "L", "Lfh0;", "E", "Lyg0;", "F", "x", "defaultValue", "G", "H", "Ljava/io/Closeable;", "Lokio/Closeable;", "f", "Liu3;", "Lnr7;", Action.FILE_ATTRIBUTE, "A", "path", "i", "directory", Image.TYPE_HIGH, "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suppressed", "", "K", "arrayLength", "offset", "count", e.a, "T", "", "y", "", "[B", "EMPTY_BYTE_ARRAY", "Lzb7;", "Lzb7;", "p", "()Lzb7;", "UNICODE_BOMS", "Lgn4;", "Lgn4;", Image.TYPE_MEDIUM, "()Lgn4;", "commonEmptyHeaders", "Lji9;", "Lji9;", "n", "()Lji9;", "commonEmptyRequestBody", "Lkk9;", "Lkk9;", "o", "()Lkk9;", "commonEmptyResponse", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: zdc  reason: default package */
/* loaded from: classes3.dex */
public final class zdc {
    public static final byte[] a;
    private static final zb7 b;
    private static final gn4 c;
    private static final ji9 d;
    private static final kk9 e;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        zb7.a aVar = zb7.d;
        lk0.a aVar2 = lk0.d;
        b = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        c = gn4.b.a(new String[0]);
        d = ji9.a.q(ji9.Companion, bArr, null, 0, 0, 7, null);
        e = kk9.b.i(kk9.Companion, bArr, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A(defpackage.iu3 r4, defpackage.nr7 r5) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.z65.h(r4, r0)
            java.lang.String r0 = "file"
            defpackage.z65.h(r5, r0)
            zma r0 = r4.o(r5)
            r1 = 0
            r4.h(r5)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            if (r0 == 0) goto L17
            r0.close()     // Catch: java.lang.Throwable -> L17
        L17:
            r4 = 1
            return r4
        L19:
            r2 = move-exception
            goto L25
        L1b:
            kotlin.Unit r2 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L32
            r0.close()     // Catch: java.lang.Throwable -> L23
            goto L32
        L23:
            r1 = move-exception
            goto L32
        L25:
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            defpackage.ul3.a(r2, r0)
        L2f:
            r3 = r2
            r2 = r1
            r1 = r3
        L32:
            if (r1 != 0) goto L3c
            defpackage.z65.e(r2)
            r4.h(r5)
            r4 = 0
            return r4
        L3c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdc.A(iu3, nr7):boolean");
    }

    public static final boolean B(String str) {
        boolean v;
        boolean v2;
        boolean v3;
        boolean v4;
        z65.h(str, Action.NAME_ATTRIBUTE);
        v = l0b.v(str, "Authorization", true);
        if (!v) {
            v2 = l0b.v(str, "Cookie", true);
            if (!v2) {
                v3 = l0b.v(str, "Proxy-Authorization", true);
                if (!v3) {
                    v4 = l0b.v(str, "Set-Cookie", true);
                    if (v4) {
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

    public static final MatchResult C(ec9 ec9Var, CharSequence charSequence, int i) {
        z65.h(ec9Var, "<this>");
        z65.h(charSequence, "input");
        MatchResult b2 = ec9Var.b(charSequence, i);
        if (b2 == null || b2.b().h() != i) {
            return null;
        }
        return b2;
    }

    public static final int D(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        return -1;
    }

    public static final int E(fh0 fh0Var) throws IOException {
        z65.h(fh0Var, "<this>");
        return b(fh0Var.readByte(), 255) | (b(fh0Var.readByte(), 255) << 16) | (b(fh0Var.readByte(), 255) << 8);
    }

    public static final int F(yg0 yg0Var, byte b2) {
        z65.h(yg0Var, "<this>");
        int i = 0;
        while (!yg0Var.U0() && yg0Var.n(0L) == b2) {
            i++;
            yg0Var.readByte();
        }
        return i;
    }

    public static final long G(String str, long j) {
        z65.h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int H(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String I(String str, int i, int i2) {
        z65.h(str, "<this>");
        int t = t(str, i, i2);
        String substring = str.substring(t, v(str, t, i2));
        z65.g(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String J(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return I(str, i, i2);
    }

    public static final Throwable K(Exception exc, List<? extends Exception> list) {
        z65.h(exc, "<this>");
        z65.h(list, "suppressed");
        for (Exception exc2 : list) {
            vl3.a(exc, exc2);
        }
        return exc;
    }

    public static final void L(eh0 eh0Var, int i) throws IOException {
        z65.h(eh0Var, "<this>");
        eh0Var.V0((i >>> 16) & 255);
        eh0Var.V0((i >>> 8) & 255);
        eh0Var.V0(i & 255);
    }

    public static final <E> void a(List<E> list, E e2) {
        z65.h(list, "<this>");
        if (!list.contains(e2)) {
            list.add(e2);
        }
    }

    public static final int b(byte b2, int i) {
        return b2 & i;
    }

    public static final int c(short s, int i) {
        return s & i;
    }

    public static final long d(int i, long j) {
        return i & j;
    }

    public static final void e(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j + ", offset=" + j2 + ", count=" + j2);
    }

    public static final void f(Closeable closeable) {
        z65.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String[] strArr, String str) {
        int F;
        z65.h(strArr, "<this>");
        z65.h(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        z65.g(copyOf, "copyOf(...)");
        String[] strArr2 = (String[]) copyOf;
        F = yr.F(strArr2);
        strArr2[F] = str;
        return strArr2;
    }

    public static final void h(iu3 iu3Var, nr7 nr7Var) {
        z65.h(iu3Var, "<this>");
        z65.h(nr7Var, "directory");
        try {
            IOException iOException = null;
            for (nr7 nr7Var2 : iu3Var.k(nr7Var)) {
                try {
                    if (iu3Var.l(nr7Var2).f()) {
                        h(iu3Var, nr7Var2);
                    }
                    iu3Var.h(nr7Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(iu3 iu3Var, nr7 nr7Var) {
        z65.h(iu3Var, "<this>");
        z65.h(nr7Var, "path");
        try {
            iu3Var.h(nr7Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(String str, char c2, int i, int i2) {
        z65.h(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int k(String str, String str2, int i, int i2) {
        boolean N;
        z65.h(str, "<this>");
        z65.h(str2, "delimiters");
        while (i < i2) {
            N = m0b.N(str2, str.charAt(i), false, 2, null);
            if (N) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int l(String str, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return j(str, c2, i, i2);
    }

    public static final gn4 m() {
        return c;
    }

    public static final ji9 n() {
        return d;
    }

    public static final kk9 o() {
        return e;
    }

    public static final zb7 p() {
        return b;
    }

    public static final boolean q(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        z65.h(strArr, "<this>");
        z65.h(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a2 = jr.a(strArr2);
                while (a2.hasNext()) {
                    if (comparator.compare(str, (String) a2.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int r(String[] strArr, String str, Comparator<String> comparator) {
        z65.h(strArr, "<this>");
        z65.h(str, "value");
        z65.h(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int s(String str) {
        z65.h(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (z65.j(charAt, 31) <= 0 || z65.j(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int t(String str, int i, int i2) {
        z65.h(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i++;
            } else {
                return i;
            }
        }
        return i2;
    }

    public static /* synthetic */ int u(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return t(str, i, i2);
    }

    public static final int v(String str, int i, int i2) {
        z65.h(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int w(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return v(str, i, i2);
    }

    public static final int x(String str, int i) {
        z65.h(str, "<this>");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final <T> List<T> y(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List c2;
        List<T> a2;
        z65.h(iterable, "a");
        z65.h(iterable2, "b");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends T> it2 = iterable2.iterator();
        c2 = jc1.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                a2 = jc1.a(c2);
                return a2;
            }
            if (it.hasNext()) {
                c2.add(it.next());
            }
            if (it2.hasNext()) {
                c2.add(it2.next());
            }
        }
    }

    public static final String[] z(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        z65.h(strArr, "<this>");
        z65.h(strArr2, "other");
        z65.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
