package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: AndroidVectorResources.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bK\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010RR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010!\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\n\u0010\fR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010%\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010'\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b\u0017\u0010\fR\u001a\u0010(\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010*\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b\u001d\u0010\fR\u001a\u0010,\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010.\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u00100\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u00102\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b&\u0010\fR\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b)\u0010\u0006R\u001a\u00106\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b+\u0010\fR\u001a\u00108\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b-\u0010\fR\u001a\u0010:\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b/\u0010\fR\u001a\u0010<\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b1\u0010\fR\u001a\u0010>\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b3\u0010\fR\u001a\u0010@\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b5\u0010\fR\u001a\u0010B\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\b7\u0010\fR\u001a\u0010D\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\b9\u0010\fR\u001a\u0010F\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\b;\u0010\fR\u001a\u0010G\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b=\u0010\fR\u001a\u0010H\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b?\u0010\fR\u001a\u0010I\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\bC\u0010\fR\u001a\u0010J\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\bE\u0010\fR\u001a\u0010K\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\bA\u0010\fR\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010N\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010P\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006S"}, d2 = {"Lhj;", "", "", "b", "[I", "F", "()[I", "STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY", "", c.a, "I", "getSTYLEABLE_VECTOR_DRAWABLE_ALPHA", "()I", "STYLEABLE_VECTOR_DRAWABLE_ALPHA", DateTokenConverter.CONVERTER_KEY, "a", "STYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED", e.a, "n", "STYLEABLE_VECTOR_DRAWABLE_HEIGHT", "f", "D", "STYLEABLE_VECTOR_DRAWABLE_TINT", "g", "E", "STYLEABLE_VECTOR_DRAWABLE_TINT_MODE", Image.TYPE_HIGH, "G", "STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT", "i", "H", "STYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH", "j", "STYLEABLE_VECTOR_DRAWABLE_WIDTH", "k", "STYLEABLE_VECTOR_DRAWABLE_GROUP", "l", "STYLEABLE_VECTOR_DRAWABLE_GROUP_NAME", Image.TYPE_MEDIUM, "STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X", "STYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y", "o", "STYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION", "p", "STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X", "q", "STYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y", "r", "STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X", Image.TYPE_SMALL, "STYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y", "t", "STYLEABLE_VECTOR_DRAWABLE_PATH", "u", "STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA", "v", "STYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR", "w", "STYLEABLE_VECTOR_DRAWABLE_PATH_NAME", "x", "STYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA", "y", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA", "z", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR", "A", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP", "B", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN", "C", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT", "STYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START", "STYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH", "J", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME", "K", "STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hj  reason: default package */
/* loaded from: classes.dex */
public final class hj {
    private static final int J = 0;
    private static final int l = 0;
    private static final int w = 0;
    public static final hj a = new hj();
    private static final int[] b = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    private static final int c = 4;
    private static final int d = 5;
    private static final int e = 2;
    private static final int f = 1;
    private static final int g = 6;
    private static final int h = 8;
    private static final int i = 7;
    private static final int j = 3;
    private static final int[] k = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 5;
    private static final int p = 3;
    private static final int q = 4;
    private static final int r = 6;
    private static final int s = 7;
    private static final int[] t = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    private static final int u = 12;
    private static final int v = 1;
    private static final int x = 2;
    private static final int y = 11;
    private static final int z = 3;
    private static final int A = 8;
    private static final int B = 9;
    private static final int C = 10;
    private static final int D = 4;
    private static final int E = 6;
    private static final int F = 7;
    private static final int G = 5;
    private static final int H = 13;
    private static final int[] I = {16842755, 16843781};
    private static final int K = 1;

    private hj() {
    }

    public final int A() {
        return H;
    }

    public final int B() {
        return F;
    }

    public final int C() {
        return G;
    }

    public final int D() {
        return f;
    }

    public final int E() {
        return g;
    }

    public final int[] F() {
        return b;
    }

    public final int G() {
        return h;
    }

    public final int H() {
        return i;
    }

    public final int I() {
        return j;
    }

    public final int a() {
        return d;
    }

    public final int[] b() {
        return I;
    }

    public final int c() {
        return J;
    }

    public final int d() {
        return K;
    }

    public final int[] e() {
        return k;
    }

    public final int f() {
        return l;
    }

    public final int g() {
        return m;
    }

    public final int h() {
        return n;
    }

    public final int i() {
        return o;
    }

    public final int j() {
        return p;
    }

    public final int k() {
        return q;
    }

    public final int l() {
        return r;
    }

    public final int m() {
        return s;
    }

    public final int n() {
        return e;
    }

    public final int[] o() {
        return t;
    }

    public final int p() {
        return u;
    }

    public final int q() {
        return v;
    }

    public final int r() {
        return w;
    }

    public final int s() {
        return x;
    }

    public final int t() {
        return y;
    }

    public final int u() {
        return z;
    }

    public final int v() {
        return A;
    }

    public final int w() {
        return B;
    }

    public final int x() {
        return C;
    }

    public final int y() {
        return D;
    }

    public final int z() {
        return E;
    }
}
