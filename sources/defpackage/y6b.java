package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: y6b  reason: default package */
/* loaded from: classes2.dex */
public abstract class y6b<TResult> {
    @NonNull
    public y6b<TResult> a(@NonNull l77 l77Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    public y6b<TResult> b(@NonNull Executor executor, @NonNull l77 l77Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public y6b<TResult> c(@NonNull n77<TResult> n77Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public y6b<TResult> d(@NonNull Executor executor, @NonNull n77<TResult> n77Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract y6b<TResult> e(@NonNull a87 a87Var);

    @NonNull
    public abstract y6b<TResult> f(@NonNull Executor executor, @NonNull a87 a87Var);

    @NonNull
    public abstract y6b<TResult> g(@NonNull a97<? super TResult> a97Var);

    @NonNull
    public abstract y6b<TResult> h(@NonNull Executor executor, @NonNull a97<? super TResult> a97Var);

    @NonNull
    public <TContinuationResult> y6b<TContinuationResult> i(@NonNull dv1<TResult, TContinuationResult> dv1Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> y6b<TContinuationResult> j(@NonNull Executor executor, @NonNull dv1<TResult, TContinuationResult> dv1Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> y6b<TContinuationResult> k(@NonNull Executor executor, @NonNull dv1<TResult, y6b<TContinuationResult>> dv1Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception l();

    public abstract TResult m();

    public abstract <X extends Throwable> TResult n(@NonNull Class<X> cls) throws Throwable;

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    @NonNull
    public <TContinuationResult> y6b<TContinuationResult> r(@NonNull r1b<TResult, TContinuationResult> r1bVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    public <TContinuationResult> y6b<TContinuationResult> s(@NonNull Executor executor, @NonNull r1b<TResult, TContinuationResult> r1bVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
