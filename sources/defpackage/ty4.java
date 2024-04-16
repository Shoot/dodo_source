package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppNotificationThemeVO.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B%\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\tj\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u0005¨\u0006\u001a"}, d2 = {"Lty4;", "", "", "a", "I", "o", "()I", "id", "b", "k", "gradient", c.a, "q", "textColorResId", "<init>", "(Ljava/lang/String;IIII)V", DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "l", Image.TYPE_MEDIUM, "n", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ty4  reason: default package */
/* loaded from: classes2.dex */
public final class ty4 {
    public static final a d;
    public static final ty4 e;
    public static final ty4 f;
    public static final ty4 g;
    public static final ty4 h;
    public static final ty4 i;
    public static final ty4 j;
    public static final ty4 k;
    public static final ty4 l;
    public static final ty4 m;
    public static final ty4 n;
    public static final ty4 o;
    private static final /* synthetic */ ty4[] p;
    private static final /* synthetic */ kj3 q;
    private final int a;
    private final int b;
    private final int c;

    /* compiled from: InAppNotificationThemeVO.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lty4$a;", "", "", "themeId", "Lty4;", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ty4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ty4 a(int i) {
            Object obj;
            Iterator<E> it = ty4.i().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ty4) obj).o() == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (ty4) mh5.c(obj, ty4.e);
        }
    }

    static {
        int i2 = bx8.static_notification_bg_preset_violet;
        int i3 = ew8.p;
        e = new ty4("THEME_1", 0, 1, i2, i3);
        f = new ty4("THEME_2", 1, 2, bx8.static_notification_bg_preset_pink, i3);
        g = new ty4("THEME_3", 2, 3, bx8.static_notification_bg_preset_orange, i3);
        h = new ty4("THEME_4", 3, 4, bx8.static_notification_bg_custom_pink, i3);
        i = new ty4("THEME_5", 4, 5, bx8.static_notification_bg_custom_pink2, i3);
        j = new ty4("THEME_6", 5, 6, bx8.static_notification_bg_custom_violet, i3);
        k = new ty4("THEME_7", 6, 7, bx8.static_notification_bg_custom_violet2, i3);
        int i4 = bx8.static_notification_bg_custom_light_yellow;
        int i5 = ew8.o;
        l = new ty4("THEME_8", 7, 8, i4, i5);
        m = new ty4("THEME_9", 8, 9, bx8.static_notification_bg_custom_light_pink, i5);
        n = new ty4("THEME_10", 9, 10, bx8.static_notification_bg_custom_light_violet, i5);
        o = new ty4("THEME_11", 10, 11, bx8.static_notification_bg_custom_light_green, i5);
        ty4[] a2 = a();
        p = a2;
        q = lj3.a(a2);
        d = new a(null);
    }

    private ty4(String str, int i2, int i3, int i4, int i5) {
        this.a = i3;
        this.b = i4;
        this.c = i5;
    }

    private static final /* synthetic */ ty4[] a() {
        return new ty4[]{e, f, g, h, i, j, k, l, m, n, o};
    }

    public static kj3<ty4> i() {
        return q;
    }

    public static ty4 valueOf(String str) {
        return (ty4) Enum.valueOf(ty4.class, str);
    }

    public static ty4[] values() {
        return (ty4[]) p.clone();
    }

    public final int k() {
        return this.b;
    }

    public final int o() {
        return this.a;
    }

    public final int q() {
        return this.c;
    }
}
