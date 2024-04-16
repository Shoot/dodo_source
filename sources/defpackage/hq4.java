package defpackage;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import org.slf4j.Logger;
import retrofit2.HttpException;
/* compiled from: HttpErrorLogger.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\b"}, d2 = {"Lorg/slf4j/Logger;", "", "throwable", "", "message", "", "a", "b", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: hq4  reason: default package */
/* loaded from: classes4.dex */
public final class hq4 {
    public static final void a(Logger logger, Throwable th, String str) {
        z65.h(logger, "<this>");
        z65.h(th, "throwable");
        z65.h(str, "message");
        logger.error(b(th, str), th);
    }

    private static final String b(Throwable th, String str) {
        int code;
        if (!(th instanceof HttpException)) {
            if (th instanceof SocketTimeoutException) {
                return str + ", превышено время ожидания";
            } else if (th instanceof UnknownHostException) {
                return str + ", неизвестный адрес, возможно интернет не доступен";
            } else {
                return str;
            }
        }
        HttpException httpException = (HttpException) th;
        if (httpException.code() == 429) {
            return str + ", слишком частые запросы";
        } else if (httpException.code() != 400 && (402 > (code = httpException.code()) || code >= 500)) {
            if (httpException.code() >= 500) {
                return str + ", ошибка сервера";
            }
            return str;
        } else {
            String message = httpException.message();
            return str + ", плохой запрос " + message;
        }
    }
}
