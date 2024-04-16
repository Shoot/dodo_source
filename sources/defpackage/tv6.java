package defpackage;

import android.content.Context;
import com.google.gson.JsonParseException;
import defpackage.k65;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.HttpException;
/* compiled from: NetworkAvailabilityCheckInterceptor.java */
/* renamed from: tv6  reason: default package */
/* loaded from: classes3.dex */
public class tv6 implements k65 {
    private final Logger a = LoggerFactory.getLogger("NetworkAvailabilityCheckInterceptor");
    private vc6 b;
    private jv5 c;
    private Context d;

    public tv6(vc6 vc6Var, Context context, jv5 jv5Var) {
        this.b = vc6Var;
        this.d = context;
        this.c = jv5Var;
    }

    private void a(Throwable th) {
        if (th instanceof HttpException) {
            this.b.g(vv6.a);
        } else if (th instanceof SocketTimeoutException) {
            String b = b();
            Logger logger = this.a;
            logger.error("SocketTimeoutException in locality " + b, th);
        } else {
            String b2 = b();
            String b3 = px6.b(this.d);
            if (!(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof JsonParseException) && !(th instanceof InterruptedIOException)) {
                this.a.warn("Check online was unsuccessful due to error. ", th);
                Logger logger2 = this.a;
                logger2.error("in locality " + b2 + ", ip " + b3, th);
                if (!px6.a(b2) || (th instanceof SSLHandshakeException)) {
                    this.b.g(vv6.b);
                    return;
                }
                return;
            }
            this.a.warn("Connection error caused by exception. ", th);
            Logger logger3 = this.a;
            logger3.error("In locality " + b2, th);
        }
    }

    private String b() {
        dt5 i = this.c.i();
        if (i != null) {
            return i.getId();
        }
        return "";
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        try {
            return aVar.b(aVar.request());
        } catch (Throwable th) {
            a(th);
            throw th;
        }
    }
}
