package defpackage;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
/* renamed from: m72  reason: default package */
/* loaded from: classes3.dex */
public class m72 implements AlgorithmParameterSpec {
    private final PublicKey a;
    private final PrivateKey b;
    private final PublicKey c;
    private final byte[] d;

    public PrivateKey a() {
        return this.b;
    }

    public PublicKey b() {
        return this.a;
    }

    public PublicKey c() {
        return this.c;
    }

    public byte[] d() {
        return tr.h(this.d);
    }
}
