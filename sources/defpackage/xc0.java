package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: xc0  reason: default package */
/* loaded from: classes3.dex */
public interface xc0 {
    int a();

    int b(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException;

    String getAlgorithmName();

    void init(boolean z, v71 v71Var) throws IllegalArgumentException;

    void reset();
}
