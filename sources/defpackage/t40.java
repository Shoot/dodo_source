package defpackage;

import java.io.OutputStream;
import java.security.KeyStore;
/* renamed from: t40  reason: default package */
/* loaded from: classes3.dex */
public class t40 implements KeyStore.LoadStoreParameter {
    private final KeyStore.ProtectionParameter a;
    private final hn7 b;
    private OutputStream c;

    public OutputStream a() {
        return this.c;
    }

    public hn7 b() {
        return this.b;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.a;
    }
}
