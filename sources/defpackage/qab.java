package defpackage;

import java.util.Locale;
/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: qab  reason: default package */
/* loaded from: classes.dex */
public final class qab {
    public static final pab a = new e(null, false);
    public static final pab b = new e(null, true);
    public static final pab c;
    public static final pab d;
    public static final pab e;
    public static final pab f;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: qab$a */
    /* loaded from: classes.dex */
    private static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.qab.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = qab.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a == 1) {
                        if (!this.a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i++;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: qab$b */
    /* loaded from: classes.dex */
    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // defpackage.qab.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = qab.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: qab$c */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: qab$d */
    /* loaded from: classes.dex */
    private static abstract class d implements pab {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return b();
            }
            return false;
        }

        @Override // defpackage.pab
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.a == null) {
                    return b();
                }
                return c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: qab$e */
    /* loaded from: classes.dex */
    private static class e extends d {
        private final boolean b;

        e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // defpackage.qab.d
        protected boolean b() {
            return this.b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: qab$f */
    /* loaded from: classes.dex */
    private static class f extends d {
        static final f b = new f();

        f() {
            super(null);
        }

        @Override // defpackage.qab.d
        protected boolean b() {
            if (adb.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.b, false);
        f = f.b;
    }

    static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1 && i != 2) {
            return 2;
        }
        return 0;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
