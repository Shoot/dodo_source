package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PathNode.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0003\u0007\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, d2 = {"Lzr7;", "", "", "a", "Z", "()Z", "isCurve", "b", "isQuad", "<init>", "(ZZ)V", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "q", "r", Image.TYPE_SMALL, "Lzr7$a;", "Lzr7$b;", "Lzr7$c;", "Lzr7$d;", "Lzr7$e;", "Lzr7$f;", "Lzr7$g;", "Lzr7$h;", "Lzr7$i;", "Lzr7$j;", "Lzr7$k;", "Lzr7$l;", "Lzr7$m;", "Lzr7$n;", "Lzr7$o;", "Lzr7$p;", "Lzr7$q;", "Lzr7$r;", "Lzr7$s;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zr7  reason: default package */
/* loaded from: classes.dex */
public abstract class zr7 {
    private final boolean a;
    private final boolean b;

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, d2 = {"Lzr7$a;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", com.huawei.hms.push.e.a, "()F", "horizontalEllipseRadius", DateTokenConverter.CONVERTER_KEY, "g", "verticalEllipseRadius", "f", "theta", "Z", Image.TYPE_HIGH, "()Z", "isMoreThanHalf", "i", "isPositiveArc", "arcStartX", "arcStartY", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$a */
    /* loaded from: classes.dex */
    public static final class a extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final boolean f;
        private final boolean g;
        private final float h;
        private final float i;

        public a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final float c() {
            return this.h;
        }

        public final float d() {
            return this.i;
        }

        public final float e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0 && this.f == aVar.f && this.g == aVar.g && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31;
            boolean z = this.f;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (floatToIntBits + i2) * 31;
            boolean z2 = this.g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i);
        }

        public final boolean i() {
            return this.g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartX=" + this.h + ", arcStartY=" + this.i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzr7$b;", "Lzr7;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$b */
    /* loaded from: classes.dex */
    public static final class b extends zr7 {
        public static final b c = new b();

        private b() {
            super(false, false, 3, null);
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lzr7$c;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x1", DateTokenConverter.CONVERTER_KEY, "f", "y1", com.huawei.hms.push.e.a, "x2", "g", "y2", "x3", Image.TYPE_HIGH, "y3", "<init>", "(FFFFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$c */
    /* loaded from: classes.dex */
    public static final class c extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;

        public c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0 && Float.compare(this.g, cVar.g) == 0 && Float.compare(this.h, cVar.h) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ", x3=" + this.g + ", y3=" + this.h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lzr7$d;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$d */
    /* loaded from: classes.dex */
    public static final class d extends zr7 {
        private final float c;

        public d(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Float.compare(this.c, ((d) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lzr7$e;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$e */
    /* loaded from: classes.dex */
    public static final class e extends zr7 {
        private final float c;
        private final float d;

        public e(float f, float f2) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (Float.compare(this.c, eVar.c) == 0 && Float.compare(this.d, eVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "LineTo(x=" + this.c + ", y=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lzr7$f;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$f */
    /* loaded from: classes.dex */
    public static final class f extends zr7 {
        private final float c;
        private final float d;

        public f(float f, float f2) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (Float.compare(this.c, fVar.c) == 0 && Float.compare(this.d, fVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "MoveTo(x=" + this.c + ", y=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lzr7$g;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x1", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "y1", "x2", "f", "y2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$g */
    /* loaded from: classes.dex */
    public static final class g extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public g(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (Float.compare(this.c, gVar.c) == 0 && Float.compare(this.d, gVar.d) == 0 && Float.compare(this.e, gVar.e) == 0 && Float.compare(this.f, gVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lzr7$h;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x1", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "y1", "x2", "f", "y2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$h */
    /* loaded from: classes.dex */
    public static final class h extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public h(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Float.compare(this.c, hVar.c) == 0 && Float.compare(this.d, hVar.d) == 0 && Float.compare(this.e, hVar.e) == 0 && Float.compare(this.f, hVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lzr7$i;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$i */
    /* loaded from: classes.dex */
    public static final class i extends zr7 {
        private final float c;
        private final float d;

        public i(float f, float f2) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Float.compare(this.c, iVar.c) == 0 && Float.compare(this.d, iVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.c + ", y=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001f"}, d2 = {"Lzr7$j;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", com.huawei.hms.push.e.a, "()F", "horizontalEllipseRadius", DateTokenConverter.CONVERTER_KEY, "g", "verticalEllipseRadius", "f", "theta", "Z", Image.TYPE_HIGH, "()Z", "isMoreThanHalf", "i", "isPositiveArc", "arcStartDx", "arcStartDy", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$j */
    /* loaded from: classes.dex */
    public static final class j extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final boolean f;
        private final boolean g;
        private final float h;
        private final float i;

        public j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final float c() {
            return this.h;
        }

        public final float d() {
            return this.i;
        }

        public final float e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Float.compare(this.c, jVar.c) == 0 && Float.compare(this.d, jVar.d) == 0 && Float.compare(this.e, jVar.e) == 0 && this.f == jVar.f && this.g == jVar.g && Float.compare(this.h, jVar.h) == 0 && Float.compare(this.i, jVar.i) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31;
            boolean z = this.f;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (floatToIntBits + i2) * 31;
            boolean z2 = this.g;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return ((((i3 + i) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i);
        }

        public final boolean i() {
            return this.g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartDx=" + this.h + ", arcStartDy=" + this.i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lzr7$k;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx1", DateTokenConverter.CONVERTER_KEY, "f", "dy1", com.huawei.hms.push.e.a, "dx2", "g", "dy2", "dx3", Image.TYPE_HIGH, "dy3", "<init>", "(FFFFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$k */
    /* loaded from: classes.dex */
    public static final class k extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;

        public k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (Float.compare(this.c, kVar.c) == 0 && Float.compare(this.d, kVar.d) == 0 && Float.compare(this.e, kVar.e) == 0 && Float.compare(this.f, kVar.f) == 0 && Float.compare(this.g, kVar.g) == 0 && Float.compare(this.h, kVar.h) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ", dx3=" + this.g + ", dy3=" + this.h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lzr7$l;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$l */
    /* loaded from: classes.dex */
    public static final class l extends zr7 {
        private final float c;

        public l(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && Float.compare(this.c, ((l) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lzr7$m;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx", DateTokenConverter.CONVERTER_KEY, "dy", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$m */
    /* loaded from: classes.dex */
    public static final class m extends zr7 {
        private final float c;
        private final float d;

        public m(float f, float f2) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (Float.compare(this.c, mVar.c) == 0 && Float.compare(this.d, mVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lzr7$n;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx", DateTokenConverter.CONVERTER_KEY, "dy", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$n */
    /* loaded from: classes.dex */
    public static final class n extends zr7 {
        private final float c;
        private final float d;

        public n(float f, float f2) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (Float.compare(this.c, nVar.c) == 0 && Float.compare(this.d, nVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lzr7$o;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx1", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "dy1", "dx2", "f", "dy2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$o */
    /* loaded from: classes.dex */
    public static final class o extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public o(float f, float f2, float f3, float f4) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (Float.compare(this.c, oVar.c) == 0 && Float.compare(this.d, oVar.d) == 0 && Float.compare(this.e, oVar.e) == 0 && Float.compare(this.f, oVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lzr7$p;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx1", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "dy1", "dx2", "f", "dy2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$p */
    /* loaded from: classes.dex */
    public static final class p extends zr7 {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public p(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (Float.compare(this.c, pVar.c) == 0 && Float.compare(this.d, pVar.d) == 0 && Float.compare(this.e, pVar.e) == 0 && Float.compare(this.f, pVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lzr7$q;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dx", DateTokenConverter.CONVERTER_KEY, "dy", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$q */
    /* loaded from: classes.dex */
    public static final class q extends zr7 {
        private final float c;
        private final float d;

        public q(float f, float f2) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.c, qVar.c) == 0 && Float.compare(this.d, qVar.d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lzr7$r;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "dy", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$r */
    /* loaded from: classes.dex */
    public static final class r extends zr7 {
        private final float c;

        public r(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof r) && Float.compare(this.c, ((r) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: PathNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lzr7$s;", "Lzr7;", "", "toString", "", "hashCode", "", "other", "", "equals", "", com.huawei.hms.opendevice.c.a, "F", "()F", "y", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zr7$s */
    /* loaded from: classes.dex */
    public static final class s extends zr7 {
        private final float c;

        public s(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && Float.compare(this.c, ((s) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public /* synthetic */ zr7(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    private zr7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ zr7(boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, null);
    }
}
