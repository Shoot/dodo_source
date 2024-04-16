package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaginateState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lfp7;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fp7  reason: default package */
/* loaded from: classes.dex */
public final class fp7 {
    public static final fp7 a = new fp7("IDLE", 0);
    public static final fp7 b = new fp7("LOADING", 1);
    public static final fp7 c = new fp7("ERROR", 2);
    public static final fp7 d = new fp7("NO_MORE_ITEMS", 3);
    private static final /* synthetic */ fp7[] e;
    private static final /* synthetic */ kj3 f;

    static {
        fp7[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private fp7(String str, int i) {
    }

    private static final /* synthetic */ fp7[] a() {
        return new fp7[]{a, b, c, d};
    }

    public static fp7 valueOf(String str) {
        return (fp7) Enum.valueOf(fp7.class, str);
    }

    public static fp7[] values() {
        return (fp7[]) e.clone();
    }
}
