package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SocialNetwork.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lbqa;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bqa  reason: default package */
/* loaded from: classes2.dex */
public final class bqa {
    public static final bqa a = new bqa("VK", 0);
    public static final bqa b = new bqa("FACEBOOK", 1);
    public static final bqa c = new bqa("INSTAGRAM", 2);
    public static final bqa d = new bqa("YOUTUBE", 3);
    public static final bqa e = new bqa("TWITTER", 4);
    private static final /* synthetic */ bqa[] f;
    private static final /* synthetic */ kj3 g;

    static {
        bqa[] a2 = a();
        f = a2;
        g = lj3.a(a2);
    }

    private bqa(String str, int i) {
    }

    private static final /* synthetic */ bqa[] a() {
        return new bqa[]{a, b, c, d, e};
    }

    public static bqa valueOf(String str) {
        return (bqa) Enum.valueOf(bqa.class, str);
    }

    public static bqa[] values() {
        return (bqa[]) f.clone();
    }
}
