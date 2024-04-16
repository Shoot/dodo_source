package com.google.firebase.remoteconfig.internal;
/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* loaded from: classes2.dex */
public class i implements px3 {
    private final long a;
    private final int b;
    private final rx3 c;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    /* loaded from: classes2.dex */
    public static class b {
        private long a;
        private int b;
        private rx3 c;

        private b() {
        }

        public i a() {
            return new i(this.a, this.b, this.c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(rx3 rx3Var) {
            this.c = rx3Var;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(long j) {
            this.a = j;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b() {
        return new b();
    }

    @Override // defpackage.px3
    public int a() {
        return this.b;
    }

    private i(long j, int i, rx3 rx3Var) {
        this.a = j;
        this.b = i;
        this.c = rx3Var;
    }
}
