package im.threads.ui.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.google.android.material.slider.Slider;
import im.threads.business.config.BaseConfig;
import im.threads.business.formatters.ChatItemType;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatPhrase;
import im.threads.business.models.ClientNotificationDisplayType;
import im.threads.business.models.ConsultChatPhrase;
import im.threads.business.models.ConsultConnectionMessage;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ConsultTyping;
import im.threads.business.models.DateRow;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.NoChatItem;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.QuickReply;
import im.threads.business.models.QuickReplyItem;
import im.threads.business.models.Quote;
import im.threads.business.models.RequestResolveThread;
import im.threads.business.models.ScheduleInfo;
import im.threads.business.models.SearchingConsult;
import im.threads.business.models.SimpleSystemMessage;
import im.threads.business.models.Space;
import im.threads.business.models.Survey;
import im.threads.business.models.SystemMessage;
import im.threads.business.models.UnreadMessages;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.ogParser.OpenGraphParser;
import im.threads.business.ogParser.OpenGraphParserJsoupImpl;
import im.threads.business.transport.Transport;
import im.threads.business.utils.ChatItemListFinder;
import im.threads.business.utils.FileUtils;
import im.threads.business.workers.FileDownloadWorker;
import im.threads.ui.ChatStyle;
import im.threads.ui.adapters.ChatAdapter;
import im.threads.ui.adapters.utils.SendingStatusObserver;
import im.threads.ui.config.Config;
import im.threads.ui.holders.BaseHolder;
import im.threads.ui.holders.ConsultFileViewHolder;
import im.threads.ui.holders.ConsultIsTypingViewHolderNew;
import im.threads.ui.holders.ConsultPhraseHolder;
import im.threads.ui.holders.ConsultVoiceMessageViewHolder;
import im.threads.ui.holders.DateViewHolder;
import im.threads.ui.holders.EmptyViewHolder;
import im.threads.ui.holders.ImageFromConsultViewHolder;
import im.threads.ui.holders.ImageFromUserViewHolder;
import im.threads.ui.holders.QuickRepliesViewHolder;
import im.threads.ui.holders.RatingStarsSentViewHolder;
import im.threads.ui.holders.RatingStarsViewHolder;
import im.threads.ui.holders.RatingThumbsSentViewHolder;
import im.threads.ui.holders.RatingThumbsViewHolder;
import im.threads.ui.holders.RequestResolveThreadViewHolder;
import im.threads.ui.holders.ScheduleInfoViewHolder;
import im.threads.ui.holders.SearchingConsultViewHolder;
import im.threads.ui.holders.SpaceViewHolder;
import im.threads.ui.holders.SystemMessageViewHolder;
import im.threads.ui.holders.UnreadMessageViewHolder;
import im.threads.ui.holders.UserFileViewHolder;
import im.threads.ui.holders.UserPhraseViewHolder;
import im.threads.ui.holders.VoiceMessageBaseHolder;
import im.threads.ui.holders.helper.SurveySplitterKt;
import im.threads.ui.preferences.PreferencesJavaUI;
import im.threads.ui.utils.ThreadRunnerKt;
import im.threads.ui.widget.Rating;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.ToLongFunction;
/* loaded from: classes3.dex */
public final class ChatAdapter extends RecyclerView.h<RecyclerView.d0> {
    private static final int TYPE_CONSULT_PHRASE = 5;
    private static final int TYPE_CONSULT_TYPING = 1;
    private static final int TYPE_DATE = 2;
    private static final int TYPE_FILE_FROM_CONSULT = 11;
    private static final int TYPE_FILE_FROM_USER = 10;
    private static final int TYPE_FREE_SPACE = 7;
    private static final int TYPE_IMAGE_FROM_CONSULT = 8;
    private static final int TYPE_IMAGE_FROM_USER = 9;
    private static final int TYPE_QUICK_REPLIES = 20;
    private static final int TYPE_RATING_STARS = 16;
    private static final int TYPE_RATING_STARS_SENT = 17;
    private static final int TYPE_RATING_THUMBS = 14;
    private static final int TYPE_RATING_THUMBS_SENT = 15;
    private static final int TYPE_REQ_RESOLVE_THREAD = 18;
    private static final int TYPE_SCHEDULE = 13;
    private static final int TYPE_SEARCHING_CONSULT = 3;
    private static final int TYPE_SYSTEM_MESSAGE = 4;
    private static final int TYPE_UNDEFINED = 0;
    private static final int TYPE_UNREAD_MESSAGES = 12;
    private static final int TYPE_USER_PHRASE = 6;
    private static final int TYPE_VOICE_MESSAGE_FROM_CONSULT = 19;
    private final ChatMessagesOrderer chatMessagesOrderer;
    @NonNull
    private ClientNotificationDisplayType clientNotificationDisplayType;
    private Context ctx;
    private long currentThreadId;
    @NonNull
    private final FileDescriptionMediaPlayer fdMediaPlayer;
    private ImageModifications.MaskedModification incomingImageMaskTransformation;
    @NonNull
    private final Callback mCallback;
    @NonNull
    private final MediaMetadataRetriever mediaMetadataRetriever;
    @NonNull
    private final ks8<Long> messageErrorProcessor;
    private ImageModifications.MaskedModification outgoingImageMaskTransformation;
    private final Handler viewHandler = new Handler(Looper.getMainLooper());
    private final ArrayList<ChatItem> list = new ArrayList<>();
    private final SendingStatusObserver sendingStatusObserver = new SendingStatusObserver(new WeakReference(this), Config.getInstance().getRequestConfig().getSocketClientSettings().getResendIntervalMillis());
    @NonNull
    ks8<ChatItem> highlightingStream = ks8.z();
    @NonNull
    OpenGraphParser openGraphParser = new OpenGraphParserJsoupImpl();
    private ChatItem highlightedItem = null;
    private boolean ignorePlayerUpdates = false;
    private VoiceMessageBaseHolder playingHolder = null;

    /* loaded from: classes3.dex */
    public interface Callback {
        void onConsultAvatarClick(String str);

        void onFileClick(FileDescription fileDescription);

        void onFileDownloadRequest(FileDescription fileDescription, boolean z);

        void onImageClick(ChatPhrase chatPhrase);

        void onPhraseLongClick(ChatPhrase chatPhrase, int i);

        void onQuickReplyClick(QuickReply quickReply);

        void onQuoteClick(Quote quote);

        void onRatingClick(@NonNull Survey survey, int i);

        void onResolveThreadClick(boolean z);

        void onSystemMessageClick(SystemMessage systemMessage);

