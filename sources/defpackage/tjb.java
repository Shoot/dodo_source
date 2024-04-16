package defpackage;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TraceCallable.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ltjb;", "T", "Ljava/util/concurrent/Callable;", "Lqjb;", "", "start", "stop", "call", "()Ljava/lang/Object;", "a", "Lqjb;", "trace", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "action", "<init>", "(Lqjb;Lkotlin/jvm/functions/Function0;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tjb  reason: default package */
/* loaded from: classes4.dex */
public final class tjb<T> implements Callable<T>, qjb {
    private final qjb a;
    private final Function0<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public tjb(qjb qjbVar, Function0<? extends T> function0) {
        z65.h(qjbVar, "trace");
        z65.h(function0, "action");
        this.a = qjbVar;
        this.b = function0;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        start();
        T invoke = this.b.invoke();
        stop();
        return invoke;
    }

    @Override // defpackage.qjb
    public void start() {
        this.a.start();
    }

    @Override // defpackage.qjb
    public void stop() {
        this.a.stop();
    }
}
