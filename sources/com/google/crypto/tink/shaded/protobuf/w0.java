package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RawMessageInfo.java */
/* loaded from: classes2.dex */
public final class w0 implements k0 {
    private final m0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(m0 m0Var, String str, Object[] objArr) {
        this.a = m0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public boolean a() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public m0 b() {
        return this.a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public mr8 c() {
        if ((this.d & 1) == 1) {
            return mr8.PROTO2;
        }
        return mr8.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.b;
    }
}
