package defpackage;

import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: SessionDataStoreConfigs.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0005\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u0004\u0010\t¨\u0006\u000f"}, d2 = {"Lcea;", "", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "PROCESS_NAME", c.a, "a", "()Ljava/lang/String;", "SESSIONS_CONFIG_NAME", DateTokenConverter.CONVERTER_KEY, "SETTINGS_CONFIG_NAME", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: cea  reason: default package */
/* loaded from: classes2.dex */
public final class cea {
    public static final cea a = new cea();
    private static final String b;
    private static final String c;
    private static final String d;

    static {
        byte[] s;
        s = l0b.s(ok8.a.e());
        String encodeToString = Base64.encodeToString(s, 10);
        b = encodeToString;
        c = "firebase_session_" + encodeToString + "_data";
        d = "firebase_session_" + encodeToString + "_settings";
    }

    private cea() {
    }

    public final String a() {
        return c;
    }

    public final String b() {
        return d;
    }
}
