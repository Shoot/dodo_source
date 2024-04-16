package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: Interceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lk65;", "", "Lk65$a;", "chain", "Lik9;", "intercept", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: k65  reason: default package */
/* loaded from: classes3.dex */
public interface k65 {

    /* compiled from: Interceptor.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lk65$a;", "", "Lhi9;", "request", "Lik9;", "b", "Loq1;", c.a, "Lcm0;", "call", "", DateTokenConverter.CONVERTER_KEY, "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k65$a */
    /* loaded from: classes3.dex */
    public interface a {
        int a();

        ik9 b(hi9 hi9Var) throws IOException;

        oq1 c();

        cm0 call();

        int d();

        hi9 request();
    }

    ik9 intercept(a aVar) throws IOException;
}
