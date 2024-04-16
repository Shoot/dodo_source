package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: ForwardingTimeout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lz54;", "Lxgb;", "delegate", "j", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", Image.TYPE_HIGH, "", e.a, c.a, "deadlineNanoTime", DateTokenConverter.CONVERTER_KEY, "b", "a", "", "f", "Lxgb;", "i", "()Lxgb;", "setDelegate", "(Lxgb;)V", "<init>", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: z54  reason: default package */
/* loaded from: classes3.dex */
public class z54 extends xgb {
    private xgb f;

    public z54(xgb xgbVar) {
        z65.h(xgbVar, "delegate");
        this.f = xgbVar;
    }

    @Override // defpackage.xgb
    public xgb a() {
        return this.f.a();
    }

    @Override // defpackage.xgb
    public xgb b() {
        return this.f.b();
    }

    @Override // defpackage.xgb
    public long c() {
        return this.f.c();
    }

    @Override // defpackage.xgb
    public xgb d(long j) {
        return this.f.d(j);
    }

    @Override // defpackage.xgb
    public boolean e() {
        return this.f.e();
    }

    @Override // defpackage.xgb
    public void f() throws IOException {
        this.f.f();
    }

    @Override // defpackage.xgb
    public xgb g(long j, TimeUnit timeUnit) {
        z65.h(timeUnit, "unit");
        return this.f.g(j, timeUnit);
    }

    @Override // defpackage.xgb
    public long h() {
        return this.f.h();
    }

    public final xgb i() {
        return this.f;
    }

    public final z54 j(xgb xgbVar) {
        z65.h(xgbVar, "delegate");
        this.f = xgbVar;
        return this;
    }
}
