package im.threads.business.imageLoading;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageModifications.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/imageLoading/ImageModifications;", "", "()V", "CircleCropModification", "MaskedModification", "Lim/threads/business/imageLoading/ImageModifications$CircleCropModification;", "Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ImageModifications {

    /* compiled from: ImageModifications.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lim/threads/business/imageLoading/ImageModifications$CircleCropModification;", "Lim/threads/business/imageLoading/ImageModifications;", "()V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CircleCropModification extends ImageModifications {
        public static final CircleCropModification INSTANCE = new CircleCropModification();

        private CircleCropModification() {
            super(null);
        }
    }

    /* compiled from: ImageModifications.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/imageLoading/ImageModifications$MaskedModification;", "Lim/threads/business/imageLoading/ImageModifications;", "maskDrawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "getMaskDrawable", "()Landroid/graphics/drawable/Drawable;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MaskedModification extends ImageModifications {
        private final Drawable maskDrawable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaskedModification(Drawable drawable) {
            super(null);
            z65.h(drawable, "maskDrawable");
            this.maskDrawable = drawable;
        }

        public final Drawable getMaskDrawable() {
            return this.maskDrawable;
        }
    }

    private ImageModifications() {
    }

    public /* synthetic */ ImageModifications(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
