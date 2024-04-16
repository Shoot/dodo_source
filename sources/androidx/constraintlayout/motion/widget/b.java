package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyAttributes.java */
/* loaded from: classes.dex */
public class b extends androidx.constraintlayout.motion.widget.a {
    private String g;
    private int h = -1;
    private boolean i = false;
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
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;

    /* compiled from: KeyAttributes.java */
    /* loaded from: classes.dex */
    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(g29.o5, 1);
            a.append(g29.z5, 2);
            a.append(g29.v5, 4);
            a.append(g29.w5, 5);
            a.append(g29.x5, 6);
            a.append(g29.p5, 19);
            a.append(g29.q5, 20);
            a.append(g29.t5, 7);
            a.append(g29.F5, 8);
            a.append(g29.E5, 9);
            a.append(g29.D5, 10);
            a.append(g29.B5, 12);
            a.append(g29.A5, 13);
            a.append(g29.u5, 14);
            a.append(g29.r5, 15);
            a.append(g29.s5, 16);
            a.append(g29.y5, 17);
            a.append(g29.C5, 18);
        }

        public static void a(b bVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        bVar.j = typedArray.getFloat(index, bVar.j);
                        break;
                    case 2:
                        bVar.k = typedArray.getDimension(index, bVar.k);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                    case 4:
                        bVar.l = typedArray.getFloat(index, bVar.l);
                        break;
                    case 5:
                        bVar.m = typedArray.getFloat(index, bVar.m);
                        break;
                    case 6:
                        bVar.n = typedArray.getFloat(index, bVar.n);
                        break;
                    case 7:
                        bVar.r = typedArray.getFloat(index, bVar.r);
                        break;
                    case 8:
                        bVar.q = typedArray.getFloat(index, bVar.q);
                        break;
                    case 9:
                        bVar.g = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.Q5) {
                            int resourceId = typedArray.getResourceId(index, bVar.b);
                            bVar.b = resourceId;
                            if (resourceId == -1) {
                                bVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            bVar.c = typedArray.getString(index);
                            break;
                        } else {
                            bVar.b = typedArray.getResourceId(index, bVar.b);
                            break;
                        }
                    case 12:
                        bVar.a = typedArray.getInt(index, bVar.a);
                        break;
                    case 13:
                        bVar.h = typedArray.getInteger(index, bVar.h);
                        break;
                    case 14:
                        bVar.s = typedArray.getFloat(index, bVar.s);
                        break;
                    case 15:
                        bVar.t = typedArray.getDimension(index, bVar.t);
                        break;
                    case 16:
                        bVar.u = typedArray.getDimension(index, bVar.u);
                        break;
                    case 17:
                        bVar.v = typedArray.getDimension(index, bVar.v);
                        break;
                    case 18:
                        bVar.w = typedArray.getFloat(index, bVar.w);
                        break;
                    case 19:
                        bVar.o = typedArray.getDimension(index, bVar.o);
                        break;
                    case 20:
                        bVar.p = typedArray.getDimension(index, bVar.p);
                        break;
                }
            }
        }
    }

    public b() {
        this.d = 1;
        this.e = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // androidx.constraintlayout.motion.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.HashMap<java.lang.String, defpackage.o0c> r7) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.a(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new b().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        b bVar = (b) aVar;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
        this.w = bVar.w;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.w)) {
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
        a.a(this, context.obtainStyledAttributes(attributeSet, g29.n5));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void g(HashMap<String, Integer> hashMap) {
        if (this.h == -1) {
            return;
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("alpha", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("elevation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("rotation", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("rotationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("rotationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.t)) {
            hashMap.put("translationX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.u)) {
            hashMap.put("translationY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.v)) {
            hashMap.put("translationZ", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("scaleX", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put("scaleY", Integer.valueOf(this.h));
        }
        if (!Float.isNaN(this.w)) {
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
