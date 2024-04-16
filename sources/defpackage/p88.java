package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lp88;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p88  reason: default package */
/* loaded from: classes4.dex */
public final class p88 {
    public static final p88 b = new p88("OPEN", 0, "open");
    public static final p88 c = new p88("KIDS_ROOM", 1, "kids_room");
    public static final p88 d = new p88("TABLE_DELIVERY", 2, "table_delivery");
    public static final p88 e = new p88("MASTER_CLASS", 3, "master_class");
    private static final /* synthetic */ p88[] f;
    private static final /* synthetic */ kj3 g;
    private final String a;

    static {
        p88[] a = a();
        f = a;
        g = lj3.a(a);
    }

    private p88(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ p88[] a() {
        return new p88[]{b, c, d, e};
    }

    public static p88 valueOf(String str) {
        return (p88) Enum.valueOf(p88.class, str);
    }

    public static p88[] values() {
        return (p88[]) f.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
