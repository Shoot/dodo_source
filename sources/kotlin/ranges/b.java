package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0014B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0015"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/ranges/a;", "Lda1;", "", "", "value", "", "t", "isEmpty", "other", "equals", "", "hashCode", "", "toString", "start", "endInclusive", "<init>", "(CC)V", com.huawei.hms.push.e.a, "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class b extends kotlin.ranges.a implements da1<Character> {
    public static final a e = new a(null);
    private static final b f = new b(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/b$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (h() != bVar.h() || k() != bVar.k()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (h() * 31) + k();
    }

    public boolean isEmpty() {
        if (z65.j(h(), k()) > 0) {
            return true;
        }
        return false;
    }

    public boolean t(char c) {
        if (z65.j(h(), c) <= 0 && z65.j(c, k()) <= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return h() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + k();
    }
}
