package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import kotlin.Metadata;
/* compiled from: MenuPersonalPriceModule.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J$\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH\u0007J$\u0010\u0014\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0007J\b\u0010\u0015\u001a\u00020\nH\u0007J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0007J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¨\u0006%"}, d2 = {"Lbg6;", "", "Lava;", "stateProvider", "Lxf6;", "menuPersonalPriceInfoConverter", "Lzf6;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Lje6;", "realMenuItemPersonalizer", "noopMenuItemPersonalizer", "Lme6;", c.a, "Lbe6;", "Lqd6;", "menuItemEnricher", "Lxd6;", "menuItemCopyMaker", "f", e.a, "Lqd6$e;", "simpleMenuItemEnricher", "Lqd6$f;", "variableMenuItemEnricher", "b", "menuPersonalPriceInfoRepository", Image.TYPE_HIGH, "j", "simpleMenuItemCopyMaker", "variableMenuItemCopyMaker", "a", "g", "i", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bg6  reason: default package */
/* loaded from: classes3.dex */
public final class bg6 {
    public static final bg6 a = new bg6();

    private bg6() {
    }

    public final xd6<qd6> a(xd6<qd6.e> xd6Var, xd6<qd6.f> xd6Var2) {
        z65.h(xd6Var, "simpleMenuItemCopyMaker");
        z65.h(xd6Var2, "variableMenuItemCopyMaker");
        return new yd6(xd6Var, xd6Var2);
    }

    public final be6<qd6> b(be6<qd6.e> be6Var, be6<qd6.f> be6Var2) {
        z65.h(be6Var, "simpleMenuItemEnricher");
        z65.h(be6Var2, "variableMenuItemEnricher");
        return new ce6(be6Var, be6Var2);
    }

    public final me6 c(hq3 hq3Var, je6 je6Var, je6 je6Var2) {
        z65.h(hq3Var, "featureService");
        z65.h(je6Var, "realMenuItemPersonalizer");
        z65.h(je6Var2, "noopMenuItemPersonalizer");
        return new me6(hq3Var, je6Var, je6Var2);
    }

    public final zf6 d(ava avaVar, xf6 xf6Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(xf6Var, "menuPersonalPriceInfoConverter");
        return new ag6(avaVar, xf6Var);
    }

    public final je6 e() {
        return le6.a;
    }

    public final je6 f(be6<qd6> be6Var, xd6<qd6> xd6Var) {
        z65.h(be6Var, "menuItemEnricher");
        z65.h(xd6Var, "menuItemCopyMaker");
        return new ke6(be6Var, xd6Var);
    }

    public final xd6<qd6.e> g(zf6 zf6Var) {
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        return new kla(zf6Var);
    }

    public final be6<qd6.e> h(zf6 zf6Var) {
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        return new lla(zf6Var);
    }

    public final xd6<qd6.f> i(hq3 hq3Var, zf6 zf6Var) {
        z65.h(hq3Var, "featureService");
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        return new nwb(hq3Var, owb.a, new mwb(zf6Var));
    }

    public final be6<qd6.f> j(hq3 hq3Var, zf6 zf6Var) {
        z65.h(hq3Var, "featureService");
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        return new qwb(hq3Var, rwb.a, new pwb(zf6Var));
    }
}
