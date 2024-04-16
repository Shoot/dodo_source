package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007*\f\b\u0007\u0010\b\"\u00020\u00012\u00020\u0001¨\u0006\t"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lem3;", "b", "(Ljava/util/concurrent/ExecutorService;)Lem3;", "Ljava/util/concurrent/Executor;", "Lkx1;", "a", "(Ljava/util/concurrent/Executor;)Lkx1;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: jm3  reason: default package */
/* loaded from: classes3.dex */
public final class jm3 {
    public static final kx1 a(Executor executor) {
        u33 u33Var;
        kx1 kx1Var;
        if (executor instanceof u33) {
            u33Var = (u33) executor;
        } else {
            u33Var = null;
        }
        if (u33Var == null || (kx1Var = u33Var.a) == null) {
            return new fm3(executor);
        }
        return kx1Var;
    }

    public static final em3 b(ExecutorService executorService) {
        return new fm3(executorService);
    }
}
