package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0016B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/d;", "Lda1;", "", "", "value", "", "v", "isEmpty", "other", "equals", "hashCode", "", "toString", "z", "()Ljava/lang/Integer;", "start", "x", "endInclusive", "<init>", "(II)V", com.huawei.hms.push.e.a, "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class IntRange extends d implements da1<Integer> {
    public static final a e = new a(null);
    private static final IntRange f = new IntRange(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntRange$a;", "", "Lkotlin/ranges/IntRange;", "EMPTY", "Lkotlin/ranges/IntRange;", "a", "()Lkotlin/ranges/IntRange;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange a() {
            return IntRange.f;
        }
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // kotlin.ranges.d
    public boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (h() != intRange.h() || k() != intRange.k()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + k();
    }

    @Override // kotlin.ranges.d
    public boolean isEmpty() {
        if (h() > k()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.d
    public String toString() {
        return h() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + k();
    }

    public boolean v(int i) {
        if (h() <= i && i <= k()) {
            return true;
        }
        return false;
    }

    public Integer x() {
        return Integer.valueOf(k());
    }

    public Integer z() {
        return Integer.valueOf(h());
    }
}
