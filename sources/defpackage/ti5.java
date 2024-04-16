package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: ti5  reason: default package */
/* loaded from: classes3.dex */
public class ti5 extends si5 {
    private static a l;
    private static a[] m;
    private final byte[] b;
    private final wi5 c;
    private final pi5 d;
    private final int e;
    private final byte[] f;
    private final Map<a, byte[]> g;
    private final int h;
    private final e23 i;
    private int j;
    private ui5 k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ti5$a */
    /* loaded from: classes3.dex */
    public static class a {
        private final int a;

        a(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || ((a) obj).a != this.a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }
    }

    static {
        a aVar = new a(1);
        l = aVar;
        a[] aVarArr = new a[129];
        m = aVarArr;
        aVarArr[1] = aVar;
        int i = 2;
        while (true) {
            a[] aVarArr2 = m;
            if (i < aVarArr2.length) {
                aVarArr2[i] = new a(i);
                i++;
            } else {
                return;
            }
        }
    }

    public ti5(wi5 wi5Var, pi5 pi5Var, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.c = wi5Var;
        this.d = pi5Var;
        this.j = i;
        this.b = tr.h(bArr);
        this.e = i2;
        this.f = tr.h(bArr2);
        this.h = 1 << (wi5Var.c() + 1);
        this.g = new WeakHashMap();
        this.i = l23.a(wi5Var.b());
    }

    private byte[] b(int i) {
        int c = 1 << k().c();
        if (i >= c) {
            sr5.a(e(), this.i);
            sr5.c(i, this.i);
            sr5.b((short) -32126, this.i);
            sr5.a(xi5.a(i(), e(), i - c, h()), this.i);
            byte[] bArr = new byte[this.i.getDigestSize()];
            this.i.doFinal(bArr, 0);
            return bArr;
        }
        int i2 = i * 2;
        byte[] c2 = c(i2);
        byte[] c3 = c(i2 + 1);
        sr5.a(e(), this.i);
        sr5.c(i, this.i);
        sr5.b((short) -31869, this.i);
        sr5.a(c2, this.i);
        sr5.a(c3, this.i);
        byte[] bArr2 = new byte[this.i.getDigestSize()];
        this.i.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] d(a aVar) {
        synchronized (this.g) {
            try {
                byte[] bArr = this.g.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] b = b(aVar.a);
                this.g.put(aVar, b);
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ti5 f(Object obj) throws IOException {
        DataInputStream dataInputStream;
        if (obj instanceof ti5) {
            return (ti5) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                wi5 e = wi5.e(dataInputStream2.readInt());
                pi5 e2 = pi5.e(dataInputStream2.readInt());
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int readInt = dataInputStream2.readInt();
                int readInt2 = dataInputStream2.readInt();
                int readInt3 = dataInputStream2.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream2.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream2.readFully(bArr2);
                        return new ti5(e, e2, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream2.available());
                }
                throw new IllegalStateException("secret length less than zero");
            }
            throw new IllegalStateException("expected version 0 lms private key");
        } else if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                ti5 f = f(dataInputStream);
                dataInputStream.close();
                return f;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        } else if (obj instanceof InputStream) {
            return f(aza.b((InputStream) obj));
        } else {
            throw new IllegalArgumentException("cannot parse " + obj);
        }
    }

    public static ti5 g(byte[] bArr, byte[] bArr2) throws IOException {
        ti5 f = f(bArr);
        f.k = ui5.b(bArr2);
        return f;
    }

    byte[] c(int i) {
        a aVar;
        if (i < this.h) {
            a[] aVarArr = m;
            if (i < aVarArr.length) {
                aVar = aVarArr[i];
            } else {
                aVar = new a(i);
            }
            return d(aVar);
        }
        return b(i);
    }

    public byte[] e() {
        return tr.h(this.b);
    }

    public boolean equals(Object obj) {
        ui5 ui5Var;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ti5 ti5Var = (ti5) obj;
        if (this.j != ti5Var.j || this.e != ti5Var.e || !tr.c(this.b, ti5Var.b)) {
            return false;
        }
        wi5 wi5Var = this.c;
        if (wi5Var == null ? ti5Var.c != null : !wi5Var.equals(ti5Var.c)) {
            return false;
        }
        pi5 pi5Var = this.d;
        if (pi5Var == null ? ti5Var.d != null : !pi5Var.equals(ti5Var.d)) {
            return false;
        }
        if (!tr.c(this.f, ti5Var.f)) {
            return false;
        }
        ui5 ui5Var2 = this.k;
        if (ui5Var2 == null || (ui5Var = ti5Var.k) == null) {
            return true;
        }
        return ui5Var2.equals(ui5Var);
    }

    @Override // defpackage.si5, defpackage.wg3
    public byte[] getEncoded() throws IOException {
        return rn1.f().i(0).i(this.c.f()).i(this.d.f()).d(this.b).i(this.j).i(this.e).i(this.f.length).d(this.f).b();
    }

    public byte[] h() {
        return tr.h(this.f);
    }

    public int hashCode() {
        int i;
        int i2;
        int F = ((this.j * 31) + tr.F(this.b)) * 31;
        wi5 wi5Var = this.c;
        int i3 = 0;
        if (wi5Var != null) {
            i = wi5Var.hashCode();
        } else {
            i = 0;
        }
        int i4 = (F + i) * 31;
        pi5 pi5Var = this.d;
        if (pi5Var != null) {
            i2 = pi5Var.hashCode();
        } else {
            i2 = 0;
        }
        int F2 = (((((i4 + i2) * 31) + this.e) * 31) + tr.F(this.f)) * 31;
        ui5 ui5Var = this.k;
        if (ui5Var != null) {
            i3 = ui5Var.hashCode();
        }
        return F2 + i3;
    }

    public pi5 i() {
        return this.d;
    }

    public ui5 j() {
        ui5 ui5Var;
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new ui5(this.c, this.d, d(l), this.b);
                }
                ui5Var = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ui5Var;
    }

    public wi5 k() {
        return this.c;
    }
}
