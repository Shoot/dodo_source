package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lk7;
import kotlin.Metadata;
/* compiled from: CheckoutDetailsInteractor.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H&J/\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b$\u0010%J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010(\u001a\u00020\u0007H&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010+\u001a\u00020*H&J \u00101\u001a\b\u0012\u0004\u0012\u0002000\u00042\u0006\u0010-\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010.H&J.\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00042\u0006\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000fH&J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000fH&J \u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u000fH¦@¢\u0006\u0004\b@\u0010AJ\u0018\u0010C\u001a\u00020B2\u0006\u0010=\u001a\u00020<H¦@¢\u0006\u0004\bC\u0010DJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020:0\u00042\u0006\u0010=\u001a\u00020<H&J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u0004H&J\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020:0\u00042\u0006\u00108\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fH&J.\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00042\u0006\u00108\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000fH&J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u0004H&J\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H&J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010V\u001a\u00020\u0007H&¨\u0006X"}, d2 = {"Li41;", "", "Ljw7;", "paymentWay", "Loz3;", "Lb61;", "f", "", "isRedirectSaveCardEnabled", "l", "", CrashHianalyticsData.TIME, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Long;)Loz3;", "currentState", "", "title", "isSuggested", "persistCurrentTimes", "r", "(Lb61;Ljava/lang/Long;Ljava/lang/String;ZZ)Loz3;", "Lou2;", "deliverablePlace", "Llk7$a;", "addressSource", "setDeliveryOrderType", "v", "Le91;", "clientDeliveryLocation", c.a, "Ld88;", "pizzeria", "Llk7$d;", "pizzeriaSource", "t", "isNearestPizzeria", "k", "(Ld88;Llk7$d;Ljava/lang/Boolean;)Loz3;", "n", "j", "isTakeaway", "a", "", "tableNumber", "g", "checkoutState", "Lhn6;", "cashNotes", "Lu51;", Image.TYPE_SMALL, "paymentSum", "merchantId", "gateway", "googlePayCreatePaymentRequestData", "Le22;", "p", "paymentId", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lts7;", e.a, "Los7;", "payment", "finishDeepLink", "Lzt9;", "w", "(Los7;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Ltm;", "A", "(Los7;Lcv1;)Ljava/lang/Object;", "z", "Lii7;", "i", "token", "u", "Lrs7;", "paymentAuthorization3DS", "pares", "md", "Liq1;", Image.TYPE_HIGH, "", "x", "y", "q", Image.TYPE_MEDIUM, "o", "isSelected", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: i41  reason: default package */
/* loaded from: classes4.dex */
public interface i41 {
    Object A(os7 os7Var, cv1<? super tm> cv1Var);

    oz3<b61> a(boolean z);

    oz3<b61> b(boolean z);

    oz3<b61> c(e91 e91Var);

    oz3<b61> d(Long l);

    oz3<ts7> e(String str, String str2);

    oz3<b61> f(jw7 jw7Var);

    oz3<b61> g(int i);

    oz3<iq1> h(String str, rs7 rs7Var, String str2, String str3);

    oz3<ii7> i();

    oz3<b61> j();

    oz3<b61> k(d88 d88Var, lk7.d dVar, Boolean bool);

    oz3<b61> l(boolean z);

    oz3<b61> m();

    oz3<b61> n();

    oz3<String> o();

    oz3<e22> p(hn6 hn6Var, String str, String str2, String str3);

    oz3<b61> q();

    oz3<b61> r(b61 b61Var, Long l, String str, boolean z, boolean z2);

    oz3<u51> s(b61 b61Var, hn6 hn6Var);

    oz3<b61> t(d88 d88Var, lk7.d dVar);

    oz3<ts7> u(String str, String str2);

    oz3<b61> v(ou2 ou2Var, lk7.a aVar, boolean z);

    Object w(os7 os7Var, String str, cv1<? super zt9> cv1Var);

    oz3 x();

    oz3<b61> y();

    oz3<ts7> z(os7 os7Var);
}
