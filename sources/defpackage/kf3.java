package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: EmailForChecksView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lkf3;", "Lmoxy/MvpView;", "", "email", "", "Sg", "", "isSubscribed", "sc", "isEnabled", "Q0", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kf3  reason: default package */
/* loaded from: classes4.dex */
public interface kf3 extends MvpView {
    void Q0(boolean z);

    void Sg(String str);

    void a();

    void sc(boolean z);
}
