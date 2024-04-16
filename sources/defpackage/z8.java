package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddressListSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lz8;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z8  reason: default package */
/* loaded from: classes4.dex */
public final class z8 {
    public static final z8 a = new z8("MENU", 0);
    public static final z8 b = new z8("CHECKOUT", 1);
    public static final z8 c = new z8("PROFILE", 2);
    private static final /* synthetic */ z8[] d;
    private static final /* synthetic */ kj3 e;

    static {
        z8[] a2 = a();
        d = a2;
        e = lj3.a(a2);
    }

    private z8(String str, int i) {
    }

    private static final /* synthetic */ z8[] a() {
        return new z8[]{a, b, c};
    }

    public static z8 valueOf(String str) {
        return (z8) Enum.valueOf(z8.class, str);
    }

    public static z8[] values() {
        return (z8[]) d.clone();
    }
}
