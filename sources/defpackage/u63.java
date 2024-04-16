package defpackage;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DoubleImageLoaderResultCallbacksHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006#"}, d2 = {"Lu63;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "i", "l", e.a, Image.TYPE_HIGH, "k", "j", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "finalAction", "Ljava/lang/ref/WeakReference;", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "b", "Ljava/lang/ref/WeakReference;", "target", com.huawei.hms.opendevice.c.a, "Landroid/graphics/drawable/Drawable;", "firstDrawable", DateTokenConverter.CONVERTER_KEY, "secondDrawable", "Lzu4;", "Lzu4;", "f", "()Lzu4;", "firstImageLoaderResultCallbacks", "g", "secondImageLoaderResultCallbacks", "doubleImageView", "<init>", "(Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;Lkotlin/jvm/functions/Function0;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u63  reason: default package */
/* loaded from: classes.dex */
public final class u63 {
    private final Function0<Unit> a;
    private final WeakReference<DoubleImageView> b;
    private Drawable c;
    private Drawable d;
    private final zu4 e;
    private final zu4 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DoubleImageLoaderResultCallbacksHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u63$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* compiled from: DoubleImageLoaderResultCallbacksHandler.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"u63$b", "Lzu4;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "a", "result", com.huawei.hms.opendevice.c.a, "errorDrawable", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u63$b */
    /* loaded from: classes.dex */
    public static final class b implements zu4 {
        b() {
        }

        @Override // defpackage.zu4
        public void a(Drawable drawable) {
            z65.h(drawable, "placeholder");
            u63.this.k(drawable);
        }

        @Override // defpackage.zu4
        public void b(Drawable drawable) {
            z65.h(drawable, "errorDrawable");
            u63.this.j(drawable);
        }

        @Override // defpackage.zu4
        public void c(Drawable drawable) {
            z65.h(drawable, "result");
            u63.this.i(drawable);
        }
    }

    /* compiled from: DoubleImageLoaderResultCallbacksHandler.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"u63$c", "Lzu4;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "a", "result", com.huawei.hms.opendevice.c.a, "errorDrawable", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u63$c */
    /* loaded from: classes.dex */
    public static final class c implements zu4 {
        c() {
        }

        @Override // defpackage.zu4
        public void a(Drawable drawable) {
            z65.h(drawable, "placeholder");
            u63.this.k(drawable);
        }

        @Override // defpackage.zu4
        public void b(Drawable drawable) {
            z65.h(drawable, "errorDrawable");
            u63.this.j(drawable);
        }

        @Override // defpackage.zu4
        public void c(Drawable drawable) {
            z65.h(drawable, "result");
            u63.this.l(drawable);
        }
    }

    public u63(DoubleImageView doubleImageView, Function0<Unit> function0) {
        z65.h(doubleImageView, "doubleImageView");
        z65.h(function0, "finalAction");
        this.a = function0;
        this.b = new WeakReference<>(doubleImageView);
        this.e = new b();
        this.f = new c();
    }

    private final void e() {
        if (this.c != null && this.d != null) {
            h();
        }
    }

    private final void h() {
        DoubleImageView doubleImageView = this.b.get();
        if (doubleImageView != null) {
            Drawable drawable = this.c;
            z65.e(drawable);
            doubleImageView.f(drawable);
            Drawable drawable2 = this.d;
            z65.e(drawable2);
            doubleImageView.h(drawable2);
        }
        this.a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Drawable drawable) {
        this.c = drawable;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Drawable drawable) {
        DoubleImageView doubleImageView = this.b.get();
        if (doubleImageView != null) {
            doubleImageView.i(drawable);
        }
        this.a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Drawable drawable) {
        DoubleImageView doubleImageView = this.b.get();
        if (doubleImageView != null) {
            doubleImageView.g(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Drawable drawable) {
        this.d = drawable;
        e();
    }

    public final zu4 f() {
        return this.e;
    }

    public final zu4 g() {
        return this.f;
    }

    public /* synthetic */ u63(DoubleImageView doubleImageView, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(doubleImageView, (i & 2) != 0 ? a.a : function0);
    }
}
