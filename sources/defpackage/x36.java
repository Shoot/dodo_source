package defpackage;

import org.bouncycastle.crypto.DataLengthException;
/* renamed from: x36  reason: default package */
/* loaded from: classes3.dex */
public interface x36 {
    int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException;

    String getAlgorithmName();

    int getMacSize();

    void init(v71 v71Var) throws IllegalArgumentException;

    void reset();

    void update(byte b) throws IllegalStateException;

    void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException;
}
