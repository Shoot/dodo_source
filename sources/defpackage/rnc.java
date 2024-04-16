package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: rnc  reason: default package */
/* loaded from: classes2.dex */
public final class rnc<T> implements mnc<T> {
    private final Object a = new Object();
    private final int b;
    private final rbd c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public rnc(int i, rbd rbdVar) {
        this.b = i;
        this.c = rbdVar;
    }

    private final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                rbd rbdVar = this.c;
                int i = this.e;
                int i2 = this.b;
                rbdVar.t(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.g));
            } else if (this.h) {
                this.c.v();
            } else {
                this.c.u(null);
            }
        }
    }

    @Override // defpackage.l77
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            b();
        }
    }

    @Override // defpackage.a87
    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            b();
        }
    }

    @Override // defpackage.a97
    public final void onSuccess(T t) {
        synchronized (this.a) {
            this.d++;
            b();
        }
    }
}
