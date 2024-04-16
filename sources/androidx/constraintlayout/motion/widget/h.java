package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.motion.widget.a {
    HashMap<String, Method> A;
    private int g = -1;
    private String h = null;
    private int i;
    private String j;
    private String k;
    private int l;
    private int m;
    private View n;
    float o;
    private boolean p;
    private boolean q;
    private boolean r;
    private float s;
    private float t;
    private boolean u;
    int v;
    int w;
    int x;
    RectF y;
    RectF z;

    /* compiled from: KeyTrigger.java */
    /* loaded from: classes.dex */
    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(g29.N6, 8);
            a.append(g29.R6, 4);
            a.append(g29.S6, 1);
            a.append(g29.T6, 2);
            a.append(g29.O6, 7);
            a.append(g29.U6, 6);
            a.append(g29.W6, 5);
            a.append(g29.Q6, 9);
            a.append(g29.P6, 10);
            a.append(g29.V6, 11);
            a.append(g29.X6, 12);
            a.append(g29.Y6, 13);
            a.append(g29.Z6, 14);
        }

        public static void a(h hVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        hVar.j = typedArray.getString(index);
                        break;
                    case 2:
                        hVar.k = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                    case 4:
                        hVar.h = typedArray.getString(index);
                        break;
                    case 5:
                        hVar.o = typedArray.getFloat(index, hVar.o);
                        break;
                    case 6:
                        hVar.l = typedArray.getResourceId(index, hVar.l);
                        break;
                    case 7:
                        if (MotionLayout.Q5) {
                            int resourceId = typedArray.getResourceId(index, hVar.b);
                            hVar.b = resourceId;
                            if (resourceId == -1) {
                                hVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            hVar.c = typedArray.getString(index);
                            break;
                        } else {
                            hVar.b = typedArray.getResourceId(index, hVar.b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, hVar.a);
                        hVar.a = integer;
                        hVar.s = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        hVar.m = typedArray.getResourceId(index, hVar.m);
                        break;
                    case 10:
                        hVar.u = typedArray.getBoolean(index, hVar.u);
                        break;
                    case 11:
                        hVar.i = typedArray.getResourceId(index, hVar.i);
                        break;
                    case 12:
                        hVar.x = typedArray.getResourceId(index, hVar.x);
                        break;
                    case 13:
                        hVar.v = typedArray.getResourceId(index, hVar.v);
                        break;
                    case 14:
                        hVar.w = typedArray.getResourceId(index, hVar.w);
                        break;
                }
            }
        }
    }

    public h() {
        int i = androidx.constraintlayout.motion.widget.a.f;
        this.i = i;
        this.j = null;
        this.k = null;
        this.l = i;
        this.m = i;
        this.n = null;
        this.o = 0.1f;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = Float.NaN;
        this.u = false;
        this.v = i;
        this.w = i;
        this.x = i;
        this.y = new RectF();
        this.z = new RectF();
        this.A = new HashMap<>();
        this.d = 5;
        this.e = new HashMap<>();
    }

    private void v(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            w(str, view);
            return;
        }
        if (this.A.containsKey(str)) {
            method = this.A.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.A.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.A.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + ln2.d(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.h + "\"on class " + view.getClass().getSimpleName() + " " + ln2.d(view));
        }
    }

    private void w(String str, View view) {
        boolean z;
        if (str.length() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    private void x(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new h().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        h hVar = (h) aVar;
        this.g = hVar.g;
        this.h = hVar.h;
        this.i = hVar.i;
        this.j = hVar.j;
        this.k = hVar.k;
        this.l = hVar.l;
        this.m = hVar.m;
        this.n = hVar.n;
        this.o = hVar.o;
        this.p = hVar.p;
        this.q = hVar.q;
        this.r = hVar.r;
        this.s = hVar.s;
        this.t = hVar.t;
        this.u = hVar.u;
        this.y = hVar.y;
        this.z = hVar.z;
        this.A = hVar.A;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, g29.M6), context);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.h.u(float, android.view.View):void");
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, o0c> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
    }
}
