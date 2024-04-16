package defpackage;

import java.io.IOException;
/* compiled from: Reader.java */
/* renamed from: m79  reason: default package */
/* loaded from: classes2.dex */
public interface m79 {
    int available() throws IOException;

    void close() throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void reset() throws IOException;
}
