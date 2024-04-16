package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextMotion.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\n\fB\u001c\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R#\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lecb;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lecb$b;", "a", "I", "b", "()I", "linearity", "Z", c.a, "()Z", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ecb  reason: default package */
/* loaded from: classes.dex */
public final class ecb {
    public static final a c = new a(null);
    private static final ecb d;
    private static final ecb e;
    private final int a;
    private final boolean b;

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lecb$a;", "", "Lecb;", "Static", "Lecb;", "a", "()Lecb;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ecb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ecb a() {
            return ecb.d;
        }
    }

    static {
        b.a aVar = b.a;
        d = new ecb(aVar.a(), false, null);
        e = new ecb(aVar.b(), true, null);
    }

    public /* synthetic */ ecb(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecb)) {
            return false;
        }
        ecb ecbVar = (ecb) obj;
        if (b.e(this.a, ecbVar.a) && this.b == ecbVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (b.f(this.a) * 31) + a91.a(this.b);
    }

    public String toString() {
        if (z65.c(this, d)) {
            return "TextMotion.Static";
        }
        if (z65.c(this, e)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    private ecb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0014\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0088\u0001\u0005\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lecb$b;", "", "", "f", "(I)I", "value", DateTokenConverter.CONVERTER_KEY, "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ecb$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final a a = new a(null);
        private static final int b = d(1);
        private static final int c = d(2);
        private static final int d = d(3);

        /* compiled from: TextMotion.android.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lecb$b$a;", "", "Lecb$b;", "Linear", "I", "b", "()I", "FontHinting", "a", "None", c.a, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: ecb$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.c;
            }

            public final int b() {
                return b.b;
            }

            public final int c() {
                return b.d;
            }
        }

        public static final boolean e(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        private static int d(int i) {
            return i;
        }

        public static int f(int i) {
            return i;
        }
    }
}
