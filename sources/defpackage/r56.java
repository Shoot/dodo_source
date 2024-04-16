package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: MakePaymentAnalyticsImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lr56;", "Lq56;", "", "paymentId", "", c.a, "", "isError", "b", "a", "Lgc;", "Lgc;", "analytics", "Lava;", "Lava;", "stateProvider", "Ldu7;", DateTokenConverter.CONVERTER_KEY, "()Ldu7;", "paymentType", "<init>", "(Lgc;Lava;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: r56  reason: default package */
/* loaded from: classes3.dex */
public final class r56 implements q56 {
    private final gc a;
    private final ava b;

    public r56(gc gcVar, ava avaVar) {
        z65.h(gcVar, "analytics");
        z65.h(avaVar, "stateProvider");
        this.a = gcVar;
        this.b = avaVar;
    }

    private final du7 d() {
        return wn3.a(this.b.e());
    }

    @Override // defpackage.q56
    public void a() {
        this.a.a(v31.b(oe8.b));
    }

    @Override // defpackage.q56
    public void b(String str, boolean z) {
        z65.h(str, "paymentId");
        this.a.a(v31.f(str, d(), z));
    }

    @Override // defpackage.q56
    public void c(String str) {
        z65.h(str, "paymentId");
        this.a.a(v31.e(str, d()));
    }
}
