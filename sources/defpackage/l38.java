package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: PhoneNumberCollectorView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Ll38;", "Lmoxy/MvpView;", "", "phonePrefix", "", "D", "phoneNumber", "A", "", "isEnabled", "ke", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l38  reason: default package */
/* loaded from: classes2.dex */
public interface l38 extends MvpView {
    @StateStrategyType(SkipStrategy.class)
    void A(String str);

    void D(String str);

    void ke(boolean z);
}
