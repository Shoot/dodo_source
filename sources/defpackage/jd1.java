package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ColorSpace.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 .2\u00020\u0001:\u0001\u0019B$\b\u0000\u0012\u0006\u0010'\u001a\u00020\u001e\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u00100\u001a\u00020\u0002ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0000H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020\u0002H\u0016R\u0017\u0010'\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R \u0010+\u001a\u00020(8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b\b\u0010*R\u001a\u00100\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010/R\u0014\u00104\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Ljd1;", "", "", "component", "", "f", e.a, "r", "g", "b", "", "k", "v", "l", "v0", "v1", "v2", "", "j", "(FFF)J", Image.TYPE_MEDIUM, "(FFF)F", "x", "y", "z", "a", "colorSpace", "Luc1;", "n", "(FFFFLjd1;)J", "", "toString", "other", "", "equals", "hashCode", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lad1;", "J", "()J", "model", c.a, "I", DateTokenConverter.CONVERTER_KEY, "()I", "id", "componentCount", "i", "()Z", "isSrgb", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jd1  reason: default package */
/* loaded from: classes.dex */
public abstract class jd1 {
    public static final a d = new a(null);
    private final String a;
    private final long b;
    private final int c;

    /* compiled from: ColorSpace.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ljd1$a;", "", "", "MaxId", "I", "MinId", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jd1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ jd1(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public final float[] a(float f, float f2, float f3) {
        float[] fArr = new float[ad1.f(this.b)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return b(fArr);
    }

    public abstract float[] b(float[] fArr);

    public final int c() {
        return ad1.f(this.b);
    }

    public final int d() {
        return this.c;
    }

    public abstract float e(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jd1 jd1Var = (jd1) obj;
        if (this.c != jd1Var.c || !z65.c(this.a, jd1Var.a)) {
            return false;
        }
        return ad1.e(this.b, jd1Var.b);
    }

    public abstract float f(int i);

    public final long g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ad1.g(this.b)) * 31) + this.c;
    }

    public boolean i() {
        return false;
    }

    public long j(float f, float f2, float f3) {
        float[] k = k(f, f2, f3);
        return (Float.floatToIntBits(k[0]) << 32) | (Float.floatToIntBits(k[1]) & 4294967295L);
    }

    public final float[] k(float f, float f2, float f3) {
        return l(new float[]{f, f2, f3});
    }

    public abstract float[] l(float[] fArr);

    public float m(float f, float f2, float f3) {
        return k(f, f2, f3)[2];
    }

    public long n(float f, float f2, float f3, float f4, jd1 jd1Var) {
        z65.h(jd1Var, "colorSpace");
        float[] a2 = a(f, f2, f3);
        return yc1.a(a2[0], a2[1], a2[2], f4, jd1Var);
    }

    public String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) ad1.h(this.b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private jd1(String str, long j, int i) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
