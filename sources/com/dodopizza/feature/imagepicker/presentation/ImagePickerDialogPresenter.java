package com.dodopizza.feature.imagepicker.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.imagepicker.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.bv4;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ImagePickerDialogPresenter.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b/\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0014J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\u0003J\b\u0010\r\u001a\u00020\u0003H\u0016J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0014\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010+\u001a\n &*\u0004\u0018\u00010%0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/dodopizza/feature/imagepicker/presentation/ImagePickerDialogPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Ljv4;", "", "y", "Lry7;", "r", "p", "Ldy7;", "permission", "w", "t", "x", "onDestroy", "Ljava/io/File;", ElementGenerator.TYPE_IMAGE, "u", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "v", "Ldv4;", "b", "Ldv4;", "data", "Lf63;", c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lfy7;", e.a, "Lfy7;", "permissionChecker", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lrn5;", Image.TYPE_SMALL, "()Lorg/slf4j/Logger;", "logger", "g", "Ljava/io/File;", "pickedImage", "<init>", "(Ldv4;Lf63;Lgc;Lfy7;)V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ImagePickerDialogPresenter extends BasePresenter2<jv4> {
    private final dv4 b;
    private final f63 c;
    private final gc d;
    private final fy7 e;
    private final rn5 f;
    private File g;

    /* compiled from: ImagePickerDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Logger> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("ImagePickerDialogPresenter");
        }
    }

    public ImagePickerDialogPresenter(dv4 dv4Var, f63 f63Var, gc gcVar, fy7 fy7Var) {
        rn5 b;
        z65.h(dv4Var, "data");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(fy7Var, "permissionChecker");
        this.b = dv4Var;
        this.c = f63Var;
        this.d = gcVar;
        this.e = fy7Var;
        b = yn5.b(a.a);
        this.f = b;
    }

    private final ry7 r() {
        return this.e.a("android.permission.CAMERA");
    }

    private final Logger s() {
        return (Logger) this.f.getValue();
    }

    private final void y() {
        boolean z;
        if (r() != ry7.DENIED_FOREVER) {
            z = true;
        } else {
            z = false;
        }
        ((jv4) getViewState()).x8(z);
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        if (this.g != null) {
            return;
        }
        this.c.l(this.b.a(), a.b.a);
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        y();
    }

    public final void t() {
        this.d.a(bv4.a.a(bv4.a.b, this.b.b()));
        if (r() == ry7.GRANTED) {
            ((jv4) getViewState()).S3();
        } else {
            ((jv4) getViewState()).wf("android.permission.CAMERA");
        }
    }

    public final void u(File file) {
        z65.h(file, ElementGenerator.TYPE_IMAGE);
        this.g = file;
        this.c.i(this.b.a(), new a.C0121a(file));
    }

    public final void v(Exception exc) {
        z65.h(exc, "error");
        s().error("Failed to pick an image", (Throwable) exc);
        this.c.i(this.b.a(), a.b.a);
    }

    public final void w(dy7 dy7Var) {
        z65.h(dy7Var, "permission");
        if (z65.c(dy7Var.c(), "android.permission.CAMERA")) {
            if (dy7Var.b()) {
                ((jv4) getViewState()).S3();
            } else {
                y();
            }
        }
    }

    public final void x() {
        this.d.a(bv4.a.a(bv4.a.c, this.b.b()));
        ((jv4) getViewState()).kf();
    }
}
