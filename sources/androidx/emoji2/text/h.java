package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
import androidx.emoji2.text.l;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class h {
    @NonNull
    private final e.i a;
    @NonNull
    private final l b;
    @NonNull
    private e.d c;
    private final boolean d;
    private final int[] e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {
        static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        if (z) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class b {
        private int a = 1;
        private final l.a b;
        private l.a c;
        private l.a d;
        private int e;
        private int f;
        private final boolean g;
        private final int[] h;

        b(l.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        private static boolean d(int i) {
            if (i == 65039) {
                return true;
            }
            return false;
        }

        private static boolean f(int i) {
            if (i == 65038) {
                return true;
            }
            return false;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i) {
            l.a a = this.c.a(i);
            int i2 = 2;
            if (this.a != 2) {
                if (a == null) {
                    i2 = g();
                } else {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                }
            } else if (a != null) {
                this.c = a;
                this.f++;
            } else if (f(i)) {
                i2 = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    i2 = 3;
                    if (this.f == 1) {
                        if (h()) {
                            this.d = this.c;
                            g();
                        } else {
                            i2 = g();
                        }
                    } else {
                        this.d = this.c;
                        g();
                    }
                } else {
                    i2 = g();
                }
            }
            this.e = i;
            return i2;
        }

        g b() {
            return this.c.b();
        }

        g c() {
            return this.d.b();
        }

        boolean e() {
            if (this.a == 2 && this.c.b() != null && (this.f > 1 || h())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(@NonNull l lVar, @NonNull e.i iVar, @NonNull e.d dVar, boolean z, int[] iArr) {
        this.a = iVar;
        this.b = lVar;
        this.c = dVar;
        this.d = z;
        this.e = iArr;
    }

    private void a(@NonNull Spannable spannable, g gVar, int i, int i2) {
        spannable.setSpan(this.a.a(gVar), i, i2, 33);
    }

    private static boolean b(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        uf3[] uf3VarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (uf3VarArr = (uf3[]) editable.getSpans(selectionStart, selectionEnd, uf3.class)) != null && uf3VarArr.length > 0) {
            for (uf3 uf3Var : uf3VarArr) {
                int spanStart = editable.getSpanStart(uf3Var);
                int spanEnd = editable.getSpanEnd(uf3Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            uf3[] uf3VarArr = (uf3[]) editable.getSpans(max, min, uf3.class);
            if (uf3VarArr != null && uf3VarArr.length > 0) {
                for (uf3 uf3Var : uf3VarArr) {
                    int spanStart = editable.getSpanStart(uf3Var);
                    int spanEnd = editable.getSpanEnd(uf3Var);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(@NonNull Editable editable, int i, @NonNull KeyEvent keyEvent) {
        boolean b2;
        if (i != 67) {
            if (i == 112) {
                b2 = b(editable, keyEvent, true);
            }
            return false;
        }
        b2 = b(editable, keyEvent, false);
        if (b2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean e(CharSequence charSequence, int i, int i2, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.c.a(charSequence, i, i2, gVar.h()));
        }
        if (gVar.d() == 2) {
            return true;
        }
        return false;
    }

    private static boolean f(int i, int i2) {
        if (i != -1 && i2 != -1 && i == i2) {
            return false;
        }
        return true;
    }

    private static boolean g(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:32:0x0065, B:38:0x0074, B:39:0x0080, B:43:0x009b, B:51:0x00ab, B:54:0x00b7, B:55:0x00c1, B:56:0x00cb, B:58:0x00d2, B:59:0x00d7, B:61:0x00e2, B:63:0x00e9, B:67:0x00f3, B:70:0x00ff, B:71:0x0104, B:73:0x010d, B:18:0x002f), top: B:86:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:32:0x0065, B:38:0x0074, B:39:0x0080, B:43:0x009b, B:51:0x00ab, B:54:0x00b7, B:55:0x00c1, B:56:0x00cb, B:58:0x00d2, B:59:0x00d7, B:61:0x00e2, B:63:0x00e9, B:67:0x00f3, B:70:0x00ff, B:71:0x0104, B:73:0x010d, B:18:0x002f), top: B:86:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:32:0x0065, B:38:0x0074, B:39:0x0080, B:43:0x009b, B:51:0x00ab, B:54:0x00b7, B:55:0x00c1, B:56:0x00cb, B:58:0x00d2, B:59:0x00d7, B:61:0x00e2, B:63:0x00e9, B:67:0x00f3, B:70:0x00ff, B:71:0x0104, B:73:0x010d, B:18:0x002f), top: B:86:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence h(@androidx.annotation.NonNull java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
