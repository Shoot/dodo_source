package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public class e extends f {
    String h = null;
    int i = androidx.constraintlayout.motion.widget.a.f;
    int j = 0;
    float k = Float.NaN;
    float l = Float.NaN;
    float m = Float.NaN;
    float n = Float.NaN;
    float o = Float.NaN;
    float p = Float.NaN;
    int q = 0;
    private float r = Float.NaN;
    private float s = Float.NaN;

    /* compiled from: KeyPosition.java */
    /* loaded from: classes.dex */
    private static class a {
        private static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(g29.k6, 1);
            a.append(g29.i6, 2);
            a.append(g29.r6, 3);
            a.append(g29.g6, 4);
            a.append(g29.h6, 5);
            a.append(g29.o6, 6);
            a.append(g29.p6, 7);
            a.append(g29.j6, 9);
            a.append(g29.q6, 8);
            a.append(g29.n6, 11);
            a.append(g29.m6, 12);
            a.append(g29.l6, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (a.get(index)) {
                    case 1:
                        if (MotionLayout.Q5) {
                            int resourceId = typedArray.getResourceId(index, eVar.b);
                            eVar.b = resourceId;
                            if (resourceId == -1) {
                                eVar.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eVar.c = typedArray.getString(index);
                            break;
                        } else {
                            eVar.b = typedArray.getResourceId(index, eVar.b);
                            break;
                        }
                    case 2:
                        eVar.a = typedArray.getInt(index, eVar.a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            eVar.h = typedArray.getString(index);
                            break;
                        } else {
                            eVar.h = yb3.c[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        eVar.g = typedArray.getInteger(index, eVar.g);
                        break;
                    case 5:
                        eVar.j = typedArray.getInt(index, eVar.j);
                        break;
                    case 6:
                        eVar.m = typedArray.getFloat(index, eVar.m);
                        break;
                    case 7:
                        eVar.n = typedArray.getFloat(index, eVar.n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, eVar.l);
                        eVar.k = f;
                        eVar.l = f;
                        break;
                    case 9:
                        eVar.q = typedArray.getInt(index, eVar.q);
                        break;
                    case 10:
                        eVar.i = typedArray.getInt(index, eVar.i);
                        break;
                    case 11:
                        eVar.k = typedArray.getFloat(index, eVar.k);
                        break;
                    case 12:
                        eVar.l = typedArray.getFloat(index, eVar.l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                        break;
                }
            }
            if (eVar.a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public e() {
        this.d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    /* renamed from: b */
    public androidx.constraintlayout.motion.widget.a clone() {
        return new e().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public androidx.constraintlayout.motion.widget.a c(androidx.constraintlayout.motion.widget.a aVar) {
        super.c(aVar);
        e eVar = (e) aVar;
        this.h = eVar.h;
        this.i = eVar.i;
        this.j = eVar.j;
        this.k = eVar.k;
        this.l = Float.NaN;
        this.m = eVar.m;
        this.n = eVar.n;
        this.o = eVar.o;
        this.p = eVar.p;
        this.r = eVar.r;
        this.s = eVar.s;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, g29.f6));
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void a(HashMap<String, o0c> hashMap) {
    }
}
