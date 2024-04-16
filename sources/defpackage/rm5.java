package defpackage;

import android.text.Layout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LayoutHelper.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lrm5;", "", "", "offset", "", "primary", "", "b", "lineEnd", Image.TYPE_HIGH, "paragraphIndex", "Ljava/text/Bidi;", "a", "upstream", DateTokenConverter.CONVERTER_KEY, e.a, "g", "usePrimaryDirection", c.a, "", "f", "Landroid/text/Layout;", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "layout", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "<init>", "(Landroid/text/Layout;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rm5  reason: default package */
/* loaded from: classes.dex */
public final class rm5 {
    private final Layout a;
    private final List<Integer> b;
    private final List<Bidi> c;
    private final boolean[] d;
    private char[] e;
    private final int f;

    /* compiled from: LayoutHelper.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lrm5$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "start", "end", c.a, "Z", "()Z", "isRtl", "<init>", "(IIZ)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rm5$a */
    /* loaded from: classes.dex */
    private static final class a {
        private final int a;
        private final int b;
        private final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            boolean z = this.c;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public rm5(Layout layout) {
        int Y;
        int i;
        z65.h(layout, "layout");
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.a.getText();
            z65.g(text, "layout.text");
            Y = m0b.Y(text, '\n', i2, false, 4, null);
            if (Y < 0) {
                i = this.a.getText().length();
            } else {
                i = Y + 1;
            }
            i2 = i;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.f = this.b.size();
    }

    private final float b(int i, boolean z) {
        if (z) {
            return this.a.getPrimaryHorizontal(i);
        }
        return this.a.getSecondaryHorizontal(i);
    }

    private final int h(int i) {
        while (i > 0 && f(this.a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r0.getRunCount() == 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = 0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.g(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List<java.text.Bidi> r3 = r11.c
            r3.set(r12, r0)
            boolean[] r3 = r11.d
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.e
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm5.a(int):java.text.Bidi");
    }

    public final float c(int i, boolean z, boolean z2) {
        Bidi bidi;
        int F;
        int F2;
        boolean z3;
        int i2 = i;
        if (!z2) {
            return b(i, z);
        }
        int a2 = mm5.a(this.a, i2, z2);
        int lineStart = this.a.getLineStart(a2);
        int lineEnd = this.a.getLineEnd(a2);
        if (i2 != lineStart && i2 != lineEnd) {
            return b(i, z);
        }
        if (i2 != 0 && i2 != this.a.getText().length()) {
            int d = d(i2, z2);
            boolean g = g(d);
            int h = h(lineEnd);
            int e = e(d);
            int i3 = lineStart - e;
            int i4 = h - e;
            Bidi a3 = a(d);
            if (a3 != null) {
                bidi = a3.createLineBidi(i3, i4);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                a[] aVarArr = new a[runCount];
                for (int i5 = 0; i5 < runCount; i5++) {
                    int runStart = bidi.getRunStart(i5) + lineStart;
                    int runLimit = bidi.getRunLimit(i5) + lineStart;
                    if (bidi.getRunLevel(i5) % 2 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVarArr[i5] = new a(runStart, runLimit, z3);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i6 = 0; i6 < runCount2; i6++) {
                    bArr[i6] = (byte) bidi.getRunLevel(i6);
                }
                Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
                int i7 = -1;
                if (i2 == lineStart) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= runCount) {
                            break;
                        } else if (aVarArr[i8].b() == i2) {
                            i7 = i8;
                            break;
                        } else {
                            i8++;
                        }
                    }
                    a aVar = aVarArr[i7];
                    if (z || g == aVar.c()) {
                        if (!g) {
                            g = true;
                        } else {
                            g = false;
                        }
                    }
                    if (i7 != 0 || !g) {
                        F2 = yr.F(aVarArr);
                        if (i7 == F2 && !g) {
                            return this.a.getLineRight(a2);
                        }
                        if (g) {
                            return this.a.getPrimaryHorizontal(aVarArr[i7 - 1].b());
                        }
                        return this.a.getPrimaryHorizontal(aVarArr[i7 + 1].b());
                    }
                    return this.a.getLineLeft(a2);
                }
                if (i2 > h) {
                    i2 = h(i);
                }
                int i9 = 0;
                while (true) {
                    if (i9 >= runCount) {
                        break;
                    } else if (aVarArr[i9].a() == i2) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
                a aVar2 = aVarArr[i7];
                if (!z && g != aVar2.c()) {
                    g = !g;
                }
                if (i7 != 0 || !g) {
                    F = yr.F(aVarArr);
                    if (i7 == F && !g) {
                        return this.a.getLineRight(a2);
                    }
                    if (g) {
                        return this.a.getPrimaryHorizontal(aVarArr[i7 - 1].a());
                    }
                    return this.a.getPrimaryHorizontal(aVarArr[i7 + 1].a());
                }
                return this.a.getLineLeft(a2);
            }
            boolean isRtlCharAt = this.a.isRtlCharAt(lineStart);
            if (z || g == isRtlCharAt) {
                if (!g) {
                    g = true;
                } else {
                    g = false;
                }
            }
            if (i2 != lineStart ? !g : g) {
                return this.a.getLineLeft(a2);
            }
            return this.a.getLineRight(a2);
        }
        return b(i, z);
    }

    public final int d(int i, boolean z) {
        int k;
        int i2;
        k = kc1.k(this.b, Integer.valueOf(i), 0, 0, 6, null);
        if (k < 0) {
            i2 = -(k + 1);
        } else {
            i2 = k + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.b.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int e(int i) {
        if (i == 0) {
            return 0;
        }
        return this.b.get(i - 1).intValue();
    }

    public final boolean f(char c) {
        if (c != ' ' && c != '\n' && c != 5760 && ((8192 > c || c >= 8203 || c == 8199) && c != 8287 && c != 12288)) {
            return false;
        }
        return true;
    }

    public final boolean g(int i) {
        if (this.a.getParagraphDirection(this.a.getLineForOffset(e(i))) == -1) {
            return true;
        }
        return false;
    }
}
