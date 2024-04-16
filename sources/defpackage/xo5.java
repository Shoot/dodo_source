package defpackage;

import androidx.annotation.NonNull;
import java.io.OutputStream;
/* compiled from: LengthCountingOutputStream.java */
/* renamed from: xo5  reason: default package */
/* loaded from: classes2.dex */
final class xo5 extends OutputStream {
    private long a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.a;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.a += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.a += i2;
    }
}
