package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.slider.Slider;
import im.threads.R;
import im.threads.ui.views.InterceptTouchFrameLayout;
import im.threads.ui.views.MySwipeRefreshLayout;
import im.threads.ui.views.WelcomeScreen;
import im.threads.ui.views.recordview.VoiceRecordButton;
import im.threads.ui.views.recordview.VoiceRecordView;
import im.threads.ui.views.search.SearchBarView;
import im.threads.ui.views.search.SearchListView;
import im.threads.ui.widget.CustomFontButton;
import im.threads.ui.widget.CustomFontEditText;
import im.threads.ui.widget.CustomFontTextView;
import im.threads.ui.widget.textView.InputQuotedMessageAuthorTextView;
import im.threads.ui.widget.textView.InputQuotedMessageTextView;
import im.threads.ui.widget.textView.ToolbarSubtitleTextView;
import im.threads.ui.widget.textView.ToolbarTitleTextView;
/* loaded from: classes3.dex */
public final class EccFragmentChatBinding {
    @NonNull
    public final ImageButton addAttachment;
    @NonNull
    public final LinearLayout bottomLayout;
    @NonNull
    public final ImageButton chatBackButton;
    @NonNull
    public final FrameLayout chatContent;
    @NonNull
    public final EccChatErrorLayoutBinding chatErrorLayout;
    @NonNull
    public final RecyclerView chatItemsRecycler;
    @NonNull
    public final RelativeLayout chatRoot;
    @NonNull
    public final ToolbarTitleTextView consultName;
    @NonNull
    public final LinearLayout consultTitle;
    @NonNull
    public final ImageButton contentCopy;
    @NonNull
    public final LinearLayout copyControls;
    @NonNull
    public final View delimeter;
    @NonNull
    public final LinearLayout flEmpty;
    @NonNull
    public final CustomFontEditText inputEditView;
    @NonNull
    public final LinearLayout inputLayout;
    @NonNull
    public final ImageButton popupMenuButton;
    @NonNull
    public final ProgressBar progressBar;
    @NonNull
    public final ImageView quoteButtonPlayPause;
    @NonNull
    public final ImageButton quoteClear;
    @NonNull
    public final TextView quoteDuration;
    @NonNull
    public final InputQuotedMessageAuthorTextView quoteHeader;
    @NonNull
    public final ImageView quoteImage;
    @NonNull
    public final LinearLayout quoteLayout;
    @NonNull
    public final ImageButton quotePast;
    @NonNull
    public final Slider quoteSlider;
    @NonNull
    public final InputQuotedMessageTextView quoteText;
    @NonNull
    public final VoiceRecordButton recordButton;
    @NonNull
    public final LinearLayout recordLayout;
    @NonNull
    public final VoiceRecordView recordView;
    @NonNull
    public final ImageButton reply;
    @NonNull
    private final InterceptTouchFrameLayout rootView;
    @NonNull
    public final ImageView scrollDownButton;
    @NonNull
    public final ConstraintLayout scrollDownButtonContainer;
    @NonNull
    public final SearchBarView searchBar;
    @NonNull
    public final SearchListView searchListView;
    @NonNull
    public final CustomFontButton searchMore;
    @NonNull
    public final ImageButton sendMessage;
    @NonNull
    public final ToolbarSubtitleTextView subtitle;
    @NonNull
    public final MySwipeRefreshLayout swipeRefresh;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final View toolbarShadow;
    @NonNull
    public final TextView tvEmptyStateHint;
    @NonNull
    public final CustomFontTextView unreadMsgCount;
    @NonNull
    public final View unreadMsgSticker;
    @NonNull
    public final WelcomeScreen welcome;

