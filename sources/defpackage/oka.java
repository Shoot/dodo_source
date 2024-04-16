package defpackage;

import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
/* renamed from: oka  reason: default package */
/* loaded from: classes3.dex */
public interface oka {
    boolean a(byte[] bArr);

    byte[] b() throws CryptoException, DataLengthException;

    void init(boolean z, v71 v71Var);

    void update(byte b);

    void update(byte[] bArr, int i, int i2);
}
