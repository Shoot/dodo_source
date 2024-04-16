package defpackage;

import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: CollaborationPromoDialogView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H'J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&¨\u0006\u001b"}, d2 = {"Lnb1;", "Lmoxy/MvpView;", "", "title", "", "W2", "information", "Pc", "imageUrl", "z", "w0", "close", "promoCode", "a1", "z4", ElementGenerator.TYPE_LINK, "m1", "J1", "M2", "", "expireTimeMillis", "n", "v", "B", "l5", "o1", "g8", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: nb1  reason: default package */
/* loaded from: classes4.dex */
public interface nb1 extends MvpView {
    void B();

    void J1();

    void M2();

    void Pc(String str);

    void W2(String str);

    void a1(String str);

    void close();

    void g8();

    void l5(String str);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void m1(String str);

    void n(long j);

    void o1();

    void v(long j);

    void w0();

    void z(String str);

    void z4();
}
