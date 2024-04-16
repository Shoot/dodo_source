package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: LandingPhoneInputView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H'J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H'¨\u0006\u0011"}, d2 = {"Lsk5;", "Lmoxy/MvpView;", "", "phonePrefix", "", "D", "phoneNumber", "A", "R", "h0", "promoText", "personalDataUrl", "termsAndConditions", "buttonText", "address", "r9", "N0", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: sk5  reason: default package */
/* loaded from: classes4.dex */
public interface sk5 extends MvpView {
    @StateStrategyType(SkipStrategy.class)
    void A(String str);

    void D(String str);

    @StateStrategyType(SkipStrategy.class)
    void N0(String str, String str2);

    void R();

    void h0();

    void r9(String str, String str2, String str3, String str4, String str5);
}
