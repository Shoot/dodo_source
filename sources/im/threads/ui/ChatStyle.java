package im.threads.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.business.config.BaseConfig;
import im.threads.business.markdown.MarkdownConfig;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class ChatStyle implements Serializable {
    public int approveRequestToResolveThreadTextResId;
    public int attachmentBottomSheetButtonTintResId;
    public int attachmentCameraIconResId;
    public int attachmentDoneIconResId;
    public int attachmentFileIconResId;
    public int attachmentGalleryIconResId;
    public int attachmentIconResId;
    public int attachmentSendIconResId;
    public int binarySurveyDislikeSelectedIconResId;
    public int binarySurveyDislikeUnselectedIconResId;
    public int binarySurveyLikeSelectedIconResId;
    public int binarySurveyLikeUnselectedIconResId;
    public int bubbleIncomingMarginBottom;
    public int bubbleIncomingMarginLeft;
    public int bubbleIncomingMarginRight;
    public int bubbleIncomingMarginTop;
    public int bubbleIncomingPaddingBottom;
    public int bubbleIncomingPaddingLeft;
    public int bubbleIncomingPaddingRight;
    public int bubbleIncomingPaddingTop;
    public String bubbleMessageFont;
    public int bubbleOutgoingMarginBottom;
    public int bubbleOutgoingMarginLeft;
    public int bubbleOutgoingMarginRight;
    public int bubbleOutgoingMarginTop;
    public int bubbleOutgoingPaddingBottom;
    public int bubbleOutgoingPaddingLeft;
    public int bubbleOutgoingPaddingRight;
    public int bubbleOutgoingPaddingTop;
    public String bubbleTimeFont;
    public boolean canShowSpecialistInfo;
    public int chatBackgroundColor;
    public int[] chatBodyIconsColorState;
    public int chatBodyIconsTint;
    public int chatDisabledTextColor;
    public int chatErrorScreenButtonTextColorResId;
    public int chatErrorScreenButtonTextResId;
    public int chatErrorScreenButtonTextSizeResId;
    public ColorStateList chatErrorScreenButtonTintColorList;
    public int chatErrorScreenImageResId;
    public int chatErrorScreenMessageTextColorResId;
    public int chatErrorScreenMessageTextSizeResId;
    public int chatHighlightingColor;
    public int chatMessageInputColor;
    public int chatMessageInputHintTextColor;
    public int chatStatusBarColorResId;
    public boolean chatSubtitleShowOrgUnit;
    public int chatSubtitleTextResId;
    public int chatSystemMessageTextColor;
    public int chatTitleTextResId;
    public int chatToolbarBackIconResId;
    public int chatToolbarColorResId;
    public int chatToolbarContentCopyIconResId;
    public int chatToolbarContextMenuColorResId;
    public int chatToolbarHintTextColor;
    public int chatToolbarInverseIconTintResId;
    public int chatToolbarPopUpMenuIconResId;
    public int chatToolbarReplyIconResId;
    public int chatToolbarTextColorResId;
    public int completedIconResId;
    public int consultSearchingProgressColor;
    public int defPushIconResId;
    public int defTitleResId;
    public String defaultFontBold;
    public String defaultFontLight;
    public String defaultFontRegular;
    public int defaultOperatorAvatar;
    public int denyRequestToResolveThreadTextResId;
    public int downloadButtonBackgroundTintResId;
    public int downloadButtonTintResId;
    public int emptyStateBackgroundColorResId;
    public int emptyStateHintColorResId;
    public int emptyStateProgressBarColorResId;
    public int errorMessageTextColor;
    public int fileBrowserDialogStyleResId;
    public int fixedChatSubtitle;
    public int fixedChatTitle;
    public int iconsAndSeparatorsColor;
    public float imageBubbleSize;
    public int imagePlaceholder;
    public int imagesScreenAuthorTextColor;
    public int imagesScreenAuthorTextSize;
    public int imagesScreenBackgroundColor;
    public int imagesScreenDateTextColor;
    public int imagesScreenDateTextSize;
    public int inProgressIconResId;
    public int incomingDelimitersColor;
    public int incomingImageBottomBorderSize;
    public int incomingImageBubbleMask;
    public int incomingImageLeftBorderSize;
    public int incomingImageRightBorderSize;
    public int incomingImageTimeBackgroundColor;
    public int incomingImageTimeColor;
    public int incomingImageTopBorderSize;
    private MarkdownConfig incomingMarkdownConfiguration;
    public int incomingMessageBubbleBackground;
    public int incomingMessageBubbleColor;
    public int incomingMessageLinkColor;
    public int incomingMessageLoaderColor;
    public int incomingMessageTextColor;
    public int incomingMessageTimeColor;
    public int incomingMessageTimeTextSize;
    public int incomingPlayPauseButtonColor;
    public int inputBackground;
    public boolean inputEnabledDuringQuickReplies;
    public int inputFieldMarginBottom;
    public int inputFieldMarginLeft;
    public int inputFieldMarginRight;
    public int inputFieldMarginTop;
    public int inputFieldPaddingBottom;
    public int inputFieldPaddingLeft;
    public int inputFieldPaddingRight;
    public int inputFieldPaddingTop;
    public int inputHeight;
    public int inputHint;
    public int inputIconTintResId;
    public String inputQuotedMessageAuthorFont;
    public String inputQuotedMessageFont;
    public int inputTextColor;
    public String inputTextFont;
    public int isChatSubtitleVisible;
    public int isChatTitleShadowVisible;
    public boolean isToolbarTextCentered;
    public int loadedAttachmentSettingsErrorText;
    public int loadedSettingsErrorText;
    public int loaderTextResId;
    public int loaderTintResId;
    public int maxGalleryImagesCount;
    public int maxGalleryImagesCountFixedBySystem;
    public int menuItemTextColorResId;
    public int messageDeliveredIconColorResId;
    public int messageDeliveredIconResId;
    public int messageEditedIconColorResId;
    public int messageEditedIconResId;
    public int messageFailedIconColorResId;
    public int messageFailedIconResId;
    public String messageHeaderFont;
    public int messageNotSentBubbleBackgroundColor;
    public int messageNotSentErrorImageColor;
    public int messageReadIconColorResId;
    public int messageReadIconResId;
    public int messageSendingIconColorResId;
    public int messageSendingIconResId;
    public int messageSentIconColorResId;
    public int messageSentIconResId;
    public int notificationQuickReplyMessageBackgroundColor;
    public int notificationQuickReplyMessageTextColor;
    public int nougatPushAccentColorResId;
    public int operatorAvatarSize;
    public int operatorSystemAvatarSize;
    public int optionsSurveySelectedIconResId;
    public int optionsSurveyUnselectedIconResId;
    public int outgoingDelimitersColor;
    public int outgoingImageBottomBorderSize;
    public int outgoingImageBubbleMask;
    public int outgoingImageLeftBorderSize;
    public int outgoingImageRightBorderSize;
    public int outgoingImageTimeBackgroundColor;
    public int outgoingImageTimeColor;
    public int outgoingImageTopBorderSize;
    private MarkdownConfig outgoingMarkdownConfiguration;
    public int outgoingMessageBubbleBackground;
    public int outgoingMessageBubbleColor;
    public int outgoingMessageLinkColor;
    public int outgoingMessageLoaderColor;
    public int outgoingMessageTextColor;
    public int outgoingMessageTimeColor;
    public int outgoingMessageTimeTextSize;
    public int outgoingPlayPauseButtonColor;
    public String placeholderSubtitleFont;
    public String placeholderTitleFont;
    public int previewPlayPauseButtonColor;
    public int pushBackgroundColorResId;
    public int quickReplyButtonBackground;
    public int quickReplyTextColor;
    public int quoteAttachmentIconResId;
    public String quoteAuthorFont;
    public int quoteClearIconResId;
    public int quoteClearIconTintResId;
    public int quoteHeaderTextColor;
    public String quoteMessageFont;
    public int quoteTextTextColor;
    public String quoteTimeFont;
    public int requestToResolveThreadTextResId;
    public String scheduleAlertFont;
    public int scheduleMessageIconResId;
    public int scheduleMessageTextColorResId;
    public boolean scrollChatToEndIfUserTyping;
    public int scrollDownBackgroundResId;
    public int scrollDownButtonElevation;
    public int scrollDownButtonHeight;
    public int scrollDownButtonMargin;
    public int scrollDownButtonWidth;
    public int scrollDownIconResId;
    public int searchBarTextColor;
    public int searchClearIconDrawable;
    public int searchClearIconTintColor;
    public int searchEnabled;
    public int searchIconResId;
    public int searchLoaderColorTint;
    public int searchMessageHintText;
    public int searchResultNoItemsImageDrawable;
    public int searchResultNoItemsText;
    public int searchResultNoItemsTextColor;
    public int searchResultsDividerColor;
    public int searchResultsItemDateTextColor;
    public int searchResultsItemMessageTextColor;
    public int searchResultsItemNameTextColor;
    public int searchResultsItemRightArrowDrawable;
    public int searchResultsItemRightArrowTintColor;
    public int sendMessageIconResId;
    public boolean showBackButton;
    public boolean showConsultSearching;
    public String specialistConnectSubtitleFont;
    public String specialistConnectTitleFont;
    public int startDownloadIconResId;
    public int surveyChoicesTextColorResId;
    public int surveyFinalColorFilterResId;
    public int surveySelectedColorFilterResId;
    public int surveyTextColorResId;
    public int surveyUnselectedColorFilterResId;
    public String systemMessageFont;
    public int systemMessageLeftRightPadding;
    public int systemMessageLinkColor;
    public int systemMessageTextColorResId;
    public int systemMessageTextGravity;
    public int systemMessageTextSize;
    public int threadsRecordButtonBackground;
    public int threadsRecordButtonBackgroundColor;
    public int threadsRecordButtonIcon;
    public int threadsRecordButtonIconColor;
    public int threadsRecordButtonSmallMicColor;
    public int threadsSwipeRefreshColors;
    public int toastBackgroundColor;
    public int toastTextColor;
    public int toastTextSize;
    public String toolbarSubtitleFont;
    public String toolbarTitleFont;
    public String typingFont;
    public int unreadMsgCountTextColorResId;
    public int unreadMsgStickerColorResId;
    public boolean voiceMessageEnabled;
    public int voiceMessagePauseButton;
    public int voiceMessagePlayButton;
    public int welcomeScreenLogoHeight;
    public int welcomeScreenLogoResId;
    public int welcomeScreenLogoWidth;
    public int welcomeScreenSubtitleSizeInSp;
    public int welcomeScreenSubtitleTextColorResId;
    public int welcomeScreenSubtitleTextResId;
    public int welcomeScreenTitleSizeInSp;
    public int welcomeScreenTitleTextColorResId;
    public int welcomeScreenTitleTextResId;
    public int windowLightStatusBarResId;
    public boolean linkPreviewEnabled = false;
    public boolean arePermissionDescriptionDialogsEnabled = false;
    public boolean isClearSearchBtnVisible = true;
    public boolean isSearchLoaderVisible = true;
    public boolean useSystemFilePicker = true;
    public Integer searchLoaderDrawable = null;

    public ChatStyle() {
        int i = R.color.ecc_white;
        this.searchLoaderColorTint = i;
        this.searchIconResId = R.drawable.ecc_ic_search_white_24dp;
        this.searchResultsDividerColor = R.color.ecc_search_divider_color;
        this.searchResultsItemRightArrowDrawable = R.drawable.right_arrow;
        int i2 = R.color.ecc_search_results_item_secondary;
        this.searchResultsItemRightArrowTintColor = i2;
        this.searchResultsItemDateTextColor = i2;
        this.searchResultsItemMessageTextColor = R.color.ecc_search_results_message_color;
        int i3 = R.color.ecc_black;
        this.searchResultsItemNameTextColor = i3;
        this.searchResultNoItemsImageDrawable = R.drawable.ecc_search_not_found;
        this.searchResultNoItemsTextColor = i3;
        this.searchResultNoItemsText = R.string.ecc_no_results_found;
        this.searchBarTextColor = i;
        this.searchMessageHintText = R.string.ecc_search_messages;
        this.loadedSettingsErrorText = R.string.ecc_settings_not_loaded;
        this.loadedAttachmentSettingsErrorText = R.string.ecc_attachment_settings_not_loaded;
        this.chatToolbarHintTextColor = R.color.ecc_chat_toolbar_hint;
        this.chatDisabledTextColor = R.color.ecc_disabled_text_color;
        this.chatTitleTextResId = R.string.ecc_contact_center;
        this.chatSubtitleTextResId = R.string.ecc_operator_subtitle;
        int i4 = R.color.ecc_chat_toolbar;
        this.chatToolbarColorResId = i4;
        this.chatToolbarContextMenuColorResId = R.color.ecc_chat_toolbar_context_menu;
        this.chatStatusBarColorResId = R.color.ecc_chat_status_bar;
        this.windowLightStatusBarResId = R.bool.ecc_chat_is_light_status_bar;
        this.menuItemTextColorResId = R.color.ecc_chat_toolbar_menu_item;
        this.chatToolbarTextColorResId = R.color.ecc_chat_toolbar_text;
        this.fixedChatTitle = R.bool.ecc_chat_fixed_chat_title;
        this.fixedChatSubtitle = R.bool.ecc_chat_fixed_chat_subtitle;
        this.isChatSubtitleVisible = R.bool.ecc_chat_subtitle_is_visible;
        this.isChatTitleShadowVisible = R.bool.ecc_chat_title_shadow_is_visible;
        this.searchEnabled = R.bool.ecc_chat_search_enabled;
        this.showBackButton = false;
        this.isToolbarTextCentered = false;
        this.chatSubtitleShowOrgUnit = false;
        int i5 = R.color.ecc_green_83b144;
        this.chatToolbarInverseIconTintResId = i5;
        this.chatToolbarBackIconResId = R.drawable.ecc_ic_arrow_back_24dp;
        this.chatToolbarPopUpMenuIconResId = R.drawable.ecc_ic_more_vert_24dp;
        this.chatToolbarContentCopyIconResId = R.drawable.ecc_ic_content_copy_24dp;
        this.chatToolbarReplyIconResId = R.drawable.ecc_ic_reply_24dp;
        this.chatBackgroundColor = R.color.ecc_chat_background;
        this.chatHighlightingColor = R.color.ecc_chat_highlighting;
        this.incomingMessageBubbleColor = R.color.ecc_chat_incoming_message_bubble;
        this.outgoingMessageBubbleColor = R.color.ecc_chat_outgoing_message_bubble;
        int i6 = R.color.ecc_error_red_df0000;
        this.messageNotSentBubbleBackgroundColor = i6;
        this.messageNotSentErrorImageColor = i;
        this.incomingMessageBubbleBackground = R.drawable.ecc_incoming_bubble;
        this.outgoingMessageBubbleBackground = R.drawable.ecc_outgoing_bubble;
        int i7 = R.color.ecc_incoming_message_text;
        this.incomingMessageTextColor = i7;
        int i8 = R.color.ecc_outgoing_message_text;
        this.outgoingMessageTextColor = i8;
        this.errorMessageTextColor = i6;
        this.quoteHeaderTextColor = i7;
        this.quoteTextTextColor = i7;
        this.incomingMessageTimeColor = R.color.ecc_operator_message_timestamp;
        int i9 = R.color.ecc_user_message_timestamp;
        this.outgoingMessageTimeColor = i9;
        this.incomingMessageLoaderColor = i5;
        this.outgoingMessageLoaderColor = R.color.ecc_teal_004d40;
        this.incomingMessageTimeTextSize = 0;
        this.outgoingMessageTimeTextSize = 0;
        this.incomingDelimitersColor = i4;
        this.outgoingDelimitersColor = i8;
        this.outgoingImageBubbleMask = R.drawable.ecc_outgoing_image_mask;
        this.outgoingImageTimeColor = R.color.ecc_outgoing_message_time;
        this.outgoingImageTimeBackgroundColor = R.color.ecc_outgoing_time_underlay;
        this.incomingImageBubbleMask = R.drawable.ecc_incoming_image_mask;
        this.incomingImageTimeColor = R.color.ecc_incoming_message_time;
        this.incomingImageTimeBackgroundColor = R.color.ecc_incoming_time_underlay;
        this.bubbleOutgoingPaddingLeft = R.dimen.ecc_bubbleOutgoingPaddingLeft;
        this.bubbleOutgoingPaddingTop = R.dimen.ecc_bubbleOutgoingPaddingTop;
        this.bubbleOutgoingPaddingRight = R.dimen.ecc_bubbleOutgoingPaddingRight;
        this.bubbleOutgoingPaddingBottom = R.dimen.ecc_bubbleOutgoingPaddingBottom;
        this.bubbleIncomingPaddingLeft = R.dimen.ecc_bubbleIncomingPaddingLeft;
        this.bubbleIncomingPaddingTop = R.dimen.ecc_bubbleIncomingPaddingTop;
        this.bubbleIncomingPaddingRight = R.dimen.ecc_bubbleIncomingPaddingRight;
        this.bubbleIncomingPaddingBottom = R.dimen.ecc_bubbleIncomingPaddingBottom;
        this.bubbleOutgoingMarginLeft = R.dimen.ecc_user_margin_left;
        int i10 = R.dimen.ecc_margin_quarter;
        this.bubbleOutgoingMarginTop = i10;
        this.bubbleOutgoingMarginRight = R.dimen.ecc_user_margin_right;
        this.bubbleOutgoingMarginBottom = i10;
        this.bubbleIncomingMarginLeft = i10;
        this.bubbleIncomingMarginTop = i10;
        this.bubbleIncomingMarginRight = R.dimen.ecc_consultant_margin_right;
        this.bubbleIncomingMarginBottom = i10;
        this.incomingImageLeftBorderSize = R.dimen.ecc_incomingImageLeftBorderSize;
        this.incomingImageTopBorderSize = R.dimen.ecc_incomingImageTopBorderSize;
        this.incomingImageRightBorderSize = R.dimen.ecc_incomingImageRightBorderSize;
        this.incomingImageBottomBorderSize = R.dimen.ecc_incomingImageBottomBorderSize;
        this.outgoingImageLeftBorderSize = R.dimen.ecc_outgoingImageLeftBorderSize;
        this.outgoingImageTopBorderSize = R.dimen.ecc_outgoingImageTopBorderSize;
        this.outgoingImageRightBorderSize = R.dimen.ecc_outgoingImageRightBorderSize;
        this.outgoingImageBottomBorderSize = R.dimen.ecc_outgoingImageBottomBorderSize;
        this.imageBubbleSize = 0.66f;
        int i11 = R.dimen.ecc_margin_three_fourth;
        this.inputFieldPaddingLeft = i11;
        this.inputFieldPaddingTop = i10;
        this.inputFieldPaddingRight = i11;
        this.inputFieldPaddingBottom = i10;
        int i12 = R.dimen.ecc_margin_zero;
        this.inputFieldMarginLeft = i12;
        this.inputFieldMarginTop = i12;
        this.inputFieldMarginRight = i12;
        this.inputFieldMarginBottom = i12;
        this.incomingMessageLinkColor = R.color.ecc_incoming_message_link;
        this.outgoingMessageLinkColor = R.color.ecc_outgoing_message_link;
        this.incomingPlayPauseButtonColor = R.color.ecc_incoming_play_pause_button;
        this.outgoingPlayPauseButtonColor = R.color.ecc_outgoing_play_pause_button;
        this.previewPlayPauseButtonColor = R.color.ecc_preview_play_pause_button;
        this.voiceMessagePlayButton = R.drawable.ecc_voice_message_play;
        this.voiceMessagePauseButton = R.drawable.ecc_voice_message_pause;
        this.chatBodyIconsTint = R.color.ecc_chat_icons_tint;
        this.searchClearIconTintColor = i;
        int i13 = R.drawable.ecc_ic_clear_36dp;
        this.searchClearIconDrawable = i13;
        this.chatBodyIconsColorState = null;
        this.chatSystemMessageTextColor = R.color.ecc_chat_connection_message;
        this.iconsAndSeparatorsColor = R.color.ecc_icon_and_separators_color;
        this.defaultOperatorAvatar = R.drawable.ecc_operator_avatar_placeholder;
        this.operatorAvatarSize = R.dimen.ecc_operator_photo_size;
        this.operatorSystemAvatarSize = R.dimen.ecc_system_operator_photo_size;
        this.imagePlaceholder = R.drawable.ecc_image_placeholder;
        this.fileBrowserDialogStyleResId = R.style.FileDialogStyleTransparent;
        this.showConsultSearching = false;
        this.scrollChatToEndIfUserTyping = false;
        this.inputEnabledDuringQuickReplies = false;
        this.scrollDownIconResId = R.drawable.ecc_scroll_down_icon;
        this.scrollDownBackgroundResId = R.drawable.ecc_scroll_down_background;
        this.scrollDownButtonWidth = R.dimen.ecc_scroll_down_button_width;
        this.scrollDownButtonHeight = R.dimen.ecc_scroll_down_button_height;
        this.scrollDownButtonMargin = R.dimen.ecc_scroll_down_button_margin;
        this.scrollDownButtonElevation = R.dimen.ecc_scroll_down_button_elevation;
        this.unreadMsgStickerColorResId = R.color.ecc_chat_unread_msg_sticker_background;
        this.unreadMsgCountTextColorResId = R.color.ecc_chat_unread_msg_count_text;
        this.threadsSwipeRefreshColors = R.array.ecc_swipe_refresh_colors;
        this.threadsRecordButtonBackground = R.drawable.ecc_record_button_background;
        this.threadsRecordButtonBackgroundColor = R.color.ecc_record_button_background;
        this.threadsRecordButtonIcon = R.drawable.ecc_record_button_icon;
        this.threadsRecordButtonIconColor = R.color.ecc_record_button_icon;
        this.threadsRecordButtonSmallMicColor = R.color.ecc_record_button_small_mic;
        this.downloadButtonTintResId = i5;
        this.downloadButtonBackgroundTintResId = i;
        this.loaderTintResId = i5;
        this.startDownloadIconResId = R.drawable.ecc_ic_vertical_align_bottom_18dp;
        this.inProgressIconResId = i13;
        this.completedIconResId = R.drawable.ecc_ic_file_outline_24dp;
        this.imagesScreenBackgroundColor = R.color.ecc_attachments_background;
        this.imagesScreenAuthorTextColor = R.color.ecc_attachments_author_text_color;
        this.imagesScreenDateTextColor = R.color.ecc_attachments_date_text_color;
        this.imagesScreenAuthorTextSize = R.dimen.ecc_attachments_author_text_size;
        this.imagesScreenDateTextSize = R.dimen.ecc_attachments_date_text_size;
        this.quoteClearIconTintResId = i5;
        this.quoteClearIconResId = i13;
        this.chatMessageInputColor = R.color.ecc_input_background;
        this.chatMessageInputHintTextColor = R.color.ecc_input_hint;
        this.inputTextColor = R.color.ecc_input_text;
        this.inputIconTintResId = i5;
        this.attachmentIconResId = R.drawable.ecc_ic_attachment_button;
        this.sendMessageIconResId = R.drawable.ecc_ic_send_button;
        this.inputHint = R.string.ecc_input_hint;
        this.inputHeight = R.dimen.ecc_input_height;
        this.inputBackground = R.drawable.ecc_chat_input_background;
        this.quoteAttachmentIconResId = R.drawable.ecc_ic_reply_gray_24dp;
        this.attachmentBottomSheetButtonTintResId = i5;
        this.attachmentDoneIconResId = R.drawable.ecc_ic_circle_done_36dp;
        this.attachmentCameraIconResId = R.drawable.ecc_ic_camera_42dp;
        this.attachmentGalleryIconResId = R.drawable.ecc_ic_photo_42dp;
        this.attachmentFileIconResId = R.drawable.ecc_ic_file_fill_42dp;
        this.attachmentSendIconResId = R.drawable.ecc_ic_send_42dp;
        this.defPushIconResId = R.drawable.ecc_default_push_icon;
        this.defTitleResId = R.string.ecc_push_title;
        this.pushBackgroundColorResId = R.color.ecc_push_background;
        this.nougatPushAccentColorResId = R.color.ecc_nougat_push_accent;
        this.notificationQuickReplyMessageBackgroundColor = R.color.ecc_notification_quick_reply_message_background;
        this.notificationQuickReplyMessageTextColor = R.color.ecc_notification_quick_reply_message_text_color;
        this.requestToResolveThreadTextResId = R.string.ecc_request_to_resolve_thread;
        this.approveRequestToResolveThreadTextResId = R.string.ecc_request_to_resolve_thread_close;
        this.denyRequestToResolveThreadTextResId = R.string.ecc_request_to_resolve_thread_open;
        this.binarySurveyLikeUnselectedIconResId = R.drawable.ecc_binary_survey_like_unselected;
        this.binarySurveyLikeSelectedIconResId = R.drawable.ecc_binary_survey_like_selected;
        this.binarySurveyDislikeUnselectedIconResId = R.drawable.ecc_binary_survey_dislike_unselected;
        this.binarySurveyDislikeSelectedIconResId = R.drawable.ecc_binary_survey_dislike_selected;
        this.optionsSurveyUnselectedIconResId = R.drawable.ecc_options_survey_unselected;
        this.optionsSurveySelectedIconResId = R.drawable.ecc_options_survey_selected;
        this.surveySelectedColorFilterResId = R.color.ecc_survey_selected_icon_tint;
        this.surveyFinalColorFilterResId = i8;
        this.surveyUnselectedColorFilterResId = R.color.ecc_survey_unselected_icon_tint;
        this.surveyTextColorResId = R.color.ecc_chat_system_message;
        this.surveyChoicesTextColorResId = R.color.ecc_survey_choices_text;
        this.scheduleMessageTextColorResId = R.color.ecc_schedule_text;
        this.scheduleMessageIconResId = R.drawable.ecc_schedule_icon;
        this.welcomeScreenLogoResId = R.drawable.ecc_welcome_logo;
        this.welcomeScreenTitleTextResId = R.string.ecc_welcome_screen_title_text;
        this.welcomeScreenSubtitleTextResId = R.string.ecc_welcome_screen_subtitle_text;
        this.welcomeScreenTitleTextColorResId = R.color.ecc_welcome_screen_title;
        this.welcomeScreenSubtitleTextColorResId = R.color.ecc_welcome_screen_subtitle;
        this.welcomeScreenTitleSizeInSp = R.dimen.ecc_welcome_screen_title;
        this.welcomeScreenSubtitleSizeInSp = R.dimen.ecc_welcome_screen_subtitle;
        this.welcomeScreenLogoWidth = R.dimen.ecc_welcome_logo_width;
        this.welcomeScreenLogoHeight = R.dimen.ecc_welcome_logo_height;
        this.emptyStateBackgroundColorResId = R.color.ecc_empty_state_background;
        this.emptyStateProgressBarColorResId = R.color.ecc_empty_state_progress;
        this.emptyStateHintColorResId = R.color.ecc_empty_state_hint;
        this.loaderTextResId = R.string.ecc_loading;
        this.systemMessageTextSize = R.dimen.ecc_system_message_text_size;
        int i14 = R.color.ecc_chat_new_system_message;
        this.systemMessageTextColorResId = i14;
        this.systemMessageLeftRightPadding = R.dimen.ecc_system_message_left_right_padding;
        this.systemMessageTextGravity = 17;
        this.systemMessageLinkColor = R.color.ecc_system_message_link;
        this.quickReplyButtonBackground = R.drawable.ecc_quick_reply_button_background;
        this.quickReplyTextColor = R.color.ecc_quick_reply_text_color;
        this.maxGalleryImagesCount = R.integer.ecc_max_count_attached_images;
        this.maxGalleryImagesCountFixedBySystem = R.integer.ecc_max_count_attached_images_final;
        this.consultSearchingProgressColor = R.color.ecc_consult_searching_progress_color;
        this.canShowSpecialistInfo = true;
        this.voiceMessageEnabled = false;
        this.toastTextSize = 0;
        this.toastTextColor = 0;
        this.toastBackgroundColor = 0;
        this.messageEditedIconResId = R.drawable.ecc_message_image_edited;
        int i15 = R.drawable.ecc_message_image_sending;
        this.messageSendingIconResId = i15;
        this.messageSentIconResId = i15;
        this.messageDeliveredIconResId = R.drawable.ecc_message_image_delivered;
        this.messageReadIconResId = R.drawable.ecc_image_message_read;
        this.messageFailedIconResId = R.drawable.ecc_message_image_failed;
        this.messageEditedIconColorResId = i9;
        this.messageSendingIconColorResId = i;
        this.messageSentIconColorResId = i;
        this.messageDeliveredIconColorResId = i;
        this.messageReadIconColorResId = i;
        this.messageFailedIconColorResId = i;
        this.chatErrorScreenImageResId = R.drawable.ecc_serious_worker;
        int i16 = R.dimen.ecc_text_medium;
        this.chatErrorScreenMessageTextSizeResId = i16;
        this.chatErrorScreenMessageTextColorResId = i14;
        this.chatErrorScreenButtonTextSizeResId = i16;
        this.chatErrorScreenButtonTextResId = R.string.ecc_repeat;
        this.chatErrorScreenButtonTextColorResId = i;
        this.chatErrorScreenButtonTintColorList = null;
    }

    public ChatStyle centerToolbarText() {
        this.isToolbarTextCentered = true;
        return this;
    }

    public ChatStyle disableSystemFilePicker() {
        this.useSystemFilePicker = false;
        return this;
    }

    public ChatStyle enableLinkPreview() {
        this.linkPreviewEnabled = true;
        return this;
    }

    public MarkdownConfig getIncomingMarkdownConfiguration() {
        if (this.incomingMarkdownConfiguration == null) {
            this.incomingMarkdownConfiguration = new MarkdownConfig();
        }
        return this.incomingMarkdownConfiguration;
    }

    public int getMaxGalleryImagesCount(@NonNull Context context) {
        int integer = context.getResources().getInteger(this.maxGalleryImagesCount);
        int integer2 = context.getResources().getInteger(this.maxGalleryImagesCountFixedBySystem);
        if (integer <= integer2 && integer > 0) {
            return integer;
        }
        return integer2;
    }

    public MarkdownConfig getOutgoingMarkdownConfiguration() {
        if (this.outgoingMarkdownConfiguration == null) {
            this.outgoingMarkdownConfiguration = new MarkdownConfig();
        }
        return this.outgoingMarkdownConfiguration;
    }

    public boolean isToastStylable() {
        if (this.toastTextSize == 0 && this.toastTextColor == 0 && this.toastBackgroundColor == 0) {
            return false;
        }
        return true;
    }

    public ChatStyle setArePermissionDescriptionDialogsEnabled(boolean z) {
        this.arePermissionDescriptionDialogsEnabled = z;
        return this;
    }

    public ChatStyle setAttachmentBottomSheetButtonTintResId(int i) {
        this.attachmentBottomSheetButtonTintResId = i;
        return this;
    }

    public ChatStyle setAttachmentCameraIconResId(int i) {
        this.attachmentCameraIconResId = i;
        return this;
    }

    public ChatStyle setAttachmentDoneIconResId(int i) {
        this.attachmentDoneIconResId = i;
        return this;
    }

    public ChatStyle setAttachmentFileIconResId(int i) {
        this.attachmentFileIconResId = i;
        return this;
    }

    public ChatStyle setAttachmentGalleryIconResId(int i) {
        this.attachmentGalleryIconResId = i;
        return this;
    }

    public ChatStyle setAttachmentIconResId(int i) {
        this.attachmentIconResId = i;
        return this;
    }

    public ChatStyle setAttachmentSendIconResId(int i) {
        this.attachmentSendIconResId = i;
        return this;
    }

    public ChatStyle setBubbleMessageFont(String str) {
        this.bubbleMessageFont = str;
        return this;
    }

    public ChatStyle setBubbleTimeFont(String str) {
        this.bubbleTimeFont = str;
        return this;
    }

    public ChatStyle setCanShowSpecialistInfo(boolean z) {
        this.canShowSpecialistInfo = z;
        return this;
    }

    public ChatStyle setChatBackgroundColor(int i) {
        this.chatBackgroundColor = i;
        return this;
    }

    public ChatStyle setChatBodyIconsColorStateTint(int i, int i2, int i3) {
        this.chatBodyIconsColorState = new int[]{i, i2, i3};
        return this;
    }

    public ChatStyle setChatBodyIconsTint(int i) {
        this.chatBodyIconsTint = i;
        return this;
    }

    public ChatStyle setChatBodyStyle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, boolean z, boolean z2) {
        this.chatBackgroundColor = i;
        this.chatHighlightingColor = i2;
        this.incomingMessageBubbleColor = i3;
        this.outgoingMessageBubbleColor = i4;
        this.incomingMessageBubbleBackground = i5;
        this.outgoingMessageBubbleBackground = i6;
        this.incomingMessageTextColor = i7;
        this.outgoingMessageTextColor = i8;
        this.incomingMessageTimeColor = i9;
        this.outgoingMessageTimeColor = i10;
        this.outgoingImageBubbleMask = i11;
        this.outgoingImageTimeColor = i12;
        this.outgoingImageTimeBackgroundColor = i13;
        this.incomingImageBubbleMask = i14;
        this.incomingImageTimeColor = i15;
        this.incomingImageTimeBackgroundColor = i16;
        this.incomingMessageLinkColor = i17;
        this.outgoingMessageLinkColor = i18;
        this.defaultOperatorAvatar = i24;
        this.operatorAvatarSize = i25;
        this.operatorSystemAvatarSize = i26;
        this.imagePlaceholder = i27;
        this.chatBodyIconsTint = i19;
        this.chatSystemMessageTextColor = i20;
        this.iconsAndSeparatorsColor = i23;
        this.fileBrowserDialogStyleResId = i28;
        this.showConsultSearching = z;
        this.scrollChatToEndIfUserTyping = z2;
        return this;
    }

    public ChatStyle setChatErrorScreenStyle(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, ColorStateList colorStateList, Integer num6) {
        if (num != null) {
            this.chatErrorScreenImageResId = num.intValue();
        }
        if (num2 != null) {
            this.chatErrorScreenMessageTextSizeResId = num2.intValue();
        }
        if (num3 != null) {
            this.chatErrorScreenMessageTextColorResId = num3.intValue();
        }
        if (num4 != null) {
            this.chatErrorScreenButtonTextSizeResId = num4.intValue();
        }
        if (num6 != null) {
            this.chatErrorScreenButtonTextResId = num6.intValue();
        }
        if (colorStateList != null) {
            this.chatErrorScreenButtonTintColorList = colorStateList;
        }
        if (num5 != null) {
            this.chatErrorScreenButtonTextColorResId = num5.intValue();
        }
        return this;
    }

    public ChatStyle setChatHighlightingColor(int i) {
        this.chatHighlightingColor = i;
        return this;
    }

    public ChatStyle setChatInputStyle(int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, int i8) {
        this.chatMessageInputColor = i2;
        this.chatMessageInputHintTextColor = i;
        this.inputTextColor = i3;
        this.inputTextFont = str;
        this.attachmentIconResId = i4;
        this.sendMessageIconResId = i5;
        this.inputHint = i6;
        this.inputHeight = i7;
        this.inputBackground = i8;
        return this;
    }

    public ChatStyle setChatSubtitleShowConsultOrgUnit(boolean z) {
        this.chatSubtitleShowOrgUnit = z;
        return this;
    }

    public ChatStyle setChatTitleStyle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        this.chatTitleTextResId = i;
        this.chatSubtitleTextResId = i2;
        this.chatToolbarColorResId = i3;
        this.chatToolbarContextMenuColorResId = i4;
        this.chatToolbarTextColorResId = i5;
        this.chatStatusBarColorResId = i6;
        this.windowLightStatusBarResId = i7;
        this.menuItemTextColorResId = i8;
        this.chatToolbarHintTextColor = i9;
        this.showBackButton = z;
        return this;
    }

    public ChatStyle setChatToolbarBackIconResId(int i) {
        this.chatToolbarBackIconResId = i;
        return this;
    }

    public ChatStyle setChatToolbarContentCopyIconResId(int i) {
        this.chatToolbarContentCopyIconResId = i;
        return this;
    }

    public ChatStyle setChatToolbarInverseIconTintResId(int i) {
        this.chatToolbarInverseIconTintResId = i;
        return this;
    }

    public ChatStyle setChatToolbarPopUpMenuIconResId(int i) {
        this.chatToolbarPopUpMenuIconResId = i;
        return this;
    }

    public ChatStyle setChatToolbarReplyIconResId(int i) {
        this.chatToolbarReplyIconResId = i;
        return this;
    }

    public ChatStyle setCompletedIconResId(int i) {
        this.completedIconResId = i;
        return this;
    }

    public ChatStyle setConsultSearchingProgressColor(int i) {
        this.consultSearchingProgressColor = i;
        return this;
    }

    public ChatStyle setDefaultFontBold(String str) {
        this.defaultFontBold = str;
        return this;
    }

    public ChatStyle setDefaultFontLight(String str) {
        this.defaultFontLight = str;
        return this;
    }

    public ChatStyle setDefaultFontRegular(String str) {
        this.defaultFontRegular = str;
        return this;
    }

    public ChatStyle setDelimitersColors(int i, int i2) {
        this.incomingDelimitersColor = i;
        this.outgoingDelimitersColor = i2;
        return this;
    }

    public ChatStyle setDownloadButtonBackgroundTintResId(int i) {
        this.downloadButtonBackgroundTintResId = i;
        return this;
    }

    public ChatStyle setDownloadButtonTintResId(int i) {
        this.downloadButtonTintResId = i;
        return this;
    }

    public ChatStyle setEmptyStateStyle(int i, int i2, int i3) {
        this.emptyStateBackgroundColorResId = i;
        this.emptyStateProgressBarColorResId = i2;
        this.emptyStateHintColorResId = i3;
        return this;
    }

    public ChatStyle setErrorMessageTextColor(int i) {
        this.errorMessageTextColor = i;
        return this;
    }

    public ChatStyle setFixedChatSubtitle(int i) {
        this.fixedChatSubtitle = i;
        return this;
    }

    public ChatStyle setFixedChatTitle(int i) {
        this.fixedChatTitle = i;
        return this;
    }

    public ChatStyle setImageBubbleSize(float f) {
        this.imageBubbleSize = f;
        return this;
    }

    public ChatStyle setImagesGalleryStyle(int i, int i2, int i3, int i4, int i5) {
        this.imagesScreenBackgroundColor = i;
        this.imagesScreenAuthorTextColor = i2;
        this.imagesScreenDateTextColor = i3;
        this.imagesScreenAuthorTextSize = i4;
        this.imagesScreenDateTextSize = i5;
        return this;
    }

    public ChatStyle setInProgressIconResId(int i) {
        this.inProgressIconResId = i;
        return this;
    }

    public ChatStyle setIncomingBubbleMask(int i) {
        this.incomingMessageBubbleBackground = i;
        return this;
    }

    public ChatStyle setIncomingImageBordersSize(int i, int i2, int i3, int i4) {
        this.incomingImageLeftBorderSize = i;
        this.incomingImageTopBorderSize = i2;
        this.incomingImageRightBorderSize = i3;
        this.incomingImageBottomBorderSize = i4;
        return this;
    }

    public ChatStyle setIncomingImageMask(int i) {
        this.incomingImageBubbleMask = i;
        return this;
    }

    public ChatStyle setIncomingImageTimeBackgroundColor(int i) {
        this.incomingImageTimeBackgroundColor = i;
        return this;
    }

    public ChatStyle setIncomingMarkdownConfiguration(MarkdownConfig markdownConfig) {
        this.incomingMarkdownConfiguration = markdownConfig;
        return this;
    }

    public ChatStyle setIncomingMessageBubbleColor(int i) {
        this.incomingMessageBubbleColor = i;
        return this;
    }

    public ChatStyle setIncomingMessageLinkColor(int i) {
        this.incomingMessageLinkColor = i;
        return this;
    }

    public ChatStyle setIncomingMessageLoaderColorResId(int i) {
        this.incomingMessageLoaderColor = i;
        return this;
    }

    public ChatStyle setIncomingMessageTextColor(int i) {
        this.incomingMessageTextColor = i;
        return this;
    }

    public ChatStyle setIncomingMessageTimeColor(int i) {
        this.incomingMessageTimeColor = i;
        return this;
    }

    public ChatStyle setIncomingTimeTextSize(int i) {
        this.incomingMessageTimeTextSize = i;
        return this;
    }

    public ChatStyle setIngoingMargin(int i, int i2, int i3, int i4) {
        this.bubbleIncomingMarginLeft = i;
        this.bubbleIncomingMarginTop = i2;
        this.bubbleIncomingMarginRight = i3;
        this.bubbleIncomingMarginBottom = i4;
        return this;
    }

    public ChatStyle setIngoingPadding(int i, int i2, int i3, int i4) {
        this.bubbleIncomingPaddingLeft = i;
        this.bubbleIncomingPaddingTop = i2;
        this.bubbleIncomingPaddingRight = i3;
        this.bubbleIncomingPaddingBottom = i4;
        return this;
    }

    public ChatStyle setInputEnabledDuringQuickReplies(boolean z) {
        this.inputEnabledDuringQuickReplies = z;
        return this;
    }

    public ChatStyle setInputFieldMargin(int i, int i2, int i3, int i4) {
        this.inputFieldMarginLeft = i;
        this.inputFieldMarginTop = i2;
        this.inputFieldMarginRight = i3;
        this.inputFieldMarginBottom = i4;
        return this;
    }

    public ChatStyle setInputFieldPadding(int i, int i2, int i3, int i4) {
        this.inputFieldPaddingLeft = i;
        this.inputFieldPaddingTop = i2;
        this.inputFieldPaddingRight = i3;
        this.inputFieldPaddingBottom = i4;
        return this;
    }

    public ChatStyle setInputIconTintResId(int i) {
        this.inputIconTintResId = i;
        return this;
    }

    public ChatStyle setInputQuotedMessageAuthorFont(String str) {
        this.inputQuotedMessageAuthorFont = str;
        return this;
    }

    public ChatStyle setInputQuotedMessageFont(String str) {
        this.inputQuotedMessageFont = str;
        return this;
    }

    public ChatStyle setInputTextFont(String str) {
        this.inputTextFont = str;
        return this;
    }

    public ChatStyle setLoaderTextResId(int i) {
        this.loaderTextResId = i;
        return this;
    }

    public ChatStyle setLoaderTintResId(int i) {
        this.loaderTintResId = i;
        return this;
    }

    public ChatStyle setMaxGalleryImagesCount(int i) {
        this.maxGalleryImagesCount = i;
        return this;
    }

    public ChatStyle setMessageDeliveredResources(Integer num, Integer num2) {
        if (num != null) {
            this.messageDeliveredIconResId = num.intValue();
        }
        if (num2 != null) {
            this.messageDeliveredIconColorResId = num2.intValue();
        }
        return this;
    }

    public ChatStyle setMessageEditedResources(Integer num, Integer num2) {
        if (num != null) {
            this.messageEditedIconResId = num.intValue();
        }
        if (num2 != null) {
            this.messageEditedIconColorResId = num2.intValue();
        }
        return this;
    }

    public ChatStyle setMessageFailedResources(Integer num, Integer num2) {
        if (num != null) {
            this.messageFailedIconResId = num.intValue();
        }
        if (num2 != null) {
            this.messageFailedIconColorResId = num2.intValue();
        }
        return this;
    }

    public ChatStyle setMessageHeaderFont(String str) {
        this.messageHeaderFont = str;
        return this;
    }

    public ChatStyle setMessageNotSentBubbleColors(int i, int i2) {
        this.messageNotSentBubbleBackgroundColor = i;
        this.messageNotSentErrorImageColor = i2;
        return this;
    }

    public ChatStyle setMessageReadResources(Integer num, Integer num2) {
        if (num != null) {
            this.messageReadIconResId = num.intValue();
        }
        if (num2 != null) {
            this.messageReadIconColorResId = num2.intValue();
        }
        return this;
    }

    public ChatStyle setMessageSendingResources(Integer num, Integer num2) {
        if (num != null) {
            this.messageSendingIconResId = num.intValue();
        }
        if (num2 != null) {
            this.messageSendingIconColorResId = num2.intValue();
        }
        return this;
    }

    public ChatStyle setMessageSentResources(Integer num, Integer num2) {
        if (num != null) {
            this.messageSentIconResId = num.intValue();
        }
        if (num2 != null) {
            this.messageSentIconColorResId = num2.intValue();
        }
        return this;
    }

    public ChatStyle setOutgoingBubbleMask(int i) {
        this.outgoingMessageBubbleBackground = i;
        return this;
    }

    public ChatStyle setOutgoingImageBordersSize(int i, int i2, int i3, int i4) {
        this.outgoingImageLeftBorderSize = i;
        this.outgoingImageTopBorderSize = i2;
        this.outgoingImageRightBorderSize = i3;
        this.outgoingImageBottomBorderSize = i4;
        return this;
    }

    public ChatStyle setOutgoingImageMask(int i) {
        this.outgoingImageBubbleMask = i;
        return this;
    }

    public ChatStyle setOutgoingImageTimeBackgroundColor(int i) {
        this.outgoingImageTimeBackgroundColor = i;
        return this;
    }

    public ChatStyle setOutgoingMargin(int i, int i2, int i3, int i4) {
        this.bubbleOutgoingMarginLeft = i;
        this.bubbleOutgoingMarginTop = i2;
        this.bubbleOutgoingMarginRight = i3;
        this.bubbleOutgoingMarginBottom = i4;
        return this;
    }

    public ChatStyle setOutgoingMarkdownConfiguration(MarkdownConfig markdownConfig) {
        this.outgoingMarkdownConfiguration = markdownConfig;
        return this;
    }

    public ChatStyle setOutgoingMessageBubbleColor(int i) {
        this.outgoingMessageBubbleColor = i;
        return this;
    }

    public ChatStyle setOutgoingMessageLinkColor(int i) {
        this.outgoingMessageLinkColor = i;
        return this;
    }

    public ChatStyle setOutgoingMessageLoaderColorResId(int i) {
        this.outgoingMessageLoaderColor = i;
        return this;
    }

    public ChatStyle setOutgoingMessageTextColor(int i) {
        this.outgoingMessageTextColor = i;
        return this;
    }

    public ChatStyle setOutgoingMessageTimeColor(int i) {
        this.outgoingMessageTimeColor = i;
        return this;
    }

    public ChatStyle setOutgoingPadding(int i, int i2, int i3, int i4) {
        this.bubbleOutgoingPaddingLeft = i;
        this.bubbleOutgoingPaddingTop = i2;
        this.bubbleOutgoingPaddingRight = i3;
        this.bubbleOutgoingPaddingBottom = i4;
        return this;
    }

    public ChatStyle setOutgoingTimeTextSize(int i) {
        this.outgoingMessageTimeTextSize = i;
        return this;
    }

    public ChatStyle setPlaceholderSubtitleFont(String str) {
        this.placeholderSubtitleFont = str;
        return this;
    }

    public ChatStyle setPlaceholderTitleFont(String str) {
        this.placeholderTitleFont = str;
        return this;
    }

    public ChatStyle setPlayPauseButtonStyle(int i, int i2, int i3, int i4, int i5) {
        this.incomingPlayPauseButtonColor = i;
        this.outgoingPlayPauseButtonColor = i2;
        this.previewPlayPauseButtonColor = i3;
        this.voiceMessagePlayButton = i4;
        this.voiceMessagePauseButton = i5;
        return this;
    }

    public ChatStyle setPushNotificationStyle(int i, int i2, int i3, int i4, int i5, int i6) {
        this.defPushIconResId = i;
        this.defTitleResId = i2;
        this.pushBackgroundColorResId = i3;
        this.nougatPushAccentColorResId = i4;
        this.notificationQuickReplyMessageBackgroundColor = i5;
        this.notificationQuickReplyMessageTextColor = i6;
        return this;
    }

    public ChatStyle setQuickReplyChipChoiceStyle(int i, int i2) {
        this.quickReplyButtonBackground = i;
        this.quickReplyTextColor = i2;
        return this;
    }

    public ChatStyle setQuoteAttachmentIconResId(int i) {
        this.quoteAttachmentIconResId = i;
        return this;
    }

    public ChatStyle setQuoteAuthorFont(String str) {
        this.quoteAuthorFont = str;
        return this;
    }

    public ChatStyle setQuoteClearIconResId(int i) {
        this.quoteClearIconResId = i;
        return this;
    }

    public ChatStyle setQuoteClearIconTintResId(int i) {
        this.quoteClearIconTintResId = i;
        return this;
    }

    public ChatStyle setQuoteMessageFont(String str) {
        this.quoteMessageFont = str;
        return this;
    }

    public ChatStyle setQuoteTextColors(int i, int i2) {
        this.quoteHeaderTextColor = i;
        this.quoteTextTextColor = i2;
        return this;
    }

    public ChatStyle setQuoteTimeFont(String str) {
        this.quoteTimeFont = str;
        return this;
    }

    public ChatStyle setRecordButtonBackgroundColor(int i) {
        this.threadsRecordButtonBackgroundColor = i;
        return this;
    }

    public ChatStyle setRecordButtonStyle(int i, int i2, int i3, int i4, int i5) {
        this.threadsRecordButtonBackground = i;
        this.threadsRecordButtonBackgroundColor = i2;
        this.threadsRecordButtonIcon = i3;
        this.threadsRecordButtonIconColor = i4;
        this.threadsRecordButtonSmallMicColor = i5;
        return this;
    }

    public ChatStyle setRequestResolveThreadStyle(int i, int i2, int i3) {
        this.requestToResolveThreadTextResId = i;
        this.approveRequestToResolveThreadTextResId = i2;
        this.denyRequestToResolveThreadTextResId = i3;
        return this;
    }

    public ChatStyle setScheduleAlertFont(String str) {
        this.scheduleAlertFont = str;
        return this;
    }

    public ChatStyle setScheduleMessageStyle(int i, int i2) {
        this.scheduleMessageIconResId = i;
        this.scheduleMessageTextColorResId = i2;
        return this;
    }

    public ChatStyle setScrollChatToEndIfUserTyping(boolean z) {
        this.scrollChatToEndIfUserTyping = z;
        return this;
    }

    public ChatStyle setScrollDownButtonIcon(int i) {
        this.scrollDownIconResId = i;
        return this;
    }

    public ChatStyle setScrollDownButtonStyle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.scrollDownIconResId = i;
        this.scrollDownBackgroundResId = i2;
        this.scrollDownButtonWidth = i3;
        this.scrollDownButtonHeight = i4;
        this.scrollDownButtonMargin = i5;
        this.scrollDownButtonElevation = i6;
        this.unreadMsgStickerColorResId = i7;
        this.unreadMsgCountTextColorResId = i8;
        return this;
    }

    public ChatStyle setSearchBarItemsVisibility(boolean z, boolean z2) {
        this.isClearSearchBtnVisible = z;
        this.isSearchLoaderVisible = z2;
        return this;
    }

    public ChatStyle setSearchBarText(Integer num, Integer num2, Integer num3) {
        if (num != null) {
            this.chatToolbarHintTextColor = num.intValue();
        }
        if (num2 != null) {
            this.searchMessageHintText = num2.intValue();
        }
        if (num3 != null) {
            this.searchBarTextColor = num3.intValue();
        }
        return this;
    }

    public ChatStyle setSearchClearIconColor(int i) {
        this.searchClearIconTintColor = i;
        return this;
    }

    public ChatStyle setSearchClearIconDrawable(int i) {
        this.searchClearIconDrawable = i;
        return this;
    }

    public ChatStyle setSearchEnabled(int i) {
        this.searchEnabled = i;
        return this;
    }

    public ChatStyle setSearchLoaderColorTint(int i) {
        this.searchLoaderColorTint = i;
        return this;
    }

    public ChatStyle setSearchLoaderDrawable(int i) {
        this.searchLoaderDrawable = Integer.valueOf(i);
        return this;
    }

    public ChatStyle setSearchResultsDateTextColor(int i) {
        this.searchResultsItemDateTextColor = i;
        return this;
    }

    public ChatStyle setSearchResultsDividerColor(int i) {
        this.searchResultsDividerColor = i;
        return this;
    }

    public ChatStyle setSearchResultsNoItemsElements(Integer num, Integer num2, Integer num3) {
        if (num != null) {
            this.searchResultNoItemsImageDrawable = num.intValue();
        }
        if (num2 != null) {
            this.searchResultNoItemsText = num2.intValue();
        }
        if (num3 != null) {
            this.searchResultNoItemsTextColor = num3.intValue();
        }
        return this;
    }

    public ChatStyle setSearchResultsRightArrow(Integer num, Integer num2) {
        if (num != null) {
            this.searchResultsItemRightArrowDrawable = num.intValue();
        }
        if (num2 != null) {
            this.searchResultsItemRightArrowTintColor = num2.intValue();
        }
        return this;
    }

    public ChatStyle setSearchResultsTextColors(Integer num, Integer num2) {
        if (num != null) {
            this.searchResultsItemMessageTextColor = num.intValue();
        }
        if (num2 != null) {
            this.searchResultsItemNameTextColor = num2.intValue();
        }
        return this;
    }

    public ChatStyle setSendMessageIconResId(int i) {
        this.sendMessageIconResId = i;
        return this;
    }

    public ChatStyle setShowConsultSearching(boolean z) {
        this.showConsultSearching = z;
        return this;
    }

    public ChatStyle setSpecialistConnectSubtitleFont(String str) {
        this.specialistConnectSubtitleFont = str;
        return this;
    }

    public ChatStyle setSpecialistConnectTitleFont(String str) {
        this.specialistConnectTitleFont = str;
        return this;
    }

    public ChatStyle setStartDownloadIconResId(int i) {
        this.startDownloadIconResId = i;
        return this;
    }

    public ChatStyle setStartLoadErrorTexts(Integer num, Integer num2) {
        if (num != null) {
            this.loadedSettingsErrorText = num.intValue();
        }
        if (num2 != null) {
            this.loadedAttachmentSettingsErrorText = num2.intValue();
        }
        return this;
    }

    public ChatStyle setSurveyStyle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.binarySurveyLikeUnselectedIconResId = i;
        this.binarySurveyLikeSelectedIconResId = i2;
        this.binarySurveyDislikeUnselectedIconResId = i3;
        this.binarySurveyDislikeSelectedIconResId = i4;
        this.optionsSurveyUnselectedIconResId = i5;
        this.optionsSurveySelectedIconResId = i6;
        this.surveySelectedColorFilterResId = i7;
        this.surveyUnselectedColorFilterResId = i8;
        this.surveyFinalColorFilterResId = i9;
        this.surveyTextColorResId = i10;
        this.surveyChoicesTextColorResId = i11;
        return this;
    }

    public ChatStyle setSwipeRefreshColors(int i) {
        this.threadsSwipeRefreshColors = i;
        return this;
    }

    public ChatStyle setSystemMessageFont(String str) {
        this.systemMessageFont = str;
        return this;
    }

    public ChatStyle setSystemMessageStyle(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if (str != null) {
            this.systemMessageFont = str;
        }
        if (num != null) {
            this.systemMessageTextSize = num.intValue();
        }
        if (num2 != null) {
            this.systemMessageTextColorResId = num2.intValue();
        }
        if (num3 != null) {
            this.systemMessageLeftRightPadding = num3.intValue();
        }
        if (num4 != null) {
            this.systemMessageTextGravity = num4.intValue();
        }
        if (num5 != null) {
            this.systemMessageLinkColor = num5.intValue();
        }
        return this;
    }

    public ChatStyle setSystemMessageTextGravity(int i) {
        this.systemMessageTextGravity = i;
        return this;
    }

    public ChatStyle setToastStyle(int i, int i2, int i3) {
        this.toastTextSize = i;
        this.toastTextColor = i2;
        this.toastBackgroundColor = i3;
        return this;
    }

    public ChatStyle setToolbarSubtitleFont(String str) {
        this.toolbarSubtitleFont = str;
        return this;
    }

    public ChatStyle setToolbarTitleFont(String str) {
        this.toolbarTitleFont = str;
        return this;
    }

    public ChatStyle setTypingFont(String str) {
        this.typingFont = str;
        return this;
    }

    public ChatStyle setVisibleChatSubtitle(int i) {
        this.isChatSubtitleVisible = i;
        return this;
    }

    public ChatStyle setVisibleChatTitleShadow(int i) {
        this.isChatTitleShadowVisible = i;
        return this;
    }

    public ChatStyle setVoiceMessageEnabled(boolean z) {
        this.voiceMessageEnabled = z;
        return this;
    }

    public ChatStyle setWelcomeScreenStyle(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.welcomeScreenLogoResId = i;
        this.welcomeScreenTitleTextColorResId = i4;
        this.welcomeScreenSubtitleTextColorResId = i5;
        this.welcomeScreenTitleTextResId = i2;
        this.welcomeScreenSubtitleTextResId = i3;
        this.welcomeScreenTitleSizeInSp = i6;
        this.welcomeScreenSubtitleSizeInSp = i7;
        this.welcomeScreenLogoWidth = i8;
        this.welcomeScreenLogoHeight = i9;
        return this;
    }

    public ChatStyle showChatBackButton(boolean z) {
        this.showBackButton = z;
        return this;
    }

    @NonNull
    public String toString() {
        Context context;
        try {
            context = BaseConfig.Companion.getInstance().context;
        } catch (Exception unused) {
            context = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ChatStyle settings. ");
        if (context != null) {
            sb.append("windowLightStatusBarResId: ");
            sb.append(context.getResources().getBoolean(this.windowLightStatusBarResId));
            sb.append(" | ");
            sb.append("fixedChatTitle: ");
            sb.append(context.getResources().getBoolean(this.fixedChatTitle));
            sb.append(" | ");
            sb.append("fixedChatSubtitle: ");
            sb.append(context.getResources().getBoolean(this.fixedChatSubtitle));
            sb.append(" | ");
            sb.append("isChatSubtitleVisible: ");
            sb.append(context.getResources().getBoolean(this.isChatSubtitleVisible));
            sb.append(" | ");
            sb.append("isChatTitleShadowVisible: ");
            sb.append(context.getResources().getBoolean(this.isChatTitleShadowVisible));
            sb.append(" | ");
            sb.append("searchEnabled: ");
            sb.append(context.getResources().getBoolean(this.searchEnabled));
            sb.append(" | ");
        }
        sb.append("linkPreviewEnabled: ");
        sb.append(this.linkPreviewEnabled);
        sb.append(" | ");
        sb.append("arePermissionDescriptionDialogsEnabled: ");
        sb.append(this.arePermissionDescriptionDialogsEnabled);
        sb.append(" | ");
        sb.append("showBackButton: ");
        sb.append(this.showBackButton);
        sb.append(" | ");
        sb.append("isToolbarTextCentered: ");
        sb.append(this.isToolbarTextCentered);
        sb.append(" | ");
        sb.append("chatSubtitleShowOrgUnit: ");
        sb.append(this.chatSubtitleShowOrgUnit);
        sb.append(" | ");
        sb.append("imageBubbleSize: ");
        sb.append(this.imageBubbleSize);
        sb.append(" | ");
        sb.append("showConsultSearching: ");
        sb.append(this.showConsultSearching);
        sb.append(" | ");
        sb.append("scrollChatToEndIfUserTyping: ");
        sb.append(this.scrollChatToEndIfUserTyping);
        sb.append(" | ");
        sb.append("inputEnabledDuringQuickReplies: ");
        sb.append(this.inputEnabledDuringQuickReplies);
        sb.append(" | ");
        sb.append("canShowSpecialistInfo: ");
        sb.append(this.canShowSpecialistInfo);
        sb.append(" | ");
        sb.append("voiceMessageEnabled: ");
        sb.append(this.voiceMessageEnabled);
        sb.append(",");
        return sb.toString();
    }

    @Deprecated
    public ChatStyle setChatTitleStyle(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.chatTitleTextResId = i;
        this.chatSubtitleTextResId = i2;
        this.chatToolbarColorResId = i3;
        this.chatToolbarTextColorResId = i4;
        this.chatStatusBarColorResId = i5;
        this.menuItemTextColorResId = i6;
        this.chatToolbarHintTextColor = i7;
        this.showBackButton = z;
        return this;
    }

    public ChatStyle setSurveyStyle(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        if (num != null) {
            this.binarySurveyLikeUnselectedIconResId = num.intValue();
        }
        if (num2 != null) {
            this.binarySurveyLikeSelectedIconResId = num2.intValue();
        }
        if (num3 != null) {
            this.binarySurveyDislikeUnselectedIconResId = num3.intValue();
        }
        if (num4 != null) {
            this.binarySurveyDislikeSelectedIconResId = num4.intValue();
        }
        if (num5 != null) {
            this.optionsSurveyUnselectedIconResId = num5.intValue();
        }
        if (num6 != null) {
            this.optionsSurveySelectedIconResId = num6.intValue();
        }
        if (num7 != null) {
            this.surveySelectedColorFilterResId = num7.intValue();
        }
        if (num8 != null) {
            this.surveyUnselectedColorFilterResId = num8.intValue();
        }
        if (num9 != null) {
            this.surveyTextColorResId = num9.intValue();
        }
        if (num10 != null) {
            this.surveyChoicesTextColorResId = num10.intValue();
        }
        return this;
    }
}
