package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k53;
import defpackage.xb5;
import java.io.IOException;
/* compiled from: DocumentDataParser.java */
/* renamed from: l53  reason: default package */
/* loaded from: classes.dex */
public class l53 implements jwb<k53> {
    public static final l53 a = new l53();
    private static final xb5.a b = xb5.a.a("t", "f", Image.TYPE_SMALL, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private l53() {
    }

    @Override // defpackage.jwb
    /* renamed from: b */
    public k53 a(xb5 xb5Var, float f) throws IOException {
        k53.a aVar = k53.a.CENTER;
        xb5Var.c();
        k53.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (xb5Var.j()) {
            switch (xb5Var.u(b)) {
                case 0:
                    str = xb5Var.o();
                    break;
                case 1:
                    str2 = xb5Var.o();
                    break;
                case 2:
                    f2 = (float) xb5Var.l();
                    break;
                case 3:
                    int m = xb5Var.m();
                    aVar2 = k53.a.CENTER;
                    if (m <= aVar2.ordinal() && m >= 0) {
                        aVar2 = k53.a.values()[m];
                        break;
                    }
                    break;
                case 4:
                    i = xb5Var.m();
                    break;
                case 5:
                    f3 = (float) xb5Var.l();
                    break;
                case 6:
                    f4 = (float) xb5Var.l();
                    break;
                case 7:
                    i2 = wc5.d(xb5Var);
                    break;
                case 8:
                    i3 = wc5.d(xb5Var);
                    break;
                case 9:
                    f5 = (float) xb5Var.l();
                    break;
                case 10:
                    z = xb5Var.k();
                    break;
                default:
                    xb5Var.x();
                    xb5Var.y();
                    break;
            }
        }
        xb5Var.i();
        return new k53(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}
