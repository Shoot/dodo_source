package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: CommonAddressModule.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u001a"}, d2 = {"Lmj1;", "", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Ljv5;", "localityService", "Ldt5;", "locality", "Lnp4;", "b", "Lx42;", "customerAddressService", "Ldt9;", c.a, "Ldza;", DateTokenConverter.CONVERTER_KEY, "Lava;", "stateProvider", "Ldua;", "stateAnalyzer", "Lj9a;", "selectedAddressState", "Lr6;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mj1  reason: default package */
/* loaded from: classes3.dex */
public final class mj1 {
    public static final mj1 a = new mj1();

    private mj1() {
    }

    public final r6 a(ava avaVar, dua duaVar, j9a j9aVar, DodopizzaApi dodopizzaApi) {
        z65.h(avaVar, "stateProvider");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(dodopizzaApi, "dodoPizzaApi");
        return new r6(avaVar, duaVar, j9aVar, dodopizzaApi);
    }

    public final np4 b(DodopizzaApi dodopizzaApi, jv5 jv5Var, dt5 dt5Var) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        z65.h(jv5Var, "localityService");
        z65.h(dt5Var, "locality");
        return new np4(dodopizzaApi, jv5Var, dt5Var);
    }

    public final dt9 c(x42 x42Var) {
        z65.h(x42Var, "customerAddressService");
        return new dt9(x42Var);
    }

    public final dza d(DodopizzaApi dodopizzaApi, jv5 jv5Var, dt5 dt5Var) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        z65.h(jv5Var, "localityService");
        z65.h(dt5Var, "locality");
        return new dza(dodopizzaApi, jv5Var, dt5Var);
    }
}
