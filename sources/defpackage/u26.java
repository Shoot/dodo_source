package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoyaltyProgramAnalytics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lu26;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u26  reason: default package */
/* loaded from: classes4.dex */
public final class u26 implements qd {
    public static final u26 b = new u26("PROFILE", 0, "profile");
    public static final u26 c = new u26("WIDGET", 1, "widget");
    public static final u26 d = new u26("MENU", 2, "menu");
    public static final u26 e = new u26("LOYALTY", 3, "loyalty");
    public static final u26 f = new u26("MISSION_DETAILS", 4, "mission_details");
    public static final u26 g = new u26("PUSH", 5, "push");
    public static final u26 h = new u26("REFERRAL", 6, "referral_success_applied_code");
    private static final /* synthetic */ u26[] i;
    private static final /* synthetic */ kj3 j;
    private final String a;

    static {
        u26[] a = a();
        i = a;
        j = lj3.a(a);
    }

    private u26(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ u26[] a() {
        return new u26[]{b, c, d, e, f, g, h};
    }

    public static u26 valueOf(String str) {
        return (u26) Enum.valueOf(u26.class, str);
    }

    public static u26[] values() {
        return (u26[]) i.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
