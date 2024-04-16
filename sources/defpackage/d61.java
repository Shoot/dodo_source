package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: CheckoutStateEditService.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020\u0002¢\u0006\u0004\bF\u0010GJ\u0018\u0010\u0007\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J.\u0010\u000e\u001a\u00020\u0006*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096\u0001J\r\u0010\u0014\u001a\u00020\u0006*\u00020\u0006H\u0096\u0001J\u001e\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001J\u0015\u0010\u001b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0011H\u0096\u0001J\r\u0010\u001c\u001a\u00020\u0006*\u00020\u0006H\u0096\u0001J\u001e\u0010\u001e\u001a\u00020\u0006*\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0006H\u0096\u0001J\r\u0010 \u001a\u00020\u0006*\u00020\u0006H\u0096\u0001J\u0015\u0010#\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0096\u0001J\u0015\u0010$\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0096\u0001J\u0015\u0010'\u001a\u00020\u0006*\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0096\u0001J\u0015\u0010(\u001a\u00020\u0006*\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0096\u0001J\u001e\u0010)\u001a\u00020\u0006*\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0001¢\u0006\u0004\b)\u0010\u0016J\r\u0010*\u001a\u00020\u0006*\u00020\u0006H\u0096\u0001J\r\u0010+\u001a\u00020\u0006*\u00020\u0006H\u0096\u0001J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0006H\u0016J\u0018\u0010/\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\fH\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0016J\b\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u00105\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0016J\u0019\u00106\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\fH\u0016R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010C¨\u0006H"}, d2 = {"Ld61;", "Lc61;", "Lh61;", "Lkotlin/Pair;", "Lb41;", "Lov0;", "Lb61;", "l", "", CrashHianalyticsData.TIME, "", "title", "", "isSuggested", "o", "(Lb61;Ljava/lang/Long;Ljava/lang/String;Z)Lb61;", "", "Ld41;", "errors", "F", "x", "B", "(Lb61;Ljava/lang/Long;)Lb61;", "Lou2;", "deliverablePlace", "w", "error", "z", "G", "loadingTime", "v", "t", "D", "Ljw7;", "paymentWay", "u", "A", "Ld88;", "pizzeria", "C", "y", "n", "k", "E", "oldState", "g", "setDeliveryOrderType", "j", "Le91;", "clientDeliveryLocation", c.a, "i", e.a, Image.TYPE_HIGH, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Lb61;", "isTakeaway", "a", "", "tableNumber", "f", "isSelected", "b", "Lt41;", "Lt41;", "checkoutDetailsService", "Le61;", "Le61;", "checkoutStateFactory", "checkoutStateLogic", "<init>", "(Lt41;Le61;Lh61;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d61  reason: default package */
/* loaded from: classes4.dex */
public final class d61 implements c61, h61 {
    private final t41 a;
    private final e61 b;
    private final /* synthetic */ h61 c;

    public d61(t41 t41Var, e61 e61Var, h61 h61Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(e61Var, "checkoutStateFactory");
        z65.h(h61Var, "checkoutStateLogic");
        this.a = t41Var;
        this.b = e61Var;
        this.c = h61Var;
    }

    private final b61 l(Pair<b41, ? extends ov0> pair) {
        return this.b.a(pair.a(), e41.a(pair.b()));
    }

    @Override // defpackage.h61
    public b61 A(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.c.A(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 B(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return this.c.B(b61Var, l);
    }

    @Override // defpackage.h61
    public b61 C(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.c.C(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 D(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.c.D(b61Var);
    }

    @Override // defpackage.h61
    public b61 E(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.c.E(b61Var);
    }

    @Override // defpackage.h61
    public b61 F(b61 b61Var, Collection<? extends d41> collection) {
        z65.h(b61Var, "<this>");
        z65.h(collection, "errors");
        return this.c.F(b61Var, collection);
    }

    @Override // defpackage.h61
    public b61 G(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.c.G(b61Var);
    }

    @Override // defpackage.c61
    public b61 a(boolean z) {
        return l(this.a.a(z));
    }

    @Override // defpackage.c61
    public b61 b(boolean z) {
        return l(this.a.b(z));
    }

    @Override // defpackage.c61
    public b61 c(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        return l(this.a.c(e91Var));
    }

    @Override // defpackage.c61
    public b61 d(Long l) {
        return l(this.a.d(l));
    }

    @Override // defpackage.c61
    public b61 e(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        return l(this.a.e(d88Var));
    }

    @Override // defpackage.c61
    public b61 f(int i) {
        return l(this.a.g(i));
    }

    @Override // defpackage.c61
    public b61 g(jw7 jw7Var, b61 b61Var) {
        z65.h(jw7Var, "paymentWay");
        z65.h(b61Var, "oldState");
        return l(this.a.f(jw7Var));
    }

    @Override // defpackage.c61
    public b61 h(d88 d88Var) {
        z65.h(d88Var, "pizzeria");
        return l(this.a.h(d88Var));
    }

    @Override // defpackage.c61
    public b61 i() {
        return l(this.a.i());
    }

    @Override // defpackage.c61
    public b61 j(ou2 ou2Var, boolean z) {
        z65.h(ou2Var, "deliverablePlace");
        return l(this.a.j(ou2Var, z));
    }

    @Override // defpackage.h61
    public b61 k(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.c.k(b61Var);
    }

    @Override // defpackage.h61
    public b61 n(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return this.c.n(b61Var, l);
    }

    @Override // defpackage.h61
    public b61 o(b61 b61Var, Long l, String str, boolean z) {
        z65.h(b61Var, "<this>");
        z65.h(str, "title");
        return this.c.o(b61Var, l, str, z);
    }

    @Override // defpackage.h61
    public b61 t(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.c.t(b61Var);
    }

    @Override // defpackage.h61
    public b61 u(b61 b61Var, jw7 jw7Var) {
        z65.h(b61Var, "<this>");
        z65.h(jw7Var, "paymentWay");
        return this.c.u(b61Var, jw7Var);
    }

    @Override // defpackage.h61
    public b61 v(b61 b61Var, Long l) {
        z65.h(b61Var, "<this>");
        return this.c.v(b61Var, l);
    }

    @Override // defpackage.h61
    public b61 w(b61 b61Var, ou2 ou2Var) {
        z65.h(b61Var, "<this>");
        z65.h(ou2Var, "deliverablePlace");
        return this.c.w(b61Var, ou2Var);
    }

    @Override // defpackage.h61
    public b61 x(b61 b61Var) {
        z65.h(b61Var, "<this>");
        return this.c.x(b61Var);
    }

    @Override // defpackage.h61
    public b61 y(b61 b61Var, d88 d88Var) {
        z65.h(b61Var, "<this>");
        z65.h(d88Var, "pizzeria");
        return this.c.y(b61Var, d88Var);
    }

    @Override // defpackage.h61
    public b61 z(b61 b61Var, d41 d41Var) {
        z65.h(b61Var, "<this>");
        z65.h(d41Var, "error");
        return this.c.z(b61Var, d41Var);
    }
}
