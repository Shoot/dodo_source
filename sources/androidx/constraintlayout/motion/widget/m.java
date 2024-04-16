package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
public class m {
    private static final float[][] G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private float r;
    private float s;
    private final MotionLayout t;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private float g = 0.5f;
    private float h = 0.5f;
    float i = 0.5f;
    float j = 0.5f;
    private int k = -1;
    boolean l = false;
    private float m = 0.0f;
    private float n = 1.0f;
    private boolean o = false;
    private float[] p = new float[2];
    private int[] q = new int[2];
    private float u = 4.0f;
    private float v = 1.2f;
    private boolean w = true;
    private float x = 1.0f;
    private int y = 0;
    private float z = 10.0f;
    private float A = 10.0f;
    private float B = 1.0f;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private int E = 0;
    private int F = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TouchResponse.java */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == g29.l9) {
                this.d = typedArray.getResourceId(index, this.d);
            } else if (index == g29.m9) {
                int i2 = typedArray.getInt(index, this.a);
                this.a = i2;
                float[] fArr = G[i2];
                this.h = fArr[0];
                this.g = fArr[1];
            } else if (index == g29.W8) {
                int i3 = typedArray.getInt(index, this.b);
                this.b = i3;
                float[][] fArr2 = H;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.m = fArr3[0];
                    this.n = fArr3[1];
                } else {
                    this.n = Float.NaN;
                    this.m = Float.NaN;
                    this.l = true;
                }
            } else if (index == g29.b9) {
                this.u = typedArray.getFloat(index, this.u);
            } else if (index == g29.a9) {
                this.v = typedArray.getFloat(index, this.v);
            } else if (index == g29.c9) {
                this.w = typedArray.getBoolean(index, this.w);
            } else if (index == g29.X8) {
                this.x = typedArray.getFloat(index, this.x);
            } else if (index == g29.Y8) {
                this.z = typedArray.getFloat(index, this.z);
            } else if (index == g29.n9) {
                this.e = typedArray.getResourceId(index, this.e);
            } else if (index == g29.e9) {
                this.c = typedArray.getInt(index, this.c);
            } else if (index == g29.d9) {
                this.y = typedArray.getInteger(index, 0);
            } else if (index == g29.Z8) {
                this.f = typedArray.getResourceId(index, 0);
            } else if (index == g29.f9) {
                this.k = typedArray.getResourceId(index, this.k);
            } else if (index == g29.h9) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == g29.i9) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == g29.j9) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == g29.k9) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == g29.g9) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == g29.V8) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.U8);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a(float f, float f2) {
        return (f * this.m) + (f2 * this.n);
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.v;
    }

    public float h() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j(float f, float f2) {
        this.t.O(this.d, this.t.getProgress(), this.h, this.g, this.p);
        float f3 = this.m;
        if (f3 != 0.0f) {
            float[] fArr = this.p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(MotionEvent motionEvent, MotionLayout.h hVar, int i, l lVar) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        boolean z;
        float f5;
        if (this.l) {
            s(motionEvent, hVar, i, lVar);
            return;
        }
        hVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.s;
                    float rawX = motionEvent.getRawX() - this.r;
                    if (Math.abs((this.m * rawX) + (this.n * rawY)) > this.z || this.o) {
                        float progress = this.t.getProgress();
                        if (!this.o) {
                            this.o = true;
                            this.t.setProgress(progress);
                        }
                        int i3 = this.d;
                        if (i3 != -1) {
                            this.t.O(i3, progress, this.h, this.g, this.p);
                        } else {
                            float min = Math.min(this.t.getWidth(), this.t.getHeight());
                            float[] fArr = this.p;
                            fArr[1] = this.n * min;
                            fArr[0] = min * this.m;
                        }
                        float f6 = this.m;
                        float[] fArr2 = this.p;
                        if (Math.abs(((f6 * fArr2[0]) + (this.n * fArr2[1])) * this.x) < 0.01d) {
                            float[] fArr3 = this.p;
                            fArr3[0] = 0.01f;
                            fArr3[1] = 0.01f;
                        }
                        if (this.m != 0.0f) {
                            f4 = rawX / this.p[0];
                        } else {
                            f4 = rawY / this.p[1];
                        }
                        float max = Math.max(Math.min(progress + f4, 1.0f), 0.0f);
                        if (this.c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.t.getProgress();
                        if (max != progress2) {
                            int i4 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                            if (i4 == 0 || progress2 == 1.0f) {
                                MotionLayout motionLayout = this.t;
                                if (i4 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                motionLayout.I(z);
                            }
                            this.t.setProgress(max);
                            hVar.e(1000);
                            float d = hVar.d();
                            float c = hVar.c();
                            if (this.m != 0.0f) {
                                f5 = d / this.p[0];
                            } else {
                                f5 = c / this.p[1];
                            }
                            this.t.d = f5;
                        } else {
                            this.t.d = 0.0f;
                        }
                        this.r = motionEvent.getRawX();
                        this.s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.o = false;
            hVar.e(1000);
            float d2 = hVar.d();
            float c2 = hVar.c();
            float progress3 = this.t.getProgress();
            int i5 = this.d;
            if (i5 != -1) {
                this.t.O(i5, progress3, this.h, this.g, this.p);
            } else {
                float min2 = Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr4 = this.p;
                fArr4[1] = this.n * min2;
                fArr4[0] = min2 * this.m;
            }
            float f7 = this.m;
            float[] fArr5 = this.p;
            float f8 = fArr5[0];
            float f9 = fArr5[1];
            if (f7 != 0.0f) {
                f = d2 / f8;
            } else {
                f = c2 / f9;
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + progress3;
            } else {
                f2 = progress3;
            }
            if (f2 != 0.0f && f2 != 1.0f && (i2 = this.c) != 3) {
                if (f2 < 0.5d) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                if (i2 == 6) {
                    if (progress3 + f < 0.0f) {
                        f = Math.abs(f);
                    }
                    f3 = 1.0f;
                }
                if (this.c == 7) {
                    if (progress3 + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.t.d0(this.c, f3, f);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.t.setState(MotionLayout.l.FINISHED);
                    return;
                }
                return;
            } else if (0.0f >= f2 || 1.0f <= f2) {
                this.t.setState(MotionLayout.l.FINISHED);
                return;
            } else {
                return;
            }
        }
        this.r = motionEvent.getRawX();
        this.s = motionEvent.getRawY();
        this.o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void s(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.h r25, int r26, androidx.constraintlayout.motion.widget.l r27) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.s(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$h, int, androidx.constraintlayout.motion.widget.l):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(float f, float f2) {
        float f3;
        float progress = this.t.getProgress();
        if (!this.o) {
            this.o = true;
            this.t.setProgress(progress);
        }
        this.t.O(this.d, progress, this.h, this.g, this.p);
        float f4 = this.m;
        float[] fArr = this.p;
        if (Math.abs((f4 * fArr[0]) + (this.n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.p[0];
        } else {
            f3 = (f2 * this.n) / this.p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.t.getProgress()) {
            this.t.setProgress(max);
        }
    }

    public String toString() {
        if (Float.isNaN(this.m)) {
            return "rotation";
        }
        return this.m + " , " + this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.o = false;
        float progress = this.t.getProgress();
        this.t.O(this.d, progress, this.h, this.g, this.p);
        float f4 = this.m;
        float[] fArr = this.p;
        float f5 = fArr[0];
        float f6 = this.n;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / f5;
        } else {
            f3 = (f2 * f6) / f7;
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            if (progress != 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int i = this.c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 & z) {
                MotionLayout motionLayout = this.t;
                if (progress >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.d0(i, f8, f3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(float f, float f2) {
        this.r = f;
        this.s = f2;
    }

    public void w(boolean z) {
        if (z) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = G[this.a];
        this.h = fArr5[0];
        this.g = fArr5[1];
        int i = this.b;
        float[][] fArr6 = H;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.m = fArr7[0];
        this.n = fArr7[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(float f, float f2) {
        this.r = f;
        this.s = f2;
        this.o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        View view;
        int i = this.d;
        if (i != -1) {
            view = this.t.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + ln2.c(this.t.getContext(), this.d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TouchResponse.java */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }
}
