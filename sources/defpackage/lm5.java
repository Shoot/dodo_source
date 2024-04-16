package defpackage;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LayoutCompat.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Llm5;", "", "Landroid/text/Layout$Alignment;", "b", "Landroid/text/Layout$Alignment;", "a", "()Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/TextDirectionHeuristic;", c.a, "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lm5  reason: default package */
/* loaded from: classes.dex */
public final class lm5 {
    public static final lm5 a = new lm5();
    private static final Layout.Alignment b = Layout.Alignment.ALIGN_NORMAL;
    private static final TextDirectionHeuristic c;

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        z65.g(textDirectionHeuristic, "FIRSTSTRONG_LTR");
        c = textDirectionHeuristic;
    }

    private lm5() {
    }

    public final Layout.Alignment a() {
        return b;
    }

    public final TextDirectionHeuristic b() {
        return c;
    }
}
