package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: uj4  reason: default package */
/* loaded from: classes3.dex */
public class uj4 extends si5 {
    private final int b;
    private final ui5 c;

    public uj4(int i, ui5 ui5Var) {
        super(false);
        this.b = i;
        this.c = ui5Var;
    }

    public static uj4 b(Object obj) throws IOException {
        if (obj instanceof uj4) {
            return (uj4) obj;
        }
        if (obj instanceof DataInputStream) {
            return new uj4(((DataInputStream) obj).readInt(), ui5.b(obj));
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream = null;
            try {
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                try {
                    uj4 b = b(dataInputStream2);
                    dataInputStream2.close();
                    return b;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        dataInputStream.close();
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

    public int c() {
        return this.b;
    }

    public ui5 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uj4 uj4Var = (uj4) obj;
        if (this.b != uj4Var.b) {
            return false;
        }
        return this.c.equals(uj4Var.c);
    }

    @Override // defpackage.si5, defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return rn1.f().i(this.b).d(this.c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.b * 31) + this.c.hashCode();
    }
}
