package com.inappstory.sdk.stories.ui.reader;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.d;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.inner.share.InnerShareData;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.callbacks.CallbackManager;
import com.inappstory.sdk.stories.statistic.OldStatisticManager;
import com.inappstory.sdk.stories.statistic.ProfilingManager;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.ScreensManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPageManager;
import com.inappstory.sdk.stories.utils.ShowGoodsCallback;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.utils.StringsUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class ReaderManager {
    private int currentSlideIndex;
    private int currentStoryId;
    private String feedId;
    private String feedSlug;
    public int firstStoryId;
    int lastPos;
    private int lastSentId;
    int latestShowStoryAction;
    private String listID;
    private StoriesFragment parentFragment;
    public int source;
    public int startedSlideInd;
    private List<Integer> storiesIds;
    public Story.StoryType storyType;
    private HashSet<ReaderPageManager> subscribers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.a, Story.StoryType.COMMON);
            if (storyById != null) {
                int slidesCount = storyById.getSlidesCount();
                int i = this.b;
                if (slidesCount <= i) {
                    storyById.lastIndex = 0;
                } else {
                    storyById.lastIndex = i;
                }
            }
            ReaderManager readerManager = ReaderManager.this;
            readerManager.latestShowStoryAction = 4;
            readerManager.parentFragment.setCurrentItem(ReaderManager.this.storiesIds.indexOf(Integer.valueOf(this.a)));
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        final /* synthetic */ int a;

        b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException unused) {
            }
            ReaderManager.this.newStoryTask(this.a);
            if (ReaderManager.this.storiesIds != null && ReaderManager.this.storiesIds.size() > this.a) {
                ReaderManager.this.changeStory();
            }
        }
    }

    public ReaderManager() {
        this.source = 0;
        this.lastSentId = 0;
        this.latestShowStoryAction = 0;
        this.lastPos = -1;
        this.firstStoryId = -1;
        this.subscribers = new HashSet<>();
    }

    private ReaderPageManager getCurrentSubscriber() {
        return getSubscriberByStoryId(this.currentStoryId);
    }

    private ReaderPageManager getSubscriberByStoryId(int i) {
        Iterator<ReaderPageManager> it = this.subscribers.iterator();
        while (it.hasNext()) {
            ReaderPageManager next = it.next();
            if (next.getStoryId() == i) {
                return next;
            }
        }
        return null;
    }

    private void sendStatBlock(boolean z, String str, int i) {
        Story storyById;
        if (InAppStoryService.isNull() || (storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(i, this.storyType)) == null) {
            return;
        }
        StatisticManager.getInstance().sendCurrentState();
        if (z) {
            Story storyById2 = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.storiesIds.get(this.lastPos).intValue(), this.storyType);
            StatisticManager.getInstance().sendCloseStory(storyById2.id, str, Integer.valueOf(storyById2.lastIndex), Integer.valueOf(storyById2.getSlidesCount()), this.feedId);
        }
        StatisticManager.getInstance().sendViewStory(i, str, this.feedId);
        StatisticManager.getInstance().sendOpenStory(i, str, this.feedId);
        StatisticManager.getInstance().createCurrentState(storyById.id, storyById.lastIndex, this.feedId);
    }

    public void addSubscriber(ReaderPageManager readerPageManager) {
        synchronized (this.subscribers) {
            try {
                Iterator<ReaderPageManager> it = this.subscribers.iterator();
                while (it.hasNext()) {
                    if (it.next().getStoryId() == readerPageManager.getStoryId()) {
                        return;
                    }
                }
                this.subscribers.add(readerPageManager);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void changeStory() {
        Story.StoryType storyType = this.storyType;
        Story.StoryType storyType2 = Story.StoryType.COMMON;
        if (storyType == storyType2) {
            OldStatisticManager.getInstance().addStatisticBlock(this.currentStoryId, this.currentSlideIndex);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(this.currentStoryId));
        if (this.storyType == storyType2) {
            OldStatisticManager.getInstance().previewStatisticEvent(arrayList);
        }
        synchronized (this.subscribers) {
            try {
                Iterator<ReaderPageManager> it = this.subscribers.iterator();
                while (it.hasNext()) {
                    ReaderPageManager next = it.next();
                    int storyId = next.getStoryId();
                    int i = this.currentStoryId;
                    if (storyId != i) {
                        next.stopStory(i);
                    } else {
                        next.setSlideIndex(this.currentSlideIndex);
                        next.storyOpen(this.currentStoryId);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cleanFirst() {
        Bundle arguments = this.parentFragment.getArguments();
        arguments.remove("slideIndex");
        this.parentFragment.setArguments(arguments);
        this.startedSlideInd = 0;
        this.firstStoryId = -1;
    }

    public void close() {
        d activity = this.parentFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public void defaultTapOnLink(String str) {
        this.parentFragment.defaultUrlClick(str);
    }

    public void gameComplete(String str, int i, int i2) {
        ReaderPageManager subscriberByStoryId = getSubscriberByStoryId(i);
        if (subscriberByStoryId != null) {
            subscriberByStoryId.gameComplete(str);
        }
    }

    public int getCurrentSlideIndex() {
        return this.currentSlideIndex;
    }

    public int getCurrentStoryId() {
        return this.currentStoryId;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getFeedSlug() {
        return this.feedId;
    }

    public List<Integer> getStoriesIds() {
        return this.storiesIds;
    }

    public void hideGoods() {
        ScreensManager.getInstance().hideGoods();
    }

    void newStoryTask(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (this.storiesIds.size() > 1) {
            if (i == 0) {
                arrayList.add(this.storiesIds.get(i + 1));
            } else if (i == this.storiesIds.size() - 1) {
                arrayList.add(this.storiesIds.get(i - 1));
            } else {
                arrayList.add(this.storiesIds.get(i + 1));
                arrayList.add(this.storiesIds.get(i - 1));
            }
        }
        if (InAppStoryService.isNull()) {
            return;
        }
        InAppStoryService.getInstance().getDownloadManager().changePriority(this.storiesIds.get(i).intValue(), arrayList, this.storyType);
        InAppStoryService.getInstance().getDownloadManager().addStoryTask(this.storiesIds.get(i).intValue(), arrayList, this.storyType);
    }

    public void nextStory(int i) {
        this.parentFragment.nextStory(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPageSelected(int i, int i2) {
        if (InAppStoryService.isNull()) {
            return;
        }
        sendStat(i2, i);
        this.lastPos = i2;
        this.lastSentId = 0;
        this.currentStoryId = this.storiesIds.get(i2).intValue();
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(this.currentStoryId, this.storyType);
        if (storyById != null) {
            if (this.firstStoryId > 0 && this.startedSlideInd > 0) {
                int slidesCount = storyById.getSlidesCount();
                int i3 = this.startedSlideInd;
                if (slidesCount > i3) {
                    storyById.lastIndex = i3;
                }
                cleanFirst();
            }
            ProfilingManager profilingManager = ProfilingManager.getInstance();
            profilingManager.addTask("slide_show", this.currentStoryId + "_" + storyById.lastIndex);
        }
        InAppStoryService.getInstance().getListReaderConnector().changeStory(this.currentStoryId, this.listID);
        if (Sizes.isTablet() && (this.parentFragment.getParentFragment() instanceof StoriesDialogFragment)) {
            ((StoriesDialogFragment) this.parentFragment.getParentFragment()).changeStory(i2);
        }
        InAppStoryService.getInstance().setCurrentId(this.currentStoryId);
        if (storyById != null) {
            this.currentSlideIndex = storyById.lastIndex;
        }
        this.parentFragment.showGuardMask(600);
        new Thread(new b(i2)).start();
    }

    public void pause() {
        StoriesFragment storiesFragment = this.parentFragment;
        if (storiesFragment != null) {
            storiesFragment.pause();
        }
    }

    public void pauseCurrent(boolean z) {
        if (getCurrentSubscriber() != null) {
            getCurrentSubscriber().pauseSlide(z);
        }
        StatisticManager.getInstance().pauseStoryEvent(z);
    }

    public void prevStory(int i) {
        this.parentFragment.prevStory(i);
    }

    public void removeAllStoriesFromFavorite() {
        HashSet<ReaderPageManager> hashSet = this.subscribers;
        if (hashSet == null) {
            return;
        }
        Iterator<ReaderPageManager> it = hashSet.iterator();
        while (it.hasNext()) {
            it.next().removeStoryFromFavorite();
        }
    }

    public void removeStoryFromFavorite(int i) {
        ReaderPageManager subscriberByStoryId = getSubscriberByStoryId(i);
        if (subscriberByStoryId != null) {
            subscriberByStoryId.removeStoryFromFavorite();
        }
    }

    public void removeSubscriber(ReaderPageManager readerPageManager) {
        synchronized (this.subscribers) {
            this.subscribers.remove(readerPageManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restartCurrentStory() {
        ReaderPageManager currentSubscriber = getCurrentSubscriber();
        if (currentSubscriber == null) {
            return;
        }
        currentSubscriber.restartSlide();
    }

    public void resume() {
        StoriesFragment storiesFragment = this.parentFragment;
        if (storiesFragment != null) {
            storiesFragment.resume();
        }
    }

    public void resumeCurrent(boolean z) {
        if (getCurrentSubscriber() != null) {
            getCurrentSubscriber().resumeSlide(z);
        }
        if (z && OldStatisticManager.getInstance() != null) {
            OldStatisticManager.getInstance().refreshTimer();
        }
        StatisticManager.getInstance().resumeStoryEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resumeWithShareId() {
        ReaderPageManager subscriberByStoryId;
        synchronized (this.subscribers) {
            try {
                Iterator<ReaderPageManager> it = this.subscribers.iterator();
                while (it.hasNext()) {
                    it.next().unlockShareButton();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ScreensManager.getInstance().getOldTempShareId() != null) {
            ReaderPageManager subscriberByStoryId2 = getSubscriberByStoryId(ScreensManager.getInstance().getOldTempShareStoryId());
            if (subscriberByStoryId2 != null) {
                subscriberByStoryId2.shareComplete("" + ScreensManager.getInstance().getOldTempShareStoryId(), true);
            }
        } else if (ScreensManager.getInstance().getTempShareId() != null && (subscriberByStoryId = getSubscriberByStoryId(ScreensManager.getInstance().getTempShareStoryId())) != null) {
            subscriberByStoryId.shareComplete("" + ScreensManager.getInstance().getTempShareId(), ScreensManager.getInstance().getTempShareStatus());
        }
        ScreensManager.getInstance().clearShareIds();
    }

    public void sendShowStoryEvents(int i) {
        if (InAppStoryService.getInstance() == null || InAppStoryService.getInstance().getDownloadManager() == null || this.lastSentId == i) {
            return;
        }
        this.lastSentId = i;
        Story storyById = InAppStoryService.getInstance().getDownloadManager().getStoryById(i, this.storyType);
        if (storyById != null && CallbackManager.getInstance().getShowStoryCallback() != null) {
            CallbackManager.getInstance().getShowStoryCallback().showStory(storyById.id, StringsUtils.getNonNull(storyById.statTitle), StringsUtils.getNonNull(storyById.tags), storyById.getSlidesCount(), CallbackManager.getInstance().getSourceFromInt(this.source), CallbackManager.getInstance().getShowStoryActionTypeFromInt(this.latestShowStoryAction));
        }
    }

    void sendStat(int i, int i2) {
        String str;
        int i3 = this.lastPos;
        if (i3 < i && i3 > -1) {
            sendStatBlock(true, StatisticManager.NEXT, this.storiesIds.get(i).intValue());
        } else if (i3 > i && i3 > -1) {
            sendStatBlock(true, StatisticManager.PREV, this.storiesIds.get(i).intValue());
        } else if (i3 == -1) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = StatisticManager.DIRECT;
                    } else {
                        str = StatisticManager.FAVORITE;
                    }
                } else {
                    str = StatisticManager.LIST;
                }
            } else {
                str = StatisticManager.ONBOARDING;
            }
            sendStatBlock(false, str, this.storiesIds.get(i).intValue());
        }
    }

    public void setCurrentSlideIndex(int i) {
        this.currentSlideIndex = i;
    }

    public void setCurrentStoryId(int i) {
        this.currentStoryId = i;
    }

    public void setFeedId(String str) {
        this.feedId = str;
    }

    public void setFeedSlug(String str) {
        this.feedSlug = this.feedSlug;
    }

    public void setParentFragment(StoriesFragment storiesFragment) {
        this.parentFragment = storiesFragment;
    }

    public void setStoriesIds(List<Integer> list) {
        this.storiesIds = list;
    }

    public void shareComplete(boolean z) {
        ScreensManager.getInstance().setTempShareStatus(z);
    }

    public void showGoods(String str, String str2, ShowGoodsCallback showGoodsCallback, int i, int i2) {
        if (this.parentFragment.getActivity() == null) {
            return;
        }
        ScreensManager.getInstance().showGoods(str, this.parentFragment.getActivity(), showGoodsCallback, false, str2, i, i2, this.feedId);
    }

    public void showShareView(InnerShareData innerShareData, int i, int i2) {
        StoriesFragment storiesFragment = this.parentFragment;
        if (storiesFragment != null) {
            storiesFragment.showShareView(innerShareData, i, i2);
            return;
        }
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            inAppStoryService.isShareProcess(false);
        }
    }

    public void showSingleStory(int i, int i2) {
        if (InAppStoryService.isNull()) {
            return;
        }
        if (this.storyType == Story.StoryType.COMMON) {
            OldStatisticManager.getInstance().addLinkOpenStatistic();
        }
        if (this.storiesIds.contains(Integer.valueOf(i))) {
            new Handler(Looper.getMainLooper()).post(new a(i, i2));
            return;
        }
        InAppStoryManager inAppStoryManager = InAppStoryManager.getInstance();
        inAppStoryManager.showStoryWithSlide(i + "", this.parentFragment.getContext(), Integer.valueOf(i2), this.parentFragment.readerSettings, this.storyType, 0, 4);
    }

    public void slideLoadedInCache(int i, int i2) {
        ReaderPageManager subscriberByStoryId = getSubscriberByStoryId(i);
        if (subscriberByStoryId != null) {
            subscriberByStoryId.slideLoadedInCache(i2);
        }
    }

    public void storyClick() {
        this.parentFragment.showGuardMask(300);
    }

    public void subscribeClicks() {
        d activity = this.parentFragment.getActivity();
        if (activity instanceof StoriesActivity) {
            ((StoriesActivity) activity).subscribeClicks();
        }
    }

    public void swipeUp() {
    }

    public void unsubscribeClicks() {
        d activity = this.parentFragment.getActivity();
        if (activity instanceof StoriesActivity) {
            ((StoriesActivity) activity).unsubscribeClicks();
        }
    }

    public void updateSoundStatus() {
        synchronized (this.subscribers) {
            try {
                Iterator<ReaderPageManager> it = this.subscribers.iterator();
                while (it.hasNext()) {
                    it.next().updateSoundStatus();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void swipeUp(int i) {
        ReaderPageManager subscriberByStoryId = getSubscriberByStoryId(this.storiesIds.get(i).intValue());
        if (subscriberByStoryId != null) {
            subscriberByStoryId.swipeUp();
        }
    }

    public ReaderManager(String str, String str2, String str3, Story.StoryType storyType, int i, int i2) {
        this.source = 0;
        this.lastSentId = 0;
        this.latestShowStoryAction = 0;
        this.lastPos = -1;
        this.firstStoryId = -1;
        this.subscribers = new HashSet<>();
        this.listID = str;
        this.feedId = str2;
        this.feedSlug = str3;
        this.storyType = storyType;
        this.source = i;
        this.latestShowStoryAction = i2;
    }

    public void swipeDown() {
    }

    public void swipeLeft() {
    }

    public void swipeRight() {
    }
}
