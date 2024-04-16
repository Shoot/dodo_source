package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sr7;
import defpackage.yv4;
import java.util.List;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: XmlVectorParser.android.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a<\u0010\u0015\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0016\u001a\u00020\b*\u00020\bH\u0000\u001a*\u0010\u0017\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u001a2\u0010\u0019\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a2\u0010\u001e\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a2\u0010\u001f\u001a\u00020\u0018*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0018\u00010\u0010R\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\"\u0014\u0010!\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"", "id", "Lq0b;", "defValue", "b", "(II)I", "Ls0b;", c.a, "Lorg/xmlpull/v1/XmlPullParser;", "", DateTokenConverter.CONVERTER_KEY, "Lgj;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lyv4$a;", "builder", "nestedGroups", "g", "j", "a", "", "i", "Lyl1;", "complexColor", "Lmg0;", e.a, "f", Image.TYPE_HIGH, "I", "FILL_TYPE_WINDING", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: zbc  reason: default package */
/* loaded from: classes.dex */
public final class zbc {
    private static final int a = 0;

    public static final yv4.a a(gj gjVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long e;
        int z;
        z65.h(gjVar, "<this>");
        z65.h(resources, "res");
        z65.h(attributeSet, "attrs");
        hj hjVar = hj.a;
        TypedArray k = gjVar.k(resources, theme, attributeSet, hjVar.F());
        boolean d = gjVar.d(k, "autoMirrored", hjVar.a(), false);
        float g = gjVar.g(k, "viewportWidth", hjVar.H(), 0.0f);
        float g2 = gjVar.g(k, "viewportHeight", hjVar.G(), 0.0f);
        if (g > 0.0f) {
            if (g2 > 0.0f) {
                float a2 = gjVar.a(k, hjVar.I(), 0.0f);
                float a3 = gjVar.a(k, hjVar.n(), 0.0f);
                if (k.hasValue(hjVar.D())) {
                    TypedValue typedValue = new TypedValue();
                    k.getValue(hjVar.D(), typedValue);
                    if (typedValue.type == 2) {
                        e = uc1.b.e();
                    } else {
                        ColorStateList e2 = gjVar.e(k, theme, "tint", hjVar.D());
                        if (e2 != null) {
                            e = yc1.b(e2.getDefaultColor());
                        } else {
                            e = uc1.b.e();
                        }
                    }
                } else {
                    e = uc1.b.e();
                }
                long j = e;
                int c = gjVar.c(k, hjVar.E(), -1);
                if (c != -1) {
                    if (c != 3) {
                        if (c != 5) {
                            if (c != 9) {
                                switch (c) {
                                    case 14:
                                        z = pc0.b.q();
                                        break;
                                    case 15:
                                        z = pc0.b.v();
                                        break;
                                    case 16:
                                        z = pc0.b.t();
                                        break;
                                    default:
                                        z = pc0.b.z();
                                        break;
                                }
                            } else {
                                z = pc0.b.y();
                            }
                        } else {
                            z = pc0.b.z();
                        }
                    } else {
                        z = pc0.b.B();
                    }
                } else {
                    z = pc0.b.z();
                }
                int i = z;
                float o = i73.o(a2 / resources.getDisplayMetrics().density);
                float o2 = i73.o(a3 / resources.getDisplayMetrics().density);
                k.recycle();
                return new yv4.a(null, o, o2, g, g2, j, i, d, 1, null);
            }
            throw new XmlPullParserException(k.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(k.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
    }

    private static final int b(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return q0b.b.c();
                }
                return i2;
            }
            return q0b.b.b();
        }
        return q0b.b.a();
    }

