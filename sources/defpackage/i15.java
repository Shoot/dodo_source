package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InfoStoryScreen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Li15;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i15  reason: default package */
/* loaded from: classes4.dex */
public final class i15 {
    public static final i15 b = new i15("FOOD_MENU_SCREEN", 0, "food_menu_info_story");
    public static final i15 c = new i15("PROFILE_SCREEN", 1, "profile_info_story");
    public static final i15 d = new i15("CART_SCREEN", 2, "cart_info_story");
    private static final /* synthetic */ i15[] e;
    private static final /* synthetic */ kj3 f;
    private final String a;

    static {
        i15[] a = a();
        e = a;
        f = lj3.a(a);
    }

    private i15(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ i15[] a() {
        return new i15[]{b, c, d};
    }

    public static i15 valueOf(String str) {
        return (i15) Enum.valueOf(i15.class, str);
    }

    public static i15[] values() {
        return (i15[]) e.clone();
    }

    public final String i() {
        return this.a;
    }
}
