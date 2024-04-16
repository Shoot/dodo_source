package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.vo9;
import kotlin.Metadata;
/* compiled from: FailedPlan.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lso3;", "Lvo9$b;", "Lvo9$a;", Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, "", e.a, "b", "i", "a", "Lvo9$a;", c.a, "()Lvo9$a;", "result", "", "Z", "g", "()Z", "isReady", "", "<init>", "(Ljava/lang/Throwable;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: so3  reason: default package */
/* loaded from: classes3.dex */
public final class so3 implements vo9.b {
    private final vo9.a a;
    private final boolean b;

    public so3(Throwable th) {
        z65.h(th, e.a);
        this.a = new vo9.a(this, null, th, 2, null);
    }

    @Override // defpackage.vo9.b
    public /* bridge */ /* synthetic */ u79 a() {
        return (u79) e();
    }

    @Override // defpackage.vo9.b
    /* renamed from: b */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }

    public final vo9.a c() {
        return this.a;
    }

    @Override // defpackage.vo9.b
    public vo9.a d() {
        return this.a;
    }

    public Void e() {
        throw new IllegalStateException("unexpected call".toString());
    }

    @Override // defpackage.vo9.b
    public /* bridge */ /* synthetic */ vo9.b f() {
        return (vo9.b) i();
    }

    @Override // defpackage.vo9.b
    public boolean g() {
        return this.b;
    }

    @Override // defpackage.vo9.b
    public vo9.a h() {
        return this.a;
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry".toString());
    }
}
