package defpackage;

import com.google.crypto.tink.shaded.protobuf.y;
/* compiled from: OutputPrefixType.java */
/* renamed from: mm7  reason: default package */
/* loaded from: classes2.dex */
public enum mm7 implements y.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final y.d<mm7> h = new y.d<mm7>() { // from class: mm7.a
        @Override // com.google.crypto.tink.shaded.protobuf.y.d
        /* renamed from: b */
        public mm7 a(int i2) {
            return mm7.a(i2);
        }
    };
    private final int a;

    mm7(int i2) {
        this.a = i2;
    }

    public static mm7 a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
