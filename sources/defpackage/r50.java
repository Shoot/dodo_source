package defpackage;

import defpackage.h47;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.k;
/* renamed from: r50  reason: default package */
/* loaded from: classes3.dex */
public class r50 implements Serializable {
    private final Map<Integer, q50> a = new TreeMap();
    private transient long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r50(long j) {
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        long j;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            j = objectInputStream.readLong();
        } else {
            j = 0;
        }
        this.b = j;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b);
    }

    q50 a(int i) {
        return this.a.get(g65.d(i));
    }

    public long b() {
        return this.b;
    }

    void c(int i, q50 q50Var) {
        this.a.put(g65.d(i), q50Var);
    }

    q50 d(int i, byte[] bArr, byte[] bArr2, h47 h47Var) {
        return this.a.put(g65.d(i), this.a.get(g65.d(i)).d(bArr, bArr2, h47Var));
    }

    void e(fbc fbcVar, long j, byte[] bArr, byte[] bArr2) {
        nbc h = fbcVar.h();
        int b = h.b();
        long j2 = sbc.j(j, b);
        int i = sbc.i(j, b);
        h47 h47Var = (h47) new h47.b().h(j2).p(i).l();
        int i2 = (1 << b) - 1;
        if (i < i2) {
            if (a(0) == null || i == 0) {
                c(0, new q50(h, bArr, bArr2, h47Var));
            }
            d(0, bArr, bArr2, h47Var);
        }
        for (int i3 = 1; i3 < fbcVar.b(); i3++) {
            int i4 = sbc.i(j2, b);
            j2 = sbc.j(j2, b);
            h47 h47Var2 = (h47) new h47.b().g(i3).h(j2).p(i4).l();
            if (this.a.get(Integer.valueOf(i3)) == null || sbc.n(j, b, i3)) {
                this.a.put(Integer.valueOf(i3), new q50(h, bArr, bArr2, h47Var2));
            }
            if (i4 < i2 && sbc.m(j, b, i3)) {
                d(i3, bArr, bArr2, h47Var2);
            }
        }
    }

    public r50 f(k kVar) {
        r50 r50Var = new r50(this.b);
        for (Integer num : this.a.keySet()) {
            r50Var.a.put(num, this.a.get(num).j(kVar));
        }
        return r50Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r50(r50 r50Var, long j) {
        for (Integer num : r50Var.a.keySet()) {
            this.a.put(num, new q50(r50Var.a.get(num)));
        }
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r50(fbc fbcVar, long j, byte[] bArr, byte[] bArr2) {
        this.b = (1 << fbcVar.a()) - 1;
        for (long j2 = 0; j2 < j; j2++) {
            e(fbcVar, j2, bArr, bArr2);
        }
    }
}
