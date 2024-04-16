package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OrderPizzeriaStateService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001d"}, d2 = {"Lwg7;", "Lug7;", "Lj63;", "event", "", "g", "Ld88;", e.a, "b", "pizzeria", "a", "", c.a, "", "orderPizzeriaId", DateTokenConverter.CONVERTER_KEY, "isPizzeriaOpen", "f", "Lk63;", "Lk63;", "domainEvents", "La98;", "La98;", "pizzeriaRepository", "Ld88;", "orderPizzeria", "Z", "<init>", "(Lk63;La98;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wg7  reason: default package */
/* loaded from: classes4.dex */
public final class wg7 implements ug7 {
    private final k63 a;
    private final a98 b;
    private d88 c;
    private boolean d;

    public wg7(k63 k63Var, a98 a98Var) {
        z65.h(k63Var, "domainEvents");
        z65.h(a98Var, "pizzeriaRepository");
        this.a = k63Var;
        this.b = a98Var;
        this.c = d88.x.a();
        this.d = true;
    }

    private final void g(j63 j63Var) {
        this.a.b(j63Var);
    }

    @Override // defpackage.vg7
    public void a(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        boolean c = c();
        this.c = d88Var;
        if (c != d88Var.Q()) {
            g(j63.d);
        }
    }

    @Override // defpackage.vg7
    public d88 b() {
        return this.c;
    }

    @Override // defpackage.vg7
    public boolean c() {
        if (this.c.Q() && this.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vg7
    public void d(String str) {
        z65.h(str, "orderPizzeriaId");
        d88 a = this.b.a(str);
        if (a == null) {
            a = d88.x.a();
        }
        if (!z65.c(a, this.c)) {
            a(a);
        }
    }

    @Override // defpackage.vg7
    public d88 e() {
        d88 d88Var = this.c;
        if (!(!z65.c(d88Var, d88.x.a()))) {
            return null;
        }
        return d88Var;
    }

    @Override // defpackage.ug7
    public void f(boolean z) {
        this.d = z;
        g(j63.d);
    }
}
