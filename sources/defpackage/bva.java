package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H&J\b\u0010\u0005\u001a\u00020\u0000H&R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lbva;", "", "value", "", c.a, DateTokenConverter.CONVERTER_KEY, "", "a", "I", "f", "()I", Image.TYPE_HIGH, "(I)V", "snapshotId", "b", "Lbva;", e.a, "()Lbva;", "g", "(Lbva;)V", StatisticManager.NEXT, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bva  reason: default package */
/* loaded from: classes.dex */
public abstract class bva {
    private int a = fpa.F().f();
    private bva b;

    public abstract void c(bva bvaVar);

    public abstract bva d();

    public final bva e() {
        return this.b;
    }

    public final int f() {
        return this.a;
    }

    public final void g(bva bvaVar) {
        this.b = bvaVar;
    }

    public final void h(int i) {
        this.a = i;
    }
}
