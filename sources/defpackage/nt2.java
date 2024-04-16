package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: DeferredTimeService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnt2;", "", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nt2  reason: default package */
/* loaded from: classes4.dex */
public interface nt2 {
    public static final a a = a.a;

    /* compiled from: DeferredTimeService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"Lnt2$a;", "", "", "b", "J", "getDELIVERY_START_OFFSET_MILLIS", "()J", "DELIVERY_START_OFFSET_MILLIS", c.a, "getCARRYOUT_START_OFFSET_MILLIS", "CARRYOUT_START_OFFSET_MILLIS", DateTokenConverter.CONVERTER_KEY, "getTIME_STEP_MILLIS", "TIME_STEP_MILLIS", e.a, "getFULL_DAY_MILLIS", "FULL_DAY_MILLIS", "f", "a", "DELIVERY_DEFERRED_TIME_RANGE", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nt2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final long b;
        private static final long c;
        private static final long d;
        private static final long e;
        private static final long f;

        static {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            b = timeUnit.toMillis(30L);
            c = timeUnit.toMillis(25L);
            d = timeUnit.toMillis(15L);
            e = TimeUnit.HOURS.toMillis(24L);
            f = timeUnit.toMillis(30L);
        }

        private a() {
        }

        public final long a() {
            return f;
        }
    }
}
