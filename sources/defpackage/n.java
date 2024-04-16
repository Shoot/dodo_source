package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: n  reason: default package */
/* loaded from: classes3.dex */
public interface n {
    byte[] a();

    void b(byte[] bArr, int i, int i2);

    int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException;

    String getAlgorithmName();

    int getOutputSize(int i);

    int getUpdateOutputSize(int i);

    void init(boolean z, v71 v71Var) throws IllegalArgumentException;

    int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

    int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;
}
