package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: CardChargeService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J>\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000fH&J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u001d"}, d2 = {"Lvo0;", "", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lys7;", "paymentData", "Los7;", "g", "paymentId", "Lxo0;", "cardCredentials", "", "saveCard", "Loh3;", "encryptionData", "", "providerData", "Lqs7;", Image.TYPE_HIGH, "cryptogram", "i", e.a, "Lrs7;", "paymentAuthorization3DS", "paRes", "md", "", "j", "f", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vo0  reason: default package */
/* loaded from: classes2.dex */
public interface vo0 {
    qs7 e(String str, String str2);

    qs7 f(String str, String str2);

    os7 g(String str, ys7 ys7Var);

    qs7 h(String str, xo0 xo0Var, boolean z, oh3 oh3Var, Map<String, String> map);

    qs7 i(String str, String str2, boolean z);

    void j(String str, rs7 rs7Var, String str2, String str3);
}
