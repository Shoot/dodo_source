package defpackage;
/* compiled from: ByteArrayAdapter.java */
/* renamed from: mj0  reason: default package */
/* loaded from: classes.dex */
public final class mj0 implements cr<byte[]> {
    @Override // defpackage.cr
    public String a() {
        return "ByteArrayPool";
    }

    @Override // defpackage.cr
    public int b() {
        return 1;
    }

    @Override // defpackage.cr
    /* renamed from: d */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // defpackage.cr
    /* renamed from: e */
    public byte[] newArray(int i) {
        return new byte[i];
    }
}
