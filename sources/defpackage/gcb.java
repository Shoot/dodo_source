package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextOverflow.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lgcb;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "value", DateTokenConverter.CONVERTER_KEY, "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gcb  reason: default package */
/* loaded from: classes.dex */
public final class gcb {
    public static final a a = new a(null);
    private static final int b = d(1);
    private static final int c = d(2);
    private static final int d = d(3);

    /* compiled from: TextOverflow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lgcb$a;", "", "Lgcb;", "Clip", "I", "a", "()I", "getClip-gIe3tQ8$annotations", "()V", "Ellipsis", "b", "getEllipsis-gIe3tQ8$annotations", "Visible", c.a, "getVisible-gIe3tQ8$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gcb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return gcb.b;
        }

        public final int b() {
            return gcb.c;
        }

        public final int c() {
            return gcb.d;
        }
    }

    public static final boolean e(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String g(int i) {
        if (e(i, b)) {
            return "Clip";
        }
        if (e(i, c)) {
            return "Ellipsis";
        }
        if (e(i, d)) {
            return "Visible";
        }
        return "Invalid";
    }

    public static int d(int i) {
        return i;
    }

    public static int f(int i) {
        return i;
    }
}
