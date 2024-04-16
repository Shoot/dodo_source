package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoriesAnalytics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ljya;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jya  reason: default package */
/* loaded from: classes4.dex */
public final class jya implements qd {
    public static final jya b = new jya("MENU", 0, "menu");
    public static final jya c = new jya("PUSH", 1, "push");
    public static final jya d = new jya("STORIES", 2, "stories");
    private static final /* synthetic */ jya[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        jya[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private jya(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ jya[] a() {
        return new jya[]{b, c, d};
    }

    public static jya valueOf(String str) {
        return (jya) Enum.valueOf(jya.class, str);
    }

    public static jya[] values() {
        return (jya[]) e.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
