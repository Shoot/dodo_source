package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.w0;
/* renamed from: zn1  reason: default package */
/* loaded from: classes3.dex */
public class zn1 implements PrivateKey {
    private final List<PrivateKey> a;

    public zn1(PrivateKey... privateKeyArr) {
        if (privateKeyArr != null && privateKeyArr.length != 0) {
            ArrayList arrayList = new ArrayList(privateKeyArr.length);
            for (int i = 0; i != privateKeyArr.length; i++) {
                arrayList.add(privateKeyArr[i]);
            }
            this.a = Collections.unmodifiableList(arrayList);
            return;
        }
        throw new IllegalArgumentException("at least one public key must be provided");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zn1) {
            return this.a.equals(((zn1) obj).a);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "Composite";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        d dVar = new d();
        for (int i = 0; i != this.a.size(); i++) {
            dVar.a(dk8.u(this.a.get(i).getEncoded()));
        }
        try {
            return new dk8(new eb(pl6.N), new w0(dVar)).p("DER");
        } catch (IOException e) {
            throw new IllegalStateException("unable to encode composite key: " + e.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
