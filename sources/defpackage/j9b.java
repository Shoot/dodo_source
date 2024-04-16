package defpackage;

import android.text.Layout;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lj9b;", "", "", "value", "Landroid/text/Layout$Alignment;", "a", "b", "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", c.a, "ALIGN_RIGHT_FRAMEWORK", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j9b  reason: default package */
/* loaded from: classes.dex */
public final class j9b {
    public static final j9b a = new j9b();
    private static final Layout.Alignment b;
    private static final Layout.Alignment c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (z65.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (z65.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        b = alignment;
        c = alignment2;
    }

    private j9b() {
    }

    public final Layout.Alignment a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return c;
                    }
                    return b;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