    private EccFragmentChatBinding(@NonNull InterceptTouchFrameLayout interceptTouchFrameLayout, @NonNull ImageButton imageButton, @NonNull LinearLayout linearLayout, @NonNull ImageButton imageButton2, @NonNull FrameLayout frameLayout, @NonNull EccChatErrorLayoutBinding eccChatErrorLayoutBinding, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull ToolbarTitleTextView toolbarTitleTextView, @NonNull LinearLayout linearLayout2, @NonNull ImageButton imageButton3, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull CustomFontEditText customFontEditText, @NonNull LinearLayout linearLayout5, @NonNull ImageButton imageButton4, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull ImageButton imageButton5, @NonNull TextView textView, @NonNull InputQuotedMessageAuthorTextView inputQuotedMessageAuthorTextView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout6, @NonNull ImageButton imageButton6, @NonNull Slider slider, @NonNull InputQuotedMessageTextView inputQuotedMessageTextView, @NonNull VoiceRecordButton voiceRecordButton, @NonNull LinearLayout linearLayout7, @NonNull VoiceRecordView voiceRecordView, @NonNull ImageButton imageButton7, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout, @NonNull SearchBarView searchBarView, @NonNull SearchListView searchListView, @NonNull CustomFontButton customFontButton, @NonNull ImageButton imageButton8, @NonNull ToolbarSubtitleTextView toolbarSubtitleTextView, @NonNull MySwipeRefreshLayout mySwipeRefreshLayout, @NonNull Toolbar toolbar, @NonNull View view2, @NonNull TextView textView2, @NonNull CustomFontTextView customFontTextView, @NonNull View view3, @NonNull WelcomeScreen welcomeScreen) {
        this.rootView = interceptTouchFrameLayout;
        this.addAttachment = imageButton;
        this.bottomLayout = linearLayout;
        this.chatBackButton = imageButton2;
        this.chatContent = frameLayout;
        this.chatErrorLayout = eccChatErrorLayoutBinding;
        this.chatItemsRecycler = recyclerView;
        this.chatRoot = relativeLayout;
        this.consultName = toolbarTitleTextView;
        this.consultTitle = linearLayout2;
        this.contentCopy = imageButton3;
        this.copyControls = linearLayout3;
        this.delimeter = view;
        this.flEmpty = linearLayout4;
        this.inputEditView = customFontEditText;
        this.inputLayout = linearLayout5;
        this.popupMenuButton = imageButton4;
        this.progressBar = progressBar;
        this.quoteButtonPlayPause = imageView;
        this.quoteClear = imageButton5;
        this.quoteDuration = textView;
        this.quoteHeader = inputQuotedMessageAuthorTextView;
        this.quoteImage = imageView2;
        this.quoteLayout = linearLayout6;
        this.quotePast = imageButton6;
        this.quoteSlider = slider;
        this.quoteText = inputQuotedMessageTextView;
        this.recordButton = voiceRecordButton;
        this.recordLayout = linearLayout7;
        this.recordView = voiceRecordView;
        this.reply = imageButton7;
        this.scrollDownButton = imageView3;
        this.scrollDownButtonContainer = constraintLayout;
        this.searchBar = searchBarView;
        this.searchListView = searchListView;
        this.searchMore = customFontButton;
        this.sendMessage = imageButton8;
        this.subtitle = toolbarSubtitleTextView;
        this.swipeRefresh = mySwipeRefreshLayout;
        this.toolbar = toolbar;
        this.toolbarShadow = view2;
        this.tvEmptyStateHint = textView2;
        this.unreadMsgCount = customFontTextView;
        this.unreadMsgSticker = view3;
        this.welcome = welcomeScreen;
    }

