package im.threads.ui.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.material.slider.Slider;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.sf8;
import defpackage.v5;
import im.threads.BuildConfig;
import im.threads.R;
import im.threads.business.audio.audioRecorder.AudioRecorder;
import im.threads.business.broadcastReceivers.ProgressReceiver;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.logger.LogZipSender;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.media.ChatCenterAudioConverter;
import im.threads.business.media.ChatCenterAudioConverterCallback;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatPhrase;
import im.threads.business.models.ClientNotificationDisplayType;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ConsultRole;
import im.threads.business.models.ConsultTyping;
import im.threads.business.models.FileDescription;
import im.threads.business.models.InputFieldEnableModel;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.QuickReply;
import im.threads.business.models.QuickReplyItem;
import im.threads.business.models.Quote;
import im.threads.business.models.ScheduleInfo;
import im.threads.business.models.Survey;
import im.threads.business.models.SystemMessage;
import im.threads.business.models.UnreadMessages;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.ModificationStateEnum;
import im.threads.business.preferences.Preferences;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.Transport;
import im.threads.business.useractivity.UserActivityTimeProvider;
import im.threads.business.utils.Balloon;
import im.threads.business.utils.ClibpboardExtensionsKt;
import im.threads.business.utils.FileProvider;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.FileUtilsKt;
import im.threads.business.utils.ThreadsPermissionChecker;
import im.threads.databinding.EccChatErrorLayoutBinding;
import im.threads.databinding.EccFragmentChatBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.ChatActivity;
import im.threads.ui.activities.GalleryActivity;
import im.threads.ui.activities.ImagesActivity;
import im.threads.ui.adapters.ChatAdapter;
import im.threads.ui.config.Config;
import im.threads.ui.controllers.ChatController;
import im.threads.ui.fragments.AttachmentBottomSheetDialogFragment;
import im.threads.ui.fragments.ChatFragment;
import im.threads.ui.fragments.PermissionDescriptionAlertFragment;
import im.threads.ui.holders.BaseHolder;
import im.threads.ui.permissions.PermissionsActivity;
import im.threads.ui.styles.permissions.PermissionDescriptionType;
import im.threads.ui.utils.CameraConstants;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.FileHelper;
import im.threads.ui.utils.KeyboardKt;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.InterceptTouchFrameLayout;
import im.threads.ui.views.MySwipeRefreshLayout;
import im.threads.ui.views.VoiceTimeLabelFormatter;
import im.threads.ui.views.VoiceTimeLabelFormatterKt;
import im.threads.ui.views.WelcomeScreen;
import im.threads.ui.views.recordview.VoiceRecordButton;
import im.threads.ui.views.recordview.VoiceRecordOnBasketAnimationEnd;
import im.threads.ui.views.recordview.VoiceRecordOnRecordClickListener;
import im.threads.ui.views.recordview.VoiceRecordView;
import im.threads.ui.views.search.SearchBarView;
import im.threads.ui.views.search.SearchListView;
import im.threads.ui.widget.CustomFontEditText;
import im.threads.ui.widget.CustomFontTextView;
import im.threads.ui.widget.textView.InputQuotedMessageAuthorTextView;
import im.threads.ui.widget.textView.InputQuotedMessageTextView;
import im.threads.ui.widget.textView.ToolbarSubtitleTextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000Ô\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ñ\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\bò\u0002ó\u0002ñ\u0002ô\u0002B\t¢\u0006\u0006\bð\u0002\u0010¥\u0001J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\b\u0010\r\u001a\u00020\nH\u0003J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\u0012\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\tH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020\nH\u0002J\u0012\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002J\b\u0010,\u001a\u00020\nH\u0002J\b\u0010-\u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020\nH\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u00100\u001a\u00020\tH\u0002J\u0010\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020%H\u0002J\u0010\u00103\u001a\u00020\n2\u0006\u00101\u001a\u00020%H\u0002J\u0010\u00104\u001a\u00020\n2\u0006\u00101\u001a\u00020%H\u0002J\u0018\u00108\u001a\u00020\n2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020%H\u0002J\u0018\u00109\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0002J\b\u0010:\u001a\u00020\nH\u0002J\u0010\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020;H\u0003J\u0010\u0010=\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0002J\u0010\u0010@\u001a\u00020\n2\u0006\u0010<\u001a\u00020;H\u0002J\u0010\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010<\u001a\u00020;H\u0002J\b\u0010B\u001a\u00020\nH\u0002J\b\u0010C\u001a\u00020\nH\u0002J \u0010H\u001a\u00020\n2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D2\b\b\u0002\u0010G\u001a\u00020\tH\u0002J\b\u0010G\u001a\u00020\nH\u0002J\b\u0010I\u001a\u00020\tH\u0002J\u0018\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tH\u0002J\u0010\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0002J\u0010\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0002JQ\u0010Z\u001a\u00020\n2\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0D2\u0006\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bZ\u0010[J\u0018\u0010`\u001a\u00020\n2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0002J\n\u0010a\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010b\u001a\u00020\nH\u0002J\n\u0010c\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010d\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010e\u001a\u00020\nH\u0002J\b\u0010f\u001a\u00020\nH\u0002J\n\u0010g\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010h\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010i\u001a\u00020\nH\u0002J\n\u0010j\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010k\u001a\u0004\u0018\u00010\u000eH\u0002J#\u0010o\u001a\u00020\n2\u0012\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020m0l\"\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\n\u0010q\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010s\u001a\u00020\nH\u0002J\b\u0010t\u001a\u00020\nH\u0002J\b\u0010u\u001a\u00020\nH\u0002J\n\u0010v\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010w\u001a\u00020\nH\u0002J\n\u0010x\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010z\u001a\u0004\u0018\u00010\u000e2\u0006\u0010y\u001a\u0002052\u0006\u00107\u001a\u00020%H\u0002J\b\u0010{\u001a\u00020\nH\u0002J\u0016\u0010}\u001a\u00020\n2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u001e0DH\u0002J\u0019\u0010\u0080\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020~2\u0006\u00101\u001a\u00020%H\u0002J\u0019\u0010\u0081\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020~2\u0006\u00101\u001a\u00020%H\u0002J4\u0010\u0085\u0001\u001a\u00020\n2\u0010\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010L\u0018\u00010D2\f\b\u0002\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\t\b\u0002\u0010\u0084\u0001\u001a\u00020\tH\u0002J,\u0010\u008d\u0001\u001a\u00030\u008c\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0016J\u001f\u0010\u008f\u0001\u001a\u00020\n2\b\u0010\u008e\u0001\u001a\u00030\u008c\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020\nH\u0016J\t\u0010\u0091\u0001\u001a\u00020\nH\u0016J\t\u0010\u0092\u0001\u001a\u00020\nH\u0016J\t\u0010\u0093\u0001\u001a\u00020\nH\u0016J\t\u0010\u0094\u0001\u001a\u00020\nH\u0016J\u0007\u0010\u0095\u0001\u001a\u00020\nJ\u0007\u0010\u0096\u0001\u001a\u00020\tJ\u0010\u0010\u0098\u0001\u001a\u00020\n2\u0007\u0010\u0097\u0001\u001a\u00020%J\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u000e2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001f\u0010 \u0001\u001a\u0004\u0018\u00010\u000e2\t\b\u0002\u0010\u009d\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0012\u0010£\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0012\u0010¦\u0001\u001a\u00020\nH\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0007\u0010§\u0001\u001a\u00020\nJ\t\u0010¨\u0001\u001a\u0004\u0018\u00010)J\u0019\u0010©\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020~2\u0006\u00101\u001a\u00020%H\u0016J\t\u0010ª\u0001\u001a\u00020\nH\u0016J\t\u0010«\u0001\u001a\u00020\nH\u0016J\t\u0010¬\u0001\u001a\u00020\nH\u0016J\u001a\u0010®\u0001\u001a\u00020\n2\u000f\u0010\u00ad\u0001\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010DH\u0016J\t\u0010¯\u0001\u001a\u00020\nH\u0016J\t\u0010°\u0001\u001a\u00020\nH\u0016J\t\u0010±\u0001\u001a\u00020\nH\u0016J\u0007\u0010²\u0001\u001a\u00020\nJ\u0007\u0010³\u0001\u001a\u00020\nJ\u0013\u0010´\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010M\u001a\u0004\u0018\u00010LJ&\u0010¹\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010µ\u0001\u001a\u00020%2\u0007\u0010¶\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b·\u0001\u0010¸\u0001J!\u0010º\u0001\u001a\u00020\n2\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0D2\b\b\u0002\u0010V\u001a\u00020\tJ\u0013\u0010»\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010]\u001a\u0004\u0018\u00010\\J\t\u0010¼\u0001\u001a\u0004\u0018\u00010\u000eJ)\u0010Á\u0001\u001a\u00020\n2\t\u0010½\u0001\u001a\u0004\u0018\u00010\u001e2\t\u0010¾\u0001\u001a\u0004\u0018\u00010\u001e2\n\u0010À\u0001\u001a\u0005\u0018\u00010¿\u0001J\u0011\u0010Ä\u0001\u001a\u00020\n2\b\u0010Ã\u0001\u001a\u00030Â\u0001J\u0007\u0010Å\u0001\u001a\u00020\nJ\u001b\u0010É\u0001\u001a\u00020\n2\u0007\u0010Æ\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0012\u0010Ë\u0001\u001a\u00020\nH\u0000¢\u0006\u0006\bÊ\u0001\u0010¥\u0001J\u0012\u0010Í\u0001\u001a\u00020\nH\u0000¢\u0006\u0006\bÌ\u0001\u0010¥\u0001J\u0007\u0010Î\u0001\u001a\u00020\tJ\u0010\u0010Ð\u0001\u001a\u00020\t2\u0007\u0010Ï\u0001\u001a\u00020XJ\u0007\u0010Ñ\u0001\u001a\u00020\nJ\u0013\u0010Ò\u0001\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\u001f\u0010Õ\u0001\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)2\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u0001H\u0016J\u001d\u0010Ø\u0001\u001a\u00020\n2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001e2\t\u0010×\u0001\u001a\u0004\u0018\u00010\u001eJ\u0007\u0010Ù\u0001\u001a\u00020\nJ\u0007\u0010Ú\u0001\u001a\u00020\nJ\u0010\u0010Ü\u0001\u001a\u00020\n2\u0007\u0010Û\u0001\u001a\u00020\tJ\u0012\u0010Þ\u0001\u001a\u00020\n2\u0007\u0010Ý\u0001\u001a\u00020\tH\u0016J)\u0010ä\u0001\u001a\u0004\u0018\u00010\u000e2\n\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00012\u0007\u0010á\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001J'\u0010ç\u0001\u001a\u00020\n2\n\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00012\u0007\u0010á\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\bå\u0001\u0010æ\u0001J$\u0010é\u0001\u001a\u00020\n2\u0006\u00101\u001a\u00020%2\u0007\u0010è\u0001\u001a\u00020%2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016J\u0007\u0010ê\u0001\u001a\u00020\tJ\u0013\u0010í\u0001\u001a\u00020\n2\n\u0010ì\u0001\u001a\u0005\u0018\u00010ë\u0001J\u0007\u0010î\u0001\u001a\u00020\nJ\u0012\u0010ð\u0001\u001a\u00020\n2\t\u0010\u007f\u001a\u0005\u0018\u00010ï\u0001J\u0010\u0010ò\u0001\u001a\u00020\n2\u0007\u0010ñ\u0001\u001a\u00020XJ\t\u0010ó\u0001\u001a\u0004\u0018\u00010\u000eJ\u0007\u0010ô\u0001\u001a\u00020\nJ\u0007\u0010õ\u0001\u001a\u00020\nJ\u0007\u0010ö\u0001\u001a\u00020\nJ\u0012\u0010÷\u0001\u001a\u00020\n2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001eJ\u001b\u0010÷\u0001\u001a\u00020\n2\u0007\u0010ø\u0001\u001a\u00020%H\u0000¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u0012\u0010ý\u0001\u001a\u00020%H\u0000¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u0012\u0010ÿ\u0001\u001a\u00020\n2\u0007\u0010þ\u0001\u001a\u00020\u0016H\u0016R!\u0010\u0085\u0002\u001a\u00030\u0080\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0018\u0010\u008a\u0002\u001a\u00030\u0089\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R'\u0010\u008e\u0002\u001a\u0012\u0012\r\u0012\u000b \u008d\u0002*\u0004\u0018\u00010\u001e0\u001e0\u008c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002RM\u0010*\u001a2\u0012-\u0012+\u0012\r\u0012\u000b \u008d\u0002*\u0004\u0018\u00010)0) \u008d\u0002*\u0014\u0012\r\u0012\u000b \u008d\u0002*\u0004\u0018\u00010)0)\u0018\u00010\u0090\u00020\u0090\u00020\u008c\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b*\u0010\u008f\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0093\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0018\u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R!\u0010\u009d\u0002\u001a\u00030\u0099\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010\u0082\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R!\u0010¢\u0002\u001a\u00030\u009e\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009f\u0002\u0010\u0082\u0002\u001a\u0006\b \u0002\u0010¡\u0002R\u001c\u0010¤\u0002\u001a\u0005\u0018\u00010£\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R!\u0010ª\u0002\u001a\u00030¦\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b§\u0002\u0010\u0082\u0002\u001a\u0006\b¨\u0002\u0010©\u0002R\u0019\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010«\u0002R\u001b\u0010¬\u0002\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R \u0010²\u0002\u001a\t\u0018\u00010±\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u001c\u0010µ\u0002\u001a\u0005\u0018\u00010´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u001c\u0010¸\u0002\u001a\u0005\u0018\u00010·\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010¹\u0002R \u0010»\u0002\u001a\t\u0018\u00010º\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u0019\u0010½\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u0019\u0010¿\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010¾\u0002R\u001b\u0010À\u0002\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u001b\u0010Â\u0002\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u001c\u0010Å\u0002\u001a\u0005\u0018\u00010Ä\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010Æ\u0002R\u001c\u0010È\u0002\u001a\u0005\u0018\u00010Ç\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R\u001f\u0010|\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010Ê\u0002R\"\u0010Ì\u0002\u001a\u000b\u0012\u0004\u0012\u00020>\u0018\u00010Ë\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0002\u0010Ê\u0002R\u001c\u0010Î\u0002\u001a\u0005\u0018\u00010Í\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R\u0019\u0010Ð\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0002\u0010¾\u0002R,\u0010Ñ\u0002\u001a\u0005\u0018\u00010ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÑ\u0002\u0010Ò\u0002\u001a\u0006\bÓ\u0002\u0010Ô\u0002\"\u0006\bÕ\u0002\u0010Ö\u0002R\u0019\u0010×\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010Ø\u0002R\u0018\u0010Ú\u0002\u001a\u00030Ù\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R\u0018\u0010Ý\u0002\u001a\u00030Ü\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R)\u0010á\u0002\u001a\u0014\u0012\u000f\u0012\r \u008d\u0002*\u0005\u0018\u00010à\u00020à\u00020ß\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0002\u0010â\u0002R,\u0010å\u0002\u001a\u00030ã\u00022\b\u0010ä\u0002\u001a\u00030ã\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bå\u0002\u0010æ\u0002\u001a\u0006\bç\u0002\u0010è\u0002R\u0017\u0010é\u0002\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bé\u0002\u0010¢\u0001R\u0017\u0010ê\u0002\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bê\u0002\u0010¢\u0001R\u0017\u0010ì\u0002\u001a\u00020%8@X\u0080\u0004¢\u0006\b\u001a\u0006\bë\u0002\u0010ü\u0001R\u001a\u0010ï\u0002\u001a\b\u0012\u0004\u0012\u00020L0D8F¢\u0006\b\u001a\u0006\bí\u0002\u0010î\u0002¨\u0006õ\u0002"}, d2 = {"Lim/threads/ui/fragments/ChatFragment;", "Lim/threads/ui/fragments/BaseFragment;", "Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment$Callback;", "Lim/threads/business/broadcastReceivers/ProgressReceiver$Callback;", "Lim/threads/business/media/ChatCenterAudioConverterCallback;", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment$OnAllowPermissionClickListener;", "Lim/threads/databinding/EccChatErrorLayoutBinding;", "initErrorViewStyles", "Lkotlin/Function1;", "", "", "callback", "isNeedToShowWelcome", "initController", "Lim/threads/databinding/EccFragmentChatBinding;", "initViews", "Landroid/app/Activity;", "activity", "initInputLayout", "applyTintAndColorState", "initRecording", "stopRecording", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "addVoiceMessagePreview", "initMediaPlayer", "bindViews", "checkScrollDownButtonVisibility", "setMessagesAsRead", "setMessagesAsReadForStorages", "", "input", "onInputChanged", "updateLastUserActivityTime", "configureRecordButtonVisibility", "isInputEmpty", "setRecordButtonVisibility", "", "unreadCount", "showUnreadMessagesCount", "onSendButtonClick", "Lim/threads/business/models/FileDescription;", "fileDescription", "setFileDescription", "subscribeToFileDescription", "subscribeToInputText", "onRefresh", "setFragmentStyle", "hasAttachments", "requestCode", "startStoragePermissionActivity", "startRecordAudioPermissionActivity", "startCameraPermissionActivity", "Lim/threads/business/models/ChatPhrase;", "cp", "position", "onReplyClick", "onCopyClick", "onExternalCameraPhotoResult", "Landroid/content/Intent;", "data", "onFileResult", "Landroid/net/Uri;", "uri", "onPhotoResult", "onPhotosResult", "openBottomSheetAndGallery", "handleBottomSheet", "", "Lim/threads/business/models/UpcomingUserMessage;", "messages", "clearInput", "sendMessage", "isLastMessageVisible", "isUserPhrase", "scrollDelayedOnNewMessageReceived", "Lim/threads/business/models/ChatItem;", "item", "needsAddMessage", "needsModifyImage", "Lim/threads/ui/adapters/ChatAdapter;", "chatAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", StatisticManager.LIST, "oldAdapterSize", "forceScrollToTheEnd", "isBottomItemsVisible", "", "lastVisibleItemTimestamp", "updateChatAdapter", "(Lim/threads/ui/adapters/ChatAdapter;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;IZZLjava/lang/Long;)V", "Lim/threads/business/models/ConsultInfo;", "info", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "setSubtitle", "hideCopyControls", "setBottomStateDefault", "setTitleStateCurrentOperatorConnected", "setTitleStateSearchingConsult", "unChooseItem", "scrollToNewMessages", "scrollToFirstUnreadMessage", "initToolbar", "updateToolBar", "checkBottomLayout", "initSearch", "", "Landroid/widget/ImageButton;", "imageButtons", "setContextIconDefaultTint", "([Landroid/widget/ImageButton;)V", "initToolbarShadow", "initToolbarTextPosition", "showOverflowMenu", "hideOverflowMenu", "onActivityBackPressed", "hideSearchMode", "checkBackButtonVisibility", "search", "chatPhrase", "updateUIonPhraseLongClick", "openFile", "cameraPermissions", "showSafelyCameraPermissionDescriptionDialog", "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", MessageAttributes.TYPE, "showSafelyPermissionDescriptionDialog", "showPermissionDescriptionDialog", "Lgr5;", "listUpdatedCallback", "withAnimation", "addItemsToChat", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onStart", "onStop", "onPause", "onResume", "onDestroyView", "setupStartSecondLevelScreen", "isStartSecondLevelScreen", "index", "scrollToElementByIndex", "message", "showErrorView$threads_release", "(Ljava/lang/String;)Lim/threads/databinding/EccFragmentChatBinding;", "showErrorView", "showList", "hideErrorView$threads_release", "(Z)Lim/threads/databinding/EccFragmentChatBinding;", "hideErrorView", "isErrorViewNotVisible$threads_release", "()Z", "isErrorViewNotVisible", "initRecordButtonState$threads_release", "()V", "initRecordButtonState", "configureUserTypingSubscription", "getFileDescription", "onAllowClick", "onDialogDetached", "onCameraClick", "onGalleryClick", "imageList", "onImageSelectionChanged", "onBottomSheetDetached", "onFilePickerClick", "onSendClick", "hideBottomSheet", "showBottomSheet", "addChatItem", "itemPosition", "smooth", "scrollToPosition$threads_release", "(IZ)Lim/threads/databinding/EccFragmentChatBinding;", "scrollToPosition", "addChatItems", "setStateConsultConnected", "setTitleStateDefault", "correlationId", "backendMessageId", "Lim/threads/business/models/MessageStatus;", "state", "setMessageState", "Lim/threads/business/models/Survey;", "survey", "setSurveySentStatus", "cleanChat", "show", "showWelcomeScreen$threads_release", "(Z)V", "showWelcomeScreen", "showWelcomeScreenIfNeed$threads_release", "showWelcomeScreenIfNeed", "showBottomBar$threads_release", "showBottomBar", "removeResolveRequest", "sendingId", "removeSurvey", "setAllMessagesWereRead", "updateProgress", "", "throwable", "onDownloadError", "newAvatarUrl", "consultId", "notifyConsultAvatarChanged", "setStateSearchingConsult", "removeSearching", "checkSchedule", "removeSchedule", "isVisible", "setMenuVisibility", "Lim/threads/business/models/InputFieldEnableModel;", "enableModel", "disableInputFields", "updateInputEnable$threads_release", "(Lim/threads/business/models/InputFieldEnableModel;Z)Lim/threads/databinding/EccFragmentChatBinding;", "updateInputEnable", "updateChatAvailabilityMessage$threads_release", "(Lim/threads/business/models/InputFieldEnableModel;Z)V", "updateChatAvailabilityMessage", "resultCode", "onActivityResult", "onBackPressed", "Lim/threads/business/models/QuickReplyItem;", "quickReplies", "showQuickReplies", "hideQuickReplies", "Lim/threads/business/models/ClientNotificationDisplayType;", "setClientNotificationDisplayType", "threadId", "setCurrentThreadId", "showEmptyState", "hideEmptyState", "showProgressBar", "hideProgressBar", "showBalloon", "messageResId", "showBalloon$threads_release", "(I)V", "getDisplayedMessagesCount$threads_release", "()I", "getDisplayedMessagesCount", "convertedFile", "acceptConvertedFile", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "Lrn5;", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/text/SimpleDateFormat;", "fileNameDateFormat", "Ljava/text/SimpleDateFormat;", "Lta0;", "kotlin.jvm.PlatformType", "inputTextObservable", "Lta0;", "Lrb7;", "getFileDescription$threads_release", "()Lta0;", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "Landroid/media/MediaMetadataRetriever;", "Lim/threads/business/media/ChatCenterAudioConverter;", "audioConverter", "Lim/threads/business/media/ChatCenterAudioConverter;", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lim/threads/business/utils/FileProvider;", "fileProvider$delegate", "getFileProvider", "()Lim/threads/business/utils/FileProvider;", "fileProvider", "Lim/threads/business/media/FileDescriptionMediaPlayer;", "fdMediaPlayer", "Lim/threads/business/media/FileDescriptionMediaPlayer;", "Lim/threads/ui/controllers/ChatController;", "chatController$delegate", "getChatController", "()Lim/threads/ui/controllers/ChatController;", "chatController", "Lim/threads/ui/adapters/ChatAdapter;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lim/threads/ui/adapters/ChatAdapter$Callback;", "chatAdapterCallback", "Lim/threads/ui/adapters/ChatAdapter$Callback;", "Lim/threads/ui/fragments/ChatFragment$QuoteLayoutHolder;", "quoteLayoutHolder", "Lim/threads/ui/fragments/ChatFragment$QuoteLayoutHolder;", "Lim/threads/business/models/Quote;", "mQuote", "Lim/threads/business/models/Quote;", "Lim/threads/business/models/CampaignMessage;", "campaignMessage", "Lim/threads/business/models/CampaignMessage;", "Lim/threads/ui/fragments/ChatFragment$ChatReceiver;", "mChatReceiver", "Lim/threads/ui/fragments/ChatFragment$ChatReceiver;", "isInMessageSearchMode", "Z", "isSendBlocked", "binding", "Lim/threads/databinding/EccFragmentChatBinding;", "externalCameraPhotoFile", "Ljava/io/File;", "Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment;", "bottomSheetDialogFragment", "Lim/threads/ui/fragments/AttachmentBottomSheetDialogFragment;", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment;", "permissionDescriptionAlertDialogFragment", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment;", "Ljava/util/List;", "", "mAttachedImages", "Lim/threads/business/audio/audioRecorder/AudioRecorder;", "recorder", "Lim/threads/business/audio/audioRecorder/AudioRecorder;", "isNewMessageUpdateTimeoutOn", "quickReplyItem", "Lim/threads/business/models/QuickReplyItem;", "getQuickReplyItem", "()Lim/threads/business/models/QuickReplyItem;", "setQuickReplyItem", "(Lim/threads/business/models/QuickReplyItem;)V", "previousChatItemsCount", "I", "Lim/threads/ui/config/Config;", "config", "Lim/threads/ui/config/Config;", "Lip5;", "coroutineScope", "Lip5;", "La6;", "Lv58;", "pickMedia", "La6;", "Lim/threads/ui/ChatStyle;", "<set-?>", "style", "Lim/threads/ui/ChatStyle;", "getStyle", "()Lim/threads/ui/ChatStyle;", "isPopupMenuEnabled", "isPreviewPlaying", "getLastVisibleItemPosition$threads_release", "lastVisibleItemPosition", "getElements", "()Ljava/util/List;", "elements", "<init>", "Companion", "AdapterCallback", "ChatReceiver", "QuoteLayoutHolder", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatFragment extends BaseFragment implements AttachmentBottomSheetDialogFragment.Callback, ProgressReceiver.Callback, ChatCenterAudioConverterCallback, PermissionDescriptionAlertFragment.OnAllowPermissionClickListener {
    public static final String ACTION_SEARCH = "ACTION_SEARCH";
    public static final String ACTION_SEARCH_CHAT_FILES = "ACTION_SEARCH_CHAT_FILES";
    public static final String ACTION_SEND_QUICK_MESSAGE = "ACTION_SEND_QUICK_MESSAGE";
    private static final String ARG_OPEN_WAY = "arg_open_way";
    public static final Companion Companion = new Companion(null);
    private static final int INPUT_DELAY = 3;
    private static final int INPUT_EDIT_VIEW_MAX_LINES_COUNT = 7;
    private static final int INPUT_EDIT_VIEW_MIN_LINES_COUNT = 1;
    private static final int INVISIBLE_MESSAGES_COUNT = 3;
    public static final int REQUEST_CODE_FILE = 103;
    public static final int REQUEST_CODE_PHOTO = 101;
    public static final int REQUEST_CODE_PHOTOS = 100;
    public static final int REQUEST_EXTERNAL_CAMERA_PHOTO = 102;
    public static final int REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY = 200;
    public static final int REQUEST_PERMISSION_CAMERA = 201;
    public static final int REQUEST_PERMISSION_READ_EXTERNAL = 202;
    public static final int REQUEST_PERMISSION_RECORD_AUDIO = 204;
    private static boolean afterResume;
    private static boolean isShown;
    private static boolean resumeAfterSecondLevelScreen;
    private final ChatCenterAudioConverter audioConverter;
    private EccFragmentChatBinding binding;
    private AttachmentBottomSheetDialogFragment bottomSheetDialogFragment;
    private List<String> cameraPermissions;
    private CampaignMessage campaignMessage;
    private ChatAdapter chatAdapter;
    private ChatAdapter.Callback chatAdapterCallback;
    private final rn5 chatController$delegate;
    private final rn5 chatUpdateProcessor$delegate;
    private final Config config;
    private final ip5 coroutineScope;
    private File externalCameraPhotoFile;
    private FileDescriptionMediaPlayer fdMediaPlayer;
    private final ta0<rb7<FileDescription>> fileDescription;
    private final SimpleDateFormat fileNameDateFormat;
    private final rn5 fileProvider$delegate;
    private final Handler handler;
    private final ta0<String> inputTextObservable;
    private boolean isInMessageSearchMode;
    private boolean isNewMessageUpdateTimeoutOn;
    private boolean isSendBlocked;
    private List<Uri> mAttachedImages;
    private ChatReceiver mChatReceiver;
    private LinearLayoutManager mLayoutManager;
    private Quote mQuote;
    private final MediaMetadataRetriever mediaMetadataRetriever;
    private PermissionDescriptionAlertFragment permissionDescriptionAlertDialogFragment;
    private final a6<v58> pickMedia;
    private final rn5 preferences$delegate;
    private int previousChatItemsCount;
    private QuickReplyItem quickReplyItem;
    private QuoteLayoutHolder quoteLayoutHolder;
    private AudioRecorder recorder;
    private ChatStyle style;

    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lim/threads/ui/fragments/ChatFragment$ChatReceiver;", "Landroid/content/BroadcastReceiver;", "(Lim/threads/ui/fragments/ChatFragment;)V", "onReceive", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ChatReceiver extends BroadcastReceiver {
        public ChatReceiver() {
            ChatFragment.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (intent.getAction() != null && z65.c(intent.getAction(), ChatFragment.ACTION_SEARCH)) {
                ChatFragment.this.search();
            }
        }
    }

    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lim/threads/ui/fragments/ChatFragment$Companion;", "", "()V", ChatFragment.ACTION_SEARCH, "", ChatFragment.ACTION_SEARCH_CHAT_FILES, ChatFragment.ACTION_SEND_QUICK_MESSAGE, "ARG_OPEN_WAY", "INPUT_DELAY", "", "INPUT_EDIT_VIEW_MAX_LINES_COUNT", "INPUT_EDIT_VIEW_MIN_LINES_COUNT", "INVISIBLE_MESSAGES_COUNT", "REQUEST_CODE_FILE", "REQUEST_CODE_PHOTO", "REQUEST_CODE_PHOTOS", "REQUEST_EXTERNAL_CAMERA_PHOTO", "REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY", "REQUEST_PERMISSION_CAMERA", "REQUEST_PERMISSION_READ_EXTERNAL", "REQUEST_PERMISSION_RECORD_AUDIO", "afterResume", "", "<set-?>", "isShown", "()Z", "resumeAfterSecondLevelScreen", "newInstance", "Lim/threads/ui/fragments/ChatFragment;", RemoteMessageConst.FROM, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isShown() {
            return ChatFragment.isShown;
        }

        public final ChatFragment newInstance(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt(ChatFragment.ARG_OPEN_WAY, i);
            ChatFragment chatFragment = new ChatFragment();
            chatFragment.setArguments(bundle);
            return chatFragment;
        }
    }

    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\"\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eJ,\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0006J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006#"}, d2 = {"Lim/threads/ui/fragments/ChatFragment$QuoteLayoutHolder;", "", "(Lim/threads/ui/fragments/ChatFragment;)V", "formattedDuration", "", "ignorePlayerUpdates", "", "getIgnorePlayerUpdates", "()Z", "setIgnorePlayerUpdates", "(Z)V", "isVisible", "setVisible", "clear", "Lim/threads/databinding/EccFragmentChatBinding;", "getFormattedDuration", "fileDescription", "Lim/threads/business/models/FileDescription;", "init", "maxValue", "", "progress", "isPlaying", "resetProgress", "setContent", "header", "text", "imagePath", "Landroid/net/Uri;", "isFromFilePicker", "setQuotePast", "setVoice", "updateIsPlaying", "", "updateProgress", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"RestrictedApi"})
    /* loaded from: classes3.dex */
    public final class QuoteLayoutHolder {
        private String formattedDuration = "";
        private boolean ignorePlayerUpdates;

        public QuoteLayoutHolder() {
            Slider slider;
            Slider slider2;
            Slider slider3;
            ImageView imageView;
            ImageButton imageButton;
            InputQuotedMessageTextView inputQuotedMessageTextView;
            InputQuotedMessageAuthorTextView inputQuotedMessageAuthorTextView;
            ImageView imageView2;
            ChatFragment.this = r5;
            androidx.fragment.app.d activity = r5.getActivity();
            if (activity != null) {
                EccFragmentChatBinding eccFragmentChatBinding = r5.binding;
                if (eccFragmentChatBinding != null && (imageView2 = eccFragmentChatBinding.quoteButtonPlayPause) != null) {
                    imageView2.setColorFilter(iu1.c(r5.requireContext(), r5.getStyle().previewPlayPauseButtonColor), PorterDuff.Mode.SRC_ATOP);
                }
                EccFragmentChatBinding eccFragmentChatBinding2 = r5.binding;
                if (eccFragmentChatBinding2 != null && (inputQuotedMessageAuthorTextView = eccFragmentChatBinding2.quoteHeader) != null) {
                    inputQuotedMessageAuthorTextView.setTextColor(iu1.c(activity, r5.getStyle().quoteHeaderTextColor));
                }
                EccFragmentChatBinding eccFragmentChatBinding3 = r5.binding;
                if (eccFragmentChatBinding3 != null && (inputQuotedMessageTextView = eccFragmentChatBinding3.quoteText) != null) {
                    inputQuotedMessageTextView.setTextColor(iu1.c(activity, r5.getStyle().quoteTextTextColor));
                }
                EccFragmentChatBinding eccFragmentChatBinding4 = r5.binding;
                if (eccFragmentChatBinding4 != null && (imageButton = eccFragmentChatBinding4.quoteClear) != null) {
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: im.threads.ui.fragments.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ChatFragment.QuoteLayoutHolder.lambda$4$lambda$0(ChatFragment.QuoteLayoutHolder.this, view);
                        }
                    });
                }
                EccFragmentChatBinding eccFragmentChatBinding5 = r5.binding;
                if (eccFragmentChatBinding5 != null && (imageView = eccFragmentChatBinding5.quoteButtonPlayPause) != null) {
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: im.threads.ui.fragments.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ChatFragment.QuoteLayoutHolder.lambda$4$lambda$2(ChatFragment.this, this, view);
                        }
                    });
                }
                EccFragmentChatBinding eccFragmentChatBinding6 = r5.binding;
                if (eccFragmentChatBinding6 != null && (slider3 = eccFragmentChatBinding6.quoteSlider) != null) {
                    slider3.h(new Slider.a() { // from class: im.threads.ui.fragments.g
                        @Override // defpackage.d80
                        /* renamed from: b */
                        public final void a(Slider slider4, float f, boolean z) {
                            ChatFragment.QuoteLayoutHolder.lambda$4$lambda$3(ChatFragment.this, slider4, f, z);
                        }
                    });
                }
                EccFragmentChatBinding eccFragmentChatBinding7 = r5.binding;
                if (eccFragmentChatBinding7 != null && (slider2 = eccFragmentChatBinding7.quoteSlider) != null) {
                    slider2.i(new Slider.b() { // from class: im.threads.ui.fragments.ChatFragment$QuoteLayoutHolder$1$4
                        @Override // defpackage.e80
                        public void onStartTrackingTouch(Slider slider4) {
                            z65.h(slider4, "slider");
                            ChatFragment.QuoteLayoutHolder.this.setIgnorePlayerUpdates(true);
                        }

                        @Override // defpackage.e80
                        public void onStopTrackingTouch(Slider slider4) {
                            z65.h(slider4, "slider");
                            ChatFragment.QuoteLayoutHolder.this.setIgnorePlayerUpdates(false);
                        }
                    });
                }
                EccFragmentChatBinding eccFragmentChatBinding8 = r5.binding;
                if (eccFragmentChatBinding8 != null && (slider = eccFragmentChatBinding8.quoteSlider) != null) {
                    slider.setLabelFormatter(new VoiceTimeLabelFormatter());
                }
            }
        }

        public final String getFormattedDuration(FileDescription fileDescription) {
            Uri uri;
            long j;
            if (fileDescription != null) {
                uri = fileDescription.getFileUri();
            } else {
                uri = null;
            }
            if (uri != null) {
                MediaMetadataRetriever mediaMetadataRetriever = ChatFragment.this.mediaMetadataRetriever;
                Uri fileUri = fileDescription.getFileUri();
                z65.e(fileUri);
                j = FileUtilsKt.getDuration(mediaMetadataRetriever, fileUri);
            } else {
                j = 0;
            }
            return VoiceTimeLabelFormatterKt.formatAsDuration(j);
        }

        private final EccFragmentChatBinding init(int i, int i2, boolean z) {
            int h;
            int i3;
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null) {
                ChatFragment chatFragment = ChatFragment.this;
                h = kotlin.ranges.i.h(i2, i);
                eccFragmentChatBinding.quoteDuration.setText(VoiceTimeLabelFormatterKt.formatAsDuration(h));
                eccFragmentChatBinding.quoteSlider.setEnabled(true);
                eccFragmentChatBinding.quoteSlider.setValueTo(i);
                eccFragmentChatBinding.quoteSlider.setValue(h);
                ImageView imageView = eccFragmentChatBinding.quoteButtonPlayPause;
                ChatStyle style = chatFragment.getStyle();
                if (z) {
                    i3 = style.voiceMessagePauseButton;
                } else {
                    i3 = style.voiceMessagePlayButton;
                }
                imageView.setImageResource(i3);
                return eccFragmentChatBinding;
            }
            return null;
        }

        public static final void lambda$4$lambda$0(QuoteLayoutHolder quoteLayoutHolder, View view) {
            z65.h(quoteLayoutHolder, "this$0");
            quoteLayoutHolder.clear();
        }

        public static final void lambda$4$lambda$2(ChatFragment chatFragment, QuoteLayoutHolder quoteLayoutHolder, View view) {
            FileDescription fileDescription;
            MediaPlayer mediaPlayer;
            z65.h(chatFragment, "this$0");
            z65.h(quoteLayoutHolder, "this$1");
            if (chatFragment.fdMediaPlayer != null && (fileDescription = chatFragment.getFileDescription()) != null && FileUtils.isVoiceMessage(fileDescription)) {
                FileDescriptionMediaPlayer fileDescriptionMediaPlayer = chatFragment.fdMediaPlayer;
                if (fileDescriptionMediaPlayer != null) {
                    fileDescriptionMediaPlayer.processPlayPause(fileDescription);
                }
                FileDescriptionMediaPlayer fileDescriptionMediaPlayer2 = chatFragment.fdMediaPlayer;
                if (fileDescriptionMediaPlayer2 != null && (mediaPlayer = fileDescriptionMediaPlayer2.getMediaPlayer()) != null) {
                    quoteLayoutHolder.init(mediaPlayer.getDuration(), mediaPlayer.getCurrentPosition(), mediaPlayer.isPlaying());
                }
            }
        }

        public static final void lambda$4$lambda$3(ChatFragment chatFragment, Slider slider, float f, boolean z) {
            FileDescriptionMediaPlayer fileDescriptionMediaPlayer;
            MediaPlayer mediaPlayer;
            z65.h(chatFragment, "this$0");
            if (z && (fileDescriptionMediaPlayer = chatFragment.fdMediaPlayer) != null && (mediaPlayer = fileDescriptionMediaPlayer.getMediaPlayer()) != null) {
                mediaPlayer.seekTo((int) f);
            }
        }

        private final EccFragmentChatBinding setQuotePast(boolean z) {
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null) {
                ChatFragment chatFragment = ChatFragment.this;
                if (z) {
                    eccFragmentChatBinding.quotePast.setVisibility(8);
                    return eccFragmentChatBinding;
                }
                eccFragmentChatBinding.quotePast.setVisibility(0);
                eccFragmentChatBinding.quotePast.setImageResource(chatFragment.getStyle().quoteAttachmentIconResId);
                return eccFragmentChatBinding;
            }
            return null;
        }

        private final void setVisible(boolean z) {
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            View view = null;
            if (z) {
                EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
                if (eccFragmentChatBinding != null) {
                    linearLayout2 = eccFragmentChatBinding.quoteLayout;
                } else {
                    linearLayout2 = null;
                }
                ViewExtensionsKt.visible(linearLayout2);
                EccFragmentChatBinding eccFragmentChatBinding2 = ChatFragment.this.binding;
                if (eccFragmentChatBinding2 != null) {
                    view = eccFragmentChatBinding2.delimeter;
                }
                ViewExtensionsKt.visible(view);
                return;
            }
            EccFragmentChatBinding eccFragmentChatBinding3 = ChatFragment.this.binding;
            if (eccFragmentChatBinding3 != null) {
                linearLayout = eccFragmentChatBinding3.quoteLayout;
            } else {
                linearLayout = null;
            }
            ViewExtensionsKt.gone(linearLayout);
            EccFragmentChatBinding eccFragmentChatBinding4 = ChatFragment.this.binding;
            if (eccFragmentChatBinding4 != null) {
                view = eccFragmentChatBinding4.delimeter;
            }
            ViewExtensionsKt.gone(view);
        }

        public final EccFragmentChatBinding clear() {
            FileDescriptionMediaPlayer fileDescriptionMediaPlayer;
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding == null) {
                return null;
            }
            ChatFragment chatFragment = ChatFragment.this;
            eccFragmentChatBinding.quoteHeader.setText("");
            eccFragmentChatBinding.quoteText.setText("");
            setVisible(false);
            chatFragment.mQuote = null;
            chatFragment.campaignMessage = null;
            chatFragment.setFileDescription(null);
            resetProgress();
            if (chatFragment.isPreviewPlaying() && (fileDescriptionMediaPlayer = chatFragment.fdMediaPlayer) != null) {
                fileDescriptionMediaPlayer.reset();
            }
            chatFragment.unChooseItem();
            chatFragment.getChatUpdateProcessor().postAttachAudioFile(false);
            return eccFragmentChatBinding;
        }

        public final boolean getIgnorePlayerUpdates() {
            return this.ignorePlayerUpdates;
        }

        public final boolean isVisible() {
            LinearLayout linearLayout;
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null) {
                linearLayout = eccFragmentChatBinding.quoteLayout;
            } else {
                linearLayout = null;
            }
            return ViewExtensionsKt.isVisible(linearLayout);
        }

        public final EccFragmentChatBinding resetProgress() {
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null) {
                ChatFragment chatFragment = ChatFragment.this;
                eccFragmentChatBinding.quoteDuration.setText(this.formattedDuration);
                this.ignorePlayerUpdates = false;
                eccFragmentChatBinding.quoteSlider.setEnabled(false);
                eccFragmentChatBinding.quoteSlider.setValue(0.0f);
                eccFragmentChatBinding.quoteButtonPlayPause.setImageResource(chatFragment.getStyle().voiceMessagePlayButton);
                return eccFragmentChatBinding;
            }
            return null;
        }

        public final EccFragmentChatBinding setContent(String str, String str2, Uri uri, boolean z) {
            z65.h(str2, "text");
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null) {
                setVisible(true);
                setQuotePast(z);
                if (str != null && !z65.c(str, "null")) {
                    eccFragmentChatBinding.quoteHeader.setVisibility(0);
                    eccFragmentChatBinding.quoteHeader.setText(str);
                } else {
                    eccFragmentChatBinding.quoteHeader.setVisibility(4);
                }
                eccFragmentChatBinding.quoteText.setVisibility(0);
                eccFragmentChatBinding.quoteButtonPlayPause.setVisibility(8);
                eccFragmentChatBinding.quoteSlider.setVisibility(8);
                eccFragmentChatBinding.quoteDuration.setVisibility(8);
                eccFragmentChatBinding.quoteText.setText(str2);
                if (uri != null) {
                    eccFragmentChatBinding.quoteImage.setVisibility(0);
                    ImageLoader scales = ImageLoader.Companion.get().load(uri.toString()).scales(ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.CENTER_CROP);
                    ImageView imageView = eccFragmentChatBinding.quoteImage;
                    z65.g(imageView, "quoteImage");
                    scales.into(imageView);
                    return eccFragmentChatBinding;
                }
                eccFragmentChatBinding.quoteImage.setVisibility(8);
                return eccFragmentChatBinding;
            }
            return null;
        }

        public final void setIgnorePlayerUpdates(boolean z) {
            this.ignorePlayerUpdates = z;
        }

        public final EccFragmentChatBinding setVoice() {
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding == null) {
                return null;
            }
            ChatFragment chatFragment = ChatFragment.this;
            setVisible(true);
            eccFragmentChatBinding.quoteButtonPlayPause.setVisibility(0);
            eccFragmentChatBinding.quoteSlider.setVisibility(0);
            eccFragmentChatBinding.quoteDuration.setVisibility(0);
            eccFragmentChatBinding.quoteHeader.setVisibility(8);
            eccFragmentChatBinding.quoteText.setVisibility(8);
            eccFragmentChatBinding.quotePast.setVisibility(8);
            sh0.d(chatFragment.coroutineScope, v33.b(), null, new ChatFragment$QuoteLayoutHolder$setVoice$1$1(this, chatFragment, eccFragmentChatBinding, null), 2, null);
            return eccFragmentChatBinding;
        }

        public final void updateIsPlaying(boolean z) {
            ImageView imageView;
            int i;
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null && (imageView = eccFragmentChatBinding.quoteButtonPlayPause) != null) {
                if (z) {
                    i = ChatFragment.this.getStyle().voiceMessagePauseButton;
                } else {
                    i = ChatFragment.this.getStyle().voiceMessagePlayButton;
                }
                imageView.setImageResource(i);
            }
        }

        public final EccFragmentChatBinding updateProgress(int i) {
            float g;
            EccFragmentChatBinding eccFragmentChatBinding = ChatFragment.this.binding;
            if (eccFragmentChatBinding != null) {
                LoggerEdna.info("updateProgress: " + i);
                eccFragmentChatBinding.quoteDuration.setText(VoiceTimeLabelFormatterKt.formatAsDuration(i));
                Slider slider = eccFragmentChatBinding.quoteSlider;
                g = kotlin.ranges.i.g((float) i, slider.getValueTo());
                slider.setValue(g);
                return eccFragmentChatBinding;
            }
            return null;
        }
    }

    /* compiled from: ChatFragment.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDescriptionType.values().length];
            try {
                iArr[PermissionDescriptionType.STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionDescriptionType.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionDescriptionType.CAMERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChatFragment() {
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        b = yn5.b(ChatFragment$special$$inlined$inject$1.INSTANCE);
        this.preferences$delegate = b;
        this.handler = new Handler(Looper.getMainLooper());
        this.fileNameDateFormat = new SimpleDateFormat("dd.MM.yyyy.HH:mm:ss.S", Locale.getDefault());
        ta0<String> z = ta0.z("");
        z65.g(z, "createDefault(\"\")");
        this.inputTextObservable = z;
        ta0<rb7<FileDescription>> z2 = ta0.z(rb7.a());
        z65.g(z2, "createDefault(Optional.empty<FileDescription?>())");
        this.fileDescription = z2;
        this.mediaMetadataRetriever = new MediaMetadataRetriever();
        this.audioConverter = new ChatCenterAudioConverter();
        b2 = yn5.b(ChatFragment$special$$inlined$inject$2.INSTANCE);
        this.chatUpdateProcessor$delegate = b2;
        b3 = yn5.b(ChatFragment$special$$inlined$inject$3.INSTANCE);
        this.fileProvider$delegate = b3;
        b4 = yn5.b(ChatFragment$chatController$2.INSTANCE);
        this.chatController$delegate = b4;
        this.mAttachedImages = new ArrayList();
        Config companion = Config.Companion.getInstance();
        this.config = companion;
        androidx.lifecycle.d lifecycle = getLifecycle();
        z65.g(lifecycle, "lifecycle");
        this.coroutineScope = lp5.a(lifecycle);
        a6<v58> registerForActivityResult = registerForActivityResult(new v5(), new r5() { // from class: m11
            @Override // defpackage.r5
            public final void a(Object obj) {
                ChatFragment.pickMedia$lambda$0(ChatFragment.this, (Uri) obj);
            }
        });
        z65.g(registerForActivityResult, "registerForActivityResul…is null\")\n        }\n    }");
        this.pickMedia = registerForActivityResult;
        this.style = companion.getChatStyle();
    }

    public static /* synthetic */ void addChatItems$default(ChatFragment chatFragment, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        chatFragment.addChatItems(list, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0002, code lost:
        r8 = defpackage.sc1.W(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addItemsToChat(java.util.List<? extends im.threads.business.models.ChatItem> r8, defpackage.gr5 r9, boolean r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L35
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = defpackage.ic1.W(r8)
            if (r8 == 0) goto L35
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L35
            im.threads.ui.controllers.ChatController r0 = r7.getChatController()
            boolean r5 = r0.isChatReady$threads_release()
            if (r10 == 0) goto L23
            if (r5 == 0) goto L23
            r4 = 1
            goto L25
        L23:
            r10 = 0
            r4 = 0
        L25:
            im.threads.ui.controllers.ChatController r10 = r7.getChatController()
            im.threads.ui.fragments.ChatFragment$addItemsToChat$1$1 r6 = new im.threads.ui.fragments.ChatFragment$addItemsToChat$1$1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r10.removeCorruptedFiles$threads_release(r8, r6)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ChatFragment.addItemsToChat(java.util.List, gr5, boolean):void");
    }

    public static /* synthetic */ void addItemsToChat$default(ChatFragment chatFragment, List list, gr5 gr5Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            gr5Var = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        chatFragment.addItemsToChat(list, gr5Var, z);
    }

    public final void addVoiceMessagePreview(File file) {
        Context context = getContext();
        if (context != null) {
            sh0.d(this.coroutineScope, v33.b(), null, new ChatFragment$addVoiceMessagePreview$1(this, context, file, null), 2, null);
        }
    }

    private final EccFragmentChatBinding applyTintAndColorState(Activity activity) {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            eccFragmentChatBinding.sendMessage.setImageResource(this.style.sendMessageIconResId);
            eccFragmentChatBinding.addAttachment.setImageResource(this.style.attachmentIconResId);
            eccFragmentChatBinding.quoteClear.setImageResource(this.style.quoteClearIconResId);
            ChatStyle chatStyle = this.style;
            int[] iArr = chatStyle.chatBodyIconsColorState;
            if (iArr != null && iArr.length >= 3) {
                ColorStateList colorStateList = ColorsHelper.getColorStateList(activity, iArr[0], iArr[1], iArr[2]);
                ColorsHelper.setTintColorStateList(eccFragmentChatBinding.sendMessage, colorStateList);
                ColorsHelper.setTintColorStateList(eccFragmentChatBinding.addAttachment, colorStateList);
                ColorsHelper.setTintColorStateList(eccFragmentChatBinding.quoteClear, colorStateList);
                return eccFragmentChatBinding;
            }
            int i = chatStyle.chatBodyIconsTint;
            if (i == 0) {
                i = chatStyle.inputIconTintResId;
            }
            ColorsHelper.setTint(activity, eccFragmentChatBinding.sendMessage, i);
            ColorsHelper.setTint(activity, eccFragmentChatBinding.addAttachment, i);
            ChatStyle chatStyle2 = this.style;
            int i2 = chatStyle2.chatBodyIconsTint;
            if (i2 == 0) {
                i2 = chatStyle2.quoteClearIconTintResId;
            }
            ColorsHelper.setTint(activity, eccFragmentChatBinding.quoteClear, i2);
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final EccFragmentChatBinding bindViews() {
        ConstraintLayout constraintLayout;
        final EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            eccFragmentChatBinding.swipeRefresh.setSwipeListener(new MySwipeRefreshLayout.SwipeListener() { // from class: z11
                @Override // im.threads.ui.views.MySwipeRefreshLayout.SwipeListener
                public final void onSwipe() {
                    ChatFragment.bindViews$lambda$26$lambda$17();
                }
            });
            eccFragmentChatBinding.swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: a21
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void a() {
                    ChatFragment.bindViews$lambda$26$lambda$18(ChatFragment.this, eccFragmentChatBinding);
                }
            });
            eccFragmentChatBinding.consultName.setOnClickListener(new View.OnClickListener() { // from class: b21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatFragment.bindViews$lambda$26$lambda$19(ChatFragment.this, view);
                }
            });
            eccFragmentChatBinding.consultName.setOnLongClickListener(new View.OnLongClickListener() { // from class: c21
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean bindViews$lambda$26$lambda$20;
                    bindViews$lambda$26$lambda$20 = ChatFragment.bindViews$lambda$26$lambda$20(ChatFragment.this, view);
                    return bindViews$lambda$26$lambda$20;
                }
            });
            eccFragmentChatBinding.subtitle.setOnClickListener(new View.OnClickListener() { // from class: d21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatFragment.bindViews$lambda$26$lambda$21(ChatFragment.this, view);
                }
            });
            configureUserTypingSubscription();
            configureRecordButtonVisibility();
            eccFragmentChatBinding.chatItemsRecycler.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: e21
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ChatFragment.bindViews$lambda$26$lambda$24(EccFragmentChatBinding.this, this, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            eccFragmentChatBinding.chatItemsRecycler.addOnScrollListener(new RecyclerView.u() { // from class: im.threads.ui.fragments.ChatFragment$bindViews$1$7
                @Override // androidx.recyclerview.widget.RecyclerView.u
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Integer num;
                    z65.h(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, i, i2);
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) EccFragmentChatBinding.this.chatItemsRecycler.getLayoutManager();
                    if (linearLayoutManager != null) {
                        this.checkScrollDownButtonVisibility();
                        int h2 = linearLayoutManager.h2();
                        ChatAdapter chatAdapter = this.chatAdapter;
                        if (chatAdapter != null) {
                            num = Integer.valueOf(chatAdapter.getItemCount());
                        } else {
                            num = null;
                        }
                        if (h2 == 0 && !this.getChatController().isAllMessagesDownloaded$threads_release() && num != null && num.intValue() > BaseConfig.Companion.getInstance().getHistoryLoadingCount() / 2 && this.getChatController().isChatReady$threads_release()) {
                            EccFragmentChatBinding.this.swipeRefresh.setRefreshing(true);
                            ChatController.loadHistory$threads_release$default(this.getChatController(), null, Boolean.FALSE, false, false, false, false, null, null, 253, null);
                        }
                    }
                }
            });
            EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
            if (eccFragmentChatBinding2 != null && (constraintLayout = eccFragmentChatBinding2.scrollDownButtonContainer) != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: f21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatFragment.bindViews$lambda$26$lambda$25(ChatFragment.this, view);
                    }
                });
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public static final void bindViews$lambda$26$lambda$18(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding) {
        z65.h(chatFragment, "this$0");
        z65.h(eccFragmentChatBinding, "$this_apply");
        if (chatFragment.getChatController().isChatReady$threads_release()) {
            chatFragment.onRefresh();
        } else {
            eccFragmentChatBinding.swipeRefresh.setRefreshing(false);
        }
    }

    public static final void bindViews$lambda$26$lambda$19(ChatFragment chatFragment, View view) {
        ChatAdapter.Callback callback;
        z65.h(chatFragment, "this$0");
        if (chatFragment.getChatController().isConsultFound() && (callback = chatFragment.chatAdapterCallback) != null) {
            ConsultInfo currentConsultInfo = chatFragment.getChatController().getCurrentConsultInfo();
            z65.e(currentConsultInfo);
            callback.onConsultAvatarClick(currentConsultInfo.getId());
        }
    }

    public static final boolean bindViews$lambda$26$lambda$20(ChatFragment chatFragment, View view) {
        z65.h(chatFragment, "this$0");
        Context context = chatFragment.getContext();
        if (context != null) {
            String string = context.getString(R.string.ecc_saving_logs);
            z65.g(string, "context.getString(R.string.ecc_saving_logs)");
            Balloon.show(context, string);
            new LogZipSender(context, chatFragment.getFileProvider()).shareLogs();
            return true;
        }
        return true;
    }

    public static final void bindViews$lambda$26$lambda$21(ChatFragment chatFragment, View view) {
        ChatAdapter.Callback callback;
        String str;
        z65.h(chatFragment, "this$0");
        if (chatFragment.getChatController().isConsultFound() && (callback = chatFragment.chatAdapterCallback) != null) {
            ConsultInfo currentConsultInfo = chatFragment.getChatController().getCurrentConsultInfo();
            if (currentConsultInfo != null) {
                str = currentConsultInfo.getId();
            } else {
                str = null;
            }
            callback.onConsultAvatarClick(str);
        }
    }

    public static final void bindViews$lambda$26$lambda$24(final EccFragmentChatBinding eccFragmentChatBinding, ChatFragment chatFragment, View view, int i, int i2, int i3, final int i4, int i5, int i6, int i7, final int i8) {
        z65.h(eccFragmentChatBinding, "$this_apply");
        z65.h(chatFragment, "this$0");
        if (i4 < i8) {
            eccFragmentChatBinding.chatItemsRecycler.postDelayed(new Runnable() { // from class: g21
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.bindViews$lambda$26$lambda$24$lambda$23(ChatFragment.this, eccFragmentChatBinding, i8, i4);
                }
            }, 100L);
        }
    }

    public static final void bindViews$lambda$26$lambda$24$lambda$23(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding, int i, int i2) {
        z65.h(chatFragment, "this$0");
        z65.h(eccFragmentChatBinding, "$this_apply");
        try {
            if (chatFragment.style.scrollChatToEndIfUserTyping) {
                ChatAdapter chatAdapter = chatFragment.chatAdapter;
                if (chatAdapter != null) {
                    chatFragment.scrollToPosition$threads_release(chatAdapter.getItemCount() - 1, false);
                }
            } else if (chatFragment.isAdded()) {
                eccFragmentChatBinding.chatItemsRecycler.smoothScrollBy(0, i - i2);
            }
        } catch (NullPointerException e) {
            LoggerEdna.error("Handling exception when scrolling after delay", e);
        }
    }

    public static final void bindViews$lambda$26$lambda$25(ChatFragment chatFragment, View view) {
        ConstraintLayout constraintLayout;
        z65.h(chatFragment, "this$0");
        chatFragment.showUnreadMessagesCount(0);
        if (chatFragment.getChatController().getUnreadMessagesCount$threads_release() > 0) {
            chatFragment.scrollToNewMessages();
        } else {
            ChatAdapter chatAdapter = chatFragment.chatAdapter;
            z65.e(chatAdapter);
            chatFragment.scrollToPosition$threads_release(chatAdapter.getItemCount() - 1, false);
        }
        chatFragment.setMessagesAsRead();
        EccFragmentChatBinding eccFragmentChatBinding = chatFragment.binding;
        if (eccFragmentChatBinding != null) {
            constraintLayout = eccFragmentChatBinding.scrollDownButtonContainer;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        if (chatFragment.isInMessageSearchMode) {
            chatFragment.hideSearchMode();
        }
    }

    public final void checkBackButtonVisibility() {
        ImageButton imageButton = null;
        if (!this.style.showBackButton) {
            LoggerEdna.info("Back button is disabled in the style");
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            if (eccFragmentChatBinding != null) {
                imageButton = eccFragmentChatBinding.chatBackButton;
            }
            ViewExtensionsKt.gone(imageButton);
            return;
        }
        LoggerEdna.info("Back button is enabled in the style");
        EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
        if (eccFragmentChatBinding2 != null) {
            imageButton = eccFragmentChatBinding2.chatBackButton;
        }
        ViewExtensionsKt.visible(imageButton);
    }

    private final EccFragmentChatBinding checkBottomLayout() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (ViewExtensionsKt.isVisible(eccFragmentChatBinding.chatItemsRecycler)) {
                ViewExtensionsKt.visible(eccFragmentChatBinding.bottomLayout);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void checkScrollDownButtonVisibility() {
        Integer num;
        ConstraintLayout constraintLayout;
        LinearLayoutManager linearLayoutManager = this.mLayoutManager;
        if (linearLayoutManager != null) {
            int k2 = linearLayoutManager.k2();
            ChatAdapter chatAdapter = this.chatAdapter;
            ConstraintLayout constraintLayout2 = null;
            if (chatAdapter != null) {
                num = Integer.valueOf(chatAdapter.getItemCount());
            } else {
                num = null;
            }
            if (num != null && (num.intValue() - 1) - k2 > 3) {
                EccFragmentChatBinding eccFragmentChatBinding = this.binding;
                if (eccFragmentChatBinding != null && (constraintLayout = eccFragmentChatBinding.scrollDownButtonContainer) != null) {
                    ViewExtensionsKt.visible(constraintLayout);
                }
                showUnreadMessagesCount(getChatController().getUnreadMessagesCount$threads_release());
                return;
            }
            EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
            if (eccFragmentChatBinding2 != null) {
                constraintLayout2 = eccFragmentChatBinding2.scrollDownButtonContainer;
            }
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                activity.runOnUiThread(new Runnable() { // from class: q11
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatFragment.checkScrollDownButtonVisibility$lambda$28$lambda$27(ChatFragment.this);
                    }
                });
            }
        }
    }

    public static final void checkScrollDownButtonVisibility$lambda$28$lambda$27(ChatFragment chatFragment) {
        z65.h(chatFragment, "this$0");
        chatFragment.setMessagesAsRead();
    }

    public static final void cleanChat$lambda$60(ChatFragment chatFragment) {
        ChatAdapter.Callback callback;
        RecyclerView recyclerView;
        CustomFontEditText customFontEditText;
        z65.h(chatFragment, "this$0");
        if (chatFragment.isAdded() && chatFragment.fdMediaPlayer != null && (callback = chatFragment.chatAdapterCallback) != null) {
            z65.e(callback);
            FileDescriptionMediaPlayer fileDescriptionMediaPlayer = chatFragment.fdMediaPlayer;
            z65.e(fileDescriptionMediaPlayer);
            ChatAdapter chatAdapter = new ChatAdapter(callback, fileDescriptionMediaPlayer, chatFragment.mediaMetadataRetriever, ChatController.Companion.getInstance().getMessageErrorProcessor());
            chatFragment.chatAdapter = chatAdapter;
            EccFragmentChatBinding eccFragmentChatBinding = chatFragment.binding;
            if (eccFragmentChatBinding != null) {
                recyclerView = eccFragmentChatBinding.chatItemsRecycler;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setAdapter(chatAdapter);
            }
            chatFragment.setTitleStateDefault();
            chatFragment.showWelcomeScreen$threads_release(false);
            EccFragmentChatBinding eccFragmentChatBinding2 = chatFragment.binding;
            if (eccFragmentChatBinding2 != null && (customFontEditText = eccFragmentChatBinding2.inputEditView) != null) {
                customFontEditText.clearFocus();
            }
            chatFragment.showWelcomeScreen$threads_release(chatFragment.getChatController().isChatReady$threads_release());
        }
    }

    public final void clearInput() {
        CustomFontEditText customFontEditText;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null && (customFontEditText = eccFragmentChatBinding.inputEditView) != null) {
            customFontEditText.setText("");
        }
        QuoteLayoutHolder quoteLayoutHolder = this.quoteLayoutHolder;
        if (quoteLayoutHolder != null) {
            quoteLayoutHolder.clear();
        }
        setBottomStateDefault();
        hideCopyControls();
        List<Uri> list = this.mAttachedImages;
        if (list != null) {
            list.clear();
        }
        if (this.isInMessageSearchMode) {
            onActivityBackPressed();
        }
    }

    private final void configureRecordButtonVisibility() {
        ta0<String> ta0Var = this.inputTextObservable;
        ta0<rb7<FileDescription>> ta0Var2 = this.fileDescription;
        final ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1 chatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1 = ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1.INSTANCE;
        r57 m = r57.g(ta0Var, ta0Var2, new ya0() { // from class: w11
            @Override // defpackage.ya0
            public final Object a(Object obj, Object obj2) {
                Boolean configureRecordButtonVisibility$lambda$29;
                configureRecordButtonVisibility$lambda$29 = ChatFragment.configureRecordButtonVisibility$lambda$29(Function2.this, obj, obj2);
                return configureRecordButtonVisibility$lambda$29;
            }
        }).m(ti.c());
        final ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$2 chatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$2 = new ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$2(this);
        wr1 wr1Var = new wr1() { // from class: h21
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment.configureRecordButtonVisibility$lambda$30(Function1.this, obj);
            }
        };
        final ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$3 chatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$3 = ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$3.INSTANCE;
        subscribe(m.p(wr1Var, new wr1() { // from class: j21
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment.configureRecordButtonVisibility$lambda$31(Function1.this, obj);
            }
        }));
    }

    public static final Boolean configureRecordButtonVisibility$lambda$29(Function2 function2, Object obj, Object obj2) {
        z65.h(function2, "$tmp0");
        return (Boolean) function2.invoke(obj, obj2);
    }

    public static final void configureRecordButtonVisibility$lambda$30(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void configureRecordButtonVisibility$lambda$31(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final ChatController getChatController() {
        return (ChatController) this.chatController$delegate.getValue();
    }

    public final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    public final FileProvider getFileProvider() {
        return (FileProvider) this.fileProvider$delegate.getValue();
    }

    public final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    private final void handleBottomSheet() {
        if (this.bottomSheetDialogFragment == null) {
            showBottomSheet();
            ChatAdapter chatAdapter = this.chatAdapter;
            if (chatAdapter != null) {
                scrollToPosition$threads_release(chatAdapter.getItemCount() - 1, false);
                return;
            }
            return;
        }
        hideBottomSheet();
    }

    public final boolean hasAttachments() {
        boolean z;
        boolean z2;
        boolean z3;
        List<Uri> list;
        if (this.recorder != null) {
            z = true;
        } else {
            z = false;
        }
        if (getFileDescription() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<Uri> list2 = this.mAttachedImages;
        if (list2 != null && (list = list2) != null && !list.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            return false;
        }
        return true;
    }

    private final EccFragmentChatBinding hideCopyControls() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                z65.g(activity, "activity ?: return@apply");
                setTitleStateCurrentOperatorConnected();
                ColorsHelper.setTint(activity, eccFragmentChatBinding.chatBackButton, this.style.chatToolbarTextColorResId);
                ColorsHelper.setTint(activity, eccFragmentChatBinding.popupMenuButton, this.style.chatToolbarTextColorResId);
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.toolbar, this.style.chatToolbarColorResId);
                eccFragmentChatBinding.copyControls.setVisibility(8);
                if (!this.isInMessageSearchMode) {
                    eccFragmentChatBinding.consultName.setVisibility(0);
                }
                boolean z = getResources().getBoolean(this.style.fixedChatTitle);
                boolean z2 = getResources().getBoolean(this.style.isChatSubtitleVisible);
                if (getChatController().isConsultFound() && !this.isInMessageSearchMode && !z && z2) {
                    eccFragmentChatBinding.subtitle.setVisibility(0);
                    return eccFragmentChatBinding;
                }
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public static /* synthetic */ EccFragmentChatBinding hideErrorView$threads_release$default(ChatFragment chatFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return chatFragment.hideErrorView$threads_release(z);
    }

    private final void hideOverflowMenu() {
        ImageButton imageButton;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            imageButton = eccFragmentChatBinding.popupMenuButton;
        } else {
            imageButton = null;
        }
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    public final EccFragmentChatBinding hideSearchMode() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (getActivity() != null) {
                ViewExtensionsKt.gone(eccFragmentChatBinding.searchBar);
                ViewExtensionsKt.gone(eccFragmentChatBinding.searchListView);
                setMenuVisibility(true);
                this.isInMessageSearchMode = false;
                eccFragmentChatBinding.searchBar.clearSearch();
                eccFragmentChatBinding.searchBar.hideKeyboard(100L);
                ViewExtensionsKt.gone(eccFragmentChatBinding.searchMore);
                eccFragmentChatBinding.swipeRefresh.setEnabled(true);
                int stateOfConsult = getChatController().getStateOfConsult();
                if (stateOfConsult != 1) {
                    if (stateOfConsult != 2) {
                        if (stateOfConsult == 3) {
                            setTitleStateDefault();
                        }
                    } else {
                        setTitleStateSearchingConsult();
                    }
                } else {
                    setStateConsultConnected(getChatController().getCurrentConsultInfo());
                }
                checkBackButtonVisibility();
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    private final void initController() {
        androidx.fragment.app.d activity = getActivity();
        if (activity == null) {
            return;
        }
        isNeedToShowWelcome(new ChatFragment$initController$1(this));
        getChatController().bindFragment$threads_release(this);
        this.mChatReceiver = new ChatReceiver();
        IntentFilter intentFilter = new IntentFilter(ACTION_SEARCH_CHAT_FILES);
        intentFilter.addAction(ACTION_SEARCH);
        intentFilter.addAction(ACTION_SEND_QUICK_MESSAGE);
        if (Build.VERSION.SDK_INT >= 34) {
            activity.registerReceiver(this.mChatReceiver, intentFilter, 4);
        } else {
            activity.registerReceiver(this.mChatReceiver, intentFilter);
        }
    }

    private final EccChatErrorLayoutBinding initErrorViewStyles() {
        EccChatErrorLayoutBinding eccChatErrorLayoutBinding;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null && (eccChatErrorLayoutBinding = eccFragmentChatBinding.chatErrorLayout) != null) {
            eccChatErrorLayoutBinding.errorImage.setImageResource(this.style.chatErrorScreenImageResId);
            Context context = getContext();
            if (context != null) {
                eccChatErrorLayoutBinding.errorMessage.setTextColor(iu1.c(context, this.style.chatErrorScreenMessageTextColorResId));
                eccChatErrorLayoutBinding.retryInitChatBtn.setTextColor(iu1.c(context, this.style.chatErrorScreenButtonTextColorResId));
                Button button = eccChatErrorLayoutBinding.retryInitChatBtn;
                ChatStyle chatStyle = this.style;
                ColorStateList colorStateList = chatStyle.chatErrorScreenButtonTintColorList;
                if (colorStateList == null) {
                    int[] iArr = chatStyle.chatBodyIconsColorState;
                    if (iArr != null && iArr.length > 2) {
                        colorStateList = ColorsHelper.getColorStateList(context, iArr[0], iArr[1], iArr[2]);
                    } else {
                        int i = chatStyle.chatDisabledTextColor;
                        int i2 = chatStyle.chatToolbarColorResId;
                        colorStateList = ColorsHelper.getColorStateList(context, i, i2, i2);
                    }
                }
                button.setBackgroundTintList(colorStateList);
            }
            eccChatErrorLayoutBinding.errorMessage.setTextSize(0, getResources().getDimension(this.style.chatErrorScreenMessageTextSizeResId));
            eccChatErrorLayoutBinding.retryInitChatBtn.setTextSize(0, getResources().getDimension(this.style.chatErrorScreenButtonTextSizeResId));
            eccChatErrorLayoutBinding.retryInitChatBtn.setOnClickListener(new View.OnClickListener() { // from class: m21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatFragment.initErrorViewStyles$lambda$7$lambda$6(ChatFragment.this, view);
                }
            });
            return eccChatErrorLayoutBinding;
        }
        return null;
    }

    public static final void initErrorViewStyles$lambda$7$lambda$6(ChatFragment chatFragment, View view) {
        z65.h(chatFragment, "this$0");
        chatFragment.getChatController().onRetryInitChatClick$threads_release();
    }

    private final EccFragmentChatBinding initInputLayout(Activity activity) {
        int i;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            applyTintAndColorState(activity);
            if (this.config.getIsAttachmentsEnabled()) {
                i = 0;
            } else {
                i = 8;
            }
            eccFragmentChatBinding.addAttachment.setVisibility(i);
            eccFragmentChatBinding.addAttachment.setOnClickListener(new View.OnClickListener() { // from class: n11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatFragment.initInputLayout$lambda$11$lambda$9(ChatFragment.this, view);
                }
            });
            eccFragmentChatBinding.sendMessage.setOnClickListener(new View.OnClickListener() { // from class: o11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatFragment.initInputLayout$lambda$11$lambda$10(ChatFragment.this, view);
                }
            });
            eccFragmentChatBinding.sendMessage.setEnabled(false);
            return eccFragmentChatBinding;
        }
        return null;
    }

    public static final void initInputLayout$lambda$11$lambda$10(ChatFragment chatFragment, View view) {
        z65.h(chatFragment, "this$0");
        chatFragment.onSendButtonClick();
    }

    public static final void initInputLayout$lambda$11$lambda$9(ChatFragment chatFragment, View view) {
        z65.h(chatFragment, "this$0");
        chatFragment.openBottomSheetAndGallery();
    }

    private final void initMediaPlayer() {
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.fdMediaPlayer;
        if (fileDescriptionMediaPlayer != null) {
            l04<Boolean> H = fileDescriptionMediaPlayer.getUpdateProcessor().L().H(ti.c());
            final ChatFragment$initMediaPlayer$1$1 chatFragment$initMediaPlayer$1$1 = new ChatFragment$initMediaPlayer$1$1(this, fileDescriptionMediaPlayer);
            wr1<? super Boolean> wr1Var = new wr1() { // from class: e11
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatFragment.initMediaPlayer$lambda$16$lambda$14(Function1.this, obj);
                }
            };
            final ChatFragment$initMediaPlayer$1$2 chatFragment$initMediaPlayer$1$2 = ChatFragment$initMediaPlayer$1$2.INSTANCE;
            H.P(wr1Var, new wr1() { // from class: f11
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatFragment.initMediaPlayer$lambda$16$lambda$15(Function1.this, obj);
                }
            });
        }
    }

    public static final void initMediaPlayer$lambda$16$lambda$14(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void initMediaPlayer$lambda$16$lambda$15(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void initRecording() {
        VoiceRecordButton voiceRecordButton;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        final VoiceRecordView voiceRecordView = null;
        LinearLayout linearLayout = null;
        if (eccFragmentChatBinding != null) {
            voiceRecordButton = eccFragmentChatBinding.recordButton;
        } else {
            voiceRecordButton = null;
        }
        if (!this.style.voiceMessageEnabled) {
            if (eccFragmentChatBinding != null) {
                linearLayout = eccFragmentChatBinding.recordLayout;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (eccFragmentChatBinding != null) {
            voiceRecordView = eccFragmentChatBinding.recordView;
        }
        if (voiceRecordButton != null) {
            voiceRecordButton.setRecordView(voiceRecordView);
        }
        Drawable b = on.b(requireContext(), this.style.threadsRecordButtonBackground);
        if (b != null) {
            Drawable mutate = b.mutate();
            ColorsHelper.setDrawableColor(requireContext(), mutate, this.style.threadsRecordButtonBackgroundColor);
            if (voiceRecordButton != null) {
                voiceRecordButton.setBackground(mutate);
            }
        }
        if (voiceRecordButton != null) {
            voiceRecordButton.setImageResource(this.style.threadsRecordButtonIcon);
        }
        if (voiceRecordButton != null) {
            voiceRecordButton.setColorFilter(iu1.c(requireContext(), this.style.threadsRecordButtonIconColor), PorterDuff.Mode.SRC_ATOP);
        }
        if (voiceRecordView != null) {
            voiceRecordView.setCancelBounds$threads_release(8.0f);
        }
        if (voiceRecordView != null) {
            voiceRecordView.setSmallMicColor(this.style.threadsRecordButtonSmallMicColor);
        }
        if (voiceRecordView != null) {
            voiceRecordView.setLessThanSecondAllowed(false);
        }
        if (voiceRecordView != null) {
            voiceRecordView.setSlideToCancelText(requireContext().getString(R.string.ecc_voice_message_slide_to_cancel));
        }
        if (voiceRecordView != null) {
            voiceRecordView.setOnRecordListener(new ChatFragment$initRecording$1(this, voiceRecordView, voiceRecordButton));
        }
        if (voiceRecordView != null) {
            voiceRecordView.setOnBasketAnimationEndListener(new VoiceRecordOnBasketAnimationEnd() { // from class: im.threads.ui.fragments.ChatFragment$initRecording$2
                @Override // im.threads.ui.views.recordview.VoiceRecordOnBasketAnimationEnd
                public void onAnimationEnd() {
                    VoiceRecordView.this.setVisibility(4);
                    LoggerEdna.debug("RecordView: Basket Animation Finished");
                }
            });
        }
    }

    private final EccFragmentChatBinding initSearch() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding == null) {
            return null;
        }
        fr6<String> a = mua.a("");
        fr6<Boolean> a2 = mua.a(Boolean.FALSE);
        eccFragmentChatBinding.searchBar.setSearchChannels(a, a2);
        eccFragmentChatBinding.searchListView.setSearchChannels(a, a2);
        sh0.d(this.coroutineScope, null, null, new ChatFragment$initSearch$1$1(a, eccFragmentChatBinding, null), 3, null);
        eccFragmentChatBinding.searchListView.setOnClickListener(new ChatFragment$initSearch$1$2(this));
        return eccFragmentChatBinding;
    }

    private final EccFragmentChatBinding initToolbar() {
        int i;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                z65.g(activity, "activity ?: return@apply");
                eccFragmentChatBinding.toolbar.setTitle("");
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.toolbar, this.style.chatToolbarColorResId);
                initToolbarShadow();
                checkBackButtonVisibility();
                eccFragmentChatBinding.chatBackButton.setOnClickListener(new View.OnClickListener() { // from class: s11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatFragment.initToolbar$lambda$71$lambda$69(ChatFragment.this, view);
                    }
                });
                eccFragmentChatBinding.chatBackButton.setImageResource(this.style.chatToolbarBackIconResId);
                ColorsHelper.setTint(activity, eccFragmentChatBinding.chatBackButton, this.style.chatToolbarTextColorResId);
                eccFragmentChatBinding.popupMenuButton.setImageResource(this.style.searchIconResId);
                ColorsHelper.setTint(activity, eccFragmentChatBinding.popupMenuButton, this.style.chatToolbarTextColorResId);
                eccFragmentChatBinding.popupMenuButton.setOnClickListener(new View.OnClickListener() { // from class: t11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatFragment.initToolbar$lambda$71$lambda$70(ChatFragment.this, view);
                    }
                });
                ImageButton imageButton = eccFragmentChatBinding.popupMenuButton;
                if (isPopupMenuEnabled()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageButton.setVisibility(i);
                showOverflowMenu();
                eccFragmentChatBinding.contentCopy.setImageResource(this.style.chatToolbarContentCopyIconResId);
                eccFragmentChatBinding.reply.setImageResource(this.style.chatToolbarReplyIconResId);
                ImageButton imageButton2 = eccFragmentChatBinding.contentCopy;
                z65.g(imageButton2, "contentCopy");
                ImageButton imageButton3 = eccFragmentChatBinding.reply;
                z65.g(imageButton3, "reply");
                setContextIconDefaultTint(imageButton2, imageButton3);
                if (getResources().getBoolean(this.style.fixedChatTitle)) {
                    setTitleStateDefault();
                }
                initToolbarTextPosition();
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public static final void initToolbar$lambda$71$lambda$69(ChatFragment chatFragment, View view) {
        z65.h(chatFragment, "this$0");
        chatFragment.onActivityBackPressed();
    }

    public static final void initToolbar$lambda$71$lambda$70(ChatFragment chatFragment, View view) {
        ImageButton imageButton;
        z65.h(chatFragment, "this$0");
        if (!chatFragment.isInMessageSearchMode) {
            chatFragment.search();
            EccFragmentChatBinding eccFragmentChatBinding = chatFragment.binding;
            if (eccFragmentChatBinding != null) {
                imageButton = eccFragmentChatBinding.chatBackButton;
            } else {
                imageButton = null;
            }
            ViewExtensionsKt.visible(imageButton);
        }
    }

    private final EccFragmentChatBinding initToolbarShadow() {
        int i;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            boolean z = getResources().getBoolean(this.style.isChatTitleShadowVisible);
            View view = eccFragmentChatBinding.toolbarShadow;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            if (!z) {
                eccFragmentChatBinding.toolbar.setElevation(0.0f);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final EccFragmentChatBinding initToolbarTextPosition() {
        int i;
        int i2;
        int i3;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            boolean z = Config.Companion.getInstance().getChatStyle().isToolbarTextCentered;
            if (z) {
                i = 17;
            } else {
                i = 16;
            }
            if (z) {
                if (ViewExtensionsKt.isVisible(eccFragmentChatBinding.chatBackButton) && !ViewExtensionsKt.isVisible(eccFragmentChatBinding.popupMenuButton)) {
                    i3 = getResources().getDimensionPixelSize(R.dimen.ecc_toolbar_button_width);
                    i2 = 0;
                } else {
                    if (!ViewExtensionsKt.isVisible(eccFragmentChatBinding.chatBackButton) && ViewExtensionsKt.isVisible(eccFragmentChatBinding.popupMenuButton)) {
                        i2 = getResources().getDimensionPixelSize(R.dimen.ecc_toolbar_button_width);
                    } else {
                        i2 = 0;
                    }
                    i3 = 0;
                }
                eccFragmentChatBinding.consultTitle.setPadding(i2, 0, i3, 0);
            }
            eccFragmentChatBinding.consultName.setGravity(i);
            eccFragmentChatBinding.subtitle.setGravity(i);
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final EccFragmentChatBinding initViews() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            androidx.fragment.app.d activity = getActivity();
            if (activity != null && this.fdMediaPlayer != null && this.chatAdapterCallback != null) {
                initInputLayout(activity);
                this.quoteLayoutHolder = new QuoteLayoutHolder();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
                this.mLayoutManager = linearLayoutManager;
                eccFragmentChatBinding.chatItemsRecycler.setLayoutManager(linearLayoutManager);
                ChatAdapter.Callback callback = this.chatAdapterCallback;
                z65.e(callback);
                FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.fdMediaPlayer;
                z65.e(fileDescriptionMediaPlayer);
                this.chatAdapter = new ChatAdapter(callback, fileDescriptionMediaPlayer, this.mediaMetadataRetriever, ChatController.Companion.getInstance().getMessageErrorProcessor());
                RecyclerView.m itemAnimator = eccFragmentChatBinding.chatItemsRecycler.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.w(0L);
                }
                eccFragmentChatBinding.chatItemsRecycler.setAdapter(this.chatAdapter);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final boolean isLastMessageVisible() {
        RecyclerView.p pVar;
        RecyclerView recyclerView;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null && (recyclerView = eccFragmentChatBinding.chatItemsRecycler) != null) {
            pVar = recyclerView.getLayoutManager();
        } else {
            pVar = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
        if (linearLayoutManager == null) {
            return false;
        }
        try {
            ChatAdapter chatAdapter = this.chatAdapter;
            z65.e(chatAdapter);
            if ((chatAdapter.getItemCount() - 1) - linearLayoutManager.k2() >= 3) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final void isNeedToShowWelcome(Function1<? super Boolean, Unit> function1) {
        sh0.d(this.coroutineScope, v33.b(), null, new ChatFragment$isNeedToShowWelcome$1(this, function1, null), 2, null);
    }

    private final boolean isPopupMenuEnabled() {
        return getResources().getBoolean(this.config.getChatStyle().searchEnabled);
    }

    public final boolean isPreviewPlaying() {
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.fdMediaPlayer;
        if (fileDescriptionMediaPlayer != null) {
            z65.e(fileDescriptionMediaPlayer);
            return p57.a(fileDescriptionMediaPlayer.getFileDescription(), getFileDescription());
        }
        return false;
    }

    private final boolean needsAddMessage(ChatItem chatItem) {
        String str;
        if (chatItem instanceof ScheduleInfo) {
            if (((ScheduleInfo) chatItem).isChatWorking()) {
                return false;
            }
            ChatAdapter chatAdapter = this.chatAdapter;
            if (chatAdapter != null && chatAdapter.hasSchedule()) {
                return false;
            }
        } else if (chatItem instanceof QuickReplyItem) {
            return getChatController().isChatWorking$threads_release();
        } else {
            try {
                z65.f(chatItem, "null cannot be cast to non-null type im.threads.business.models.ChatPhrase");
                ChatPhrase chatPhrase = (ChatPhrase) chatItem;
                if (chatPhrase.getFileDescription() != null) {
                    FileDescription fileDescription = chatPhrase.getFileDescription();
                    if (fileDescription != null) {
                        str = fileDescription.getOriginalPath();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return false;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private final boolean needsModifyImage(ChatItem chatItem) {
        String str;
        try {
            z65.f(chatItem, "null cannot be cast to non-null type im.threads.business.models.ChatPhrase");
            ChatPhrase chatPhrase = (ChatPhrase) chatItem;
            if (chatPhrase.getFileDescription() == null) {
                return false;
            }
            FileDescription fileDescription = chatPhrase.getFileDescription();
            if (fileDescription != null) {
                str = fileDescription.getOriginalPath();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final ChatFragment newInstance(int i) {
        return Companion.newInstance(i);
    }

    public static final void notifyConsultAvatarChanged$lambda$61(ChatFragment chatFragment, String str, String str2) {
        z65.h(chatFragment, "this$0");
        ChatAdapter chatAdapter = chatFragment.chatAdapter;
        if (chatAdapter != null && chatAdapter != null) {
            chatAdapter.notifyAvatarChanged(str, str2);
        }
    }

    private final void onActivityBackPressed() {
        EccFragmentChatBinding eccFragmentChatBinding;
        LinearLayout linearLayout;
        if (isAdded()) {
            if (this.isInMessageSearchMode && ((eccFragmentChatBinding = this.binding) == null || (linearLayout = eccFragmentChatBinding.copyControls) == null || linearLayout.getVisibility() != 0)) {
                hideSearchMode();
                return;
            }
            androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    private final void onCopyClick(Activity activity, ChatPhrase chatPhrase) {
        Object systemService = activity.getSystemService("clipboard");
        z65.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        String phraseText = chatPhrase.getPhraseText();
        if (phraseText == null) {
            return;
        }
        ClibpboardExtensionsKt.copyToBuffer(clipboardManager, phraseText);
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext()");
        String string = getString(R.string.ecc_message_text_copied);
        z65.g(string, "getString(R.string.ecc_message_text_copied)");
        Balloon.show(requireContext, string);
        unChooseItem();
    }

    private final void onExternalCameraPhotoResult() {
        File file = this.externalCameraPhotoFile;
        if (file != null) {
            sh0.d(this.coroutineScope, null, null, new ChatFragment$onExternalCameraPhotoResult$1$1(this, file, null), 3, null);
        }
    }

    @SuppressLint({"WrongConstant"})
    private final void onFileResult(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            sh0.d(this.coroutineScope, v33.b(), null, new ChatFragment$onFileResult$1(data, this, intent, null), 2, null);
        }
    }

    public final void onInputChanged(String str) {
        getChatController().onUserTyping$threads_release(str);
        updateLastUserActivityTime();
    }

    private final void onPhotoResult(Intent intent) {
        String stringExtra = intent.getStringExtra(CameraConstants.IMAGE_EXTRA);
        if (stringExtra != null) {
            File file = new File(stringExtra);
            FileProvider fileProvider = getFileProvider();
            Context requireContext = requireContext();
            z65.g(requireContext, "requireContext()");
            onPhotoResult(fileProvider.getUriForFile(requireContext, file));
        }
    }

    private final void onPhotosResult(Intent intent) {
        final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(GalleryActivity.PHOTOS_TAG);
        hideBottomSheet();
        showWelcomeScreen$threads_release(false);
        String A = this.inputTextObservable.A();
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() != 0 && A != null) {
            bma h = bma.f(new Callable() { // from class: o21
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List onPhotosResult$lambda$46;
                    onPhotosResult$lambda$46 = ChatFragment.onPhotosResult$lambda$46(parcelableArrayListExtra, this);
                    return onPhotosResult$lambda$46;
                }
            }).k(dw9.b()).h(ti.c());
            final ChatFragment$onPhotosResult$2 chatFragment$onPhotosResult$2 = new ChatFragment$onPhotosResult$2(this, A);
            wr1 wr1Var = new wr1() { // from class: b11
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatFragment.onPhotosResult$lambda$47(Function1.this, obj);
                }
            };
            final ChatFragment$onPhotosResult$3 chatFragment$onPhotosResult$3 = ChatFragment$onPhotosResult$3.INSTANCE;
            subscribe(h.i(wr1Var, new wr1() { // from class: c11
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatFragment.onPhotosResult$lambda$48(Function1.this, obj);
                }
            }));
        }
    }

    public static final List onPhotosResult$lambda$46(ArrayList arrayList, ChatFragment chatFragment) {
        z65.h(chatFragment, "this$0");
        mya b = mya.b(arrayList);
        final ChatFragment$onPhotosResult$1$1 chatFragment$onPhotosResult$1$1 = new ChatFragment$onPhotosResult$1$1(chatFragment);
        return b.a(new ph8() { // from class: l21
            @Override // defpackage.ph8
            public final boolean b(Object obj) {
                boolean onPhotosResult$lambda$46$lambda$45;
                onPhotosResult$lambda$46$lambda$45 = ChatFragment.onPhotosResult$lambda$46$lambda$45(Function1.this, obj);
                return onPhotosResult$lambda$46$lambda$45;
            }
        }).c();
    }

    public static final boolean onPhotosResult$lambda$46$lambda$45(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void onPhotosResult$lambda$47(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void onPhotosResult$lambda$48(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void onRefresh() {
        if (getChatController().isChatReady$threads_release()) {
            ChatController.loadHistory$threads_release$default(getChatController(), null, null, false, true, false, false, null, null, 247, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x012b, code lost:
        r0 = im.threads.business.utils.FileUtils.getFileName(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0148, code lost:
        if (r3.length() != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0171, code lost:
        if (r0.length() != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReplyClick(im.threads.business.models.ChatPhrase r27, int r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ChatFragment.onReplyClick(im.threads.business.models.ChatPhrase, int):void");
    }

    private final void onSendButtonClick() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (this.isSendBlocked) {
            Context requireContext = requireContext();
            z65.g(requireContext, "requireContext()");
            String string = requireContext().getString(R.string.ecc_message_were_unsent);
            z65.g(string, "requireContext().getStri….ecc_message_were_unsent)");
            Balloon.show(requireContext, string);
            return;
        }
        String A = this.inputTextObservable.A();
        if (A != null) {
            int length = A.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (z65.j(A.charAt(i2), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i3++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (A.subSequence(i3, length + 1).toString().length() != 0 || getFileDescription() != null) {
                showWelcomeScreen$threads_release(false);
                ArrayList arrayList = new ArrayList();
                FileDescription fileDescription = getFileDescription();
                CampaignMessage campaignMessage = this.campaignMessage;
                Quote quote = this.mQuote;
                int length2 = A.length() - 1;
                int i4 = 0;
                boolean z4 = false;
                while (i4 <= length2) {
                    if (!z4) {
                        i = i4;
                    } else {
                        i = length2;
                    }
                    if (z65.j(A.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z4) {
                        if (!z) {
                            z4 = true;
                        } else {
                            i4++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length2--;
                    }
                }
                arrayList.add(new UpcomingUserMessage(fileDescription, campaignMessage, quote, A.subSequence(i4, length2 + 1).toString(), ClibpboardExtensionsKt.isLastCopyText(A)));
                sendMessage$default(this, arrayList, false, 2, null);
                updateLastUserActivityTime();
                clearInput();
            }
        }
    }

    public static final List onSendClick$lambda$40(ChatFragment chatFragment) {
        z65.h(chatFragment, "this$0");
        mya b = mya.b(chatFragment.mAttachedImages);
        final ChatFragment$onSendClick$1$1 chatFragment$onSendClick$1$1 = new ChatFragment$onSendClick$1$1(chatFragment);
        return b.a(new ph8() { // from class: p11
            @Override // defpackage.ph8
            public final boolean b(Object obj) {
                boolean onSendClick$lambda$40$lambda$39;
                onSendClick$lambda$40$lambda$39 = ChatFragment.onSendClick$lambda$40$lambda$39(Function1.this, obj);
                return onSendClick$lambda$40$lambda$39;
            }
        }).c();
    }

    public static final boolean onSendClick$lambda$40$lambda$39(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void onSendClick$lambda$41(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void onSendClick$lambda$42(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void openBottomSheetAndGallery() {
        androidx.fragment.app.d activity = getActivity();
        if (activity == null) {
            return;
        }
        if (FileHelper.INSTANCE.isFileExtensionsEmpty()) {
            String string = getString(R.string.ecc_sending_files_not_allowed);
            z65.g(string, "getString(R.string.ecc_sending_files_not_allowed)");
            Balloon.show(activity, string);
            return;
        }
        setTitleStateCurrentOperatorConnected();
        if (this.style.useSystemFilePicker) {
            handleBottomSheet();
        } else if (ThreadsPermissionChecker.isReadExternalPermissionGranted(activity)) {
            handleBottomSheet();
        } else if (this.style.arePermissionDescriptionDialogsEnabled) {
            showSafelyPermissionDescriptionDialog(PermissionDescriptionType.STORAGE, REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
        } else {
            startStoragePermissionActivity(REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
        }
    }

    private final void openFile() {
        startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("*/*"), 103);
    }

    public static final void pickMedia$lambda$0(ChatFragment chatFragment, Uri uri) {
        z65.h(chatFragment, "this$0");
        if (uri != null) {
            chatFragment.onPhotoResult(uri);
        } else {
            LoggerEdna.error("Cannot get file from file picker, uri is null");
        }
    }

    private final void scrollDelayedOnNewMessageReceived(final boolean z, final boolean z2) {
        if (!this.isNewMessageUpdateTimeoutOn) {
            this.isNewMessageUpdateTimeoutOn = true;
            this.handler.postDelayed(new Runnable() { // from class: j11
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.scrollDelayedOnNewMessageReceived$lambda$51(ChatFragment.this, z2, z);
                }
            }, 100L);
        }
    }

    public static final void scrollDelayedOnNewMessageReceived$lambda$51(ChatFragment chatFragment, boolean z, boolean z2) {
        ChatAdapter chatAdapter;
        z65.h(chatFragment, "this$0");
        if (!chatFragment.isInMessageSearchMode && chatFragment.isAdded() && (chatAdapter = chatFragment.chatAdapter) != null) {
            z65.e(chatAdapter);
            int itemCount = chatAdapter.getItemCount();
            if (z || z2) {
                chatFragment.scrollToPosition$threads_release(itemCount - 1, false);
            }
        }
        chatFragment.isNewMessageUpdateTimeoutOn = false;
    }

    private final EccFragmentChatBinding scrollToFirstUnreadMessage() {
        boolean v;
        final EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        List list = null;
        if (eccFragmentChatBinding == null) {
            return null;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) eccFragmentChatBinding.chatItemsRecycler.getLayoutManager();
        if (linearLayoutManager != null) {
            ChatAdapter chatAdapter = this.chatAdapter;
            if (chatAdapter != null) {
                list = chatAdapter.getList();
            }
            if (list == null) {
                list = kc1.l();
            }
            String firstUnreadUuidId = getChatController().getFirstUnreadUuidId();
            if ((!list.isEmpty()) && firstUnreadUuidId != null) {
                int size = list.size();
                for (final int i = 1; i < size; i++) {
                    if (list.get(i) instanceof ConsultPhrase) {
                        Object obj = list.get(i);
                        z65.f(obj, "null cannot be cast to non-null type im.threads.business.models.ConsultPhrase");
                        v = l0b.v(firstUnreadUuidId, ((ConsultPhrase) obj).getId(), true);
                        if (v) {
                            this.handler.post(new Runnable() { // from class: k11
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChatFragment.scrollToFirstUnreadMessage$lambda$68$lambda$67(ChatFragment.this, eccFragmentChatBinding, linearLayoutManager, i);
                                }
                            });
                            return eccFragmentChatBinding;
                        }
                    }
                }
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return eccFragmentChatBinding;
    }

    public static final void scrollToFirstUnreadMessage$lambda$68$lambda$67(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding, final LinearLayoutManager linearLayoutManager, final int i) {
        z65.h(chatFragment, "this$0");
        z65.h(eccFragmentChatBinding, "$this_apply");
        z65.h(linearLayoutManager, "$layoutManager");
        if (chatFragment.isAdded() && !chatFragment.isInMessageSearchMode) {
            eccFragmentChatBinding.chatItemsRecycler.post(new Runnable() { // from class: n21
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.scrollToFirstUnreadMessage$lambda$68$lambda$67$lambda$66(LinearLayoutManager.this, i);
                }
            });
        }
    }

    public static final void scrollToFirstUnreadMessage$lambda$68$lambda$67$lambda$66(LinearLayoutManager linearLayoutManager, int i) {
        z65.h(linearLayoutManager, "$layoutManager");
        linearLayoutManager.I2(i - 1, 0);
    }

    private final void scrollToNewMessages() {
        RecyclerView.p pVar;
        RecyclerView recyclerView;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null && (recyclerView = eccFragmentChatBinding.chatItemsRecycler) != null) {
            pVar = recyclerView.getLayoutManager();
        } else {
            pVar = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
        if (linearLayoutManager == null) {
            return;
        }
        ChatAdapter chatAdapter = this.chatAdapter;
        z65.e(chatAdapter);
        ArrayList<ChatItem> list = chatAdapter.getList();
        z65.g(list, "chatAdapter!!.list");
        int size = list.size();
        for (int i = 1; i < size; i++) {
            ChatItem chatItem = list.get(i);
            if ((chatItem instanceof UnreadMessages) || (((chatItem instanceof ConsultPhrase) && !((ConsultPhrase) chatItem).getRead()) || ((chatItem instanceof Survey) && !((Survey) chatItem).isRead()))) {
                linearLayoutManager.I2(i - 1, 0);
                return;
            }
        }
    }

    public final EccFragmentChatBinding search() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (getActivity() != null) {
                LoggerEdna.info("starting search");
                this.isInMessageSearchMode = true;
                ViewExtensionsKt.gone(eccFragmentChatBinding.consultName);
                ViewExtensionsKt.gone(eccFragmentChatBinding.subtitle);
                setBottomStateDefault();
                ViewExtensionsKt.visible(eccFragmentChatBinding.searchBar);
                eccFragmentChatBinding.searchBar.requestFocus();
                hideOverflowMenu();
                setMenuVisibility(false);
                eccFragmentChatBinding.searchBar.showKeyboard(100L);
                eccFragmentChatBinding.swipeRefresh.setEnabled(false);
                eccFragmentChatBinding.searchMore.setVisibility(8);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void sendMessage(List<UpcomingUserMessage> list, boolean z) {
        for (UpcomingUserMessage upcomingUserMessage : list) {
            getChatController().onUserInput$threads_release(upcomingUserMessage);
        }
        if (this.chatAdapter != null) {
            setMessagesAsRead();
        }
        if (z) {
            clearInput();
        }
        getChatController().hideQuickReplies$threads_release();
    }

    public static /* synthetic */ void sendMessage$default(ChatFragment chatFragment, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        chatFragment.sendMessage(list, z);
    }

    private final void setBottomStateDefault() {
        SearchBarView searchBarView;
        SearchBarView searchBarView2;
        hideBottomSheet();
        if (!this.isInMessageSearchMode) {
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            SearchListView searchListView = null;
            if (eccFragmentChatBinding != null) {
                searchBarView = eccFragmentChatBinding.searchBar;
            } else {
                searchBarView = null;
            }
            ViewExtensionsKt.gone(searchBarView);
            EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
            if (eccFragmentChatBinding2 != null) {
                searchListView = eccFragmentChatBinding2.searchListView;
            }
            ViewExtensionsKt.gone(searchListView);
            EccFragmentChatBinding eccFragmentChatBinding3 = this.binding;
            if (eccFragmentChatBinding3 != null && (searchBarView2 = eccFragmentChatBinding3.searchBar) != null) {
                searchBarView2.clearSearch();
            }
        }
    }

    public final void setContextIconDefaultTint(ImageButton... imageButtonArr) {
        ChatStyle chatStyle = this.style;
        int i = chatStyle.chatBodyIconsTint;
        if (i == 0) {
            i = chatStyle.chatToolbarInverseIconTintResId;
        }
        for (ImageButton imageButton : imageButtonArr) {
            ColorsHelper.setTint(getContext(), imageButton, i);
        }
    }

    public final void setFileDescription(FileDescription fileDescription) {
        this.fileDescription.d(rb7.f(fileDescription));
    }

    private final EccFragmentChatBinding setFragmentStyle() {
        final EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                z65.g(activity, "activity ?: return@apply");
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.chatRoot, this.style.chatBackgroundColor);
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.inputLayout, this.style.chatMessageInputColor);
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.bottomLayout, this.style.chatMessageInputColor);
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.recordView, this.style.chatMessageInputColor);
                eccFragmentChatBinding.searchMore.setBackgroundColor(iu1.c(activity, this.style.iconsAndSeparatorsColor));
                eccFragmentChatBinding.searchMore.setTextColor(iu1.c(activity, this.style.iconsAndSeparatorsColor));
                MySwipeRefreshLayout mySwipeRefreshLayout = eccFragmentChatBinding.swipeRefresh;
                int[] intArray = getResources().getIntArray(this.style.threadsSwipeRefreshColors);
                mySwipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(intArray, intArray.length));
                eccFragmentChatBinding.scrollDownButton.setBackgroundResource(this.style.scrollDownBackgroundResId);
                eccFragmentChatBinding.scrollDownButton.setImageResource(this.style.scrollDownIconResId);
                ViewGroup.LayoutParams layoutParams = eccFragmentChatBinding.scrollDownButton.getLayoutParams();
                z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = getResources().getDimensionPixelSize(this.style.scrollDownButtonHeight);
                marginLayoutParams.width = getResources().getDimensionPixelSize(this.style.scrollDownButtonWidth);
                syb.C0(eccFragmentChatBinding.scrollDownButton, getResources().getDimension(this.style.scrollDownButtonElevation));
                ViewGroup.LayoutParams layoutParams2 = eccFragmentChatBinding.scrollDownButtonContainer.getLayoutParams();
                z65.f(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int dimensionPixelSize = getResources().getDimensionPixelSize(this.style.scrollDownButtonMargin);
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                eccFragmentChatBinding.unreadMsgSticker.getBackground().setColorFilter(iu1.c(activity, this.style.unreadMsgStickerColorResId), PorterDuff.Mode.SRC_ATOP);
                syb.C0(eccFragmentChatBinding.unreadMsgSticker, getResources().getDimension(this.style.scrollDownButtonElevation));
                eccFragmentChatBinding.unreadMsgCount.setTextColor(iu1.c(activity, this.style.unreadMsgCountTextColorResId));
                syb.C0(eccFragmentChatBinding.unreadMsgCount, getResources().getDimension(this.style.scrollDownButtonElevation));
                eccFragmentChatBinding.inputEditView.setMinHeight((int) activity.getResources().getDimension(this.style.inputHeight));
                eccFragmentChatBinding.inputEditView.setBackground(on.b(activity, this.style.inputBackground));
                eccFragmentChatBinding.inputEditView.setHint(this.style.inputHint);
                eccFragmentChatBinding.inputEditView.setMaxLines(1);
                eccFragmentChatBinding.inputEditView.setPadding(getResources().getDimensionPixelSize(this.style.inputFieldPaddingLeft), getResources().getDimensionPixelSize(this.style.inputFieldPaddingTop), getResources().getDimensionPixelSize(this.style.inputFieldPaddingRight), getResources().getDimensionPixelSize(this.style.inputFieldPaddingBottom));
                ViewGroup.LayoutParams layoutParams3 = eccFragmentChatBinding.inputEditView.getLayoutParams();
                z65.f(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.setMargins(getResources().getDimensionPixelSize(this.style.inputFieldMarginLeft), getResources().getDimensionPixelSize(this.style.inputFieldMarginTop), getResources().getDimensionPixelSize(this.style.inputFieldMarginRight), getResources().getDimensionPixelSize(this.style.inputFieldMarginBottom));
                eccFragmentChatBinding.inputEditView.setLayoutParams(layoutParams4);
                eccFragmentChatBinding.inputEditView.addTextChangedListener(new TextWatcher() { // from class: im.threads.ui.fragments.ChatFragment$setFragmentStyle$1$1
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable editable) {
                        ta0 ta0Var;
                        boolean hasAttachments;
                        z65.h(editable, Image.TYPE_SMALL);
                        boolean z = true;
                        if (TextUtils.isEmpty(EccFragmentChatBinding.this.inputEditView.getText())) {
                            EccFragmentChatBinding.this.inputEditView.setMaxLines(1);
                        } else {
                            EccFragmentChatBinding.this.inputEditView.setMaxLines(7);
                        }
                        ta0Var = this.inputTextObservable;
                        ta0Var.d(editable.toString());
                        ImageButton imageButton = EccFragmentChatBinding.this.sendMessage;
                        if (TextUtils.isEmpty(editable)) {
                            hasAttachments = this.hasAttachments();
                            if (!hasAttachments) {
                                z = false;
                            }
                        }
                        imageButton.setEnabled(z);
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        z65.h(charSequence, Image.TYPE_SMALL);
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        z65.h(charSequence, Image.TYPE_SMALL);
                    }
                });
                ColorsHelper.setTextColor(activity, eccFragmentChatBinding.subtitle, this.style.chatToolbarTextColorResId);
                ColorsHelper.setTextColor(activity, eccFragmentChatBinding.consultName, this.style.chatToolbarTextColorResId);
                ColorsHelper.setTextColor(activity, eccFragmentChatBinding.subtitle, this.style.chatToolbarTextColorResId);
                ColorsHelper.setTextColor(activity, eccFragmentChatBinding.consultName, this.style.chatToolbarTextColorResId);
                ColorsHelper.setHintTextColor(activity, eccFragmentChatBinding.inputEditView, this.style.chatMessageInputHintTextColor);
                ColorsHelper.setTextColor(activity, eccFragmentChatBinding.inputEditView, this.style.inputTextColor);
                if (!TextUtils.isEmpty(this.style.inputTextFont)) {
                    try {
                        eccFragmentChatBinding.inputEditView.setTypeface(Typeface.createFromAsset(activity.getAssets(), this.style.inputTextFont));
                    } catch (Exception e) {
                        LoggerEdna.error("setFragmentStyle", e);
                    }
                }
                eccFragmentChatBinding.flEmpty.setBackgroundColor(iu1.c(activity, this.style.emptyStateBackgroundColorResId));
                if (!BuildConfig.IS_ANIMATIONS_DISABLED.get()) {
                    Drawable mutate = eccFragmentChatBinding.progressBar.getIndeterminateDrawable().mutate();
                    z65.g(mutate, "progressBar.indeterminateDrawable.mutate()");
                    ColorsHelper.setDrawableColor(activity, mutate, this.style.emptyStateProgressBarColorResId);
                    eccFragmentChatBinding.progressBar.setIndeterminateDrawable(mutate);
                    ColorsHelper.setTextColor(activity, eccFragmentChatBinding.tvEmptyStateHint, this.style.emptyStateHintColorResId);
                    return eccFragmentChatBinding;
                }
                ViewExtensionsKt.invisible(eccFragmentChatBinding.progressBar);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final void setMessagesAsRead() {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.setAllMessagesRead();
        }
        setMessagesAsReadForStorages();
    }

    private final void setMessagesAsReadForStorages() {
        int i;
        Integer num;
        if (this.previousChatItemsCount != 0) {
            ChatAdapter chatAdapter = this.chatAdapter;
            if (chatAdapter != null) {
                num = Integer.valueOf(chatAdapter.getItemCount());
            } else {
                num = null;
            }
            if (num != null) {
                ChatAdapter chatAdapter2 = this.chatAdapter;
                if (chatAdapter2 != null && chatAdapter2.getItemCount() == this.previousChatItemsCount) {
                    return;
                }
            } else {
                return;
            }
        }
        getChatController().setMessagesInCurrentThreadAsReadInDB$threads_release();
        getChatController().clearUnreadPushCount$threads_release();
        ChatAdapter chatAdapter3 = this.chatAdapter;
        if (chatAdapter3 != null) {
            i = chatAdapter3.getItemCount();
        } else {
            i = 0;
        }
        this.previousChatItemsCount = i;
    }

    public final void setRecordButtonVisibility(boolean z) {
        boolean z2;
        VoiceRecordButton voiceRecordButton;
        int i = 0;
        if (z && this.style.voiceMessageEnabled) {
            z2 = true;
        } else {
            z2 = false;
        }
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            voiceRecordButton = eccFragmentChatBinding.recordButton;
        } else {
            voiceRecordButton = null;
        }
        if (voiceRecordButton != null) {
            if (!z2) {
                i = 8;
            }
            voiceRecordButton.setVisibility(i);
        }
    }

    public static final void setStateConsultConnected$lambda$55$lambda$54(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding, ConsultInfo consultInfo) {
        z65.h(chatFragment, "this$0");
        z65.h(eccFragmentChatBinding, "$this_apply");
        Context context = chatFragment.getContext();
        if (context != null && chatFragment.isAdded()) {
            if (!chatFragment.isInMessageSearchMode) {
                eccFragmentChatBinding.consultName.setVisibility(0);
            }
            if (!chatFragment.getResources().getBoolean(chatFragment.style.fixedChatTitle)) {
                if (!chatFragment.isInMessageSearchMode) {
                    eccFragmentChatBinding.subtitle.setVisibility(0);
                }
                if (consultInfo != null) {
                    if (!TextUtils.isEmpty(consultInfo.getName()) && !z65.c(consultInfo.getName(), "null")) {
                        eccFragmentChatBinding.consultName.setText(consultInfo.getName());
                    } else {
                        eccFragmentChatBinding.consultName.setText(context.getString(R.string.ecc_unknown_operator));
                    }
                    chatFragment.setSubtitle(consultInfo, context);
                } else {
                    eccFragmentChatBinding.consultName.setText(context.getString(R.string.ecc_unknown_operator));
                }
            }
            if (!chatFragment.getResources().getBoolean(chatFragment.style.isChatSubtitleVisible)) {
                eccFragmentChatBinding.subtitle.setVisibility(8);
            }
            ChatAdapter chatAdapter = chatFragment.chatAdapter;
            if (chatAdapter != null) {
                chatAdapter.removeConsultSearching();
            }
            chatFragment.showOverflowMenu();
        }
    }

    public static final void setStateSearchingConsult$lambda$63(ChatFragment chatFragment) {
        z65.h(chatFragment, "this$0");
        chatFragment.setTitleStateSearchingConsult();
        ChatAdapter chatAdapter = chatFragment.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.setSearchingConsult();
        }
    }

    private final void setSubtitle(ConsultInfo consultInfo, Context context) {
        String string;
        String role;
        ToolbarSubtitleTextView toolbarSubtitleTextView;
        String organizationUnit;
        if (this.style.chatSubtitleShowOrgUnit && (organizationUnit = consultInfo.getOrganizationUnit()) != null && organizationUnit.length() != 0) {
            string = consultInfo.getOrganizationUnit();
        } else if (!getResources().getBoolean(this.style.fixedChatSubtitle) && (role = consultInfo.getRole()) != null && role.length() != 0) {
            ConsultRole consultRoleFromString = ConsultRole.Companion.consultRoleFromString(consultInfo.getRole());
            if (ConsultRole.BOT != consultRoleFromString && ConsultRole.EXTERNAL_BOT != consultRoleFromString) {
                string = context.getString(R.string.ecc_operator);
            } else {
                string = context.getString(R.string.ecc_bot);
            }
            z65.g(string, "{\n            val role =…)\n            }\n        }");
        } else {
            string = context.getString(this.style.chatSubtitleTextResId);
            z65.g(string, "{\n            context.ge…titleTextResId)\n        }");
        }
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            toolbarSubtitleTextView = eccFragmentChatBinding.subtitle;
        } else {
            toolbarSubtitleTextView = null;
        }
        if (toolbarSubtitleTextView != null) {
            toolbarSubtitleTextView.setText(string);
        }
    }

    private final EccFragmentChatBinding setTitleStateCurrentOperatorConnected() {
        SearchBarView searchBarView;
        SearchBarView searchBarView2;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        SearchListView searchListView = null;
        if (eccFragmentChatBinding == null) {
            return null;
        }
        if (!this.isInMessageSearchMode) {
            if (getChatController().isConsultFound()) {
                if (!getResources().getBoolean(this.style.fixedChatTitle)) {
                    eccFragmentChatBinding.subtitle.setVisibility(0);
                }
                eccFragmentChatBinding.consultName.setVisibility(0);
                EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
                if (eccFragmentChatBinding2 != null) {
                    searchBarView = eccFragmentChatBinding2.searchBar;
                } else {
                    searchBarView = null;
                }
                ViewExtensionsKt.gone(searchBarView);
                EccFragmentChatBinding eccFragmentChatBinding3 = this.binding;
                if (eccFragmentChatBinding3 != null) {
                    searchListView = eccFragmentChatBinding3.searchListView;
                }
                ViewExtensionsKt.gone(searchListView);
                EccFragmentChatBinding eccFragmentChatBinding4 = this.binding;
                if (eccFragmentChatBinding4 != null && (searchBarView2 = eccFragmentChatBinding4.searchBar) != null) {
                    searchBarView2.clearSearch();
                }
            }
            if (!getResources().getBoolean(this.style.isChatSubtitleVisible)) {
                eccFragmentChatBinding.subtitle.setVisibility(8);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return eccFragmentChatBinding;
    }

    public static final void setTitleStateDefault$lambda$57$lambda$56(ChatFragment chatFragment, EccFragmentChatBinding eccFragmentChatBinding) {
        z65.h(chatFragment, "this$0");
        z65.h(eccFragmentChatBinding, "$this_apply");
        if (!chatFragment.isInMessageSearchMode && chatFragment.isAdded()) {
            eccFragmentChatBinding.subtitle.setVisibility(8);
            eccFragmentChatBinding.consultName.setVisibility(0);
            ViewExtensionsKt.gone(eccFragmentChatBinding.searchBar);
            eccFragmentChatBinding.searchBar.clearSearch();
            ViewExtensionsKt.gone(eccFragmentChatBinding.searchListView);
            eccFragmentChatBinding.consultName.setText(chatFragment.style.chatTitleTextResId);
        }
    }

    private final EccFragmentChatBinding setTitleStateSearchingConsult() {
        SearchBarView searchBarView;
        SearchBarView searchBarView2;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        SearchListView searchListView = null;
        if (eccFragmentChatBinding == null) {
            return null;
        }
        if (!this.isInMessageSearchMode && isAdded()) {
            eccFragmentChatBinding.subtitle.setVisibility(8);
            eccFragmentChatBinding.consultName.setVisibility(0);
            EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
            if (eccFragmentChatBinding2 != null) {
                searchBarView = eccFragmentChatBinding2.searchBar;
            } else {
                searchBarView = null;
            }
            ViewExtensionsKt.gone(searchBarView);
            EccFragmentChatBinding eccFragmentChatBinding3 = this.binding;
            if (eccFragmentChatBinding3 != null && (searchBarView2 = eccFragmentChatBinding3.searchBar) != null) {
                searchBarView2.clearSearch();
            }
            EccFragmentChatBinding eccFragmentChatBinding4 = this.binding;
            if (eccFragmentChatBinding4 != null) {
                searchListView = eccFragmentChatBinding4.searchListView;
            }
            ViewExtensionsKt.gone(searchListView);
            if (!getResources().getBoolean(this.style.fixedChatTitle)) {
                eccFragmentChatBinding.consultName.setText(requireContext().getString(R.string.ecc_searching_operator));
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return eccFragmentChatBinding;
    }

    private final void showOverflowMenu() {
        ImageButton imageButton;
        if (isPopupMenuEnabled()) {
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            if (eccFragmentChatBinding != null) {
                imageButton = eccFragmentChatBinding.popupMenuButton;
            } else {
                imageButton = null;
            }
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
        }
    }

    private final void showPermissionDescriptionDialog(PermissionDescriptionType permissionDescriptionType, int i) {
        PermissionDescriptionAlertFragment newInstance = PermissionDescriptionAlertFragment.Companion.newInstance(permissionDescriptionType, i);
        this.permissionDescriptionAlertDialogFragment = newInstance;
        if (newInstance != null) {
            newInstance.show(getChildFragmentManager(), PermissionDescriptionAlertFragment.TAG);
        }
    }

    private final void showSafelyCameraPermissionDescriptionDialog(List<String> list) {
        if (this.permissionDescriptionAlertDialogFragment == null) {
            this.cameraPermissions = list;
            showPermissionDescriptionDialog(PermissionDescriptionType.CAMERA, REQUEST_PERMISSION_CAMERA);
        }
    }

    public final void showSafelyPermissionDescriptionDialog(PermissionDescriptionType permissionDescriptionType, int i) {
        if (this.permissionDescriptionAlertDialogFragment == null) {
            showPermissionDescriptionDialog(permissionDescriptionType, i);
        }
    }

    private final EccFragmentChatBinding showUnreadMessagesCount(int i) {
        boolean z;
        String str;
        int i2;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (eccFragmentChatBinding.scrollDownButtonContainer.getVisibility() == 0) {
                int i3 = 0;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                CustomFontTextView customFontTextView = eccFragmentChatBinding.unreadMsgCount;
                if (z) {
                    str = String.valueOf(i);
                } else {
                    str = "";
                }
                customFontTextView.setText(str);
                CustomFontTextView customFontTextView2 = eccFragmentChatBinding.unreadMsgCount;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                customFontTextView2.setVisibility(i2);
                View view = eccFragmentChatBinding.unreadMsgSticker;
                if (!z) {
                    i3 = 8;
                }
                view.setVisibility(i3);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final void startCameraPermissionActivity(int i) {
        List<String> list = this.cameraPermissions;
        if (list == null) {
            list = kc1.l();
        }
        ArrayList arrayList = new ArrayList(list);
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (i == 201) {
            if (strArr.length == 0) {
                z = true;
            }
            if (!z) {
                PermissionsActivity.Companion.startActivityForResult(getActivity(), REQUEST_PERMISSION_CAMERA, R.string.ecc_permissions_camera_and_write_external_storage_help_text, false, (String[]) Arrays.copyOf(strArr, strArr.length));
            }
        }
    }

    public final void startRecordAudioPermissionActivity(int i) {
        if (i == 204) {
            PermissionsActivity.Companion.startActivityForResult(getActivity(), REQUEST_PERMISSION_RECORD_AUDIO, R.string.ecc_permissions_record_audio_help_text, false, "android.permission.RECORD_AUDIO");
        }
    }

    private final void startStoragePermissionActivity(int i) {
        if (i != 200) {
            if (i == 202) {
                PermissionsActivity.Companion.startActivityForResult(getActivity(), REQUEST_PERMISSION_READ_EXTERNAL, R.string.ecc_permissions_read_external_storage_help_text, !this.style.useSystemFilePicker, "android.permission.READ_EXTERNAL_STORAGE");
                return;
            }
            return;
        }
        PermissionsActivity.Companion.startActivityForResult(getActivity(), REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, R.string.ecc_permissions_read_external_storage_help_text, !this.style.useSystemFilePicker, "android.permission.READ_EXTERNAL_STORAGE");
    }

    private final EccFragmentChatBinding stopRecording() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (this.recorder != null) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                VoiceRecordButton voiceRecordButton = eccFragmentChatBinding.recordButton;
                z65.g(voiceRecordButton, "recordButton");
                z65.g(obtain, "motionEvent");
                voiceRecordButton.onTouch(voiceRecordButton, obtain);
                obtain.recycle();
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    private final void subscribeToFileDescription() {
        r57<rb7<FileDescription>> m = this.fileDescription.m(ti.c());
        final ChatFragment$subscribeToFileDescription$1 chatFragment$subscribeToFileDescription$1 = new ChatFragment$subscribeToFileDescription$1(this);
        subscribe(m.o(new wr1() { // from class: r11
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment.subscribeToFileDescription$lambda$35(Function1.this, obj);
            }
        }));
    }

    public static final void subscribeToFileDescription$lambda$35(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToInputText() {
        r57<String> m = this.inputTextObservable.m(ti.c());
        final ChatFragment$subscribeToInputText$1 chatFragment$subscribeToInputText$1 = new ChatFragment$subscribeToInputText$1(this);
        wr1<? super String> wr1Var = new wr1() { // from class: v11
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment.subscribeToInputText$lambda$36(Function1.this, obj);
            }
        };
        final ChatFragment$subscribeToInputText$2 chatFragment$subscribeToInputText$2 = ChatFragment$subscribeToInputText$2.INSTANCE;
        subscribe(m.p(wr1Var, new wr1() { // from class: x11
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment.subscribeToInputText$lambda$37(Function1.this, obj);
            }
        }));
    }

    public static final void subscribeToInputText$lambda$36(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToInputText$lambda$37(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final void unChooseItem() {
        hideCopyControls();
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.removeHighlight();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x004c, code lost:
        if (isStartSecondLevelScreen() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateChatAdapter(im.threads.ui.adapters.ChatAdapter r8, androidx.recyclerview.widget.LinearLayoutManager r9, java.util.List<? extends im.threads.business.models.ChatItem> r10, int r11, boolean r12, boolean r13, java.lang.Long r14) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r8.getList()
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L9f
            if (r12 == 0) goto L16
            boolean r12 = r7.isStartSecondLevelScreen()
            if (r12 != 0) goto L16
            goto L9f
        L16:
            r12 = r10
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r1
            if (r12 == 0) goto L56
            if (r11 < r0) goto L4e
            java.lang.Object r10 = defpackage.ic1.k0(r10)
            im.threads.business.models.ChatItem r10 = (im.threads.business.models.ChatItem) r10
            if (r10 == 0) goto L2f
            long r3 = r10.getTimeStamp()
            goto L31
        L2f:
            r3 = 0
        L31:
            java.util.ArrayList r10 = r8.getList()
            java.lang.String r12 = "chatAdapter.list"
            defpackage.z65.g(r10, r12)
            java.lang.Object r10 = defpackage.ic1.k0(r10)
            im.threads.business.models.ChatItem r10 = (im.threads.business.models.ChatItem) r10
            long r5 = r10.getTimeStamp()
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L56
            boolean r10 = r7.isStartSecondLevelScreen()
            if (r10 != 0) goto L56
        L4e:
            boolean r10 = r7.isLastMessageVisible()
            if (r10 == 0) goto L56
            r10 = 1
            goto L57
        L56:
            r10 = 0
        L57:
            boolean r12 = im.threads.ui.fragments.ChatFragment.afterResume
            if (r12 == 0) goto L7e
            boolean r12 = r7.isStartSecondLevelScreen()
            if (r12 != 0) goto L65
            if (r13 == 0) goto L65
            if (r0 != r11) goto L67
        L65:
            if (r10 == 0) goto L70
        L67:
            int r8 = r8.getItemCount()
            int r8 = r8 - r1
            r7.scrollToPosition$threads_release(r8, r2)
            goto L9a
        L70:
            if (r14 == 0) goto L9a
            long r10 = r14.longValue()
            int r8 = r8.getPositionByTimeStamp(r10)
            r9.F1(r8)
            goto L9a
        L7e:
            if (r13 == 0) goto L82
            if (r0 > r11) goto L84
        L82:
            if (r10 == 0) goto L8d
        L84:
            int r8 = r8.getItemCount()
            int r8 = r8 - r1
            r7.scrollToPosition$threads_release(r8, r2)
            goto L9a
        L8d:
            if (r14 == 0) goto L9a
            long r10 = r14.longValue()
            int r8 = r8.getPositionByTimeStamp(r10)
            r9.F1(r8)
        L9a:
            im.threads.ui.fragments.ChatFragment.afterResume = r2
            im.threads.ui.fragments.ChatFragment.resumeAfterSecondLevelScreen = r2
            return
        L9f:
            int r8 = r8.getItemCount()
            int r8 = r8 - r1
            r7.scrollToPosition$threads_release(r8, r2)
            im.threads.ui.fragments.ChatFragment.afterResume = r2
            im.threads.ui.fragments.ChatFragment.resumeAfterSecondLevelScreen = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ChatFragment.updateChatAdapter(im.threads.ui.adapters.ChatAdapter, androidx.recyclerview.widget.LinearLayoutManager, java.util.List, int, boolean, boolean, java.lang.Long):void");
    }

    private final void updateLastUserActivityTime() {
        UserActivityTimeProvider.INSTANCE.getLastUserActivityTimeCounter().updateLastUserActivityTime();
    }

    private final void updateToolBar() {
        ImageButton imageButton;
        int i;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            imageButton = eccFragmentChatBinding.popupMenuButton;
        } else {
            imageButton = null;
        }
        if (imageButton != null) {
            if (isPopupMenuEnabled()) {
                i = 0;
            } else {
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        checkBackButtonVisibility();
    }

    public final EccFragmentChatBinding updateUIonPhraseLongClick(final ChatPhrase chatPhrase, int i) {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            unChooseItem();
            final androidx.fragment.app.d activity = getActivity();
            if (activity != null) {
                z65.g(activity, "activity ?: return@apply");
                ChatStyle chatStyle = this.style;
                int i2 = chatStyle.chatBodyIconsTint;
                if (i2 == 0) {
                    i2 = chatStyle.chatToolbarInverseIconTintResId;
                }
                ColorsHelper.setTint(activity, eccFragmentChatBinding.popupMenuButton, i2);
                ColorsHelper.setTint(activity, eccFragmentChatBinding.chatBackButton, i2);
                ColorsHelper.setBackgroundColor(activity, eccFragmentChatBinding.toolbar, this.style.chatToolbarContextMenuColorResId);
                eccFragmentChatBinding.toolbar.setElevation(0.0f);
                eccFragmentChatBinding.copyControls.setVisibility(0);
                eccFragmentChatBinding.consultName.setVisibility(8);
                eccFragmentChatBinding.subtitle.setVisibility(8);
                String phraseText = chatPhrase.getPhraseText();
                if (phraseText != null && phraseText.length() != 0) {
                    eccFragmentChatBinding.contentCopy.setVisibility(0);
                } else {
                    eccFragmentChatBinding.contentCopy.setVisibility(8);
                }
                if (ViewExtensionsKt.isNotVisible(eccFragmentChatBinding.chatBackButton)) {
                    ViewExtensionsKt.visible(eccFragmentChatBinding.chatBackButton);
                }
                sh0.d(this.coroutineScope, null, null, new ChatFragment$updateUIonPhraseLongClick$1$1(this, chatPhrase, eccFragmentChatBinding, i, null), 3, null);
                eccFragmentChatBinding.contentCopy.setOnClickListener(new View.OnClickListener() { // from class: i21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatFragment.updateUIonPhraseLongClick$lambda$80$lambda$79(ChatFragment.this, activity, chatPhrase, view);
                    }
                });
                ChatAdapter chatAdapter = this.chatAdapter;
                if (chatAdapter != null) {
                    chatAdapter.setItemHighlighted(chatPhrase);
                    return eccFragmentChatBinding;
                }
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public static final void updateUIonPhraseLongClick$lambda$80$lambda$79(ChatFragment chatFragment, androidx.fragment.app.d dVar, ChatPhrase chatPhrase, View view) {
        z65.h(chatFragment, "this$0");
        z65.h(dVar, "$activity");
        z65.h(chatPhrase, "$chatPhrase");
        chatFragment.onCopyClick(dVar, chatPhrase);
        chatFragment.checkBackButtonVisibility();
    }

    @Override // im.threads.business.media.ChatCenterAudioConverterCallback
    public void acceptConvertedFile(File file) {
        z65.h(file, "convertedFile");
        addVoiceMessagePreview(file);
    }

    public final EccFragmentChatBinding addChatItem(ChatItem chatItem) {
        ChatAdapter chatAdapter;
        List e;
        boolean z;
        ChatAdapter chatAdapter2;
        String id;
        boolean y;
        List<String> e2;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding == null) {
            return null;
        }
        boolean isLastMessageVisible = isLastMessageVisible();
        if (chatItem != null) {
            if (chatItem instanceof ConsultPhrase) {
                ConsultPhrase consultPhrase = (ConsultPhrase) chatItem;
                boolean read = consultPhrase.getRead();
                if (isLastMessageVisible && isResumed() && !this.isInMessageSearchMode) {
                    z = true;
                } else {
                    z = false;
                }
                consultPhrase.setRead(z);
                if (consultPhrase.getRead()) {
                    if (!read && (id = consultPhrase.getId()) != null) {
                        y = l0b.y(id);
                        if (!y) {
                            Transport transport = BaseConfig.Companion.getInstance().transport;
                            e2 = jc1.e(consultPhrase.getId());
                            transport.markMessagesAsRead(e2);
                        }
                    }
                    ChatController.setMessageAsRead$threads_release$default(getChatController(), chatItem, false, 2, null);
                }
                ChatAdapter chatAdapter3 = this.chatAdapter;
                if (chatAdapter3 != null) {
                    chatAdapter3.setAvatar(consultPhrase.getConsultId(), consultPhrase.getAvatarPath());
                }
                if (consultPhrase.getModified() != ModificationStateEnum.NONE && (chatAdapter2 = this.chatAdapter) != null) {
                    chatAdapter2.updateQuotesIfNeed(consultPhrase);
                }
            }
            if (needsAddMessage(chatItem)) {
                showWelcomeScreen$threads_release(false);
                e = jc1.e(chatItem);
                addItemsToChat$default(this, e, null, false, 6, null);
                if (!isLastMessageVisible()) {
                    eccFragmentChatBinding.scrollDownButtonContainer.setVisibility(0);
                    showUnreadMessagesCount(getChatController().getUnreadMessagesCount$threads_release());
                }
                scrollDelayedOnNewMessageReceived(chatItem instanceof UserPhrase, isLastMessageVisible);
                return eccFragmentChatBinding;
            } else if (needsModifyImage(chatItem) && (chatAdapter = this.chatAdapter) != null) {
                chatAdapter.modifyImageInItem(((ChatPhrase) chatItem).getFileDescription());
                return eccFragmentChatBinding;
            } else {
                return eccFragmentChatBinding;
            }
        }
        return eccFragmentChatBinding;
    }

    public final void addChatItems(final List<? extends ChatItem> list, final boolean z) {
        final ChatAdapter chatAdapter;
        RecyclerView.p pVar;
        boolean z2;
        RecyclerView recyclerView;
        z65.h(list, StatisticManager.LIST);
        if (!list.isEmpty() && (chatAdapter = this.chatAdapter) != null) {
            final int size = chatAdapter.getList().size();
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            Long l = null;
            if (eccFragmentChatBinding != null && (recyclerView = eccFragmentChatBinding.chatItemsRecycler) != null) {
                pVar = recyclerView.getLayoutManager();
            } else {
                pVar = null;
            }
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pVar;
            if ((chatAdapter.getItemCount() - 1) - getLastVisibleItemPosition$threads_release() < 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (linearLayoutManager != null) {
                if ((list.size() != 1 || !(list.get(0) instanceof ConsultTyping)) && !this.isInMessageSearchMode) {
                    showWelcomeScreen$threads_release(false);
                    int k2 = linearLayoutManager.k2();
                    if (k2 >= 0 && k2 < chatAdapter.getList().size()) {
                        l = Long.valueOf(chatAdapter.getList().get(k2).getTimeStamp());
                    }
                    final Long l2 = l;
                    final boolean z3 = z2;
                    addItemsToChat(list, new gr5() { // from class: im.threads.ui.fragments.ChatFragment$addChatItems$1$listUpdatedCallback$1
                        @Override // defpackage.gr5
                        public void onInserted(int i, int i2) {
                            ChatFragment.this.updateChatAdapter(chatAdapter, linearLayoutManager, list, size, z, z3, l2);
                        }

                        @Override // defpackage.gr5
                        public void onMoved(int i, int i2) {
                        }

                        @Override // defpackage.gr5
                        public void onRemoved(int i, int i2) {
                        }

                        @Override // defpackage.gr5
                        public void onChanged(int i, int i2, Object obj) {
                        }
                    }, z2);
                }
            }
        }
    }

    public final void cleanChat() {
        androidx.fragment.app.d activity = getActivity();
        if (isAdded() && activity != null) {
            this.handler.post(new Runnable() { // from class: l11
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.cleanChat$lambda$60(ChatFragment.this);
                }
            });
        }
    }

    public final void configureUserTypingSubscription() {
        sh0.d(this.coroutineScope, null, null, new ChatFragment$configureUserTypingSubscription$1(this, null), 3, null);
    }

    public final int getDisplayedMessagesCount$threads_release() {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            return chatAdapter.getItemCount();
        }
        return 0;
    }

    public final List<ChatItem> getElements() {
        ArrayList<ChatItem> arrayList;
        if (isAdded()) {
            ChatAdapter chatAdapter = this.chatAdapter;
            if (chatAdapter != null) {
                arrayList = chatAdapter.getList();
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                return new ArrayList();
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public final FileDescription getFileDescription() {
        rb7<FileDescription> A = this.fileDescription.A();
        if (A != null && A.d()) {
            return A.b();
        }
        return null;
    }

    public final ta0<rb7<FileDescription>> getFileDescription$threads_release() {
        return this.fileDescription;
    }

    public final int getLastVisibleItemPosition$threads_release() {
        LinearLayoutManager linearLayoutManager;
        if (!isAdded() || (linearLayoutManager = this.mLayoutManager) == null) {
            return -1;
        }
        return linearLayoutManager.k2();
    }

    public final QuickReplyItem getQuickReplyItem() {
        return this.quickReplyItem;
    }

    public final ChatStyle getStyle() {
        return this.style;
    }

    public final void hideBottomSheet() {
        AttachmentBottomSheetDialogFragment attachmentBottomSheetDialogFragment = this.bottomSheetDialogFragment;
        if (attachmentBottomSheetDialogFragment != null) {
            z65.e(attachmentBottomSheetDialogFragment);
            attachmentBottomSheetDialogFragment.dismiss();
            this.bottomSheetDialogFragment = null;
        }
    }

    public final void hideEmptyState() {
        LinearLayout linearLayout;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            linearLayout = eccFragmentChatBinding.flEmpty;
        } else {
            linearLayout = null;
        }
        ViewExtensionsKt.gone(linearLayout);
    }

    public final EccFragmentChatBinding hideErrorView$threads_release(boolean z) {
        int i;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            ViewExtensionsKt.gone(eccFragmentChatBinding.chatErrorLayout.errorLayout);
            LoggerEdna.info("Hiding error layout");
            ViewExtensionsKt.visible(eccFragmentChatBinding.bottomLayout);
            LoggerEdna.info("Showing bottom layout");
            isNeedToShowWelcome(new ChatFragment$hideErrorView$1$1(z, this, eccFragmentChatBinding));
            ImageButton imageButton = eccFragmentChatBinding.popupMenuButton;
            if (isPopupMenuEnabled()) {
                i = 0;
            } else {
                i = 8;
            }
            imageButton.setVisibility(i);
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void hideProgressBar() {
        LinearLayout linearLayout;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        MySwipeRefreshLayout mySwipeRefreshLayout = null;
        if (eccFragmentChatBinding != null) {
            linearLayout = eccFragmentChatBinding.flEmpty;
        } else {
            linearLayout = null;
        }
        ViewExtensionsKt.gone(linearLayout);
        EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
        if (eccFragmentChatBinding2 != null) {
            mySwipeRefreshLayout = eccFragmentChatBinding2.swipeRefresh;
        }
        if (mySwipeRefreshLayout != null) {
            mySwipeRefreshLayout.setRefreshing(false);
        }
    }

    public final void hideQuickReplies() {
        ChatAdapter chatAdapter;
        QuickReplyItem quickReplyItem = this.quickReplyItem;
        if (quickReplyItem != null && (chatAdapter = this.chatAdapter) != null) {
            chatAdapter.removeItem(quickReplyItem);
        }
    }

    public final void initRecordButtonState$threads_release() {
        VoiceRecordButton voiceRecordButton;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            voiceRecordButton = eccFragmentChatBinding.recordButton;
        } else {
            voiceRecordButton = null;
        }
        if (!ThreadsPermissionChecker.isRecordAudioPermissionGranted(requireContext())) {
            if (voiceRecordButton != null) {
                voiceRecordButton.setListenForRecord(false);
            }
            if (voiceRecordButton != null) {
                voiceRecordButton.setOnRecordClickListener(new VoiceRecordOnRecordClickListener() { // from class: im.threads.ui.fragments.ChatFragment$initRecordButtonState$1
                    @Override // im.threads.ui.views.recordview.VoiceRecordOnRecordClickListener
                    public void onClick(View view) {
                        if (ChatFragment.this.getStyle().arePermissionDescriptionDialogsEnabled) {
                            ChatFragment.this.showSafelyPermissionDescriptionDialog(PermissionDescriptionType.RECORD_AUDIO, ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO);
                        } else {
                            ChatFragment.this.startRecordAudioPermissionActivity(ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO);
                        }
                    }
                });
                return;
            }
            return;
        }
        if (voiceRecordButton != null) {
            voiceRecordButton.setListenForRecord(true);
        }
        if (voiceRecordButton != null) {
            voiceRecordButton.setOnRecordClickListener(null);
        }
    }

    public final boolean isErrorViewNotVisible$threads_release() {
        LinearLayout linearLayout;
        EccChatErrorLayoutBinding eccChatErrorLayoutBinding;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null && (eccChatErrorLayoutBinding = eccFragmentChatBinding.chatErrorLayout) != null) {
            linearLayout = eccChatErrorLayoutBinding.errorLayout;
        } else {
            linearLayout = null;
        }
        return ViewExtensionsKt.isNotVisible(linearLayout);
    }

    public final boolean isStartSecondLevelScreen() {
        return resumeAfterSecondLevelScreen;
    }

    public final void notifyConsultAvatarChanged(final String str, final String str2) {
        this.handler.post(new Runnable() { // from class: d11
            @Override // java.lang.Runnable
            public final void run() {
                ChatFragment.notifyConsultAvatarChanged$lambda$61(ChatFragment.this, str, str2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        VoiceRecordButton voiceRecordButton = null;
        if (i != 204) {
            switch (i) {
                case 100:
                    if (i2 == -1 && intent != null) {
                        onPhotosResult(intent);
                        return;
                    }
                    return;
                case 101:
                    if (i2 == -1 && intent != null) {
                        onPhotoResult(intent);
                        return;
                    }
                    return;
                case 102:
                    if (i2 == -1 && this.externalCameraPhotoFile != null) {
                        onExternalCameraPhotoResult();
                    }
                    this.externalCameraPhotoFile = null;
                    return;
                case 103:
                    if (i2 == -1 && intent != null) {
                        onFileResult(intent);
                        return;
                    }
                    return;
                default:
                    switch (i) {
                        case REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY /* 200 */:
                            if (i2 == 10) {
                                openBottomSheetAndGallery();
                                return;
                            }
                            return;
                        case REQUEST_PERMISSION_CAMERA /* 201 */:
                            if (i2 == 10) {
                                onCameraClick();
                                return;
                            }
                            return;
                        case REQUEST_PERMISSION_READ_EXTERNAL /* 202 */:
                            if (i2 == 10) {
                                openFile();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
            }
        } else if (i2 == 10) {
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            if (eccFragmentChatBinding != null) {
                voiceRecordButton = eccFragmentChatBinding.recordButton;
            }
            if (voiceRecordButton != null) {
                voiceRecordButton.setListenForRecord(true);
            }
            Context requireContext = requireContext();
            z65.g(requireContext, "requireContext()");
            String string = requireContext().getString(R.string.ecc_hold_button_to_record_audio);
            z65.g(string, "requireContext().getStri…d_button_to_record_audio)");
            Balloon.show(requireContext, string);
        }
    }

    @Override // im.threads.ui.fragments.PermissionDescriptionAlertFragment.OnAllowPermissionClickListener
    public void onAllowClick(PermissionDescriptionType permissionDescriptionType, int i) {
        z65.h(permissionDescriptionType, MessageAttributes.TYPE);
        int i2 = WhenMappings.$EnumSwitchMapping$0[permissionDescriptionType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    startCameraPermissionActivity(i);
                    return;
                }
                return;
            }
            startRecordAudioPermissionActivity(i);
            return;
        }
        startStoragePermissionActivity(i);
    }

    public final boolean onBackPressed() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        SearchBarView searchBarView;
        SearchBarView searchBarView2;
        SearchBarView searchBarView3;
        if (getActivity() == null && !isAdded()) {
            return true;
        }
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.removeHighlight();
        }
        if (this.bottomSheetDialogFragment != null) {
            hideBottomSheet();
        } else {
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            SearchBarView searchBarView4 = null;
            if (eccFragmentChatBinding != null) {
                linearLayout = eccFragmentChatBinding.copyControls;
            } else {
                linearLayout = null;
            }
            if (ViewExtensionsKt.isVisible(linearLayout)) {
                EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
                if (eccFragmentChatBinding2 != null) {
                    searchBarView = eccFragmentChatBinding2.searchBar;
                } else {
                    searchBarView = null;
                }
                if (ViewExtensionsKt.isVisible(searchBarView)) {
                    unChooseItem();
                    EccFragmentChatBinding eccFragmentChatBinding3 = this.binding;
                    if (eccFragmentChatBinding3 != null && (searchBarView3 = eccFragmentChatBinding3.searchBar) != null) {
                        searchBarView3.requestFocus();
                    }
                    EccFragmentChatBinding eccFragmentChatBinding4 = this.binding;
                    if (eccFragmentChatBinding4 != null && (searchBarView2 = eccFragmentChatBinding4.searchBar) != null) {
                        searchBarView2.showKeyboard(100L);
                    }
                }
            }
            EccFragmentChatBinding eccFragmentChatBinding5 = this.binding;
            if (eccFragmentChatBinding5 != null) {
                linearLayout2 = eccFragmentChatBinding5.copyControls;
            } else {
                linearLayout2 = null;
            }
            if (ViewExtensionsKt.isVisible(linearLayout2)) {
                unChooseItem();
                checkBackButtonVisibility();
            } else {
                EccFragmentChatBinding eccFragmentChatBinding6 = this.binding;
                if (eccFragmentChatBinding6 != null) {
                    searchBarView4 = eccFragmentChatBinding6.searchBar;
                }
                if (ViewExtensionsKt.isVisible(searchBarView4)) {
                    hideSearchMode();
                    ChatAdapter chatAdapter2 = this.chatAdapter;
                    if (chatAdapter2 != null) {
                        z65.e(chatAdapter2);
                        scrollToPosition$threads_release(chatAdapter2.getItemCount() - 1, false);
                    }
                } else {
                    QuoteLayoutHolder quoteLayoutHolder = this.quoteLayoutHolder;
                    if (quoteLayoutHolder != null && quoteLayoutHolder.isVisible()) {
                        QuoteLayoutHolder quoteLayoutHolder2 = this.quoteLayoutHolder;
                        if (quoteLayoutHolder2 != null) {
                            quoteLayoutHolder2.clear();
                        }
                    } else if (!this.isInMessageSearchMode) {
                        return true;
                    } else {
                        hideSearchMode();
                    }
                }
            }
        }
        return false;
    }

    @Override // im.threads.ui.fragments.AttachmentBottomSheetDialogFragment.Callback
    public void onBottomSheetDetached() {
        this.bottomSheetDialogFragment = null;
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onCameraClick() {
        boolean z;
        androidx.fragment.app.d activity = getActivity();
        if (activity == null) {
            return;
        }
        boolean isCameraPermissionGranted = ThreadsPermissionChecker.isCameraPermissionGranted(activity);
        if (Build.VERSION.SDK_INT < 29 && !ThreadsPermissionChecker.isWriteExternalPermissionGranted(activity)) {
            z = false;
        } else {
            z = true;
        }
        LoggerEdna.info("isCameraGranted = " + isCameraPermissionGranted + " isWriteGranted " + z);
        if (isCameraPermissionGranted && z) {
            sh0.d(this.coroutineScope, null, null, new ChatFragment$onCameraClick$1(this, activity, null), 3, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!isCameraPermissionGranted) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!z) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (this.style.arePermissionDescriptionDialogsEnabled) {
            showSafelyCameraPermissionDescriptionDialog(arrayList);
            return;
        }
        this.cameraPermissions = arrayList;
        startCameraPermissionActivity(REQUEST_PERMISSION_CAMERA);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onCreateView.");
        androidx.fragment.app.d activity = getActivity();
        if (activity instanceof ChatActivity) {
            WeakReference weakReference = new WeakReference(activity);
            ChatStyle chatStyle = this.style;
            ColorsHelper.setStatusBarColor(weakReference, chatStyle.chatStatusBarColorResId, chatStyle.windowLightStatusBarResId);
        }
        this.binding = EccFragmentChatBinding.inflate(layoutInflater, viewGroup, false);
        this.chatAdapterCallback = new AdapterCallback();
        Object systemService = requireContext().getSystemService("audio");
        z65.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.fdMediaPlayer = new FileDescriptionMediaPlayer((AudioManager) systemService);
        initViews();
        initRecording();
        bindViews();
        setHasOptionsMenu(true);
        initController();
        setFragmentStyle();
        initMediaPlayer();
        subscribeToFileDescription();
        subscribeToInputText();
        isShown = true;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        z65.e(eccFragmentChatBinding);
        InterceptTouchFrameLayout root = eccFragmentChatBinding.getRoot();
        z65.g(root, "binding!!.root");
        return root;
    }

    @Override // im.threads.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onDestroyView.");
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.fdMediaPlayer;
        if (fileDescriptionMediaPlayer != null) {
            fileDescriptionMediaPlayer.release();
            this.fdMediaPlayer = null;
        }
        getChatController().unbindFragment$threads_release();
        androidx.fragment.app.d activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.mChatReceiver);
        }
        isShown = false;
        BaseHolder.Companion.getStatuses().clear();
        BaseConfig.Companion.getInstance().transport.setLifecycle(null);
        getChatController().onViewDestroy();
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.onDestroyView();
        }
        this.binding = null;
        super.onDestroyView();
    }

    @Override // im.threads.ui.fragments.PermissionDescriptionAlertFragment.OnAllowPermissionClickListener
    public void onDialogDetached() {
        this.cameraPermissions = null;
        this.permissionDescriptionAlertDialogFragment = null;
    }

    @Override // im.threads.business.broadcastReceivers.ProgressReceiver.Callback
    public void onDownloadError(FileDescription fileDescription, Throwable th) {
        if (isAdded() && getActivity() != null) {
            updateProgress(fileDescription);
            if (th instanceof FileNotFoundException) {
                Context requireContext = requireContext();
                z65.g(requireContext, "requireContext()");
                String string = getString(R.string.ecc_error_no_file);
                z65.g(string, "getString(R.string.ecc_error_no_file)");
                Balloon.show(requireContext, string);
                ChatAdapter chatAdapter = this.chatAdapter;
                if (chatAdapter != null) {
                    chatAdapter.onDownloadError(fileDescription);
                }
            }
            if (th instanceof UnknownHostException) {
                Context requireContext2 = requireContext();
                z65.g(requireContext2, "requireContext()");
                String string2 = getString(R.string.ecc_check_connection);
                z65.g(string2, "getString(R.string.ecc_check_connection)");
                Balloon.show(requireContext2, string2);
                ChatAdapter chatAdapter2 = this.chatAdapter;
                if (chatAdapter2 != null) {
                    chatAdapter2.onDownloadError(fileDescription);
                }
            }
        }
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onFilePickerClick() {
        setBottomStateDefault();
        openFile();
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onGalleryClick() {
        if (this.style.useSystemFilePicker) {
            this.pickMedia.a(w58.a(v5.b.a));
            AttachmentBottomSheetDialogFragment attachmentBottomSheetDialogFragment = this.bottomSheetDialogFragment;
            if (attachmentBottomSheetDialogFragment != null) {
                attachmentBottomSheetDialogFragment.dismiss();
                return;
            }
            return;
        }
        androidx.fragment.app.d activity = getActivity();
        if (activity == null) {
            return;
        }
        if (ThreadsPermissionChecker.isReadExternalPermissionGranted(activity)) {
            startActivityForResult(GalleryActivity.Companion.getStartIntent(activity, 100), 100);
        } else if (this.style.arePermissionDescriptionDialogsEnabled) {
            showSafelyPermissionDescriptionDialog(PermissionDescriptionType.STORAGE, REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY);
        }
    }

    @Override // im.threads.ui.fragments.AttachmentBottomSheetDialogFragment.Callback
    public void onImageSelectionChanged(List<? extends Uri> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        this.mAttachedImages = arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        MySwipeRefreshLayout mySwipeRefreshLayout;
        MySwipeRefreshLayout mySwipeRefreshLayout2;
        MySwipeRefreshLayout mySwipeRefreshLayout3;
        super.onPause();
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onPause.");
        stopRecording();
        FileDescription fileDescription = getFileDescription();
        if (fileDescription == null || FileUtils.isVoiceMessage(fileDescription)) {
            getChatController().setFileDescriptionDraft(fileDescription);
        }
        getChatController().setActivityIsForeground$threads_release(false);
        if (isAdded()) {
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            if (eccFragmentChatBinding != null) {
                mySwipeRefreshLayout = eccFragmentChatBinding.swipeRefresh;
            } else {
                mySwipeRefreshLayout = null;
            }
            if (mySwipeRefreshLayout != null) {
                mySwipeRefreshLayout.setRefreshing(false);
            }
            EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
            if (eccFragmentChatBinding2 != null && (mySwipeRefreshLayout3 = eccFragmentChatBinding2.swipeRefresh) != null) {
                mySwipeRefreshLayout3.destroyDrawingCache();
            }
            EccFragmentChatBinding eccFragmentChatBinding3 = this.binding;
            if (eccFragmentChatBinding3 != null && (mySwipeRefreshLayout2 = eccFragmentChatBinding3.swipeRefresh) != null) {
                mySwipeRefreshLayout2.clearAnimation();
            }
            ChatAdapter chatAdapter = this.chatAdapter;
            if (chatAdapter != null) {
                chatAdapter.onPauseView();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onResume.");
        super.onResume();
        getChatController().setActivityIsForeground$threads_release(true);
        scrollToFirstUnreadMessage();
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.onResumeView();
        }
        isShown = true;
        afterResume = true;
        updateToolBar();
        checkBottomLayout();
    }

    @Override // im.threads.ui.views.BottomSheetView.ButtonsListener
    public void onSendClick() {
        List<Uri> list = this.mAttachedImages;
        if (list != null) {
            z65.e(list);
            if (!list.isEmpty()) {
                bma h = bma.f(new Callable() { // from class: g11
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List onSendClick$lambda$40;
                        onSendClick$lambda$40 = ChatFragment.onSendClick$lambda$40(ChatFragment.this);
                        return onSendClick$lambda$40;
                    }
                }).k(dw9.b()).h(ti.c());
                final ChatFragment$onSendClick$2 chatFragment$onSendClick$2 = new ChatFragment$onSendClick$2(this);
                wr1 wr1Var = new wr1() { // from class: h11
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ChatFragment.onSendClick$lambda$41(Function1.this, obj);
                    }
                };
                final ChatFragment$onSendClick$3 chatFragment$onSendClick$3 = ChatFragment$onSendClick$3.INSTANCE;
                subscribe(h.i(wr1Var, new wr1() { // from class: i11
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ChatFragment.onSendClick$lambda$42(Function1.this, obj);
                    }
                }));
                return;
            }
        }
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext()");
        String string = getString(R.string.ecc_failed_to_open_file);
        z65.g(string, "getString(R.string.ecc_failed_to_open_file)");
        Balloon.show(requireContext, string);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onStart.");
        ChatController.Companion.getInstance().onViewStart();
        initRecordButtonState$threads_release();
        Long threadId = getChatController().getThreadId();
        if (threadId != null) {
            setCurrentThreadId(threadId.longValue());
        }
        BaseConfig.Companion.getInstance().transport.setLifecycle(getLifecycle());
        checkScrollDownButtonVisibility();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onStop.");
        super.onStop();
        getChatController().onViewStop();
        isShown = false;
        this.isInMessageSearchMode = false;
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.fdMediaPlayer;
        if (fileDescriptionMediaPlayer != null) {
            fileDescriptionMediaPlayer.clearClickedDownloadPath();
        }
        this.recorder = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        String simpleName = ChatFragment.class.getSimpleName();
        LoggerEdna.info(simpleName + " onViewCreated.");
        super.onViewCreated(view, bundle);
        FileDescription fileDescriptionDraft = getChatController().getFileDescriptionDraft();
        if (FileUtils.isVoiceMessage(fileDescriptionDraft)) {
            setFileDescription(fileDescriptionDraft);
            QuoteLayoutHolder quoteLayoutHolder = this.quoteLayoutHolder;
            if (quoteLayoutHolder != null) {
                quoteLayoutHolder.setVoice();
            }
        }
        CampaignMessage campaignMessage = getChatController().getCampaignMessage();
        Bundle arguments = getArguments();
        if (arguments != null && campaignMessage != null) {
            if (arguments.getInt(ARG_OPEN_WAY) == 0) {
                return;
            }
            String uuid = UUID.randomUUID().toString();
            z65.g(uuid, "randomUUID().toString()");
            this.mQuote = new Quote(uuid, campaignMessage.getSenderName(), campaignMessage.getText(), null, campaignMessage.getReceivedDate().getTime(), ModificationStateEnum.NONE);
            this.campaignMessage = campaignMessage;
            QuoteLayoutHolder quoteLayoutHolder2 = this.quoteLayoutHolder;
            if (quoteLayoutHolder2 != null) {
                quoteLayoutHolder2.setContent(campaignMessage.getSenderName(), campaignMessage.getText(), null, false);
            }
            getChatController().setCampaignMessage(null);
        }
        initToolbar();
        initSearch();
    }

    public final boolean removeResolveRequest() {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            return chatAdapter.removeResolveRequest();
        }
        return false;
    }

    public final void removeSchedule(boolean z) {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.removeSchedule(z);
        }
    }

    public final void removeSearching() {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.removeConsultSearching();
            showOverflowMenu();
        }
    }

    public final boolean removeSurvey(long j) {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            return chatAdapter.removeSurvey(j);
        }
        return false;
    }

    public final void scrollToElementByIndex(int i) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView;
        if (isAdded() && (linearLayoutManager = this.mLayoutManager) != null) {
            EccFragmentChatBinding eccFragmentChatBinding = this.binding;
            if (eccFragmentChatBinding != null) {
                recyclerView = eccFragmentChatBinding.chatItemsRecycler;
            } else {
                recyclerView = null;
            }
            linearLayoutManager.Q1(recyclerView, new RecyclerView.a0(), i);
        }
    }

    public final EccFragmentChatBinding scrollToPosition$threads_release(int i, boolean z) {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (i >= 0 && isAdded()) {
                if (z) {
                    eccFragmentChatBinding.chatItemsRecycler.smoothScrollToPosition(i);
                    return eccFragmentChatBinding;
                }
                eccFragmentChatBinding.chatItemsRecycler.scrollToPosition(i);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void setAllMessagesWereRead() {
        if (this.chatAdapter != null) {
            setMessagesAsRead();
        }
    }

    public final void setClientNotificationDisplayType(ClientNotificationDisplayType clientNotificationDisplayType) {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.setClientNotificationDisplayType(clientNotificationDisplayType);
        }
    }

    public final void setCurrentThreadId(long j) {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.setCurrentThreadId(j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z) {
        if (z) {
            showOverflowMenu();
        } else {
            hideOverflowMenu();
        }
    }

    public final void setMessageState(String str, String str2, MessageStatus messageStatus) {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.changeStateOfMessageByMessageId(str, str2, messageStatus);
        }
    }

    public final void setQuickReplyItem(QuickReplyItem quickReplyItem) {
        this.quickReplyItem = quickReplyItem;
    }

    public final EccFragmentChatBinding setStateConsultConnected(final ConsultInfo consultInfo) {
        final EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (isAdded()) {
                this.handler.post(new Runnable() { // from class: k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatFragment.setStateConsultConnected$lambda$55$lambda$54(ChatFragment.this, eccFragmentChatBinding, consultInfo);
                    }
                });
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void setStateSearchingConsult() {
        this.handler.post(new Runnable() { // from class: y11
            @Override // java.lang.Runnable
            public final void run() {
                ChatFragment.setStateSearchingConsult$lambda$63(ChatFragment.this);
            }
        });
    }

    public final void setSurveySentStatus(Survey survey) {
        z65.h(survey, "survey");
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.changeStateOfSurvey(survey);
        }
    }

    public final EccFragmentChatBinding setTitleStateDefault() {
        final EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            this.handler.post(new Runnable() { // from class: u11
                @Override // java.lang.Runnable
                public final void run() {
                    ChatFragment.setTitleStateDefault$lambda$57$lambda$56(ChatFragment.this, eccFragmentChatBinding);
                }
            });
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void setupStartSecondLevelScreen() {
        resumeAfterSecondLevelScreen = true;
    }

    public final void showBalloon(String str) {
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext()");
        z65.e(str);
        Balloon.show(requireContext, str);
    }

    public final void showBalloon$threads_release(int i) {
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext()");
        String string = getString(i);
        z65.g(string, "getString(messageResId)");
        Balloon.show(requireContext, string);
    }

    public final void showBottomBar$threads_release() {
        LinearLayout linearLayout;
        LoggerEdna.info("Showing bottom layout");
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            linearLayout = eccFragmentChatBinding.bottomLayout;
        } else {
            linearLayout = null;
        }
        ViewExtensionsKt.visible(linearLayout);
    }

    public final void showBottomSheet() {
        if (this.bottomSheetDialogFragment == null && isAdded()) {
            AttachmentBottomSheetDialogFragment attachmentBottomSheetDialogFragment = new AttachmentBottomSheetDialogFragment();
            this.bottomSheetDialogFragment = attachmentBottomSheetDialogFragment;
            z65.e(attachmentBottomSheetDialogFragment);
            attachmentBottomSheetDialogFragment.show(getChildFragmentManager(), AttachmentBottomSheetDialogFragment.Companion.getTAG());
        }
    }

    public final EccFragmentChatBinding showEmptyState() {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (getChatController().isChatReady$threads_release()) {
                eccFragmentChatBinding.flEmpty.setVisibility(0);
                eccFragmentChatBinding.tvEmptyStateHint.setText(R.string.ecc_empty_state_hint);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final EccFragmentChatBinding showErrorView$threads_release(String str) {
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            if (ViewExtensionsKt.isNotVisible(eccFragmentChatBinding.chatErrorLayout.errorLayout)) {
                showWelcomeScreen$threads_release(false);
                hideProgressBar();
                ViewExtensionsKt.invisible(eccFragmentChatBinding.chatItemsRecycler);
                ViewExtensionsKt.invisible(eccFragmentChatBinding.bottomLayout);
                LoggerEdna.info("Hiding bottom layout, recycler view, progress bar, welcome screen. Showing error layout.");
                ViewExtensionsKt.visible(eccFragmentChatBinding.chatErrorLayout.errorLayout);
                initErrorViewStyles();
                eccFragmentChatBinding.chatErrorLayout.errorMessage.setText(str);
                eccFragmentChatBinding.popupMenuButton.setVisibility(8);
                return eccFragmentChatBinding;
            }
            return eccFragmentChatBinding;
        }
        return null;
    }

    public final void showProgressBar() {
        WelcomeScreen welcomeScreen;
        TextView textView;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        LinearLayout linearLayout = null;
        if (eccFragmentChatBinding != null) {
            welcomeScreen = eccFragmentChatBinding.welcome;
        } else {
            welcomeScreen = null;
        }
        ViewExtensionsKt.gone(welcomeScreen);
        EccFragmentChatBinding eccFragmentChatBinding2 = this.binding;
        if (eccFragmentChatBinding2 != null) {
            linearLayout = eccFragmentChatBinding2.flEmpty;
        }
        ViewExtensionsKt.visible(linearLayout);
        EccFragmentChatBinding eccFragmentChatBinding3 = this.binding;
        if (eccFragmentChatBinding3 != null && (textView = eccFragmentChatBinding3.tvEmptyStateHint) != null) {
            textView.setText(this.style.loaderTextResId);
        }
    }

    public final void showQuickReplies(QuickReplyItem quickReplyItem) {
        this.quickReplyItem = quickReplyItem;
        addChatItem(quickReplyItem);
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            scrollToPosition$threads_release(chatAdapter.getItemCount() - 1, false);
        }
        hideBottomSheet();
    }

    public final void showWelcomeScreen$threads_release(boolean z) {
        WelcomeScreen welcomeScreen;
        int i;
        EccChatErrorLayoutBinding eccChatErrorLayoutBinding;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        LinearLayout linearLayout = null;
        if (eccFragmentChatBinding != null) {
            welcomeScreen = eccFragmentChatBinding.welcome;
        } else {
            welcomeScreen = null;
        }
        if (welcomeScreen != null) {
            if (z) {
                if (eccFragmentChatBinding != null && (eccChatErrorLayoutBinding = eccFragmentChatBinding.chatErrorLayout) != null) {
                    linearLayout = eccChatErrorLayoutBinding.errorLayout;
                }
                if (ViewExtensionsKt.isNotVisible(linearLayout)) {
                    i = 0;
                    welcomeScreen.setVisibility(i);
                }
            }
            i = 8;
            welcomeScreen.setVisibility(i);
        }
    }

    public final void showWelcomeScreenIfNeed$threads_release() {
        isNeedToShowWelcome(new ChatFragment$showWelcomeScreenIfNeed$1(this));
    }

    public final void updateChatAvailabilityMessage$threads_release(InputFieldEnableModel inputFieldEnableModel, boolean z) {
        ChatAdapter chatAdapter;
        if (z) {
            ScheduleInfo scheduleInfo = new ScheduleInfo();
            scheduleInfo.setTimeStamp(System.currentTimeMillis());
            scheduleInfo.setNotification(getString(R.string.ecc_disabled_input_message));
            addChatItem(scheduleInfo);
        } else if (inputFieldEnableModel != null && inputFieldEnableModel.isEnabledSendButton() && inputFieldEnableModel.isEnabledInputField() && getChatController().isChatWorking$threads_release() && (chatAdapter = this.chatAdapter) != null) {
            chatAdapter.removeSchedule(false);
        }
    }

    public final EccFragmentChatBinding updateInputEnable$threads_release(InputFieldEnableModel inputFieldEnableModel, boolean z) {
        boolean z2;
        boolean z3;
        Editable text;
        EccFragmentChatBinding eccFragmentChatBinding = this.binding;
        if (eccFragmentChatBinding != null) {
            boolean z4 = false;
            if (z) {
                eccFragmentChatBinding.sendMessage.setEnabled(false);
                eccFragmentChatBinding.inputEditView.setEnabled(false);
                eccFragmentChatBinding.addAttachment.setEnabled(false);
                eccFragmentChatBinding.recordButton.setEnabled(false);
                return eccFragmentChatBinding;
            } else if (inputFieldEnableModel != null) {
                this.isSendBlocked = !inputFieldEnableModel.isEnabledSendButton();
                if (!getChatController().isChatWorking$threads_release() && !getChatController().isSendDuringInactive$threads_release()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (inputFieldEnableModel.isEnabledInputField() && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ImageButton imageButton = eccFragmentChatBinding.sendMessage;
                if (inputFieldEnableModel.isEnabledSendButton() && z2 && (((text = eccFragmentChatBinding.inputEditView.getText()) != null && text.length() != 0) || hasAttachments())) {
                    z4 = true;
                }
                imageButton.setEnabled(z4);
                eccFragmentChatBinding.inputEditView.setEnabled(z3);
                eccFragmentChatBinding.addAttachment.setEnabled(z3);
                eccFragmentChatBinding.recordButton.setEnabled(z3);
                if (!inputFieldEnableModel.isEnabledInputField()) {
                    CustomFontEditText customFontEditText = eccFragmentChatBinding.inputEditView;
                    z65.g(customFontEditText, "inputEditView");
                    KeyboardKt.hideKeyboard(customFontEditText, 100L);
                    return eccFragmentChatBinding;
                }
                return eccFragmentChatBinding;
            } else {
                return eccFragmentChatBinding;
            }
        }
        return null;
    }

    @Override // im.threads.business.broadcastReceivers.ProgressReceiver.Callback
    public void updateProgress(FileDescription fileDescription) {
        ChatAdapter chatAdapter = this.chatAdapter;
        if (chatAdapter != null) {
            chatAdapter.updateProgress(fileDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0016J \u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020-H\u0002¨\u0006."}, d2 = {"Lim/threads/ui/fragments/ChatFragment$AdapterCallback;", "Lim/threads/ui/adapters/ChatAdapter$Callback;", "(Lim/threads/ui/fragments/ChatFragment;)V", "isOffer", "", "message", "Lim/threads/business/models/ChatItem;", "isPreviewFileNotExist", "Lim/threads/business/models/ChatPhrase;", "fileDescription", "Lim/threads/business/models/FileDescription;", "onConsultAvatarClick", "", "consultId", "", "onFileClick", "filedescription", "onFileDownloadRequest", "isPreview", "onImageClick", "chatPhrase", "onPhraseLongClick", "position", "", "onQuickReplyClick", "quickReply", "Lim/threads/business/models/QuickReply;", "onQuoteClick", "quote", "Lim/threads/business/models/Quote;", "onRatingClick", "survey", "Lim/threads/business/models/Survey;", "rating", "onResolveThreadClick", "approveResolve", "onSystemMessageClick", "systemMessage", "Lim/threads/business/models/SystemMessage;", "onUserPhraseClick", "userPhrase", "Lim/threads/business/models/UserPhrase;", "view", "Landroid/view/View;", "openConsultPhraseImage", "Lim/threads/business/models/ConsultPhrase;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class AdapterCallback implements ChatAdapter.Callback {
        public AdapterCallback() {
            ChatFragment.this = r1;
        }

        private final boolean isOffer(ChatItem chatItem) {
            ConsultPhrase consultPhrase;
            String str;
            boolean y;
            boolean y2;
            ConsultPhrase consultPhrase2 = null;
            if (chatItem instanceof ConsultPhrase) {
                consultPhrase = (ConsultPhrase) chatItem;
            } else {
                consultPhrase = null;
            }
            if (consultPhrase == null) {
                return false;
            }
            ChatFragment chatFragment = ChatFragment.this;
            FileDescription fileDescription = consultPhrase.getFileDescription();
            if (fileDescription != null) {
                str = fileDescription.getOfferLink();
            } else {
                str = null;
            }
            boolean isPersonalOffer = consultPhrase.isPersonalOffer();
            if (str != null) {
                y2 = l0b.y(str);
                if (!y2 && !isPersonalOffer && consultPhrase.getId() != null) {
                    ChatController chatController = chatFragment.getChatController();
                    String id = consultPhrase.getId();
                    z65.e(id);
                    ChatItem chatItemByCorrelationIdFromDb$threads_release = chatController.getChatItemByCorrelationIdFromDb$threads_release(id);
                    if (chatItemByCorrelationIdFromDb$threads_release instanceof ConsultPhrase) {
                        consultPhrase2 = (ConsultPhrase) chatItemByCorrelationIdFromDb$threads_release;
                    }
                    if (consultPhrase2 == null) {
                        return false;
                    }
                    isPersonalOffer = consultPhrase2.isPersonalOffer();
                }
            }
            if (isPersonalOffer && str != null) {
                y = l0b.y(str);
                if (y) {
                    return false;
                }
                return true;
            }
            return false;
        }

        private final boolean isPreviewFileNotExist(ChatPhrase chatPhrase) {
            FileDescription fileDescription = chatPhrase.getFileDescription();
            if (!isPreviewFileNotExist(fileDescription != null ? fileDescription.getPreviewFileDescription() : null)) {
                FileDescription fileDescription2 = chatPhrase.getFileDescription();
                if ((fileDescription2 != null ? fileDescription2.getFileUri() : null) == null) {
                    return true;
                }
            }
            return false;
        }

        public static final List onQuoteClick$lambda$3(Function1 function1, Object obj) {
            z65.h(function1, "$tmp0");
            return (List) function1.invoke(obj);
        }

        public static final void onQuoteClick$lambda$4(Function1 function1, Object obj) {
            z65.h(function1, "$tmp0");
            function1.invoke(obj);
        }

        public static final void onQuoteClick$lambda$5(Function1 function1, Object obj) {
            z65.h(function1, "$tmp0");
            function1.invoke(obj);
        }

        public static final boolean onUserPhraseClick$lambda$2$lambda$1(ChatFragment chatFragment, UserPhrase userPhrase, int i, MenuItem menuItem) {
            z65.h(chatFragment, "this$0");
            z65.h(userPhrase, "$userPhrase");
            int itemId = menuItem.getItemId();
            if (itemId == R.id.resend) {
                chatFragment.getChatController().forceResend$threads_release(userPhrase);
                return true;
            } else if (itemId == R.id.delete) {
                ChatAdapter chatAdapter = chatFragment.chatAdapter;
                if (chatAdapter != null) {
                    chatAdapter.removeItem(i);
                }
                chatFragment.getChatController().removeUserPhraseFromDatabaseAsync$threads_release(userPhrase);
                return true;
            } else {
                return false;
            }
        }

        private final void openConsultPhraseImage(ConsultPhrase consultPhrase) {
            String str;
            if (isOffer(consultPhrase)) {
                FileDescription fileDescription = consultPhrase.getFileDescription();
                if (fileDescription != null) {
                    str = fileDescription.getOfferLink();
                } else {
                    str = null;
                }
                ChatFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            }
            androidx.fragment.app.d activity = ChatFragment.this.getActivity();
            if (activity != null) {
                activity.startActivity(ImagesActivity.Companion.getStartIntent(ChatFragment.this.getActivity(), consultPhrase.getFileDescription()));
            }
            ChatFragment.this.setupStartSecondLevelScreen();
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onConsultAvatarClick(String str) {
            androidx.fragment.app.d activity;
            z65.h(str, "consultId");
            if (ChatFragment.this.config.getChatStyle().canShowSpecialistInfo && (activity = ChatFragment.this.getActivity()) != null) {
                ChatFragment.this.getChatController().onConsultChoose$threads_release(activity, str);
                ChatFragment.this.setupStartSecondLevelScreen();
            }
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onFileClick(FileDescription fileDescription) {
            z65.h(fileDescription, "filedescription");
            ChatFragment.this.getChatController().onFileClick$threads_release(fileDescription);
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onFileDownloadRequest(FileDescription fileDescription, boolean z) {
            ChatFragment.this.getChatController().onFileDownloadRequest$threads_release(fileDescription, z);
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onImageClick(ChatPhrase chatPhrase) {
            z65.h(chatPhrase, "chatPhrase");
            if (!isOffer(chatPhrase) && isPreviewFileNotExist(chatPhrase)) {
                return;
            }
            if (chatPhrase instanceof UserPhrase) {
                UserPhrase userPhrase = (UserPhrase) chatPhrase;
                if (userPhrase.getSentState() != MessageStatus.READ) {
                    ChatFragment.this.getChatController().forceResend$threads_release(userPhrase);
                }
                if (userPhrase.getSentState() != MessageStatus.FAILED) {
                    androidx.fragment.app.d activity = ChatFragment.this.getActivity();
                    if (activity != null) {
                        activity.startActivity(ImagesActivity.Companion.getStartIntent(activity, userPhrase.getFileDescription()));
                    }
                    ChatFragment.this.setupStartSecondLevelScreen();
                }
            } else if (chatPhrase instanceof ConsultPhrase) {
                openConsultPhraseImage((ConsultPhrase) chatPhrase);
            }
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onPhraseLongClick(ChatPhrase chatPhrase, int i) {
            z65.h(chatPhrase, "chatPhrase");
            ChatFragment.this.updateUIonPhraseLongClick(chatPhrase, i);
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onQuickReplyClick(QuickReply quickReply) {
            String str;
            boolean z;
            List e;
            int i;
            boolean z2;
            z65.h(quickReply, "quickReply");
            if (ChatFragment.this.getChatController().isChatWorking$threads_release()) {
                ChatFragment.this.hideQuickReplies();
                ChatFragment chatFragment = ChatFragment.this;
                String text = quickReply.getText();
                if (text != null) {
                    int length = text.length() - 1;
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 <= length) {
                        if (!z3) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (z65.j(text.charAt(i), 32) <= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z3) {
                            if (!z2) {
                                z3 = true;
                            } else {
                                i2++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    str = text.subSequence(i2, length + 1).toString();
                } else {
                    str = null;
                }
                String str2 = str;
                String text2 = quickReply.getText();
                if (text2 != null) {
                    z = ClibpboardExtensionsKt.isLastCopyText(text2);
                } else {
                    z = false;
                }
                e = jc1.e(new UpcomingUserMessage(null, null, null, str2, z));
                chatFragment.sendMessage(e, false);
            }
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onQuoteClick(Quote quote) {
            z65.h(quote, "quote");
            ChatFragment chatFragment = ChatFragment.this;
            bma<List<ChatItem>> h = chatFragment.getChatController().downloadMessagesTillEnd$threads_release().h(ti.c());
            final ChatFragment$AdapterCallback$onQuoteClick$1 chatFragment$AdapterCallback$onQuoteClick$1 = new ChatFragment$AdapterCallback$onQuoteClick$1(ChatFragment.this, quote);
            bma h2 = h.g(new z84() { // from class: im.threads.ui.fragments.b
                @Override // defpackage.z84
                public final Object apply(Object obj) {
                    List onQuoteClick$lambda$3;
                    onQuoteClick$lambda$3 = ChatFragment.AdapterCallback.onQuoteClick$lambda$3(Function1.this, obj);
                    return onQuoteClick$lambda$3;
                }
            }).b(1500L, TimeUnit.MILLISECONDS).k(dw9.b()).h(ti.c());
            final ChatFragment$AdapterCallback$onQuoteClick$2 chatFragment$AdapterCallback$onQuoteClick$2 = new ChatFragment$AdapterCallback$onQuoteClick$2(ChatFragment.this);
            wr1 wr1Var = new wr1() { // from class: im.threads.ui.fragments.c
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatFragment.AdapterCallback.onQuoteClick$lambda$4(Function1.this, obj);
                }
            };
            final ChatFragment$AdapterCallback$onQuoteClick$3 chatFragment$AdapterCallback$onQuoteClick$3 = ChatFragment$AdapterCallback$onQuoteClick$3.INSTANCE;
            chatFragment.subscribe(h2.i(wr1Var, new wr1() { // from class: im.threads.ui.fragments.d
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatFragment.AdapterCallback.onQuoteClick$lambda$5(Function1.this, obj);
                }
            }));
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onRatingClick(Survey survey, int i) {
            ArrayList<QuestionDTO> questions;
            z65.h(survey, "survey");
            if (ChatFragment.this.getActivity() != null && (questions = survey.getQuestions()) != null && !questions.isEmpty()) {
                ArrayList<QuestionDTO> questions2 = survey.getQuestions();
                z65.e(questions2);
                questions2.get(0).setRate(Integer.valueOf(i));
                ChatFragment.this.getChatController().onRatingClick$threads_release(survey);
            }
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onResolveThreadClick(boolean z) {
            if (ChatFragment.this.getActivity() != null) {
                ChatFragment.this.getChatController().onResolveThreadClick$threads_release(z);
            }
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onSystemMessageClick(SystemMessage systemMessage) {
            z65.h(systemMessage, "systemMessage");
        }

        @Override // im.threads.ui.adapters.ChatAdapter.Callback
        public void onUserPhraseClick(final UserPhrase userPhrase, final int i, View view) {
            z65.h(userPhrase, "userPhrase");
            z65.h(view, "view");
            if (userPhrase.getSentState().ordinal() >= MessageStatus.SENT.ordinal()) {
                ChatAdapter chatAdapter = ChatFragment.this.chatAdapter;
                if (chatAdapter != null && (chatAdapter.getList().get(i) instanceof UserPhrase)) {
                    chatAdapter.getList().set(i, userPhrase);
                    chatAdapter.notifyItemChanged(i);
                    return;
                }
                return;
            }
            sf8 sf8Var = new sf8(view.getContext(), view, 8388613, 0, R.style.PopupMenu);
            final ChatFragment chatFragment = ChatFragment.this;
            sf8Var.b(R.menu.ecc_menu_user_phrase_sent_error);
            sf8Var.c(new sf8.c() { // from class: im.threads.ui.fragments.a
                @Override // defpackage.sf8.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean onUserPhraseClick$lambda$2$lambda$1;
                    onUserPhraseClick$lambda$2$lambda$1 = ChatFragment.AdapterCallback.onUserPhraseClick$lambda$2$lambda$1(ChatFragment.this, userPhrase, i, menuItem);
                    return onUserPhraseClick$lambda$2$lambda$1;
                }
            });
            sf8Var.d();
        }

        public final boolean isPreviewFileNotExist(FileDescription fileDescription) {
            if (fileDescription != null) {
                ChatFragment chatFragment = ChatFragment.this;
                FileUtils fileUtils = FileUtils.INSTANCE;
                Context requireContext = chatFragment.requireContext();
                z65.g(requireContext, "requireContext()");
                return fileUtils.isPreviewFileExist$threads_release(requireContext, fileDescription);
            }
            return false;
        }
    }

    public final void onFileResult(Uri uri) {
        LoggerEdna.info("onFileSelected: " + uri);
        sh0.d(this.coroutineScope, v33.b(), null, new ChatFragment$onFileResult$2(this, uri, null), 2, null);
    }

    private final void onPhotoResult(Uri uri) {
        String str;
        List e;
        ContentResolver contentResolver;
        Context context = getContext();
        AssetFileDescriptor openAssetFileDescriptor = (context == null || (contentResolver = context.getContentResolver()) == null) ? null : contentResolver.openAssetFileDescriptor(uri, "r");
        long length = openAssetFileDescriptor != null ? openAssetFileDescriptor.getLength() : 0L;
        if (openAssetFileDescriptor != null) {
            openAssetFileDescriptor.close();
        }
        FileDescription fileDescription = new FileDescription(requireContext().getString(R.string.ecc_image), uri, length, System.currentTimeMillis());
        setFileDescription(fileDescription);
        String A = this.inputTextObservable.A();
        CampaignMessage campaignMessage = this.campaignMessage;
        Quote quote = this.mQuote;
        if (A != null) {
            int length2 = A.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length2) {
                boolean z2 = z65.j(A.charAt(!z ? i : length2), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length2--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            str = A.subSequence(i, length2 + 1).toString();
        } else {
            str = null;
        }
        e = jc1.e(new UpcomingUserMessage(fileDescription, campaignMessage, quote, str, false));
        sendMessage$default(this, e, false, 2, null);
    }

    public static final void bindViews$lambda$26$lambda$17() {
    }
}
