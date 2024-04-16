package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MenuItemTypeV5.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lse6;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: se6  reason: default package */
/* loaded from: classes.dex */
public final class se6 {
    public static final se6 a = new se6("Unknown", 0);
    public static final se6 b = new se6("Product", 1);
    public static final se6 c = new se6("ComboTemplate", 2);
    public static final se6 d = new se6("ProductFromHalves", 3);
    public static final se6 e = new se6("AiProduct", 4);
    private static final /* synthetic */ se6[] f;
    private static final /* synthetic */ kj3 g;

    static {
        se6[] a2 = a();
        f = a2;
        g = lj3.a(a2);
    }

    private se6(String str, int i) {
    }

    private static final /* synthetic */ se6[] a() {
        return new se6[]{a, b, c, d, e};
    }

    public static se6 valueOf(String str) {
        return (se6) Enum.valueOf(se6.class, str);
    }

    public static se6[] values() {
        return (se6[]) f.clone();
    }
}
