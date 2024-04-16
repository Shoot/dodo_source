package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: CardPaymentInteractor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J^\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\rH&J2\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00160\u000fj\u0002`\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¨\u0006\u0019"}, d2 = {"Lep0;", "", "", "paymentId", "cardNumber", "", "cardExpiryMonth", "cardExpiryYear", "cardCVV", "", "saveCard", "Loh3;", "encryptionData", "", "providerData", "Lwx;", "Lqs7;", "i", "Lrs7;", "paymentAuthorization3DS", "paRes", "md", "", "Lcom/dodopizza/async/AsyncJob;", Image.TYPE_HIGH, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ep0  reason: default package */
/* loaded from: classes4.dex */
public interface ep0 {
    wx<Unit> h(String str, rs7 rs7Var, String str2, String str3);

    wx<qs7> i(String str, String str2, int i, int i2, String str3, boolean z, oh3 oh3Var, Map<String, String> map);
}
