package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
/* compiled from: InstrumentApacheHttpResponseHandler.java */
/* renamed from: p55  reason: default package */
/* loaded from: classes2.dex */
public class p55<T> implements ResponseHandler<T> {
    private final ResponseHandler<? extends T> a;
    private final Timer b;
    private final gw6 c;

    public p55(ResponseHandler<? extends T> responseHandler, Timer timer, gw6 gw6Var) {
        this.a = responseHandler;
        this.b = timer;
        this.c = gw6Var;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.c.r(this.b.c());
        this.c.k(httpResponse.getStatusLine().getStatusCode());
        Long a = hw6.a(httpResponse);
        if (a != null) {
            this.c.p(a.longValue());
        }
        String b = hw6.b(httpResponse);
        if (b != null) {
            this.c.o(b);
        }
        this.c.b();
        return (T) this.a.handleResponse(httpResponse);
    }
}
