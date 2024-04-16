package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NativeObjectReference extends PhantomReference<ku6> {
    private static b f = new b();
    private final long a;
    private final long b;
    private final c c;
    private NativeObjectReference d;
    private NativeObjectReference e;

    /* loaded from: classes3.dex */
    private static class b {
        NativeObjectReference a;

        private b() {
        }

        synchronized void a(NativeObjectReference nativeObjectReference) {
            try {
                nativeObjectReference.d = null;
                nativeObjectReference.e = this.a;
                NativeObjectReference nativeObjectReference2 = this.a;
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.d = nativeObjectReference;
                }
                this.a = nativeObjectReference;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized void b(NativeObjectReference nativeObjectReference) {
            try {
                NativeObjectReference nativeObjectReference2 = nativeObjectReference.e;
                NativeObjectReference nativeObjectReference3 = nativeObjectReference.d;
                nativeObjectReference.e = null;
                nativeObjectReference.d = null;
                if (nativeObjectReference3 != null) {
                    nativeObjectReference3.e = nativeObjectReference2;
                } else {
                    this.a = nativeObjectReference2;
                }
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.d = nativeObjectReference3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeObjectReference(c cVar, ku6 ku6Var, ReferenceQueue<? super ku6> referenceQueue) {
        super(ku6Var, referenceQueue);
        this.a = ku6Var.getNativePtr();
        this.b = ku6Var.getNativeFinalizerPtr();
        this.c = cVar;
        f.a(this);
    }

    static native void nativeCleanUp(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        synchronized (this.c) {
            nativeCleanUp(this.b, this.a);
        }
        f.b(this);
    }
}
