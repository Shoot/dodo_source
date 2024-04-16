package defpackage;

import com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListFeatureDependencies;
import com.dodopizza.geo.feature.deliveryaddresslist.DeliveryAddressListRoutingFeatureDependencies;
import kotlin.Metadata;
/* compiled from: DeliveryAddressListComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lhv2;", "", "Lmv2;", "fragment", "", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hv2  reason: default package */
/* loaded from: classes2.dex */
public interface hv2 {
    public static final a a = a.a;

    /* compiled from: DeliveryAddressListComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lhv2$a;", "", "Lhv2$b;", "a", "()Lhv2$b;", "factory", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hv2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = gd2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: DeliveryAddressListComponent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lhv2$b;", "", "Lcom/dodopizza/geo/feature/deliveryaddresslist/DeliveryAddressListFeatureDependencies;", "dependencies", "Lcom/dodopizza/geo/feature/deliveryaddresslist/DeliveryAddressListRoutingFeatureDependencies;", "routingDependencies", "Lcom/dodopizza/geo/domain/OnDeliveryLocationSelectedDependencies;", "onDeliveryLocationSelectedDependencies", "Liv2;", "data", "Lsj1;", "commonData", "Lhv2;", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hv2$b */
    /* loaded from: classes2.dex */
    public interface b {
        hv2 a(DeliveryAddressListFeatureDependencies deliveryAddressListFeatureDependencies, DeliveryAddressListRoutingFeatureDependencies deliveryAddressListRoutingFeatureDependencies, OnDeliveryLocationSelectedDependencies onDeliveryLocationSelectedDependencies, iv2 iv2Var, sj1 sj1Var);
    }

    void a(mv2 mv2Var);
}
