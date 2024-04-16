package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BR5\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR5\u0010\u0018\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00140\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR/\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR/\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u001d\u0010\u000bR;\u0010!\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b \u0010\u000bR/\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b#\u0010\u000bR/\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b&\u0010\u000bR)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b)\u0010\u000bR)\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b\b\u0010\u000bR)\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\t\u001a\u0004\b\u0011\u0010\u000bR)\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b/\u0010\u000bR)\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b\u001a\u0010\u000bR)\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b3\u0010\u000bR)\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0016\u0010\u000bR)\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b2\u0010\u000bR#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070\u00028\u0006¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u000e\u0010\u000bR)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b-\u0010\u000bR)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b(\u0010\u000bR)\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b%\u0010\u000bR)\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\t\u001a\u0004\b+\u0010\u000b¨\u0006C"}, d2 = {"Lsaa;", "", "Liba;", "Lq2;", "Lkotlin/Function1;", "", "Lbcb;", "", "b", "Liba;", "g", "()Liba;", "GetTextLayoutResult", "Lkotlin/Function0;", c.a, Image.TYPE_HIGH, "OnClick", DateTokenConverter.CONVERTER_KEY, "i", "OnLongClick", "Lkotlin/Function2;", "", e.a, "q", "ScrollBy", "", "f", "getScrollToIndex", "ScrollToIndex", "r", "SetProgress", "Lkotlin/Function3;", Image.TYPE_SMALL, "SetSelection", "Lml;", "t", "SetText", "j", "getInsertTextAtCursor", "InsertTextAtCursor", "k", "o", "PerformImeAction", "l", "CopyText", Image.TYPE_MEDIUM, "CutText", "n", "PasteText", "Expand", "p", "a", "Collapse", "Dismiss", "RequestFocus", "", "Lt32;", "CustomActions", "PageUp", "u", "PageLeft", "v", "PageDown", "w", "PageRight", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: saa  reason: default package */
/* loaded from: classes.dex */
public final class saa {
    public static final saa a = new saa();
    private static final iba<q2<Function1<List<bcb>, Boolean>>> b;
    private static final iba<q2<Function0<Boolean>>> c;
    private static final iba<q2<Function0<Boolean>>> d;
    private static final iba<q2<Function2<Float, Float, Boolean>>> e;
    private static final iba<q2<Function1<Integer, Boolean>>> f;
    private static final iba<q2<Function1<Float, Boolean>>> g;
    private static final iba<q2<y84<Integer, Integer, Boolean, Boolean>>> h;
    private static final iba<q2<Function1<ml, Boolean>>> i;
    private static final iba<q2<Function1<ml, Boolean>>> j;
    private static final iba<q2<Function0<Boolean>>> k;
    private static final iba<q2<Function0<Boolean>>> l;
    private static final iba<q2<Function0<Boolean>>> m;
    private static final iba<q2<Function0<Boolean>>> n;
    private static final iba<q2<Function0<Boolean>>> o;
    private static final iba<q2<Function0<Boolean>>> p;
    private static final iba<q2<Function0<Boolean>>> q;
    private static final iba<q2<Function0<Boolean>>> r;
    private static final iba<List<t32>> s;
    private static final iba<q2<Function0<Boolean>>> t;
    private static final iba<q2<Function0<Boolean>>> u;
    private static final iba<q2<Function0<Boolean>>> v;
    private static final iba<q2<Function0<Boolean>>> w;

    static {
        gba gbaVar = gba.a;
        b = new iba<>("GetTextLayoutResult", gbaVar);
        c = new iba<>("OnClick", gbaVar);
        d = new iba<>("OnLongClick", gbaVar);
        e = new iba<>("ScrollBy", gbaVar);
        f = new iba<>("ScrollToIndex", gbaVar);
        g = new iba<>("SetProgress", gbaVar);
        h = new iba<>("SetSelection", gbaVar);
        i = new iba<>("SetText", gbaVar);
        j = new iba<>("InsertTextAtCursor", gbaVar);
        k = new iba<>("PerformImeAction", gbaVar);
        l = new iba<>("CopyText", gbaVar);
        m = new iba<>("CutText", gbaVar);
        n = new iba<>("PasteText", gbaVar);
        o = new iba<>("Expand", gbaVar);
        p = new iba<>("Collapse", gbaVar);
        q = new iba<>("Dismiss", gbaVar);
        r = new iba<>("RequestFocus", gbaVar);
        s = new iba<>("CustomActions", null, 2, null);
        t = new iba<>("PageUp", gbaVar);
        u = new iba<>("PageLeft", gbaVar);
        v = new iba<>("PageDown", gbaVar);
        w = new iba<>("PageRight", gbaVar);
    }

    private saa() {
    }

    public final iba<q2<Function0<Boolean>>> a() {
        return p;
    }

    public final iba<q2<Function0<Boolean>>> b() {
        return l;
    }

    public final iba<List<t32>> c() {
        return s;
    }

    public final iba<q2<Function0<Boolean>>> d() {
        return m;
    }

    public final iba<q2<Function0<Boolean>>> e() {
        return q;
    }

    public final iba<q2<Function0<Boolean>>> f() {
        return o;
    }

    public final iba<q2<Function1<List<bcb>, Boolean>>> g() {
        return b;
    }

    public final iba<q2<Function0<Boolean>>> h() {
        return c;
    }

    public final iba<q2<Function0<Boolean>>> i() {
        return d;
    }

    public final iba<q2<Function0<Boolean>>> j() {
        return v;
    }

    public final iba<q2<Function0<Boolean>>> k() {
        return u;
    }

    public final iba<q2<Function0<Boolean>>> l() {
        return w;
    }

    public final iba<q2<Function0<Boolean>>> m() {
        return t;
    }

    public final iba<q2<Function0<Boolean>>> n() {
        return n;
    }

    public final iba<q2<Function0<Boolean>>> o() {
        return k;
    }

    public final iba<q2<Function0<Boolean>>> p() {
        return r;
    }

    public final iba<q2<Function2<Float, Float, Boolean>>> q() {
        return e;
    }

    public final iba<q2<Function1<Float, Boolean>>> r() {
        return g;
    }

    public final iba<q2<y84<Integer, Integer, Boolean, Boolean>>> s() {
        return h;
    }

    public final iba<q2<Function1<ml, Boolean>>> t() {
        return i;
    }
}
