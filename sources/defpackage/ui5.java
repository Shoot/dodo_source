package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: ui5  reason: default package */
/* loaded from: classes3.dex */
public class ui5 extends si5 {
    private final wi5 b;
    private final pi5 c;
    private final byte[] d;
    private final byte[] e;

    public ui5(wi5 wi5Var, pi5 pi5Var, byte[] bArr, byte[] bArr2) {
        super(false);
        this.b = wi5Var;
        this.c = pi5Var;
        this.d = tr.h(bArr2);
        this.e = tr.h(bArr);
    }

    public static ui5 b(Object obj) throws IOException {
        if (obj instanceof ui5) {
            return (ui5) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            wi5 e = wi5.e(dataInputStream.readInt());
            pi5 e2 = pi5.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[e.d()];
            dataInputStream.readFully(bArr2);
            return new ui5(e, e2, bArr2, bArr);
        } else if (obj instanceof byte[]) {
            DataInputStream dataInputStream2 = null;
            try {
                DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    ui5 b = b(dataInputStream3);
                    dataInputStream3.close();
                    return b;
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
            return b(aza.b((InputStream) obj));
        } else {
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    byte[] c() {
        return rn1.f().i(this.b.f()).i(this.c.f()).d(this.d).d(this.e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ui5 ui5Var = (ui5) obj;
        if (!this.b.equals(ui5Var.b) || !this.c.equals(ui5Var.c) || !tr.c(this.d, ui5Var.d)) {
            return false;
        }
        return tr.c(this.e, ui5Var.e);
    }

    @Override // defpackage.si5, defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return c();
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + tr.F(this.d)) * 31) + tr.F(this.e);
    }
}
