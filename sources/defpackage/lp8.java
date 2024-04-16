package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.feature.webinfo.presentation.d;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PromoActionRouterImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, d2 = {"Llp8;", "Lkp8;", "", "b", "", "productCategoryId", "Lcq8;", "sender", DateTokenConverter.CONVERTER_KEY, ElementGenerator.TYPE_LINK, "a", "Lqd6;", "menuItem", "Lym$d;", "banner", c.a, "Lf63;", "Lf63;", "router", "Lhl8;", "Lhl8;", "productCardScreenFactory", "<init>", "(Lf63;Lhl8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: lp8  reason: default package */
/* loaded from: classes4.dex */
public final class lp8 implements kp8 {
    private final f63 a;
    private final hl8 b;

    public lp8(f63 f63Var, hl8 hl8Var) {
        z65.h(f63Var, "router");
        z65.h(hl8Var, "productCardScreenFactory");
        this.a = f63Var;
        this.b = hl8Var;
    }

    @Override // defpackage.kp8
    public void a(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        this.a.e(d.a(new a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    @Override // defpackage.kp8
    public void b() {
        this.a.e(new y38(new e(e.a.d)));
    }

    @Override // defpackage.kp8
    public void c(qd6 qd6Var, ym.d dVar) {
        z65.h(qd6Var, "menuItem");
        z65.h(dVar, "banner");
        this.a.e(hl8.b(this.b, de6.b(qd6Var), qd6Var.f(), ym.d.f, false, null, 24, null));
    }

    @Override // defpackage.kp8
    public void d(String str, cq8 cq8Var) {
        z65.h(str, "productCategoryId");
        z65.h(cq8Var, "sender");
        this.a.l(1, new FoodMenuPresenter.c(str, cq8Var));
    }
}
