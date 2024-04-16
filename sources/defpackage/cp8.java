package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProgressDrawable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0004J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0004J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0004R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u000e\u0010\u001c\"\u0004\b \u0010\u001eR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u001a\u0010&\u001a\u00020\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u0015\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(¨\u0006."}, d2 = {"Lcp8;", "Lf80;", "Landroid/graphics/Canvas;", "canvas", "", "width", "height", "", DateTokenConverter.CONVERTER_KEY, "j", e.a, "k", "f", "", Image.TYPE_HIGH, "F", "getProgress", "()F", "n", "(F)V", "progress", "i", "getProgressMax", "setProgressMax", "progressMax", "value", "I", "g", "()I", "l", "(I)V", "backgroundColor", Image.TYPE_MEDIUM, "foregroundColor", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectBackground", "()Landroid/graphics/RectF;", "rectProgress", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "clipPath", "<init>", "()V", "o", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cp8  reason: default package */
/* loaded from: classes.dex */
public class cp8 extends f80 {
    public static final a o = new a(null);
    private float h = 50.0f;
    private float i = 100.0f;
    private int j = -16777216;
    private int k = -65536;
    private final RectF l = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final RectF m = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final Path n = new Path();

    /* compiled from: ProgressDrawable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcp8$a;", "", "", "BOUNDARY_WIDTH", "F", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cp8$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.f80
    public void d(Canvas canvas, int i, int i2) {
        z65.h(canvas, "canvas");
        j(i, i2);
        e(canvas);
        if (this.h > 0.0f) {
            k(i, i2);
            f(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Canvas canvas) {
        z65.h(canvas, "canvas");
        canvas.drawRoundRect(this.l, c(), c(), a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(Canvas canvas) {
        z65.h(canvas, "canvas");
        this.n.reset();
        this.n.addRoundRect(this.l, c(), c(), Path.Direction.CW);
        canvas.clipPath(this.n);
        canvas.drawRoundRect(this.m, c(), c(), b());
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RectF i() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(int i, int i2) {
        this.l.set(0.0f, 0.0f, i, i2);
    }

    protected final void k(int i, int i2) {
        this.m.set(0.0f, 0.0f, i * (this.h / this.i), i2);
    }

    public final void l(int i) {
        a().setColor(i);
        this.j = i;
    }

    public final void m(int i) {
        b().setColor(i);
        this.k = i;
    }

    public final void n(float f) {
        this.h = f;
    }
}
