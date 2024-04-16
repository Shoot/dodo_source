package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import kotlin.Metadata;
/* compiled from: Credentials.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lo22;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: o22  reason: default package */
/* loaded from: classes3.dex */
public final class o22 {
    public static final o22 a = new o22();

    private o22() {
    }

    public static final String a(String str, String str2, Charset charset) {
        z65.h(str, "username");
        z65.h(str2, "password");
        z65.h(charset, "charset");
        String a2 = lk0.d.c(str + CoreConstants.COLON_CHAR + str2, charset).a();
        return "Basic " + a2;
    }
}
