package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocationFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u000b\u0010\u0014¨\u0006\u0018"}, d2 = {"Lbw5;", "", "Law5;", "a", "", "J", "getUpdateInterval", "()J", "setUpdateInterval", "(J)V", "updateInterval", "b", "getFastestInterval", "setFastestInterval", "fastestInterval", "Lwj8;", c.a, "Lwj8;", "getPriority", "()Lwj8;", "(Lwj8;)V", "priority", "<init>", "(JJLwj8;)V", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: bw5  reason: default package */
/* loaded from: classes2.dex */
public final class bw5 {
    private long a;
    private long b;
    private wj8 c;

    public bw5() {
        this(0L, 0L, null, 7, null);
    }

    public final aw5 a() {
        return new aw5(this.a, this.b, this.c.a());
    }

    public final void b(wj8 wj8Var) {
        z65.h(wj8Var, "<set-?>");
        this.c = wj8Var;
    }

    public bw5(long j, long j2, wj8 wj8Var) {
        z65.h(wj8Var, "priority");
        this.a = j;
        this.b = j2;
        this.c = wj8Var;
    }

    public /* synthetic */ bw5(long j, long j2, wj8 wj8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5000L : j, (i & 2) != 0 ? 1000L : j2, (i & 4) != 0 ? wj8.PRIORITY_HIGH_ACCURACY : wj8Var);
    }
}
