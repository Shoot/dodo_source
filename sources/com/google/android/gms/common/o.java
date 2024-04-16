package com.google.android.gms.common;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class o extends n {
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.n
    public final byte[] U1() {
        return this.b;
    }
}
