package com.inappstory.sdk.stories.ui.list;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.imageloader.RoundedCornerLayout;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.cache.FileLoadProgressCallback;
import com.inappstory.sdk.stories.ui.views.IGetFavoriteListItem;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class StoryFavoriteListItem extends BaseStoryListItem {
    public Integer backgroundColor;
    public ClickCallback callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements e {
        final /* synthetic */ List a;
        final /* synthetic */ int[] b;
        final /* synthetic */ int c;
        final /* synthetic */ d d;

        a(List list, int[] iArr, int i, d dVar) {
            this.a = list;
            this.b = iArr;
            this.c = i;
            this.d = dVar;
        }

        @Override // com.inappstory.sdk.stories.ui.list.StoryFavoriteListItem.e
        public void a(String str) {
            if (InAppStoryService.isNull()) {
                return;
            }
            this.a.add(str);
            int[] iArr = this.b;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i >= this.c) {
                this.d.a(this.a);
                return;
            }
            List<FavoriteImage> favoriteImages = InAppStoryService.getInstance().getFavoriteImages();
            if (favoriteImages != null) {
                int size = favoriteImages.size();
                int i2 = this.b[0];
                if (size > i2) {
                    StoryFavoriteListItem.this.downloadFileAndSendToInterface(favoriteImages.get(i2).getUrl(), this);
                    return;
                }
            }
            StoryFavoriteListItem.this.downloadFileAndSendToInterface("", this);
        }

        @Override // com.inappstory.sdk.stories.ui.list.StoryFavoriteListItem.e
        public void g() {
            if (InAppStoryService.isNull()) {
                return;
            }
            this.a.add(null);
            int[] iArr = this.b;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i >= this.c) {
                this.d.a(this.a);
                return;
            }
            List<FavoriteImage> favoriteImages = InAppStoryService.getInstance().getFavoriteImages();
            if (favoriteImages != null) {
                int size = favoriteImages.size();
                int i2 = this.b[0];
                if (size > i2) {
                    StoryFavoriteListItem.this.downloadFileAndSendToInterface(favoriteImages.get(i2).getUrl(), this);
                    return;
                }
            }
            StoryFavoriteListItem.this.downloadFileAndSendToInterface("", this);
        }
    }

    /* loaded from: classes3.dex */
    class b implements d {
        final /* synthetic */ List a;

        b(List list) {
            this.a = list;
        }

        @Override // com.inappstory.sdk.stories.ui.list.StoryFavoriteListItem.d
        public void a(List<String> list) {
            IGetFavoriteListItem iGetFavoriteListItem = StoryFavoriteListItem.this.getFavoriteListItem;
            if (iGetFavoriteListItem != null && iGetFavoriteListItem.getFavoriteItem() != null) {
                StoryFavoriteListItem storyFavoriteListItem = StoryFavoriteListItem.this;
                storyFavoriteListItem.getFavoriteListItem.setImages(storyFavoriteListItem.itemView, list, this.a, list.size());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d {
        void a(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface e {
        void a(String str);

        void g();
    }

    public StoryFavoriteListItem(@NonNull View view, AppearanceManager appearanceManager) {
        super(view, appearanceManager, true, false);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.baseLayout);
        viewGroup.removeAllViews();
        viewGroup.addView(getDefaultFavoriteCell());
    }

    private void clearImage(AppCompatImageView appCompatImageView) {
        appCompatImageView.setImageBitmap(null);
        appCompatImageView.setBackgroundColor(0);
        appCompatImageView.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadFileAndSendToInterface(String str, e eVar) {
        if (InAppStoryService.isNull()) {
            return;
        }
        Downloader.downloadFileBackground(str, false, InAppStoryService.getInstance().getFastCache(), new c(eVar));
    }

    private void loadFavoriteImages(d dVar, int i) {
        downloadFileAndSendToInterface(InAppStoryService.getInstance().getFavoriteImages().get(0).getUrl(), new a(new ArrayList(), new int[]{0}, i, dVar));
    }

    private void setImage(AppCompatImageView appCompatImageView, FavoriteImage favoriteImage) {
        if (favoriteImage.getImage() != null && InAppStoryService.isNotNull()) {
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ImageLoader.getInstance().displayImage(favoriteImage.getUrl(), -1, appCompatImageView, InAppStoryService.getInstance().getFastCache());
        } else {
            appCompatImageView.setBackgroundColor(favoriteImage.getBackgroundColor());
        }
        appCompatImageView.setVisibility(0);
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bindFavorite() {
        boolean z;
        if (this.getFavoriteListItem != null && InAppStoryService.isNotNull() && this.getFavoriteListItem.getFavoriteItem() != null) {
            int size = InAppStoryService.getInstance().getFavoriteImages().size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add(Integer.valueOf(InAppStoryService.getInstance().getFavoriteImages().get(i).getBackgroundColor()));
            }
            this.getFavoriteListItem.bindFavoriteItem(this.itemView, arrayList, size);
            loadFavoriteImages(new b(arrayList), size);
            return;
        }
        View view = this.itemView;
        int i2 = R.id.outerLayout;
        View findViewById = view.findViewById(i2);
        if (this.manager.getRealHeight(this.itemView.getContext()) != null) {
            findViewById.getLayoutParams().height = this.manager.getRealHeight(this.itemView.getContext()).intValue();
            z = true;
        } else {
            z = false;
        }
        if (this.manager.getRealWidth(this.itemView.getContext()) != null) {
            findViewById.getLayoutParams().width = this.manager.getRealWidth(this.itemView.getContext()).intValue();
            z = true;
        }
        Context context = this.itemView.getContext();
        ((RoundedCornerLayout) this.itemView.findViewById(R.id.container1)).setRadius(this.manager.csListItemRadius(context) / 2);
        ((RoundedCornerLayout) this.itemView.findViewById(R.id.container2)).setRadius(this.manager.csListItemRadius(context) / 2);
        ((RoundedCornerLayout) this.itemView.findViewById(R.id.container3)).setRadius(this.manager.csListItemRadius(context) / 2);
        ((RoundedCornerLayout) this.itemView.findViewById(R.id.container4)).setRadius(this.manager.csListItemRadius(context) / 2);
        if (z) {
            this.itemView.findViewById(i2).requestLayout();
        }
        List<FavoriteImage> favoriteImages = InAppStoryService.getInstance().getFavoriteImages();
        if (favoriteImages.size() > 0) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.image1);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.itemView.findViewById(R.id.image2);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.itemView.findViewById(R.id.image3);
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) this.itemView.findViewById(R.id.image4);
            clearImage(appCompatImageView);
            clearImage(appCompatImageView2);
            clearImage(appCompatImageView3);
            clearImage(appCompatImageView4);
            int size2 = favoriteImages.size();
            if (size2 != 1) {
                if (size2 != 2) {
                    if (size2 != 3) {
                        setImage(appCompatImageView, favoriteImages.get(0));
                        setImage(appCompatImageView2, favoriteImages.get(1));
                        setImage(appCompatImageView3, favoriteImages.get(2));
                        setImage(appCompatImageView4, favoriteImages.get(3));
                        return;
                    }
                    setImage(appCompatImageView, favoriteImages.get(0));
                    setImage(appCompatImageView2, favoriteImages.get(1));
                    setImage(appCompatImageView3, favoriteImages.get(2));
                    return;
                }
                setImage(appCompatImageView, favoriteImages.get(0));
                setImage(appCompatImageView2, favoriteImages.get(1));
                return;
            }
            setImage(appCompatImageView, favoriteImages.get(0));
        }
    }

    protected View getDefaultFavoriteCell() {
        IGetFavoriteListItem iGetFavoriteListItem = this.getFavoriteListItem;
        if (iGetFavoriteListItem != null && iGetFavoriteListItem.getFavoriteItem() != null) {
            return this.getFavoriteListItem.getFavoriteItem();
        }
        return LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.cs_story_list_inner_favorite, (ViewGroup) null, false);
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bindUGC() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements FileLoadProgressCallback {
        final /* synthetic */ e a;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            final /* synthetic */ String a;

            a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a.a(this.a);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a.g();
            }
        }

        c(e eVar) {
            this.a = eVar;
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onError(String str) {
            new Handler(Looper.getMainLooper()).post(new b());
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onSuccess(File file) {
            new Handler(Looper.getMainLooper()).post(new a(file.getAbsolutePath()));
        }

        @Override // com.inappstory.sdk.utils.ProgressCallback
        public void onProgress(long j, long j2) {
        }
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bind(Integer num, String str, Integer num2, String str2, String str3, Integer num3, boolean z, boolean z2, String str4, ClickCallback clickCallback) {
    }
}
