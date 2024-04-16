package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class s5<V> extends FutureTask<V> implements Comparable<s5<V>> {
    private final long a;
    final boolean b;
    private final String c;
    private final /* synthetic */ o5 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(o5 o5Var, Runnable runnable, boolean z, String str) {
        super(ytc.a().b(runnable), null);
        AtomicLong atomicLong;
        this.d = o5Var;
        gh8.j(str);
        atomicLong = o5.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            o5Var.n().F().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        s5 s5Var = (s5) obj;
        boolean z = this.b;
        if (z != s5Var.b) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        long j = this.a;
        long j2 = s5Var.a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.n().H().b("Two tasks share the same index. index", Long.valueOf(this.a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.d.n().F().b(this.c, th);
        super.setException(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(o5 o5Var, Callable<V> callable, boolean z, String str) {
        super(ytc.a().a(callable));
        AtomicLong atomicLong;
        this.d = o5Var;
        gh8.j(str);
        atomicLong = o5.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            o5Var.n().F().a("Tasks index overflow");
        }
    }
}
