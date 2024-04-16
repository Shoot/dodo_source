package defpackage;

import androidx.annotation.NonNull;
/* compiled from: BytesResource.java */
/* renamed from: pk0  reason: default package */
/* loaded from: classes.dex */
public class pk0 implements nj9<byte[]> {
    private final byte[] a;

    public pk0(byte[] bArr) {
        this.a = (byte[]) eh8.d(bArr);
    }

    @Override // defpackage.nj9
    public int a() {
        return this.a.length;
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // defpackage.nj9
    @NonNull
    /* renamed from: d */
    public byte[] get() {
        return this.a;
    }

    @Override // defpackage.nj9
    public void b() {
    }
}
