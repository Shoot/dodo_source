package defpackage;

import android.graphics.Canvas;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005\"\u0019\u0010\n\u001a\u00060\u0004j\u0002`\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t*\n\u0010\u000b\"\u00020\u00042\u00020\u0004¨\u0006\f"}, d2 = {"Leu4;", ElementGenerator.TYPE_IMAGE, "Lqn0;", "a", "Landroid/graphics/Canvas;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", c.a, "(Lqn0;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tf */
/* loaded from: classes.dex */
public final class tf {
    private static final Canvas a = new Canvas();

    public static final qn0 a(eu4 eu4Var) {
        z65.h(eu4Var, ElementGenerator.TYPE_IMAGE);
        sf sfVar = new sf();
        sfVar.r(new Canvas(bh.b(eu4Var)));
        return sfVar;
    }

    public static final /* synthetic */ Canvas b() {
        return a;
    }

    public static final Canvas c(qn0 qn0Var) {
        z65.h(qn0Var, "<this>");
        return ((sf) qn0Var).q();
    }
}
