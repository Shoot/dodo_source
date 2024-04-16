package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: XmlVectorParser.android.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010,\u001a\u00020(\u0012\b\b\u0002\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ(\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0018J\u001e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016J\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0002J\u001e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0016J8\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002J0\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0002J\t\u0010$\u001a\u00020\u0011HÖ\u0001J\t\u0010%\u001a\u00020\u0002HÖ\u0001J\u0013\u0010'\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lgj;", "", "", "resConfig", "", "l", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "k", "typedArray", "", "attrName", "resId", "defaultValue", Image.TYPE_HIGH, "", "g", "", DateTokenConverter.CONVERTER_KEY, "index", "b", c.a, "i", "defValue", "a", "Lyl1;", "f", "Landroid/content/res/ColorStateList;", e.a, "toString", "hashCode", "other", "equals", "Lorg/xmlpull/v1/XmlPullParser;", "Lorg/xmlpull/v1/XmlPullParser;", "j", "()Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "I", "getConfig", "()I", "setConfig", "(I)V", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public final class gj {
    private final XmlPullParser a;
    private int b;

    public gj(XmlPullParser xmlPullParser, int i) {
        z65.h(xmlPullParser, "xmlParser");
        this.a = xmlPullParser;
        this.b = i;
    }

    private final void l(int i) {
        this.b = i | this.b;
    }

    public final float a(TypedArray typedArray, int i, float f) {
        z65.h(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i, float f) {
        z65.h(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        l(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int c(TypedArray typedArray, int i, int i2) {
        z65.h(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        l(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean d(TypedArray typedArray, String str, int i, boolean z) {
        z65.h(typedArray, "typedArray");
        z65.h(str, "attrName");
        boolean e = fob.e(typedArray, this.a, str, i, z);
        l(typedArray.getChangingConfigurations());
        return e;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        z65.h(typedArray, "typedArray");
        z65.h(str, "attrName");
        ColorStateList g = fob.g(typedArray, this.a, theme, str, i);
        l(typedArray.getChangingConfigurations());
        return g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        if (z65.c(this.a, gjVar.a) && this.b == gjVar.b) {
            return true;
        }
        return false;
    }

    public final yl1 f(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        z65.h(typedArray, "typedArray");
        z65.h(str, "attrName");
        yl1 i3 = fob.i(typedArray, this.a, theme, str, i, i2);
        l(typedArray.getChangingConfigurations());
        z65.g(i3, "result");
        return i3;
    }

    public final float g(TypedArray typedArray, String str, int i, float f) {
        z65.h(typedArray, "typedArray");
        z65.h(str, "attrName");
        float j = fob.j(typedArray, this.a, str, i, f);
        l(typedArray.getChangingConfigurations());
        return j;
    }

    public final int h(TypedArray typedArray, String str, int i, int i2) {
        z65.h(typedArray, "typedArray");
        z65.h(str, "attrName");
        int k = fob.k(typedArray, this.a, str, i, i2);
        l(typedArray.getChangingConfigurations());
        return k;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String i(TypedArray typedArray, int i) {
        z65.h(typedArray, "typedArray");
        String string = typedArray.getString(i);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        z65.h(resources, "res");
        z65.h(attributeSet, "set");
        z65.h(iArr, "attrs");
        TypedArray s = fob.s(resources, theme, attributeSet, iArr);
        z65.g(s, "obtainAttributes(\n      …          attrs\n        )");
        l(s.getChangingConfigurations());
        return s;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ gj(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
