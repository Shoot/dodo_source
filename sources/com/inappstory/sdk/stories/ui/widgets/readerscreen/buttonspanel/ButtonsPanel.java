package com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.ui.reader.StoriesReaderSettings;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonsPanelManager;
/* loaded from: classes3.dex */
public class ButtonsPanel extends LinearLayout {
    public AppCompatImageView dislike;
    public AppCompatImageView favorite;
    public AppCompatImageView like;
    ButtonsPanelManager manager;
    public AppCompatImageView share;
    public AppCompatImageView sound;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ButtonsPanel.this.likeClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ButtonsPanel.this.dislikeClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ButtonsPanel.this.favoriteClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ButtonsPanel.this.shareClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ButtonsPanel.this.soundClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements ButtonClickCallback {
        g() {
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onError() {
            ButtonsPanel.this.like.setEnabled(true);
            ButtonsPanel.this.like.setClickable(true);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onSuccess(int i) {
            boolean z;
            boolean z2 = true;
            ButtonsPanel.this.like.setEnabled(true);
            ButtonsPanel.this.like.setClickable(true);
            AppCompatImageView appCompatImageView = ButtonsPanel.this.like;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            appCompatImageView.setActivated(z);
            AppCompatImageView appCompatImageView2 = ButtonsPanel.this.dislike;
            if (i != -1) {
                z2 = false;
            }
            appCompatImageView2.setActivated(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements ButtonClickCallback {
        h() {
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onError() {
            ButtonsPanel.this.dislike.setEnabled(true);
            ButtonsPanel.this.dislike.setClickable(true);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onSuccess(int i) {
            boolean z;
            boolean z2 = true;
            ButtonsPanel.this.dislike.setEnabled(true);
            ButtonsPanel.this.dislike.setClickable(true);
            AppCompatImageView appCompatImageView = ButtonsPanel.this.like;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            appCompatImageView.setActivated(z);
            AppCompatImageView appCompatImageView2 = ButtonsPanel.this.dislike;
            if (i != -1) {
                z2 = false;
            }
            appCompatImageView2.setActivated(z2);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatImageView appCompatImageView = ButtonsPanel.this.favorite;
            if (appCompatImageView != null) {
                appCompatImageView.setEnabled(true);
                ButtonsPanel.this.favorite.setClickable(true);
                ButtonsPanel.this.favorite.setActivated(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements ButtonClickCallback {
        j() {
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onError() {
            ButtonsPanel.this.favorite.setEnabled(true);
            ButtonsPanel.this.favorite.setClickable(true);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onSuccess(int i) {
            boolean z = true;
            ButtonsPanel.this.favorite.setEnabled(true);
            ButtonsPanel.this.favorite.setClickable(true);
            AppCompatImageView appCompatImageView = ButtonsPanel.this.favorite;
            if (i != 1) {
                z = false;
            }
            appCompatImageView.setActivated(z);
        }
    }

    public ButtonsPanel(Context context) {
        super(context);
        init();
    }

    public void dislikeClick() {
        this.dislike.setEnabled(false);
        this.dislike.setClickable(false);
        this.manager.dislikeClick(new h());
    }

    public void favoriteClick() {
        this.favorite.setEnabled(false);
        this.favorite.setClickable(false);
        this.manager.favoriteClick(new j());
    }

    public void forceRemoveFromFavorite() {
        new Handler(Looper.getMainLooper()).post(new i());
    }

    public ButtonsPanelManager getManager() {
        return this.manager;
    }

    public void init() {
        View.inflate(getContext(), R.layout.cs_buttons_panel, this);
        this.manager = new ButtonsPanelManager(this);
        this.like = (AppCompatImageView) findViewById(R.id.likeButton);
        this.dislike = (AppCompatImageView) findViewById(R.id.dislikeButton);
        this.favorite = (AppCompatImageView) findViewById(R.id.favoriteButton);
        this.sound = (AppCompatImageView) findViewById(R.id.soundButton);
        this.share = (AppCompatImageView) findViewById(R.id.shareButton);
        AppCompatImageView appCompatImageView = this.like;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new b());
        }
        AppCompatImageView appCompatImageView2 = this.dislike;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new c());
        }
        AppCompatImageView appCompatImageView3 = this.favorite;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setOnClickListener(new d());
        }
        AppCompatImageView appCompatImageView4 = this.share;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setOnClickListener(new e());
        }
        AppCompatImageView appCompatImageView5 = this.sound;
        if (appCompatImageView5 != null) {
            appCompatImageView5.setOnClickListener(new f());
            this.sound.setActivated(InAppStoryService.getInstance().isSoundOn());
        }
    }

    public void likeClick() {
        this.like.setEnabled(false);
        this.like.setClickable(false);
        this.manager.likeClick(new g());
    }

    public void refreshSoundStatus() {
        this.sound.setActivated(InAppStoryService.getInstance().isSoundOn());
    }

    public void setButtonsStatus(int i2, int i3) {
        boolean z;
        boolean z2;
        AppCompatImageView appCompatImageView = this.like;
        boolean z3 = false;
        if (appCompatImageView != null) {
            if (i2 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            appCompatImageView.setActivated(z2);
        }
        AppCompatImageView appCompatImageView2 = this.dislike;
        if (appCompatImageView2 != null) {
            if (i2 == -1) {
                z = true;
            } else {
                z = false;
            }
            appCompatImageView2.setActivated(z);
        }
        AppCompatImageView appCompatImageView3 = this.favorite;
        if (appCompatImageView3 != null) {
            if (i3 == 1) {
                z3 = true;
            }
            appCompatImageView3.setActivated(z3);
        }
    }

    public void setButtonsVisibility(StoriesReaderSettings storiesReaderSettings, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z7 = true;
        if (z && storiesReaderSettings.hasLike) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z2 && storiesReaderSettings.hasFavorite) {
            z6 = true;
        } else {
            z6 = false;
        }
        z7 = (z3 && storiesReaderSettings.hasShare) ? false : false;
        AppCompatImageView appCompatImageView = this.like;
        if (z5) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        appCompatImageView.setVisibility(i2);
        AppCompatImageView appCompatImageView2 = this.dislike;
        if (z5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        appCompatImageView2.setVisibility(i3);
        AppCompatImageView appCompatImageView3 = this.favorite;
        if (z6) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        appCompatImageView3.setVisibility(i4);
        AppCompatImageView appCompatImageView4 = this.share;
        if (z7) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        appCompatImageView4.setVisibility(i5);
        AppCompatImageView appCompatImageView5 = this.sound;
        if (z4) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        appCompatImageView5.setVisibility(i6);
        this.sound.setActivated(InAppStoryService.getInstance().isSoundOn());
        if (!z6 && !z5 && !z7 && !z4) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public void setIcons(StoriesReaderSettings storiesReaderSettings) {
        this.like.setImageDrawable(getResources().getDrawable(storiesReaderSettings.likeIcon));
        this.dislike.setImageDrawable(getResources().getDrawable(storiesReaderSettings.dislikeIcon));
        this.favorite.setImageDrawable(getResources().getDrawable(storiesReaderSettings.favoriteIcon));
        this.share.setImageDrawable(getResources().getDrawable(storiesReaderSettings.shareIcon));
        this.sound.setImageDrawable(getResources().getDrawable(storiesReaderSettings.soundIcon));
    }

    public void shareClick() {
        this.share.setEnabled(false);
        this.share.setClickable(false);
        this.manager.shareClick(new a());
    }

    public void soundClick() {
        this.manager.soundClick();
    }

    public ButtonsPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ButtonsPanel(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ButtonsPanelManager.ShareButtonClickCallback {
        a() {
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonsPanelManager.ShareButtonClickCallback
        void onClick() {
            ButtonsPanel.this.manager.getParentManager().pauseSlide(false);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onError() {
            ButtonsPanel.this.share.setEnabled(true);
            ButtonsPanel.this.share.setClickable(true);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.buttonspanel.ButtonClickCallback
        public void onSuccess(int i) {
        }
    }
}