    @NonNull
    public static EccFragmentChatBinding bind(@NonNull View view) {
        View a;
        View a2;
        View a3;
        View a4;
        int i = R.id.add_attachment;
        ImageButton imageButton = (ImageButton) pyb.a(view, i);
        if (imageButton != null) {
            i = R.id.bottom_layout;
            LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
            if (linearLayout != null) {
                i = R.id.chat_back_button;
                ImageButton imageButton2 = (ImageButton) pyb.a(view, i);
                if (imageButton2 != null) {
                    i = R.id.chat_content;
                    FrameLayout frameLayout = (FrameLayout) pyb.a(view, i);
                    if (frameLayout != null && (a = pyb.a(view, (i = R.id.chatErrorLayout))) != null) {
                        EccChatErrorLayoutBinding bind = EccChatErrorLayoutBinding.bind(a);
                        i = R.id.chatItemsRecycler;
                        RecyclerView recyclerView = (RecyclerView) pyb.a(view, i);
                        if (recyclerView != null) {
                            i = R.id.chat_root;
                            RelativeLayout relativeLayout = (RelativeLayout) pyb.a(view, i);
                            if (relativeLayout != null) {
                                i = R.id.consult_name;
                                ToolbarTitleTextView toolbarTitleTextView = (ToolbarTitleTextView) pyb.a(view, i);
                                if (toolbarTitleTextView != null) {
                                    i = R.id.consult_title;
                                    LinearLayout linearLayout2 = (LinearLayout) pyb.a(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.content_copy;
                                        ImageButton imageButton3 = (ImageButton) pyb.a(view, i);
                                        if (imageButton3 != null) {
                                            i = R.id.copy_controls;
                                            LinearLayout linearLayout3 = (LinearLayout) pyb.a(view, i);
                                            if (linearLayout3 != null && (a2 = pyb.a(view, (i = R.id.delimeter))) != null) {
                                                i = R.id.fl_empty;
                                                LinearLayout linearLayout4 = (LinearLayout) pyb.a(view, i);
                                                if (linearLayout4 != null) {
                                                    i = R.id.input_edit_view;
                                                    CustomFontEditText customFontEditText = (CustomFontEditText) pyb.a(view, i);
                                                    if (customFontEditText != null) {
                                                        i = R.id.input_layout;
                                                        LinearLayout linearLayout5 = (LinearLayout) pyb.a(view, i);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.popup_menu_button;
                                                            ImageButton imageButton4 = (ImageButton) pyb.a(view, i);
                                                            if (imageButton4 != null) {
                                                                i = R.id.progress_bar;
                                                                ProgressBar progressBar = (ProgressBar) pyb.a(view, i);
                                                                if (progressBar != null) {
                                                                    i = R.id.quote_button_play_pause;
                                                                    ImageView imageView = (ImageView) pyb.a(view, i);
                                                                    if (imageView != null) {
                                                                        i = R.id.quote_clear;
                                                                        ImageButton imageButton5 = (ImageButton) pyb.a(view, i);
                                                                        if (imageButton5 != null) {
                                                                            i = R.id.quote_duration;
                                                                            TextView textView = (TextView) pyb.a(view, i);
                                                                            if (textView != null) {
                                                                                i = R.id.quote_header;
                                                                                InputQuotedMessageAuthorTextView inputQuotedMessageAuthorTextView = (InputQuotedMessageAuthorTextView) pyb.a(view, i);
                                                                                if (inputQuotedMessageAuthorTextView != null) {
                                                                                    i = R.id.quote_image;
                                                                                    ImageView imageView2 = (ImageView) pyb.a(view, i);
                                                                                    if (imageView2 != null) {
                                                                                        i = R.id.quote_layout;
                                                                                        LinearLayout linearLayout6 = (LinearLayout) pyb.a(view, i);
                                                                                        if (linearLayout6 != null) {
                                                                                            i = R.id.quote_past;
                                                                                            ImageButton imageButton6 = (ImageButton) pyb.a(view, i);
                                                                                            if (imageButton6 != null) {
                                                                                                i = R.id.quote_slider;
                                                                                                Slider slider = (Slider) pyb.a(view, i);
                                                                                                if (slider != null) {
                                                                                                    i = R.id.quote_text;
                                                                                                    InputQuotedMessageTextView inputQuotedMessageTextView = (InputQuotedMessageTextView) pyb.a(view, i);
                                                                                                    if (inputQuotedMessageTextView != null) {
                                                                                                        i = R.id.record_button;
                                                                                                        VoiceRecordButton voiceRecordButton = (VoiceRecordButton) pyb.a(view, i);
                                                                                                        if (voiceRecordButton != null) {
                                                                                                            i = R.id.recordLayout;
                                                                                                            LinearLayout linearLayout7 = (LinearLayout) pyb.a(view, i);
                                                                                                            if (linearLayout7 != null) {
                                                                                                                i = R.id.record_view;
                                                                                                                VoiceRecordView voiceRecordView = (VoiceRecordView) pyb.a(view, i);
                                                                                                                if (voiceRecordView != null) {
                                                                                                                    i = R.id.reply;
                                                                                                                    ImageButton imageButton7 = (ImageButton) pyb.a(view, i);
                                                                                                                    if (imageButton7 != null) {
                                                                                                                        i = R.id.scroll_down_button;
                                                                                                                        ImageView imageView3 = (ImageView) pyb.a(view, i);
                                                                                                                        if (imageView3 != null) {
                                                                                                                            i = R.id.scroll_down_button_container;
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) pyb.a(view, i);
                                                                                                                            if (constraintLayout != null) {
                                                                                                                                i = R.id.searchBar;
                                                                                                                                SearchBarView searchBarView = (SearchBarView) pyb.a(view, i);
                                                                                                                                if (searchBarView != null) {
                                                                                                                                    i = R.id.searchListView;
                                                                                                                                    SearchListView searchListView = (SearchListView) pyb.a(view, i);
                                                                                                                                    if (searchListView != null) {
                                                                                                                                        i = R.id.search_more;
                                                                                                                                        CustomFontButton customFontButton = (CustomFontButton) pyb.a(view, i);
                                                                                                                                        if (customFontButton != null) {
                                                                                                                                            i = R.id.send_message;
                                                                                                                                            ImageButton imageButton8 = (ImageButton) pyb.a(view, i);
                                                                                                                                            if (imageButton8 != null) {
                                                                                                                                                i = R.id.subtitle;
                                                                                                                                                ToolbarSubtitleTextView toolbarSubtitleTextView = (ToolbarSubtitleTextView) pyb.a(view, i);
                                                                                                                                                if (toolbarSubtitleTextView != null) {
                                                                                                                                                    i = R.id.swipe_refresh;
                                                                                                                                                    MySwipeRefreshLayout mySwipeRefreshLayout = (MySwipeRefreshLayout) pyb.a(view, i);
                                                                                                                                                    if (mySwipeRefreshLayout != null) {
                                                                                                                                                        i = R.id.toolbar;
                                                                                                                                                        Toolbar toolbar = (Toolbar) pyb.a(view, i);
                                                                                                                                                        if (toolbar != null && (a3 = pyb.a(view, (i = R.id.toolbar_shadow))) != null) {
                                                                                                                                                            i = R.id.tv_empty_state_hint;
                                                                                                                                                            TextView textView2 = (TextView) pyb.a(view, i);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                i = R.id.unread_msg_count;
                                                                                                                                                                CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
                                                                                                                                                                if (customFontTextView != null && (a4 = pyb.a(view, (i = R.id.unread_msg_sticker))) != null) {
                                                                                                                                                                    i = R.id.welcome;
                                                                                                                                                                    WelcomeScreen welcomeScreen = (WelcomeScreen) pyb.a(view, i);
                                                                                                                                                                    if (welcomeScreen != null) {
                                                                                                                                                                        return new EccFragmentChatBinding((InterceptTouchFrameLayout) view, imageButton, linearLayout, imageButton2, frameLayout, bind, recyclerView, relativeLayout, toolbarTitleTextView, linearLayout2, imageButton3, linearLayout3, a2, linearLayout4, customFontEditText, linearLayout5, imageButton4, progressBar, imageView, imageButton5, textView, inputQuotedMessageAuthorTextView, imageView2, linearLayout6, imageButton6, slider, inputQuotedMessageTextView, voiceRecordButton, linearLayout7, voiceRecordView, imageButton7, imageView3, constraintLayout, searchBarView, searchListView, customFontButton, imageButton8, toolbarSubtitleTextView, mySwipeRefreshLayout, toolbar, a3, textView2, customFontTextView, a4, welcomeScreen);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccFragmentChatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public InterceptTouchFrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccFragmentChatBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_fragment_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
