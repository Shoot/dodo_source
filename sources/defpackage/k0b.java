package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "", "k", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "l", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", Image.TYPE_MEDIUM, "(Ljava/lang/String;)Ljava/lang/Long;", "n", "(Ljava/lang/String;I)Ljava/lang/Long;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/StringsKt")
/* renamed from: k0b  reason: default package */
/* loaded from: classes3.dex */
public class k0b extends j0b {
    public static Integer k(String str) {
        z65.h(str, "<this>");
        return l(str, 10);
    }

    public static final Integer l(String str, int i) {
        boolean z;
        int i2;
        int i3;
        z65.h(str, "<this>");
        nw0.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (z65.j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int b = nw0.b(str.charAt(i2), i);
            if (b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    public static Long m(String str) {
        z65.h(str, "<this>");
        return n(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long n(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            defpackage.z65.h(r0, r2)
            defpackage.mw0.a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = defpackage.z65.j(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L37
            r6 = 1
            if (r2 != r6) goto L2a
            return r3
        L2a:
            r9 = 45
            if (r5 != r9) goto L32
            r7 = -9223372036854775808
            r4 = 1
            goto L3a
        L32:
            r9 = 43
            if (r5 != r9) goto L39
            r4 = 1
        L37:
            r6 = 0
            goto L3a
        L39:
            return r3
        L3a:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L42:
            if (r4 >= r2) goto L73
            char r5 = r0.charAt(r4)
            int r5 = defpackage.nw0.b(r5, r1)
            if (r5 >= 0) goto L4f
            return r3
        L4f:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5f
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L5e
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5f
        L5e:
            return r3
        L5f:
            long r9 = (long) r1
            long r11 = r11 * r9
            long r9 = (long) r5
            long r16 = r7 + r9
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 >= 0) goto L6a
            return r3
        L6a:
            long r11 = r11 - r9
            int r4 = r4 + 1
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L42
        L73:
            if (r6 == 0) goto L7a
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            goto L7f
        L7a:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0b.n(java.lang.String, int):java.lang.Long");
    }
}
