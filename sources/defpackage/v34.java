package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.ui.fragments.ChatFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontWeight.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lv34;", "", "other", "", "A", "", "", "equals", "hashCode", "", "toString", "a", "I", "B", "()I", "weight", "<init>", "(I)V", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v34  reason: default package */
/* loaded from: classes.dex */
public final class v34 implements Comparable<v34> {
    public static final a b = new a(null);
    private static final v34 c;
    private static final v34 d;
    private static final v34 e;
    private static final v34 f;
    private static final v34 g;
    private static final v34 h;
    private static final v34 i;
    private static final v34 j;
    private static final v34 k;
    private static final v34 l;
    private static final v34 m;
    private static final v34 n;
    private static final v34 o;
    private static final v34 p;
    private static final v34 q;
    private static final v34 r;
    private static final v34 s;
    private static final v34 t;
    private static final List<v34> u;
    private final int a;

    /* compiled from: FontWeight.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R \u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0004\u0012\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0004\u0012\u0004\b)\u0010\b\u001a\u0004\b(\u0010\u0006R \u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0004\u0012\u0004\b/\u0010\b\u001a\u0004\b.\u0010\u0006R \u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u0004\u0012\u0004\b2\u0010\b\u001a\u0004\b1\u0010\u0006¨\u00064"}, d2 = {"Lv34$a;", "", "Lv34;", "W100", "Lv34;", "g", "()Lv34;", "getW100$annotations", "()V", "W200", Image.TYPE_HIGH, "getW200$annotations", "W300", "i", "getW300$annotations", "W400", "j", "getW400$annotations", "W500", "k", "getW500$annotations", "W600", "l", "getW600$annotations", "W700", Image.TYPE_MEDIUM, "getW700$annotations", "W800", "n", "getW800$annotations", "W900", "o", "getW900$annotations", "Thin", "f", "getThin$annotations", "Light", c.a, "getLight$annotations", "Normal", e.a, "getNormal$annotations", "Medium", DateTokenConverter.CONVERTER_KEY, "getMedium$annotations", "Bold", "b", "getBold$annotations", "Black", "a", "getBlack$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v34$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v34 a() {
            return v34.t;
        }

        public final v34 b() {
            return v34.r;
        }

        public final v34 c() {
            return v34.n;
        }

        public final v34 d() {
            return v34.p;
        }

        public final v34 e() {
            return v34.o;
        }

        public final v34 f() {
            return v34.l;
        }

        public final v34 g() {
            return v34.c;
        }

        public final v34 h() {
            return v34.d;
        }

        public final v34 i() {
            return v34.e;
        }

        public final v34 j() {
            return v34.f;
        }

        public final v34 k() {
            return v34.g;
        }

        public final v34 l() {
            return v34.h;
        }

        public final v34 m() {
            return v34.i;
        }

        public final v34 n() {
            return v34.j;
        }

        public final v34 o() {
            return v34.k;
        }
    }

    static {
        v34 v34Var = new v34(100);
        c = v34Var;
        v34 v34Var2 = new v34(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
        d = v34Var2;
        v34 v34Var3 = new v34(300);
        e = v34Var3;
        v34 v34Var4 = new v34(400);
        f = v34Var4;
        v34 v34Var5 = new v34(500);
        g = v34Var5;
        v34 v34Var6 = new v34(600);
        h = v34Var6;
        v34 v34Var7 = new v34(700);
        i = v34Var7;
        v34 v34Var8 = new v34(800);
        j = v34Var8;
        v34 v34Var9 = new v34(900);
        k = v34Var9;
        l = v34Var;
        m = v34Var2;
        n = v34Var3;
        o = v34Var4;
        p = v34Var5;
        q = v34Var6;
        r = v34Var7;
        s = v34Var8;
        t = v34Var9;
        u = ic1.o(v34Var, v34Var2, v34Var3, v34Var4, v34Var5, v34Var6, v34Var7, v34Var8, v34Var9);
    }

    public v34(int i2) {
        this.a = i2;
        if (1 <= i2 && i2 < 1001) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i2).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: A */
    public int compareTo(v34 v34Var) {
        z65.h(v34Var, "other");
        return z65.j(this.a, v34Var.a);
    }

    public final int B() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v34) && this.a == ((v34) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
