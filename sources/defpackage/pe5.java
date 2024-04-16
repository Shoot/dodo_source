package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lpe5;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: pe5  reason: default package */
/* loaded from: classes3.dex */
public final class pe5 {
    public static final pe5 a = new pe5("PUBLIC", 0);
    public static final pe5 b = new pe5("PROTECTED", 1);
    public static final pe5 c = new pe5("INTERNAL", 2);
    public static final pe5 d = new pe5("PRIVATE", 3);
    private static final /* synthetic */ pe5[] e;
    private static final /* synthetic */ kj3 f;

    static {
        pe5[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private pe5(String str, int i) {
    }

    private static final /* synthetic */ pe5[] a() {
        return new pe5[]{a, b, c, d};
    }

    public static pe5 valueOf(String str) {
        return (pe5) Enum.valueOf(pe5.class, str);
    }

    public static pe5[] values() {
        return (pe5[]) e.clone();
    }
}
