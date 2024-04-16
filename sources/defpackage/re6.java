package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuItemType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lre6;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: re6  reason: default package */
/* loaded from: classes4.dex */
public final class re6 {
    public static final re6 a = new re6("SIMPLE", 0);
    public static final re6 b = new re6("PIZZA", 1);
    public static final re6 c = new re6("HALVES", 2);
    public static final re6 d = new re6("COMBO_TEMPLATE", 3);
    public static final re6 e = new re6("VARIABLE", 4);
    public static final re6 f = new re6("ASSISTANT", 5);
    private static final /* synthetic */ re6[] g;
    private static final /* synthetic */ kj3 h;

    static {
        re6[] a2 = a();
        g = a2;
        h = lj3.a(a2);
    }

    private re6(String str, int i) {
    }

    private static final /* synthetic */ re6[] a() {
        return new re6[]{a, b, c, d, e, f};
    }

    public static re6 valueOf(String str) {
        return (re6) Enum.valueOf(re6.class, str);
    }

    public static re6[] values() {
        return (re6[]) g.clone();
    }
}
