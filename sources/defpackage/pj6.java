package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: MindboxCredentials.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000f\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\b\u0010\u0004¨\u0006\u000f"}, d2 = {"Loj6;", "a", "Loj6;", e.a, "()Loj6;", "RUS_CREDENTIALS", "b", "DEBUG_RUS_CREDENTIALS", c.a, DateTokenConverter.CONVERTER_KEY, "EU_CREDENTIALS", "DEBUG_EU_CREDENTIALS", "f", "WORLD_CREDENTIALS", "DEBUG_WORLD_CREDENTIALS", "mindbox_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: pj6  reason: default package */
/* loaded from: classes4.dex */
public final class pj6 {
    private static final oj6 a;
    private static final oj6 b;
    private static final oj6 c;
    private static final oj6 d;
    private static final oj6 e;
    private static final oj6 f;

    static {
        oj6 oj6Var = new oj6("api.mindbox.ru", "dodopizza-android", "38LeYe7QLKLVS4TuGUt3", "dodopizza");
        a = oj6Var;
        b = oj6.b(oj6Var, null, "dodopizza-android-sandbox", "CxhMCJ52PCjwhMlyNdYP", null, 9, null);
        oj6 oj6Var2 = new oj6("api.mindbox.cloud", "android", "FxEO2KAJXWhB3NRvLfTl", "Dodopizza-eu");
        c = oj6Var2;
        d = oj6.b(oj6Var2, null, "dodoandroid-test", "zyZch184vooWf67IN56E", null, 9, null);
        oj6 oj6Var3 = new oj6("api.mindbox.ru", "Dodopizzaworld.DodopizzaworldAndroidApp", "Ky1eJHP22cgRvnKS4YAuAbruSUM9Twba", "Dodopizzaworld");
        e = oj6Var3;
        f = oj6.b(oj6Var3, null, "Dodopizzaworld.DodopizzaworldAndroidAppSandbox", "7jO5u37D79GFutwcQ6AkEXXultSWPe9Q", null, 9, null);
    }

    public static final oj6 a() {
        return d;
    }

    public static final oj6 b() {
        return b;
    }

    public static final oj6 c() {
        return f;
    }

    public static final oj6 d() {
        return c;
    }

    public static final oj6 e() {
        return a;
    }

    public static final oj6 f() {
        return e;
    }
}
