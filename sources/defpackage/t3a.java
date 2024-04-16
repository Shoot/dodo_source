package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.tmb;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
/* compiled from: SegmentPool.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0002R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lt3a;", "", "Lr3a;", c.a, tmb.g.SEGMENT_JSON_NAME, "", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lr3a;", "LOCK", DateTokenConverter.CONVERTER_KEY, "HASH_BUCKET_COUNT", "", e.a, "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: t3a  reason: default package */
/* loaded from: classes3.dex */
public final class t3a {
    public static final t3a a = new t3a();
    private static final int b = 65536;
    private static final r3a c = new r3a(new byte[0], 0, 0, false, false);
    private static final int d;
    private static final AtomicReference<r3a>[] e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = highestOneBit;
        AtomicReference<r3a>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        e = atomicReferenceArr;
    }

    private t3a() {
    }

    private final AtomicReference<r3a> a() {
        return e[(int) (Thread.currentThread().getId() & (d - 1))];
    }

    public static final void b(r3a r3aVar) {
        AtomicReference<r3a> a2;
        r3a r3aVar2;
        r3a andSet;
        int i;
        z65.h(r3aVar, tmb.g.SEGMENT_JSON_NAME);
        if (r3aVar.f == null && r3aVar.g == null) {
            if (r3aVar.d || (andSet = (a2 = a.a()).getAndSet((r3aVar2 = c))) == r3aVar2) {
                return;
            }
            if (andSet != null) {
                i = andSet.c;
            } else {
                i = 0;
            }
            if (i >= b) {
                a2.set(andSet);
                return;
            }
            r3aVar.f = andSet;
            r3aVar.b = 0;
            r3aVar.c = i + 8192;
            a2.set(r3aVar);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final r3a c() {
        AtomicReference<r3a> a2 = a.a();
        r3a r3aVar = c;
        r3a andSet = a2.getAndSet(r3aVar);
        if (andSet == r3aVar) {
            return new r3a();
        }
        if (andSet == null) {
            a2.set(null);
            return new r3a();
        }
        a2.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
