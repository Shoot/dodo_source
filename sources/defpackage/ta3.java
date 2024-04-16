package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: ta3  reason: default package */
/* loaded from: classes3.dex */
public class ta3 implements nf5 {
    private la3 a;

    public ta3(la3 la3Var) {
        this.a = la3Var;
    }

    @Override // defpackage.nf5
    public ux a(InputStream inputStream) throws IOException {
        byte[] bArr;
        int read = inputStream.read();
        if (read != 0) {
            if (read != 2 && read != 3) {
                if (read != 4 && read != 6 && read != 7) {
                    throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(read, 16));
                }
                bArr = new byte[(((this.a.a().t() + 7) / 8) * 2) + 1];
            } else {
                bArr = new byte[((this.a.a().t() + 7) / 8) + 1];
            }
            bArr[0] = (byte) read;
            aza.d(inputStream, bArr, 1, bArr.length - 1);
            return new qb3(this.a.a().j(bArr), this.a);
        }
        throw new IOException("Sender's public key invalid.");
    }
}
