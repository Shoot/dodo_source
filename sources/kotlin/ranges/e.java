package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB!\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, d2 = {"Lkotlin/ranges/e;", "", "", "Lly5;", "p", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "a", "J", Image.TYPE_HIGH, "()J", "first", "b", "k", "last", com.huawei.hms.opendevice.c.a, "getStep", "step", "start", "endInclusive", "<init>", "(JJJ)V", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class e implements Iterable<Long>, be5 {
    public static final a d = new a(null);
    private final long a;
    private final long b;
    private final long c;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lkotlin/ranges/e$a;", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/e;", "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(long j, long j2, long j3) {
            return new e(j, j2, j3);
        }
    }

    public e(long j, long j2, long j3) {
        if (j3 != 0) {
            if (j3 != Long.MIN_VALUE) {
                this.a = j;
                this.b = fp8.d(j, j2, j3);
                this.c = j3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.a != eVar.a || this.b != eVar.b || this.c != eVar.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final long h() {
        return this.a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.c;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.c > 0L ? 1 : (this.c == 0L ? 0 : -1));
        long j = this.a;
        long j2 = this.b;
        if (i > 0) {
            if (j <= j2) {
                return false;
            }
        } else if (j >= j2) {
            return false;
        }
        return true;
    }

    public final long k() {
        return this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: p */
    public ly5 iterator() {
        return new ny5(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb.append(this.b);
            sb.append(" step ");
            j = this.c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            j = -this.c;
        }
        sb.append(j);
        return sb.toString();
    }
}