    private static final int c(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return s0b.b.a();
                }
                return i2;
            }
            return s0b.b.c();
        }
        return s0b.b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        z65.h(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    private static final mg0 e(yl1 yl1Var) {
        if (!yl1Var.l()) {
            return null;
        }
        Shader f = yl1Var.f();
        if (f != null) {
            return ng0.a(f);
        }
        return new jqa(yc1.b(yl1Var.e()), null);
    }

    public static final void f(gj gjVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, yv4.a aVar) {
        z65.h(gjVar, "<this>");
        z65.h(resources, "res");
        z65.h(attributeSet, "attrs");
        z65.h(aVar, "builder");
        hj hjVar = hj.a;
        TypedArray k = gjVar.k(resources, theme, attributeSet, hjVar.b());
        String i = gjVar.i(k, hjVar.c());
        if (i == null) {
            i = "";
        }
        List<zr7> a2 = oxb.a(gjVar.i(k, hjVar.d()));
        k.recycle();
        yv4.a.b(aVar, i, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, a2, 254, null);
    }

    public static final int g(gj gjVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, yv4.a aVar, int i) {
        z65.h(gjVar, "<this>");
        z65.h(resources, "res");
        z65.h(attributeSet, "attrs");
        z65.h(aVar, "builder");
        int eventType = gjVar.j().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && z65.c("group", gjVar.j().getName())) {
                int i2 = i + 1;
                for (int i3 = 0; i3 < i2; i3++) {
                    aVar.f();
                }
                return 0;
            }
            return i;
        }
        String name = gjVar.j().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode == 98629247 && name.equals("group")) {
                        h(gjVar, resources, theme, attributeSet, aVar);
                        return i;
                    }
                    return i;
                } else if (name.equals("path")) {
                    i(gjVar, resources, theme, attributeSet, aVar);
                    return i;
                } else {
                    return i;
                }
            } else if (name.equals("clip-path")) {
                f(gjVar, resources, theme, attributeSet, aVar);
                return i + 1;
            } else {
                return i;
            }
        }
        return i;
    }

    public static final void h(gj gjVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, yv4.a aVar) {
        z65.h(gjVar, "<this>");
        z65.h(resources, "res");
        z65.h(attributeSet, "attrs");
        z65.h(aVar, "builder");
        hj hjVar = hj.a;
        TypedArray k = gjVar.k(resources, theme, attributeSet, hjVar.e());
        float g = gjVar.g(k, "rotation", hjVar.i(), 0.0f);
        float b = gjVar.b(k, hjVar.g(), 0.0f);
        float b2 = gjVar.b(k, hjVar.h(), 0.0f);
        float g2 = gjVar.g(k, "scaleX", hjVar.j(), 1.0f);
        float g3 = gjVar.g(k, "scaleY", hjVar.k(), 1.0f);
        float g4 = gjVar.g(k, "translateX", hjVar.l(), 0.0f);
        float g5 = gjVar.g(k, "translateY", hjVar.m(), 0.0f);
        String i = gjVar.i(k, hjVar.f());
        if (i == null) {
            i = "";
        }
        k.recycle();
        aVar.a(i, g, b, b2, g2, g3, g4, g5, oxb.e());
    }

    public static final void i(gj gjVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, yv4.a aVar) throws IllegalArgumentException {
        int a2;
        z65.h(gjVar, "<this>");
        z65.h(resources, "res");
        z65.h(attributeSet, "attrs");
        z65.h(aVar, "builder");
        hj hjVar = hj.a;
        TypedArray k = gjVar.k(resources, theme, attributeSet, hjVar.o());
        if (fob.r(gjVar.j(), "pathData")) {
            String i = gjVar.i(k, hjVar.r());
            if (i == null) {
                i = "";
            }
            String str = i;
            List<zr7> a3 = oxb.a(gjVar.i(k, hjVar.s()));
            yl1 f = gjVar.f(k, theme, "fillColor", hjVar.q(), 0);
            float g = gjVar.g(k, "fillAlpha", hjVar.p(), 1.0f);
            int b = b(gjVar.h(k, "strokeLineCap", hjVar.v(), -1), q0b.b.a());
            int c = c(gjVar.h(k, "strokeLineJoin", hjVar.w(), -1), s0b.b.a());
            float g2 = gjVar.g(k, "strokeMiterLimit", hjVar.x(), 1.0f);
            yl1 f2 = gjVar.f(k, theme, "strokeColor", hjVar.u(), 0);
            float g3 = gjVar.g(k, "strokeAlpha", hjVar.t(), 1.0f);
            float g4 = gjVar.g(k, "strokeWidth", hjVar.y(), 1.0f);
            float g5 = gjVar.g(k, "trimPathEnd", hjVar.z(), 1.0f);
            float g6 = gjVar.g(k, "trimPathOffset", hjVar.B(), 0.0f);
            float g7 = gjVar.g(k, "trimPathStart", hjVar.C(), 0.0f);
            int h = gjVar.h(k, "fillType", hjVar.A(), a);
            k.recycle();
            mg0 e = e(f);
            mg0 e2 = e(f2);
            sr7.a aVar2 = sr7.b;
            if (h == 0) {
                a2 = aVar2.b();
            } else {
                a2 = aVar2.a();
            }
            aVar.c(a3, a2, str, e, g, e2, g3, g4, b, c, g2, g7, g5, g6);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException {
        z65.h(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
