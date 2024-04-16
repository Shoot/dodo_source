package defpackage;

import defpackage.fn0;
import defpackage.sk9;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"T", "Ly6b;", "a", "(Ly6b;Lcv1;)Ljava/lang/Object;", "Lnn0;", "cancellationTokenSource", "b", "(Ly6b;Lnn0;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {1, 6, 0})
/* renamed from: q7b  reason: default package */
/* loaded from: classes3.dex */
public final class q7b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ly6b;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ly6b;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: q7b$a */
    /* loaded from: classes3.dex */
    public static final class a<TResult> implements n77 {
        final /* synthetic */ fn0<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(fn0<? super T> fn0Var) {
            this.a = fn0Var;
        }

        @Override // defpackage.n77
        public final void a(y6b<T> y6bVar) {
            Exception l = y6bVar.l();
            if (l == null) {
                if (y6bVar.o()) {
                    fn0.a.a(this.a, null, 1, null);
                    return;
                }
                cv1 cv1Var = this.a;
                sk9.a aVar = sk9.b;
                cv1Var.resumeWith(sk9.b(y6bVar.m()));
                return;
            }
            cv1 cv1Var2 = this.a;
            sk9.a aVar2 = sk9.b;
            cv1Var2.resumeWith(sk9.b(vk9.a(l)));
        }
    }

    public static final <T> Object a(y6b<T> y6bVar, cv1<? super T> cv1Var) {
        return b(y6bVar, null, cv1Var);
    }

    private static final <T> Object b(y6b<T> y6bVar, nn0 nn0Var, cv1<? super T> cv1Var) {
        cv1 c;
        Object d;
        if (!y6bVar.p()) {
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            y6bVar.d(p23.a, new a(gn0Var));
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            return s;
        }
        Exception l = y6bVar.l();
        if (l == null) {
            if (!y6bVar.o()) {
                return y6bVar.m();
            }
            throw new CancellationException("Task " + y6bVar + " was cancelled normally.");
        }
        throw l;
    }
}
