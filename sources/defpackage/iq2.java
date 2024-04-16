package defpackage;

import defpackage.ir2;
import java.io.IOException;
/* compiled from: DefaultIndenter.java */
/* renamed from: iq2  reason: default package */
/* loaded from: classes2.dex */
public class iq2 extends ir2.c {
    public static final String e;
    public static final iq2 f;
    private final char[] b;
    private final int c;
    private final String d;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        e = str;
        f = new iq2("  ", str);
    }

    public iq2(String str, String str2) {
        this.c = str.length();
        this.b = new char[str.length() * 16];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.b, i);
            i += str.length();
        }
        this.d = str2;
    }

    @Override // defpackage.ir2.c, defpackage.ir2.b
    public void a(ua5 ua5Var, int i) throws IOException {
        ua5Var.N0(this.d);
        if (i > 0) {
            int i2 = i * this.c;
            while (true) {
                char[] cArr = this.b;
                if (i2 > cArr.length) {
                    ua5Var.O0(cArr, 0, cArr.length);
                    i2 -= this.b.length;
                } else {
                    ua5Var.O0(cArr, 0, i2);
                    return;
                }
            }
        }
    }

    @Override // defpackage.ir2.c, defpackage.ir2.b
    public boolean isInline() {
        return false;
    }
}
