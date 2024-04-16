package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontSynthesis.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lr34;", "", "", "i", "(I)Ljava/lang/String;", "", "f", "(I)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/Object;)Z", "a", "I", "value", Image.TYPE_HIGH, "(I)Z", "isWeightOn", "g", "isStyleOn", c.a, "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: r34  reason: default package */
/* loaded from: classes.dex */
public final class r34 {
    public static final a b = new a(null);
    private static final int c = c(0);
    private static final int d = c(1);
    private static final int e = c(2);
    private static final int f = c(3);
    private final int a;

    /* compiled from: FontSynthesis.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lr34$a;", "", "Lr34;", "All", "I", "a", "()I", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: r34$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r34.d;
        }
    }

    private /* synthetic */ r34(int i) {
        this.a = i;
    }

    public static final /* synthetic */ r34 b(int i) {
        return new r34(i);
    }

    public static boolean d(int i, Object obj) {
        if (!(obj instanceof r34) || i != ((r34) obj).j()) {
            return false;
        }
        return true;
    }

    public static final boolean e(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    public static final boolean g(int i) {
        if (!e(i, d) && !e(i, f)) {
            return false;
        }
        return true;
    }

    public static final boolean h(int i) {
        if (!e(i, d) && !e(i, e)) {
            return false;
        }
        return true;
    }

    public static String i(int i) {
        if (e(i, c)) {
            return "None";
        }
        if (e(i, d)) {
            return "All";
        }
        if (e(i, e)) {
            return "Weight";
        }
        if (e(i, f)) {
            return "Style";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return f(this.a);
    }

    public final /* synthetic */ int j() {
        return this.a;
    }

    public String toString() {
        return i(this.a);
    }

    public static int c(int i) {
        return i;
    }

    public static int f(int i) {
        return i;
    }
}
