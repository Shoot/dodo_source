package defpackage;

import java.util.Hashtable;
/* renamed from: qj4  reason: default package */
/* loaded from: classes3.dex */
public class qj4 implements x36 {
    private static Hashtable h;
    private e23 a;
    private int b;
    private int c;
    private sc6 d;
    private sc6 e;
    private byte[] f;
    private byte[] g;

    static {
        Hashtable hashtable = new Hashtable();
        h = hashtable;
        hashtable.put("GOST3411", g65.d(32));
        h.put("MD2", g65.d(16));
        h.put("MD4", g65.d(64));
        h.put("MD5", g65.d(64));
        h.put("RIPEMD128", g65.d(64));
        h.put("RIPEMD160", g65.d(64));
        h.put("SHA-1", g65.d(64));
        h.put("SHA-224", g65.d(64));
        h.put("SHA-256", g65.d(64));
        h.put("SHA-384", g65.d(128));
        h.put("SHA-512", g65.d(128));
        h.put("Tiger", g65.d(64));
        h.put("Whirlpool", g65.d(64));
    }

    public qj4(e23 e23Var) {
        this(e23Var, a(e23Var));
    }

    private static int a(e23 e23Var) {
        if (e23Var instanceof nn3) {
            return ((nn3) e23Var).getByteLength();
        }
        Integer num = (Integer) h.get(e23Var.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + e23Var.getAlgorithmName());
    }

    private static void c(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    public e23 b() {
        return this.a;
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) {
        this.a.doFinal(this.g, this.c);
        sc6 sc6Var = this.e;
        if (sc6Var != null) {
            ((sc6) this.a).b(sc6Var);
            e23 e23Var = this.a;
            e23Var.update(this.g, this.c, e23Var.getDigestSize());
        } else {
            e23 e23Var2 = this.a;
            byte[] bArr2 = this.g;
            e23Var2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.a.doFinal(bArr, i);
        int i2 = this.c;
        while (true) {
            byte[] bArr3 = this.g;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        sc6 sc6Var2 = this.d;
        if (sc6Var2 != null) {
            ((sc6) this.a).b(sc6Var2);
        } else {
            e23 e23Var3 = this.a;
            byte[] bArr4 = this.f;
            e23Var3.update(bArr4, 0, bArr4.length);
        }
        return doFinal;
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return this.a.getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.b;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) {
        byte[] bArr;
        this.a.reset();
        byte[] a = ((lf5) v71Var).a();
        int length = a.length;
        if (length > this.c) {
            this.a.update(a, 0, length);
            this.a.doFinal(this.f, 0);
            length = this.b;
        } else {
            System.arraycopy(a, 0, this.f, 0, length);
        }
        while (true) {
            bArr = this.f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.g, 0, this.c);
        c(this.f, this.c, (byte) 54);
        c(this.g, this.c, (byte) 92);
        e23 e23Var = this.a;
        if (e23Var instanceof sc6) {
            sc6 a2 = ((sc6) e23Var).a();
            this.e = a2;
            ((e23) a2).update(this.g, 0, this.c);
        }
        e23 e23Var2 = this.a;
        byte[] bArr2 = this.f;
        e23Var2.update(bArr2, 0, bArr2.length);
        e23 e23Var3 = this.a;
        if (e23Var3 instanceof sc6) {
            this.d = ((sc6) e23Var3).a();
        }
    }

    @Override // defpackage.x36
    public void reset() {
        this.a.reset();
        e23 e23Var = this.a;
        byte[] bArr = this.f;
        e23Var.update(bArr, 0, bArr.length);
    }

    @Override // defpackage.x36
    public void update(byte b) {
        this.a.update(b);
    }

    private qj4(e23 e23Var, int i) {
        this.a = e23Var;
        int digestSize = e23Var.getDigestSize();
        this.b = digestSize;
        this.c = i;
        this.f = new byte[i];
        this.g = new byte[i + digestSize];
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
    }
}
