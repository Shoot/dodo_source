package defpackage;

import java.io.IOException;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.operator.OperatorCreationException;
/* renamed from: kn7  reason: default package */
/* loaded from: classes3.dex */
public class kn7 {
    private final String a;
    private final byte[] b;
    private final byte[] c;
    private final mn7 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kn7(String str, byte[] bArr, byte[] bArr2, mn7 mn7Var) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = mn7Var;
    }

    public ln7 a(jn7 jn7Var) throws IOException {
        try {
            return this.d.a(jn7Var.get(this.a).a(this.c, this.b));
        } catch (IOException e) {
            throw e;
        } catch (OperatorCreationException e2) {
            throw new PEMException("cannot create extraction operator: " + e2.getMessage(), e2);
        } catch (Exception e3) {
            throw new PEMException("exception processing key pair: " + e3.getMessage(), e3);
        }
    }
}
