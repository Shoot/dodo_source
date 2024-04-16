package com.dodopizza.order.feature.menu.ordertypeswitcher;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.menu.ordertypeswitcher.a;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: OrderTypeSwitcherInteractor.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H&J\u0012\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00190\u0015j\u0002`\u001aH&J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001c0\u0015H&J\u0010\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H&J\u0012\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u00190\u0015j\u0002`\u001aH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0015H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0015H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0015H&¨\u0006%"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/d;", "", "Loz3;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", com.huawei.hms.opendevice.c.a, "Ld88;", "pizzeria", "Llk7$d;", "pizzeriaSource", "t", "", "isNearestPizzeria", "k", "(Ld88;Llk7$d;Ljava/lang/Boolean;)Loz3;", "j", "n", "Lou2;", "deliverablePlace", "Llk7$a;", "addressSource", Image.TYPE_HIGH, "Lwx;", "", "o", DateTokenConverter.CONVERTER_KEY, "", "Lcom/dodopizza/async/AsyncJob;", "l", "", com.huawei.hms.push.e.a, "a", "b", "g", "", "i", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "f", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface d {
    wx<String> a();

    wx<Unit> b();

    oz3<a.b> c();

    wx<Boolean> d();

    wx<List<d88>> e();

    wx<StateEntity> f();

    wx<Boolean> g();

    oz3<a.b> h(ou2 ou2Var, lk7.a aVar);

    wx<Integer> i();

    oz3<a.b> j();

    oz3<a.b> k(d88 d88Var, lk7.d dVar, Boolean bool);

    wx<Unit> l();

    oz3<a.b> n();

    wx<String> o();

    oz3<a.b> t(d88 d88Var, lk7.d dVar);
}
