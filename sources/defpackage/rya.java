package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: rya  reason: default package */
/* loaded from: classes3.dex */
public interface rya {
    String getAlgorithmName();

    void init(boolean z, v71 v71Var) throws IllegalArgumentException;

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

    void reset();
}
