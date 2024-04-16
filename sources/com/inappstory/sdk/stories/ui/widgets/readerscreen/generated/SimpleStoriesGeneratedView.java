package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.api.models.slidestructure.Background;
import com.inappstory.sdk.stories.api.models.slidestructure.Element;
import com.inappstory.sdk.stories.api.models.slidestructure.SlideStructure;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.StoriesViewManager;
import com.inappstory.sdk.stories.utils.Sizes;
import com.inappstory.sdk.stories.utils.ViewAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class SimpleStoriesGeneratedView extends RelativeLayout implements SimpleStoriesView {
    HashMap<View, ValueAnimator> animatorHashMap;
    float coordinate1;
    long lastTap;
    long lastTempTap;
    StoriesViewManager manager;
    ArrayList<View> temp;
    ArrayList<View> temp2;
    ArrayList<GeneratedVideoView> tempVideos;
    boolean touchSlider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            SimpleStoriesGeneratedView simpleStoriesGeneratedView = SimpleStoriesGeneratedView.this;
            if (currentTimeMillis - simpleStoriesGeneratedView.lastTempTap < 300) {
                simpleStoriesGeneratedView.manager.storyClick(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimpleStoriesGeneratedView.this.clearTemp();
            ArrayList<View> arrayList = SimpleStoriesGeneratedView.this.temp2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList<View> arrayList2 = SimpleStoriesGeneratedView.this.temp2;
                arrayList2.get(arrayList2.size() - 1).setVisibility(0);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements SimpleViewCallback {
        c() {
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.SimpleViewCallback
        public void doAction(String str) {
            SimpleStoriesGeneratedView.this.manager.storyClick(str);
        }
    }

    public SimpleStoriesGeneratedView(Context context) {
        super(context);
        this.animatorHashMap = new HashMap<>();
        this.temp = new ArrayList<>();
        this.temp2 = new ArrayList<>();
        this.tempVideos = new ArrayList<>();
        this.touchSlider = false;
        init();
    }

    private void init() {
        StoriesViewManager storiesViewManager = new StoriesViewManager(getContext());
        this.manager = storiesViewManager;
        storiesViewManager.setStoriesView(this);
        setOnClickListener(new a());
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void changeSoundStatus() {
        Iterator<GeneratedVideoView> it = this.tempVideos.iterator();
        while (it.hasNext()) {
            it.next().startPlay();
        }
    }

    public void checkGenerator(CheckGeneratorEvent checkGeneratorEvent) {
        Iterator<View> it = this.temp2.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if ((next instanceof GeneratedViewCallback) && !((GeneratedViewCallback) next).isLoaded()) {
                return;
            }
        }
        new Handler().postDelayed(new b(), 100L);
        this.animatorHashMap.clear();
        Iterator<View> it2 = this.temp2.iterator();
        while (it2.hasNext()) {
            View next2 = it2.next();
            if (next2 instanceof GeneratedImageView) {
                this.animatorHashMap.put(next2, new ViewAnimator().animate(next2, ViewAnimator.SHAKE));
            }
        }
        StoriesViewManager storiesViewManager = this.manager;
        if (storiesViewManager != null) {
            storiesViewManager.storyLoaded(-1);
        }
    }

    void clearTemp() {
        synchronized (this.temp) {
            try {
                Iterator<View> it = this.temp.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    if (next != null) {
                        next.setVisibility(8);
                        removeView(next);
                    }
                }
                this.temp.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((ReaderPager) getParentForAccessibility()).cubeAnimation) {
            return false;
        }
        if (!InAppStoryService.isConnected()) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.coordinate1 = motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public float getCoordinate() {
        return this.coordinate1;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public StoriesViewManager getManager() {
        return this.manager;
    }

    public void initViews(SlideStructure slideStructure) {
        int height;
        int i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            this.temp.add(getChildAt(i2));
            if (getChildAt(i2) instanceof RelativeLayout) {
                getChildAt(i2).setElevation(getChildAt(i2).getElevation() + 2.0f);
            }
        }
        this.temp2.clear();
        this.tempVideos.clear();
        if (slideStructure.elements == null) {
            View relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.setElevation(4.0f);
            addView(relativeLayout);
            checkGenerator(null);
            return;
        }
        int i3 = Sizes.getScreenSize().x;
        int height2 = getHeight();
        float f = height2 * 1.0f;
        float f2 = i3;
        if (f / f2 > 1.548387f) {
            i3 = (int) (f / 1.548387f);
            i = (i3 - Sizes.getScreenSize().x) / 2;
            height = 0;
        } else {
            height2 = (int) (f2 * 1.0f * 1.548387f);
            height = (height2 - getHeight()) / 2;
            i = 0;
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        int i4 = -i;
        int i5 = -height;
        relativeLayout2.setPaddingRelative(i4, i5, i4, i5);
        relativeLayout2.setVisibility(8);
        relativeLayout2.setElevation(4.0f);
        RelativeLayout relativeLayout3 = new RelativeLayout(getContext());
        relativeLayout3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout3.setPaddingRelative(i4, i5, i4, i5);
        relativeLayout2.setElevation(2.0f);
        addView(relativeLayout3);
        addView(relativeLayout2);
        Iterator<Element> it = slideStructure.elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Element next = it.next();
            GeneratedView generate = ElementGenerator.generate(next, getContext(), height2, i3);
            if (generate != null) {
                this.temp2.add(generate.view);
                if (generate.view instanceof GeneratedVideoView) {
                    generate.addView(relativeLayout3);
                    this.tempVideos.add((GeneratedVideoView) generate.view);
                    z = true;
                } else {
                    generate.addView(relativeLayout2);
                }
                ElementGenerator.loadContent(next, generate, new c(), Integer.toString(this.manager.storyId));
            }
        }
        Background background = slideStructure.background;
        if (background != null) {
            if (background.gradient) {
                wp7<String, String> gradientColor = ColorParser.getGradientColor(background.color);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ColorParser.getColor(gradientColor.a, false), ColorParser.getColor(gradientColor.b, false)});
                if (z) {
                    relativeLayout3.setBackground(gradientDrawable);
                } else {
                    relativeLayout2.setBackground(gradientDrawable);
                }
            } else if (z) {
                relativeLayout3.setBackgroundColor(ColorParser.getColor(background.color, false));
            } else {
                relativeLayout2.setBackgroundColor(ColorParser.getColor(background.color, false));
            }
        } else if (z) {
            relativeLayout3.setBackgroundColor(-16777216);
        } else {
            relativeLayout2.setBackgroundColor(-16777216);
        }
        checkGenerator(null);
        this.temp2.add(relativeLayout3);
        this.temp2.add(relativeLayout2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((ReaderPager) getParentForAccessibility()).cubeAnimation) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.lastTempTap = System.currentTimeMillis();
            if (System.currentTimeMillis() - this.lastTap < 1500) {
                return false;
            }
            this.lastTap = System.currentTimeMillis();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.touchSlider = false;
            getParentForAccessibility().requestDisallowInterceptTouchEvent(false);
        }
        if (!onInterceptTouchEvent && !this.touchSlider) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (((ReaderPager) getParentForAccessibility()).cubeAnimation) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && System.currentTimeMillis() - this.lastTap < 1500) {
            return true;
        }
        return onTouchEvent;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void resumeVideo() {
        Iterator<GeneratedVideoView> it = this.tempVideos.iterator();
        while (it.hasNext()) {
            it.next().startPlay();
        }
        for (ValueAnimator valueAnimator : this.animatorHashMap.values()) {
            if (valueAnimator != null) {
                if (valueAnimator.isPaused()) {
                    valueAnimator.resume();
                } else {
                    valueAnimator.start();
                }
            }
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void slidePause() {
        Iterator<GeneratedVideoView> it = this.tempVideos.iterator();
        while (it.hasNext()) {
            it.next().pausePlay();
        }
        for (ValueAnimator valueAnimator : this.animatorHashMap.values()) {
            if (valueAnimator != null) {
                if (!valueAnimator.isPaused()) {
                    valueAnimator.pause();
                }
            } else {
                valueAnimator.cancel();
            }
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void slideStart() {
        Iterator<GeneratedVideoView> it = this.tempVideos.iterator();
        while (it.hasNext()) {
            it.next().startPlay();
        }
        for (ValueAnimator valueAnimator : this.animatorHashMap.values()) {
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                valueAnimator.start();
            }
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void stopVideo() {
        Iterator<GeneratedVideoView> it = this.tempVideos.iterator();
        while (it.hasNext()) {
            it.next().stopPlay();
        }
        for (ValueAnimator valueAnimator : this.animatorHashMap.values()) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    public SimpleStoriesGeneratedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animatorHashMap = new HashMap<>();
        this.temp = new ArrayList<>();
        this.temp2 = new ArrayList<>();
        this.tempVideos = new ArrayList<>();
        this.touchSlider = false;
        init();
    }

    public SimpleStoriesGeneratedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animatorHashMap = new HashMap<>();
        this.temp = new ArrayList<>();
        this.temp2 = new ArrayList<>();
        this.tempVideos = new ArrayList<>();
        this.touchSlider = false;
        init();
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void checkIfClientIsSet() {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void destroyView() {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void freezeUI() {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void restartVideo() {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void screenshotShare() {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void swipeUp() {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void cancelDialog(String str) {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void clearSlide(int i) {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void goodsWidgetComplete(String str) {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void setStoriesView(SimpleStoriesView simpleStoriesView) {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void loadJsApiResponse(String str, String str2) {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void sendDialog(String str, String str2) {
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void shareComplete(String str, boolean z) {
    }
}
