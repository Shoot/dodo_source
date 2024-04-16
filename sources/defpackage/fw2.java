package defpackage;

import com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
/* compiled from: DeliveryAddressMapComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lfw2;", "", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/a;", "fragment", "", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fw2  reason: default package */
/* loaded from: classes2.dex */
public interface fw2 {
    public static final a a = a.a;

    /* compiled from: DeliveryAddressMapComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lfw2$a;", "", "Lfw2$b;", "b", "Lfw2$b;", "a", "()Lfw2$b;", "factory", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fw2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = jd2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: DeliveryAddressMapComponent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lfw2$b;", "", "Lcom/dodopizza/geo/feature/deliveryaddressmap/DeliveryAddressMapFeatureDependencies;", "dependencies", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lfw2;", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fw2$b */
    /* loaded from: classes2.dex */
    public interface b {
        fw2 a(DeliveryAddressMapFeatureDependencies deliveryAddressMapFeatureDependencies, String str, ck1 ck1Var);
    }

    void a(com.dodopizza.geo.feature.deliveryaddressmap.presentation.a aVar);
}
