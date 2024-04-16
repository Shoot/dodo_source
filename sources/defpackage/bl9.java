package defpackage;
/* compiled from: Retries.java */
/* renamed from: bl9  reason: default package */
/* loaded from: classes2.dex */
public final class bl9 {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, t84<TInput, TResult, TException> t84Var, am9<TInput, TResult> am9Var) throws Throwable {
        TResult apply;
        if (i < 1) {
            return t84Var.apply(tinput);
        }
        do {
            apply = t84Var.apply(tinput);
            tinput = am9Var.a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
