package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: z62  reason: default package */
/* loaded from: classes3.dex */
public class z62 implements q03 {
    private final e23 a;
    private k b;
    private int c;
    private byte[] d;
    private byte[] e;

    public z62(e23 e23Var) {
        this.a = e23Var;
    }

    @Override // defpackage.q03
    public void a(r03 r03Var) {
        y62 y62Var = (y62) r03Var;
        this.b = y62Var.a();
        this.c = y62Var.c();
        this.d = y62Var.d();
        this.e = y62Var.b();
    }

    @Override // defpackage.q03
    public int b(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        boolean z;
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 >= i4) {
            long j = i3;
            int digestSize = this.a.getDigestSize();
            if (j <= 8589934591L) {
                long j2 = digestSize;
                int i5 = (int) (((j + j2) - 1) / j2);
                byte[] bArr2 = new byte[this.a.getDigestSize()];
                int i6 = 0;
                int i7 = 0;
                int i8 = 1;
                while (i7 < i5) {
                    e23 e23Var = this.a;
                    byte[] bArr3 = this.d;
                    e23Var.update(bArr3, i6, bArr3.length);
                    d dVar = new d();
                    d dVar2 = new d();
                    dVar2.a(this.b);
                    dVar2.a(new s0(mo7.h(i8)));
                    dVar.a(new w0(dVar2));
                    byte[] bArr4 = this.e;
                    if (bArr4 != null) {
                        s0 s0Var = new s0(bArr4);
                        z = true;
                        dVar.a(new z0(true, i6, s0Var));
                    } else {
                        z = true;
                    }
                    dVar.a(new z0(z, 2, new s0(mo7.h(this.c))));
                    try {
                        byte[] p = new w0(dVar).p("DER");
                        this.a.update(p, 0, p.length);
                        this.a.doFinal(bArr2, 0);
                        if (i3 > digestSize) {
                            System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                            i4 += digestSize;
                            i3 -= digestSize;
                        } else {
                            System.arraycopy(bArr2, 0, bArr, i4, i3);
                        }
                        i8++;
                        i7++;
                        i6 = 0;
                    } catch (IOException e) {
                        throw new IllegalArgumentException("unable to encode parameter info: " + e.getMessage());
                    }
                }
                this.a.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }
}
