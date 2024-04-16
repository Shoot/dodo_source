package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lby5;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: by5  reason: default package */
/* loaded from: classes3.dex */
public final class by5 {
    public static final by5 a = new by5("NONE", 0);
    public static final by5 b = new by5("BASIC", 1);
    public static final by5 c = new by5("HEADERS", 2);
    public static final by5 d = new by5("BODY", 3);
    private static final /* synthetic */ by5[] e;
    private static final /* synthetic */ kj3 f;

    static {
        by5[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private by5(String str, int i) {
    }

    private static final /* synthetic */ by5[] a() {
        return new by5[]{a, b, c, d};
    }

    public static by5 valueOf(String str) {
        return (by5) Enum.valueOf(by5.class, str);
    }

    public static by5[] values() {
        return (by5[]) e.clone();
    }
}