        void onUserPhraseClick(UserPhrase userPhrase, int i, View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ChatMessagesOrderer {
        private void addItemInternal(List<ChatItem> list, ChatItem chatItem) {
            if (list.size() == 0) {
                list.add(new DateRow(chatItem.getTimeStamp() - 2));
            }
            if (chatItem instanceof ConsultTyping) {
                ListIterator<ChatItem> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (listIterator.next() instanceof ConsultTyping) {
                        listIterator.remove();
                    }
                }
            }
            if (list.contains(chatItem)) {
                return;
            }
            if ((chatItem instanceof ConsultConnectionMessage) && !((ConsultConnectionMessage) chatItem).getDisplay()) {
                return;
            }
            if (chatItem instanceof Survey) {
                Survey survey = (Survey) chatItem;
                if (!survey.isCompleted()) {
                    if (survey.isDisplayMessage()) {
                        if (survey.getHideAfter() != null && (survey.getHideAfter().longValue() * 1000) + survey.getTimeStamp() <= System.currentTimeMillis()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if ((chatItem instanceof SimpleSystemMessage) && TextUtils.isEmpty(((SimpleSystemMessage) chatItem).getText())) {
                return;
            }
            list.add(chatItem);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTimeInMillis(chatItem.getTimeStamp());
            if (lastIndexOf(list, chatItem) != 0) {
                calendar2.setTimeInMillis(list.get(lastIndexOf(list, chatItem) - 1).getTimeStamp());
                if (calendar.get(6) != calendar2.get(6)) {
                    list.add(new DateRow(chatItem.getTimeStamp() - 2));
                }
            }
        }

        private void filter(@NonNull List<ChatItem> list, ClientNotificationDisplayType clientNotificationDisplayType, long j) {
            if (clientNotificationDisplayType == ClientNotificationDisplayType.ALL) {
                return;
            }
            HashSet hashSet = new HashSet();
            for (int size = list.size() - 1; size >= 0; size--) {
                ChatItem chatItem = list.get(size);
                if (chatItem instanceof SystemMessage) {
                    boolean equals = ((SystemMessage) chatItem).getType().equals(ChatItemType.CLIENT_BLOCKED.name());
                    if (!p57.a(chatItem.getThreadId(), Long.valueOf(j)) && !equals) {
                        list.remove(chatItem);
                    }
                    if (clientNotificationDisplayType == ClientNotificationDisplayType.CURRENT_THREAD_WITH_GROUPING) {
                        String type = ((SystemMessage) chatItem).getType();
                        if (hashSet.contains(type)) {
                            list.remove(chatItem);
                        } else {
                            hashSet.add(type);
                        }
                    }
                }
            }
        }

        private int indexOf(@NonNull List<ChatItem> list, @NonNull ChatItem chatItem) {
            for (int i = 0; i < list.size(); i++) {
                if (chatItem.isTheSameItem(list.get(i))) {
                    return i;
                }
            }
            return -1;
        }

        private void insertSpacing(List<ChatItem> list) {
            if (list.size() < 2) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                ChatItem chatItem = list.get(i);
                ChatItem chatItem2 = list.get(i - 1);
                boolean z = chatItem2 instanceof UserPhrase;
                if (z && (chatItem instanceof ConsultPhrase)) {
                    list.add(i, new Space(24, chatItem2.getTimeStamp() + 1));
                } else if (z && (chatItem instanceof SystemMessage)) {
                    list.add(i, new Space(12, chatItem2.getTimeStamp() + 1));
                } else {
                    boolean z2 = chatItem2 instanceof ConsultPhrase;
                    if (z2 && (chatItem instanceof UserPhrase)) {
                        list.add(i, new Space(12, chatItem2.getTimeStamp() + 1));
                    } else {
                        boolean z3 = chatItem2 instanceof SystemMessage;
                        if (z3 && (chatItem instanceof ConsultPhrase)) {
                            list.add(i, new Space(12, chatItem2.getTimeStamp() + 1));
                        } else if (z3 && (chatItem instanceof UserPhrase)) {
                            list.add(i, new Space(12, chatItem2.getTimeStamp() + 1));
                        } else if (z3 && (chatItem instanceof SystemMessage)) {
                            list.add(i, new Space(8, chatItem2.getTimeStamp() + 1));
                        } else if (z2 && (chatItem instanceof SystemMessage)) {
                            list.add(i, new Space(8, chatItem2.getTimeStamp() + 1));
                        } else if (!(chatItem2 instanceof Space) && (chatItem instanceof ConsultTyping)) {
                            list.add(i, new Space(8, chatItem2.getTimeStamp() + 1));
                        } else if (z2 && (chatItem instanceof ConsultPhrase)) {
                            list.add(i, new Space(0, chatItem2.getTimeStamp() + 1));
                        } else if (z && (chatItem instanceof UserPhrase)) {
                            list.add(i, new Space(0, chatItem2.getTimeStamp() + 1));
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$sortItemsByTimeStamp$0(ChatItem chatItem, ChatItem chatItem2) {
            return Long.compare(chatItem.getTimeStamp(), chatItem2.getTimeStamp());
        }

        private int lastIndexOf(@NonNull List<ChatItem> list, @NonNull ChatItem chatItem) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (chatItem.isTheSameItem(list.get(size))) {
                    return size;
                }
            }
            return -1;
        }

        private void removeAllSpacings(List<ChatItem> list) {
            Iterator<ChatItem> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof Space) {
                    it.remove();
                }
            }
        }

        private void sortItemsByTimeStamp(@NonNull List<ChatItem> list) {
            Comparator comparingLong;
            if (Build.VERSION.SDK_INT >= 24) {
                comparingLong = Comparator.comparingLong(new ToLongFunction() { // from class: by0
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((ChatItem) obj).getTimeStamp();
                    }
                });
                Collections.sort(list, comparingLong);
                return;
            }
            Collections.sort(list, new Comparator() { // from class: im.threads.ui.adapters.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$sortItemsByTimeStamp$0;
                    lambda$sortItemsByTimeStamp$0 = ChatAdapter.ChatMessagesOrderer.lambda$sortItemsByTimeStamp$0((ChatItem) obj, (ChatItem) obj2);
                    return lambda$sortItemsByTimeStamp$0;
                }
            });
        }

        private void updateConsultAvatarIfNeed(List<ChatItem> list, int i, int i2) {
            ChatItem chatItem = list.get(i);
            ChatItem chatItem2 = list.get(i2);
            if ((chatItem instanceof ConsultPhrase) && (chatItem2 instanceof ConsultPhrase)) {
                ConsultPhrase consultPhrase = (ConsultPhrase) chatItem2;
                String consultId = consultPhrase.getConsultId();
                ConsultPhrase consultPhrase2 = (ConsultPhrase) chatItem;
                String consultId2 = consultPhrase2.getConsultId();
                if (consultId2 != null && consultId2.equals(consultId)) {
                    ConsultPhrase copy = consultPhrase2.copy();
                    ConsultPhrase copy2 = consultPhrase.copy();
                    copy.setAvatarVisible(false);
                    copy2.setAvatarVisible(true);
                    list.set(i, copy);
                    list.set(i2, copy2);
                }
            }
        }

        void addAndOrder(@NonNull List<ChatItem> list, @NonNull List<ChatItem> list2, ClientNotificationDisplayType clientNotificationDisplayType, long j) {
            for (int i = 0; i < list2.size(); i++) {
                ChatItem chatItem = list2.get(i);
                int indexOf = indexOf(list, chatItem);
                if (indexOf == -1) {
                    addItemInternal(list, chatItem);
                } else {
                    list.set(indexOf, chatItem);
                }
            }
            orderAndFilter(list, clientNotificationDisplayType, j);
        }

        void orderAndFilter(@NonNull List<ChatItem> list, ClientNotificationDisplayType clientNotificationDisplayType, long j) {
            int i;
            sortItemsByTimeStamp(list);
            if (list.size() == 0) {
                return;
            }
            filter(list, clientNotificationDisplayType, j);
            boolean z = false;
            list.add(0, new DateRow(list.get(0).getTimeStamp() - 2));
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            ArrayList arrayList = new ArrayList();
            for (ChatItem chatItem : list) {
                if (chatItem instanceof DateRow) {
                    arrayList.add((DateRow) chatItem);
                }
            }
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (i2 != arrayList.size() - 1) {
                    calendar.setTimeInMillis(((DateRow) arrayList.get(i2)).getTimeStamp());
                    int i3 = i2 + 1;
                    calendar2.setTimeInMillis(((DateRow) arrayList.get(i3)).getTimeStamp());
                    if (calendar.get(6) == calendar2.get(6)) {
                        list.remove(arrayList.get(i3));
                    }
                    DateRow dateRow = (DateRow) arrayList.get(arrayList.size() - 1);
                    if (dateRow == list.get(list.size() - 1)) {
                        list.remove(dateRow);
                    }
                }
                i2++;
            }
            ConsultTyping consultTyping = null;
            SearchingConsult searchingConsult = null;
            for (ChatItem chatItem2 : list) {
                if (chatItem2 instanceof SearchingConsult) {
                    searchingConsult = (SearchingConsult) chatItem2;
                }
            }
            if (searchingConsult != null) {
                list.remove(searchingConsult);
                list.add(searchingConsult);
            }
            sortItemsByTimeStamp(list);
            for (ChatItem chatItem3 : list) {
                if (chatItem3 instanceof ConsultTyping) {
                    consultTyping = (ConsultTyping) chatItem3;
                    z = true;
                }
            }
            if (z && !(list.get(list.size() - 1) instanceof ConsultTyping)) {
                consultTyping.setTimeStamp(list.get(list.size() - 1).getTimeStamp() + 1);
            }
            sortItemsByTimeStamp(list);
            removeAllSpacings(list);
            for (i = 1; i < list.size(); i++) {
                updateConsultAvatarIfNeed(list, i - 1, i);
            }
            insertSpacing(list);
        }

        private ChatMessagesOrderer() {
        }
    }

    public ChatAdapter(@NonNull Callback callback, @NonNull FileDescriptionMediaPlayer fileDescriptionMediaPlayer, @NonNull MediaMetadataRetriever mediaMetadataRetriever, @NonNull ks8<Long> ks8Var) {
        long longValue;
        this.mCallback = callback;
        this.fdMediaPlayer = fileDescriptionMediaPlayer;
        this.mediaMetadataRetriever = mediaMetadataRetriever;
        this.messageErrorProcessor = ks8Var;
        PreferencesJavaUI preferencesJavaUI = new PreferencesJavaUI();
        this.clientNotificationDisplayType = preferencesJavaUI.getClientNotificationDisplayType();
        if (preferencesJavaUI.getThreadId() == null) {
            longValue = 0;
        } else {
            longValue = preferencesJavaUI.getThreadId().longValue();
        }
        this.currentThreadId = longValue;
        this.chatMessagesOrderer = new ChatMessagesOrderer();
    }

    private void bindConsultIsTypingVH(@NonNull ConsultIsTypingViewHolderNew consultIsTypingViewHolderNew) {
        final ConsultTyping consultTyping = (ConsultTyping) getList().get(consultIsTypingViewHolderNew.getAdapterPosition());
        consultIsTypingViewHolderNew.onBind(consultTyping, new View.OnClickListener() { // from class: tx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindConsultIsTypingVH$15(consultTyping, view);
            }
        });
    }

