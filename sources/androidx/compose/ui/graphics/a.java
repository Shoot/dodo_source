package androidx.compose.ui.graphics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/a;", "", "", "g", "(I)Ljava/lang/String;", "", "f", "(I)I", "value", DateTokenConverter.CONVERTER_KEY, "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class a {
    public static final C0019a a = new C0019a(null);
    private static final int b = d(0);
    private static final int c = d(1);
    private static final int d = d(2);

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/a$a;", "", "Landroidx/compose/ui/graphics/a;", "Auto", "I", "a", "()I", "Offscreen", com.huawei.hms.opendevice.c.a, "ModulateAlpha", "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0019a {
        private C0019a() {
        }

        public /* synthetic */ C0019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.b;
        }

        public final int b() {
            return a.d;
        }

        public final int c() {
            return a.c;
        }
    }

    public static final boolean e(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String g(int i) {
        return "CompositingStrategy(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public static int d(int i) {
        return i;
    }

    public static int f(int i) {
        return i;
    }
}
