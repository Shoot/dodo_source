package defpackage;

import androidx.annotation.NonNull;
import java.util.Arrays;
/* compiled from: EncodedPayload.java */
/* renamed from: zg3  reason: default package */
/* loaded from: classes2.dex */
public final class zg3 {
    private final eh3 a;
    private final byte[] b;

    public zg3(@NonNull eh3 eh3Var, @NonNull byte[] bArr) {
        if (eh3Var != null) {
            if (bArr != null) {
                this.a = eh3Var;
                this.b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.b;
    }

    public eh3 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg3)) {
            return false;
        }
        zg3 zg3Var = (zg3) obj;
        if (!this.a.equals(zg3Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, zg3Var.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
