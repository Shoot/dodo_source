package defpackage;

import java.io.IOException;
/* compiled from: FilterReader.java */
/* renamed from: zu3  reason: default package */
/* loaded from: classes2.dex */
public class zu3 implements m79 {
    protected m79 a;

    public zu3(m79 m79Var) {
        this.a = m79Var;
    }

    @Override // defpackage.m79
    public int available() throws IOException {
        return this.a.available();
    }

    @Override // defpackage.m79
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.m79, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.a.read(bArr, i, i2);
    }

    @Override // defpackage.m79, java.io.InputStream
    public void reset() throws IOException {
        this.a.reset();
    }
}
