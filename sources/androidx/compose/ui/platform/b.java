package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/b;", "Landroidx/compose/ui/platform/a;", "Ljava/util/Locale;", "locale", "", "i", "", "text", com.huawei.hms.push.e.a, "", "current", "", "a", "b", "Ljava/text/BreakIterator;", com.huawei.hms.opendevice.c.a, "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class b extends androidx.compose.ui.platform.a {
    public static final a d = new a(null);
    public static final int e = 8;
    private static b f;
    private BreakIterator c;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/b$a;", "", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/b;", "a", "instance", "Landroidx/compose/ui/platform/b;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Locale locale) {
            z65.h(locale, "locale");
            if (b.f == null) {
                b.f = new b(locale, null);
            }
            b bVar = b.f;
            z65.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return bVar;
        }
    }

    public /* synthetic */ b(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        z65.g(characterInstance, "getCharacterInstance(locale)");
        this.c = characterInstance;
    }

    @Override // defpackage.u2
    public int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                z65.z("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    z65.z("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } else {
                BreakIterator breakIterator3 = this.c;
                if (breakIterator3 == null) {
                    z65.z("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i);
                if (following == -1) {
                    return null;
                }
                return c(i, following);
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                z65.z("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    z65.z("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } else {
                BreakIterator breakIterator3 = this.c;
                if (breakIterator3 == null) {
                    z65.z("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i);
            }
        } while (i != -1);
        return null;
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

    private b(Locale locale) {
        i(locale);
    }
}
