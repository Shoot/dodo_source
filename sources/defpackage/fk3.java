package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorCode.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0005j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lfk3;", "", "", "a", "I", "i", "()I", "httpCode", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "f", "g", Image.TYPE_HIGH, "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: fk3  reason: default package */
/* loaded from: classes3.dex */
public final class fk3 {
    public static final a b;
    public static final fk3 c = new fk3("NO_ERROR", 0, 0);
    public static final fk3 d = new fk3("PROTOCOL_ERROR", 1, 1);
    public static final fk3 e = new fk3("INTERNAL_ERROR", 2, 2);
    public static final fk3 f = new fk3("FLOW_CONTROL_ERROR", 3, 3);
    public static final fk3 g = new fk3("SETTINGS_TIMEOUT", 4, 4);
    public static final fk3 h = new fk3("STREAM_CLOSED", 5, 5);
    public static final fk3 i = new fk3("FRAME_SIZE_ERROR", 6, 6);
    public static final fk3 j = new fk3("REFUSED_STREAM", 7, 7);
    public static final fk3 k = new fk3("CANCEL", 8, 8);
    public static final fk3 l = new fk3("COMPRESSION_ERROR", 9, 9);
    public static final fk3 m = new fk3("CONNECT_ERROR", 10, 10);
    public static final fk3 n = new fk3("ENHANCE_YOUR_CALM", 11, 11);
    public static final fk3 o = new fk3("INADEQUATE_SECURITY", 12, 12);
    public static final fk3 p = new fk3("HTTP_1_1_REQUIRED", 13, 13);
    private static final /* synthetic */ fk3[] q;
    private static final /* synthetic */ kj3 r;
    private final int a;

    /* compiled from: ErrorCode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lfk3$a;", "", "", "code", "Lfk3;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fk3$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fk3 a(int i) {
            fk3[] values;
            for (fk3 fk3Var : fk3.values()) {
                if (fk3Var.i() == i) {
                    return fk3Var;
                }
            }
            return null;
        }
    }

    static {
        fk3[] a2 = a();
        q = a2;
        r = lj3.a(a2);
        b = new a(null);
    }

    private fk3(String str, int i2, int i3) {
        this.a = i3;
    }

    private static final /* synthetic */ fk3[] a() {
        return new fk3[]{c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    }

    public static fk3 valueOf(String str) {
        return (fk3) Enum.valueOf(fk3.class, str);
    }

    public static fk3[] values() {
        return (fk3[]) q.clone();
    }

    public final int i() {
        return this.a;
    }
}
