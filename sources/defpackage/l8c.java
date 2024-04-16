package defpackage;

import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: l8c  reason: default package */
/* loaded from: classes3.dex */
public interface l8c {
    byte[] a(byte[] bArr, int i, int i2);

    byte[] b(byte[] bArr, int i, int i2) throws InvalidCipherTextException;

    String getAlgorithmName();

    void init(boolean z, v71 v71Var);
}
