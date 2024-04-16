package defpackage;

import com.google.protobuf.w;
/* compiled from: SessionVerbosity.java */
/* renamed from: efa  reason: default package */
/* loaded from: classes2.dex */
public enum efa implements w.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    private static final w.d<efa> d = new w.d<efa>() { // from class: efa.a
        @Override // com.google.protobuf.w.d
        /* renamed from: b */
        public efa a(int i) {
            return efa.a(i);
        }
    };
    private final int a;

    /* compiled from: SessionVerbosity.java */
    /* renamed from: efa$b */
    /* loaded from: classes2.dex */
    private static final class b implements w.e {
        static final w.e a = new b();

        private b() {
        }

        @Override // com.google.protobuf.w.e
        public boolean a(int i) {
            if (efa.a(i) != null) {
                return true;
            }
            return false;
        }
    }

    efa(int i) {
        this.a = i;
    }

    public static efa a(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static w.e i() {
        return b.a;
    }

    @Override // com.google.protobuf.w.c
    public final int e() {
        return this.a;
    }
}
