package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: KeyCycle.java */
/* loaded from: classes.dex */
public class c extends androidx.constraintlayout.motion.widget.a {
    private String g = null;
    private int h = 0;
    private int i = -1;
    private String j = null;
    private float k = Float.NaN;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = Float.NaN;
    private int o = -1;
    private float p = Float.NaN;
    private float q = Float.NaN;
    private float r = Float.NaN;
    private float s = Float.NaN;
    private float t = Float.NaN;
    private float u = Float.NaN;
    private float v = Float.NaN;
    private float w = Float.NaN;
    private float x = Float.NaN;
    private float y = Float.NaN;
    private float z = Float.NaN;

    /* compiled from: KeyCycle.java */
    /* loaded from: classes.dex */
    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(g29.U5, 1);
            a.append(g29.S5, 2);
            a.append(g29.V5, 3);
            a.append(g29.R5, 4);
            a.append(g29.a6, 5);
            a.append(g29.Y5, 6);
            a.append(g29.X5, 7);
            a.append(g29.b6, 8);
            a.append(g29.H5, 9);
            a.append(g29.Q5, 10);
            a.append(g29.M5, 11);
            a.append(g29.N5, 12);
            a.append(g29.O5, 13);
            a.append(g29.W5, 14);
            a.append(g29.K5, 15);
            a.append(g29.L5, 16);
            a.append(g29.I5, 17);
            a.append(g29.J5, 18);
            a.append(g29.P5, 19);
            a.append(g29.T5, 20);
            a.append(g29.Z5, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(c cVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (MotionLayout.Q5) {
                            int resourceId = typedArray.getResourceId(index, cVar.b);
                            cVar.b = resourceId;
                            if (resourceId == -1) {
                                cVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            cVar.c = typedArray.getString(index);
                            break;
                        } else {
                            cVar.b = typedArray.getResourceId(index, cVar.b);
                            break;
                        }
                    case 2:
                        cVar.a = typedArray.getInt(index, cVar.a);
                        break;
                    case 3:
                        cVar.g = typedArray.getString(index);
                        break;
                    case 4:
                        cVar.h = typedArray.getInteger(index, cVar.h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            cVar.j = typedArray.getString(index);
                            cVar.i = 7;
                            break;
                        } else {
                            cVar.i = typedArray.getInt(index, cVar.i);
                            break;
                        }
                    case 6:
                        cVar.k = typedArray.getFloat(index, cVar.k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            cVar.l = typedArray.getDimension(index, cVar.l);
                            break;
                        } else {
                            cVar.l = typedArray.getFloat(index, cVar.l);
                            break;
                        }
                    case 8:
                        cVar.o = typedArray.getInt(index, cVar.o);
                        break;
                    case 9:
                        cVar.p = typedArray.getFloat(index, cVar.p);
                        break;
                    case 10:
                        cVar.q = typedArray.getDimension(index, cVar.q);
                        break;
                    case 11:
                        cVar.r = typedArray.getFloat(index, cVar.r);
                        break;
                    case 12:
                        cVar.t = typedArray.getFloat(index, cVar.t);
                        break;
                    case 13:
                        cVar.u = typedArray.getFloat(index, cVar.u);
                        break;
                    case 14:
                        cVar.s = typedArray.getFloat(index, cVar.s);
                        break;
                    case 15:
                        cVar.v = typedArray.getFloat(index, cVar.v);
                        break;
                    case 16:
                        cVar.w = typedArray.getFloat(index, cVar.w);
                        break;
                    case 17:
                        cVar.x = typedArray.getDimension(index, cVar.x);
                        break;
                    case 18:
                        cVar.y = typedArray.getDimension(index, cVar.y);
                        break;
                    case 19:
                        cVar.z = typedArray.getDimension(index, cVar.z);
                        break;
                    case 20:
                        cVar.n = typedArray.getFloat(index, cVar.n);
                        break;
                    case 21:
                        cVar.m = typedArray.getFloat(index, cVar.m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                }
            }
        }
    }

    public c() {
        this.d = 4;
        this.e = new HashMap<>();
    }

    public void U(HashMap<String, wzb> hashMap) {
        wzb wzbVar;
        wzb wzbVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.e.get(str.substring(7));
                if (aVar != null && aVar.d() == a.b.FLOAT_TYPE && (wzbVar = hashMap.get(str)) != null) {
                    wzbVar.d(this.a, this.i, this.j, this.o, this.k, this.l, this.m, aVar.e(), aVar);
                }
            } else {
                float V = V(str);
                if (!Float.isNaN(V) && (wzbVar2 = hashMap.get(str)) != null) {
                    wzbVar2.c(this.a, this.i, this.j, this.o, this.k, this.l, this.m, V);
                }
            }
        }
    }

    public float V(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.t;
            case 1:
                return this.u;
            case 2:
                return this.x;
            case 3:
                return this.y;
            case 4:
                return this.z;
            case 5:
                return this.n;
            case 6:
                return this.v;
            case 7:
                return this.w;
            case '\b':
                return this.r;
            case '\t':
                return this.q;
            case '\n':
                return this.s;
            case 11:
                return this.p;
            case '\f':
                return this.l;
            case '\r':
                return this.m;
            default:
                if (!str.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                    return Float.NaN;
                }
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, o0c> hashMap) {
        ln2.g("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            o0c o0cVar = hashMap.get(str);
            if (o0cVar != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        o0cVar.b(this.a, this.t);
                        continue;
                    case 1:
                        o0cVar.b(this.a, this.u);
                        continue;
                    case 2:
                        o0cVar.b(this.a, this.x);
                        continue;
                    case 3:
                        o0cVar.b(this.a, this.y);
                        continue;
                    case 4:
                        o0cVar.b(this.a, this.z);
                        continue;
                    case 5:
                        o0cVar.b(this.a, this.n);
                        continue;
                    case 6:
                        o0cVar.b(this.a, this.v);
                        continue;
                    case 7:
                        o0cVar.b(this.a, this.w);
                        continue;
                    case '\b':
                        o0cVar.b(this.a, this.r);
                        continue;
                    case '\t':
                        o0cVar.b(this.a, this.q);
                        continue;
                    case '\n':
                        o0cVar.b(this.a, this.s);
                        continue;
                    case 11:
                        o0cVar.b(this.a, this.p);
                        continue;
                    case '\f':
                        o0cVar.b(this.a, this.l);
                        continue;
                    case '\r':
                        o0cVar.b(this.a, this.m);
                        continue;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new c().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        c cVar = (c) aVar;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
        this.n = cVar.n;
        this.o = cVar.o;
        this.p = cVar.p;
        this.q = cVar.q;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        this.v = cVar.v;
        this.w = cVar.w;
        this.x = cVar.x;
        this.y = cVar.y;
        this.z = cVar.z;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.z)) {
            hashSet.add("translationZ");
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
        a.b(this, context.obtainStyledAttributes(attributeSet, g29.G5));
    }
}
