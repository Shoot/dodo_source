package defpackage;

import java.io.IOException;
import java.security.Principal;
import org.bouncycastle.asn1.p;
/* renamed from: bac  reason: default package */
/* loaded from: classes3.dex */
public class bac extends z9c implements Principal {
    public bac(t9c t9cVar) {
        super((p) t9cVar.f());
    }

    @Override // defpackage.i0, defpackage.wg3
    public byte[] getEncoded() {
        try {
            return p("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    @Override // java.security.Principal
    public String getName() {
        return toString();
    }
}
