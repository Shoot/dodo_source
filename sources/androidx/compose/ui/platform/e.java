package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/e;", "Landroidx/compose/ui/platform/a;", "", "index", "", "j", "i", "current", "", "a", "b", "<init>", "()V", com.huawei.hms.opendevice.c.a, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class e extends androidx.compose.ui.platform.a {
    public static final a c = new a(null);
    private static e d;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/e$a;", "", "Landroidx/compose/ui/platform/e;", "a", "instance", "Landroidx/compose/ui/platform/e;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            if (e.d == null) {
                e.d = new e(null);
            }
            e eVar = e.d;
            z65.f(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return eVar;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int i) {
        if (i > 0 && d().charAt(i - 1) != '\n' && (i == d().length() || d().charAt(i) == '\n')) {
            return true;
        }
        return false;
    }

    private final boolean j(int i) {
        if (d().charAt(i) != '\n' && (i == 0 || d().charAt(i - 1) == '\n')) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        return null;
     */
    @Override // defpackage.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r5 < r0) goto Lf
            return r1
        Lf:
            if (r5 >= 0) goto L12
            r5 = 0
        L12:
            if (r5 >= r0) goto L29
            java.lang.String r2 = r4.d()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L29
            boolean r2 = r4.j(r5)
            if (r2 != 0) goto L29
            int r5 = r5 + 1
            goto L12
        L29:
            if (r5 < r0) goto L2c
            return r1
        L2c:
            int r1 = r5 + 1
        L2e:
            if (r1 >= r0) goto L39
            boolean r2 = r4.i(r1)
            if (r2 != 0) goto L39
            int r1 = r1 + 1
            goto L2e
        L39:
            int[] r5 = r4.c(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.e.a(int):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        return null;
     */
    @Override // defpackage.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] b(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r4 > 0) goto Lf
            return r1
        Lf:
            if (r4 <= r0) goto L12
            r4 = r0
        L12:
            if (r4 <= 0) goto L2b
            java.lang.String r0 = r3.d()
            int r2 = r4 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 != r2) goto L2b
            boolean r0 = r3.i(r4)
            if (r0 != 0) goto L2b
            int r4 = r4 + (-1)
            goto L12
        L2b:
            if (r4 > 0) goto L2e
            return r1
        L2e:
            int r0 = r4 + (-1)
        L30:
            if (r0 <= 0) goto L3b
            boolean r1 = r3.j(r0)
            if (r1 != 0) goto L3b
            int r0 = r0 + (-1)
            goto L30
        L3b:
            int[] r4 = r3.c(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.e.b(int):int[]");
    }

    private e() {
    }
}
