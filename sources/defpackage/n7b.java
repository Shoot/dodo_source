package defpackage;

import defpackage.fic;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* renamed from: n7b  reason: default package */
/* loaded from: classes.dex */
public class n7b {
    private static fic a = new fic();

    public static <TResult> TResult a(v6b<TResult> v6bVar) throws ExecutionException, InterruptedException {
        fic.c("await must not be called on the UI thread");
        if (v6bVar.g()) {
            return (TResult) fic.b(v6bVar);
        }
        fic.b bVar = new fic.b();
        v6bVar.c(bVar).b(bVar);
        bVar.a.await();
        return (TResult) fic.b(v6bVar);
    }

    public static <TResult> v6b<TResult> b(Callable<TResult> callable) {
        return a.a(f7b.a(), callable);
    }
}
