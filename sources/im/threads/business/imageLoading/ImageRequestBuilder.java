package im.threads.business.imageLoading;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import defpackage.s58;
import im.threads.business.config.BaseConfig;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Metadata;
/* compiled from: ImageRequestBuilder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\u0007R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lim/threads/business/imageLoading/ImageRequestBuilder;", "", "", "Lim/threads/business/imageLoading/ImageModifications;", "transformations", "Lskb;", "getTransformations", "Lim/threads/business/imageLoading/ImageLoader$Config;", "config", "Ls58;", "getLoader", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "getSslImagesLoader", "getPureImagesLoader", "", "photoPath", "", "getRightAngleImage", "Lpi9;", "getImageRequestBuilder", "sslImagesLoader", "Ls58;", "pureImagesLoader", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImageRequestBuilder {
    private s58 pureImagesLoader;
    private s58 sslImagesLoader;

    /* compiled from: ImageRequestBuilder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final s58 getLoader(ImageLoader.Config config) {
        if (config.isImageUnderSsl()) {
            return getSslImagesLoader(config.getContext());
        }
        return getPureImagesLoader(config.getContext());
    }

    private final s58 getPureImagesLoader(Context context) {
        if (this.pureImagesLoader == null) {
            this.pureImagesLoader = new s58.b(context).c(Executors.newCachedThreadPool()).a();
        }
        s58 s58Var = this.pureImagesLoader;
        z65.e(s58Var);
        return s58Var;
    }

    private final float getRightAngleImage(String str) {
        try {
            InputStream openInputStream = BaseConfig.Companion.getInstance().context.getContentResolver().openInputStream(Uri.parse(str));
            z65.e(openInputStream);
            int c = new um3(openInputStream).c("Orientation", 1);
            if (c == 0 || c == 1) {
                return 0.0f;
            }
            if (c != 3) {
                if (c == 6 || c != 8) {
                    return 90.0f;
                }
                return 270.0f;
            }
            return 180.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    private final s58 getSslImagesLoader(Context context) {
        if (this.sslImagesLoader == null) {
            s58.b c = new s58.b(context).c(Executors.newCachedThreadPool());
            b77 okHttpClient = ImageLoaderOkHttpProvider.Companion.getOkHttpClient();
            if (okHttpClient != null) {
                c.b(new a77(okHttpClient));
            }
            this.sslImagesLoader = c.a();
        }
        s58 s58Var = this.sslImagesLoader;
        z65.e(s58Var);
        return s58Var;
    }

    private final List<skb> getTransformations(List<? extends ImageModifications> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ImageModifications imageModifications : list) {
            if (imageModifications instanceof ImageModifications.CircleCropModification) {
                arrayList.add(new CircleTransformation());
            } else if (imageModifications instanceof ImageModifications.MaskedModification) {
                arrayList.add(new MaskedTransformation(((ImageModifications.MaskedModification) imageModifications).getMaskDrawable()));
            }
        }
        return arrayList;
    }

    public final pi9 getImageRequestBuilder(ImageLoader.Config config) {
        pi9 pi9Var;
        List<? extends ImageModifications> U;
        String str;
        z65.h(config, "config");
        String url = config.getUrl();
        if (url != null) {
            if (url.length() == 0) {
                str = "https://noednaurl.com";
            } else {
                str = url;
            }
            pi9Var = getLoader(config).l(str);
            if (config.isAutoRotateWithExif()) {
                z65.e(pi9Var);
                pi9Var.p(getRightAngleImage(url));
            }
        } else {
            pi9Var = null;
        }
        Integer resourceId = config.getResourceId();
        if (resourceId != null) {
            pi9Var = getLoader(config).i(resourceId.intValue());
        }
        File file = config.getFile();
        if (file != null) {
            pi9Var = getLoader(config).k(file);
            if (config.isAutoRotateWithExif()) {
                z65.e(pi9Var);
                String absolutePath = file.getAbsolutePath();
                z65.g(absolutePath, "it.absolutePath");
                pi9Var.p(getRightAngleImage(absolutePath));
            }
        }
        Integer errorDrawableResourceId = config.getErrorDrawableResourceId();
        if (errorDrawableResourceId != null) {
            int intValue = errorDrawableResourceId.intValue();
            if (pi9Var != null) {
                pi9Var.e(intValue);
            }
        }
        Size resizePair = config.getResizePair();
        if (resizePair != null && pi9Var != null) {
            pi9Var.n(resizePair.getWidth(), resizePair.getHeight());
        }
        Size resizeDimen = config.getResizeDimen();
        if (resizeDimen != null && pi9Var != null) {
            pi9Var.o(resizeDimen.getWidth(), resizeDimen.getHeight());
        }
        if (config.isOnlyScaleDown() && pi9Var != null) {
            pi9Var.m();
        }
        if (config.getNoPlaceholder() && pi9Var != null) {
            pi9Var.l();
        }
        ImageModifications[] modifications = config.getModifications();
        if (modifications != null && pi9Var != null) {
            U = yr.U(modifications);
            pi9Var.q(getTransformations(U));
        }
        ImageView.ScaleType[] scales = config.getScales();
        if (scales != null) {
            for (ImageView.ScaleType scaleType : scales) {
                switch (WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        if (pi9Var != null) {
                            pi9Var.f();
                            break;
                        } else {
                            break;
                        }
                    case 5:
                    case 6:
                        if (pi9Var != null) {
                            pi9Var.b();
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (pi9Var != null) {
                            pi9Var.a();
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        if (config.getUrl() == null && config.getFile() == null && config.getResourceId() == null) {
            return null;
        }
        return pi9Var;
    }
}
