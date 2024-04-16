package defpackage;

import androidx.fragment.app.Fragment;
import com.dodopizza.geo.feature.suggestions.presentation.a;
import defpackage.a6a;
import defpackage.g5a;
import defpackage.kh7;
import defpackage.od4;
import defpackage.oj5;
import defpackage.p38;
import defpackage.u6a;
import defpackage.y31;
import defpackage.yt5;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.addresslist.c;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
import ru.dodopizza.app.presentation.selectpizzeria.combined.b;
import ru.dodopizza.app.presentation.selectpizzeria.combined.h;
import ru.dodopizza.app.presentation.selectpizzeria.e;
/* compiled from: DefaultFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¨\u0006\t"}, d2 = {"Lxp2;", "", "", "screenKey", "data", "Landroidx/fragment/app/Fragment;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xp2  reason: default package */
/* loaded from: classes3.dex */
public final class xp2 {
    public static final xp2 a = new xp2();

    private xp2() {
    }

    public final Fragment a(String str, Object obj) {
        z65.h(str, "screenKey");
        switch (str.hashCode()) {
            case -1869287865:
                if (str.equals("registration_phone_fragment")) {
                    p38.a aVar = p38.s;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberRequest");
                    return aVar.a((e) obj);
                }
                break;
            case -602250303:
                if (str.equals("order_rating_fragment")) {
                    kh7.a aVar2 = kh7.y;
                    z65.f(obj, "null cannot be cast to non-null type com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingData");
                    return aVar2.a((eh7) obj);
                }
                break;
            case 133705951:
                if (str.equals("delivery_location_suggestions_fragment")) {
                    a.C0158a c0158a = a.n;
                    z65.f(obj, "null cannot be cast to non-null type com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationFragmentData");
                    return c0158a.a((ny2) obj);
                }
                break;
            case 324319874:
                if (str.equals("select_pizzeria_with_google_maps")) {
                    h.a aVar3 = h.a5;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragmentData");
                    return aVar3.a((x7a) obj);
                }
                break;
            case 386822337:
                if (str.equals("select_pizzeria_combined_view")) {
                    b.a aVar4 = b.Y;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragmentData");
                    return aVar4.a((x7a) obj);
                }
                break;
            case 962878197:
                if (str.equals("locality_list_fragment")) {
                    yt5.a aVar5 = yt5.k;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListData");
                    return aVar5.a((ut5) obj);
                }
                break;
            case 1130389923:
                if (str.equals("select_delivery_address_fragment")) {
                    g5a.a aVar6 = g5a.i;
                    z65.f(obj, "null cannot be cast to non-null type com.dodopizza.geo.feature.selectdeliveryaddress.SelectDeliveryAddressData");
                    return aVar6.a((com.dodopizza.geo.feature.selectdeliveryaddress.b) obj);
                }
                break;
            case 1647324682:
                if (str.equals("geo_choose_order_type_fragment")) {
                    od4.a aVar7 = od4.j;
                    z65.f(obj, "null cannot be cast to non-null type com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypeFragmentData");
                    return aVar7.a((pd4) obj);
                }
                break;
            case 1728810158:
                if (str.equals("select_order_type")) {
                    u6a.a aVar8 = u6a.g;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectordertype.SelectOrderTypeData");
                    return aVar8.a((r6a) obj);
                }
                break;
            case 1771296993:
                if (str.equals("select_pizzeria")) {
                    e.a aVar9 = ru.dodopizza.app.presentation.selectpizzeria.e.A;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaFragmentData");
                    return aVar9.a((x7a) obj);
                }
                break;
            case 2029510254:
                if (str.equals("checkout_dialog_fragment")) {
                    y31.a aVar10 = y31.h;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.checkout.state.CheckoutState");
                    return aVar10.a((b61) obj);
                }
                break;
            case 2042472215:
                if (str.equals("select_location_fragment")) {
                    a6a.a aVar11 = a6a.k;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.SelectLocationScreenArg");
                    return aVar11.a((j6a) obj);
                }
                break;
            case 2094941048:
                if (str.equals("landing_fragment")) {
                    oj5.a aVar12 = oj5.q;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.selectlocation.landing.LandingFragmentData");
                    return aVar12.a((pj5) obj);
                }
                break;
            case 2098183089:
                if (str.equals("select_address")) {
                    c.a aVar13 = c.h;
                    z65.f(obj, "null cannot be cast to non-null type ru.dodopizza.app.presentation.addresslist.AddressListFragmentData");
                    return aVar13.a((s8) obj);
                }
                break;
        }
        return new Fragment();
    }
}
