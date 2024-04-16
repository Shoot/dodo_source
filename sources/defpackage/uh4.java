package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import im.threads.business.transport.MessageAttributes;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* renamed from: uh4  reason: default package */
/* loaded from: classes.dex */
public final class uh4 {
    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i, i3, i2);
        }
        return new a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray s = fob.s(resources, theme, attributeSet, i29.A);
            float j = fob.j(s, xmlPullParser, "startX", i29.J, 0.0f);
            float j2 = fob.j(s, xmlPullParser, "startY", i29.K, 0.0f);
            float j3 = fob.j(s, xmlPullParser, "endX", i29.L, 0.0f);
            float j4 = fob.j(s, xmlPullParser, "endY", i29.M, 0.0f);
            float j5 = fob.j(s, xmlPullParser, "centerX", i29.E, 0.0f);
            float j6 = fob.j(s, xmlPullParser, "centerY", i29.F, 0.0f);
            int k = fob.k(s, xmlPullParser, MessageAttributes.TYPE, i29.D, 0);
            int f = fob.f(s, xmlPullParser, "startColor", i29.B, 0);
            boolean r = fob.r(xmlPullParser, "centerColor");
            int f2 = fob.f(s, xmlPullParser, "centerColor", i29.I, 0);
            int f3 = fob.f(s, xmlPullParser, "endColor", i29.C, 0);
            int k2 = fob.k(s, xmlPullParser, "tileMode", i29.H, 0);
            float j7 = fob.j(s, xmlPullParser, "gradientRadius", i29.G, 0.0f);
            s.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k != 1) {
                if (k != 2) {
                    return new LinearGradient(j, j2, j3, j4, a2.a, a2.b, d(k2));
                }
                return new SweepGradient(j5, j6, a2.a, a2.b);
            } else if (j7 > 0.0f) {
                return new RadialGradient(j5, j6, j7, a2.a, a2.b, d(k2));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.uh4.a c(@androidx.annotation.NonNull android.content.res.Resources r9, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.NonNull android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = defpackage.i29.N
            android.content.res.TypedArray r3 = defpackage.fob.s(r9, r12, r11, r3)
            int r5 = defpackage.i29.O
            boolean r6 = r3.hasValue(r5)
            int r7 = defpackage.i29.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            uh4$a r9 = new uh4$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh4.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):uh4$a");
    }

    private static Shader.TileMode d(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* renamed from: uh4$a */
    /* loaded from: classes.dex */
    public static final class a {
        final int[] a;
        final float[] b;

        a(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }

        a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
