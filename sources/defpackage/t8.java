package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.addresslist.AddressListPresenter;
import ru.dodopizza.app.presentation.addresslist.d;
import ru.dodopizza.app.presentation.addresslist.e;
import ru.dodopizza.app.presentation.addresslist.i;
import ru.dodopizza.app.presentation.addresslist.j;
/* compiled from: AddressListModule.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.JF\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J*\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J@\u0010#\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0007J8\u0010,\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\rH\u0007¨\u0006/"}, d2 = {"Lt8;", "", "Lgc;", "analytics", "Lcl2;", "Ln8;", "dataSet", "Lru/dodopizza/app/presentation/addresslist/d;", "interactor", "Ly8;", "addressListRouter", "Lhq3;", "featureService", "Ldt5;", "locality", "Ls8;", "args", "Lru/dodopizza/app/presentation/addresslist/AddressListPresenter;", c.a, "Lf63;", "dodoRouter", "addressListFragmentData", "Lfq0;", "cartContentService", "a", "Lx42;", "customerAddressService", "Lj9a;", "selectedAddressState", "Lpu2;", "deliverablePlaceFormatter", "Lvg7;", "orderPizzeriaStateService", "Lru/dodopizza/app/presentation/addresslist/i;", "selectedAddressHandler", "b", "Lre4;", "geocodeService", "Lk6a;", "selectLocationService", "Ljv5;", "localityService", "Lt61;", "checkoutStateProvider", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: t8  reason: default package */
/* loaded from: classes3.dex */
public final class t8 {
    public static final t8 a = new t8();

    private t8() {
    }

    public final y8 a(f63 f63Var, s8 s8Var, dt5 dt5Var, fq0 fq0Var) {
        z65.h(f63Var, "dodoRouter");
        z65.h(s8Var, "addressListFragmentData");
        z65.h(dt5Var, "locality");
        z65.h(fq0Var, "cartContentService");
        return new y8(f63Var, s8Var, dt5Var, fq0Var);
    }

    public final d b(x42 x42Var, j9a j9aVar, pu2 pu2Var, gc gcVar, vg7 vg7Var, s8 s8Var, i iVar) {
        z65.h(x42Var, "customerAddressService");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(pu2Var, "deliverablePlaceFormatter");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(s8Var, "addressListFragmentData");
        z65.h(iVar, "selectedAddressHandler");
        return new e(x42Var, j9aVar, pu2Var, gcVar, s8Var.b(), vg7Var, iVar);
    }

    public final AddressListPresenter c(gc gcVar, cl2<n8> cl2Var, d dVar, y8 y8Var, hq3 hq3Var, dt5 dt5Var, s8 s8Var) {
        z65.h(gcVar, "analytics");
        z65.h(cl2Var, "dataSet");
        z65.h(dVar, "interactor");
        z65.h(y8Var, "addressListRouter");
        z65.h(hq3Var, "featureService");
        z65.h(dt5Var, "locality");
        z65.h(s8Var, "args");
        return new AddressListPresenter(gcVar, cl2Var, dVar, y8Var, hq3Var, dt5Var, s8Var);
    }

    public final i d(re4 re4Var, k6a k6aVar, hq3 hq3Var, jv5 jv5Var, t61 t61Var, dt5 dt5Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(k6aVar, "selectLocationService");
        z65.h(hq3Var, "featureService");
        z65.h(jv5Var, "localityService");
        z65.h(t61Var, "checkoutStateProvider");
        z65.h(dt5Var, "locality");
        return new j(re4Var, k6aVar, hq3Var, jv5Var, t61Var, dt5Var);
    }
}
