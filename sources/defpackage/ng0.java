package defpackage;

import android.graphics.Shader;
import kotlin.Metadata;
/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¨\u0006\u0005"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "Lmga;", "a", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ng0  reason: default package */
/* loaded from: classes.dex */
public final class ng0 {

    /* compiled from: Brush.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"ng0$a", "Lmga;", "Lcna;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ng0$a */
    /* loaded from: classes.dex */
    public static final class a extends mga {
        final /* synthetic */ Shader e;

        a(Shader shader) {
            this.e = shader;
        }

        @Override // defpackage.mga
        public Shader b(long j) {
            return this.e;
        }
    }

    public static final mga a(Shader shader) {
        z65.h(shader, "shader");
        return new a(shader);
    }
}
