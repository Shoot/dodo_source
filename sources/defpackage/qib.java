package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
/* compiled from: TokenQueue.java */
/* renamed from: qib  reason: default package */
/* loaded from: classes3.dex */
public class qib {
    private String a;
    private int b = 0;

    public qib(String str) {
        vvb.j(str);
        this.a = str;
    }

    private int r() {
        return this.a.length() - this.b;
    }

    public static String s(String str) {
        StringBuilder b = wza.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 == '\\') {
                if (c == '\\') {
                    b.append(c2);
                }
            } else {
                b.append(c2);
            }
            i++;
            c = c2;
        }
        return wza.o(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c A[LOOP:0: B:3:0x0009->B:44:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055 A[EDGE_INSN: B:46:0x0055->B:38:0x0055 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
        L9:
            boolean r9 = r11.j()
            if (r9 == 0) goto L10
            goto L55
        L10:
            char r9 = r11.c()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L53
            if (r3 != 0) goto L53
            if (r8 == 0) goto L34
            goto L53
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.b
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = 0
        L4d:
            if (r7 <= 0) goto L53
            if (r2 == 0) goto L53
            int r6 = r11.b
        L53:
            if (r7 > 0) goto L7c
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r12 = r11.a
            java.lang.String r12 = r12.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r12 = ""
        L60:
            if (r7 <= 0) goto L7b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = "'"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            defpackage.vvb.a(r13)
        L7b:
            return r12
        L7c:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qib.a(char, char):java.lang.String");
    }

    public String b(String str) {
        String g = g(str);
        k(str);
        return g;
    }

    public char c() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        return str.charAt(i);
    }

    public void d(String str) {
        if (l(str)) {
            int length = str.length();
            if (length <= r()) {
                this.b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public String e() {
        int i = this.b;
        while (!j() && (p() || m(CoreConstants.DASH_CHAR, '_'))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String f() {
        int i = this.b;
        while (!j() && (p() || n("*|", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "_", "-"))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String g(String str) {
        int indexOf = this.a.indexOf(str, this.b);
        if (indexOf != -1) {
            String substring = this.a.substring(this.b, indexOf);
            this.b += substring.length();
            return substring;
        }
        return q();
    }

    public String h(String... strArr) {
        int i = this.b;
        while (!j() && !n(strArr)) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public boolean i() {
        boolean z = false;
        while (o()) {
            this.b++;
            z = true;
        }
        return z;
    }

    public boolean j() {
        if (r() == 0) {
            return true;
        }
        return false;
    }

    public boolean k(String str) {
        if (l(str)) {
            this.b += str.length();
            return true;
        }
        return false;
    }

    public boolean l(String str) {
        return this.a.regionMatches(true, this.b, str, 0, str.length());
    }

    public boolean m(char... cArr) {
        if (j()) {
            return false;
        }
        for (char c : cArr) {
            if (this.a.charAt(this.b) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean n(String... strArr) {
        for (String str : strArr) {
            if (l(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean o() {
        if (!j() && wza.j(this.a.charAt(this.b))) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (!j() && Character.isLetterOrDigit(this.a.charAt(this.b))) {
            return true;
        }
        return false;
    }

    public String q() {
        String substring = this.a.substring(this.b);
        this.b = this.a.length();
        return substring;
    }

    public String toString() {
        return this.a.substring(this.b);
    }
}
