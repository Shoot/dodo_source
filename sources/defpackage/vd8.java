package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lvd8;", "", "", "f", "(J)Ljava/lang/String;", "", e.a, "(J)I", "other", "", c.a, "(JLjava/lang/Object;)Z", "", "a", "J", "getValue", "()J", "value", "b", "(J)J", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vd8  reason: default package */
/* loaded from: classes.dex */
public final class vd8 {
    private final long a;

    private /* synthetic */ vd8(long j) {
        this.a = j;
    }

    public static final /* synthetic */ vd8 a(long j) {
        return new vd8(j);
    }

    public static boolean c(long j, Object obj) {
        if (!(obj instanceof vd8) || j != ((vd8) obj).g()) {
            return false;
        }
        return true;
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static int e(long j) {
        return ax1.a(j);
    }

    public static String f(long j) {
        return "PointerId(value=" + j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ long g() {
        return this.a;
    }

    public int hashCode() {
        return e(this.a);
    }

    public String toString() {
        return f(this.a);
    }

    public static long b(long j) {
        return j;
    }
}
