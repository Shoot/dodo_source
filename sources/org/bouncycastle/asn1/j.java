package org.bouncycastle.asn1;

import ch.qos.logback.core.joran.action.ActionConst;
/* loaded from: classes3.dex */
public abstract class j extends n {
    @Override // org.bouncycastle.asn1.n, defpackage.i0
    public int hashCode() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean t(n nVar) {
        if (!(nVar instanceof j)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return ActionConst.NULL;
    }
}
