package defpackage;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: o7b  reason: default package */
/* loaded from: classes2.dex */
public final class o7b {
    public static <TResult> TResult a(@NonNull y6b<TResult> y6bVar) throws ExecutionException, InterruptedException {
        gh8.h();
        gh8.k(y6bVar, "Task must not be null");
        if (y6bVar.p()) {
            return (TResult) j(y6bVar);
        }
        gnc gncVar = new gnc(null);
        k(y6bVar, gncVar);
        gncVar.b();
        return (TResult) j(y6bVar);
    }

    public static <TResult> TResult b(@NonNull y6b<TResult> y6bVar, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        gh8.h();
        gh8.k(y6bVar, "Task must not be null");
        gh8.k(timeUnit, "TimeUnit must not be null");
        if (y6bVar.p()) {
            return (TResult) j(y6bVar);
        }
        gnc gncVar = new gnc(null);
        k(y6bVar, gncVar);
        if (gncVar.c(j, timeUnit)) {
            return (TResult) j(y6bVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    public static <TResult> y6b<TResult> c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        gh8.k(executor, "Executor must not be null");
        gh8.k(callable, "Callback must not be null");
        rbd rbdVar = new rbd();
        executor.execute(new qcd(rbdVar, callable));
        return rbdVar;
    }

    @NonNull
    public static <TResult> y6b<TResult> d(@NonNull Exception exc) {
        rbd rbdVar = new rbd();
        rbdVar.t(exc);
        return rbdVar;
    }

    @NonNull
    public static <TResult> y6b<TResult> e(TResult tresult) {
        rbd rbdVar = new rbd();
        rbdVar.u(tresult);
        return rbdVar;
    }

    @NonNull
    public static y6b<Void> f(Collection<? extends y6b<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (y6b<?> y6bVar : collection) {
                if (y6bVar == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            rbd rbdVar = new rbd();
            rnc rncVar = new rnc(collection.size(), rbdVar);
            for (y6b<?> y6bVar2 : collection) {
                k(y6bVar2, rncVar);
            }
            return rbdVar;
        }
        return e(null);
    }

    @NonNull
    public static y6b<Void> g(y6b<?>... y6bVarArr) {
        if (y6bVarArr != null && y6bVarArr.length != 0) {
            return f(Arrays.asList(y6bVarArr));
        }
        return e(null);
    }

    @NonNull
    public static y6b<List<y6b<?>>> h(Collection<? extends y6b<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return f(collection).k(g7b.a, new tmc(collection));
        }
        return e(Collections.emptyList());
    }

    @NonNull
    public static y6b<List<y6b<?>>> i(y6b<?>... y6bVarArr) {
        if (y6bVarArr != null && y6bVarArr.length != 0) {
            return h(Arrays.asList(y6bVarArr));
        }
        return e(Collections.emptyList());
    }

    private static Object j(@NonNull y6b y6bVar) throws ExecutionException {
        if (y6bVar.q()) {
            return y6bVar.m();
        }
        if (y6bVar.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(y6bVar.l());
    }

    private static void k(y6b y6bVar, mnc mncVar) {
        Executor executor = g7b.b;
        y6bVar.h(executor, mncVar);
        y6bVar.f(executor, mncVar);
        y6bVar.b(executor, mncVar);
    }
}
