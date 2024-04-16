package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EmojiSupportMatch.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lvf3;", "", "", Image.TYPE_HIGH, "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", e.a, "(ILjava/lang/Object;)Z", "a", "I", "value", DateTokenConverter.CONVERTER_KEY, "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vf3  reason: default package */
/* loaded from: classes.dex */
public final class vf3 {
    public static final a b = new a(null);
    private static final int c = d(0);
    private static final int d = d(1);
    private final int a;

    /* compiled from: EmojiSupportMatch.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lvf3$a;", "", "Lvf3;", "Default", "I", "a", "()I", "None", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vf3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return vf3.c;
        }

        public final int b() {
            return vf3.d;
        }
    }

    private /* synthetic */ vf3(int i) {
        this.a = i;
    }

    public static final /* synthetic */ vf3 c(int i) {
        return new vf3(i);
    }

    public static boolean e(int i, Object obj) {
        if (!(obj instanceof vf3) || i != ((vf3) obj).i()) {
            return false;
        }
        return true;
    }

    public static final boolean f(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static String h(int i) {
        if (i == c) {
            return "EmojiSupportMatch.Default";
        }
        if (i == d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ int i() {
        return this.a;
    }

    public String toString() {
        return h(this.a);
    }

    private static int d(int i) {
        return i;
    }

    public static int g(int i) {
        return i;
    }
}
