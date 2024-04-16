package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class u0 implements i0 {
    private final k0 a;
    private final String b;
    private final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(k0 k0Var, String str, Object[] objArr) {
        this.a = k0Var;
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

    @Override // com.google.protobuf.i0
    public boolean a() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.i0
    public k0 b() {
        return this.a;
    }

    @Override // com.google.protobuf.i0
    public nr8 c() {
        if ((this.d & 1) == 1) {
            return nr8.PROTO2;
        }
        return nr8.PROTO3;
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
