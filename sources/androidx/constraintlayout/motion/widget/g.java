package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public class g extends androidx.constraintlayout.motion.widget.a {
    private String g;
    private int h = -1;
    private float i = Float.NaN;
    private float j = Float.NaN;
    private float k = Float.NaN;
    private float l = Float.NaN;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private int u = 0;
    private String v = null;
    private float w = Float.NaN;
    private float x = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    /* loaded from: classes.dex */
    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(g29.t6, 1);
            a.append(g29.C6, 2);
            a.append(g29.y6, 4);
            a.append(g29.z6, 5);
            a.append(g29.A6, 6);
            a.append(g29.w6, 7);
            a.append(g29.I6, 8);
            a.append(g29.H6, 9);
            a.append(g29.G6, 10);
            a.append(g29.E6, 12);
            a.append(g29.D6, 13);
            a.append(g29.x6, 14);
            a.append(g29.u6, 15);
            a.append(g29.v6, 16);
            a.append(g29.B6, 17);
            a.append(g29.F6, 18);
            a.append(g29.K6, 20);
            a.append(g29.J6, 21);
            a.append(g29.L6, 19);
        }

        public static void a(g gVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        gVar.i = typedArray.getFloat(index, gVar.i);
                        break;
                    case 2:
                        gVar.j = typedArray.getDimension(index, gVar.j);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                    case 4:
                        gVar.k = typedArray.getFloat(index, gVar.k);
                        break;
                    case 5:
                        gVar.l = typedArray.getFloat(index, gVar.l);
                        break;
                    case 6:
                        gVar.m = typedArray.getFloat(index, gVar.m);
                        break;
                    case 7:
                        gVar.o = typedArray.getFloat(index, gVar.o);
                        break;
                    case 8:
                        gVar.n = typedArray.getFloat(index, gVar.n);
                        break;
                    case 9:
                        gVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.Q5) {
                            int resourceId = typedArray.getResourceId(index, gVar.b);
                            gVar.b = resourceId;
                            if (resourceId == -1) {
                                gVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            gVar.c = typedArray.getString(index);
                            break;
                        } else {
                            gVar.b = typedArray.getResourceId(index, gVar.b);
                            break;
                        }
                    case 12:
                        gVar.a = typedArray.getInt(index, gVar.a);
                        break;
                    case 13:
                        gVar.h = typedArray.getInteger(index, gVar.h);
                        break;
                    case 14:
                        gVar.p = typedArray.getFloat(index, gVar.p);
                        break;
                    case 15:
                        gVar.q = typedArray.getDimension(index, gVar.q);
                        break;
                    case 16:
                        gVar.r = typedArray.getDimension(index, gVar.r);
                        break;
                    case 17:
                        gVar.s = typedArray.getDimension(index, gVar.s);
                        break;
                    case 18:
                        gVar.t = typedArray.getFloat(index, gVar.t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            gVar.v = typedArray.getString(index);
                            gVar.u = 7;
                            break;
                        } else {
                            gVar.u = typedArray.getInt(index, gVar.u);
                            break;
                        }
                    case 20:
                        gVar.w = typedArray.getFloat(index, gVar.w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            gVar.x = typedArray.getDimension(index, gVar.x);
                            break;
                        } else {
                            gVar.x = typedArray.getFloat(index, gVar.x);
                            break;
                        }
                }
            }
        }
    }

    public g() {
        this.d = 3;
        this.e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q(java.util.HashMap<java.lang.String, defpackage.s0c> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.g.Q(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, o0c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new g().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        g gVar = (g) aVar;
        this.g = gVar.g;
        this.h = gVar.h;
        this.u = gVar.u;
        this.w = gVar.w;
        this.x = gVar.x;
        this.t = gVar.t;
        this.i = gVar.i;
        this.j = gVar.j;
        this.k = gVar.k;
        this.n = gVar.n;
        this.l = gVar.l;
        this.m = gVar.m;
        this.o = gVar.o;
        this.p = gVar.p;
        this.q = gVar.q;
        this.r = gVar.r;
        this.s = gVar.s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("progress");
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, g29.s6));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void g(HashMap<String, Integer> hashMap) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("elevation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            hashMap.put("progress", Integer.valueOf(this.h));
        }
        if (this.e.size() > 0) {
            Iterator<String> it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.h));
            }
        }
    }
}
