package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonalWidgetDataVO.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lc28;", "", "Lu4c;", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c28  reason: default package */
/* loaded from: classes4.dex */
public final class c28 implements u4c {
    public static final c28 b = new c28("REFERRAL_WIDGET", 0, "referral_widget");
    public static final c28 c = new c28("INVITE_CODE_WIDGET", 1, "invite_code_widget");
    public static final c28 d = new c28("ADDRESS_WIDGET", 2, "address_widget");
    public static final c28 e = new c28("ORDER_WIDGET", 3, "ORDER_WIDGET");
    private static final /* synthetic */ c28[] f;
    private static final /* synthetic */ kj3 g;
    private final String a;

    static {
        c28[] a = a();
        f = a;
        g = lj3.a(a);
    }

    private c28(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ c28[] a() {
        return new c28[]{b, c, d, e};
    }

    public static c28 valueOf(String str) {
        return (c28) Enum.valueOf(c28.class, str);
    }

    public static c28[] values() {
        return (c28[]) f.clone();
    }

    @Override // defpackage.u4c
    public String getId() {
        return this.a;
    }
}
