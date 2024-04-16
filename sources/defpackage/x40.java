package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
/* renamed from: x40  reason: default package */
/* loaded from: classes3.dex */
public class x40 implements KeyStore.LoadStoreParameter {
    private final InputStream a;
    private final OutputStream b;
    private final KeyStore.ProtectionParameter c;

    public InputStream a() {
        if (this.b == null) {
            return this.a;
        }
        throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
    }

    public OutputStream b() {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            return outputStream;
        }
        throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.c;
    }
}
