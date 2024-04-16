package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
import com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity;
import com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import io.realm.k0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: DeliveryLocationCoversions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002\u001a \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0001\u001a\u000e\u0010\u000f\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0002\u001a\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u000b*\u0004\u0018\u00010\fH\u0002¨\u0006\u0012"}, d2 = {"Le91;", "Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationProfileEntity;", "a", "Ljx2;", "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", c.a, "", "", "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/deliverylocation/AddressAdditionEntity;", DateTokenConverter.CONVERTER_KEY, "Lqw1;", "Lcom/dodopizza/persistence/entity/deliverylocation/CoordinatesEntity;", "b", e.a, "g", Image.TYPE_HIGH, "f", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: lx2  reason: default package */
/* loaded from: classes4.dex */
public final class lx2 {
    public static final ClientDeliveryLocationProfileEntity a(e91 e91Var) {
        z65.h(e91Var, "<this>");
        return new ClientDeliveryLocationProfileEntity(e91Var.getId(), c(e91Var.c()), e91Var.d());
    }

    private static final CoordinatesEntity b(qw1 qw1Var) {
        return new CoordinatesEntity(qw1Var.b(), qw1Var.c());
    }

    private static final DeliveryLocationEntity c(jx2 jx2Var) {
        return new DeliveryLocationEntity(jx2Var.f(), d(jx2Var.c()), b(jx2Var.d()), jx2Var.e());
    }

    private static final k0<AddressAdditionEntity> d(Map<String, String> map) {
        k0<AddressAdditionEntity> k0Var = new k0<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            k0Var.add(new AddressAdditionEntity(entry.getKey(), entry.getValue()));
        }
        return k0Var;
    }

    public static final e91 e(ClientDeliveryLocationProfileEntity clientDeliveryLocationProfileEntity) {
        z65.h(clientDeliveryLocationProfileEntity, "<this>");
        return new e91((String) mh5.b(clientDeliveryLocationProfileEntity.getId(), "ClientDeliveryLocationProfileEntity Id can`t be null"), g(clientDeliveryLocationProfileEntity.getDeliveryLocation()), clientDeliveryLocationProfileEntity.getRequiresAdditions());
    }

    private static final qw1 f(CoordinatesEntity coordinatesEntity) {
        if (coordinatesEntity != null) {
            return new qw1(coordinatesEntity.getLat(), coordinatesEntity.getLon());
        }
        return qw1.c.a();
    }

    private static final jx2 g(DeliveryLocationEntity deliveryLocationEntity) {
        if (deliveryLocationEntity != null) {
            return new jx2(deliveryLocationEntity.getFormattedAddress(), f(deliveryLocationEntity.getCoordinates()), h(deliveryLocationEntity.getAdditions()), deliveryLocationEntity.getEncodedComponents());
        }
        return jx2.f;
    }

    private static final Map<String, String> h(k0<AddressAdditionEntity> k0Var) {
        int w;
        int e;
        int e2;
        w = lc1.w(k0Var, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (AddressAdditionEntity addressAdditionEntity : k0Var) {
            String key = addressAdditionEntity.getKey();
            String value = addressAdditionEntity.getValue();
            if (value == null) {
                value = "";
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }
}
