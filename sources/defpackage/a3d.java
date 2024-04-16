package defpackage;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: a3d  reason: default package */
/* loaded from: classes2.dex */
final class a3d implements Runnable {
    final /* synthetic */ y6b a;
    final /* synthetic */ r3d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3d(r3d r3dVar, y6b y6bVar) {
        this.b = r3dVar;
        this.a = y6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        a87 a87Var;
        a87 a87Var2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                r3d r3dVar = this.b;
                a87Var = r3dVar.c;
                if (a87Var != null) {
                    a87Var2 = r3dVar.c;
                    a87Var2.onFailure((Exception) gh8.j(this.a.l()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
