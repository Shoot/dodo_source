package defpackage;

import defpackage.tmb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter;
/* compiled from: DeliveryLocationDetailsModule.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0019"}, d2 = {"Lvx2;", "", "Lf63;", "router", "Lsx2;", "deliveryLocationDetailsInteractor", "Lrx2;", "data", "Lhq3;", "featureService", "Lgc;", "analytics", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;", "b", "Lre4;", "geocodeService", "Lcy2;", "deliveryLocationDetailsService", "Lh7;", "addressDetailsFieldDesignService", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vx2  reason: default package */
/* loaded from: classes3.dex */
public final class vx2 {
    public static final a a = new a(null);

    /* compiled from: DeliveryLocationDetailsModule.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvx2$a;", "", "", "NAMED_DELIVERY_LOCATION_DETAILS_ROUTER", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vx2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final sx2 a(re4 re4Var, cy2 cy2Var, h7 h7Var, ay1 ay1Var) {
        z65.h(re4Var, "geocodeService");
        z65.h(cy2Var, "deliveryLocationDetailsService");
        z65.h(h7Var, "addressDetailsFieldDesignService");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        return new tx2(re4Var, cy2Var, h7Var, ay1Var);
    }

    public final DeliveryLocationDetailsPresenter b(f63 f63Var, sx2 sx2Var, rx2 rx2Var, hq3 hq3Var, gc gcVar, ay1 ay1Var) {
        z65.h(f63Var, "router");
        z65.h(sx2Var, "deliveryLocationDetailsInteractor");
        z65.h(rx2Var, "data");
        z65.h(hq3Var, "featureService");
        z65.h(gcVar, "analytics");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        return new DeliveryLocationDetailsPresenter(f63Var, sx2Var, rx2Var, hq3Var, gcVar, ay1Var);
    }
}
