package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
/* compiled from: RequestCounterInterceptor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011¨\u0006\u0015"}, d2 = {"Lli9;", "", "Lsq4;", RemoteMessageConst.Notification.URL, "", c.a, "", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/ConcurrentHashMap;", "finishedRequestPathes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_needQueryCounters", "", "()Z", "needQueryCounters", "<init>", "()V", "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: li9  reason: default package */
/* loaded from: classes4.dex */
public final class li9 {
    private final ConcurrentHashMap<String, AtomicInteger> a = new ConcurrentHashMap<>();
    private AtomicBoolean b = new AtomicBoolean(false);

    public final String a(sq4 sq4Var) {
        String K0;
        z65.h(sq4Var, "<this>");
        K0 = m0b.K0(sq4Var.c(), "dodois.dev", null, 2, null);
        String e = sq4Var.e();
        return K0 + e;
    }

    public final boolean b() {
        return this.b.get();
    }

    public final int c(sq4 sq4Var) {
        AtomicInteger putIfAbsent;
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = this.a;
        String a = a(sq4Var);
        AtomicInteger atomicInteger = concurrentHashMap.get(a);
        if (atomicInteger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (atomicInteger = new AtomicInteger(1)))) != null) {
            atomicInteger = putIfAbsent;
        }
        return atomicInteger.getAndIncrement();
    }
}
