package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationSender.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lv27;", "", "Lqd;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v27  reason: default package */
/* loaded from: classes4.dex */
public final class v27 implements qd {
    public static final a b;
    public static final v27 c = new v27("DEEPLINK", 0, "deeplink");
    public static final v27 d = new v27("SYSTEM", 1, "system");
    public static final v27 e = new v27("CLIENT_COMMUNICATIONS", 2, "clientcommunications");
    public static final v27 f = new v27("MINDBOX", 3, "mindbox");
    public static final v27 g = new v27("CHAT", 4, "chat");
    public static final v27 h = new v27("STORIES", 5, "stories");
    private static final /* synthetic */ v27[] i;
    private static final /* synthetic */ kj3 j;
    private final String a;

    /* compiled from: NotificationSender.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lv27$a;", "", "", "value", "Lv27;", "default", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: v27$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v27 a(String str, v27 v27Var) {
            v27 v27Var2;
            boolean v;
            z65.h(str, "value");
            z65.h(v27Var, "default");
            v27[] values = v27.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    v27Var2 = values[i];
                    v = l0b.v(v27Var2.getValue(), str, true);
                    if (v) {
                        break;
                    }
                    i++;
                } else {
                    v27Var2 = null;
                    break;
                }
            }
            return (v27) mh5.c(v27Var2, v27Var);
        }
    }

    static {
        v27[] a2 = a();
        i = a2;
        j = lj3.a(a2);
        b = new a(null);
    }

    private v27(String str, int i2, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ v27[] a() {
        return new v27[]{c, d, e, f, g, h};
    }

    public static v27 valueOf(String str) {
        return (v27) Enum.valueOf(v27.class, str);
    }

    public static v27[] values() {
        return (v27[]) i.clone();
    }

    @Override // defpackage.qd
    public String getValue() {
        return this.a;
    }
}
