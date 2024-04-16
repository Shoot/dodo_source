package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0014B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/f;", "Lkotlin/ranges/e;", "Lda1;", "", "", "value", "", "t", "isEmpty", "other", "equals", "", "hashCode", "", "toString", "start", "endInclusive", "<init>", "(JJ)V", com.huawei.hms.push.e.a, "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class f extends e implements da1<Long> {
    public static final a e = new a(null);
    private static final f f = new f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/f$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // kotlin.ranges.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (h() != fVar.h() || k() != fVar.k()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.e
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (h() ^ (h() >>> 32))) + (k() ^ (k() >>> 32)));
    }

    @Override // kotlin.ranges.e
    public boolean isEmpty() {
        if (h() > k()) {
            return true;
        }
        return false;
    }

    public boolean t(long j) {
        if (h() <= j && j <= k()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.e
    public String toString() {
        return h() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + k();
    }
}
