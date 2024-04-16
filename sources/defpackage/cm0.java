package defpackage;

import java.io.IOException;
import kotlin.Metadata;
/* compiled from: Call.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcm0;", "", "Lhi9;", "request", "Lik9;", "execute", "Lfm0;", "responseCallback", "", "I0", "cancel", "", "isCanceled", "Lxgb;", "timeout", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: cm0  reason: default package */
/* loaded from: classes3.dex */
public interface cm0 extends Cloneable {

    /* compiled from: Call.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcm0$a;", "", "Lhi9;", "request", "Lcm0;", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cm0$a */
    /* loaded from: classes3.dex */
    public interface a {
        cm0 a(hi9 hi9Var);
    }

    void I0(fm0 fm0Var);

    void cancel();

    ik9 execute() throws IOException;

    boolean isCanceled();

    hi9 request();

    xgb timeout();
}
