package defpackage;

import android.graphics.Shader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.uc1;
import kotlin.Metadata;
/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lmga;", "Lmg0;", "Lcna;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "Lpp7;", "p", "", "alpha", "", "a", "(JLpp7;F)V", c.a, "Landroid/graphics/Shader;", "internalShader", DateTokenConverter.CONVERTER_KEY, "J", "createdSize", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mga  reason: default package */
/* loaded from: classes.dex */
public abstract class mga extends mg0 {
    private Shader c;
    private long d;

    public mga() {
        super(null);
        this.d = cna.b.a();
    }

    @Override // defpackage.mg0
    public final void a(long j, pp7 pp7Var, float f) {
        z65.h(pp7Var, "p");
        Shader shader = this.c;
        if (shader == null || !cna.f(this.d, j)) {
            if (cna.k(j)) {
                shader = null;
                this.c = null;
                this.d = cna.b.a();
            } else {
                shader = b(j);
                this.c = shader;
                this.d = j;
            }
        }
        long b = pp7Var.b();
        uc1.a aVar = uc1.b;
        if (!uc1.l(b, aVar.a())) {
            pp7Var.k(aVar.a());
        }
        if (!z65.c(pp7Var.r(), shader)) {
            pp7Var.q(shader);
        }
        if (pp7Var.a() != f) {
            pp7Var.c(f);
        }
    }

    public abstract Shader b(long j);
}
