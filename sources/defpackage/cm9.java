package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.vo9;
import kotlin.Metadata;
/* compiled from: ReusePlan.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcm9;", "Lvo9$b;", "", c.a, e.a, "Lu79;", "a", "b", "j", "Lu79;", "i", "()Lu79;", "connection", "", "Z", "g", "()Z", "isReady", "<init>", "(Lu79;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: cm9  reason: default package */
/* loaded from: classes3.dex */
public final class cm9 implements vo9.b {
    private final u79 a;
    private final boolean b;

    public cm9(u79 u79Var) {
        z65.h(u79Var, "connection");
        this.a = u79Var;
        this.b = true;
    }

    @Override // defpackage.vo9.b
    public u79 a() {
        return this.a;
    }

    @Override // defpackage.vo9.b
    /* renamed from: b */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel".toString());
    }

    public Void c() {
        throw new IllegalStateException("already connected".toString());
    }

    @Override // defpackage.vo9.b
    public /* bridge */ /* synthetic */ vo9.a d() {
        return (vo9.a) e();
    }

    public Void e() {
        throw new IllegalStateException("already connected".toString());
    }

    @Override // defpackage.vo9.b
    public /* bridge */ /* synthetic */ vo9.b f() {
        return (vo9.b) j();
    }

    @Override // defpackage.vo9.b
    public boolean g() {
        return this.b;
    }

    @Override // defpackage.vo9.b
    public /* bridge */ /* synthetic */ vo9.a h() {
        return (vo9.a) c();
    }

    public final u79 i() {
        return this.a;
    }

    public Void j() {
        throw new IllegalStateException("unexpected retry".toString());
    }
}
