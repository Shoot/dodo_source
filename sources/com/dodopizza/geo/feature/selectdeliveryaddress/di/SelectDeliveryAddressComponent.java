package com.dodopizza.geo.feature.selectdeliveryaddress.di;

import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListRoutingFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapRoutingFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SelectDeliveryAddressComponent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\t\nJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent;", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsRouterFeatureDependencies;", "Lcom/dodopizza/geo/feature/deliveryaddresslist/DeliveryAddressListRoutingFeatureDependencies;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/EditAddressMapRoutingFeatureDependencies;", "Lg5a;", "fragment", "", "p3", e.a, "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface SelectDeliveryAddressComponent extends DeliveryLocationSuggestionsRouterFeatureDependencies, DeliveryAddressListRoutingFeatureDependencies, EditAddressMapRoutingFeatureDependencies {
    public static final a e = a.a;

    /* compiled from: SelectDeliveryAddressComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent$a;", "", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent$b;", "a", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent$b;", "factory", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = DaggerSelectDeliveryAddressComponent.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: SelectDeliveryAddressComponent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent$b;", "", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressFeatureDependencies;", "dependencies", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressRoutingFeatureDependencies;", "routingDependencies", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/b;", "data", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/di/SelectDeliveryAddressComponent;", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public interface b {
        SelectDeliveryAddressComponent a(SelectDeliveryAddressFeatureDependencies selectDeliveryAddressFeatureDependencies, SelectDeliveryAddressRoutingFeatureDependencies selectDeliveryAddressRoutingFeatureDependencies, com.dodopizza.geo.feature.selectdeliveryaddress.b bVar);
    }

    void p3(g5a g5aVar);
}
