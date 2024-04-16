package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.deliverylocation.AddressAdditionEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationEntity;
import com.dodopizza.persistence.entity.deliverylocation.CoordinatesEntity;
import com.dodopizza.persistence.entity.deliverylocation.DeliveryLocationEntity;
import com.huawei.hms.opendevice.c;
import io.realm.k0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: ClientDeliveryLocationConverter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u001a\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/dodopizza/persistence/entity/deliverylocation/ClientDeliveryLocationEntity;", "Le91;", "a", c.a, "Lcom/dodopizza/persistence/entity/deliverylocation/DeliveryLocationEntity;", "Ljx2;", DateTokenConverter.CONVERTER_KEY, "Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/deliverylocation/AddressAdditionEntity;", "", "", "b", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: f91  reason: default package */
/* loaded from: classes4.dex */
public final class f91 {
    public static final e91 a(ClientDeliveryLocationEntity clientDeliveryLocationEntity) {
        e91 c;
        if (clientDeliveryLocationEntity == null || (c = c(clientDeliveryLocationEntity)) == null) {
            return e91.e;
        }
        return c;
    }

    private static final Map<String, String> b(k0<AddressAdditionEntity> k0Var) {
        int w;
        int e;
        int e2;
        int e3;
        w = lc1.w(k0Var, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (AddressAdditionEntity addressAdditionEntity : k0Var) {
            linkedHashMap.put(addressAdditionEntity.getKey(), addressAdditionEntity.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        e3 = f86.e(linkedHashMap2.size());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3);
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            String str = (String) entry2.getValue();
            if (str == null) {
                str = "";
            }
            linkedHashMap3.put(key, str);
        }
        return linkedHashMap3;
    }

    private static final e91 c(ClientDeliveryLocationEntity clientDeliveryLocationEntity) {
        jx2 jx2Var;
        String externalId = clientDeliveryLocationEntity.getExternalId();
        DeliveryLocationEntity deliveryLocation = clientDeliveryLocationEntity.getDeliveryLocation();
        if (deliveryLocation != null) {
            jx2Var = d(deliveryLocation);
        } else {
            jx2Var = null;
        }
        return new e91(externalId, (jx2) mh5.c(jx2Var, jx2.f), clientDeliveryLocationEntity.getRequiresAdditions());
    }

    private static final jx2 d(DeliveryLocationEntity deliveryLocationEntity) {
        Double d;
        String formattedAddress = deliveryLocationEntity.getFormattedAddress();
        CoordinatesEntity coordinates = deliveryLocationEntity.getCoordinates();
        Double d2 = null;
        if (coordinates != null) {
            d = Double.valueOf(coordinates.getLat());
        } else {
            d = null;
        }
        double doubleValue = ((Number) mh5.c(d, Double.valueOf(0.0d))).doubleValue();
        CoordinatesEntity coordinates2 = deliveryLocationEntity.getCoordinates();
        if (coordinates2 != null) {
            d2 = Double.valueOf(coordinates2.getLon());
        }
        return new jx2(formattedAddress, new qw1(doubleValue, ((Number) mh5.c(d2, Double.valueOf(0.0d))).doubleValue()), b(deliveryLocationEntity.getAdditions()), deliveryLocationEntity.getEncodedComponents());
    }
}
