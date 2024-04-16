package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionMapType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lnaa;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: naa  reason: default package */
/* loaded from: classes.dex */
public final class naa {
    public static final naa a = new naa("DELIVERY", 0);
    public static final naa b = new naa("PIZZERIA", 1);
    public static final naa c = new naa("PIZZERIA_SUGGESTIONS", 2);
    public static final naa d = new naa("DELIVERY_SUGGESTIONS", 3);
    private static final /* synthetic */ naa[] e;
    private static final /* synthetic */ kj3 f;

    static {
        naa[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private naa(String str, int i) {
    }

    private static final /* synthetic */ naa[] a() {
        return new naa[]{a, b, c, d};
    }

    public static naa valueOf(String str) {
        return (naa) Enum.valueOf(naa.class, str);
    }

    public static naa[] values() {
        return (naa[]) e.clone();
    }
}
