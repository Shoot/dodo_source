package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: CheckoutDetailsService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H&J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J%\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u000bH&J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001b\u001a\u00020\u001aH&J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u001dH&J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010 \u001a\u00020\u000bH&¨\u0006\""}, d2 = {"Lt41;", "", "Lb41;", "k", "Ljw7;", "paymentWay", "Lkotlin/Pair;", "Lov0;", "f", "Lou2;", "deliverablePlace", "", "setDeliveryOrderType", "j", "l", "i", "Ld88;", "pizzeria", e.a, "", CrashHianalyticsData.TIME, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Lkotlin/Pair;", Image.TYPE_HIGH, "isTakeaway", "a", "", "tableNumber", "g", "Le91;", "clientDeliveryLocation", c.a, "isSelected", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t41  reason: default package */
/* loaded from: classes4.dex */
public interface t41 {
    Pair<b41, ov0> a(boolean z);

    Pair<b41, ov0> b(boolean z);

    Pair<b41, ov0> c(e91 e91Var);

    Pair<b41, ov0> d(Long l);

    Pair<b41, ov0> e(d88 d88Var);

    Pair<b41, ov0> f(jw7 jw7Var);

    Pair<b41, ov0> g(int i);

    Pair<b41, ov0> h(d88 d88Var);

    Pair<b41, ov0> i();

    Pair<b41, ov0> j(ou2 ou2Var, boolean z);

    b41 k();

    Pair<b41, ov0> l();
}
