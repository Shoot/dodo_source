package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: KmsEnvelopeAead.java */
/* renamed from: eh5  reason: default package */
/* loaded from: classes2.dex */
public final class eh5 implements l9 {
    private static final byte[] c = new byte[0];
    private final vf5 a;
    private final l9 b;

    public eh5(vf5 vf5Var, l9 l9Var) {
        this.a = vf5Var;
        this.b = l9Var;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // defpackage.l9
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((l9) kc9.f(this.a.R(), this.b.a(bArr3, c), l9.class)).a(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // defpackage.l9
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] h = kc9.i(this.a).h();
        return c(this.b.b(h, c), ((l9) kc9.f(this.a.R(), h, l9.class)).b(bArr, bArr2));
    }
}
