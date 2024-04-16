package defpackage;

import com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapRoutingFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.d;
import kotlin.Metadata;
/* compiled from: EditDeliveryAddressMapComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lbd3;", "", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/d;", "fragment", "", "b", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/b;", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bd3  reason: default package */
/* loaded from: classes2.dex */
public interface bd3 {
    public static final a a = a.a;

    /* compiled from: EditDeliveryAddressMapComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lbd3$a;", "", "Lbd3$b;", "a", "()Lbd3$b;", "factory", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bd3$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = sd2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: EditDeliveryAddressMapComponent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lbd3$b;", "", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/EditAddressMapFeatureDependencies;", "dependencies", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/EditAddressMapRoutingFeatureDependencies;", "routingDependencies", "Lcom/dodopizza/geo/domain/OnDeliveryLocationSelectedDependencies;", "onDeliveryLocationSelectedDependencies", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "Lsj1;", "commonData", "Lbd3;", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bd3$b */
    /* loaded from: classes2.dex */
    public interface b {
        bd3 a(EditAddressMapFeatureDependencies editAddressMapFeatureDependencies, EditAddressMapRoutingFeatureDependencies editAddressMapRoutingFeatureDependencies, OnDeliveryLocationSelectedDependencies onDeliveryLocationSelectedDependencies, com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a aVar, sj1 sj1Var);
    }

    void a(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.b bVar);

    void b(d dVar);
}
