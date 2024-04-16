package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import defpackage.yv4;
import defpackage.zv4;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: VectorResources.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "Landroid/content/res/XmlResourceParser;", "parser", "", "changingConfigurations", "Lzv4$a;", "a", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: uxb  reason: default package */
/* loaded from: classes.dex */
public final class uxb {
    public static final zv4.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException {
        z65.h(resources, "res");
        z65.h(xmlResourceParser, "parser");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        gj gjVar = new gj(xmlResourceParser, 0, 2, null);
        z65.g(asAttributeSet, "attrs");
        yv4.a a = zbc.a(gjVar, resources, theme, asAttributeSet);
        int i2 = 0;
        while (!zbc.d(xmlResourceParser)) {
            i2 = zbc.g(gjVar, resources, asAttributeSet, theme, a, i2);
            xmlResourceParser.next();
        }
        return new zv4.a(a.e(), i);
    }
}
