package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
abstract class p extends n {
    private static final WeakReference c = new WeakReference(null);
    private WeakReference b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.n
    public final byte[] U1() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.b.get();
                if (bArr == null) {
                    bArr = V1();
                    this.b = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] V1();
}
