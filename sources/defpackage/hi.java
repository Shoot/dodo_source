package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: AndroidPathMeasure.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lhi;", "Lxr7;", "", "startDistance", "stopDistance", "Lor7;", "destination", "", "startWithMoveTo", "b", "path", "forceClosed", "", "a", "Landroid/graphics/PathMeasure;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", c.a, "()F", "length", "<init>", "(Landroid/graphics/PathMeasure;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hi  reason: default package */
/* loaded from: classes.dex */
public final class hi implements xr7 {
    private final PathMeasure a;

    public hi(PathMeasure pathMeasure) {
        z65.h(pathMeasure, "internalPathMeasure");
        this.a = pathMeasure;
    }

    @Override // defpackage.xr7
    public void a(or7 or7Var, boolean z) {
        Path path;
        PathMeasure pathMeasure = this.a;
        if (or7Var != null) {
            if (or7Var instanceof ei) {
                path = ((ei) or7Var).q();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path = null;
        }
        pathMeasure.setPath(path, z);
    }

    @Override // defpackage.xr7
    public boolean b(float f, float f2, or7 or7Var, boolean z) {
        z65.h(or7Var, "destination");
        PathMeasure pathMeasure = this.a;
        if (or7Var instanceof ei) {
            return pathMeasure.getSegment(f, f2, ((ei) or7Var).q(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.xr7
    public float c() {
        return this.a.getLength();
    }
}
