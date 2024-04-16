package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"", "a", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "b", "I", "CORE_POOL_SIZE", c.a, "MAX_POOL_SIZE", DateTokenConverter.CONVERTER_KEY, "IDLE_WORKER_KEEP_ALIVE_NS", "Lcw9;", e.a, "Lcw9;", "schedulerTimeSource", "Lb7b;", "f", "Lb7b;", "NonBlockingContext", "g", "BlockingContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: r7b  reason: default package */
/* loaded from: classes3.dex */
public final class r7b {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static cw9 e;
    public static final b7b f;
    public static final b7b g;

    static {
        long e2;
        int e3;
        int d2;
        int d3;
        long e4;
        e2 = e5b.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        a = e2;
        e3 = i.e(c5b.a(), 2);
        d2 = e5b.d("kotlinx.coroutines.scheduler.core.pool.size", e3, 1, 0, 8, null);
        b = d2;
        d3 = e5b.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        c = d3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e4 = e5b.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        d = timeUnit.toNanos(e4);
        e = ts6.a;
        f = new c7b(0);
        g = new c7b(1);
    }
}
