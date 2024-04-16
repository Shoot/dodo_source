package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
/* compiled from: PaymentMethodListInteractor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J.\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n0\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\"\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\u0004j\u0002`\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0011\u001a\u00020\bH&J\u0012\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u000e0\u0004j\u0002`\u000fH&¨\u0006\u0014"}, d2 = {"Lot7;", "", "", "isCarryoutOrRestaurant", "Lwx;", "Lvt7;", DateTokenConverter.CONVERTER_KEY, "", "", "cardIds", "Lkotlin/Pair;", c.a, "email", "needToSubscribeToNews", "", "Lcom/dodopizza/async/AsyncJob;", e.a, "taxPayerId", "b", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ot7  reason: default package */
/* loaded from: classes4.dex */
public interface ot7 {
    wx<Unit> a();

    wx<String> b(String str);

    wx<Pair<Boolean, List<String>>> c(List<String> list);

    wx<vt7> d(boolean z);

    wx<Unit> e(String str, boolean z);
}
