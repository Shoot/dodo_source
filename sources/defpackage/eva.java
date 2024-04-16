package defpackage;

import androidx.annotation.NonNull;
/* compiled from: StateVerifier.java */
/* renamed from: eva  reason: default package */
/* loaded from: classes.dex */
public abstract class eva {

    /* compiled from: StateVerifier.java */
    /* renamed from: eva$b */
    /* loaded from: classes.dex */
    private static class b extends eva {
        private volatile boolean a;

        b() {
            super();
        }

        @Override // defpackage.eva
        public void b(boolean z) {
            this.a = z;
        }

        @Override // defpackage.eva
        public void c() {
            if (!this.a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }

    private eva() {
    }

    @NonNull
    public static eva a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(boolean z);

    public abstract void c();
}
