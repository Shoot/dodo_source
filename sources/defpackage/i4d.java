package defpackage;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: i4d  reason: default package */
/* loaded from: classes2.dex */
final class i4d implements Runnable {
    final /* synthetic */ y6b a;
    final /* synthetic */ d5d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i4d(d5d d5dVar, y6b y6bVar) {
        this.b = d5dVar;
        this.a = y6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        a97 a97Var;
        a97 a97Var2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                d5d d5dVar = this.b;
                a97Var = d5dVar.c;
                if (a97Var != null) {
                    a97Var2 = d5dVar.c;
                    a97Var2.onSuccess(this.a.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
