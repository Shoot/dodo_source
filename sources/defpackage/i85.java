package defpackage;

import java.io.OutputStream;
import java.security.KeyStore;
/* renamed from: i85  reason: default package */
/* loaded from: classes3.dex */
public class i85 implements KeyStore.LoadStoreParameter {
    private OutputStream a;
    private KeyStore.ProtectionParameter b;
    private boolean c;

    public OutputStream a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.b;
    }
}
