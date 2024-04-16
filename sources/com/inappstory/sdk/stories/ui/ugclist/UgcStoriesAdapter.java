package com.inappstory.sdk.stories.ui.ugclist;

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
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SlideData;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryData;
import com.inappstory.sdk.stories.outercallbacks.storieslist.ListCallback;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.list.BaseStoryListItem;
import com.inappstory.sdk.stories.ui.list.ClickCallback;
import com.inappstory.sdk.ugc.list.OnUGCItemClick;
import com.inappstory.sdk.ugc.list.UGCListItem;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class UgcStoriesAdapter extends RecyclerView.h<BaseStoryListItem> implements ClickCallback {
    ListCallback callback;
    Long clickTimestamp = -1L;
    public Context context;
    private String listID;
    AppearanceManager manager;
    private List<Integer> storiesIds;
    OnUGCItemClick ugcItemClick;
    boolean useUGC;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OnUGCItemClick onUGCItemClick = UgcStoriesAdapter.this.ugcItemClick;
            if (onUGCItemClick != null) {
                onUGCItemClick.onClick();
            }
        }
    }

    public UgcStoriesAdapter(Context context, String str, List<Integer> list, AppearanceManager appearanceManager, ListCallback listCallback, boolean z, OnUGCItemClick onUGCItemClick) {
        this.storiesIds = new ArrayList();
        this.context = context;
        this.listID = str;
        this.storiesIds = list;
        this.manager = appearanceManager;
        this.ugcItemClick = onUGCItemClick;
        this.callback = listCallback;
        this.useUGC = z;
    }

    public int getIndexById(int i) {
        List<Integer> list = this.storiesIds;
        if (list == null) {
            return -1;
        }
        return list.indexOf(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        int i;
        int size = this.storiesIds.size();
        if (!this.storiesIds.isEmpty() && this.useUGC) {
            i = 1;
        } else {
            i = 0;
        }
        return size + i;
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
        int i2 = i - (z ? 1 : 0);
        int i3 = i2 * 10;
        try {
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(i2).intValue(), Story.StoryType.UGC);
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

    @Override // com.inappstory.sdk.stories.ui.list.ClickCallback
    public void onItemClick(int i) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null || System.currentTimeMillis() - this.clickTimestamp.longValue() < 1500) {
            return;
        }
        int i2 = i - (this.useUGC ? 1 : 0);
        this.clickTimestamp = Long.valueOf(System.currentTimeMillis());
        StoryDownloadManager downloadManager = inAppStoryService.getDownloadManager();
        int intValue = this.storiesIds.get(i2).intValue();
        Story.StoryType storyType = Story.StoryType.UGC;
        Story storyById = downloadManager.getStoryById(intValue, storyType);
        if (storyById != null) {
            ListCallback listCallback = this.callback;
            if (listCallback != null) {
                listCallback.itemClick(storyById.id, i2, storyById.statTitle, storyById.tags, storyById.getSlidesCount(), false, null);
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
                inAppStoryService.openGameReaderWithGC(this.context, new GameStoryData(storyById.id, 0, storyById.slidesCount, storyById.title, storyById.tags, null, storyType), gameInstanceId);
                return;
            } else if (storyById.deeplink != null) {
                StatisticManager.getInstance().sendDeeplinkStory(storyById.id, storyById.deeplink, null);
                if (CallbackManager.getInstance().getCallToActionCallback() != null) {
                    CallbackManager.getInstance().getCallToActionCallback().callToAction(new SlideData(new StoryData(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount()), 0), storyById.deeplink, ClickAction.UGC_STORY_FEED_DEEPLINK);
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
                storyById.saveStoryOpened(Story.StoryType.UGC);
                notifyItemChanged(i);
                return;
            } else if (storyById.isHideInReader()) {
                if (CallbackManager.getInstance().getErrorCallback() != null) {
                    CallbackManager.getInstance().getErrorCallback().emptyLinkError();
                    return;
                }
                return;
            }
        } else if (this.callback != null) {
            Story storyById2 = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(i2).intValue(), storyType);
            if (storyById2 != null) {
                this.callback.itemClick(storyById2.id, i2, StringsUtils.getNonNull(storyById2.statTitle), "", 0, false, "");
            } else {
                this.callback.itemClick(this.storiesIds.get(i2).intValue(), i2, "", "", 0, false, "");
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num : this.storiesIds) {
            Story storyById3 = InAppStoryService.getInstance().getDownloadManager().getStoryById(num.intValue(), Story.StoryType.UGC);
            if (storyById3 == null || !storyById3.isHideInReader()) {
                arrayList.add(num);
            }
        }
        ScreensManager.getInstance().openStoriesReader(this.context, this.listID, this.manager, arrayList, arrayList.indexOf(this.storiesIds.get(i2)), 4, null, null, Story.StoryType.UGC);
    }

    public void refresh(List<Integer> list) {
        this.storiesIds = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull BaseStoryListItem baseStoryListItem, int i) {
        if (baseStoryListItem == null || InAppStoryService.isNull()) {
            return;
        }
        if (baseStoryListItem.isUGC) {
            baseStoryListItem.bindUGC();
            baseStoryListItem.itemView.setOnClickListener(new a());
            return;
        }
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(i - (this.useUGC ? 1 : 0)).intValue(), Story.StoryType.UGC);
        if (storyById == null) {
            return;
        }
        baseStoryListItem.bind(Integer.valueOf(storyById.id), storyById.getTitle(), storyById.getTitleColor() != null ? Integer.valueOf(Color.parseColor(storyById.getTitleColor())) : null, storyById.getSource(), (storyById.getImage() == null || storyById.getImage().size() <= 0) ? null : storyById.getProperImage(this.manager.csCoverQuality()).getUrl(), Integer.valueOf(Color.parseColor(storyById.getBackgroundColor())), storyById.isOpened, storyById.hasAudio().booleanValue(), storyById.getVideoUrl(), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public BaseStoryListItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2 = i % 10;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cs_story_list_custom_item, viewGroup, false);
        if (i2 == -2) {
            return new UGCListItem(inflate, this.manager);
        }
        return new UgcStoryListItem(inflate, this.manager, i2 % 5 == 2, i2 > 5);
    }
}
