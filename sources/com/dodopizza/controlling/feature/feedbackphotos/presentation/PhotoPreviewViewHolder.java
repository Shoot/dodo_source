package com.dodopizza.controlling.feature.feedbackphotos.presentation;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.controlling.feature.feedbackphotos.presentation.PhotoPreviewViewHolder;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: PhotoPreviewViewHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012¨\u0006 "}, d2 = {"Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/PhotoPreviewViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "path", "", "showImage", "showError", "hideError", "Lkotlin/Function0;", "listener", "setOnClickListener", "", "progress", "changeLoadingProgress", "Landroid/widget/ImageView;", "image$delegate", "Lk79;", "getImage", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/ProgressBar;", "progressBar$delegate", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "errorBadge$delegate", "getErrorBadge", "errorBadge", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PhotoPreviewViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(PhotoPreviewViewHolder.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(PhotoPreviewViewHolder.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(PhotoPreviewViewHolder.class, "errorBadge", "getErrorBadge()Landroid/widget/ImageView;", 0))};
    private final k79 errorBadge$delegate;
    private final k79 image$delegate;
    private final k79 progressBar$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoPreviewViewHolder(kzb kzbVar) {
        super(kzbVar, wz8.item_rating_photo_preview);
        z65.h(kzbVar, "viewInflater");
        this.image$delegate = kb0.g(this, zx8.rating_photo_preview_image);
        this.progressBar$delegate = kb0.g(this, zx8.rating_photo_loading_progress);
        this.errorBadge$delegate = kb0.g(this, zx8.rating_photo_error_badge);
    }

    private final ImageView getErrorBadge() {
        return (ImageView) this.errorBadge$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getImage() {
        return (ImageView) this.image$delegate.a(this, $$delegatedProperties[0]);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar$delegate.a(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$0(Function0 function0, View view) {
        z65.h(function0, "$listener");
        function0.invoke();
    }

    public final void changeLoadingProgress(int i) {
        boolean z;
        getProgressBar().setProgress(i);
        ProgressBar progressBar = getProgressBar();
        if (i != 100) {
            z = true;
        } else {
            z = false;
        }
        un3.o(progressBar, z);
    }

    public final void hideError() {
        un3.e(getErrorBadge());
    }

    public final void setOnClickListener(final Function0<Unit> function0) {
        z65.h(function0, "listener");
        getImage().setOnClickListener(new View.OnClickListener() { // from class: r58
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoPreviewViewHolder.setOnClickListener$lambda$0(Function0.this, view);
            }
        });
    }

    public final void showError() {
        un3.k(getErrorBadge());
    }

    public final void showImage(String str) {
        z65.h(str, "path");
        getImage().setClipToOutline(true);
        b.u(getImage()).t(str).G0(getImage());
    }
}
