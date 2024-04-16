package im.threads.business.imageLoading;

import android.widget.ImageView;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.logger.LoggerEdna;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: LoadImage.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001ay\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"showLog", "", "message", "", "loadImage", "Landroid/widget/ImageView;", "data", "", "scales", "", "Landroid/widget/ImageView$ScaleType;", "errorDrawableResId", "", "modifications", "Lim/threads/business/imageLoading/ImageModifications;", "callback", "Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;", "autoRotateWithExif", "", "isExternalImage", "noPlaceholder", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lim/threads/business/imageLoading/ImageLoader$ImageLoaderCallback;ZZZ)V", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoadImageKt {
    public static final void loadImage(ImageView imageView, Object obj, List<? extends ImageView.ScaleType> list, Integer num, List<? extends ImageModifications> list2, ImageLoader.ImageLoaderCallback imageLoaderCallback, boolean z, boolean z2, boolean z3) {
        ImageLoader imageLoader;
        z65.h(imageView, "<this>");
        Unit unit = null;
        if (obj != null) {
            if (obj instanceof String) {
                imageLoader = ImageLoader.Companion.get().load((String) obj);
            } else if (obj instanceof File) {
                imageLoader = ImageLoader.Companion.get().load((File) obj);
            } else if (obj instanceof Integer) {
                imageLoader = ImageLoader.Companion.get().load(((Number) obj).intValue());
            } else {
                imageLoader = null;
            }
            if (imageLoader != null) {
                if (z2) {
                    imageLoader.disableEdnaSsl();
                }
                if (z3) {
                    imageLoader.noPlaceholder();
                }
                imageLoader.scales(list).errorDrawableResourceId(num).modifications(list2).callback(imageLoaderCallback).autoRotateWithExif(z).into(imageView);
                unit = Unit.a;
            }
            if (unit == null) {
                showLog("Image builder is empty, nothing to load");
            }
            unit = Unit.a;
        }
        if (unit == null) {
            showLog("Image data is empty, nothing to load");
        }
    }

    public static /* synthetic */ void loadImage$default(ImageView imageView, Object obj, List list, Integer num, List list2, ImageLoader.ImageLoaderCallback imageLoaderCallback, boolean z, boolean z2, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 16) != 0) {
            imageLoaderCallback = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        loadImage(imageView, obj, list, num, list2, imageLoaderCallback, z, z2, z3);
    }

    private static final void showLog(String str) {
        LoggerEdna.info(str);
    }
}
