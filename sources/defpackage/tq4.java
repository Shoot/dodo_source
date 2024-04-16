package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: -HttpUrlJvm.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJW\u0010\u0011\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ltq4;", "", "Lyg0;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "", c.a, "(Lyg0;Ljava/lang/String;IIZ)V", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZ)Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: tq4 */
/* loaded from: classes3.dex */
public final class tq4 {
    public static final tq4 a = new tq4();

    private tq4() {
    }

    public static /* synthetic */ String b(tq4 tq4Var, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
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
        return tq4Var.a(str, i4, i5, str2, z5, z6, z7, z8);
    }

    public final String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        z65.h(str, "<this>");
        z65.h(str2, "encodeSet");
        return id5.b(id5.a, str, i, i2, str2, z, z2, z3, z4, null, 128, null);
    }

    public final void c(yg0 yg0Var, String str, int i, int i2, boolean z) {
        int i3;
        z65.h(yg0Var, "<this>");
        z65.h(str, "encoded");
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int D = zdc.D(str.charAt(i + 1));
                int D2 = zdc.D(str.charAt(i3));
                if (D != -1 && D2 != -1) {
                    yg0Var.V0((D << 4) + D2);
                    i = Character.charCount(codePointAt) + i3;
                }
                yg0Var.G(codePointAt);
                i += Character.charCount(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    yg0Var.V0(32);
                    i++;
                }
                yg0Var.G(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }
    }
}
