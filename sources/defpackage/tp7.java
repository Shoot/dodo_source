package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.ui.platform.m;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.zv4;
import kotlin.Metadata;
/* compiled from: PainterResources.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u000f"}, d2 = {"", "id", "Lsp7;", DateTokenConverter.CONVERTER_KEY, "(ILqn1;I)Lsp7;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Lyv4;", c.a, "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILqn1;I)Lyv4;", "Leu4;", "b", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: tp7  reason: default package */
/* loaded from: classes.dex */
public final class tp7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final eu4 b(Resources resources, int i) {
        return mv4.a(eu4.a, resources, i);
    }

    private static final yv4 c(Resources.Theme theme, Resources resources, int i, int i2, qn1 qn1Var, int i3) {
        qn1Var.w(21855625);
        if (tn1.K()) {
            tn1.V(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        zv4 zv4Var = (zv4) qn1Var.k(m.h());
        zv4.b bVar = new zv4.b(theme, i);
        zv4.a b = zv4Var.b(bVar);
        if (b == null) {
            XmlResourceParser xml = resources.getXml(i);
            z65.g(xml, "res.getXml(id)");
            if (z65.c(zbc.j(xml).getName(), "vector")) {
                b = uxb.a(theme, resources, xml, i2);
                zv4Var.d(bVar, b);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        yv4 b2 = b.b();
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.sp7 d(int r10, defpackage.qn1 r11, int r12) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r11.w(r0)
            boolean r1 = defpackage.tn1.K()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"
            defpackage.tn1.V(r0, r12, r1, r2)
        L12:
            xr8 r0 = androidx.compose.ui.platform.m.g()
            java.lang.Object r0 = r11.k(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.res.Resources r3 = defpackage.hk9.a(r11, r1)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.w(r2)
            java.lang.Object r2 = r11.x()
            qn1$a r4 = defpackage.qn1.a
            java.lang.Object r5 = r4.a()
            if (r2 != r5) goto L3b
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r11.p(r2)
        L3b:
            r11.J()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r5 = 1
            r3.getValue(r10, r2, r5)
            java.lang.CharSequence r6 = r2.string
            if (r6 == 0) goto L78
            r7 = 2
            r8 = 0
            java.lang.String r9 = ".xml"
            boolean r7 = defpackage.c0b.Q(r6, r9, r1, r7, r8)
            if (r7 != r5) goto L78
            r4 = -738265327(0xffffffffd3fef711, float:-2.1901336E12)
            r11.w(r4)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r4 = "context.theme"
            defpackage.z65.g(r0, r4)
            int r5 = r2.changingConfigurations
            int r12 = r12 << 6
            r12 = r12 & 896(0x380, float:1.256E-42)
            r7 = r12 | 72
            r2 = r0
            r4 = r10
            r6 = r11
            yv4 r10 = c(r2, r3, r4, r5, r6, r7)
            qxb r10 = defpackage.rxb.b(r10, r11, r1)
            r11.J()
            goto Lc2
        L78:
            r12 = -738265172(0xffffffffd3fef7ac, float:-2.1901539E12)
            r11.w(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r11.w(r1)
            boolean r1 = r11.K(r6)
            boolean r12 = r11.K(r12)
            r12 = r12 | r1
            boolean r0 = r11.K(r0)
            r12 = r12 | r0
            java.lang.Object r0 = r11.x()
            if (r12 != 0) goto La6
            java.lang.Object r12 = r4.a()
            if (r0 != r12) goto Lad
        La6:
            eu4 r0 = a(r3, r10)
            r11.p(r0)
        Lad:
            r11.J()
            r2 = r0
            eu4 r2 = (defpackage.eu4) r2
            ec0 r10 = new ec0
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r5, r7, r8)
            r11.J()
        Lc2:
            boolean r12 = defpackage.tn1.K()
            if (r12 == 0) goto Lcb
            defpackage.tn1.U()
        Lcb:
            r11.J()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp7.d(int, qn1, int):sp7");
    }
}
