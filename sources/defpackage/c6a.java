package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.hv0;
import kotlin.Metadata;
import kotlin.Unit;
import ru.dodopizza.app.presentation.selectlocation.a;
/* compiled from: SelectLocationInteractor.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH¦@¢\u0006\u0004\b\u0014\u0010\u0011J,\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lc6a;", "", "Lhv0$b;", "changeLocalityRequest", "Lwx;", "Liv0;", "a", "Lhv0$c;", "changePizzeriaRequest", c.a, "Lhv0$a;", "changeDeliveryLocationRequest", "b", "", LocalityEntity.FIELD_COUNTRY_CODE, "Li97;", "f", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "baseUrl", "", DateTokenConverter.CONVERTER_KEY, "Lzy1;", "countryVO", "Ldt5;", "currentLocality", "", "isAppRestarted", "Lru/dodopizza/app/presentation/selectlocation/a;", e.a, "(Lzy1;Ldt5;ZLcv1;)Ljava/lang/Object;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c6a  reason: default package */
/* loaded from: classes4.dex */
public interface c6a {
    wx<iv0> a(hv0.b bVar);

    wx<iv0> b(hv0.a aVar);

    wx<iv0> c(hv0.c cVar);

    Object d(String str, cv1<? super Unit> cv1Var);

    Object e(zy1 zy1Var, dt5 dt5Var, boolean z, cv1<? super a> cv1Var);

    Object f(String str, cv1<? super i97> cv1Var);
}
