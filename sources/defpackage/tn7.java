package defpackage;

import javax.crypto.interfaces.PBEKey;
/* renamed from: tn7  reason: default package */
/* loaded from: classes3.dex */
public class tn7 extends sn7 implements PBEKey {
    private final byte[] c;
    private final int d;

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.d;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.c;
    }
}
