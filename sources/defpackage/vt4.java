package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IgnoreQueriesProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lvt4;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "emptyResponse", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "backend"}, k = 1, mv = {1, 9, 0})
/* renamed from: vt4  reason: default package */
/* loaded from: classes4.dex */
public final class vt4 {
    public static final vt4 b = new vt4("JSON_OBJECT", 0, "{}");
    public static final vt4 c = new vt4("JSON_ARRAY", 1, "[]");
    public static final vt4 d = new vt4("EMPTY", 2, "");
    private static final /* synthetic */ vt4[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        vt4[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private vt4(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ vt4[] a() {
        return new vt4[]{b, c, d};
    }

    public static vt4 valueOf(String str) {
        return (vt4) Enum.valueOf(vt4.class, str);
    }

    public static vt4[] values() {
        return (vt4[]) e.clone();
    }

    public final String i() {
        return this.a;
    }
}
