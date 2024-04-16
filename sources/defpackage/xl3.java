package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ik9;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: ExchangeCodec.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\bH&R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lxl3;", "", "Lhi9;", "request", "", "contentLength", "Lzma;", DateTokenConverter.CONVERTER_KEY, "", e.a, "g", "b", "", "expectContinue", "Lik9$a;", "f", "Lik9;", "response", c.a, "Lpqa;", "a", "Lgn4;", "i", "cancel", "Lxl3$a;", Image.TYPE_HIGH, "()Lxl3$a;", "carrier", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: xl3  reason: default package */
/* loaded from: classes3.dex */
public interface xl3 {

    /* compiled from: ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&R\u0014\u0010\f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lxl3$a;", "", "Lt79;", "call", "Ljava/io/IOException;", e.a, "", c.a, "b", "cancel", "Lqo9;", "()Lqo9;", "route", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xl3$a */
    /* loaded from: classes3.dex */
    public interface a {
        void b();

        void c(t79 t79Var, IOException iOException);

        void cancel();

        qo9 e();
    }

    pqa a(ik9 ik9Var) throws IOException;

    void b() throws IOException;

    long c(ik9 ik9Var) throws IOException;

    void cancel();

    zma d(hi9 hi9Var, long j) throws IOException;

    void e(hi9 hi9Var) throws IOException;

    ik9.a f(boolean z) throws IOException;

    void g() throws IOException;

    a h();

    gn4 i() throws IOException;
}
