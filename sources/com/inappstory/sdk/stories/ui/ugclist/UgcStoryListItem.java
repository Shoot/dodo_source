package com.inappstory.sdk.stories.ui.ugclist;

import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.imageloader.RoundedCornerLayout;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.cache.FileLoadProgressCallback;
import com.inappstory.sdk.stories.ui.list.BaseStoryListItem;
import com.inappstory.sdk.stories.ui.list.ClickCallback;
import com.inappstory.sdk.stories.ui.video.VideoPlayer;
import com.inappstory.sdk.stories.ui.views.IStoriesListItem;
import java.io.File;
/* loaded from: classes3.dex */
public class UgcStoryListItem extends BaseStoryListItem {
    public Integer backgroundColor;
    protected View border;
    public ClickCallback callback;
    protected AppCompatImageView hasAudioIcon;
    public boolean hasVideo;
    protected AppCompatImageView image;
    public boolean isOpened;
    protected AppCompatTextView source;
    protected VideoPlayer video;

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UgcStoryListItem ugcStoryListItem = UgcStoryListItem.this;
            ClickCallback clickCallback = ugcStoryListItem.callback;
            if (clickCallback != null) {
                clickCallback.onItemClick(ugcStoryListItem.getAbsoluteAdapterPosition());
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements e {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // com.inappstory.sdk.stories.ui.ugclist.UgcStoryListItem.e
        public void a(String str) {
            ImageLoader.getInstance().addLink(this.a, str);
            IStoriesListItem iStoriesListItem = ((BaseStoryListItem) UgcStoryListItem.this).getListItem;
            UgcStoryListItem ugcStoryListItem = UgcStoryListItem.this;
            iStoriesListItem.setImage(ugcStoryListItem.itemView, str, ugcStoryListItem.backgroundColor.intValue());
        }
    }

    /* loaded from: classes3.dex */
    class d implements e {
        d() {
        }

        @Override // com.inappstory.sdk.stories.ui.ugclist.UgcStoryListItem.e
        public void a(String str) {
            ((BaseStoryListItem) UgcStoryListItem.this).getListItem.setVideo(UgcStoryListItem.this.itemView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface e {
        void a(String str);
    }

    public UgcStoryListItem(@NonNull View view, AppearanceManager appearanceManager, boolean z, boolean z2) {
        super(view, appearanceManager, false, false);
        this.isOpened = z;
        this.hasVideo = z2;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.baseLayout);
        viewGroup.removeAllViews();
        if (z2) {
            viewGroup.addView(getDefaultVideoCell());
        } else {
            viewGroup.addView(getDefaultCell());
        }
    }

    private void downloadFileAndSendToInterface(String str, e eVar) {
        if (InAppStoryService.isNull()) {
            return;
        }
        Downloader.downloadFileBackground(str, false, InAppStoryService.getInstance().getFastCache(), new a(eVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(java.lang.Integer r5, java.lang.String r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.Integer r10, boolean r11, boolean r12, java.lang.String r13, com.inappstory.sdk.stories.ui.list.ClickCallback r14) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.stories.ui.ugclist.UgcStoryListItem.bind(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, boolean, boolean, java.lang.String, com.inappstory.sdk.stories.ui.list.ClickCallback):void");
    }

    protected View getDefaultCell() {
        IStoriesListItem iStoriesListItem = this.getListItem;
        if (iStoriesListItem != null) {
            return iStoriesListItem.getView();
        }
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.cs_story_list_inner_item, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.container);
        if (this.manager.csListItemInterface() == null || (this.manager.csListItemInterface().getView() == null && this.manager.csListItemInterface().getVideoView() == null)) {
            if (this.manager.getRealHeight(this.itemView.getContext()) != null) {
                findViewById.getLayoutParams().height = this.manager.getRealHeight(this.itemView.getContext()).intValue();
            }
            if (this.manager.getRealWidth(this.itemView.getContext()) != null) {
                findViewById.getLayoutParams().width = this.manager.getRealWidth(this.itemView.getContext()).intValue();
            }
        }
        RoundedCornerLayout roundedCornerLayout = (RoundedCornerLayout) inflate.findViewById(R.id.item_cv);
        roundedCornerLayout.setBackgroundColor(0);
        roundedCornerLayout.setRadius(this.manager.csListItemRadius(this.itemView.getContext()));
        this.title = (AppCompatTextView) inflate.findViewById(R.id.title);
        this.source = (AppCompatTextView) inflate.findViewById(R.id.source);
        this.hasAudioIcon = (AppCompatImageView) inflate.findViewById(R.id.hasAudio);
        this.image = (AppCompatImageView) inflate.findViewById(R.id.image);
        this.border = inflate.findViewById(R.id.border);
        this.title.setTextSize(0, this.manager.csListItemTitleSize(this.itemView.getContext()));
        this.title.setTextColor(this.manager.csListItemTitleColor());
        this.source.setTextSize(0, this.manager.csListItemSourceSize());
        this.source.setTextColor(this.manager.csListItemSourceColor());
        this.border.getBackground().setColorFilter(this.manager.csListItemBorderColor(), PorterDuff.Mode.SRC_ATOP);
        return inflate;
    }

    protected View getDefaultVideoCell() {
        IStoriesListItem iStoriesListItem = this.getListItem;
        if (iStoriesListItem != null) {
            if (iStoriesListItem.getVideoView() != null) {
                return this.getListItem.getVideoView();
            }
            return this.getListItem.getView();
        }
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.cs_story_list_video_inner_item, (ViewGroup) null, false);
        if (this.manager.csListItemInterface() == null || (this.manager.csListItemInterface().getView() == null && this.manager.csListItemInterface().getVideoView() == null)) {
            View findViewById = inflate.findViewById(R.id.container);
            if (this.manager.getRealHeight(this.itemView.getContext()) != null) {
                findViewById.getLayoutParams().height = this.manager.getRealHeight(this.itemView.getContext()).intValue();
            }
            if (this.manager.getRealWidth(this.itemView.getContext()) != null) {
                findViewById.getLayoutParams().width = this.manager.getRealWidth(this.itemView.getContext()).intValue();
            }
        }
        RoundedCornerLayout roundedCornerLayout = (RoundedCornerLayout) inflate.findViewById(R.id.item_cv);
        roundedCornerLayout.setBackgroundColor(0);
        roundedCornerLayout.setRadius(this.manager.csListItemRadius(this.itemView.getContext()));
        this.title = (AppCompatTextView) inflate.findViewById(R.id.title);
        this.source = (AppCompatTextView) inflate.findViewById(R.id.source);
        this.hasAudioIcon = (AppCompatImageView) inflate.findViewById(R.id.hasAudio);
        this.video = (VideoPlayer) inflate.findViewById(R.id.video);
        this.image = (AppCompatImageView) inflate.findViewById(R.id.image);
        this.border = inflate.findViewById(R.id.border);
        this.title.setTextSize(0, this.manager.csListItemTitleSize(this.itemView.getContext()));
        this.title.setTextColor(this.manager.csListItemTitleColor());
        this.source.setTextSize(0, this.manager.csListItemSourceSize());
        this.source.setTextColor(this.manager.csListItemSourceColor());
        ((GradientDrawable) this.border.getBackground()).setCornerRadius((int) (this.manager.csListItemRadius(this.itemView.getContext()) * 1.25d));
        this.border.getBackground().setColorFilter(this.manager.csListItemBorderColor(), PorterDuff.Mode.SRC_ATOP);
        return inflate;
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bindFavorite() {
    }

    @Override // com.inappstory.sdk.stories.ui.list.BaseStoryListItem
    public void bindUGC() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements FileLoadProgressCallback {
        final /* synthetic */ e a;

        /* renamed from: com.inappstory.sdk.stories.ui.ugclist.UgcStoryListItem$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0266a implements Runnable {
            final /* synthetic */ String a;

            RunnableC0266a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (((BaseStoryListItem) UgcStoryListItem.this).getListItem != null) {
                    a.this.a.a(this.a);
                }
            }
        }

        a(e eVar) {
            this.a = eVar;
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onSuccess(File file) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0266a(file.getAbsolutePath()));
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onError(String str) {
        }

        @Override // com.inappstory.sdk.utils.ProgressCallback
        public void onProgress(long j, long j2) {
        }
    }
}
