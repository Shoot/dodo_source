package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: CheckoutOrderProcessingService.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH&J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH&J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH&J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH&J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006!"}, d2 = {"Lq51;", "", "Lb61;", "checkoutState", "Lhn6;", "cashNotes", "Loz3;", "Lu51;", Image.TYPE_SMALL, "Lii7;", "i", "", "paymentId", "Lrs7;", "paymentAuthorization3DS", "pares", "md", "Liq1;", Image.TYPE_HIGH, "paymentSum", "gateway", "merchantId", "googlePayCreatePaymentRequestData", "Le22;", "p", "token", "Lts7;", "a", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "f", e.a, "q", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: q51  reason: default package */
/* loaded from: classes4.dex */
public interface q51 {
    oz3<ts7> a(String str, String str2);

    oz3<b61> b();

    oz3<ts7> e(String str, String str2);

    oz3<ts7> f(String str, String str2);

    oz3<iq1> h(String str, rs7 rs7Var, String str2, String str3);

    oz3<ii7> i();

    oz3<e22> p(hn6 hn6Var, String str, String str2, String str3);

    oz3<b61> q();

    oz3<u51> s(b61 b61Var, hn6 hn6Var);
}
