package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChoiceTypeV5.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ld71;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: d71  reason: default package */
/* loaded from: classes.dex */
public final class d71 {
    public static final d71 a = new d71("Unknown", 0);
    public static final d71 b = new d71("None", 1);
    public static final d71 c = new d71("Single", 2);
    public static final d71 d = new d71("Multiple", 3);
    private static final /* synthetic */ d71[] e;
    private static final /* synthetic */ kj3 f;

    static {
        d71[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private d71(String str, int i) {
    }

    private static final /* synthetic */ d71[] a() {
        return new d71[]{a, b, c, d};
    }

    public static d71 valueOf(String str) {
        return (d71) Enum.valueOf(d71.class, str);
    }

    public static d71[] values() {
        return (d71[]) e.clone();
    }
}
