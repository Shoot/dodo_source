package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoyaltyWidgetDataVO.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000b¨\u0006\f"}, d2 = {"Ld36;", "", "Lu4c;", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: d36  reason: default package */
/* loaded from: classes4.dex */
public final class d36 implements u4c {
    public static final d36 b = new d36("LOYALTY_WIDGET", 0, "loyalty_widget");
    private static final /* synthetic */ d36[] c;
    private static final /* synthetic */ kj3 d;
    private final String a;

    static {
        d36[] a = a();
        c = a;
        d = lj3.a(a);
    }

    private d36(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ d36[] a() {
        return new d36[]{b};
    }

    public static d36 valueOf(String str) {
        return (d36) Enum.valueOf(d36.class, str);
    }

    public static d36[] values() {
        return (d36[]) c.clone();
    }

    @Override // defpackage.u4c
    public String getId() {
        return this.a;
    }
}
