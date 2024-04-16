package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressComponentVO.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lc7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c7  reason: default package */
/* loaded from: classes2.dex */
public final class c7 {
    public static final c7 a = new c7("SMALL", 0);
    public static final c7 b = new c7("MEDIUM", 1);
    public static final c7 c = new c7("LARGE", 2);
    public static final c7 d = new c7("MULTILINE", 3);
    private static final /* synthetic */ c7[] e;
    private static final /* synthetic */ kj3 f;

    static {
        c7[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private c7(String str, int i) {
    }

    private static final /* synthetic */ c7[] a() {
        return new c7[]{a, b, c, d};
    }

    public static c7 valueOf(String str) {
        return (c7) Enum.valueOf(c7.class, str);
    }

    public static c7[] values() {
        return (c7[]) e.clone();
    }
}
