package defpackage;

import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Metadata;
import kotlinx.coroutines.TimeoutCancellationException;
import retrofit2.HttpException;
import ru.dodopizza.app.data.dto.response.CheckApiResponse;
/* compiled from: ApiCheckService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, d2 = {"", "", "a", "Lru/dodopizza/app/data/dto/response/CheckApiResponse;", "Lb31;", "b", "app_prodRelease"}, k = 2, mv = {1, 9, 0})
/* renamed from: gm  reason: default package */
/* loaded from: classes4.dex */
public final class gm {
    public static final boolean a(Throwable th) {
        z65.h(th, "<this>");
        if ((!(th instanceof HttpException) || ((HttpException) th).code() < 400) && !(th instanceof UnknownHostException) && !(th.getCause() instanceof UnknownHostException) && !(th instanceof MalformedURLException) && !(th.getCause() instanceof MalformedURLException) && !(th instanceof SocketTimeoutException) && !(th.getCause() instanceof SocketTimeoutException) && !(th instanceof ConnectException) && !(th.getCause() instanceof ConnectException) && !(th instanceof SSLHandshakeException) && !(th.getCause() instanceof SSLHandshakeException) && !(th instanceof TimeoutCancellationException)) {
            return false;
        }
        return true;
    }

    public static final b31 b(CheckApiResponse checkApiResponse) {
        z65.h(checkApiResponse, "<this>");
        Integer errorCode = checkApiResponse.getErrorCode();
        if (errorCode != null && errorCode.intValue() == 1) {
            return b31.a;
        }
        return b31.c;
    }
}
