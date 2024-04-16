package defpackage;

import java.util.concurrent.Callable;
/* compiled from: FlowableScalarXMap.java */
/* renamed from: k14  reason: default package */
/* loaded from: classes3.dex */
public final class k14 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowableScalarXMap.java */
    /* renamed from: k14$a */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends l04<R> {
        final T c;
        final z84<? super T, ? extends ls8<? extends R>> d;

        a(T t, z84<? super T, ? extends ls8<? extends R>> z84Var) {
            this.c = t;
            this.d = z84Var;
        }

        @Override // defpackage.l04
        public void S(i1b<? super R> i1bVar) {
            try {
                ls8 ls8Var = (ls8) x47.e(this.d.apply((T) this.c), "The mapper returned a null Publisher");
                if (ls8Var instanceof Callable) {
                    try {
                        Object call = ((Callable) ls8Var).call();
                        if (call == null) {
                            vg3.a(i1bVar);
                            return;
                        } else {
                            i1bVar.c(new ev9(i1bVar, call));
                            return;
                        }
                    } catch (Throwable th) {
                        rl3.b(th);
                        vg3.i(th, i1bVar);
                        return;
                    }
                }
                ls8Var.a(i1bVar);
            } catch (Throwable th2) {
                vg3.i(th2, i1bVar);
            }
        }
    }

    public static <T, U> l04<U> a(T t, z84<? super T, ? extends ls8<? extends U>> z84Var) {
        return tp9.l(new a(t, z84Var));
    }

    public static <T, R> boolean b(ls8<T> ls8Var, i1b<? super R> i1bVar, z84<? super T, ? extends ls8<? extends R>> z84Var) {
        if (ls8Var instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) ls8Var).call();
                if (obj == 0) {
                    vg3.a(i1bVar);
                    return true;
                }
                try {
                    ls8 ls8Var2 = (ls8) x47.e(z84Var.apply(obj), "The mapper returned a null Publisher");
                    if (ls8Var2 instanceof Callable) {
                        try {
                            Object call = ((Callable) ls8Var2).call();
                            if (call == null) {
                                vg3.a(i1bVar);
                                return true;
                            }
                            i1bVar.c(new ev9(i1bVar, call));
                        } catch (Throwable th) {
                            rl3.b(th);
                            vg3.i(th, i1bVar);
                            return true;
                        }
                    } else {
                        ls8Var2.a(i1bVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    rl3.b(th2);
                    vg3.i(th2, i1bVar);
                    return true;
                }
            } catch (Throwable th3) {
                rl3.b(th3);
                vg3.i(th3, i1bVar);
                return true;
            }
        }
        return false;
    }
}
