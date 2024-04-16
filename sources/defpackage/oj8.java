package defpackage;

import java.math.BigInteger;
/* renamed from: oj8  reason: default package */
/* loaded from: classes3.dex */
class oj8 implements iv3 {
    protected final BigInteger a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oj8(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.iv3
    public int a() {
        return 1;
    }

    @Override // defpackage.iv3
    public BigInteger b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj8)) {
            return false;
        }
        return this.a.equals(((oj8) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
