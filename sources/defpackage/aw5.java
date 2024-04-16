package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocationRequest.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0017"}, d2 = {"Law5;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", c.a, "()J", "updateInterval", "b", "fastestInterval", "I", "()I", "locationRequestPriority", "<init>", "(JJI)V", e.a, "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: aw5  reason: default package */
/* loaded from: classes2.dex */
public final class aw5 {
    private final long a;
    private final long b;
    private final int c;
    public static final a e = new a(null);
    private static final aw5 d = new aw5(5000, 1000, 100);

    /* compiled from: LocationRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Law5$a;", "", "", "PRIORITY_BALANCED_POWER_ACCURACY", "I", "PRIORITY_HIGH_ACCURACY", "PRIORITY_LOW_POWER", "<init>", "()V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: aw5$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public aw5(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aw5) {
                aw5 aw5Var = (aw5) obj;
                if (this.a != aw5Var.a || this.b != aw5Var.b || this.c != aw5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((ax1.a(this.a) * 31) + ax1.a(this.b)) * 31) + this.c;
    }

    public String toString() {
        return "LocationRequest(updateInterval=" + this.a + ", fastestInterval=" + this.b + ", locationRequestPriority=" + this.c + ")";
    }
}
