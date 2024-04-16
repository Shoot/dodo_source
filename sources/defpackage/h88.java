package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PizzeriaFilter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lh88;", "", "", "a", "I", "k", "()I", "resId", "b", "i", BonusActionEntity.ORDER, "<init>", "(Ljava/lang/String;III)V", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: h88  reason: default package */
/* loaded from: classes4.dex */
public final class h88 {
    public static final h88 c = new h88("Open", 0, R.string.filter_open, 1);
    public static final h88 d = new h88("KidsPlayground", 1, R.string.filter_kids_playground, 2);
    public static final h88 e = new h88("Workshops", 2, R.string.filter_workshops, 3);
    public static final h88 f = new h88("DeliveryToTable", 3, R.string.filter_delivery_to_table, 4);
    private static final /* synthetic */ h88[] g;
    private static final /* synthetic */ kj3 h;
    private final int a;
    private final int b;

    static {
        h88[] a = a();
        g = a;
        h = lj3.a(a);
    }

    private h88(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    private static final /* synthetic */ h88[] a() {
        return new h88[]{c, d, e, f};
    }

    public static h88 valueOf(String str) {
        return (h88) Enum.valueOf(h88.class, str);
    }

    public static h88[] values() {
        return (h88[]) g.clone();
    }

    public final int i() {
        return this.b;
    }

    public final int k() {
        return this.a;
    }
}
