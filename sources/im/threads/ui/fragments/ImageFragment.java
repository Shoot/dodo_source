package im.threads.ui.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import im.threads.BuildConfig;
import im.threads.R;
import im.threads.business.formatters.RussianFormatSymbols;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.models.FileDescription;
import im.threads.business.utils.FileDownloader;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.FileUtils;
import im.threads.databinding.EccFragmentImageBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.widget.CustomFontTextView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageFragment.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lim/threads/ui/fragments/ImageFragment;", "Lim/threads/ui/fragments/BaseFragment;", "", "applyStyle", "fillData", "Lim/threads/business/models/FileDescription;", "fileDescription", "loadImage", "loadPreview", "loadPreviewToFullImage", "loadFullImage", "Landroid/net/Uri;", "uri", "loadImageFromUri", "showLoader", "initAnimation", "stopAnimation", "getPreviewUri", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lim/threads/databinding/EccFragmentImageBinding;", "binding", "Lim/threads/databinding/EccFragmentImageBinding;", "Lim/threads/business/utils/FileProvider;", "fileProvider$delegate", "Lrn5;", "getFileProvider", "()Lim/threads/business/utils/FileProvider;", "fileProvider", "Lim/threads/ui/ChatStyle;", "style", "Lim/threads/ui/ChatStyle;", "Landroid/view/animation/RotateAnimation;", "rotateAnim", "Landroid/view/animation/RotateAnimation;", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ImageFragment extends BaseFragment {
    public static final Companion Companion = new Companion(null);
    private static SimpleDateFormat hoursMinutesSdf;
    private static SimpleDateFormat sdf;
    private EccFragmentImageBinding binding;
    private final rn5 fileProvider$delegate;
    private final RotateAnimation rotateAnim;
    private final ChatStyle style;

    /* compiled from: ImageFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lim/threads/ui/fragments/ImageFragment$Companion;", "", "()V", "hoursMinutesSdf", "Ljava/text/SimpleDateFormat;", "sdf", "createImageFragment", "Lim/threads/ui/fragments/ImageFragment;", "fileDescription", "Lim/threads/business/models/FileDescription;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ImageFragment createImageFragment(FileDescription fileDescription) {
            ImageFragment imageFragment = new ImageFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("fd", fileDescription);
            imageFragment.setArguments(bundle);
            return imageFragment;
        }
    }

    public ImageFragment() {
        rn5 b;
        b = yn5.b(ImageFragment$special$$inlined$inject$1.INSTANCE);
        this.fileProvider$delegate = b;
        this.style = Config.Companion.getInstance().getChatStyle();
        this.rotateAnim = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
    }

    @SuppressLint({"SimpleDateFormat"})
    private final void applyStyle() {
        SimpleDateFormat simpleDateFormat;
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        androidx.fragment.app.d requireActivity = requireActivity();
        z65.g(requireActivity, "requireActivity()");
        if (sdf == null) {
            hoursMinutesSdf = new SimpleDateFormat("hh:mm", Locale.getDefault());
            if (z65.c(Locale.getDefault().getLanguage(), "ru")) {
                simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", new RussianFormatSymbols());
            } else {
                simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
            }
            sdf = simpleDateFormat;
        }
        eccFragmentImageBinding.getRoot().setBackgroundColor(iu1.c(requireActivity, this.style.imagesScreenBackgroundColor));
        eccFragmentImageBinding.from.setTextColor(iu1.c(requireActivity, this.style.imagesScreenAuthorTextColor));
        eccFragmentImageBinding.date.setTextColor(iu1.c(requireActivity, this.style.imagesScreenDateTextColor));
        eccFragmentImageBinding.from.setTextSize(this.style.imagesScreenAuthorTextSize);
        eccFragmentImageBinding.date.setTextSize(this.style.imagesScreenDateTextSize);
    }

    public static final ImageFragment createImageFragment(FileDescription fileDescription) {
        return Companion.createImageFragment(fileDescription);
    }

    private final void fillData() {
        String str;
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        String str2 = null;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        FileDescription fileDescription = (FileDescription) requireArguments().getParcelable("fd");
        if (fileDescription != null) {
            z65.g(fileDescription, "requireArguments().getPa…provide filedescription\")");
            if (fileDescription.getFrom() != null && !z65.c(fileDescription.getFrom(), "null")) {
                eccFragmentImageBinding.from.setText(fileDescription.getFrom());
            } else {
                eccFragmentImageBinding.from.setText("");
            }
            if (fileDescription.getTimeStamp() != 0) {
                CustomFontTextView customFontTextView = eccFragmentImageBinding.date;
                SimpleDateFormat simpleDateFormat = sdf;
                if (simpleDateFormat != null) {
                    str = simpleDateFormat.format(Long.valueOf(fileDescription.getTimeStamp()));
                } else {
                    str = null;
                }
                String string = getString(R.string.ecc_in);
                SimpleDateFormat simpleDateFormat2 = hoursMinutesSdf;
                if (simpleDateFormat2 != null) {
                    str2 = simpleDateFormat2.format(Long.valueOf(fileDescription.getTimeStamp()));
                }
                customFontTextView.setText(str + " " + string + " " + str2);
            } else {
                eccFragmentImageBinding.date.setText("");
            }
            if (FileUtils.isImage(fileDescription)) {
                loadImage(fileDescription);
                return;
            }
            return;
        }
        throw new IllegalStateException("you must provide filedescription");
    }

    private final FileProvider getFileProvider() {
        return (FileProvider) this.fileProvider$delegate.getValue();
    }

    private final Uri getPreviewUri(FileDescription fileDescription) {
        if (fileDescription != null) {
            FileDownloader.Companion companion = FileDownloader.Companion;
            Context requireContext = requireContext();
            z65.g(requireContext, "requireContext()");
            File file = new File(companion.getDownloadDir(requireContext), FileUtils.generateFileName(fileDescription));
            FileProvider fileProvider = getFileProvider();
            Context requireContext2 = requireContext();
            z65.g(requireContext2, "requireContext()");
            return fileProvider.getUriForFile(requireContext2, file);
        }
        return null;
    }

    private final void initAnimation() {
        if (!BuildConfig.IS_ANIMATIONS_DISABLED.get()) {
            EccFragmentImageBinding eccFragmentImageBinding = this.binding;
            EccFragmentImageBinding eccFragmentImageBinding2 = null;
            if (eccFragmentImageBinding == null) {
                z65.z("binding");
                eccFragmentImageBinding = null;
            }
            eccFragmentImageBinding.loader.setImageResource(R.drawable.ecc_im_loading_themed);
            androidx.fragment.app.d requireActivity = requireActivity();
            EccFragmentImageBinding eccFragmentImageBinding3 = this.binding;
            if (eccFragmentImageBinding3 == null) {
                z65.z("binding");
                eccFragmentImageBinding3 = null;
            }
            ColorsHelper.setTint(requireActivity, eccFragmentImageBinding3.loader, this.style.incomingMessageLoaderColor);
            this.rotateAnim.setDuration(3000L);
            this.rotateAnim.setRepeatCount(-1);
            EccFragmentImageBinding eccFragmentImageBinding4 = this.binding;
            if (eccFragmentImageBinding4 == null) {
                z65.z("binding");
            } else {
                eccFragmentImageBinding2 = eccFragmentImageBinding4;
            }
            eccFragmentImageBinding2.loader.setAnimation(this.rotateAnim);
            this.rotateAnim.start();
        }
    }

    private final void loadFullImage(FileDescription fileDescription) {
        String downloadPath;
        showLoader();
        if (fileDescription.getFileUri() != null) {
            downloadPath = String.valueOf(fileDescription.getFileUri());
        } else {
            downloadPath = fileDescription.getDownloadPath();
        }
        ImageLoader callback = ImageLoader.Companion.get().load(downloadPath).autoRotateWithExif(true).scales(ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.CENTER_INSIDE).errorDrawableResourceId(Integer.valueOf(this.style.imagePlaceholder)).callback(new ImageLoader.ImageLoaderCallback() { // from class: im.threads.ui.fragments.ImageFragment$loadFullImage$1
            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
            public void onBitmapLoaded(Bitmap bitmap) {
                ImageLoader.ImageLoaderCallback.DefaultImpls.onBitmapLoaded(this, bitmap);
            }

            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
            public void onImageLoadError() {
                ImageFragment.this.stopAnimation();
            }

            @Override // im.threads.business.imageLoading.ImageLoader.ImageLoaderCallback
            public void onImageLoaded() {
                ImageFragment.this.stopAnimation();
            }
        });
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        ImageView imageView = eccFragmentImageBinding.image;
        z65.g(imageView, "binding.image");
        callback.into(imageView);
    }

    private final void loadImage(FileDescription fileDescription) {
        if (fileDescription.isFromAssets$threads_release()) {
            loadPreviewToFullImage(fileDescription);
        } else if (fileDescription.getFileUri() != null) {
            loadImageFromUri(fileDescription.getFileUri());
        } else if (fileDescription.getPreviewFileDescription() != null) {
            loadPreview(fileDescription);
            loadFullImage(fileDescription);
        } else {
            EccFragmentImageBinding eccFragmentImageBinding = this.binding;
            if (eccFragmentImageBinding == null) {
                z65.z("binding");
                eccFragmentImageBinding = null;
            }
            eccFragmentImageBinding.image.setImageResource(this.style.imagePlaceholder);
        }
    }

    private final void loadImageFromUri(Uri uri) {
        String str;
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        EccFragmentImageBinding eccFragmentImageBinding2 = null;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        ImageView imageView = eccFragmentImageBinding.preview;
        z65.g(imageView, "binding.preview");
        imageView.setVisibility(8);
        ImageLoader imageLoader = ImageLoader.Companion.get();
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        ImageLoader errorDrawableResourceId = imageLoader.load(str).autoRotateWithExif(true).scales(ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.CENTER_INSIDE).errorDrawableResourceId(Integer.valueOf(this.style.imagePlaceholder));
        EccFragmentImageBinding eccFragmentImageBinding3 = this.binding;
        if (eccFragmentImageBinding3 == null) {
            z65.z("binding");
        } else {
            eccFragmentImageBinding2 = eccFragmentImageBinding3;
        }
        ImageView imageView2 = eccFragmentImageBinding2.image;
        z65.g(imageView2, "binding.image");
        errorDrawableResourceId.into(imageView2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void loadPreview(im.threads.business.models.FileDescription r8) {
        /*
            r7 = this;
            im.threads.databinding.EccFragmentImageBinding r0 = r7.binding
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 != 0) goto Lb
            defpackage.z65.z(r1)
            r0 = r2
        Lb:
            android.widget.ImageView r0 = r0.preview
            java.lang.String r3 = "binding.preview"
            defpackage.z65.g(r0, r3)
            r4 = 0
            r0.setVisibility(r4)
            im.threads.business.models.FileDescription r0 = r8.getPreviewFileDescription()
            android.net.Uri r0 = r7.getPreviewUri(r0)
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L40
            boolean r0 = defpackage.c0b.y(r0)
            if (r0 == 0) goto L2f
            goto L40
        L2f:
            im.threads.business.models.FileDescription r8 = r8.getPreviewFileDescription()
            android.net.Uri r8 = r7.getPreviewUri(r8)
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.toString()
            goto L4a
        L3e:
            r8 = r2
            goto L4a
        L40:
            im.threads.business.models.FileDescription r8 = r8.getPreviewFileDescription()
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.getDownloadPath()
        L4a:
            im.threads.business.imageLoading.ImageLoader$Companion r0 = im.threads.business.imageLoading.ImageLoader.Companion
            im.threads.business.imageLoading.ImageLoader r0 = r0.get()
            im.threads.business.imageLoading.ImageLoader r8 = r0.load(r8)
            r0 = 1
            im.threads.business.imageLoading.ImageLoader r8 = r8.autoRotateWithExif(r0)
            r5 = 2
            android.widget.ImageView$ScaleType[] r5 = new android.widget.ImageView.ScaleType[r5]
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r5[r4] = r6
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r5[r0] = r4
            im.threads.business.imageLoading.ImageLoader r8 = r8.scales(r5)
            im.threads.ui.ChatStyle r0 = r7.style
            int r0 = r0.imagePlaceholder
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            im.threads.business.imageLoading.ImageLoader r8 = r8.errorDrawableResourceId(r0)
            im.threads.databinding.EccFragmentImageBinding r0 = r7.binding
            if (r0 != 0) goto L7c
            defpackage.z65.z(r1)
            goto L7d
        L7c:
            r2 = r0
        L7d:
            android.widget.ImageView r0 = r2.preview
            defpackage.z65.g(r0, r3)
            r8.into(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ImageFragment.loadPreview(im.threads.business.models.FileDescription):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void loadPreviewToFullImage(im.threads.business.models.FileDescription r7) {
        /*
            r6 = this;
            im.threads.databinding.EccFragmentImageBinding r0 = r6.binding
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 != 0) goto Lb
            defpackage.z65.z(r1)
            r0 = r2
        Lb:
            android.widget.ImageView r0 = r0.preview
            java.lang.String r3 = "binding.preview"
            defpackage.z65.g(r0, r3)
            r3 = 8
            r0.setVisibility(r3)
            im.threads.business.models.FileDescription r0 = r7.getPreviewFileDescription()
            android.net.Uri r0 = r6.getPreviewUri(r0)
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.toString()
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 == 0) goto L41
            boolean r0 = defpackage.c0b.y(r0)
            if (r0 == 0) goto L30
            goto L41
        L30:
            im.threads.business.models.FileDescription r7 = r7.getPreviewFileDescription()
            android.net.Uri r7 = r6.getPreviewUri(r7)
            if (r7 == 0) goto L3f
            java.lang.String r7 = r7.toString()
            goto L4b
        L3f:
            r7 = r2
            goto L4b
        L41:
            im.threads.business.models.FileDescription r7 = r7.getPreviewFileDescription()
            if (r7 == 0) goto L3f
            java.lang.String r7 = r7.getDownloadPath()
        L4b:
            im.threads.business.imageLoading.ImageLoader$Companion r0 = im.threads.business.imageLoading.ImageLoader.Companion
            im.threads.business.imageLoading.ImageLoader r0 = r0.get()
            im.threads.business.imageLoading.ImageLoader r7 = r0.load(r7)
            r0 = 1
            im.threads.business.imageLoading.ImageLoader r7 = r7.autoRotateWithExif(r0)
            r3 = 2
            android.widget.ImageView$ScaleType[] r3 = new android.widget.ImageView.ScaleType[r3]
            r4 = 0
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3[r4] = r5
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r3[r0] = r4
            im.threads.business.imageLoading.ImageLoader r7 = r7.scales(r3)
            im.threads.ui.ChatStyle r0 = r6.style
            int r0 = r0.imagePlaceholder
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            im.threads.business.imageLoading.ImageLoader r7 = r7.errorDrawableResourceId(r0)
            im.threads.databinding.EccFragmentImageBinding r0 = r6.binding
            if (r0 != 0) goto L7e
            defpackage.z65.z(r1)
            goto L7f
        L7e:
            r2 = r0
        L7f:
            android.widget.ImageView r0 = r2.image
            java.lang.String r1 = "binding.image"
            defpackage.z65.g(r0, r1)
            r7.into(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ImageFragment.loadPreviewToFullImage(im.threads.business.models.FileDescription):void");
    }

    private final void showLoader() {
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        ImageView imageView = eccFragmentImageBinding.loader;
        z65.g(imageView, "binding.loader");
        imageView.setVisibility(0);
        initAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAnimation() {
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        EccFragmentImageBinding eccFragmentImageBinding2 = null;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        ImageView imageView = eccFragmentImageBinding.preview;
        z65.g(imageView, "binding.preview");
        imageView.setVisibility(8);
        EccFragmentImageBinding eccFragmentImageBinding3 = this.binding;
        if (eccFragmentImageBinding3 == null) {
            z65.z("binding");
        } else {
            eccFragmentImageBinding2 = eccFragmentImageBinding3;
        }
        ImageView imageView2 = eccFragmentImageBinding2.loader;
        z65.g(imageView2, "binding.loader");
        imageView2.setVisibility(8);
        this.rotateAnim.cancel();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        EccFragmentImageBinding inflate = EccFragmentImageBinding.inflate(layoutInflater, viewGroup, false);
        z65.g(inflate, "inflate(inflater, container, false)");
        this.binding = inflate;
        applyStyle();
        fillData();
        EccFragmentImageBinding eccFragmentImageBinding = this.binding;
        if (eccFragmentImageBinding == null) {
            z65.z("binding");
            eccFragmentImageBinding = null;
        }
        FrameLayout root = eccFragmentImageBinding.getRoot();
        z65.g(root, "binding.root");
        return root;
    }
}
