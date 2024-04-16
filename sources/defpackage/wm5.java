package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: LayoutIntrinsics.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", c.a, "desiredWidth", "charSequence", "textPaint", "", e.a, "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: wm5  reason: default package */
/* loaded from: classes.dex */
public final class wm5 {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        z65.h(charSequence, "text");
        z65.h(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new iw0(charSequence, 0, charSequence.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: vm5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d;
                d = wm5.d((Pair) obj, (Pair) obj2);
                return d;
            }
        });
        int next = lineInstance.next();
        int i = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            int i2 = next;
            next = lineInstance.next();
            i = i2;
        }
        float f = 0.0f;
        for (Pair pair2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint));
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (defpackage.bra.a(r2, defpackage.yo5.class) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L24
        L6:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L1c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<zo5> r1 = defpackage.zo5.class
            boolean r1 = defpackage.bra.a(r2, r1)
            if (r1 != 0) goto L26
            java.lang.Class<yo5> r1 = defpackage.yo5.class
            boolean r1 = defpackage.bra.a(r2, r1)
            if (r1 != 0) goto L26
        L1c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wm5.e(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }
}
