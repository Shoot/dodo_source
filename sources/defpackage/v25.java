package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
/* compiled from: InitializeLock.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lv25;", "", "Lv25$a;", "state", "", "a", "(Lv25$a;)V", "b", c.a, "", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/Map;", "map", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v25  reason: default package */
/* loaded from: classes.dex */
public final class v25 {
    public static final v25 a = new v25();
    private static final Map<a, CountDownLatch> b;

    /* compiled from: InitializeLock.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lv25$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v25$a */
    /* loaded from: classes.dex */
    public enum a {
        SAVE_MINDBOX_CONFIG,
        APP_STARTED
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v25$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((a) t).ordinal()), Integer.valueOf(((a) t2).ordinal()));
            return d;
        }
    }

    static {
        Map<a, CountDownLatch> m;
        m = g86.m(lnb.a(a.SAVE_MINDBOX_CONFIG, new CountDownLatch(1)), lnb.a(a.APP_STARTED, new CountDownLatch(1)));
        b = m;
    }

    private v25() {
    }

    public final void a(a aVar) {
        List<a> y0;
        z65.h(aVar, "state");
        a[] values = a.values();
        ArrayList arrayList = new ArrayList();
        for (a aVar2 : values) {
            if (aVar.compareTo(aVar2) >= 0) {
                arrayList.add(aVar2);
            }
        }
        y0 = sc1.y0(arrayList, new b());
        ArrayList<CountDownLatch> arrayList2 = new ArrayList();
        for (a aVar3 : y0) {
            CountDownLatch countDownLatch = b.get(aVar3);
            if (countDownLatch != null) {
                arrayList2.add(countDownLatch);
            }
        }
        for (CountDownLatch countDownLatch2 : arrayList2) {
            countDownLatch2.await();
        }
    }

    public final void b(a aVar) {
        z65.h(aVar, "state");
        CountDownLatch countDownLatch = b.get(aVar);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        gk6.d(this, "State " + aVar + " completed");
    }

    public final void c(a aVar) {
        z65.h(aVar, "state");
        Map<a, CountDownLatch> map = b;
        CountDownLatch countDownLatch = map.get(aVar);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        map.put(aVar, new CountDownLatch(1));
        gk6.d(this, "State " + aVar + " is reset");
    }
}
