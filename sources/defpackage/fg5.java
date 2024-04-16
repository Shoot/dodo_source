package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: KeyboardType.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0014\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0088\u0001\b\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lfg5;", "", "", Image.TYPE_MEDIUM, "(I)Ljava/lang/String;", "", "l", "(I)I", "value", "j", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fg5  reason: default package */
/* loaded from: classes.dex */
public final class fg5 {
    public static final a a = new a(null);
    private static final int b = j(1);
    private static final int c = j(2);
    private static final int d = j(3);
    private static final int e = j(4);
    private static final int f = j(5);
    private static final int g = j(6);
    private static final int h = j(7);
    private static final int i = j(8);
    private static final int j = j(9);

    /* compiled from: KeyboardType.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R)\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R)\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R)\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R)\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R)\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R)\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lfg5$a;", "", "Lfg5;", "Text", "I", Image.TYPE_HIGH, "()I", "getText-PjHm6EE$annotations", "()V", "Ascii", "a", "getAscii-PjHm6EE$annotations", "Number", DateTokenConverter.CONVERTER_KEY, "getNumber-PjHm6EE$annotations", "Phone", "g", "getPhone-PjHm6EE$annotations", "Uri", "i", "getUri-PjHm6EE$annotations", "Email", c.a, "getEmail-PjHm6EE$annotations", "Password", "f", "getPassword-PjHm6EE$annotations", "NumberPassword", e.a, "getNumberPassword-PjHm6EE$annotations", "Decimal", "b", "getDecimal-PjHm6EE$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fg5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return fg5.c;
        }

        public final int b() {
            return fg5.j;
        }

        public final int c() {
            return fg5.g;
        }

        public final int d() {
            return fg5.d;
        }

        public final int e() {
            return fg5.i;
        }

        public final int f() {
            return fg5.h;
        }

        public final int g() {
            return fg5.e;
        }

        public final int h() {
            return fg5.b;
        }

        public final int i() {
            return fg5.f;
        }
    }

    public static final boolean k(int i2, int i3) {
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public static String m(int i2) {
        if (k(i2, b)) {
            return "Text";
        }
        if (k(i2, c)) {
            return "Ascii";
        }
        if (k(i2, d)) {
            return "Number";
        }
        if (k(i2, e)) {
            return "Phone";
        }
        if (k(i2, f)) {
            return "Uri";
        }
        if (k(i2, g)) {
            return "Email";
        }
        if (k(i2, h)) {
            return "Password";
        }
        if (k(i2, i)) {
            return "NumberPassword";
        }
        if (k(i2, j)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public static int j(int i2) {
        return i2;
    }

    public static int l(int i2) {
        return i2;
    }
}
