package com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.api.models.StoryLinkObject;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.managers.TimerManager;
import com.inappstory.sdk.stories.outercallbacks.common.reader.ClickAction;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SlideData;
import com.inappstory.sdk.stories.outercallbacks.common.reader.StoryData;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.reader.ReaderManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonsPanelManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.timeline.StoryTimelineManager;
import com.inappstory.sdk.stories.utils.ShowGoodsCallback;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ReaderPageManager {
    ButtonsPanelManager buttonsPanelManager;
    ReaderPageFragment host;
    boolean isPaused;
    ReaderManager parentManager;
    int slideIndex;
    private int storyId;
    StoryTimelineManager timelineManager;
    TimerManager timerManager;
    StoriesViewManager webViewManager;
    List<Integer> durations = new ArrayList();
    boolean currentSlideIsLoaded = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* renamed from: com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPageManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0270a implements ShowGoodsCallback {
            C0270a() {
            }

            @Override // com.inappstory.sdk.stories.utils.ShowGoodsCallback
            public void onEmptyResume(String str) {
                if (ReaderPageManager.this.checkIfManagersIsNull()) {
                    return;
                }
                ReaderPageManager.this.webViewManager.goodsWidgetComplete(str);
            }

            @Override // com.inappstory.sdk.stories.utils.ShowGoodsCallback
            public void onPause() {
                if (ReaderPageManager.this.checkIfManagersIsNull()) {
                    return;
                }
                ReaderPageManager.this.parentManager.pause();
                ReaderPageManager.this.parentManager.unsubscribeClicks();
            }

            @Override // com.inappstory.sdk.stories.utils.ShowGoodsCallback
            public void onResume(String str) {
                if (ReaderPageManager.this.checkIfManagersIsNull()) {
                    return;
                }
                ReaderPageManager.this.parentManager.resume();
                ReaderPageManager.this.parentManager.subscribeClicks();
                ReaderPageManager.this.webViewManager.goodsWidgetComplete(str);
            }
        }

        a(String str, String str2, int i, int i2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReaderPageManager.this.parentManager.showGoods(this.a, this.b, new C0270a(), this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkIfManagersIsNull() {
        if (this.webViewManager != null && this.timerManager != null && this.timelineManager != null && this.buttonsPanelManager != null) {
            return false;
        }
        return true;
    }

    private void tapOnLink(String str) {
        StoryLinkObject storyLinkObject = (StoryLinkObject) JsonParser.fromJson(str, StoryLinkObject.class);
        if (storyLinkObject != null) {
            ClickAction clickAction = ClickAction.STORY_READER_BUTTON;
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType());
            String type = storyLinkObject.getLink().getType();
            type.hashCode();
            if (!type.equals(RemoteMessageConst.Notification.URL)) {
                if (!type.equals("json")) {
                    if (CallbackManager.getInstance().getAppClickCallback() != null) {
                        CallbackManager.getInstance().getAppClickCallback().onAppClick(storyLinkObject.getLink().getType(), storyLinkObject.getLink().getTarget());
                        return;
                    }
                    return;
                } else if (storyLinkObject.getType() != null && !storyLinkObject.getType().isEmpty() && "swipeUpItems".equals(storyLinkObject.getType()) && storyById != null) {
                    showGoods(storyLinkObject.getLink().getTarget(), storyLinkObject.getElementId(), storyById.id, storyById.lastIndex);
                    return;
                } else {
                    return;
                }
            }
            if (storyLinkObject.getType() != null && !storyLinkObject.getType().isEmpty() && "swipeUpLink".equals(storyLinkObject.getType())) {
                clickAction = ClickAction.STORY_READER_SWIPE;
            }
            if (getStoryType() == Story.StoryType.COMMON) {
                OldStatisticManager.getInstance().addLinkOpenStatistic();
            }
            if (CallbackManager.getInstance().getCallToActionCallback() != null) {
                if (storyById != null) {
                    CallbackManager.getInstance().getCallToActionCallback().callToAction(new SlideData(new StoryData(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount()), storyById.lastIndex), storyLinkObject.getLink().getTarget(), clickAction);
                }
            } else if (CallbackManager.getInstance().getUrlClickCallback() != null) {
                CallbackManager.getInstance().getUrlClickCallback().onUrlClick(storyLinkObject.getLink().getTarget());
            } else {
                this.parentManager.defaultTapOnLink(storyLinkObject.getLink().getTarget());
            }
        }
    }

    public void changeCurrentSlide(int i) {
        String str;
        if (checkIfManagersIsNull() || this.durations == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.durations);
        if (arrayList.size() <= i) {
            return;
        }
        this.host.showLoader();
        this.currentSlideIsLoaded = false;
        ProfilingManager profilingManager = ProfilingManager.getInstance();
        profilingManager.addTask("slide_show", this.storyId + "_" + i);
        this.isPaused = false;
        this.timelineManager.setSegment(i);
        this.timerManager.stopTimer();
        this.timerManager.setCurrentDuration((Integer) arrayList.get(i));
        StatisticManager.getInstance().sendCurrentState();
        InAppStoryService.getInstance().getDownloadManager().changePriorityForSingle(this.storyId, this.parentManager.storyType);
        if (getStoryType() == Story.StoryType.COMMON) {
            InAppStoryService inAppStoryService = InAppStoryService.getInstance();
            int i2 = this.storyId;
            ReaderManager readerManager = this.parentManager;
            if (readerManager != null) {
                str = readerManager.getFeedId();
            } else {
                str = null;
            }
            inAppStoryService.sendPageOpenStatistic(i2, i, str);
        }
        loadStoryAndSlide(this.storyId, i);
    }

    public void changeSoundStatus() {
        if (InAppStoryService.isNull()) {
            return;
        }
        InAppStoryService.getInstance().changeSoundStatus();
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null) {
            readerManager.updateSoundStatus();
        }
    }

    public void gameComplete(String str) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.gameComplete(str);
    }

    public String getFeedId() {
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null) {
            return readerManager.getFeedId();
        }
        return null;
    }

    public String getFeedSlug() {
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null) {
            return readerManager.getFeedSlug();
        }
        return null;
    }

    public int getSlideIndex() {
        return this.slideIndex;
    }

    public int getStoryId() {
        return this.storyId;
    }

    public Story.StoryType getStoryType() {
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null) {
            return readerManager.storyType;
        }
        return Story.StoryType.COMMON;
    }

    public void loadStoryAndSlide(int i, int i2) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.loadStory(i, i2);
    }

    public void nextSlide(int i) {
        Story storyById;
        if (checkIfManagersIsNull() || InAppStoryService.isNull() || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType())) == null) {
            return;
        }
        this.timerManager.setTimerDuration(0L);
        int i2 = this.slideIndex;
        if (i2 < storyById.getSlidesCount() - 1) {
            StoriesViewManager storiesViewManager = this.webViewManager;
            if (storiesViewManager == null) {
                return;
            }
            storiesViewManager.stopStory();
            int i3 = i2 + 1;
            storyById.lastIndex = i3;
            this.slideIndex = i3;
            changeCurrentSlide(i3);
            return;
        }
        this.parentManager.nextStory(i);
    }

    public void nextStory(int i) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.timerManager.setTimerDuration(0L);
        this.parentManager.nextStory(i);
    }

    public void openSlideByIndex(int i) {
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType());
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        if (storyById == null) {
            return;
        }
        if (storyById.getSlidesCount() > i) {
            i2 = i;
        }
        storyById.lastIndex = i2;
        if (this.slideIndex != i2) {
            this.slideIndex = i2;
            changeCurrentSlide(i2);
        }
    }

    public void pauseSlide(boolean z) {
        if (checkIfManagersIsNull()) {
            return;
        }
        if (!z && this.isPaused) {
            return;
        }
        this.isPaused = true;
        this.timelineManager.pause();
        if (z) {
            this.timerManager.pauseTimer();
        } else {
            this.timerManager.pauseLocalTimer();
        }
        this.webViewManager.pauseStory();
    }

    public void prevSlide(int i) {
        Story storyById;
        if (checkIfManagersIsNull() || InAppStoryService.isNull() || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType())) == null) {
            return;
        }
        this.timerManager.setTimerDuration(0L);
        int i2 = this.slideIndex;
        if (i2 > 0) {
            StoriesViewManager storiesViewManager = this.webViewManager;
            if (storiesViewManager == null) {
                return;
            }
            storiesViewManager.stopStory();
            int i3 = i2 - 1;
            storyById.lastIndex = i3;
            this.slideIndex = i3;
            changeCurrentSlide(i3);
            return;
        }
        this.parentManager.prevStory(i);
    }

    public void prevStory(int i) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.timerManager.setTimerDuration(0L);
        this.parentManager.prevStory(i);
    }

    public void reloadStory() {
        InAppStoryService.getInstance().getDownloadManager().reloadStory(this.storyId, getStoryType());
    }

    public void removeStoryFromFavorite() {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.buttonsPanelManager.removeStoryFromFavorite();
    }

    public void resetCurrentDuration() {
        Story storyById;
        if (checkIfManagersIsNull() || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType())) == null) {
            return;
        }
        this.durations.clear();
        this.durations.addAll(storyById.durations);
        this.timelineManager.setDurations(this.durations, false);
    }

    public void restartCurrentWithDuration(long j) {
        if (checkIfManagersIsNull()) {
            return;
        }
        int size = this.durations.size();
        int i = this.slideIndex;
        if (size <= i) {
            return;
        }
        this.durations.set(i, Integer.valueOf((int) j));
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null && readerManager.getCurrentStoryId() == this.storyId) {
            restartSlide();
        } else {
            this.timelineManager.setDurations(this.durations, false);
        }
    }

    public void restartSlide() {
        if (checkIfManagersIsNull() || this.durations.size() <= this.slideIndex) {
            return;
        }
        this.timelineManager.setDurations(this.durations, false);
        this.timelineManager.startSegment(this.slideIndex);
        this.timerManager.restartTimer(this.durations.get(this.slideIndex).intValue());
    }

    public void resumeSlide(boolean z) {
        if (checkIfManagersIsNull() || !this.isPaused) {
            return;
        }
        this.isPaused = false;
        this.timelineManager.resume();
        if (z) {
            this.timerManager.resumeTimer();
        } else {
            this.timerManager.resumeLocalTimer();
        }
        this.webViewManager.resumeStory();
    }

    public void screenshotShare() {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.screenshotShare();
    }

    public void sendShowStoryEvents(int i) {
        ReaderManager readerManager = this.parentManager;
        if (readerManager != null) {
            readerManager.sendShowStoryEvents(i);
        }
    }

    public void setButtonsPanelManager(ButtonsPanelManager buttonsPanelManager, int i) {
        buttonsPanelManager.setParentManager(this);
        this.buttonsPanelManager = buttonsPanelManager;
        buttonsPanelManager.setStoryId(i);
    }

    public void setParentManager(ReaderManager readerManager) {
        this.parentManager = readerManager;
    }

    public void setSlideIndex(int i) {
        List<Integer> list;
        if (checkIfManagersIsNull()) {
            return;
        }
        this.slideIndex = i;
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType());
        this.timerManager.stopTimer();
        if (storyById != null && (list = storyById.durations) != null && list.size() > i) {
            this.timerManager.setCurrentDuration(storyById.durations.get(i));
        }
    }

    public void setStoryId(int i) {
        this.storyId = i;
    }

    public void setStoryInfo(Story story) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.timelineManager.setSlidesCount(story.getSlidesCount());
        ArrayList arrayList = new ArrayList();
        this.durations = arrayList;
        List<Integer> list = story.durations;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.timelineManager.setDurations(this.durations, true);
        this.webViewManager.loadStory(story.id, story.lastIndex);
    }

    public void setTimelineManager(StoryTimelineManager storyTimelineManager, int i) {
        this.timelineManager = storyTimelineManager;
    }

    public void setTimerManager(TimerManager timerManager) {
        timerManager.setPageManager(this);
        this.timerManager = timerManager;
    }

    public void setWebViewManager(StoriesViewManager storiesViewManager, int i) {
        storiesViewManager.setPageManager(this);
        storiesViewManager.source = this.parentManager.source;
        this.webViewManager = storiesViewManager;
        storiesViewManager.setStoryId(i);
    }

    public void shareComplete(String str, boolean z) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.shareComplete(str, z);
    }

    public void showGoods(String str, String str2, int i, int i2) {
        new Handler(Looper.getMainLooper()).post(new a(str, str2, i, i2));
    }

    public void showLoader(int i) {
        this.host.showLoaderContainer();
    }

    public void showShareView(InnerShareData innerShareData) {
        if (this.parentManager != null && InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType()) != null) {
            this.parentManager.showShareView(innerShareData, this.storyId, this.slideIndex);
        }
    }

    public void showSingleStory(int i, int i2) {
        this.parentManager.showSingleStory(i, i2);
    }

    public void slideLoadError(int i) {
        ReaderPageFragment readerPageFragment;
        if (this.slideIndex == i && (readerPageFragment = this.host) != null) {
            readerPageFragment.slideLoadError();
        }
    }

    public void slideLoadedInCache(int i) {
        slideLoadedInCache(i, false);
    }

    public void startStoryTimers() {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.isPaused = false;
        this.timelineManager.startSegment(this.slideIndex);
        this.timelineManager.active(true);
        this.timerManager.setCurrentDuration(this.durations.get(this.slideIndex));
        this.timerManager.startCurrentTimer();
    }

    public void stopStory(int i) {
        if (i == this.storyId || checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.stopStory();
        this.timelineManager.active(false);
        this.timerManager.stopTimer();
        this.isPaused = false;
    }

    public void storyClick(String str, int i, boolean z) {
        int dpToPxExt;
        if (checkIfManagersIsNull()) {
            return;
        }
        this.parentManager.storyClick();
        if (str != null && !str.isEmpty()) {
            tapOnLink(str);
            return;
        }
        if (!Sizes.isTablet()) {
            dpToPxExt = Sizes.getScreenSize().x;
        } else {
            dpToPxExt = Sizes.dpToPxExt(400, this.host.getContext());
        }
        double d = i;
        double d2 = dpToPxExt * 0.3d;
        if (d >= d2 && !z) {
            nextSlide(1);
        } else if (d < d2) {
            prevSlide(1);
        }
    }

    void storyInfoLoaded() {
        this.timelineManager.setDurations(InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType()).durations, false);
    }

    public void storyLoadError() {
        ReaderPageFragment readerPageFragment = this.host;
        if (readerPageFragment != null) {
            readerPageFragment.storyLoadError();
        }
    }

    public void storyLoadStart() {
        ReaderPageFragment readerPageFragment = this.host;
        if (readerPageFragment != null) {
            readerPageFragment.storyLoadStart();
        }
    }

    void storyLoaded(int i, int i2) {
        this.webViewManager.storyLoaded(i, i2);
    }

    public void storyLoadedInCache() {
        Story storyById;
        if (checkIfManagersIsNull() || InAppStoryService.isNull() || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType())) == null) {
            return;
        }
        List<Integer> list = storyById.durations;
        if (list != null && !list.isEmpty()) {
            if (this.durations == null) {
                this.durations = new ArrayList();
            }
            this.durations.clear();
            this.durations.addAll(storyById.durations);
            storyById.setSlidesCount(storyById.durations.size());
            if (this.slideIndex < storyById.durations.size()) {
                this.timerManager.setCurrentDuration(storyById.durations.get(this.slideIndex));
            }
        }
        setStoryInfo(storyById);
    }

    public void storyOpen(int i) {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.isPaused = false;
        if (i != this.storyId) {
            this.webViewManager.stopStory();
            this.timerManager.stopTimer();
            this.timelineManager.active(false);
            return;
        }
        this.timelineManager.active(true);
        this.webViewManager.playStory();
        this.webViewManager.resumeStory();
    }

    public void swipeUp() {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.swipeUp();
    }

    public void unlockShareButton() {
        this.buttonsPanelManager.unlockShareButton();
    }

    public void updateSoundStatus() {
        if (checkIfManagersIsNull()) {
            return;
        }
        this.buttonsPanelManager.refreshSoundStatus();
        this.webViewManager.changeSoundStatus();
    }

    public void widgetEvent(String str, String str2) {
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storyId, getStoryType());
        if (storyById != null && CallbackManager.getInstance().getStoryWidgetCallback() != null) {
            CallbackManager.getInstance().getStoryWidgetCallback().widgetEvent(StringsUtils.getNonNull(str), JsonParser.toMap(str2), storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(getFeedSlug()), storyById.getSlidesCount(), storyById.lastIndex, StringsUtils.getNonNull(storyById.tags));
        }
    }

    public void slideLoadedInCache(int i, boolean z) {
        if (this.slideIndex != i || checkIfManagersIsNull()) {
            return;
        }
        this.webViewManager.storyLoaded(this.storyId, i, z);
    }

    public void closeReader() {
    }
}
