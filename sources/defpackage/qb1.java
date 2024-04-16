package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CollaborationPromoSender.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lqb1;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qb1  reason: default package */
/* loaded from: classes4.dex */
public final class qb1 implements qd {
    public static final qb1 b = new qb1("PROFILE", 0, "profile");
    public static final qb1 c = new qb1("PARTNER_BONUSES", 1, "partnerBonuses");
    private static final /* synthetic */ qb1[] d;
    private static final /* synthetic */ kj3 e;
    private final String a;

    static {
        qb1[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private qb1(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ qb1[] a() {
        return new qb1[]{b, c};
    }

    public static qb1 valueOf(String str) {
        return (qb1) Enum.valueOf(qb1.class, str);
    }

    public static qb1[] values() {
        return (qb1[]) d.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
