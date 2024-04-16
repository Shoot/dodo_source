package defpackage;

import androidx.compose.ui.graphics.f;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0000R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001f\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lim5;", "", "other", "", "a", "Landroidx/compose/ui/graphics/c;", Action.SCOPE_ATTRIBUTE, "b", "", c.a, "", "F", "scaleX", "scaleY", "translationX", DateTokenConverter.CONVERTER_KEY, "translationY", e.a, "rotationX", "f", "rotationY", "g", "rotationZ", Image.TYPE_HIGH, "cameraDistance", "Landroidx/compose/ui/graphics/f;", "i", "J", "transformOrigin", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: im5  reason: default package */
/* loaded from: classes.dex */
public final class im5 {
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float a = 1.0f;
    private float b = 1.0f;
    private float h = 8.0f;
    private long i = f.a.a();

    public final void a(im5 im5Var) {
        z65.h(im5Var, "other");
        this.a = im5Var.a;
        this.b = im5Var.b;
        this.c = im5Var.c;
        this.d = im5Var.d;
        this.e = im5Var.e;
        this.f = im5Var.f;
        this.g = im5Var.g;
        this.h = im5Var.h;
        this.i = im5Var.i;
    }

    public final void b(androidx.compose.ui.graphics.c cVar) {
        z65.h(cVar, Action.SCOPE_ATTRIBUTE);
        this.a = cVar.X();
        this.b = cVar.z0();
        this.c = cVar.p0();
        this.d = cVar.l0();
        this.e = cVar.r0();
        this.f = cVar.w();
        this.g = cVar.A();
        this.h = cVar.K();
        this.i = cVar.N();
    }

    public final boolean c(im5 im5Var) {
        z65.h(im5Var, "other");
        if (this.a == im5Var.a && this.b == im5Var.b && this.c == im5Var.c && this.d == im5Var.d && this.e == im5Var.e && this.f == im5Var.f && this.g == im5Var.g && this.h == im5Var.h && f.c(this.i, im5Var.i)) {
            return true;
        }
        return false;
    }
}
