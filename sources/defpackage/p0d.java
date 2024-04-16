package defpackage;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: p0d  reason: default package */
/* loaded from: classes2.dex */
final class p0d implements Runnable {
    final /* synthetic */ y6b a;
    final /* synthetic */ f2d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0d(f2d f2dVar, y6b y6bVar) {
        this.b = f2dVar;
        this.a = y6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        n77 n77Var;
        n77 n77Var2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                f2d f2dVar = this.b;
                n77Var = f2dVar.c;
                if (n77Var != null) {
                    n77Var2 = f2dVar.c;
                    n77Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
