package defpackage;
/* renamed from: e23  reason: default package */
/* loaded from: classes3.dex */
public interface e23 {
    int doFinal(byte[] bArr, int i);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b);

    void update(byte[] bArr, int i, int i2);
}
