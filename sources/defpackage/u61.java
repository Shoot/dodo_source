package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: CheckoutStateProvider.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lu61;", "Lt61;", "Lov0;", "", "Ld41;", "b", "errors", "Lb61;", "a", "get", "Lpv0;", "Lpv0;", "changeWorkflowResultHandler", "Le61;", "Le61;", "checkoutStateFactory", "Lt41;", c.a, "Lt41;", "checkoutDetailsService", "Lava;", DateTokenConverter.CONVERTER_KEY, "Lava;", "stateProvider", "<init>", "(Lpv0;Le61;Lt41;Lava;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u61  reason: default package */
/* loaded from: classes4.dex */
public final class u61 implements t61 {
    private final pv0 a;
    private final e61 b;
    private final t41 c;
    private final ava d;

    public u61(pv0 pv0Var, e61 e61Var, t41 t41Var, ava avaVar) {
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(e61Var, "checkoutStateFactory");
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(avaVar, "stateProvider");
        this.a = pv0Var;
        this.b = e61Var;
        this.c = t41Var;
        this.d = avaVar;
    }

    private final b61 a(Collection<? extends d41> collection) {
        return this.b.a(this.c.k(), collection);
    }

    private final Collection<d41> b(ov0 ov0Var) {
        return e41.a(ov0Var);
    }

    @Override // defpackage.t61
    public b61 get() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : b(this.a.a(this.d.e()))) {
            if (d41.a.a().contains(bc9.b(((d41) obj).getClass()))) {
                arrayList.add(obj);
            }
        }
        return a(arrayList);
    }
}
