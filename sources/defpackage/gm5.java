package defpackage;

import android.graphics.Matrix;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: LayerMatrixCache.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\bR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR!\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R!\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lgm5;", "T", "", "", c.a, "target", "Loa6;", "b", "(Ljava/lang/Object;)[F", "a", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "Lkotlin/jvm/functions/Function2;", "getMatrix", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", DateTokenConverter.CONVERTER_KEY, "[F", "matrixCache", e.a, "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", Image.TYPE_HIGH, "isInverseValid", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gm5  reason: default package */
/* loaded from: classes.dex */
public final class gm5<T> {
    private final Function2<T, Matrix, Unit> a;
    private Matrix b;
    private Matrix c;
    private float[] d;
    private float[] e;
    private boolean f;
    private boolean g;
    private boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public gm5(Function2<? super T, ? super Matrix, Unit> function2) {
        z65.h(function2, "getMatrix");
        this.a = function2;
        this.f = true;
        this.g = true;
        this.h = true;
    }

    public final float[] a(T t) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = oa6.c(null, 1, null);
            this.e = fArr;
        }
        if (this.g) {
            this.h = m75.a(b(t), fArr);
            this.g = false;
        }
        if (!this.h) {
            return null;
        }
        return fArr;
    }

    public final float[] b(T t) {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = oa6.c(null, 1, null);
            this.d = fArr;
        }
        if (!this.f) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(t, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !z65.c(matrix, matrix2)) {
            th.b(fArr, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArr;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}
