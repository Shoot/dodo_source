package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: SystemTimeProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lg5b;", "Lf5b;", "", "b", "serverTime", "", c.a, "Ljava/util/TimeZone;", "a", "Lsgb;", "Lsgb;", "timeRounder", "Lida;", "Lida;", "serverDeltaTimeRepository", "<init>", "(Lsgb;Lida;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g5b  reason: default package */
/* loaded from: classes4.dex */
public final class g5b implements f5b {
    private final sgb a;
    private final ida b;

    public g5b(sgb sgbVar, ida idaVar) {
        z65.h(sgbVar, "timeRounder");
        z65.h(idaVar, "serverDeltaTimeRepository");
        this.a = sgbVar;
        this.b = idaVar;
    }

    @Override // defpackage.f5b
    public TimeZone a() {
        TimeZone timeZone = TimeZone.getDefault();
        z65.g(timeZone, "getDefault(...)");
        return timeZone;
    }

    @Override // defpackage.f5b
    public long b() {
        return System.currentTimeMillis() + this.b.a();
    }

    @Override // defpackage.f5b
    public void c(long j) {
        this.b.b(this.a.a(j - System.currentTimeMillis()));
    }
}
