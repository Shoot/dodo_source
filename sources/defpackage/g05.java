package defpackage;

import android.graphics.Paint;
import android.text.Layout;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: IndentationFixSpan.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\b"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "a", c.a, "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: g05  reason: default package */
/* loaded from: classes.dex */
public final class g05 {

    /* compiled from: IndentationFixSpan.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g05$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float a(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        z65.h(layout, "<this>");
        z65.h(paint, "paint");
        float lineLeft = layout.getLineLeft(i);
        if (!acb.l(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && a.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            z65.g(paint, "this.paint");
        }
        return a(layout, i, paint);
    }

    public static final float c(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        z65.h(layout, "<this>");
        z65.h(paint, "paint");
        if (acb.l(layout, i) && layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
            float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
            if (paragraphAlignment != null && a.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] == 1) {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = (layout.getWidth() - lineRight) / 2.0f;
            } else {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = layout.getWidth() - lineRight;
            }
            return width - width2;
        }
        return 0.0f;
    }

    public static /* synthetic */ float d(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            z65.g(paint, "this.paint");
        }
        return c(layout, i, paint);
    }
}
