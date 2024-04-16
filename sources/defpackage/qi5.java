package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: qi5  reason: default package */
/* loaded from: classes3.dex */
class qi5 implements wg3 {
    private final pi5 a;
    private final byte[] b;
    private final byte[] c;

    public qi5(pi5 pi5Var, byte[] bArr, byte[] bArr2) {
        this.a = pi5Var;
        this.b = bArr;
        this.c = bArr2;
    }

    public static qi5 a(Object obj) throws IOException {
        if (obj instanceof qi5) {
            return (qi5) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            pi5 e = pi5.e(dataInputStream.readInt());
            byte[] bArr = new byte[e.c()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e.d() * e.c()];
            dataInputStream.readFully(bArr2);
            return new qi5(e, bArr, bArr2);
        } else if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    qi5 a = a(dataInputStream3);
                    dataInputStream3.close();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream2 = dataInputStream3;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (obj instanceof InputStream) {
            return a(aza.b((InputStream) obj));
        } else {
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qi5 qi5Var = (qi5) obj;
        pi5 pi5Var = this.a;
        if (pi5Var == null ? qi5Var.a != null : !pi5Var.equals(qi5Var.a)) {
            return false;
        }
        if (!Arrays.equals(this.b, qi5Var.b)) {
            return false;
        }
        return Arrays.equals(this.c, qi5Var.c);
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return rn1.f().i(this.a.f()).d(this.b).d(this.c).b();
    }

    public int hashCode() {
        int i;
        pi5 pi5Var = this.a;
        if (pi5Var != null) {
            i = pi5Var.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}
