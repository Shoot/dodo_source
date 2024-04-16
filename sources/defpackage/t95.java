package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0001J\u0018\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ0\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0003¢\u0006\u0004\b\f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\t\u0010\u0012\u001a\u00020\nH\u0096\u0001J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001f"}, d2 = {"Lt95;", "R", "Lkr5;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "", "k", "", "cancel", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "result", "b", "(Ljava/lang/Object;)V", "Ll95;", "a", "Ll95;", "job", "Lufa;", "Lufa;", "underlying", "<init>", "(Ll95;Lufa;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: t95  reason: default package */
/* loaded from: classes.dex */
public final class t95<R> implements kr5<R> {
    private final l95 a;
    private final ufa<R> b;

    /* compiled from: ListenableFuture.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"R", "", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: t95$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ t95<R> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t95<R> t95Var) {
            super(1);
            this.a = t95Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null) {
                if (!((t95) this.a).b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th instanceof CancellationException) {
                ((t95) this.a).b.cancel(true);
            } else {
                ufa ufaVar = ((t95) this.a).b;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                ufaVar.q(th);
            }
        }
    }

    public t95(l95 l95Var, ufa<R> ufaVar) {
        z65.h(l95Var, "job");
        z65.h(ufaVar, "underlying");
        this.a = l95Var;
        this.b = ufaVar;
        l95Var.r(new a(this));
    }

    public final void b(R r) {
        this.b.p(r);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.b.isDone();
    }

    @Override // defpackage.kr5
    public void k(Runnable runnable, Executor executor) {
        this.b.k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ t95(defpackage.l95 r1, defpackage.ufa r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            ufa r2 = defpackage.ufa.t()
            java.lang.String r3 = "create()"
            defpackage.z65.g(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t95.<init>(l95, ufa, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
