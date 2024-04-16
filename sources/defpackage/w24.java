package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FontFamily.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\u0003\fB\u0011\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\t\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lw24;", "", "", "a", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "canLoadSynchronously", "<init>", "(Z)V", "b", "Lys3;", "Lvr5;", "Lg4b;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: w24  reason: default package */
/* loaded from: classes.dex */
public abstract class w24 {
    public static final a b = new a(null);
    private static final g4b c = new up2();
    private static final jd4 d = new jd4("sans-serif", "FontFamily.SansSerif");
    private static final jd4 e = new jd4("serif", "FontFamily.Serif");
    private static final jd4 f = new jd4("monospace", "FontFamily.Monospace");
    private static final jd4 g = new jd4("cursive", "FontFamily.Cursive");
    private final boolean a;

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lw24$a;", "", "Lg4b;", "Default", "Lg4b;", "b", "()Lg4b;", "Ljd4;", "SansSerif", "Ljd4;", DateTokenConverter.CONVERTER_KEY, "()Ljd4;", "Serif", e.a, "Monospace", c.a, "Cursive", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: w24$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jd4 a() {
            return w24.g;
        }

        public final g4b b() {
            return w24.c;
        }

        public final jd4 c() {
            return w24.f;
        }

        public final jd4 d() {
            return w24.d;
        }

        public final jd4 e() {
            return w24.e;
        }
    }

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lw24$b;", "", "Lw24;", "fontFamily", "Lv34;", "fontWeight", "Lq34;", "fontStyle", "Lr34;", "fontSynthesis", "Lcua;", "a", "(Lw24;Lv34;II)Lcua;", "Lz24;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: w24$b */
    /* loaded from: classes.dex */
    public interface b {
        cua<Object> a(w24 w24Var, v34 v34Var, int i, int i2);
    }

    public /* synthetic */ w24(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private w24(boolean z) {
        this.a = z;
    }
}
