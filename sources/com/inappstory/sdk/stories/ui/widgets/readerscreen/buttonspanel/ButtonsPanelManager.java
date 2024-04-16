package com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel;

import android.os.Build;
import androidx.appcompat.widget.AppCompatImageView;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.network.NetworkCallback;
import com.inappstory.sdk.network.NetworkClient;
import com.inappstory.sdk.network.Response;
import com.inappstory.sdk.stories.api.models.ShareObject;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPageManager;
import com.inappstory.sdk.utils.StringsUtils;
import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public class ButtonsPanelManager {
    ButtonsPanel panel;
    ReaderPageManager parentManager;
    int storyId;

    /* loaded from: classes3.dex */
    public static abstract class ShareButtonClickCallback implements ButtonClickCallback {
        abstract void onClick();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends NetworkCallback<Response> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ ButtonClickCallback c;

        a(String str, int i, ButtonClickCallback buttonClickCallback) {
            this.a = str;
            this.b = i;
            this.c = buttonClickCallback;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(Response response) {
            ProfilingManager.getInstance().setReady(this.a);
            StoryDownloadManager downloadManager = InAppStoryService.getInstance().getDownloadManager();
            ButtonsPanelManager buttonsPanelManager = ButtonsPanelManager.this;
            Story storyById = downloadManager.getStoryById(buttonsPanelManager.storyId, buttonsPanelManager.parentManager.getStoryType());
            if (storyById != null) {
                storyById.like = Integer.valueOf(this.b);
            }
            ButtonClickCallback buttonClickCallback = this.c;
            if (buttonClickCallback != null) {
                buttonClickCallback.onSuccess(this.b);
            }
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return null;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            ProfilingManager.getInstance().setReady(this.a);
            super.onError(i, str);
            ButtonClickCallback buttonClickCallback = this.c;
            if (buttonClickCallback != null) {
                buttonClickCallback.onError();
            }
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            super.onTimeout();
            ProfilingManager.getInstance().setReady(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends NetworkCallback<Response> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ ButtonClickCallback c;

        b(String str, boolean z, ButtonClickCallback buttonClickCallback) {
            this.a = str;
            this.b = z;
            this.c = buttonClickCallback;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(Response response) {
            ProfilingManager.getInstance().setReady(this.a);
            StoryDownloadManager downloadManager = InAppStoryService.getInstance().getDownloadManager();
            ButtonsPanelManager buttonsPanelManager = ButtonsPanelManager.this;
            Story storyById = downloadManager.getStoryById(buttonsPanelManager.storyId, buttonsPanelManager.parentManager.getStoryType());
            boolean z = !this.b ? 1 : 0;
            if (storyById != null) {
                storyById.favorite = z;
            }
            ButtonClickCallback buttonClickCallback = this.c;
            if (buttonClickCallback != null) {
                buttonClickCallback.onSuccess(z ? 1 : 0);
            }
            if (InAppStoryService.isNotNull()) {
                InAppStoryService.getInstance().getListReaderConnector().storyFavorite(ButtonsPanelManager.this.storyId, z);
            }
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return null;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            ProfilingManager.getInstance().setReady(this.a);
            super.onError(i, str);
            ButtonClickCallback buttonClickCallback = this.c;
            if (buttonClickCallback != null) {
                buttonClickCallback.onError();
            }
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onTimeout() {
            super.onTimeout();
            ProfilingManager.getInstance().setReady(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends NetworkCallback<ShareObject> {
        final /* synthetic */ String a;
        final /* synthetic */ Story b;
        final /* synthetic */ int c;
        final /* synthetic */ ShareButtonClickCallback d;

        c(String str, Story story, int i, ShareButtonClickCallback shareButtonClickCallback) {
            this.a = str;
            this.b = story;
            this.c = i;
            this.d = shareButtonClickCallback;
        }

        @Override // com.inappstory.sdk.network.Callback
        /* renamed from: a */
        public void onSuccess(ShareObject shareObject) {
            ProfilingManager.getInstance().setReady(this.a);
            if (Build.VERSION.SDK_INT >= 22) {
                ScreensManager.getInstance().setTempShareId(null);
                ScreensManager.getInstance().setTempShareStoryId(ButtonsPanelManager.this.storyId);
            } else {
                ScreensManager.getInstance().setOldTempShareId(null);
                ScreensManager.getInstance().setOldTempShareStoryId(ButtonsPanelManager.this.storyId);
            }
            InnerShareData innerShareData = new InnerShareData();
            innerShareData.text = shareObject.getUrl();
            innerShareData.payload = this.b.getSlideEventPayload(this.c);
            ReaderPageManager readerPageManager = ButtonsPanelManager.this.parentManager;
            if (readerPageManager != null) {
                readerPageManager.showShareView(innerShareData);
            }
        }

        @Override // com.inappstory.sdk.network.Callback
        public Type getType() {
            return ShareObject.class;
        }

        @Override // com.inappstory.sdk.network.NetworkCallback
        public void onError(int i, String str) {
            super.onError(i, str);
            ShareButtonClickCallback shareButtonClickCallback = this.d;
            if (shareButtonClickCallback != null) {
                shareButtonClickCallback.onError();
            }
            InAppStoryService inAppStoryService = InAppStoryService.getInstance();
            if (inAppStoryService != null) {
                inAppStoryService.isShareProcess(false);
            }
        }
    }

    public ButtonsPanelManager(ButtonsPanel buttonsPanel) {
        this.panel = buttonsPanel;
    }

    private void likeDislikeClick(ButtonClickCallback buttonClickCallback, boolean z) {
        if (InAppStoryManager.isNull()) {
            return;
        }
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.parentManager.getStoryType());
        String str = null;
        int i = 0;
        if (z) {
            if (storyById.liked()) {
                if (CallbackManager.getInstance().getLikeDislikeStoryCallback() != null) {
                    CallbackManager.getInstance().getLikeDislikeStoryCallback().likeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, false);
                }
            } else {
                if (CallbackManager.getInstance().getLikeDislikeStoryCallback() != null) {
                    CallbackManager.getInstance().getLikeDislikeStoryCallback().likeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, true);
                }
                StatisticManager statisticManager = StatisticManager.getInstance();
                int i2 = storyById.id;
                int i3 = storyById.lastIndex;
                ReaderPageManager readerPageManager = this.parentManager;
                if (readerPageManager != null) {
                    str = readerPageManager.getFeedId();
                }
                statisticManager.sendLikeStory(i2, i3, str);
                i = 1;
            }
        } else if (storyById.disliked()) {
            if (CallbackManager.getInstance().getLikeDislikeStoryCallback() != null) {
                CallbackManager.getInstance().getLikeDislikeStoryCallback().dislikeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, false);
            }
        } else {
            if (CallbackManager.getInstance().getLikeDislikeStoryCallback() != null) {
                CallbackManager.getInstance().getLikeDislikeStoryCallback().dislikeStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, true);
            }
            StatisticManager statisticManager2 = StatisticManager.getInstance();
            int i4 = storyById.id;
            int i5 = storyById.lastIndex;
            ReaderPageManager readerPageManager2 = this.parentManager;
            if (readerPageManager2 != null) {
                str = readerPageManager2.getFeedId();
            }
            statisticManager2.sendDislikeStory(i4, i5, str);
            i = -1;
        }
        NetworkClient.getApi().storyLike(Integer.toString(this.storyId), Integer.valueOf(i)).enqueue(new a(ProfilingManager.getInstance().addTask("api_like"), i, buttonClickCallback));
    }

    public void dislikeClick(ButtonClickCallback buttonClickCallback) {
        likeDislikeClick(buttonClickCallback, false);
    }

    public void favoriteClick(ButtonClickCallback buttonClickCallback) {
        String str;
        if (InAppStoryManager.isNull()) {
            return;
        }
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, this.parentManager.getStoryType());
        boolean z = storyById.favorite;
        if (!z) {
            StatisticManager statisticManager = StatisticManager.getInstance();
            int i = storyById.id;
            int i2 = storyById.lastIndex;
            ReaderPageManager readerPageManager = this.parentManager;
            if (readerPageManager != null) {
                str = readerPageManager.getFeedId();
            } else {
                str = null;
            }
            statisticManager.sendFavoriteStory(i, i2, str);
        }
        if (CallbackManager.getInstance().getFavoriteStoryCallback() != null) {
            CallbackManager.getInstance().getFavoriteStoryCallback().favoriteStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), storyById.lastIndex, !storyById.favorite);
        }
        NetworkClient.getApi().storyFavorite(Integer.toString(this.storyId), Integer.valueOf(!z ? 1 : 0)).enqueue(new b(ProfilingManager.getInstance().addTask("api_favorite"), z, buttonClickCallback));
    }

    public ReaderPageManager getParentManager() {
        return this.parentManager;
    }

    public void likeClick(ButtonClickCallback buttonClickCallback) {
        likeDislikeClick(buttonClickCallback, true);
    }

    public void refreshSoundStatus() {
        ButtonsPanel buttonsPanel = this.panel;
        if (buttonsPanel != null) {
            buttonsPanel.refreshSoundStatus();
        }
    }

    public void removeStoryFromFavorite() {
        ButtonsPanel buttonsPanel = this.panel;
        if (buttonsPanel != null) {
            buttonsPanel.forceRemoveFromFavorite();
        }
    }

    public void setParentManager(ReaderPageManager readerPageManager) {
        this.parentManager = readerPageManager;
    }

    public void setStoryId(int i) {
        this.storyId = i;
    }

    public void shareClick(ShareButtonClickCallback shareButtonClickCallback) {
        Story storyById;
        String str;
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null || inAppStoryService.isShareProcess() || InAppStoryManager.isNull() || (storyById = inAppStoryService.getDownloadManager().getStoryById(this.storyId, this.parentManager.getStoryType())) == null) {
            return;
        }
        int i = storyById.lastIndex;
        StatisticManager statisticManager = StatisticManager.getInstance();
        int i2 = storyById.id;
        int shareType = storyById.shareType(i);
        ReaderPageManager readerPageManager = this.parentManager;
        if (readerPageManager != null) {
            str = readerPageManager.getFeedId();
        } else {
            str = null;
        }
        statisticManager.sendShareStory(i2, i, shareType, str);
        if (CallbackManager.getInstance().getClickOnShareStoryCallback() != null) {
            CallbackManager.getInstance().getClickOnShareStoryCallback().shareClick(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), i);
        }
        if (storyById.isScreenshotShare(i)) {
            this.parentManager.screenshotShare();
            return;
        }
        inAppStoryService.isShareProcess(true);
        if (shareButtonClickCallback != null) {
            shareButtonClickCallback.onClick();
        }
        NetworkClient.getApi().share(Integer.toString(this.storyId), null).enqueue(new c(ProfilingManager.getInstance().addTask("api_share"), storyById, i, shareButtonClickCallback));
    }

    public void soundClick() {
        this.parentManager.changeSoundStatus();
    }

    public void unlockShareButton() {
        AppCompatImageView appCompatImageView;
        ButtonsPanel buttonsPanel = this.panel;
        if (buttonsPanel != null && (appCompatImageView = buttonsPanel.share) != null) {
            appCompatImageView.setClickable(true);
            this.panel.share.setEnabled(true);
        }
    }
}
