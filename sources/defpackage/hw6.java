package defpackage;

import androidx.annotation.NonNull;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
/* compiled from: NetworkRequestMetricBuilderUtil.java */
/* renamed from: hw6  reason: default package */
/* loaded from: classes2.dex */
public final class hw6 {
    private static final Pattern a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(@NonNull HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            sh.e().a("The content-length value is not a valid number");
            return null;
        }
    }

    public static String b(@NonNull HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null && (value = firstHeader.getValue()) != null) {
            return value;
        }
        return null;
    }

    public static boolean c(String str) {
        if (str != null && a.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static void d(gw6 gw6Var) {
        if (!gw6Var.f()) {
            gw6Var.l();
        }
        gw6Var.b();
    }
}
