package defpackage;

import com.google.protobuf.w;
/* compiled from: ApplicationProcessState.java */
/* renamed from: tp  reason: default package */
/* loaded from: classes2.dex */
public enum tp implements w.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    private static final w.d<tp> f = new w.d<tp>() { // from class: tp.a
        @Override // com.google.protobuf.w.d
        /* renamed from: b */
        public tp a(int i) {
            return tp.a(i);
        }
    };
    private final int a;

    /* compiled from: ApplicationProcessState.java */
    /* renamed from: tp$b */
    /* loaded from: classes2.dex */
    private static final class b implements w.e {
        static final w.e a = new b();

        private b() {
        }

        @Override // com.google.protobuf.w.e
        public boolean a(int i) {
            if (tp.a(i) != null) {
                return true;
            }
            return false;
        }
    }

    tp(int i) {
        this.a = i;
    }

    public static tp a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static w.e i() {
        return b.a;
    }

    @Override // com.google.protobuf.w.c
    public final int e() {
        return this.a;
    }
}