    private void bindConsultPhraseVH(@NonNull final ConsultPhraseHolder consultPhraseHolder, final ConsultPhrase consultPhrase) {
        downloadImageIfNeeded(consultPhrase.getFileDescription());
        consultPhraseHolder.onBind(consultPhrase, consultPhrase.equals(this.highlightedItem), new View.OnClickListener() { // from class: nx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindConsultPhraseVH$3(consultPhrase, view);
            }
        }, new View.OnClickListener() { // from class: px0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindConsultPhraseVH$4(consultPhrase, view);
            }
        }, new View.OnClickListener() { // from class: qx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindConsultPhraseVH$5(consultPhrase, view);
            }
        }, new View.OnLongClickListener() { // from class: rx0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$bindConsultPhraseVH$6;
                lambda$bindConsultPhraseVH$6 = ChatAdapter.this.lambda$bindConsultPhraseVH$6(consultPhrase, consultPhraseHolder, view);
                return lambda$bindConsultPhraseVH$6;
            }
        }, new View.OnClickListener() { // from class: sx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindConsultPhraseVH$7(consultPhrase, view);
            }
        });
    }

    private void bindFileFromConsultVH(@NonNull final ConsultFileViewHolder consultFileViewHolder, @NonNull final ConsultPhrase consultPhrase) {
        consultFileViewHolder.onBind(consultPhrase, consultPhrase.equals(this.highlightedItem), new View.OnClickListener() { // from class: dx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindFileFromConsultVH$24(consultPhrase, view);
            }
        }, new View.OnLongClickListener() { // from class: ex0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$bindFileFromConsultVH$25;
                lambda$bindFileFromConsultVH$25 = ChatAdapter.this.lambda$bindFileFromConsultVH$25(consultPhrase, consultFileViewHolder, view);
                return lambda$bindFileFromConsultVH$25;
            }
        }, new View.OnClickListener() { // from class: fx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindFileFromConsultVH$26(consultPhrase, view);
            }
        }, new View.OnClickListener() { // from class: gx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindFileFromConsultVH$27(consultPhrase, view);
            }
        });
    }

    private void bindFileFromUserVH(@NonNull final UserFileViewHolder userFileViewHolder, final UserPhrase userPhrase) {
        userFileViewHolder.onBind(userPhrase, new View.OnClickListener() { // from class: ox0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindFileFromUserVH$21(userPhrase, view);
            }
        }, new View.OnClickListener() { // from class: ux0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindFileFromUserVH$22(userPhrase, userFileViewHolder, view);
            }
        }, new View.OnLongClickListener() { // from class: vx0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$bindFileFromUserVH$23;
                lambda$bindFileFromUserVH$23 = ChatAdapter.this.lambda$bindFileFromUserVH$23(userPhrase, userFileViewHolder, view);
                return lambda$bindFileFromUserVH$23;
            }
        }, userPhrase.equals(this.highlightedItem));
    }

    private void bindImageFromConsultVH(@NonNull final ImageFromConsultViewHolder imageFromConsultViewHolder, final ConsultPhrase consultPhrase) {
        downloadImageIfNeeded(consultPhrase.getFileDescription());
        imageFromConsultViewHolder.onBind(consultPhrase, consultPhrase.equals(this.highlightedItem), new View.OnClickListener() { // from class: hx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindImageFromConsultVH$16(consultPhrase, view);
            }
        }, new View.OnLongClickListener() { // from class: ix0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$bindImageFromConsultVH$17;
                lambda$bindImageFromConsultVH$17 = ChatAdapter.this.lambda$bindImageFromConsultVH$17(consultPhrase, imageFromConsultViewHolder, view);
                return lambda$bindImageFromConsultVH$17;
            }
        }, new View.OnClickListener() { // from class: jx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindImageFromConsultVH$18(consultPhrase, view);
            }
        });
    }

    private void bindImageFromUserVH(@NonNull final ImageFromUserViewHolder imageFromUserViewHolder, final UserPhrase userPhrase) {
        downloadImageIfNeeded(userPhrase.getFileDescription());
        if (userPhrase.getFileDescription() != null) {
            imageFromUserViewHolder.onBind(userPhrase, userPhrase.equals(this.highlightedItem), new Runnable() { // from class: kx0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAdapter.this.lambda$bindImageFromUserVH$19(userPhrase);
                }
            }, new Runnable() { // from class: lx0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAdapter.this.lambda$bindImageFromUserVH$20(userPhrase, imageFromUserViewHolder);
                }
            });
        }
    }

    private void bindSystemMessageVH(@NonNull final SystemMessageViewHolder systemMessageViewHolder, SystemMessage systemMessage) {
        systemMessageViewHolder.onBind(systemMessage, new View.OnClickListener() { // from class: cx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindSystemMessageVH$2(systemMessageViewHolder, view);
            }
        });
    }

    @SuppressLint({"RestrictedApi"})
    private void bindUserPhraseVH(@NonNull final UserPhraseViewHolder userPhraseViewHolder, final UserPhrase userPhrase) {
        String str;
        downloadImageIfNeeded(userPhrase.getFileDescription());
        downloadVoiceIfNeeded(userPhrase.getFileDescription());
        if (userPhrase.getFileDescription() != null) {
            str = userPhrase.getFileDescription().getVoiceFormattedDuration();
        } else {
            str = "";
        }
        userPhraseViewHolder.onBind(userPhrase, str, new View.OnClickListener() { // from class: uw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindUserPhraseVH$8(userPhrase, view);
            }
        }, new View.OnClickListener() { // from class: vw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindUserPhraseVH$9(userPhrase, view);
            }
        }, new View.OnClickListener() { // from class: ww0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindUserPhraseVH$10(userPhraseViewHolder, view);
            }
        }, new View.OnClickListener() { // from class: xw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindUserPhraseVH$11(userPhrase, userPhraseViewHolder, view);
            }
        }, new ay0(this), new Slider.b() { // from class: im.threads.ui.adapters.ChatAdapter.1
            @Override // defpackage.e80
            public void onStartTrackingTouch(@NonNull Slider slider) {
                ChatAdapter.this.ignorePlayerUpdates = true;
            }

            @Override // defpackage.e80
            public void onStopTrackingTouch(@NonNull Slider slider) {
                ChatAdapter.this.ignorePlayerUpdates = false;
            }
        }, new View.OnClickListener() { // from class: yw0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindUserPhraseVH$13(userPhrase, view);
            }
        }, new View.OnLongClickListener() { // from class: zw0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$bindUserPhraseVH$14;
                lambda$bindUserPhraseVH$14 = ChatAdapter.this.lambda$bindUserPhraseVH$14(userPhrase, userPhraseViewHolder, view);
                return lambda$bindUserPhraseVH$14;
            }
        }, userPhrase.equals(this.highlightedItem));
        if (p57.a(userPhraseViewHolder.getFileDescription(), this.fdMediaPlayer.getFileDescription())) {
            MediaPlayer mediaPlayer = this.fdMediaPlayer.getMediaPlayer();
            if (mediaPlayer != null) {
                int duration = this.fdMediaPlayer.getDuration();
                int currentPosition = mediaPlayer.getCurrentPosition();
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                userPhraseViewHolder.init(duration, currentPosition, mediaPlayer.isPlaying());
            }
            this.playingHolder = userPhraseViewHolder;
            return;
        }
        userPhraseViewHolder.resetProgress();
    }

    @SuppressLint({"RestrictedApi"})
    private void bindVoiceMessageFromConsultVH(@NonNull final ConsultVoiceMessageViewHolder consultVoiceMessageViewHolder, final ConsultPhrase consultPhrase) {
        String str;
        downloadVoiceIfNeeded(consultPhrase.getFileDescription());
        if (consultPhrase.getFileDescription() != null) {
            str = consultPhrase.getFileDescription().getVoiceFormattedDuration();
        } else {
            str = "";
        }
        consultVoiceMessageViewHolder.onBind(consultPhrase, consultPhrase.equals(this.highlightedItem), str, new View.OnLongClickListener() { // from class: wx0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean lambda$bindVoiceMessageFromConsultVH$28;
                lambda$bindVoiceMessageFromConsultVH$28 = ChatAdapter.this.lambda$bindVoiceMessageFromConsultVH$28(consultPhrase, consultVoiceMessageViewHolder, view);
                return lambda$bindVoiceMessageFromConsultVH$28;
            }
        }, new View.OnClickListener() { // from class: xx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindVoiceMessageFromConsultVH$29(consultPhrase, view);
            }
        }, new View.OnClickListener() { // from class: yx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindVoiceMessageFromConsultVH$30(consultPhrase, view);
            }
        }, new View.OnClickListener() { // from class: zx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatAdapter.this.lambda$bindVoiceMessageFromConsultVH$31(consultVoiceMessageViewHolder, view);
            }
        }, new ay0(this), new Slider.b() { // from class: im.threads.ui.adapters.ChatAdapter.2
            @Override // defpackage.e80
            public void onStartTrackingTouch(@NonNull Slider slider) {
                ChatAdapter.this.ignorePlayerUpdates = true;
            }

            @Override // defpackage.e80
            public void onStopTrackingTouch(@NonNull Slider slider) {
                ChatAdapter.this.ignorePlayerUpdates = false;
            }
        });
        if (p57.a(consultVoiceMessageViewHolder.getFileDescription(), this.fdMediaPlayer.getFileDescription())) {
            MediaPlayer mediaPlayer = this.fdMediaPlayer.getMediaPlayer();
            if (mediaPlayer != null) {
                consultVoiceMessageViewHolder.init(mediaPlayer.getDuration(), mediaPlayer.getCurrentPosition(), mediaPlayer.isPlaying());
            }
            this.playingHolder = consultVoiceMessageViewHolder;
            return;
        }
        consultVoiceMessageViewHolder.resetProgress();
    }

    private void changeSurveyState(ChatItem chatItem, MessageStatus messageStatus) {
        ((Survey) chatItem).setSentState(messageStatus);
        notifyItemChangedOnUi(chatItem);
    }

    private void checkIdsForReplacingToNull(@NonNull List<ChatItem> list) {
        ArrayList<ChatItem> list2 = getList();
        for (ChatItem chatItem : list) {
            for (ChatItem chatItem2 : list2) {
                if (chatItem.isTheSameItem(chatItem2) && (chatItem instanceof UserPhrase)) {
                    UserPhrase userPhrase = (UserPhrase) chatItem2;
                    UserPhrase userPhrase2 = (UserPhrase) chatItem;
                    if (!TextUtils.isEmpty(userPhrase.getBackendMessageId()) && TextUtils.isEmpty(userPhrase2.getBackendMessageId())) {
                        userPhrase2.setBackendMessageId(userPhrase.getBackendMessageId());
                    }
                }
            }
        }
    }

    private void downloadImageIfNeeded(FileDescription fileDescription) {
        FileDescription previewFileDescription;
        if (fileDescription != null && (previewFileDescription = fileDescription.getPreviewFileDescription()) != null && FileUtils.isImage(previewFileDescription) && previewFileDescription.getFileUri() == null) {
            this.mCallback.onFileDownloadRequest(previewFileDescription, true);
        }
    }

    private void downloadVoiceIfNeeded(FileDescription fileDescription) {
        if (fileDescription != null && FileUtils.isVoiceMessage(fileDescription) && fileDescription.getFileUri() == null) {
            this.mCallback.onFileDownloadRequest(fileDescription, false);
        }
    }

    private ChatItem findByFileDescription(FileDescription fileDescription) {
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if (next instanceof ConsultPhrase) {
                ConsultPhrase consultPhrase = (ConsultPhrase) next;
                if (p57.a(consultPhrase.getFileDescription(), fileDescription)) {
                    return consultPhrase;
                }
            } else if (next instanceof UserPhrase) {
                UserPhrase userPhrase = (UserPhrase) next;
                if (p57.a(userPhrase.getFileDescription(), fileDescription)) {
                    return userPhrase;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    private boolean isImageChanged(FileDescription fileDescription, FileDescription fileDescription2) {
        if (fileDescription.getState() == fileDescription2.getState() && fileDescription2.getDownloadProgress() != 0 && fileDescription2.getDownloadProgress() != 100) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindConsultIsTypingVH$15(ConsultTyping consultTyping, View view) {
        this.mCallback.onConsultAvatarClick(consultTyping.getConsultId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindConsultPhraseVH$3(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onImageClick(consultPhrase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindConsultPhraseVH$4(ConsultPhrase consultPhrase, View view) {
        if (consultPhrase.getQuote() != null && consultPhrase.getQuote().getFileDescription() != null) {
            this.mCallback.onFileClick(consultPhrase.getQuote().getFileDescription());
        }
        if (consultPhrase.getFileDescription() != null) {
            this.mCallback.onFileClick(consultPhrase.getFileDescription());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindConsultPhraseVH$5(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onQuoteClick(consultPhrase.getQuote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindConsultPhraseVH$6(ConsultPhrase consultPhrase, ConsultPhraseHolder consultPhraseHolder, View view) {
        phraseLongClick(consultPhrase, consultPhraseHolder.getAdapterPosition());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindConsultPhraseVH$7(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onConsultAvatarClick(consultPhrase.getConsultId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindFileFromConsultVH$24(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onFileClick(consultPhrase.getFileDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindFileFromConsultVH$25(ConsultPhrase consultPhrase, ConsultFileViewHolder consultFileViewHolder, View view) {
        phraseLongClick(consultPhrase, consultFileViewHolder.getAdapterPosition());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindFileFromConsultVH$26(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onQuoteClick(consultPhrase.getQuote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindFileFromConsultVH$27(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onConsultAvatarClick(consultPhrase.getConsultId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindFileFromUserVH$21(UserPhrase userPhrase, View view) {
        this.mCallback.onFileClick(userPhrase.getFileDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindFileFromUserVH$22(UserPhrase userPhrase, UserFileViewHolder userFileViewHolder, View view) {
        this.mCallback.onUserPhraseClick(userPhrase, userFileViewHolder.getAdapterPosition(), userFileViewHolder.itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindFileFromUserVH$23(UserPhrase userPhrase, UserFileViewHolder userFileViewHolder, View view) {
        phraseLongClick(userPhrase, userFileViewHolder.getAdapterPosition());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindImageFromConsultVH$16(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onImageClick(consultPhrase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindImageFromConsultVH$17(ConsultPhrase consultPhrase, ImageFromConsultViewHolder imageFromConsultViewHolder, View view) {
        this.mCallback.onPhraseLongClick(consultPhrase, imageFromConsultViewHolder.getAdapterPosition());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindImageFromConsultVH$18(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onConsultAvatarClick(consultPhrase.getConsultId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindImageFromUserVH$19(UserPhrase userPhrase) {
        this.mCallback.onImageClick(userPhrase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindImageFromUserVH$20(UserPhrase userPhrase, ImageFromUserViewHolder imageFromUserViewHolder) {
        this.mCallback.onPhraseLongClick(userPhrase, imageFromUserViewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindSystemMessageVH$2(SystemMessageViewHolder systemMessageViewHolder, View view) {
        this.mCallback.onSystemMessageClick((SystemMessage) getList().get(systemMessageViewHolder.getAdapterPosition()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindUserPhraseVH$10(UserPhraseViewHolder userPhraseViewHolder, View view) {
        onVoiceMessagePlayClick(userPhraseViewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindUserPhraseVH$11(UserPhrase userPhrase, UserPhraseViewHolder userPhraseViewHolder, View view) {
        this.mCallback.onUserPhraseClick(userPhrase, userPhraseViewHolder.getAdapterPosition(), userPhraseViewHolder.itemView);
    }

    private /* synthetic */ void lambda$bindUserPhraseVH$12(Slider slider, float f, boolean z) {
        MediaPlayer mediaPlayer;
        if (z && (mediaPlayer = this.fdMediaPlayer.getMediaPlayer()) != null) {
            mediaPlayer.seekTo((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindUserPhraseVH$13(UserPhrase userPhrase, View view) {
        this.mCallback.onQuoteClick(userPhrase.getQuote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindUserPhraseVH$14(UserPhrase userPhrase, UserPhraseViewHolder userPhraseViewHolder, View view) {
        phraseLongClick(userPhrase, userPhraseViewHolder.getAdapterPosition());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindUserPhraseVH$8(UserPhrase userPhrase, View view) {
        this.mCallback.onImageClick(userPhrase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindUserPhraseVH$9(UserPhrase userPhrase, View view) {
        if (userPhrase.getFileDescription() != null) {
            this.mCallback.onFileClick(userPhrase.getFileDescription());
        } else if (userPhrase.getQuote() != null && userPhrase.getQuote().getFileDescription() != null) {
            this.mCallback.onFileClick(userPhrase.getQuote().getFileDescription());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$bindVoiceMessageFromConsultVH$28(ConsultPhrase consultPhrase, ConsultVoiceMessageViewHolder consultVoiceMessageViewHolder, View view) {
        phraseLongClick(consultPhrase, consultVoiceMessageViewHolder.getAdapterPosition());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindVoiceMessageFromConsultVH$29(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onQuoteClick(consultPhrase.getQuote());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindVoiceMessageFromConsultVH$30(ConsultPhrase consultPhrase, View view) {
        this.mCallback.onConsultAvatarClick(consultPhrase.getConsultId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindVoiceMessageFromConsultVH$31(ConsultVoiceMessageViewHolder consultVoiceMessageViewHolder, View view) {
        onVoiceMessagePlayClick(consultVoiceMessageViewHolder);
    }

    private /* synthetic */ void lambda$bindVoiceMessageFromConsultVH$32(Slider slider, float f, boolean z) {
        MediaPlayer mediaPlayer;
        if (z && (mediaPlayer = this.fdMediaPlayer.getMediaPlayer()) != null) {
            mediaPlayer.seekTo((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyItemChangedOnUi$1(ChatItem chatItem) {
        notifyItemChanged(ChatItemListFinder.indexOf(getList(), chatItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(Survey survey, int i) {
        this.mCallback.onRatingClick(survey, i);
    }

    private void notifyItemChangedOnUi(final ChatItem chatItem) {
        ThreadRunnerKt.runOnUiThread(new Runnable() { // from class: bx0
            @Override // java.lang.Runnable
            public final void run() {
                ChatAdapter.this.lambda$notifyItemChangedOnUi$1(chatItem);
            }
        });
    }

    private void onVoiceMessagePlayClick(VoiceMessageBaseHolder voiceMessageBaseHolder) {
        if (voiceMessageBaseHolder.getFileDescription() == null) {
            return;
        }
        if (voiceMessageBaseHolder.getFileDescription().getFileUri() == null) {
            this.fdMediaPlayer.setClickedDownloadPath(voiceMessageBaseHolder.getFileDescription().getDownloadPath());
            voiceMessageBaseHolder.startLoader();
            FileDownloadWorker.startDownload(this.ctx, voiceMessageBaseHolder.getFileDescription(), false, false);
            return;
        }
        this.fdMediaPlayer.clearClickedDownloadPath();
        voiceMessageBaseHolder.stopLoader();
        this.fdMediaPlayer.processPlayPause(voiceMessageBaseHolder.getFileDescription());
    }

    private void phraseLongClick(ChatPhrase chatPhrase, int i) {
        this.mCallback.onPhraseLongClick(chatPhrase, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsultIsTyping() {
        ListIterator<ChatItem> listIterator = getList().listIterator();
        while (listIterator.hasNext()) {
            ChatItem next = listIterator.next();
            if (next instanceof ConsultTyping) {
                try {
                    notifyItemRemoved(ChatItemListFinder.lastIndexOf(getList(), next));
                } catch (Exception e) {
                    LoggerEdna.error("removeConsultIsTyping", e);
                }
                listIterator.remove();
            }
        }
    }

    private void removeSurveyIfNotLatest(ArrayList<ChatItem> arrayList) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (arrayList != null && arrayList.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z && (arrayList.get(arrayList.size() - 2) instanceof Survey)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && (arrayList.get(arrayList.size() - 1) instanceof Survey)) {
            z3 = true;
        }
        if (z2 && !z3) {
            for (int size = arrayList.size() - 2; size >= 0 && (arrayList.get(size) instanceof Survey); size--) {
                if (!((Survey) arrayList.get(size)).isCompleted()) {
                    arrayList.remove(size);
                }
            }
        }
    }

    private void setupMaskTransformations() {
        if (this.outgoingImageMaskTransformation == null || this.incomingImageMaskTransformation == null) {
            ChatStyle chatStyle = Config.getInstance().getChatStyle();
            Drawable e = iu1.e(this.ctx, chatStyle.outgoingImageBubbleMask);
            Objects.requireNonNull(e);
            this.outgoingImageMaskTransformation = new ImageModifications.MaskedModification(e);
            Drawable e2 = iu1.e(this.ctx, chatStyle.incomingImageBubbleMask);
            Objects.requireNonNull(e2);
            this.incomingImageMaskTransformation = new ImageModifications.MaskedModification(e2);
        }
    }

    private void updateReadStateForConsultPhrase(ConsultPhrase consultPhrase) {
        List<String> a;
        if (!consultPhrase.getRead() && consultPhrase.getId() != null) {
            Transport transport = BaseConfig.Companion.getInstance().transport;
            a = tw0.a(new Object[]{consultPhrase.getId()});
            transport.markMessagesAsRead(a);
        }
    }

    public void addItems(@NonNull List<ChatItem> list, gr5 gr5Var, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        ChatItem next;
        checkIdsForReplacingToNull(list);
        List<ChatItem> splitSurveyQuestions = SurveySplitterKt.splitSurveyQuestions(list);
        Iterator<ChatItem> it = splitSurveyQuestions.iterator();
        do {
            i = 0;
            if (it.hasNext()) {
                next = it.next();
                if (next instanceof ConsultTyping) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            z3 = false;
            break;
        } while (!(next instanceof RequestResolveThread));
        z2 = false;
        z3 = true;
        if (z2) {
            removeConsultIsTyping();
            this.viewHandler.removeCallbacksAndMessages(null);
            this.viewHandler.postDelayed(new Runnable() { // from class: mx0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatAdapter.this.removeConsultIsTyping();
                }
            }, 8000L);
        }
        if (splitSurveyQuestions.size() == 1 && (splitSurveyQuestions.get(0) instanceof ConsultPhrase)) {
            removeConsultIsTyping();
        }
        if (z3) {
            removeResolveRequest();
        }
        ArrayList<ChatItem> arrayList = new ArrayList<>(getList());
        this.chatMessagesOrderer.addAndOrder(arrayList, splitSurveyQuestions, this.clientNotificationDisplayType, this.currentThreadId);
        if (z) {
            notifyDatasetChangedWithDiffUtil(arrayList, gr5Var);
            return;
        }
        int itemCount = getItemCount();
        int i2 = itemCount - 1;
        if (i2 >= 0) {
            i = i2;
        }
        getList().clear();
        getList().addAll(arrayList);
        notifyDataSetChanged();
        int size = arrayList.size();
        if (itemCount != size && gr5Var != null) {
            gr5Var.onInserted(i, size);
        }
    }

    public void changeStateOfMessageByMessageId(String str, String str2, MessageStatus messageStatus) {
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if (next instanceof UserPhrase) {
                UserPhrase userPhrase = (UserPhrase) next;
                if (str != null) {
                    String[] split = str.split(":");
                    if (split.length > 1) {
                        str = split[1];
                    }
                }
                if (p57.a(str, userPhrase.getId()) || p57.a(str2, userPhrase.getBackendMessageId())) {
                    if (str2 != null) {
                        userPhrase.setBackendMessageId(str2);
                    }
                    if (userPhrase.getSentState().ordinal() < messageStatus.ordinal()) {
                        userPhrase.setSentState(messageStatus);
                        notifyItemChangedOnUi(next);
                    }
                }
            }
        }
    }

    public void changeStateOfSurvey(Survey survey) {
        boolean z;
        boolean z2;
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if (next instanceof Survey) {
                Survey survey2 = (Survey) next;
                if (survey.getSendingId() == survey2.getSendingId()) {
                    boolean z3 = false;
                    if (survey2.getQuestions() != null && survey2.getQuestions().size() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (survey.getQuestions() != null && survey.getQuestions().size() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z && !z2) {
                        Iterator<QuestionDTO> it2 = survey.getQuestions().iterator();
                        while (it2.hasNext()) {
                            QuestionDTO next2 = it2.next();
                            if (z3) {
                                break;
                            }
                            Iterator<QuestionDTO> it3 = survey2.getQuestions().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    QuestionDTO next3 = it3.next();
                                    if (next3.getId() == next2.getId() && next3.getCorrelationId().equals(next2.getCorrelationId())) {
                                        changeSurveyState(next, survey.getSentState());
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        changeSurveyState(next, survey.getSentState());
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return getList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        try {
            ChatItem chatItem = getList().get(i);
            if (chatItem instanceof SystemMessage) {
                return 4;
            }
            if (chatItem instanceof ConsultTyping) {
                return 1;
            }
            if (chatItem instanceof DateRow) {
                return 2;
            }
            if (chatItem instanceof SearchingConsult) {
                return 3;
            }
            if (chatItem instanceof Space) {
                return 7;
            }
            if (chatItem instanceof UnreadMessages) {
                return 12;
            }
            if (chatItem instanceof ScheduleInfo) {
                return 13;
            }
            if (chatItem instanceof RequestResolveThread) {
                return 18;
            }
            if (chatItem instanceof ConsultPhrase) {
                ConsultPhrase consultPhrase = (ConsultPhrase) chatItem;
                if (consultPhrase.isVoiceMessage() && consultPhrase.getModified() != ModificationStateEnum.DELETED) {
                    return 19;
                }
                if (consultPhrase.isOnlyImage() && consultPhrase.getModified() != ModificationStateEnum.DELETED) {
                    return 8;
                }
                if (consultPhrase.isOnlyDoc() && consultPhrase.getModified() != ModificationStateEnum.DELETED) {
                    return 11;
                }
                return 5;
            } else if (chatItem instanceof UserPhrase) {
                UserPhrase userPhrase = (UserPhrase) chatItem;
                if (userPhrase.isOnlyImage()) {
                    return 9;
                }
                if (userPhrase.isOnlyDoc()) {
                    return 10;
                }
                return 6;
            } else {
                if (chatItem instanceof Survey) {
                    Survey survey = (Survey) chatItem;
                    if (!survey.getQuestions().isEmpty()) {
                        if (survey.getQuestions().get(0).getSimple()) {
                            if (survey.isCompleted()) {
                                return 15;
                            }
                            return 14;
                        } else if (survey.isCompleted()) {
                            return 17;
                        } else {
                            return 16;
                        }
                    }
                }
                if (!(chatItem instanceof QuickReplyItem)) {
                    return 0;
                }
                return 20;
            }
        } catch (IndexOutOfBoundsException e) {
            LoggerEdna.error("getItemViewType", e);
            return 0;
        }
    }

    public ArrayList<ChatItem> getList() {
        return this.list;
    }

    public int getPositionByTimeStamp(long j) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getTimeStamp() == j) {
                return i;
            }
        }
        return -1;
    }

    public boolean hasSchedule() {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i) instanceof ScheduleInfo) {
                return true;
            }
        }
        return false;
    }

    public void modifyImageInItem(FileDescription fileDescription) {
        boolean z;
        boolean z2;
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i) instanceof ChatPhrase) {
                ChatPhrase chatPhrase = (ChatPhrase) getList().get(i);
                FileDescription fileDescription2 = chatPhrase.getFileDescription();
                String originalPath = fileDescription.getOriginalPath();
                boolean z3 = true;
                if (fileDescription2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && fileDescription2.getDownloadPath() != null && fileDescription2.getDownloadPath().equals(originalPath)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = (z && fileDescription2.getFileUri() != null && fileDescription2.getFileUri().toString().equals(originalPath)) ? false : false;
                if (z2 || z3) {
                    FileDescription fileDescription3 = chatPhrase.getFileDescription();
                    fileDescription3.setDownloadPath(fileDescription.getDownloadPath());
                    fileDescription3.setState(fileDescription.getState());
                    fileDescription3.setIncomingName(fileDescription.getIncomingName());
                    fileDescription3.setMimeType(fileDescription.getMimeType());
                    fileDescription3.setSize(fileDescription.getSize());
                    getList().set(i, chatPhrase);
                    notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    public void notifyAvatarChanged(String str, String str2) {
        String avatarPath;
        if (str != null && str2 != null) {
            Iterator<ChatItem> it = getList().iterator();
            while (it.hasNext()) {
                ChatItem next = it.next();
                if (next instanceof ConsultPhrase) {
                    ConsultPhrase consultPhrase = (ConsultPhrase) next;
                    if (Objects.equals(consultPhrase.getConsultId(), str2) && ((avatarPath = consultPhrase.getAvatarPath()) == null || !avatarPath.equals(str))) {
                        consultPhrase.setAvatarPath(str);
                        notifyItemChanged(ChatItemListFinder.lastIndexOf(getList(), consultPhrase));
                    }
                }
            }
        }
    }

    public void notifyDatasetChangedWithDiffUtil(ArrayList<ChatItem> arrayList, gr5 gr5Var) {
        removeSurveyIfNotLatest(arrayList);
        e.C0047e b = e.b(new ChatDiffCallback(getList(), arrayList));
        getList().clear();
        getList().addAll(arrayList);
        if (gr5Var != null) {
            b.b(gr5Var);
        } else {
            b.c(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NonNull RecyclerView.d0 d0Var, int i) {
        setupMaskTransformations();
        if (d0Var instanceof SystemMessageViewHolder) {
            bindSystemMessageVH((SystemMessageViewHolder) d0Var, (SystemMessage) getList().get(i));
        } else if (d0Var instanceof ConsultPhraseHolder) {
            ConsultPhrase consultPhrase = (ConsultPhrase) getList().get(i);
            bindConsultPhraseVH((ConsultPhraseHolder) d0Var, consultPhrase);
            updateReadStateForConsultPhrase(consultPhrase);
        } else if (d0Var instanceof UserPhraseViewHolder) {
            bindUserPhraseVH((UserPhraseViewHolder) d0Var, (UserPhrase) getList().get(i));
        } else if (d0Var instanceof DateViewHolder) {
            ((DateViewHolder) d0Var).onBind(getList().get(i).getTimeStamp());
        } else if (d0Var instanceof ConsultIsTypingViewHolderNew) {
            bindConsultIsTypingVH((ConsultIsTypingViewHolderNew) d0Var);
        } else if (d0Var instanceof SpaceViewHolder) {
            ((SpaceViewHolder) d0Var).onBind((int) TypedValue.applyDimension(1, ((Space) getList().get(i)).getHeight(), this.ctx.getResources().getDisplayMetrics()));
        } else if (d0Var instanceof ImageFromConsultViewHolder) {
            ConsultPhrase consultPhrase2 = (ConsultPhrase) getList().get(i);
            bindImageFromConsultVH((ImageFromConsultViewHolder) d0Var, consultPhrase2);
            updateReadStateForConsultPhrase(consultPhrase2);
        } else if (d0Var instanceof ImageFromUserViewHolder) {
            bindImageFromUserVH((ImageFromUserViewHolder) d0Var, (UserPhrase) getList().get(i));
        } else if (d0Var instanceof UserFileViewHolder) {
            bindFileFromUserVH((UserFileViewHolder) d0Var, (UserPhrase) getList().get(i));
        } else if (d0Var instanceof ConsultFileViewHolder) {
            ConsultPhrase consultPhrase3 = (ConsultPhrase) getList().get(i);
            bindFileFromConsultVH((ConsultFileViewHolder) d0Var, consultPhrase3);
            updateReadStateForConsultPhrase(consultPhrase3);
        } else if (d0Var instanceof UnreadMessageViewHolder) {
            ((UnreadMessageViewHolder) d0Var).onBind((UnreadMessages) getList().get(d0Var.getAdapterPosition()));
        } else if (d0Var instanceof ScheduleInfoViewHolder) {
            ((ScheduleInfoViewHolder) d0Var).bind((ScheduleInfo) getList().get(d0Var.getAdapterPosition()));
        } else if (d0Var instanceof RatingThumbsViewHolder) {
            ((RatingThumbsViewHolder) d0Var).bind((Survey) getList().get(d0Var.getAdapterPosition()), this.mCallback);
        } else if (d0Var instanceof RatingThumbsSentViewHolder) {
            ((RatingThumbsSentViewHolder) d0Var).bind((Survey) getList().get(d0Var.getAdapterPosition()));
        } else if (d0Var instanceof RatingStarsViewHolder) {
            final Survey survey = (Survey) getList().get(d0Var.getAdapterPosition());
            ((RatingStarsViewHolder) d0Var).bind(survey, new Rating.CallBackListener() { // from class: ax0
                @Override // im.threads.ui.widget.Rating.CallBackListener
                public final void onStarClick(int i2) {
                    ChatAdapter.this.lambda$onBindViewHolder$0(survey, i2);
                }
            });
        } else if (d0Var instanceof RatingStarsSentViewHolder) {
            ((RatingStarsSentViewHolder) d0Var).bind((Survey) getList().get(d0Var.getAdapterPosition()));
        } else if (d0Var instanceof RequestResolveThreadViewHolder) {
            ((RequestResolveThreadViewHolder) d0Var).bind(this.mCallback);
        } else if (d0Var instanceof ConsultVoiceMessageViewHolder) {
            ConsultPhrase consultPhrase4 = (ConsultPhrase) getList().get(i);
            bindVoiceMessageFromConsultVH((ConsultVoiceMessageViewHolder) d0Var, consultPhrase4);
            updateReadStateForConsultPhrase(consultPhrase4);
        } else if (d0Var instanceof QuickRepliesViewHolder) {
            ((QuickRepliesViewHolder) d0Var).bind((QuickReplyItem) getList().get(i), this.mCallback);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NonNull
    public RecyclerView.d0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        this.ctx = viewGroup.getContext();
        switch (i) {
            case 1:
                return new ConsultIsTypingViewHolderNew(viewGroup);
            case 2:
                return new DateViewHolder(viewGroup);
            case 3:
                return new SearchingConsultViewHolder(viewGroup);
            case 4:
                return new SystemMessageViewHolder(viewGroup);
            case 5:
                return new ConsultPhraseHolder(viewGroup, this.incomingImageMaskTransformation, this.highlightingStream, this.openGraphParser);
            case 6:
                return new UserPhraseViewHolder(viewGroup, this.outgoingImageMaskTransformation, this.highlightingStream, this.openGraphParser, this.fdMediaPlayer, this.messageErrorProcessor);
            case 7:
                return new SpaceViewHolder(viewGroup);
            case 8:
                return new ImageFromConsultViewHolder(viewGroup, this.incomingImageMaskTransformation, this.highlightingStream, this.openGraphParser);
            case 9:
                return new ImageFromUserViewHolder(viewGroup, this.outgoingImageMaskTransformation, this.highlightingStream, this.openGraphParser, this.messageErrorProcessor);
            case 10:
                return new UserFileViewHolder(viewGroup, this.highlightingStream, this.openGraphParser, this.messageErrorProcessor);
            case 11:
                return new ConsultFileViewHolder(viewGroup, this.highlightingStream, this.openGraphParser);
            case 12:
                return new UnreadMessageViewHolder(viewGroup);
            case 13:
                return new ScheduleInfoViewHolder(viewGroup);
            case 14:
                return new RatingThumbsViewHolder(viewGroup);
            case 15:
                return new RatingThumbsSentViewHolder(viewGroup);
            case 16:
                return new RatingStarsViewHolder(viewGroup);
            case 17:
                return new RatingStarsSentViewHolder(viewGroup);
            case 18:
                return new RequestResolveThreadViewHolder(viewGroup);
            case 19:
                return new ConsultVoiceMessageViewHolder(viewGroup, this.highlightingStream, this.openGraphParser, this.fdMediaPlayer);
            case 20:
                return new QuickRepliesViewHolder(viewGroup);
            default:
                return new EmptyViewHolder(viewGroup);
        }
    }

    public void onDestroyView() {
        this.sendingStatusObserver.finishObserving();
    }

    public void onDownloadError(FileDescription fileDescription) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i) instanceof ChatPhrase) {
                ChatPhrase chatPhrase = (ChatPhrase) getList().get(i);
                int itemViewType = getItemViewType(i);
                if (p57.a(chatPhrase.getFileDescription(), fileDescription) && ((itemViewType == 9 || itemViewType == 8 || itemViewType == 6 || itemViewType == 19) && chatPhrase.getFileDescription() != null)) {
                    chatPhrase.getFileDescription().setDownloadError(true);
                    notifyItemChanged(i);
                }
            }
        }
    }

    public void onPauseView() {
        this.sendingStatusObserver.pauseObserving();
    }

    public void onResumeView() {
        this.sendingStatusObserver.startObserving();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NonNull RecyclerView.d0 d0Var) {
        super.onViewRecycled(d0Var);
        if (d0Var instanceof BaseHolder) {
            ((BaseHolder) d0Var).onClear();
        }
    }

    public void playerUpdate() {
        if (this.ignorePlayerUpdates) {
            return;
        }
        FileDescription fileDescription = this.fdMediaPlayer.getFileDescription();
        if (fileDescription != null) {
            VoiceMessageBaseHolder voiceMessageBaseHolder = this.playingHolder;
            if (voiceMessageBaseHolder != null && p57.a(voiceMessageBaseHolder.getFileDescription(), fileDescription)) {
                MediaPlayer mediaPlayer = this.fdMediaPlayer.getMediaPlayer();
                if (mediaPlayer != null) {
                    this.playingHolder.updateProgress(mediaPlayer.getCurrentPosition());
                    this.playingHolder.updateIsPlaying(mediaPlayer.isPlaying());
                    return;
                }
                return;
            }
            resetPlayingHolder();
            ChatItem findByFileDescription = findByFileDescription(fileDescription);
            if (findByFileDescription != null) {
                notifyItemChanged(ChatItemListFinder.lastIndexOf(getList(), findByFileDescription));
                return;
            }
            return;
        }
        resetPlayingHolder();
    }

    public void removeConsultSearching() {
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if (next instanceof SearchingConsult) {
                try {
                    notifyItemRemoved(ChatItemListFinder.lastIndexOf(getList(), next));
                } catch (Exception e) {
                    LoggerEdna.error("removeConsultSearching", e);
                }
                it.remove();
            }
        }
    }

    public void removeHighlight() {
        this.highlightingStream.d(new NoChatItem());
        this.highlightedItem = null;
    }

    public void removeItem(ChatItem chatItem) {
        int lastIndexOf = ChatItemListFinder.lastIndexOf(getList(), chatItem);
        if (lastIndexOf != -1) {
            getList().remove(lastIndexOf);
            notifyItemRemoved(lastIndexOf);
        }
    }

    public boolean removeResolveRequest() {
        ListIterator<ChatItem> listIterator = getList().listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            ChatItem next = listIterator.next();
            if (next instanceof RequestResolveThread) {
                try {
                    notifyItemRemoved(ChatItemListFinder.lastIndexOf(getList(), next));
                } catch (Exception e) {
                    LoggerEdna.error("removeResolveRequest", e);
                }
                listIterator.remove();
                z = true;
            }
        }
        return z;
    }

    public void removeSchedule(boolean z) {
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if (next instanceof ScheduleInfo) {
                ScheduleInfo scheduleInfo = (ScheduleInfo) next;
                if (!z || scheduleInfo.isChatWorking()) {
                    try {
                        notifyItemRemoved(ChatItemListFinder.lastIndexOf(getList(), scheduleInfo));
                    } catch (Exception e) {
                        LoggerEdna.error("removeSchedule", e);
                    }
                    it.remove();
                }
            }
        }
    }

    public boolean removeSurvey(long j) {
        ListIterator<ChatItem> listIterator = getList().listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            ChatItem next = listIterator.next();
            if ((next instanceof Survey) && j == ((Survey) next).getSendingId()) {
                try {
                    notifyItemRemoved(ChatItemListFinder.lastIndexOf(getList(), next));
                } catch (Exception e) {
                    LoggerEdna.error("removeSurvey", e);
                }
                listIterator.remove();
                z = true;
            }
        }
        return z;
    }

    public void resetPlayingHolder() {
        VoiceMessageBaseHolder voiceMessageBaseHolder = this.playingHolder;
        if (voiceMessageBaseHolder != null) {
            this.ignorePlayerUpdates = false;
            voiceMessageBaseHolder.resetProgress();
            this.playingHolder = null;
        }
    }

    public void setAllMessagesRead() {
        ArrayList arrayList = new ArrayList();
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if (next instanceof ConsultPhrase) {
                ConsultPhrase consultPhrase = (ConsultPhrase) next;
                if (!consultPhrase.getRead()) {
                    consultPhrase.setRead(true);
                    String id = consultPhrase.getId();
                    if (!TextUtils.isEmpty(id)) {
                        arrayList.add(id);
                    }
                }
            }
            if (next instanceof Survey) {
                Survey survey = (Survey) next;
                if (!survey.isRead()) {
                    survey.setRead(true);
                }
            }
            if (next instanceof UnreadMessages) {
                try {
                    notifyItemRemoved(ChatItemListFinder.lastIndexOf(getList(), next));
                } catch (Exception e) {
                    LoggerEdna.error("setAllMessagesRead", e);
                }
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            BaseConfig.Companion.getInstance().transport.markMessagesAsRead(arrayList);
        }
    }

    public void setAvatar(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (int i = 0; i < getList().size(); i++) {
            ChatItem chatItem = getList().get(i);
            if (chatItem instanceof ConsultChatPhrase) {
                ConsultChatPhrase consultChatPhrase = (ConsultChatPhrase) chatItem;
                if (Objects.equals(consultChatPhrase.getConsultId(), str) && !p57.a(consultChatPhrase.getAvatarPath(), str2)) {
                    if (TextUtils.isEmpty(str2)) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    consultChatPhrase.setAvatarPath(str3);
                    notifyItemChanged(i);
                }
            }
        }
    }

    public void setClientNotificationDisplayType(ClientNotificationDisplayType clientNotificationDisplayType) {
        this.clientNotificationDisplayType = clientNotificationDisplayType;
        addItems(new ArrayList(), null, true);
    }

    public void setCurrentThreadId(long j) {
        this.currentThreadId = j;
        addItems(new ArrayList(), null, true);
    }

    public int setItemHighlighted(@NonNull ChatItem chatItem) {
        this.highlightingStream.d(chatItem);
        int i = -1;
        for (int i2 = 0; i2 < getList().size(); i2++) {
            if (getList().get(i2).isTheSameItem(chatItem)) {
                this.highlightedItem = getList().get(i2);
                i = i2;
            }
        }
        return i;
    }

    public void setSearchingConsult() {
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof SearchingConsult) {
                return;
            }
        }
        SearchingConsult searchingConsult = new SearchingConsult();
        getList().add(searchingConsult);
        notifyItemInserted(ChatItemListFinder.lastIndexOf(getList(), searchingConsult));
    }

    public void updateProgress(FileDescription fileDescription) {
        for (int i = 0; i < getList().size(); i++) {
            if (fileDescription.getFileUri() != null || fileDescription.getDownloadPath() != null || (getItemViewType(i) != 9 && getItemViewType(i) != 8 && getItemViewType(i) != 6 && getItemViewType(i) != 19)) {
                if (getList().get(i) instanceof ConsultPhrase) {
                    ConsultPhrase consultPhrase = (ConsultPhrase) getList().get(i);
                    if (p57.a(consultPhrase.getFileDescription(), fileDescription)) {
                        if (consultPhrase.getFileDescription() == null || consultPhrase.getFileDescription().getState().ordinal() <= fileDescription.getState().ordinal()) {
                            consultPhrase.setFileDescription(fileDescription);
                            if (!FileUtils.isImage(fileDescription) || isImageChanged(consultPhrase.getFileDescription(), fileDescription)) {
                                notifyItemChanged(ChatItemListFinder.indexOf(getList(), consultPhrase));
                            }
                        } else {
                            return;
                        }
                    } else if (consultPhrase.getQuote() != null && p57.a(consultPhrase.getQuote().getFileDescription(), fileDescription)) {
                        consultPhrase.getQuote().setFileDescription(fileDescription);
                        notifyItemChanged(ChatItemListFinder.indexOf(getList(), consultPhrase));
                    }
                } else if (getList().get(i) instanceof UserPhrase) {
                    UserPhrase userPhrase = (UserPhrase) getList().get(i);
                    if (p57.a(userPhrase.getFileDescription(), fileDescription)) {
                        if (userPhrase.getFileDescription() == null || userPhrase.getFileDescription().getState().ordinal() <= fileDescription.getState().ordinal()) {
                            userPhrase.setFileDescription(fileDescription);
                            if (!FileUtils.isImage(fileDescription) || isImageChanged(userPhrase.getFileDescription(), fileDescription)) {
                                notifyItemChanged(ChatItemListFinder.indexOf(getList(), userPhrase));
                            }
                        } else {
                            return;
                        }
                    } else if (userPhrase.getQuote() != null && p57.a(userPhrase.getQuote().getFileDescription(), fileDescription)) {
                        userPhrase.getQuote().setFileDescription(fileDescription);
                        notifyItemChanged(ChatItemListFinder.indexOf(getList(), userPhrase));
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void updateQuotesIfNeed(ConsultPhrase consultPhrase) {
        Quote quote;
        Quote quote2;
        String id = consultPhrase.getId();
        for (int i = 0; i < getList().size(); i++) {
            ChatItem chatItem = getList().get(i);
            if ((chatItem instanceof ConsultPhrase) && (quote2 = ((ConsultPhrase) chatItem).getQuote()) != null) {
                String uuid = quote2.getUuid();
                Objects.requireNonNull(uuid);
                if (uuid.equals(id)) {
                    quote2.setFileDescription(consultPhrase.getFileDescription());
                    quote2.setModified(consultPhrase.getModified());
                    quote2.setText(consultPhrase.getPhraseText());
                    notifyItemChanged(i);
                    return;
                }
            }
            if ((chatItem instanceof UserPhrase) && (quote = ((UserPhrase) chatItem).getQuote()) != null) {
                String uuid2 = quote.getUuid();
                Objects.requireNonNull(uuid2);
                if (uuid2.equals(id)) {
                    quote.setFileDescription(consultPhrase.getFileDescription());
                    quote.setModified(consultPhrase.getModified());
                    quote.setText(consultPhrase.getPhraseText());
                    notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    public void removeItem(int i) {
        if (i == -1 || getList().size() <= i) {
            return;
        }
        getList().remove(i);
        notifyItemRemoved(i);
    }

    public int setItemHighlighted(String str) {
        Iterator<ChatItem> it = getList().iterator();
        while (it.hasNext()) {
            ChatItem next = it.next();
            if ((next instanceof ChatPhrase) && Objects.equals(((ChatPhrase) next).getId(), str)) {
                setItemHighlighted(next);
                return ChatItemListFinder.lastIndexOf(getList(), next);
            }
        }
        return -1;
    }
}
