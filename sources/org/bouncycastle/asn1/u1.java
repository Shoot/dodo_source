package org.bouncycastle.asn1;

import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class u1 extends InputStream {
    protected final InputStream a;
    private int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
        InputStream inputStream = this.a;
        if (inputStream instanceof r1) {
            ((r1) inputStream).e(z);
        }
    }
}
