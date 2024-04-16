package defpackage;

import com.huawei.hms.opendevice.c;
import java.nio.charset.Charset;
import kotlin.Metadata;
import org.slf4j.Marker;
/* compiled from: -HttpUrlJvm.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0011\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012Jc\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lid5;", "", "Lyg0;", "", "input", "", "pos", "limit", "encodeSet", "", "alreadyEncoded", "strict", "plusIsSpace", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "", c.a, "(Lyg0;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: id5 */
/* loaded from: classes3.dex */
public final class id5 {
    public static final id5 a = new id5();

    private id5() {
    }

    public static /* synthetic */ String b(id5 id5Var, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Charset charset2;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = str.length();
        } else {
            i5 = i2;
        }
        if ((i3 & 8) != 0) {
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i3 & 16) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i3 & 32) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i3 & 64) != 0) {
            z8 = false;
        } else {
            z8 = z4;
        }
        if ((i3 & 128) != 0) {
            charset2 = null;
        } else {
            charset2 = charset;
        }
        return id5Var.a(str, i4, i5, str2, z5, z6, z7, z8, charset2);
    }

    public final String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        boolean N;
        z65.h(str, "<this>");
        z65.h(str2, "encodeSet");
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                N = m0b.N(str2, (char) codePointAt, false, 2, null);
                if (!N && ((codePointAt != 37 || (z && (!z2 || vj1.a.J(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            yg0 yg0Var = new yg0();
            yg0Var.k0(str, i, i3);
            c(yg0Var, str, i3, i2, str2, z, z2, z3, z4, charset);
            return yg0Var.L();
        }
        String substring = str.substring(i, i2);
        z65.g(substring, "substring(...)");
        return substring;
    }

    public final void c(yg0 yg0Var, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        boolean N;
        z65.h(yg0Var, "<this>");
        z65.h(str, "input");
        z65.h(str2, "encodeSet");
        int i3 = i;
        yg0 yg0Var2 = null;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                String str3 = Marker.ANY_NON_NULL_MARKER;
                if (codePointAt == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    yg0Var.a0(Marker.ANY_NON_NULL_MARKER);
                } else if (codePointAt == 43 && z3) {
                    if (!z) {
                        str3 = "%2B";
                    }
                    yg0Var.a0(str3);
                } else {
                    if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                        N = m0b.N(str2, (char) codePointAt, false, 2, null);
                        if (!N && (codePointAt != 37 || (z && (!z2 || vj1.a.J(str, i3, i2))))) {
                            yg0Var.G(codePointAt);
                        }
                    }
                    if (yg0Var2 == null) {
                        yg0Var2 = new yg0();
                    }
                    if (charset != null && !z65.c(charset, rw0.b)) {
                        yg0Var2.E0(str, i3, Character.charCount(codePointAt) + i3, charset);
                    } else {
                        yg0Var2.G(codePointAt);
                    }
                    while (!yg0Var2.U0()) {
                        byte readByte = yg0Var2.readByte();
                        yg0Var.V0(37);
                        vj1 vj1Var = vj1.a;
                        yg0Var.V0(vj1Var.G()[((readByte & 255) >> 4) & 15]);
                        yg0Var.V0(vj1Var.G()[readByte & 15]);
                    }
                }
            }
            i3 += Character.charCount(codePointAt);
        }
    }
}
