package defpackage;

import com.google.crypto.tink.shaded.protobuf.y;
/* compiled from: KeyStatusType.java */
/* renamed from: tf5  reason: default package */
/* loaded from: classes2.dex */
public enum tf5 implements y.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final y.d<tf5> g = new y.d<tf5>() { // from class: tf5.a
        @Override // com.google.crypto.tink.shaded.protobuf.y.d
        /* renamed from: b */
        public tf5 a(int i) {
            return tf5.a(i);
        }
    };
    private final int a;

    tf5(int i) {
        this.a = i;
    }

    public static tf5 a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
