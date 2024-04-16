package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import defpackage.i4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: AccessibilityNodeInfoCompat.java */
/* renamed from: d4  reason: default package */
/* loaded from: classes.dex */
public class d4 {
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: d4$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        @NonNull
        public static final a G;
        @NonNull
        public static final a H;
        @NonNull
        public static final a I;
        @NonNull
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        @NonNull
        public static final a P;
        @NonNull
        public static final a Q;
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);
        public static final a k = new a(64, null);
        public static final a l = new a(128, null);
        public static final a m = new a(256, (CharSequence) null, i4.b.class);
        public static final a n = new a(512, (CharSequence) null, i4.b.class);
        public static final a o = new a(1024, (CharSequence) null, i4.c.class);
        public static final a p = new a(2048, (CharSequence) null, i4.c.class);
        public static final a q = new a(4096, null);
        public static final a r = new a(8192, null);
        public static final a s = new a(16384, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, i4.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(1048576, null);
        public static final a z = new a(2097152, (CharSequence) null, i4.h.class);
        final Object a;
        private final int b;
        private final Class<? extends i4.a> c;
        protected final i4 d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33 = null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction32;
            } else {
                accessibilityAction = null;
            }
            A = new a(accessibilityAction, 16908342, null, null, null);
            if (i2 >= 23) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction31;
            } else {
                accessibilityAction2 = null;
            }
            B = new a(accessibilityAction2, 16908343, null, null, i4.e.class);
            if (i2 >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction30;
            } else {
                accessibilityAction3 = null;
            }
            C = new a(accessibilityAction3, 16908344, null, null, null);
            if (i2 >= 23) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction29;
            } else {
                accessibilityAction4 = null;
            }
            D = new a(accessibilityAction4, 16908345, null, null, null);
            if (i2 >= 23) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction28;
            } else {
                accessibilityAction5 = null;
            }
            E = new a(accessibilityAction5, 16908346, null, null, null);
            if (i2 >= 23) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction27;
            } else {
                accessibilityAction6 = null;
            }
            F = new a(accessibilityAction6, 16908347, null, null, null);
            if (i2 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction26;
            } else {
                accessibilityAction7 = null;
            }
            G = new a(accessibilityAction7, 16908358, null, null, null);
            if (i2 >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction25;
            } else {
                accessibilityAction8 = null;
            }
            H = new a(accessibilityAction8, 16908359, null, null, null);
            if (i2 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction24;
            } else {
                accessibilityAction9 = null;
            }
            I = new a(accessibilityAction9, 16908360, null, null, null);
            if (i2 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction23;
            } else {
                accessibilityAction10 = null;
            }
            J = new a(accessibilityAction10, 16908361, null, null, null);
            if (i2 >= 23) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction22;
            } else {
                accessibilityAction11 = null;
            }
            K = new a(accessibilityAction11, 16908348, null, null, null);
            if (i2 >= 24) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction21;
            } else {
                accessibilityAction12 = null;
            }
            L = new a(accessibilityAction12, 16908349, null, null, i4.f.class);
            if (i2 >= 26) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction20;
            } else {
                accessibilityAction13 = null;
            }
            M = new a(accessibilityAction13, 16908354, null, null, i4.d.class);
            if (i2 >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction19;
            } else {
                accessibilityAction14 = null;
            }
            N = new a(accessibilityAction14, 16908356, null, null, null);
            if (i2 >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction18;
            } else {
                accessibilityAction15 = null;
            }
            O = new a(accessibilityAction15, 16908357, null, null, null);
            if (i2 >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction17;
            } else {
                accessibilityAction16 = null;
            }
            P = new a(accessibilityAction16, 16908362, null, null, null);
            if (i2 >= 30) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            Q = new a(accessibilityAction33, 16908372, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, i4 i4Var) {
            return new a(null, this.b, charSequence, i4Var, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            String name;
            i4.a newInstance;
            if (this.d == null) {
                return false;
            }
            Class<? extends i4.a> cls = this.c;
            i4.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = newInstance;
                    Class<? extends i4.a> cls2 = this.c;
                    if (cls2 == null) {
                        name = "null";
                    } else {
                        name = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    return this.d.a(view, aVar);
                }
            }
            return this.d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                if (aVar.a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i2, CharSequence charSequence, i4 i4Var) {
            this(null, i2, charSequence, i4Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends i4.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, i4 i4Var, Class<? extends i4.a> cls) {
            this.b = i2;
            this.d = i4Var;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: d4$b */
    /* loaded from: classes.dex */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b c(int i, int i2, boolean z) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static b d(int i, int i2, boolean z, int i3) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.a).getRowCount();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: d4$c */
    /* loaded from: classes.dex */
    public static class c {
        final Object a;

        c(Object obj) {
            this.a = obj;
        }

        public static c f(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowSpan();
        }

        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isSelected();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: d4$d */
    /* loaded from: classes.dex */
    public static class d {
        final Object a;

        d(Object obj) {
            this.a = obj;
        }

        public static d a(int i, float f, float f2, float f3) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    @Deprecated
    public d4(Object obj) {
        this.a = (AccessibilityNodeInfo) obj;
    }

    private SparseArray<WeakReference<ClickableSpan>> A(View view) {
        return (SparseArray) view.getTag(qy8.W);
    }

    private boolean D() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int E(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static d4 Z() {
        return d1(AccessibilityNodeInfo.obtain());
    }

    public static d4 a0(d4 d4Var) {
        return d1(AccessibilityNodeInfo.obtain(d4Var.a));
    }

    public static d4 b0(View view) {
        return d1(AccessibilityNodeInfo.obtain(view));
    }

    public static d4 d1(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d4(accessibilityNodeInfo);
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void f0(View view) {
        SparseArray<WeakReference<ClickableSpan>> A = A(view);
        if (A != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < A.size(); i++) {
                if (A.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                A.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void g() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private void h0(int i, boolean z) {
        Bundle v = v();
        if (v != null) {
            int i2 = v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            v.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private static String j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean l(int i) {
        Bundle v = v();
        if (v == null || (v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> x(View view) {
        SparseArray<WeakReference<ClickableSpan>> A = A(view);
        if (A == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(qy8.W, sparseArray);
            return sparseArray;
        }
        return A;
    }

    public void A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence B() {
        if (D()) {
            List<Integer> h = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int i = 0; i < h.size(); i++) {
                spannableString.setSpan(new r2(h4.get(i).intValue(), this, v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public void B0(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setImportantForAccessibility(z);
        }
    }

    public String C() {
        return this.a.getViewIdResourceName();
    }

    public void C0(View view) {
        this.a.setLabelFor(view);
    }

    public void D0(int i) {
        this.a.setLiveRegion(i);
    }

    public void E0(boolean z) {
        this.a.setLongClickable(z);
    }

    public boolean F() {
        return this.a.isAccessibilityFocused();
    }

    public void F0(int i) {
        this.a.setMaxTextLength(i);
    }

    public boolean G() {
        return this.a.isCheckable();
    }

    public void G0(int i) {
        this.a.setMovementGranularities(i);
    }

    public boolean H() {
        return this.a.isChecked();
    }

    public void H0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public boolean I() {
        return this.a.isClickable();
    }

    public void I0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setPaneTitle(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean J() {
        return this.a.isContentInvalid();
    }

    public void J0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public boolean K() {
        boolean isContextClickable;
        if (Build.VERSION.SDK_INT >= 23) {
            isContextClickable = this.a.isContextClickable();
            return isContextClickable;
        }
        return false;
    }

    public void K0(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public boolean L() {
        return this.a.isDismissable();
    }

    public void L0(boolean z) {
        this.a.setPassword(z);
    }

    public boolean M() {
        return this.a.isEditable();
    }

    public void M0(d dVar) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.a);
    }

    public boolean N() {
        return this.a.isEnabled();
    }

    public void N0(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean O() {
        return this.a.isFocusable();
    }

    public void O0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            h0(1, z);
        }
    }

    public boolean P() {
        return this.a.isFocused();
    }

    public void P0(boolean z) {
        this.a.setScrollable(z);
    }

    public boolean Q() {
        boolean isImportantForAccessibility;
        if (Build.VERSION.SDK_INT >= 24) {
            isImportantForAccessibility = this.a.isImportantForAccessibility();
            return isImportantForAccessibility;
        }
        return true;
    }

    public void Q0(boolean z) {
        this.a.setSelected(z);
    }

    public boolean R() {
        return this.a.isLongClickable();
    }

    public void R0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            h0(4, z);
        }
    }

    public boolean S() {
        return this.a.isMultiLine();
    }

    public void S0(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public boolean T() {
        return this.a.isPassword();
    }

    public void T0(CharSequence charSequence) {
        if (gh0.b()) {
            this.a.setStateDescription(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean U() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT >= 28) {
            isScreenReaderFocusable = this.a.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }
        return l(1);
    }

    public void U0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean V() {
        return this.a.isScrollable();
    }

    public void V0(int i, int i2) {
        this.a.setTextSelection(i, i2);
    }

    public boolean W() {
        return this.a.isSelected();
    }

    public void W0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view);
        }
    }

    public boolean X() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.a.isShowingHintText();
            return isShowingHintText;
        }
        return l(4);
    }

    public void X0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view, i);
        }
    }

    public boolean Y() {
        return this.a.isVisibleToUser();
    }

    public void Y0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalBefore(view);
        }
    }

    public void Z0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalBefore(view, i);
        }
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a1(String str) {
        this.a.setViewIdResourceName(str);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void b1(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public boolean c0(int i, Bundle bundle) {
        return this.a.performAction(i, bundle);
    }

    public AccessibilityNodeInfo c1() {
        return this.a;
    }

    public void d(View view, int i) {
        this.a.addChild(view, i);
    }

    public void d0() {
        this.a.recycle();
    }

    public boolean e0(a aVar) {
        return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (d4Var.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(d4Var.a)) {
            return false;
        }
        if (this.c == d4Var.c && this.b == d4Var.b) {
            return true;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            f0(view);
            ClickableSpan[] q = q(charSequence);
            if (q != null && q.length > 0) {
                v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", qy8.a);
                SparseArray<WeakReference<ClickableSpan>> x = x(view);
                for (int i = 0; i < q.length; i++) {
                    int E = E(q[i], x);
                    x.put(E, new WeakReference<>(q[i]));
                    e(q[i], (Spanned) charSequence, E);
                }
            }
        }
    }

    public void g0(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Deprecated
    public void i0(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void j0(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public int k() {
        return this.a.getActions();
    }

    public void k0(boolean z) {
        this.a.setCanOpenPopup(z);
    }

    public void l0(boolean z) {
        this.a.setCheckable(z);
    }

    @Deprecated
    public void m(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void m0(boolean z) {
        this.a.setChecked(z);
    }

    public void n(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void n0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public int o() {
        return this.a.getChildCount();
    }

    public void o0(boolean z) {
        this.a.setClickable(z);
    }

    public CharSequence p() {
        return this.a.getClassName();
    }

    public void p0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void q0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public b r() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.a.getCollectionInfo();
        if (collectionInfo != null) {
            return new b(collectionInfo);
        }
        return null;
    }

    public void r0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public c s() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new c(collectionItemInfo);
        }
        return null;
    }

    public void s0(boolean z) {
        this.a.setContentInvalid(z);
    }

    public CharSequence t() {
        return this.a.getContentDescription();
    }

    public void t0(boolean z) {
        this.a.setDismissable(z);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(y());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(B());
        sb.append("; contentDescription: ");
        sb.append(t());
        sb.append("; viewId: ");
        sb.append(C());
        sb.append("; checkable: ");
        sb.append(G());
        sb.append("; checked: ");
        sb.append(H());
        sb.append("; focusable: ");
        sb.append(O());
        sb.append("; focused: ");
        sb.append(P());
        sb.append("; selected: ");
        sb.append(W());
        sb.append("; clickable: ");
        sb.append(I());
        sb.append("; longClickable: ");
        sb.append(R());
        sb.append("; enabled: ");
        sb.append(N());
        sb.append("; password: ");
        sb.append(T());
        sb.append("; scrollable: " + V());
        sb.append("; [");
        List<a> i = i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            a aVar = i.get(i2);
            String j = j(aVar.b());
            if (j.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j = aVar.c().toString();
            }
            sb.append(j);
            if (i2 != i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int u() {
        int drawingOrder;
        if (Build.VERSION.SDK_INT >= 24) {
            drawingOrder = this.a.getDrawingOrder();
            return drawingOrder;
        }
        return 0;
    }

    public void u0(boolean z) {
        this.a.setEditable(z);
    }

    public Bundle v() {
        return this.a.getExtras();
    }

    public void v0(boolean z) {
        this.a.setEnabled(z);
    }

    public int w() {
        return this.a.getMovementGranularities();
    }

    public void w0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public void x0(boolean z) {
        this.a.setFocusable(z);
    }

    public CharSequence y() {
        return this.a.getPackageName();
    }

    public void y0(boolean z) {
        this.a.setFocused(z);
    }

    public CharSequence z() {
        return this.a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public void z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            h0(2, z);
        }
    }

    private d4(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }
}
