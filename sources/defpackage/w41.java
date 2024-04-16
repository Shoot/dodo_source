package defpackage;

import com.google.android.gms.wallet.PaymentDataRequest;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: CheckoutDetailsView.kt */
@StateStrategyType(OneExecutionStateStrategy.class)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H'J\b\u0010\u001c\u001a\u00020\u0004H'J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H'J\b\u0010\u001f\u001a\u00020\u0004H'J\u0016\u0010#\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H'J\b\u0010$\u001a\u00020\u0004H&J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H'J\b\u0010(\u001a\u00020\u0004H&J\b\u0010)\u001a\u00020\u0004H&J\b\u0010*\u001a\u00020\u0004H&J\b\u0010+\u001a\u00020\u0004H&J\b\u0010,\u001a\u00020\u0004H&J\b\u0010-\u001a\u00020\u0004H&J\b\u0010.\u001a\u00020\u0004H&J\b\u0010/\u001a\u00020\u0004H&J\b\u00100\u001a\u00020\u0004H&J\b\u00101\u001a\u00020\u0004H&¨\u00062"}, d2 = {"Lw41;", "Lmoxy/MvpView;", "Lb61;", "model", "", "v5", "V3", "", "paymentId", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "paymentDataRequest", "Lz41;", "googlePayListener", "env", "Y3", "deepLink", "Rb", RemoteMessageConst.Notification.URL, "Q5", "Lhu9;", "sbpBank", "x1", "lc", "Lik3;", "errorMessage", "V8", "L8", "Tc", "a7", "discount", "P0", "W", "", "Lok9;", "serviceTypes", "E6", "Wd", "", "index", "f6", "C8", "Zf", "k2", "jf", "I1", "P9", "Df", "Mb", "O2", "T6", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: w41  reason: default package */
/* loaded from: classes4.dex */
public interface w41 extends MvpView {
    void C8();

    void Df();

    @StateStrategyType(SkipStrategy.class)
    void E6(List<? extends ok9> list);

    void I1();

    void L8();

    void Mb();

    void O2();

    @StateStrategyType(AddToEndSingleStrategy.class)
    void P0(String str);

    void P9();

    void Q5(String str);

    void Rb(String str);

    void T6();

    @StateStrategyType(AddToEndSingleStrategy.class)
    void Tc();

    void V3(b61 b61Var);

    void V8(ik3 ik3Var);

    @StateStrategyType(AddToEndSingleStrategy.class)
    void W();

    void Wd();

    void Y3(String str, PaymentDataRequest paymentDataRequest, z41 z41Var, String str2);

    void Zf();

    @StateStrategyType(AddToEndSingleStrategy.class)
    void a7();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void f6(int i);

    void jf();

    void k2();

    void lc(String str);

    @StateStrategyType(AddToEndSingleStrategy.class)
    void v5(b61 b61Var);

    void x1(String str, hu9 hu9Var);
}
