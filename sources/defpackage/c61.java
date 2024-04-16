package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: CheckoutStateEditService.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\tH&¨\u0006\u001f"}, d2 = {"Lc61;", "", "Ljw7;", "paymentWay", "Lb61;", "oldState", "g", "Lou2;", "deliverablePlace", "", "setDeliveryOrderType", "j", "Le91;", "clientDeliveryLocation", c.a, "i", "Ld88;", "pizzeria", e.a, "", CrashHianalyticsData.TIME, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Lb61;", "isTakeaway", "a", "", "tableNumber", "f", Image.TYPE_HIGH, "isSelected", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c61  reason: default package */
/* loaded from: classes4.dex */
public interface c61 {
    b61 a(boolean z);

    b61 b(boolean z);

    b61 c(e91 e91Var);

    b61 d(Long l);

    b61 e(d88 d88Var);

    b61 f(int i);

    b61 g(jw7 jw7Var, b61 b61Var);

    b61 h(d88 d88Var);

    b61 i();

    b61 j(ou2 ou2Var, boolean z);
}
