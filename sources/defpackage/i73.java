package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Dp.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\u000fø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Li73;", "", "other", "", "k", "(FF)I", "", "t", "(F)Ljava/lang/String;", Image.TYPE_SMALL, "(F)I", "", "", "p", "(FLjava/lang/Object;)Z", "", "a", "F", "getValue", "()F", "value", "o", "(F)F", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: i73  reason: default package */
/* loaded from: classes.dex */
public final class i73 implements Comparable<i73> {
    public static final a b = new a(null);
    private static final float c = o(0.0f);
    private static final float d = o(Float.POSITIVE_INFINITY);
    private static final float e = o(Float.NaN);
    private final float a;

    /* compiled from: Dp.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Li73$a;", "", "Li73;", "Hairline", "F", "a", "()F", "getHairline-D9Ej5fM$annotations", "()V", "Unspecified", "b", "getUnspecified-D9Ej5fM$annotations", "<init>", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: i73$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return i73.c;
        }

        public final float b() {
            return i73.e;
        }
    }

    private /* synthetic */ i73(float f) {
        this.a = f;
    }

    public static final /* synthetic */ i73 h(float f) {
        return new i73(f);
    }

    public static int k(float f, float f2) {
        return Float.compare(f, f2);
    }

    public static boolean p(float f, Object obj) {
        if (!(obj instanceof i73) || Float.compare(f, ((i73) obj).u()) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean q(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static int s(float f) {
        return Float.floatToIntBits(f);
    }

    public static String t(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(i73 i73Var) {
        return i(i73Var.u());
    }

    public boolean equals(Object obj) {
        return p(this.a, obj);
    }

    public int hashCode() {
        return s(this.a);
    }

    public int i(float f) {
        return k(this.a, f);
    }

    public String toString() {
        return t(this.a);
    }

    public final /* synthetic */ float u() {
        return this.a;
    }

    public static float o(float f) {
        return f;
    }
}
