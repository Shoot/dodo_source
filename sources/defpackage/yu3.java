package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FilterQuality.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lyu3;", "", "", "f", "(I)Ljava/lang/String;", "", e.a, "(I)I", "value", c.a, "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yu3  reason: default package */
/* loaded from: classes.dex */
public final class yu3 {
    public static final a a = new a(null);
    private static final int b = c(0);
    private static final int c = c(1);
    private static final int d = c(2);
    private static final int e = c(3);

    /* compiled from: FilterQuality.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lyu3$a;", "", "Lyu3;", "None", "I", "b", "()I", "Low", "a", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: yu3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return yu3.c;
        }

        public final int b() {
            return yu3.b;
        }
    }

    public static final boolean d(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String f(int i) {
        if (d(i, b)) {
            return "None";
        }
        if (d(i, c)) {
            return "Low";
        }
        if (d(i, d)) {
            return "Medium";
        }
        if (d(i, e)) {
            return "High";
        }
        return "Unknown";
    }

    public static int c(int i) {
        return i;
    }

    public static int e(int i) {
        return i;
    }
}
