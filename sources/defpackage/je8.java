package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u000f\u001a\u00060\u0005j\u0002`\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00060\u0005j\u0002`\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00060\u0005j\u0002`\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lje8;", "", "", e.a, "(I)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(I)I", "other", "", c.a, "(ILjava/lang/Object;)Z", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "a", "I", "packedValue", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: je8  reason: default package */
/* loaded from: classes.dex */
public final class je8 {
    private final int a;

    private /* synthetic */ je8(int i) {
        this.a = i;
    }

    public static final /* synthetic */ je8 a(int i) {
        return new je8(i);
    }

    public static boolean c(int i, Object obj) {
        if (!(obj instanceof je8) || i != ((je8) obj).f()) {
            return false;
        }
        return true;
    }

    public static String e(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ int f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }

    public static int b(int i) {
        return i;
    }

    public static int d(int i) {
        return i;
    }
}
