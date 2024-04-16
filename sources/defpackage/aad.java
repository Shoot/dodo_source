package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: aad  reason: default package */
/* loaded from: classes2.dex */
public final class aad {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(@NonNull g9d g9dVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(g9dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(@NonNull y6b y6bVar) {
        g9d g9dVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            g9dVar = (g9d) this.b.poll();
                            if (g9dVar == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    g9dVar.b(y6bVar);
                }
            }
        }
    }
}
