package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: vi5  reason: default package */
/* loaded from: classes3.dex */
class vi5 implements wg3 {
    private final int a;
    private final qi5 b;
    private final wi5 c;
    private final byte[][] d;

    public vi5(int i, qi5 qi5Var, wi5 wi5Var, byte[][] bArr) {
        this.a = i;
        this.b = qi5Var;
        this.c = wi5Var;
        this.d = bArr;
    }

    public static vi5 a(Object obj) throws IOException {
        if (obj instanceof vi5) {
            return (vi5) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int readInt = dataInputStream.readInt();
            qi5 a = qi5.a(obj);
            wi5 e = wi5.e(dataInputStream.readInt());
            int c = e.c();
            byte[][] bArr = new byte[c];
            for (int i = 0; i < c; i++) {
                byte[] bArr2 = new byte[e.d()];
                bArr[i] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new vi5(readInt, a, e, bArr);
        } else if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    vi5 a2 = a(dataInputStream3);
                    dataInputStream3.close();
                    return a2;
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
        vi5 vi5Var = (vi5) obj;
        if (this.a != vi5Var.a) {
            return false;
        }
        qi5 qi5Var = this.b;
        if (qi5Var == null ? vi5Var.b != null : !qi5Var.equals(vi5Var.b)) {
            return false;
        }
        wi5 wi5Var = this.c;
        if (wi5Var == null ? vi5Var.c != null : !wi5Var.equals(vi5Var.c)) {
            return false;
        }
        return Arrays.deepEquals(this.d, vi5Var.d);
    }

    @Override // defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return rn1.f().i(this.a).d(this.b.getEncoded()).i(this.c.f()).e(this.d).b();
    }

    public int hashCode() {
        int i;
        int i2 = this.a * 31;
        qi5 qi5Var = this.b;
        int i3 = 0;
        if (qi5Var != null) {
            i = qi5Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        wi5 wi5Var = this.c;
        if (wi5Var != null) {
            i3 = wi5Var.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.deepHashCode(this.d);
    }
}
