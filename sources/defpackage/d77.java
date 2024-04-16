package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\t\"\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u001c\u0010\u0017\u001a\u00020\n*\u00060\u0013j\u0002`\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ljava/io/OutputStream;", "Lzma;", DateTokenConverter.CONVERTER_KEY, "Ljava/io/InputStream;", "Lpqa;", Image.TYPE_HIGH, "Ljava/net/Socket;", e.a, "i", "Ljava/io/File;", "", "append", c.a, "g", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "b", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 9, 0}, xs = "okio/Okio")
/* renamed from: d77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d77 {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        String message;
        boolean O;
        z65.h(assertionError, "<this>");
        if (assertionError.getCause() != null && (message = assertionError.getMessage()) != null) {
            O = m0b.O(message, "getsockname failed", false, 2, null);
            if (!O) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final zma c(File file, boolean z) throws FileNotFoundException {
        z65.h(file, "<this>");
        return c77.f(new FileOutputStream(file, z));
    }

    public static final zma d(OutputStream outputStream) {
        z65.h(outputStream, "<this>");
        return new om7(outputStream, new xgb());
    }

    public static final zma e(Socket socket) throws IOException {
        z65.h(socket, "<this>");
        fqa fqaVar = new fqa(socket);
        OutputStream outputStream = socket.getOutputStream();
        z65.g(outputStream, "getOutputStream(...)");
        return fqaVar.z(new om7(outputStream, fqaVar));
    }

    public static /* synthetic */ zma f(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return c77.e(file, z);
    }

    public static final pqa g(File file) throws FileNotFoundException {
        z65.h(file, "<this>");
        return new y35(new FileInputStream(file), xgb.e);
    }

    public static final pqa h(InputStream inputStream) {
        z65.h(inputStream, "<this>");
        return new y35(inputStream, new xgb());
    }

    public static final pqa i(Socket socket) throws IOException {
        z65.h(socket, "<this>");
        fqa fqaVar = new fqa(socket);
        InputStream inputStream = socket.getInputStream();
        z65.g(inputStream, "getInputStream(...)");
        return fqaVar.A(new y35(inputStream, fqaVar));
    }
}
