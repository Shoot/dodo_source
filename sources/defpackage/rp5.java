package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
/* compiled from: LifecycleService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0017J\"\u0010\r\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lrp5;", "Landroid/app/Service;", "Lop5;", "", "onCreate", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/IBinder;", "onBind", "", "startId", "onStart", "flags", "onStartCommand", "onDestroy", "Landroidx/lifecycle/q;", "a", "Landroidx/lifecycle/q;", "dispatcher", "Landroidx/lifecycle/d;", "getLifecycle", "()Landroidx/lifecycle/d;", "lifecycle", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rp5  reason: default package */
/* loaded from: classes.dex */
public class rp5 extends Service implements op5 {
    private final q a = new q(this);

    @Override // defpackage.op5
    public d getLifecycle() {
        return this.a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        this.a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.a.e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
