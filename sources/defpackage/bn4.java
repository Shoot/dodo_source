package defpackage;

import com.google.crypto.tink.shaded.protobuf.y;
/* compiled from: HashType.java */
/* renamed from: bn4  reason: default package */
/* loaded from: classes2.dex */
public enum bn4 implements y.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    private static final y.d<bn4> i = new y.d<bn4>() { // from class: bn4.a
        @Override // com.google.crypto.tink.shaded.protobuf.y.d
        /* renamed from: b */
        public bn4 a(int i2) {
            return bn4.a(i2);
        }
    };
    private final int a;

    bn4(int i2) {
        this.a = i2;
    }

    public static bn4 a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            return SHA224;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
