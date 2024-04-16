package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.w0;
/* renamed from: bo1  reason: default package */
/* loaded from: classes3.dex */
public class bo1 implements PublicKey {
    private final List<PublicKey> a;

    public bo1(PublicKey... publicKeyArr) {
        if (publicKeyArr != null && publicKeyArr.length != 0) {
            ArrayList arrayList = new ArrayList(publicKeyArr.length);
            for (int i = 0; i != publicKeyArr.length; i++) {
                arrayList.add(publicKeyArr[i]);
            }
            this.a = Collections.unmodifiableList(arrayList);
            return;
        }
        throw new IllegalArgumentException("at least one public key must be provided");
    }

    public List<PublicKey> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bo1) {
            return this.a.equals(((bo1) obj).a);
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
            dVar.a(b1b.u(this.a.get(i).getEncoded()));
        }
        try {
            return new b1b(new eb(pl6.N), new w0(dVar)).p("DER");
        } catch (IOException e) {
            throw new IllegalStateException("unable to encode composite key: " + e.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
