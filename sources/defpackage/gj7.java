package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OrderSummaryExternalRouterImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000f"}, d2 = {"Lgj7;", "Lfj7;", "", "orderId", "", c.a, "", "isProfile2024", "a", "b", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gj7  reason: default package */
/* loaded from: classes4.dex */
public final class gj7 implements fj7 {
    private final f63 a;

    public gj7(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // defpackage.fj7
    public void a(boolean z) {
        if (z) {
            this.a.c(vo8.a);
        } else {
            this.a.c(fo8.a);
        }
    }

    @Override // defpackage.fj7
    public void b() {
        this.a.c(i56.a(n56.a));
    }

    @Override // defpackage.fj7
    public void c(String str) {
        z65.h(str, "orderId");
        this.a.e(new cta(str));
    }
}
