package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import com.huawei.hms.push.e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
/* compiled from: HalvesProductCardGlideTarget.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0004\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J8\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcl4;", "Lvi9;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", e.a, "", "model", "Ln6b;", "target", "", "isFirstResource", "resource", "Ldl2;", "dataSource", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "handleDrawable", "<init>", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: cl4  reason: default package */
/* loaded from: classes4.dex */
public final class cl4 implements vi9<Drawable> {
    private final AtomicReference<Drawable> a;

    public cl4(AtomicReference<Drawable> atomicReference) {
        z65.h(atomicReference, "handleDrawable");
        this.a = atomicReference;
    }

    @Override // defpackage.vi9
    /* renamed from: a */
    public boolean f(Drawable drawable, Object obj, n6b<Drawable> n6bVar, dl2 dl2Var, boolean z) {
        z65.h(drawable, "resource");
        z65.h(obj, "model");
        z65.h(dl2Var, "dataSource");
        ho1.a(this.a, null, drawable);
        return false;
    }

    @Override // defpackage.vi9
    public boolean e(GlideException glideException, Object obj, n6b<Drawable> n6bVar, boolean z) {
        z65.h(n6bVar, "target");
        return false;
    }
}
