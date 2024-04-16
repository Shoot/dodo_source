package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/f;", "Landroidx/compose/ui/platform/a;", "Ljava/util/Locale;", "locale", "", "l", "", "index", "", "k", "i", "j", "", "text", com.huawei.hms.push.e.a, "current", "", "a", "b", "Ljava/text/BreakIterator;", com.huawei.hms.opendevice.c.a, "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class f extends androidx.compose.ui.platform.a {
    public static final a d = new a(null);
    public static final int e = 8;
    private static f f;
    private BreakIterator c;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/f$a;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/f;", "a", "instance", "Landroidx/compose/ui/platform/f;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Locale locale) {
            z65.h(locale, "locale");
            if (f.f == null) {
                f.f = new f(locale, null);
            }
            f fVar = f.f;
            z65.f(fVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return fVar;
        }
    }

    public /* synthetic */ f(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i) {
        if (i > 0 && j(i - 1) && (i == d().length() || !j(i))) {
            return true;
        }
        return false;
    }

    private final boolean j(int i) {
        if (i >= 0 && i < d().length()) {
            return Character.isLetterOrDigit(d().codePointAt(i));
        }
        return false;
    }

    private final boolean k(int i) {
        if (j(i) && (i == 0 || !j(i - 1))) {
            return true;
        }
        return false;
    }

    private final void l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        z65.g(wordInstance, "getWordInstance(locale)");
        this.c = wordInstance;
    }

    @Override // defpackage.u2
    public int[] a(int i) {
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!j(i) && !k(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                z65.z("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            z65.z("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i, following);
    }

    @Override // defpackage.u2
    public int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !j(i - 1) && !i(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                z65.z("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            z65.z("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i);
    }

    @Override // androidx.compose.ui.platform.a
    public void e(String str) {
        z65.h(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.c;
        if (breakIterator == null) {
            z65.z("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private f(Locale locale) {
        l(locale);
    }
}
