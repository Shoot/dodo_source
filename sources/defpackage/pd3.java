package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: EditDeliveryAddressMapRoutingHandler.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JB\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\tH&J\b\u0010\u000e\u001a\u00020\u000bH&J0\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0018"}, d2 = {"Lpd3;", "", "", "formattedAddress", LocalityEntity.FIELD_COUNTRY_CODE, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Lqw1;", "pinCoordinates", "Lkotlin/Function2;", "Le91;", "", "action", "a", DateTokenConverter.CONVERTER_KEY, "clientDeliveryLocation", "", "isFromState", "isNew", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "b", c.a, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pd3  reason: default package */
/* loaded from: classes2.dex */
public interface pd3 {
    void a(String str, String str2, qx1 qx1Var, qw1 qw1Var, Function2<? super e91, ? super String, Unit> function2);

    void b(e91 e91Var, boolean z, boolean z2, boolean z3, a.b bVar);

    void c(e91 e91Var, boolean z);

    void d();
}
