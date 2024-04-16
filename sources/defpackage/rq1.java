package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ConnectionPool.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB;\b\u0010\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u000b\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\t¨\u0006\u0018"}, d2 = {"Lrq1;", "", "Lv79;", "a", "Lv79;", "b", "()Lv79;", "delegate", "Lqq1;", "()Lqq1;", "connectionListener", "<init>", "(Lv79;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lk7b;", "taskRunner", "(IJLjava/util/concurrent/TimeUnit;Lk7b;Lqq1;)V", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: rq1  reason: default package */
/* loaded from: classes3.dex */
public final class rq1 {
    private final v79 a;

    public rq1(v79 v79Var) {
        z65.h(v79Var, "delegate");
        this.a = v79Var;
    }

    public final qq1 a() {
        return this.a.d();
    }

    public final v79 b() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rq1(int i, long j, TimeUnit timeUnit, k7b k7bVar, qq1 qq1Var) {
        this(new v79(k7bVar, i, j, timeUnit, qq1Var));
        z65.h(timeUnit, "timeUnit");
        z65.h(k7bVar, "taskRunner");
        z65.h(qq1Var, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rq1(int i, long j, TimeUnit timeUnit) {
        this(i, j, timeUnit, k7b.m, qq1.a.a());
        z65.h(timeUnit, "timeUnit");
    }

    public rq1() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
