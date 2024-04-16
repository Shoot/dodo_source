package defpackage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.encoders.a;
/* renamed from: px7  reason: default package */
/* loaded from: classes3.dex */
public class px7 extends BufferedWriter {
    private final int a;
    private char[] b;

    public px7(Writer writer) {
        super(writer);
        int i;
        this.b = new char[64];
        String d = a0b.d();
        if (d != null) {
            i = d.length();
        } else {
            i = 2;
        }
        this.a = i;
    }

    private void a(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        byte[] b = a.b(bArr);
        int i2 = 0;
        while (i2 < b.length) {
            int i3 = 0;
            while (true) {
                cArr = this.b;
                if (i3 != cArr.length && (i = i2 + i3) < b.length) {
                    cArr[i3] = (char) b[i];
                    i3++;
                }
            }
            write(cArr, 0, i3);
            newLine();
            i2 += this.b.length;
        }
    }

    private void c(String str) throws IOException {
        write("-----END " + str + "-----");
        newLine();
    }

    private void e(String str) throws IOException {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public void b(mx7 mx7Var) throws IOException {
        lx7 a = mx7Var.a();
        e(a.d());
        if (!a.c().isEmpty()) {
            for (kx7 kx7Var : a.c()) {
                write(kx7Var.b());
                write(": ");
                write(kx7Var.c());
                newLine();
            }
            newLine();
        }
        a(a.b());
        c(a.d());
    }
}
