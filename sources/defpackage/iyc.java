package defpackage;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: iyc  reason: default package */
/* loaded from: classes2.dex */
final class iyc implements Runnable {
    final /* synthetic */ qzc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public iyc(qzc qzcVar) {
        this.a = qzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        l77 l77Var;
        l77 l77Var2;
        obj = this.a.b;
        synchronized (obj) {
            try {
                qzc qzcVar = this.a;
                l77Var = qzcVar.c;
                if (l77Var != null) {
                    l77Var2 = qzcVar.c;
                    l77Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
