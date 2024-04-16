package com.inappstory.sdk.stories.ui.list;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.game.reader.GameStoryData;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.cache.StoryDownloadManager;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.callbacks.OnFavoriteItemClick;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SlideData;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryData;
import com.inappstory.sdk.stories.outercallbacks.storieslist.ListCallback;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.ugc.list.OnUGCItemClick;
import com.inappstory.sdk.ugc.list.UGCListItem;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesAdapter extends RecyclerView.h<BaseStoryListItem> implements ClickCallback {
    ListCallback callback;
    Long clickTimestamp = -1L;
    public Context context;
    OnFavoriteItemClick favoriteItemClick;
    private String feed;
    private String feedID;
    boolean hasFavItem;
    private boolean isFavoriteList;
    private String listID;
    AppearanceManager manager;
    private List<Integer> storiesIds;
    OnUGCItemClick ugcItemClick;
    boolean useFavorite;
    boolean useUGC;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OnFavoriteItemClick onFavoriteItemClick = StoriesAdapter.this.favoriteItemClick;
            if (onFavoriteItemClick != null) {
                onFavoriteItemClick.onClick();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OnUGCItemClick onUGCItemClick = StoriesAdapter.this.ugcItemClick;
            if (onUGCItemClick != null) {
                onUGCItemClick.onClick();
            }
        }
    }

    public StoriesAdapter(Context context, String str, List<Integer> list, AppearanceManager appearanceManager, boolean z, ListCallback listCallback, String str2, String str3, boolean z2, OnFavoriteItemClick onFavoriteItemClick, boolean z3, OnUGCItemClick onUGCItemClick) {
        this.storiesIds = new ArrayList();
        boolean z4 = false;
        this.hasFavItem = false;
        this.context = context;
        this.listID = str;
        this.feed = str2;
        this.storiesIds = list;
        this.feedID = str3;
        this.manager = appearanceManager;
        this.favoriteItemClick = onFavoriteItemClick;
        this.ugcItemClick = onUGCItemClick;
        this.callback = listCallback;
        this.isFavoriteList = z;
        this.useFavorite = z2;
        this.useUGC = z3;
        if (!z && InAppStoryService.isNotNull() && appearanceManager != null && appearanceManager.csHasFavorite() && InAppStoryService.getInstance().getFavoriteImages().size() > 0) {
            z4 = true;
        }
        this.hasFavItem = z4;
        notifyChanges();
    }

    public int getIndexById(int i) {
        List<Integer> list = this.storiesIds;
        if (list == null) {
            return -1;
        }
        return list.indexOf(Integer.valueOf(i)) + (this.useUGC ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        int i;
        int size = this.storiesIds.size();
        int i2 = 0;
        if (!this.storiesIds.isEmpty() && this.hasFavItem) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = size + i;
        if (!this.storiesIds.isEmpty() && this.useUGC) {
            i2 = 1;
        }
        return i3 + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        boolean z = this.useUGC;
        if (z && i == 0) {
            return -2;
        }
        if (this.useFavorite && i == this.storiesIds.size() + (z ? 1 : 0)) {
            return -1;
        }
        int i2 = i - (z ? 1 : 0);
        int i3 = i2 * 10;
        try {
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(i2).intValue(), Story.StoryType.COMMON);
            if (storyById.getVideoUrl() != null) {
                i3 += 5;
            }
            if (storyById.isOpened) {
                return i3 + 2;
            }
            return i3 + 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public List<Integer> getStoriesIds() {
        return this.storiesIds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyChanges() {
        ListCallback listCallback = this.callback;
        if (listCallback != null) {
            listCallback.storiesUpdated(this.storiesIds.size(), this.feed);
        }
    }

    @Override // com.inappstory.sdk.stories.ui.list.ClickCallback
    public void onItemClick(int i) {
        int i2;
        if (InAppStoryService.isNull() || System.currentTimeMillis() - this.clickTimestamp.longValue() < 1500) {
            return;
        }
        int i3 = i - (this.useUGC ? 1 : 0);
        this.clickTimestamp = Long.valueOf(System.currentTimeMillis());
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        StoryDownloadManager downloadManager = inAppStoryService.getDownloadManager();
        int intValue = this.storiesIds.get(i3).intValue();
        Story.StoryType storyType = Story.StoryType.COMMON;
        Story storyById = downloadManager.getStoryById(intValue, storyType);
        if (storyById != null) {
            ListCallback listCallback = this.callback;
            if (listCallback != null) {
                listCallback.itemClick(storyById.id, i3, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), this.isFavoriteList, StringsUtils.getNonNull(this.feed));
            }
            String gameInstanceId = storyById.getGameInstanceId();
            if (gameInstanceId != null) {
                if (!InAppStoryService.isConnected()) {
                    if (CallbackManager.getInstance().getErrorCallback() != null) {
                        CallbackManager.getInstance().getErrorCallback().noConnection();
                        return;
                    }
                    return;
                }
                inAppStoryService.openGameReaderWithGC(this.context, new GameStoryData(storyById.id, 0, storyById.slidesCount, storyById.title, storyById.tags, this.feed, storyType), gameInstanceId);
                storyById.isOpened = true;
                storyById.saveStoryOpened(storyType);
                notifyItemChanged(i);
                notifyChanges();
                return;
            } else if (storyById.deeplink != null) {
                StatisticManager.getInstance().sendDeeplinkStory(storyById.id, storyById.deeplink, this.feedID);
                OldStatisticManager.getInstance().addDeeplinkClickStatistic(storyById.id);
                if (CallbackManager.getInstance().getCallToActionCallback() != null) {
                    CallbackManager.getInstance().getCallToActionCallback().callToAction(new SlideData(new StoryData(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount()), 0), storyById.deeplink, ClickAction.STORY_FEED_DEEPLINK);
                } else if (CallbackManager.getInstance().getUrlClickCallback() != null) {
                    CallbackManager.getInstance().getUrlClickCallback().onUrlClick(storyById.deeplink);
                } else if (!InAppStoryService.isConnected()) {
                    if (CallbackManager.getInstance().getErrorCallback() != null) {
                        CallbackManager.getInstance().getErrorCallback().noConnection();
                        return;
                    }
                    return;
                } else {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(storyById.deeplink));
                        intent.addFlags(268435456);
                        this.context.startActivity(intent);
                    } catch (Exception e) {
                        InAppStoryService.createExceptionLog(e);
                    }
                }
                storyById.isOpened = true;
                storyById.saveStoryOpened(Story.StoryType.COMMON);
                notifyItemChanged(i);
                notifyChanges();
                return;
            } else if (storyById.isHideInReader()) {
                if (CallbackManager.getInstance().getErrorCallback() != null) {
                    CallbackManager.getInstance().getErrorCallback().emptyLinkError();
                    return;
                }
                return;
            }
        } else if (this.callback != null) {
            Story storyById2 = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(i3).intValue(), storyType);
            if (storyById2 != null) {
                this.callback.itemClick(storyById2.id, i3, StringsUtils.getNonNull(storyById2.statTitle), "", 0, false, "");
            } else {
                this.callback.itemClick(this.storiesIds.get(i3).intValue(), i3, "", "", 0, false, "");
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num : this.storiesIds) {
            Story storyById3 = InAppStoryService.getInstance().getDownloadManager().getStoryById(num.intValue(), Story.StoryType.COMMON);
            if (storyById3 == null || !storyById3.isHideInReader()) {
                arrayList.add(num);
            }
        }
        ScreensManager screensManager = ScreensManager.getInstance();
        Context context = this.context;
        String str = this.listID;
        AppearanceManager appearanceManager = this.manager;
        int indexOf = arrayList.indexOf(this.storiesIds.get(i3));
        if (this.isFavoriteList) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        screensManager.openStoriesReader(context, str, appearanceManager, arrayList, indexOf, i2, this.feed, this.feedID, Story.StoryType.COMMON);
    }

    public void refresh(List<Integer> list) {
        this.storiesIds = list;
    }

    public void setFeedID(String str) {
        this.feedID = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull BaseStoryListItem baseStoryListItem, int i) {
        if (baseStoryListItem == null || InAppStoryService.isNull()) {
            return;
        }
        if (baseStoryListItem.isFavorite) {
            baseStoryListItem.bindFavorite();
            baseStoryListItem.itemView.setOnClickListener(new a());
        } else if (baseStoryListItem.isUGC) {
            baseStoryListItem.bindUGC();
            baseStoryListItem.itemView.setOnClickListener(new b());
        } else {
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(i - (this.useUGC ? 1 : 0)).intValue(), Story.StoryType.COMMON);
            if (storyById == null) {
                return;
            }
            baseStoryListItem.bind(Integer.valueOf(storyById.id), storyById.getTitle(), storyById.getTitleColor() != null ? Integer.valueOf(Color.parseColor(storyById.getTitleColor())) : null, storyById.getSource(), (storyById.getImage() == null || storyById.getImage().size() <= 0) ? null : storyById.getProperImage(this.manager.csCoverQuality()).getUrl(), Integer.valueOf(Color.parseColor(storyById.getBackgroundColor())), storyById.isOpened || this.isFavoriteList, storyById.hasAudio().booleanValue(), storyById.getVideoUrl(), this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public BaseStoryListItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2 = i % 10;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cs_story_list_custom_item, viewGroup, false);
        if (i2 == -1) {
            return new StoryFavoriteListItem(inflate, this.manager);
        }
        if (i2 == -2) {
            return new UGCListItem(inflate, this.manager);
        }
        return new StoryListItem(inflate, this.manager, i2 % 5 == 2, i2 > 5);
    }
}
