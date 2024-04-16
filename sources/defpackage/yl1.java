package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ComplexColorCompat.java */
/* renamed from: yl1  reason: default package */
/* loaded from: classes.dex */
public final class yl1 {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private yl1(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    @NonNull
    private static yl1 a(@NonNull Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return c(mf1.b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return d(uh4.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static yl1 b(int i) {
        return new yl1(null, null, i);
    }

    static yl1 c(@NonNull ColorStateList colorStateList) {
        return new yl1(null, colorStateList, colorStateList.getDefaultColor());
    }

    static yl1 d(@NonNull Shader shader) {
        return new yl1(shader, null, 0);
    }

    public static yl1 g(@NonNull Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i) {
        this.c = i;
    }

    public boolean l() {
        if (!h() && this.c == 0) {
            return false;
        }
        return true;
    }
}
