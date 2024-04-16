package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.address.DeliveryAddressEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CustomerAddressRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u0016"}, d2 = {"Lv42;", "", "", "Lou2;", "deliverablePlaces", "", "b", "deliverablePlace", "f", "", "id", DateTokenConverter.CONVERTER_KEY, c.a, "clear", "Lw6;", e.a, "Le91;", "g", "Lcom/dodopizza/persistence/entity/address/DeliveryAddressEntity;", "deliveryAddress", Image.TYPE_HIGH, "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v42  reason: default package */
/* loaded from: classes4.dex */
public interface v42 {
    w6 a(String str);

    void b(List<? extends ou2> list);

    void c(String str);

    void clear();

    void d(String str);

    List<w6> e();

    void f(ou2 ou2Var);

    List<e91> g();

    w6 h(DeliveryAddressEntity deliveryAddressEntity);
}
