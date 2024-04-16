package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapAddressStateVOImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bc\b\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b#\u0010\u0006j\u0002\b'j\u0002\b\u001bj\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b\u0011j\u0002\b+j\u0002\b\u0018j\u0002\b,j\u0002\b\u0005¨\u0006-"}, d2 = {"Lf9;", "", "", "a", "Z", Image.TYPE_SMALL, "()Z", "errorIconIsVisible", "", "b", "I", "x", "()I", "warningTextRes", "Lye0;", c.a, "Lye0;", "o", "()Lye0;", "bottomSheetAddressFieldsState", DateTokenConverter.CONVERTER_KEY, "E", "isDesignProgress", e.a, "q", "canChangeCoordinates", "f", "k", "addressMainFieldIsEnabled", "g", "i", "addressMainFieldHasErrorBackground", Image.TYPE_HIGH, "u", "myLocationButtonIsVisible", "w", "showAddressCatcher", "<init>", "(Ljava/lang/String;IZILye0;ZZZZZZ)V", "j", "l", Image.TYPE_MEDIUM, "n", "p", "r", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f9  reason: default package */
/* loaded from: classes2.dex */
public final class f9 {
    public static final f9 j;
    public static final f9 k;
    public static final f9 l;
    public static final f9 m;
    public static final f9 n;
    public static final f9 o;
    public static final f9 p;
    public static final f9 q;
    public static final f9 r;
    public static final f9 s;
    private static final /* synthetic */ f9[] t;
    private static final /* synthetic */ kj3 u;
    private final boolean a;
    private final int b;
    private final ye0 c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    static {
        ye0 ye0Var = ye0.b;
        j = new f9("INITIAL", 0, false, 0, ye0Var, true, false, false, false, false, false, 323, null);
        k = new f9("PIN_IS_MOVING", 1, false, 0, null, false, false, false, false, false, false, 479, null);
        l = new f9("LOADING", 2, false, 0, null, false, false, false, false, false, false, 479, null);
        m = new f9("IDLE", 3, false, 0, null, false, false, false, false, false, false, 511, null);
        n = new f9("REQUIRED_FIELDS_IS_EMPTY", 4, false, o09.map_address_required_fields_error, null, false, false, false, false, false, false, 509, null);
        o = new f9("ERROR", 5, true, o09.map_address_determinating_error, null, false, false, false, true, false, false, 444, null);
        p = new f9("ERROR_UNDELIVERABLE_ADDRESS", 6, false, o09.n, null, false, false, false, true, false, true, 189, null);
        q = new f9("ERROR_DESIGN_ADDRESS_FIELDS", 7, true, 0, ye0Var, false, false, false, false, false, false, 330, null);
        r = new f9("CONFIRM_LOADING", 8, false, 0, null, false, false, false, false, false, false, 463, null);
        s = new f9("FINAL_DELETE", 9, false, 0, null, false, false, false, false, false, false, 463, null);
        f9[] a = a();
        t = a;
        u = lj3.a(a);
    }

    private f9(String str, int i, boolean z, int i2, ye0 ye0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = i2;
        this.c = ye0Var;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    private static final /* synthetic */ f9[] a() {
        return new f9[]{j, k, l, m, n, o, p, q, r, s};
    }

    public static f9 valueOf(String str) {
        return (f9) Enum.valueOf(f9.class, str);
    }

    public static f9[] values() {
        return (f9[]) t.clone();
    }

    public final boolean E() {
        return this.d;
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean k() {
        return this.f;
    }

    public final ye0 o() {
        return this.c;
    }

    public final boolean q() {
        return this.e;
    }

    public final boolean s() {
        return this.a;
    }

    public final boolean u() {
        return this.h;
    }

    public final boolean w() {
        return this.i;
    }

    public final int x() {
        return this.b;
    }

    /* synthetic */ f9(String str, int i, boolean z, int i2, ye0 ye0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? o09.map_address_error_mes : i2, (i3 & 4) != 0 ? ye0.a : ye0Var, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0 ? false : z5, (i3 & 128) != 0 ? true : z6, (i3 & 256) != 0 ? false : z7);
    }
}
