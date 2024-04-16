package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import kotlin.Metadata;
/* compiled from: CheckoutStateService.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH&J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH&J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010 \u001a\u00020\u001fH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\"\u001a\u00020\u0004H&J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010%\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\b&\u0010'J?\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010(\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H&¢\u0006\u0004\b-\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010/\u001a\u00020\u0004H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u00062"}, d2 = {"Lv61;", "", "Lou2;", "deliverablePlace", "", "setDeliveryOrderType", "Llk7$a;", "addressSource", "Lqd;", "analyticsSender", "Loz3;", "Lb61;", e.a, "Le91;", "clientDeliveryLocation", c.a, "p", "Ld88;", "pizzeria", "Llk7$d;", "pizzeriaSource", "i", "isNearestPizzeria", Image.TYPE_HIGH, "(Ld88;Llk7$d;Lqd;Ljava/lang/Boolean;)Loz3;", "j", "isTakeaway", "a", "", "tableNumber", "g", "Ljw7;", "paymentWay", "f", "isRedirectSaveCardEnabled", "l", "", CrashHianalyticsData.TIME, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Loz3;", "currentState", "", "title", "isSuggested", "persistCurrentTimes", "r", "(Lb61;Ljava/lang/Long;Ljava/lang/String;ZZ)Loz3;", "isSelected", "b", Image.TYPE_MEDIUM, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v61  reason: default package */
/* loaded from: classes4.dex */
public interface v61 {
    oz3<b61> a(boolean z);

    oz3<b61> b(boolean z);

    oz3<b61> c(e91 e91Var);

    oz3<b61> d(Long l);

    oz3<b61> e(ou2 ou2Var, boolean z, lk7.a aVar, qd qdVar);

    oz3<b61> f(jw7 jw7Var);

    oz3<b61> g(int i);

    oz3<b61> h(d88 d88Var, lk7.d dVar, qd qdVar, Boolean bool);

    oz3<b61> i(d88 d88Var, lk7.d dVar, qd qdVar);

    oz3<b61> j(qd qdVar);

    oz3<b61> l(boolean z);

    oz3<b61> m();

    oz3<b61> p(qd qdVar);

    oz3<b61> r(b61 b61Var, Long l, String str, boolean z, boolean z2);
}
