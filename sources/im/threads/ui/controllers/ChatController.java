package im.threads.ui.controllers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.d;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import im.threads.R;
import im.threads.business.UserInfoBuilder;
import im.threads.business.broadcastReceivers.ProgressReceiver;
import im.threads.business.chatUpdates.ChatUpdateProcessor;
import im.threads.business.config.BaseConfig;
import im.threads.business.controllers.UnreadMessagesController;
import im.threads.business.core.ThreadsLibBase;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.formatters.ChatItemType;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.CampaignMessage;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ChatPhrase;
import im.threads.business.models.ClientNotificationDisplayType;
import im.threads.business.models.ConsultChatPhrase;
import im.threads.business.models.ConsultConnectionMessage;
import im.threads.business.models.ConsultInfo;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.ConsultTyping;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Hidable;
import im.threads.business.models.InputFieldEnableModel;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.QuickReplyItem;
import im.threads.business.models.RequestResolveThread;
import im.threads.business.models.ScheduleInfo;
import im.threads.business.models.SimpleSystemMessage;
import im.threads.business.models.Survey;
import im.threads.business.models.SystemMessage;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.models.UserPhrase;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.rest.models.ConfigResponse;
import im.threads.business.rest.models.HistoryResponse;
import im.threads.business.rest.models.SettingsResponse;
import im.threads.business.rest.queries.BackendApi;
import im.threads.business.rest.queries.ThreadsApi;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.state.ChatState;
import im.threads.business.state.ChatStateEnum;
import im.threads.business.transport.HistoryLoader;
import im.threads.business.transport.HistoryParser;
import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.Transport;
import im.threads.business.transport.models.AttachmentSettings;
import im.threads.business.transport.models.ContentAttachmentSettings;
import im.threads.business.transport.models.ContentScheduleInfo;
import im.threads.business.transport.models.ContentScheduleInfoContent;
import im.threads.business.transport.threadsGate.responses.Status;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.ConsultWriter;
import im.threads.business.utils.DateHelper;
import im.threads.business.utils.DemoModeProvider;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.FileUtilsKt;
import im.threads.business.utils.messenger.Messenger;
import im.threads.business.utils.messenger.MessengerImpl;
import im.threads.business.workers.FileDownloadWorker;
import im.threads.ui.ChatStyle;
import im.threads.ui.activities.ConsultActivity;
import im.threads.ui.activities.ImagesActivity;
import im.threads.ui.config.Config;
import im.threads.ui.controllers.ChatController;
import im.threads.ui.fragments.ChatFragment;
import im.threads.ui.preferences.PreferencesUiKeys;
import im.threads.ui.utils.FileHelper;
import im.threads.ui.utils.ThreadRunnerKt;
import im.threads.ui.views.VoiceTimeLabelFormatterKt;
import im.threads.ui.workers.NotificationWorker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.ToLongFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Call;
import retrofit2.Response;
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ç\u00022\u00020\u0001:\u0002ç\u0002B\u000b\b\u0002¢\u0006\u0006\bæ\u0002\u0010\u0095\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\b\u0010'\u001a\u00020\u0002H\u0002J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0002J\u001a\u0010-\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010,\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020\u0002H\u0002J\b\u0010/\u001a\u00020\u0002H\u0002J\b\u00100\u001a\u00020\u0002H\u0002J\b\u00101\u001a\u00020\u0002H\u0002J\b\u00102\u001a\u00020\u0002H\u0002J\b\u00103\u001a\u00020\u0002H\u0002J\b\u00104\u001a\u00020\u0002H\u0002J\b\u00105\u001a\u00020\u0002H\u0002J\b\u00106\u001a\u00020\u0002H\u0002J\b\u00107\u001a\u00020\u0002H\u0002J\b\u00108\u001a\u00020\u0002H\u0002J\b\u00109\u001a\u00020\u0002H\u0002J\b\u0010:\u001a\u00020\u0002H\u0002J\b\u0010;\u001a\u00020\u0002H\u0002J\b\u0010<\u001a\u00020\u0002H\u0002J\b\u0010=\u001a\u00020\u0002H\u0002J\b\u0010>\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0005H\u0002J\u0012\u0010A\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\rH\u0003J\b\u0010B\u001a\u00020\u0002H\u0002J\u0010\u0010E\u001a\u00020\u00022\u0006\u0010D\u001a\u00020CH\u0002J\u0010\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020FH\u0002J\b\u0010J\u001a\u00020\u0002H\u0002J\u0016\u0010K\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010L\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010M\u001a\u00020\u0002H\u0002J\u0016\u0010O\u001a\u00020\u00022\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020PH\u0003J\u0010\u0010U\u001a\u00020\u00022\u0006\u0010T\u001a\u00020SH\u0003J\u001b\u0010W\u001a\u00020\u00022\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\bW\u0010XJ\b\u0010Y\u001a\u00020\rH\u0002J\b\u0010Z\u001a\u00020\rH\u0002J\u0012\u0010]\u001a\u00020\r2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0002J\u0016\u0010^\u001a\u00020\u00022\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010_\u001a\u00020\u00022\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001a\u0010a\u001a\u0004\u0018\u00010`2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\b\u0010b\u001a\u00020\u0002H\u0002J\b\u0010c\u001a\u00020\u0002H\u0002J\b\u0010d\u001a\u00020\u0002H\u0002J\b\u0010e\u001a\u00020\u0002H\u0002J\b\u0010f\u001a\u00020\u0002H\u0002J\u0011\u0010h\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bh\u0010iJ\u0011\u0010j\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bj\u0010iJ\u0011\u0010k\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bk\u0010iJ\u001a\u0010p\u001a\u00020\u00072\b\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010o\u001a\u00020nH\u0002J\u0006\u0010q\u001a\u00020\u0002J\u0006\u0010r\u001a\u00020\u0002J\u0006\u0010s\u001a\u00020\u0002J\u0017\u0010v\u001a\u00020\u00022\u0006\u0010D\u001a\u00020CH\u0000¢\u0006\u0004\bt\u0010uJ\u0017\u0010z\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\rH\u0000¢\u0006\u0004\bx\u0010yJ\u0019\u0010~\u001a\u00020\u00022\b\u0010{\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0082\u0001\u001a\u00020\u00022\u0006\u0010\u007f\u001a\u00020FH\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00022\u0006\u0010m\u001a\u00020lH\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020\rH\u0000¢\u0006\u0005\b\u0087\u0001\u0010yJ\u0012\u0010\u008b\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J(\u0010\u0090\u0001\u001a\u00020\u00022\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00052\t\b\u0002\u0010\u008d\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0093\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0012\u0010\u0096\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J4\u0010\u009b\u0001\u001a\u00020\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010\u0098\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0097\u0001H\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J'\u0010\u009f\u0001\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010l2\t\b\u0002\u0010\u009c\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J)\u0010¥\u0001\u001a\u00020\u00022\n\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J%\u0010©\u0001\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0007\u0010ª\u0001\u001a\u00020\rJ\u0007\u0010«\u0001\u001a\u00020\rJ\u001e\u0010°\u0001\u001a\u00020\u00022\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u0001H\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0012\u0010²\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b±\u0001\u0010\u0095\u0001J\u001d\u0010¶\u0001\u001a\u0004\u0018\u00010\u00052\u0007\u0010³\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0012\u0010¸\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b·\u0001\u0010\u0095\u0001J\u0012\u0010º\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b¹\u0001\u0010\u0095\u0001J\u0012\u0010¼\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b»\u0001\u0010\u0095\u0001J\u001d\u0010À\u0001\u001a\u00020\r2\t\u0010½\u0001\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0012\u0010Â\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\bÁ\u0001\u0010\u0092\u0001J\u0012\u0010Ä\u0001\u001a\u00020\rH\u0000¢\u0006\u0006\bÃ\u0001\u0010\u0092\u0001JA\u0010Ë\u0001\u001a\u00020\u00022\t\b\u0002\u0010Å\u0001\u001a\u00020\r2\t\b\u0002\u0010Æ\u0001\u001a\u00020\r2\t\b\u0002\u0010Ç\u0001\u001a\u00020\r2\f\b\u0002\u0010\u0098\u0001\u001a\u0005\u0018\u00010È\u0001H\u0000¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0086\u0001\u0010Ó\u0001\u001a\u00020\u00022\u000b\b\u0002\u0010Ì\u0001\u001a\u0004\u0018\u00010g2\u000b\b\u0002\u0010Í\u0001\u001a\u0004\u0018\u00010\r2\t\b\u0002\u0010Î\u0001\u001a\u00020\r2\t\b\u0002\u0010Æ\u0001\u001a\u00020\r2\t\b\u0002\u0010Å\u0001\u001a\u00020\r2\t\b\u0002\u0010Ç\u0001\u001a\u00020\r2\u001e\b\u0002\u0010Ð\u0001\u001a\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010Ï\u00012\f\b\u0002\u0010\u0098\u0001\u001a\u0005\u0018\u00010È\u0001H\u0000¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001f\u0010×\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040Ô\u0001H\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u001d\u0010Û\u0001\u001a\u00020\u00022\t\u0010Ø\u0001\u001a\u0004\u0018\u00010HH\u0000¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u001b\u0010Ý\u0001\u001a\u00020\u00022\u0007\u0010Ø\u0001\u001a\u00020HH\u0000¢\u0006\u0006\bÜ\u0001\u0010Ú\u0001J\u001b\u0010ß\u0001\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\rH\u0000¢\u0006\u0005\bÞ\u0001\u0010yJ\u0012\u0010á\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\bà\u0001\u0010\u0095\u0001J<\u0010ä\u0001\u001a\u00020\u00022\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010o\u001a\u00020n2\u000e\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0097\u0001H\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001R,\u0010ç\u0001\u001a\u0012\u0012\r\u0012\u000b æ\u0001*\u0004\u0018\u00010g0g0å\u00018\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R!\u0010ð\u0001\u001a\u00030ë\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R!\u0010õ\u0001\u001a\u00030ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010í\u0001\u001a\u0006\bó\u0001\u0010ô\u0001R!\u0010ú\u0001\u001a\u00030ö\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b÷\u0001\u0010í\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u0018\u0010ü\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R!\u0010\u0082\u0002\u001a\u00030þ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÿ\u0001\u0010í\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002R!\u0010\u0087\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010í\u0001\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R!\u0010\u008c\u0002\u001a\u00030\u0088\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010í\u0001\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R!\u0010\u0091\u0002\u001a\u00030\u008d\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0002\u0010í\u0001\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R!\u0010\u0096\u0002\u001a\u00030\u0092\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010í\u0001\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R!\u0010\u009b\u0002\u001a\u00030\u0097\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010í\u0001\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0018\u0010 \u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0019\u0010¢\u0002\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R'\u0010¥\u0002\u001a\u0012\u0012\r\u0012\u000b æ\u0001*\u0004\u0018\u00010C0C0¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R#\u0010¨\u0002\u001a\f\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010§\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u001c\u0010«\u0002\u001a\u0005\u0018\u00010ª\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R\u001b\u0010\u00ad\u0002\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u0019\u0010¯\u0002\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010£\u0002R(\u0010°\u0002\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b°\u0002\u0010£\u0002\u001a\u0006\b±\u0002\u0010\u0092\u0001\"\u0005\b²\u0002\u0010yR\u0019\u0010³\u0002\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010£\u0002R.\u0010µ\u0002\u001a\u0004\u0018\u00010\u00072\t\u0010´\u0002\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002R\u001b\u0010¹\u0002\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0019\u0010»\u0002\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0002\u0010£\u0002R\u0019\u0010¼\u0002\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0002\u0010£\u0002R\u001c\u0010¾\u0002\u001a\u0005\u0018\u00010½\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0018\u0010Á\u0002\u001a\u00030À\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R)\u0010Å\u0002\u001a\u0014\u0012\u0004\u0012\u00020H0Ã\u0002j\t\u0012\u0004\u0012\u00020H`Ä\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0002\u0010Æ\u0002R7\u0010Ê\u0002\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030È\u00020Ç\u0002j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030È\u0002`É\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R\u001c\u0010Í\u0002\u001a\u0005\u0018\u00010Ì\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0002\u0010Î\u0002R*\u0010Ï\u0002\u001a\u00020\r2\u0007\u0010´\u0002\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÏ\u0002\u0010£\u0002\u001a\u0006\bÏ\u0002\u0010\u0092\u0001R\u0017\u0010Ð\u0002\u001a\u00020\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010\u0092\u0001R\u0014\u0010Ò\u0002\u001a\u00020\t8F¢\u0006\b\u001a\u0006\bÑ\u0002\u0010\u008a\u0001R\u0017\u0010Ö\u0002\u001a\u0005\u0018\u00010Ó\u00028F¢\u0006\b\u001a\u0006\bÔ\u0002\u0010Õ\u0002R-\u0010Û\u0002\u001a\u0004\u0018\u00010g2\t\u0010×\u0002\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bØ\u0002\u0010i\"\u0006\bÙ\u0002\u0010Ú\u0002R0\u0010á\u0002\u001a\u0005\u0018\u00010Ü\u00022\n\u0010×\u0002\u001a\u0005\u0018\u00010Ü\u00028F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÝ\u0002\u0010Þ\u0002\"\u0006\bß\u0002\u0010à\u0002R-\u0010å\u0002\u001a\u0004\u0018\u00010l2\b\u0010m\u001a\u0004\u0018\u00010l8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bâ\u0002\u0010ã\u0002\"\u0006\bä\u0002\u0010\u0084\u0001¨\u0006è\u0002"}, d2 = {"Lim/threads/ui/controllers/ChatController;", "", "", "checkStateOnViewStart", "", "Lim/threads/business/models/ChatItem;", "items", "", MessageAttributes.UUID, "", "getItemPositionByUuid", "subscribeToDisableInput", "checkEmptyStateVisibility", "", "hideProgressBar", "loadItemsFromDB", "Lz33;", "event", "subscribe", "onClientIdChanged", "loadConfig", "settingsLoaded", "attachmentSettingsLoaded", "getErrorMessage", "Lim/threads/business/rest/models/SettingsResponse;", "settings", "updateSettings", "Lim/threads/business/transport/models/ContentAttachmentSettings;", "contentAttachmentSettings", "updateAttachmentSettings", "Lim/threads/business/transport/models/ContentScheduleInfoContent;", "contentScheduleInfo", "updateSchedule", StatisticManager.LIST, "setLastAvatars", "subscribeToChatEvents", "subscribeToTransportException", "subscribeToCampaignMessageReplySuccess", "subscribeToTyping", "subscribeToOutgoingMessageStatusChanged", "Lim/threads/business/transport/threadsGate/responses/Status;", "status", "sentStatus", "chatItem", "receivedStatus", "getMessageStatus", "subscribeToIncomingMessageRead", "subscribeSpeechMessageUpdated", "subscribeToUpdateAttachments", "subscribeToNewMessage", "subscribeToMessageSendSuccess", "subscribeToMessageSendError", "subscribeToSurveyCompletion", "subscribeToSurveySendSuccess", "subscribeToRemoveChatItem", "subscribeToDeviceAddressChanged", "subscribeToQuickReplies", "subscribeToAttachAudioFiles", "subscribeToClientNotificationDisplayTypeProcessor", "subscribeForResendMessage", "removeResolveRequest", "removeActiveSurvey", "resetActiveSurvey", "addMessage", "keepClientId", "clearPreferences", "removePushNotification", "Lim/threads/business/models/Survey;", "survey", "setSurveyStateSent", "Lim/threads/business/models/UpcomingUserMessage;", "message", "Lim/threads/business/models/UserPhrase;", "convert", "onDeviceAddressChanged", "parseHistoryItemsForSentStatus", "parseHistoryItemsForAttachmentStatus", "clearUnreadPush", "chatItems", "processSystemMessages", "Lim/threads/business/models/ConsultConnectionMessage;", "ccm", "processConsultConnectionMessage", "Lim/threads/business/models/SimpleSystemMessage;", "systemMessage", "processSimpleSystemMessage", "isInputBlockedFromMessage", "refreshUserInputState", "(Ljava/lang/Boolean;)V", "isInputFieldEnabled", "enableInputBySchedule", "Lim/threads/business/models/ScheduleInfo;", "scheduleInfo", "isScheduleActive", "handleQuickReplies", "handleInputAvailability", "Lim/threads/business/models/ConsultPhrase;", "getQuickReplyMessageCandidate", "subscribeOnClientIdChange", "subscribeOnMessageError", "subscribeOnFileUploadResult", "subscribeOnChatState", "subscribeForPermissionsGranted", "", "getItemTimestampForHistoryLoad", "()Ljava/lang/Long;", "getUncompletedUserPhraseTimestamp", "getLastDbItemTimestamp", "Lim/threads/business/models/FileDescription;", "fileDescription", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "getFormattedDuration", "onViewStart", "onViewStop", "onViewDestroy", "onRatingClick$threads_release", "(Lim/threads/business/models/Survey;)V", "onRatingClick", "approveResolve", "onResolveThreadClick$threads_release", "(Z)V", "onResolveThreadClick", "input", "onUserTyping$threads_release", "(Ljava/lang/String;)V", "onUserTyping", "upcomingUserMessage", "onUserInput$threads_release", "(Lim/threads/business/models/UpcomingUserMessage;)V", "onUserInput", "onFileClick$threads_release", "(Lim/threads/business/models/FileDescription;)V", "onFileClick", "isForeground", "setActivityIsForeground$threads_release", "setActivityIsForeground", "getUnreadMessagesCount$threads_release", "()I", "getUnreadMessagesCount", "item", "async", "setMessageAsRead$threads_release", "(Lim/threads/business/models/ChatItem;Z)V", "setMessageAsRead", "isChatReady$threads_release", "()Z", "isChatReady", "onRetryInitChatClick$threads_release", "()V", "onRetryInitChatClick", "Lkotlin/Function0;", "callback", "removeCorruptedFiles$threads_release", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "removeCorruptedFiles", "isPreview", "onFileDownloadRequest$threads_release", "(Lim/threads/business/models/FileDescription;Z)V", "onFileDownloadRequest", "Landroid/app/Activity;", "activity", "consultId", "onConsultChoose$threads_release", "(Landroid/app/Activity;Ljava/lang/String;)V", "onConsultChoose", "date", "onSearchResultsClick$threads_release", "(Ljava/lang/String;Ljava/lang/String;)V", "onSearchResultsClick", "isNeedToShowWelcome", "isConsultFound", "Lim/threads/ui/fragments/ChatFragment;", "chatFragment", "bindFragment$threads_release", "(Lim/threads/ui/fragments/ChatFragment;)V", "bindFragment", "unbindFragment$threads_release", "unbindFragment", "id", "getChatItemByCorrelationIdFromDb$threads_release", "(Ljava/lang/String;)Lim/threads/business/models/ChatItem;", "getChatItemByCorrelationIdFromDb", "setMessagesInCurrentThreadAsReadInDB$threads_release", "setMessagesInCurrentThreadAsReadInDB", "clearUnreadPushCount$threads_release", "clearUnreadPushCount", "setAllMessagesWereRead$threads_release", "setAllMessagesWereRead", "correlationId", "isMessageSent$threads_release", "(Ljava/lang/String;)Z", "isMessageSent", "isChatWorking$threads_release", "isChatWorking", "isSendDuringInactive$threads_release", "isSendDuringInactive", "applyUiChanges", "forceLoad", "fromQuickAnswerController", "Lim/threads/business/transport/HistoryLoader$HistoryLoadingCallback;", "loadHistoryAfterWithLastMessageCheck$threads_release", "(ZZZLim/threads/business/transport/HistoryLoader$HistoryLoadingCallback;)V", "loadHistoryAfterWithLastMessageCheck", "anchorTimestamp", "isAfterAnchor", "loadToTheEnd", "Lkotlin/Function1;", "untilCondition", "loadHistory$threads_release", "(Ljava/lang/Long;Ljava/lang/Boolean;ZZZZLkotlin/jvm/functions/Function1;Lim/threads/business/transport/HistoryLoader$HistoryLoadingCallback;)V", "loadHistory", "Lbma;", "downloadMessagesTillEnd$threads_release", "()Lbma;", "downloadMessagesTillEnd", "userPhrase", "forceResend$threads_release", "(Lim/threads/business/models/UserPhrase;)V", "forceResend", "removeUserPhraseFromDatabaseAsync$threads_release", "removeUserPhraseFromDatabaseAsync", "cleanAll$threads_release", "cleanAll", "hideQuickReplies$threads_release", "hideQuickReplies", "setFormattedDurations$threads_release", "(Ljava/util/List;Landroid/media/MediaMetadataRetriever;Lkotlin/jvm/functions/Function0;)V", "setFormattedDurations", "Lks8;", "kotlin.jvm.PlatformType", "messageErrorProcessor", "Lks8;", "getMessageErrorProcessor", "()Lks8;", "Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor$delegate", "Lrn5;", "getChatUpdateProcessor", "()Lim/threads/business/chatUpdates/ChatUpdateProcessor;", "chatUpdateProcessor", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lim/threads/business/utils/ConsultWriter;", "consultWriter$delegate", "getConsultWriter", "()Lim/threads/business/utils/ConsultWriter;", "consultWriter", "Lim/threads/ui/ChatStyle;", "chatStyle", "Lim/threads/ui/ChatStyle;", "Landroid/content/Context;", "appContext$delegate", "getAppContext", "()Landroid/content/Context;", "appContext", "Lim/threads/business/preferences/Preferences;", "preferences$delegate", "getPreferences", "()Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/transport/HistoryLoader;", "historyLoader$delegate", "getHistoryLoader", "()Lim/threads/business/transport/HistoryLoader;", "historyLoader", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase$delegate", "getClientUseCase", "()Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/state/ChatState;", "chatState$delegate", "getChatState", "()Lim/threads/business/state/ChatState;", "chatState", "Lim/threads/business/utils/DemoModeProvider;", "demoModeProvider$delegate", "getDemoModeProvider", "()Lim/threads/business/utils/DemoModeProvider;", "demoModeProvider", "Lim/threads/business/transport/Transport;", "transport", "Lim/threads/business/transport/Transport;", "Lqx1;", "coroutineScope", "Lqx1;", "surveyCompletionInProgress", "Z", "Ljs8;", "surveyCompletionProcessor", "Ljs8;", "Ljava/lang/ref/WeakReference;", "fragment", "Ljava/lang/ref/WeakReference;", "Lim/threads/business/broadcastReceivers/ProgressReceiver;", "progressReceiver", "Lim/threads/business/broadcastReceivers/ProgressReceiver;", "activeSurvey", "Lim/threads/business/models/Survey;", "isActive", "isAllMessagesDownloaded", "isAllMessagesDownloaded$threads_release", "setAllMessagesDownloaded$threads_release", "isDownloadingMessages", "<set-?>", "firstUnreadUuidId", "Ljava/lang/String;", "getFirstUnreadUuidId", "()Ljava/lang/String;", "currentScheduleInfo", "Lim/threads/business/models/ScheduleInfo;", "hasQuickReplies", "inputEnabledDuringQuickReplies", "Lwn1;", "compositeDisposable", "Lwn1;", "Lim/threads/business/utils/messenger/Messenger;", "messenger", "Lim/threads/business/utils/messenger/Messenger;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "localUserMessages", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Lim/threads/business/models/enums/AttachmentStateEnum;", "Lkotlin/collections/HashMap;", "attachmentsHistory", "Ljava/util/HashMap;", "Lim/threads/business/models/InputFieldEnableModel;", "enableModel", "Lim/threads/business/models/InputFieldEnableModel;", "isInputDisabled", "isSendButtonEnabled", "getStateOfConsult", "stateOfConsult", "Lim/threads/business/models/ConsultInfo;", "getCurrentConsultInfo", "()Lim/threads/business/models/ConsultInfo;", "currentConsultInfo", "value", "getThreadId", "setThreadId", "(Ljava/lang/Long;)V", "threadId", "Lim/threads/business/models/CampaignMessage;", "getCampaignMessage", "()Lim/threads/business/models/CampaignMessage;", "setCampaignMessage", "(Lim/threads/business/models/CampaignMessage;)V", "campaignMessage", "getFileDescriptionDraft", "()Lim/threads/business/models/FileDescription;", "setFileDescriptionDraft", "fileDescriptionDraft", "<init>", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatController {
    public static final int CONSULT_STATE_DEFAULT = 3;
    public static final int CONSULT_STATE_FOUND = 1;
    public static final int CONSULT_STATE_SEARCHING = 2;
    public static final Companion Companion = new Companion(null);
    private static final int PER_PAGE_COUNT = 100;
    private static final long UPDATE_SPEECH_STATUS_DEBOUNCE = 400;
    private static ChatController instance;
    private Survey activeSurvey;
    private final rn5 appContext$delegate;
    private final HashMap<String, AttachmentStateEnum> attachmentsHistory;
    private final rn5 chatState$delegate;
    private final ChatStyle chatStyle;
    private final rn5 chatUpdateProcessor$delegate;
    private final rn5 clientUseCase$delegate;
    private wn1 compositeDisposable;
    private final rn5 consultWriter$delegate;
    private final qx1 coroutineScope;
    private ScheduleInfo currentScheduleInfo;
    private final rn5 database$delegate;
    private final rn5 demoModeProvider$delegate;
    private InputFieldEnableModel enableModel;
    private String firstUnreadUuidId;
    private WeakReference<ChatFragment> fragment;
    private boolean hasQuickReplies;
    private final rn5 historyLoader$delegate;
    private boolean inputEnabledDuringQuickReplies;
    private boolean isActive;
    private boolean isAllMessagesDownloaded;
    private boolean isDownloadingMessages;
    private boolean isInputDisabled;
    private final ArrayList<UserPhrase> localUserMessages;
    private final ks8<Long> messageErrorProcessor;
    private final Messenger messenger;
    private final rn5 preferences$delegate;
    private ProgressReceiver progressReceiver;
    private boolean surveyCompletionInProgress;
    private final js8<Survey> surveyCompletionProcessor;
    private final Transport transport;

    /* compiled from: ChatController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lim/threads/ui/controllers/ChatController$Companion;", "", "()V", "CONSULT_STATE_DEFAULT", "", "CONSULT_STATE_FOUND", "CONSULT_STATE_SEARCHING", "PER_PAGE_COUNT", "UPDATE_SPEECH_STATUS_DEBOUNCE", "", "instance", "Lim/threads/ui/controllers/ChatController;", "createInstance", "", "getInstance", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized void createInstance() {
            try {
                ClientUseCase clientUseCase = new ClientUseCase();
                if (ChatController.instance == null) {
                    ChatController.instance = new ChatController(null);
                }
                clientUseCase.initClientId();
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized ChatController getInstance() {
            ChatController chatController;
            createInstance();
            chatController = ChatController.instance;
            z65.e(chatController);
            return chatController;
        }
    }

    public /* synthetic */ ChatController(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void addMessage(ChatItem chatItem) {
        List<String> e;
        List<String> e2;
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment;
        WeakReference<ChatFragment> weakReference2;
        ChatFragment chatFragment2;
        List<? extends ChatItem> e3;
        List<? extends ChatItem> e4;
        ChatFragment chatFragment3;
        ChatFragment chatFragment4;
        ArrayList<QuestionDTO> questions;
        boolean z = chatItem instanceof Survey;
        if (z && (questions = ((Survey) chatItem).getQuestions()) != null) {
            for (QuestionDTO questionDTO : questions) {
                questionDTO.generateCorrelationId();
            }
        }
        getDatabase().putChatItem(chatItem);
        UnreadMessagesController.INSTANCE.refreshUnreadMessagesCount();
        if (this.fragment != null) {
            e4 = jc1.e(chatItem);
            ChatItem chatItem2 = setLastAvatars(e4).get(0);
            if ((chatItem2 instanceof ConsultConnectionMessage) && !((ConsultConnectionMessage) chatItem2).getDisplay()) {
                WeakReference<ChatFragment> weakReference3 = this.fragment;
                if (weakReference3 != null && (chatFragment4 = weakReference3.get()) != null) {
                    ConsultChatPhrase consultChatPhrase = (ConsultChatPhrase) chatItem2;
                    chatFragment4.notifyConsultAvatarChanged(consultChatPhrase.getAvatarPath(), consultChatPhrase.getConsultId());
                }
            } else {
                WeakReference<ChatFragment> weakReference4 = this.fragment;
                if (weakReference4 != null && (chatFragment3 = weakReference4.get()) != null) {
                    chatFragment3.addChatItem(chatItem2);
                }
            }
        }
        boolean z2 = chatItem instanceof ConsultPhrase;
        if (z2 && this.isActive) {
            e3 = jc1.e(chatItem);
            handleQuickReplies(e3);
        } else if ((chatItem instanceof SimpleSystemMessage) && this.isActive) {
            hideQuickReplies$threads_release();
        } else if (z && this.isActive) {
            Transport transport = BaseConfig.Companion.getInstance().transport;
            e2 = jc1.e(((Survey) chatItem).getUuid());
            transport.markMessagesAsRead(e2);
        } else if ((chatItem instanceof RequestResolveThread) && this.isActive) {
            Transport transport2 = BaseConfig.Companion.getInstance().transport;
            e = jc1.e(((RequestResolveThread) chatItem).getUuid());
            transport2.markMessagesAsRead(e);
        }
        r57<Long> v = r57.v(1500L, TimeUnit.MILLISECONDS);
        final ChatController$addMessage$2 chatController$addMessage$2 = new ChatController$addMessage$2(this);
        r57<Long> m = v.k(new oh8() { // from class: my0
            @Override // defpackage.oh8
            public final boolean b(Object obj) {
                boolean addMessage$lambda$78;
                addMessage$lambda$78 = ChatController.addMessage$lambda$78(Function1.this, obj);
                return addMessage$lambda$78;
            }
        }).m(ti.c());
        final ChatController$addMessage$3 chatController$addMessage$3 = new ChatController$addMessage$3(this);
        wr1<? super Long> wr1Var = new wr1() { // from class: ny0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.addMessage$lambda$79(Function1.this, obj);
            }
        };
        final ChatController$addMessage$4 chatController$addMessage$4 = ChatController$addMessage$4.INSTANCE;
        z33 p = m.p(wr1Var, new wr1() { // from class: oy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.addMessage$lambda$80(Function1.this, obj);
            }
        });
        z65.g(p, "private fun addMessage(c…        }\n        }\n    }");
        subscribe(p);
        if ((z2 || (((chatItem instanceof ConsultConnectionMessage) && z65.c("OPERATOR_JOINED", ((ConsultConnectionMessage) chatItem).getType())) || ((chatItem instanceof ScheduleInfo) && ((ScheduleInfo) chatItem).isChatWorking()))) && (weakReference = this.fragment) != null && (chatFragment = weakReference.get()) != null && chatFragment.isAdded() && !this.isInputDisabled && (weakReference2 = this.fragment) != null && (chatFragment2 = weakReference2.get()) != null) {
            chatFragment2.removeSchedule(false);
        }
    }

    public static final boolean addMessage$lambda$78(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void addMessage$lambda$79(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void addMessage$lambda$80(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final List bindFragment$lambda$7(ChatController chatController) {
        z65.h(chatController, "this$0");
        int historyLoadingCount = BaseConfig.Companion.getInstance().getHistoryLoadingCount();
        List<UserPhrase> unsentUserPhrase = chatController.getDatabase().getUnsentUserPhrase(historyLoadingCount);
        if (!unsentUserPhrase.isEmpty()) {
            chatController.messenger.recreateUnsentMessagesWith(unsentUserPhrase);
        }
        return chatController.setLastAvatars(chatController.getDatabase().getChatItems(0, historyLoadingCount));
    }

    public static final void bindFragment$lambda$8(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void bindFragment$lambda$9(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void checkEmptyStateVisibility() {
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        if (!ThreadsLibBase.Companion.getInstance().isUserInitialized()) {
            WeakReference<ChatFragment> weakReference = this.fragment;
            if (weakReference != null && (chatFragment2 = weakReference.get()) != null) {
                chatFragment2.showEmptyState();
                return;
            }
            return;
        }
        WeakReference<ChatFragment> weakReference2 = this.fragment;
        if (weakReference2 != null && (chatFragment = weakReference2.get()) != null) {
            chatFragment.hideEmptyState();
        }
    }

    private final void checkStateOnViewStart() {
        if (getChatState().getCurrentState().compareTo(ChatStateEnum.REGISTERING_DEVICE) < 0) {
            this.transport.sendRegisterDevice(false);
        }
    }

    public static /* synthetic */ void cleanAll$threads_release$default(ChatController chatController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        chatController.cleanAll$threads_release(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x01c4, code lost:
        if (defpackage.z65.c(r8, "null") != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ApplySharedPref"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void clearPreferences(boolean r23) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.controllers.ChatController.clearPreferences(boolean):void");
    }

    static /* synthetic */ void clearPreferences$default(ChatController chatController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        chatController.clearPreferences(z);
    }

    private final void clearUnreadPush() {
        UnreadMessagesController.INSTANCE.clearUnreadPush();
    }

    private final UserPhrase convert(UpcomingUserMessage upcomingUserMessage) {
        UserPhrase userPhrase = new UserPhrase(upcomingUserMessage.getText(), upcomingUserMessage.getQuote(), System.currentTimeMillis(), upcomingUserMessage.getFileDescription(), null);
        userPhrase.setCopy(upcomingUserMessage.getCopied());
        userPhrase.setCampaignMessage(upcomingUserMessage.getCampaignMessage());
        return userPhrase;
    }

    public static final synchronized void createInstance() {
        synchronized (ChatController.class) {
            Companion.createInstance();
        }
    }

    private final boolean enableInputBySchedule() {
        ScheduleInfo scheduleInfo = this.currentScheduleInfo;
        if (scheduleInfo == null) {
            return true;
        }
        return isScheduleActive(scheduleInfo);
    }

    private final Context getAppContext() {
        return (Context) this.appContext$delegate.getValue();
    }

    public final ChatState getChatState() {
        return (ChatState) this.chatState$delegate.getValue();
    }

    public final ChatUpdateProcessor getChatUpdateProcessor() {
        return (ChatUpdateProcessor) this.chatUpdateProcessor$delegate.getValue();
    }

    private final ClientUseCase getClientUseCase() {
        return (ClientUseCase) this.clientUseCase$delegate.getValue();
    }

    public final ConsultWriter getConsultWriter() {
        return (ConsultWriter) this.consultWriter$delegate.getValue();
    }

    public final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    public final DemoModeProvider getDemoModeProvider() {
        return (DemoModeProvider) this.demoModeProvider$delegate.getValue();
    }

    public final String getErrorMessage(boolean z, boolean z2) {
        if (!z) {
            String string = getAppContext().getString(this.chatStyle.loadedSettingsErrorText);
            z65.g(string, "{\n            appContext…tingsErrorText)\n        }");
            return string;
        } else if (!z2) {
            String string2 = getAppContext().getString(this.chatStyle.loadedAttachmentSettingsErrorText);
            z65.g(string2, "{\n            appContext…tingsErrorText)\n        }");
            return string2;
        } else {
            String string3 = getAppContext().getString(this.chatStyle.loadedSettingsErrorText);
            z65.g(string3, "{\n            appContext…tingsErrorText)\n        }");
            return string3;
        }
    }

    public final String getFormattedDuration(FileDescription fileDescription, MediaMetadataRetriever mediaMetadataRetriever) {
        long j;
        if (fileDescription != null && FileUtils.isVoiceMessage(fileDescription) && fileDescription.getFileUri() != null) {
            Uri fileUri = fileDescription.getFileUri();
            z65.e(fileUri);
            j = FileUtilsKt.getDuration(mediaMetadataRetriever, fileUri);
        } else {
            j = 0;
        }
        return VoiceTimeLabelFormatterKt.formatAsDuration(j);
    }

    private final HistoryLoader getHistoryLoader() {
        return (HistoryLoader) this.historyLoader$delegate.getValue();
    }

    public static final synchronized ChatController getInstance() {
        ChatController companion;
        synchronized (ChatController.class) {
            companion = Companion.getInstance();
        }
        return companion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getItemPositionByUuid(List<? extends ChatItem> list, String str) {
        ChatPhrase chatPhrase;
        ChatFragment chatFragment;
        List<ChatItem> elements;
        if (list == null) {
            list = kc1.l();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            chatPhrase = null;
            if (!it.hasNext()) {
                break;
            }
            ChatItem chatItem = (ChatItem) it.next();
            if (chatItem instanceof ChatPhrase) {
                chatPhrase = (ChatPhrase) chatItem;
            }
            if (chatPhrase != null) {
                arrayList.add(chatPhrase);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (z65.c(((ChatPhrase) next).getId(), str)) {
                chatPhrase = next;
                break;
            }
        }
        ChatPhrase chatPhrase2 = chatPhrase;
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference == null || (chatFragment = weakReference.get()) == null || (elements = chatFragment.getElements()) == null) {
            return -1;
        }
        int i = 0;
        for (ChatItem chatItem2 : elements) {
            if (chatPhrase2 != null && chatItem2.getTimeStamp() == chatPhrase2.getTimeStamp()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Long getItemTimestampForHistoryLoad() {
        Long uncompletedUserPhraseTimestamp = getUncompletedUserPhraseTimestamp();
        if (uncompletedUserPhraseTimestamp != null) {
            return uncompletedUserPhraseTimestamp;
        }
        return getLastDbItemTimestamp();
    }

    private final Long getLastDbItemTimestamp() {
        int w;
        Object k0;
        try {
            List<ChatItem> chatItems = getDatabase().getChatItems(0, 1);
            w = lc1.w(chatItems, 10);
            ArrayList arrayList = new ArrayList(w);
            for (ChatItem chatItem : chatItems) {
                arrayList.add(Long.valueOf(chatItem.getTimeStamp()));
            }
            k0 = sc1.k0(arrayList);
            return (Long) k0;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Status getMessageStatus(ChatItem chatItem, Status status) {
        UserPhrase userPhrase;
        if (chatItem instanceof UserPhrase) {
            userPhrase = (UserPhrase) chatItem;
        } else {
            userPhrase = null;
        }
        if (userPhrase != null && userPhrase.getSentState().ordinal() > status.getStatus().ordinal()) {
            String backendMessageId = userPhrase.getBackendMessageId();
            if (backendMessageId == null) {
                backendMessageId = status.getCorrelationId();
            }
            String backendMessageId2 = userPhrase.getBackendMessageId();
            if (backendMessageId2 == null) {
                backendMessageId2 = status.getMessageId();
            }
            return new Status(backendMessageId, backendMessageId2, userPhrase.getSentState());
        }
        return status;
    }

    private final Preferences getPreferences() {
        return (Preferences) this.preferences$delegate.getValue();
    }

    private final ConsultPhrase getQuickReplyMessageCandidate(List<? extends ChatItem> list) {
        List<? extends ChatItem> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ListIterator<? extends ChatItem> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                ChatItem previous = listIterator.previous();
                if (previous instanceof ConsultConnectionMessage) {
                    if (((ConsultConnectionMessage) previous).getDisplay()) {
                        return null;
                    }
                } else if (previous instanceof ConsultPhrase) {
                    return (ConsultPhrase) previous;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private final Long getUncompletedUserPhraseTimestamp() {
        List I0;
        Comparator comparingLong;
        I0 = sc1.I0(getDatabase().getChatItems(0, BaseConfig.Companion.getInstance().getHistoryLoadingCount()));
        if (Build.VERSION.SDK_INT >= 24) {
            final ChatController$getUncompletedUserPhraseTimestamp$1 chatController$getUncompletedUserPhraseTimestamp$1 = new ar8() { // from class: im.threads.ui.controllers.ChatController$getUncompletedUserPhraseTimestamp$1
                @Override // defpackage.ar8, defpackage.le5
                public Object get(Object obj) {
                    return Long.valueOf(((ChatItem) obj).getTimeStamp());
                }
            };
            comparingLong = Comparator.comparingLong(new ToLongFunction() { // from class: cz0
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    long uncompletedUserPhraseTimestamp$lambda$92;
                    uncompletedUserPhraseTimestamp$lambda$92 = ChatController.getUncompletedUserPhraseTimestamp$lambda$92(Function1.this, obj);
                    return uncompletedUserPhraseTimestamp$lambda$92;
                }
            });
            Collections.sort(I0, comparingLong);
        } else {
            final ChatController$getUncompletedUserPhraseTimestamp$2 chatController$getUncompletedUserPhraseTimestamp$2 = ChatController$getUncompletedUserPhraseTimestamp$2.INSTANCE;
            oc1.B(I0, new Comparator() { // from class: dz0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int uncompletedUserPhraseTimestamp$lambda$93;
                    uncompletedUserPhraseTimestamp$lambda$93 = ChatController.getUncompletedUserPhraseTimestamp$lambda$93(Function2.this, obj, obj2);
                    return uncompletedUserPhraseTimestamp$lambda$93;
                }
            });
        }
        int size = I0.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (I0.get(size) instanceof UserPhrase) {
                    Object obj = I0.get(size);
                    z65.f(obj, "null cannot be cast to non-null type im.threads.business.models.UserPhrase");
                    UserPhrase userPhrase = (UserPhrase) obj;
                    if (userPhrase.getSentState() != MessageStatus.READ) {
                        return Long.valueOf(userPhrase.getTimeStamp() - 1);
                    }
                }
            } else {
                return null;
            }
        }
    }

    public static final long getUncompletedUserPhraseTimestamp$lambda$92(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Number) function1.invoke(obj)).longValue();
    }

    public static final int getUncompletedUserPhraseTimestamp$lambda$93(Function2 function2, Object obj, Object obj2) {
        z65.h(function2, "$tmp0");
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public final void handleInputAvailability(List<? extends ChatItem> list) {
        ConsultPhrase consultPhrase;
        ChatItem chatItem;
        ListIterator<? extends ChatItem> listIterator = list.listIterator(list.size());
        while (true) {
            consultPhrase = null;
            if (listIterator.hasPrevious()) {
                chatItem = listIterator.previous();
                if (chatItem instanceof ConsultPhrase) {
                    break;
                }
            } else {
                chatItem = null;
                break;
            }
        }
        if (chatItem instanceof ConsultPhrase) {
            consultPhrase = chatItem;
        }
        if (consultPhrase != null && consultPhrase.isBlockInput() != null) {
            refreshUserInputState(consultPhrase.isBlockInput());
        }
    }

    public final void handleQuickReplies(List<? extends ChatItem> list) {
        boolean z;
        if (list.isEmpty()) {
            return;
        }
        ConsultPhrase quickReplyMessageCandidate = getQuickReplyMessageCandidate(list);
        if (quickReplyMessageCandidate != null) {
            if (quickReplyMessageCandidate.isBlockInput() != null) {
                z = z65.c(Boolean.FALSE, quickReplyMessageCandidate.isBlockInput());
            } else {
                z = this.chatStyle.inputEnabledDuringQuickReplies;
            }
            this.inputEnabledDuringQuickReplies = z;
            if (quickReplyMessageCandidate.getQuickReplies() != null) {
                getChatUpdateProcessor().postQuickRepliesChanged(new QuickReplyItem(quickReplyMessageCandidate.getQuickReplies(), quickReplyMessageCandidate.getTimeStamp() + 1));
                return;
            }
            return;
        }
        hideQuickReplies$threads_release();
    }

    private final boolean isInputFieldEnabled() {
        ChatFragment chatFragment;
        ta0<rb7<FileDescription>> fileDescription$threads_release;
        rb7<FileDescription> A;
        FileDescription fileDescription = null;
        try {
            WeakReference<ChatFragment> weakReference = this.fragment;
            if (weakReference != null && (chatFragment = weakReference.get()) != null && (fileDescription$threads_release = chatFragment.getFileDescription$threads_release()) != null && (A = fileDescription$threads_release.A()) != null) {
                fileDescription = A.b();
            }
        } catch (NoSuchElementException unused) {
        }
        if (fileDescription != null && FileUtils.isVoiceMessage(fileDescription)) {
            return false;
        }
        return isSendButtonEnabled();
    }

    private final boolean isScheduleActive(ScheduleInfo scheduleInfo) {
        if (scheduleInfo != null && scheduleInfo.isChatWorking()) {
            return true;
        }
        if (scheduleInfo != null && scheduleInfo.getSendDuringInactive()) {
            return true;
        }
        return false;
    }

    private final boolean isSendButtonEnabled() {
        if (this.hasQuickReplies && !this.inputEnabledDuringQuickReplies) {
            return false;
        }
        return enableInputBySchedule();
    }

    public final void loadConfig() {
        bma h = bma.f(new Callable() { // from class: tz0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Response loadConfig$lambda$22;
                loadConfig$lambda$22 = ChatController.loadConfig$lambda$22();
                return loadConfig$lambda$22;
            }
        }).k(dw9.b()).h(ti.c());
        final ChatController$loadConfig$2 chatController$loadConfig$2 = new ChatController$loadConfig$2(this);
        wr1 wr1Var = new wr1() { // from class: uz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.loadConfig$lambda$23(Function1.this, obj);
            }
        };
        final ChatController$loadConfig$3 chatController$loadConfig$3 = new ChatController$loadConfig$3(this);
        z33 i = h.i(wr1Var, new wr1() { // from class: vz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.loadConfig$lambda$24(Function1.this, obj);
            }
        });
        z65.g(i, "private fun loadConfig()…        }\n        )\n    }");
        subscribe(i);
    }

    public static final Response loadConfig$lambda$22() {
        Call<ConfigResponse> config = BackendApi.Companion.get().config();
        if (config != null) {
            return config.execute();
        }
        return null;
    }

    public static final void loadConfig$lambda$23(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void loadConfig$lambda$24(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final Pair loadHistory$lambda$21$lambda$18(Boolean bool, Long l, ChatController chatController) {
        boolean z;
        HistoryResponse historySync;
        ChatFragment chatFragment;
        z65.h(chatController, "this$0");
        BaseConfig.Companion companion = BaseConfig.Companion;
        int historyLoadingCount = companion.getInstance().getHistoryLoadingCount();
        boolean z2 = false;
        if (z65.c(bool, Boolean.TRUE) && l != null) {
            historySync = chatController.getHistoryLoader().getHistorySync(l, Integer.valueOf(historyLoadingCount), true);
        } else {
            HistoryLoader historyLoader = chatController.getHistoryLoader();
            Integer valueOf = Integer.valueOf(historyLoadingCount);
            if (bool == null) {
                z = true;
            } else {
                z = false;
            }
            historySync = historyLoader.getHistorySync(valueOf, z);
        }
        List<ChatItem> chatItems = HistoryParser.INSTANCE.getChatItems(historySync);
        if (chatItems.isEmpty()) {
            chatController.isAllMessagesDownloaded = true;
        }
        chatController.parseHistoryItemsForSentStatus(chatItems);
        chatController.parseHistoryItemsForAttachmentStatus(chatItems);
        chatController.isAllMessagesDownloaded = (chatItems.size() < companion.getInstance().getHistoryLoadingCount() || chatController.messenger.isEqualsToPreviousSaved(chatItems)) ? true : true;
        chatController.messenger.saveMessages(chatItems);
        chatController.clearUnreadPush();
        chatController.processSystemMessages(chatItems);
        WeakReference<ChatFragment> weakReference = chatController.fragment;
        ConsultInfo consultInfo = null;
        if (weakReference != null) {
            chatFragment = weakReference.get();
        } else {
            chatFragment = null;
        }
        if (chatFragment != null && chatController.isActive) {
            WeakReference<ChatFragment> weakReference2 = chatController.fragment;
            z65.e(weakReference2);
            ChatFragment chatFragment2 = weakReference2.get();
            z65.e(chatFragment2);
            if (!chatFragment2.isStartSecondLevelScreen()) {
                List<String> unreadMessagesUuid = chatController.getDatabase().getUnreadMessagesUuid();
                if (!unreadMessagesUuid.isEmpty()) {
                    companion.getInstance().transport.markMessagesAsRead(unreadMessagesUuid);
                }
            }
        }
        if (historySync != null) {
            consultInfo = historySync.getConsultInfo();
        }
        return new Pair(consultInfo, chatItems);
    }

    public static final void loadHistory$lambda$21$lambda$19(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void loadHistory$lambda$21$lambda$20(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadHistory$threads_release$default(ChatController chatController, Long l, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, HistoryLoader.HistoryLoadingCallback historyLoadingCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        if ((i & 128) != 0) {
            historyLoadingCallback = null;
        }
        chatController.loadHistory$threads_release(l, bool, z, z2, z3, z4, function1, historyLoadingCallback);
    }

    public static /* synthetic */ void loadHistoryAfterWithLastMessageCheck$threads_release$default(ChatController chatController, boolean z, boolean z2, boolean z3, HistoryLoader.HistoryLoadingCallback historyLoadingCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            historyLoadingCallback = null;
        }
        chatController.loadHistoryAfterWithLastMessageCheck$threads_release(z, z2, z3, historyLoadingCallback);
    }

    public final void loadItemsFromDB(boolean z) {
        ChatFragment chatFragment;
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null) {
            sh0.d(this.coroutineScope, null, null, new ChatController$loadItemsFromDB$1$1(chatFragment, z, this, null), 3, null);
        }
    }

    static /* synthetic */ void loadItemsFromDB$default(ChatController chatController, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        chatController.loadItemsFromDB(z);
    }

    private final void onClientIdChanged() throws Exception {
        ChatFragment chatFragment;
        LoggerEdna.info(ThreadsApi.REST_TAG, "Client id changed. Loading history.");
        cleanAll$threads_release(true);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null) {
            chatFragment.removeSearching();
        }
        if (isChatReady$threads_release()) {
            loadHistory$threads_release$default(this, null, null, false, false, false, false, null, null, 255, null);
        }
    }

    public final void onDeviceAddressChanged() {
        String str;
        boolean y;
        ChatFragment chatFragment;
        LoggerEdna.info(ThreadsApi.REST_TAG, "onDeviceAddressChanged. Loading history.");
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (this.fragment != null && str != null) {
            y = l0b.y(str);
            if (!y) {
                BaseConfig.Companion.getInstance().transport.sendRegisterDevice(false);
                clearUnreadPush();
                WeakReference<ChatFragment> weakReference = this.fragment;
                if (weakReference != null && (chatFragment = weakReference.get()) != null && chatFragment.isResumed() && isChatReady$threads_release()) {
                    loadHistory$threads_release$default(this, null, null, false, false, false, false, null, null, 255, null);
                }
            }
        }
    }

    public static /* synthetic */ void onFileDownloadRequest$threads_release$default(ChatController chatController, FileDescription fileDescription, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        chatController.onFileDownloadRequest$threads_release(fileDescription, z);
    }

    private final void parseHistoryItemsForAttachmentStatus(List<? extends ChatItem> list) {
        int w;
        Uri uri;
        ArrayList<ChatItem> arrayList = new ArrayList();
        for (Object obj : list) {
            ChatItem chatItem = (ChatItem) obj;
            if (chatItem instanceof UserPhrase) {
                FileDescription fileDescription = ((UserPhrase) chatItem).getFileDescription();
                if (fileDescription != null) {
                    uri = fileDescription.getFileUri();
                } else {
                    uri = null;
                }
                if (uri != null) {
                    arrayList.add(obj);
                }
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList<UserPhrase> arrayList2 = new ArrayList(w);
        for (ChatItem chatItem2 : arrayList) {
            z65.f(chatItem2, "null cannot be cast to non-null type im.threads.business.models.UserPhrase");
            arrayList2.add((UserPhrase) chatItem2);
        }
        for (UserPhrase userPhrase : arrayList2) {
            HashMap<String, AttachmentStateEnum> hashMap = this.attachmentsHistory;
            FileDescription fileDescription2 = userPhrase.getFileDescription();
            z65.e(fileDescription2);
            Uri fileUri = fileDescription2.getFileUri();
            z65.e(fileUri);
            AttachmentStateEnum attachmentStateEnum = hashMap.get(fileUri.toString());
            if (attachmentStateEnum != null) {
                FileDescription fileDescription3 = userPhrase.getFileDescription();
                z65.e(fileDescription3);
                if (attachmentStateEnum.compareTo(fileDescription3.getState()) > 0) {
                    FileDescription fileDescription4 = userPhrase.getFileDescription();
                    if (fileDescription4 != null) {
                        z65.g(attachmentStateEnum, "historyItem");
                        fileDescription4.setState(attachmentStateEnum);
                    }
                } else {
                    HashMap<String, AttachmentStateEnum> hashMap2 = this.attachmentsHistory;
                    FileDescription fileDescription5 = userPhrase.getFileDescription();
                    z65.e(fileDescription5);
                    Uri fileUri2 = fileDescription5.getFileUri();
                    z65.e(fileUri2);
                    String uri2 = fileUri2.toString();
                    z65.g(uri2, "item.fileDescription!!.fileUri!!.toString()");
                    FileDescription fileDescription6 = userPhrase.getFileDescription();
                    z65.e(fileDescription6);
                    hashMap2.put(uri2, fileDescription6.getState());
                }
            }
        }
    }

    private final void parseHistoryItemsForSentStatus(List<? extends ChatItem> list) {
        UserPhrase userPhrase;
        ArrayList<UserPhrase> arrayList = new ArrayList();
        for (ChatItem chatItem : list) {
            if (chatItem instanceof UserPhrase) {
                userPhrase = (UserPhrase) chatItem;
            } else {
                userPhrase = null;
            }
            if (userPhrase != null) {
                arrayList.add(userPhrase);
            }
        }
        for (UserPhrase userPhrase2 : arrayList) {
            if (userPhrase2.isRead() && !z65.c(userPhrase2.getErrorMock(), Boolean.TRUE)) {
                userPhrase2.setSentState(MessageStatus.READ);
            } else if (z65.c(userPhrase2.getErrorMock(), Boolean.TRUE)) {
                userPhrase2.setSentState(MessageStatus.FAILED);
            } else {
                int ordinal = userPhrase2.getSentState().ordinal();
                MessageStatus messageStatus = MessageStatus.DELIVERED;
                if (ordinal < messageStatus.ordinal()) {
                    userPhrase2.setSentState(messageStatus);
                }
            }
        }
    }

    public final void processConsultConnectionMessage(ConsultConnectionMessage consultConnectionMessage) {
        boolean v;
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        v = l0b.v(consultConnectionMessage.getType(), "OPERATOR_JOINED", true);
        if (v) {
            setThreadId(consultConnectionMessage.getThreadId());
            WeakReference<ChatFragment> weakReference = this.fragment;
            if (weakReference != null && (chatFragment2 = weakReference.get()) != null) {
                chatFragment2.setCurrentThreadId(consultConnectionMessage.getThreadId().longValue());
            }
            getConsultWriter().setSearchingConsult(false);
            getConsultWriter().setCurrentConsultInfo(consultConnectionMessage);
            WeakReference<ChatFragment> weakReference2 = this.fragment;
            if (weakReference2 != null && (chatFragment = weakReference2.get()) != null) {
                chatFragment.setStateConsultConnected(new ConsultInfo(consultConnectionMessage.getName(), consultConnectionMessage.getConsultId(), consultConnectionMessage.getStatus(), consultConnectionMessage.getOrgUnit(), consultConnectionMessage.getAvatarPath(), consultConnectionMessage.getRole()));
            }
        }
    }

    public final void processSimpleSystemMessage(SimpleSystemMessage simpleSystemMessage) {
        boolean v;
        boolean v2;
        ChatFragment chatFragment;
        boolean v3;
        ChatFragment chatFragment2;
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment3;
        String type = simpleSystemMessage.getType();
        v = l0b.v("THREAD_CLOSED", type, true);
        if (v) {
            setThreadId(-1L);
            removeResolveRequest();
            getConsultWriter().setCurrentConsultLeft();
            if (!getConsultWriter().isSearchingConsult() && (weakReference = this.fragment) != null && (chatFragment3 = weakReference.get()) != null) {
                chatFragment3.setTitleStateDefault();
                return;
            }
            return;
        }
        setThreadId(simpleSystemMessage.getThreadId());
        WeakReference<ChatFragment> weakReference2 = this.fragment;
        if (weakReference2 != null && (chatFragment2 = weakReference2.get()) != null) {
            chatFragment2.setCurrentThreadId(simpleSystemMessage.getThreadId().longValue());
        }
        v2 = l0b.v("THREAD_ENQUEUED", type, true);
        if (!v2) {
            v3 = l0b.v("AVERAGE_WAIT_TIME", type, true);
            if (!v3) {
                return;
            }
        }
        WeakReference<ChatFragment> weakReference3 = this.fragment;
        if (weakReference3 != null && (chatFragment = weakReference3.get()) != null) {
            chatFragment.setStateSearchingConsult();
        }
        getConsultWriter().setSearchingConsult(true);
    }

    private final void processSystemMessages(List<? extends ChatItem> list) {
        Long threadId;
        boolean v;
        boolean v2;
        boolean v3;
        boolean v4;
        boolean v5;
        if (!isChatWorking$threads_release()) {
            return;
        }
        final ChatItem chatItem = null;
        for (ChatItem chatItem2 : list) {
            if ((chatItem2 instanceof SystemMessage) && (threadId = chatItem2.getThreadId()) != null && threadId.longValue() >= threadId.longValue()) {
                String type = ((SystemMessage) chatItem2).getType();
                v = l0b.v(ChatItemType.OPERATOR_JOINED.toString(), type, true);
                if (!v) {
                    v2 = l0b.v(ChatItemType.THREAD_ENQUEUED.toString(), type, true);
                    if (!v2) {
                        v3 = l0b.v(ChatItemType.THREAD_WILL_BE_REASSIGNED.toString(), type, true);
                        if (!v3) {
                            v4 = l0b.v(ChatItemType.AVERAGE_WAIT_TIME.toString(), type, true);
                            if (!v4) {
                                v5 = l0b.v(ChatItemType.THREAD_CLOSED.toString(), type, true);
                                if (v5) {
                                }
                            }
                        }
                    }
                }
                if (chatItem == null || chatItem.getTimeStamp() <= chatItem2.getTimeStamp()) {
                    chatItem = chatItem2;
                }
            }
        }
        if (chatItem != null) {
            ThreadRunnerKt.runOnUiThread(new Runnable() { // from class: zy0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatController.processSystemMessages$lambda$87(ChatItem.this, this);
                }
            });
        }
    }

    public static final void processSystemMessages$lambda$87(ChatItem chatItem, ChatController chatController) {
        z65.h(chatItem, "$systemMessage");
        z65.h(chatController, "this$0");
        if (chatItem instanceof ConsultConnectionMessage) {
            chatController.processConsultConnectionMessage((ConsultConnectionMessage) chatItem);
        } else {
            chatController.processSimpleSystemMessage((SimpleSystemMessage) chatItem);
        }
    }

    public final void refreshUserInputState(Boolean bool) {
        InputFieldEnableModel inputFieldEnableModel;
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        if (z65.c(bool, Boolean.TRUE)) {
            inputFieldEnableModel = new InputFieldEnableModel(false, false);
        } else if (z65.c(bool, Boolean.FALSE)) {
            inputFieldEnableModel = new InputFieldEnableModel(true, true);
        } else {
            inputFieldEnableModel = new InputFieldEnableModel(isInputFieldEnabled(), isSendButtonEnabled());
        }
        if (!z65.c(String.valueOf(this.enableModel), inputFieldEnableModel.toString())) {
            LoggerEdna.info("UserInputState_change. isInputBlockedFromMessage: " + bool + ", " + inputFieldEnableModel);
        }
        this.enableModel = inputFieldEnableModel;
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment2 = weakReference.get()) != null) {
            chatFragment2.updateInputEnable$threads_release(inputFieldEnableModel, this.isInputDisabled);
        }
        WeakReference<ChatFragment> weakReference2 = this.fragment;
        if (weakReference2 != null && (chatFragment = weakReference2.get()) != null) {
            chatFragment.updateChatAvailabilityMessage$threads_release(inputFieldEnableModel, this.isInputDisabled);
        }
    }

    public static /* synthetic */ void refreshUserInputState$default(ChatController chatController, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        chatController.refreshUserInputState(bool);
    }

    public final void removeActiveSurvey() {
        ChatFragment chatFragment;
        Survey survey;
        sk1 notSentSurveyDisplayMessageToFalse = getDatabase().setNotSentSurveyDisplayMessageToFalse();
        t4 t4Var = new t4() { // from class: f01
            @Override // defpackage.t4
            public final void run() {
                ChatController.removeActiveSurvey$lambda$73();
            }
        };
        final ChatController$removeActiveSurvey$2 chatController$removeActiveSurvey$2 = ChatController$removeActiveSurvey$2.INSTANCE;
        z33 e = notSentSurveyDisplayMessageToFalse.e(t4Var, new wr1() { // from class: g01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.removeActiveSurvey$lambda$74(Function1.this, obj);
            }
        });
        z65.g(e, "database.setNotSentSurve…hrowable -> obj.message }");
        subscribe(e);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null && (survey = this.activeSurvey) != null) {
            chatFragment.removeSurvey(survey.getSendingId());
        }
    }

    public static final void removeActiveSurvey$lambda$74(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeCorruptedFiles$threads_release$default(ChatController chatController, List list, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        chatController.removeCorruptedFiles$threads_release(list, function0);
    }

    public final void removePushNotification() {
        if (!BusinessExtensionsKt.isUnitTest()) {
            NotificationWorker.Companion.removeNotification(getAppContext());
        }
    }

    public final void removeResolveRequest() {
        ChatFragment chatFragment;
        sk1 oldRequestResolveThreadDisplayMessageToFalse = getDatabase().setOldRequestResolveThreadDisplayMessageToFalse();
        t4 t4Var = new t4() { // from class: kz0
            @Override // defpackage.t4
            public final void run() {
                ChatController.removeResolveRequest$lambda$71();
            }
        };
        final ChatController$removeResolveRequest$2 chatController$removeResolveRequest$2 = ChatController$removeResolveRequest$2.INSTANCE;
        z33 e = oldRequestResolveThreadDisplayMessageToFalse.e(t4Var, new wr1() { // from class: mz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.removeResolveRequest$lambda$72(Function1.this, obj);
            }
        });
        z65.g(e, "database.setOldRequestRe…hrowable -> obj.message }");
        subscribe(e);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null) {
            chatFragment.removeResolveRequest();
        }
    }

    public static final void removeResolveRequest$lambda$72(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final void resetActiveSurvey() {
        this.activeSurvey = null;
    }

    public final void sentStatus(Status status) {
        sh0.d(this.coroutineScope, null, null, new ChatController$sentStatus$1(this, status, null), 3, null);
    }

    public static final boolean setActivityIsForeground$lambda$0(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void setActivityIsForeground$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void setActivityIsForeground$lambda$2(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void setAllMessagesWereRead$lambda$15() {
        UnreadMessagesController.INSTANCE.refreshUnreadMessagesCount();
    }

    public static final void setAllMessagesWereRead$lambda$16(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ChatItem> setLastAvatars(List<? extends ChatItem> list) {
        ConsultInfo consultInfo;
        for (ChatItem chatItem : list) {
            if (chatItem instanceof ConsultPhrase) {
                ConsultPhrase consultPhrase = (ConsultPhrase) chatItem;
                if (consultPhrase.getConsultId() != null) {
                    DatabaseHolder database = getDatabase();
                    String consultId = consultPhrase.getConsultId();
                    z65.e(consultId);
                    consultInfo = database.getConsultInfo(consultId);
                } else {
                    consultInfo = null;
                }
                if (consultInfo != null) {
                    consultPhrase.setAvatarPath(consultInfo.getPhotoUrl());
                }
            }
        }
        return list;
    }

    public static /* synthetic */ void setMessageAsRead$threads_release$default(ChatController chatController, ChatItem chatItem, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        chatController.setMessageAsRead$threads_release(chatItem, z);
    }

    public static final void setMessagesInCurrentThreadAsReadInDB$lambda$13() {
        UnreadMessagesController.INSTANCE.refreshUnreadMessagesCount();
    }

    public static final void setMessagesInCurrentThreadAsReadInDB$lambda$14(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final void setSurveyStateSent(Survey survey) {
        ChatFragment chatFragment;
        survey.setSentState(MessageStatus.SENT);
        survey.setDisplayMessage(true);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null) {
            chatFragment.setSurveySentStatus(survey);
        }
        getDatabase().putChatItem(survey);
    }

    private final boolean subscribe(z33 z33Var) {
        wn1 wn1Var = this.compositeDisposable;
        if (wn1Var == null || (wn1Var != null && wn1Var.i())) {
            this.compositeDisposable = new wn1();
        }
        wn1 wn1Var2 = this.compositeDisposable;
        if (wn1Var2 != null && wn1Var2.b(z33Var)) {
            return true;
        }
        return false;
    }

    private final void subscribeForPermissionsGranted() {
        sh0.d(this.coroutineScope, v33.c(), null, new ChatController$subscribeForPermissionsGranted$1(this, null), 2, null);
    }

    private final void subscribeForResendMessage() {
        r57<String> m = this.messenger.getResendStream().m(ti.c());
        final ChatController$subscribeForResendMessage$1 chatController$subscribeForResendMessage$1 = new ChatController$subscribeForResendMessage$1(this);
        wr1<? super String> wr1Var = new wr1() { // from class: xz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeForResendMessage$lambda$69(Function1.this, obj);
            }
        };
        final ChatController$subscribeForResendMessage$2 chatController$subscribeForResendMessage$2 = ChatController$subscribeForResendMessage$2.INSTANCE;
        z33 p = m.p(wr1Var, new wr1() { // from class: yz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeForResendMessage$lambda$70(Function1.this, obj);
            }
        });
        z65.g(p, "private fun subscribeFor…message }\n        )\n    }");
        subscribe(p);
    }

    public static final void subscribeForResendMessage$lambda$69(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeForResendMessage$lambda$70(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeOnChatState() {
        sh0.d(this.coroutineScope, v33.b(), null, new ChatController$subscribeOnChatState$1(this, null), 2, null);
    }

    private final void subscribeOnClientIdChange() {
        String str;
        ChatController chatController;
        UserInfoBuilder userInfo = getClientUseCase().getUserInfo();
        String tagNewClientId = getClientUseCase().getTagNewClientId();
        if (userInfo != null) {
            str = userInfo.getClientId();
        } else {
            str = null;
        }
        if (tagNewClientId != null && tagNewClientId.length() != 0 && !z65.c(tagNewClientId, str) && (chatController = instance) != null) {
            chatController.onClientIdChanged();
        }
    }

    private final void subscribeOnFileUploadResult() {
        l04<FileDescription> H = getChatUpdateProcessor().getUploadResultProcessor().H(ti.c());
        final ChatController$subscribeOnFileUploadResult$1 chatController$subscribeOnFileUploadResult$1 = new ChatController$subscribeOnFileUploadResult$1(this);
        z33 O = H.O(new wr1() { // from class: bz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeOnFileUploadResult$lambda$91(Function1.this, obj);
            }
        });
        z65.g(O, "private fun subscribeOnF…        }\n        )\n    }");
        subscribe(O);
    }

    public static final void subscribeOnFileUploadResult$lambda$91(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeOnMessageError() {
        r57<Long> m = this.messageErrorProcessor.s(dw9.b()).m(ti.c());
        final ChatController$subscribeOnMessageError$1 chatController$subscribeOnMessageError$1 = new ChatController$subscribeOnMessageError$1(this);
        z33 o = m.o(new wr1() { // from class: iy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeOnMessageError$lambda$90(Function1.this, obj);
            }
        });
        z65.g(o, "private fun subscribeOnM…        }\n        )\n    }");
        subscribe(o);
    }

    public static final void subscribeOnMessageError$lambda$90(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeSpeechMessageUpdated() {
        l04 j = l04.C(getChatUpdateProcessor().getSpeechMessageUpdateProcessor()).j(UPDATE_SPEECH_STATUS_DEBOUNCE, TimeUnit.MILLISECONDS);
        final ChatController$subscribeSpeechMessageUpdated$1 chatController$subscribeSpeechMessageUpdated$1 = new ChatController$subscribeSpeechMessageUpdated$1(this);
        l04 H = j.G(new z84() { // from class: qy0
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                ChatItem subscribeSpeechMessageUpdated$lambda$37;
                subscribeSpeechMessageUpdated$lambda$37 = ChatController.subscribeSpeechMessageUpdated$lambda$37(Function1.this, obj);
                return subscribeSpeechMessageUpdated$lambda$37;
            }
        }).T(dw9.b()).H(ti.c());
        final ChatController$subscribeSpeechMessageUpdated$2 chatController$subscribeSpeechMessageUpdated$2 = new ChatController$subscribeSpeechMessageUpdated$2(this);
        wr1 wr1Var = new wr1() { // from class: ry0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeSpeechMessageUpdated$lambda$38(Function1.this, obj);
            }
        };
        final ChatController$subscribeSpeechMessageUpdated$3 chatController$subscribeSpeechMessageUpdated$3 = ChatController$subscribeSpeechMessageUpdated$3.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: sy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeSpeechMessageUpdated$lambda$39(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeSpe…error\") }\n        )\n    }");
        subscribe(P);
    }

    public static final ChatItem subscribeSpeechMessageUpdated$lambda$37(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (ChatItem) function1.invoke(obj);
    }

    public static final void subscribeSpeechMessageUpdated$lambda$38(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeSpeechMessageUpdated$lambda$39(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToAttachAudioFiles() {
        i14<Boolean> attachAudioFilesProcessor = getChatUpdateProcessor().getAttachAudioFilesProcessor();
        final ChatController$subscribeToAttachAudioFiles$1 chatController$subscribeToAttachAudioFiles$1 = new ChatController$subscribeToAttachAudioFiles$1(this);
        wr1<? super Boolean> wr1Var = new wr1() { // from class: l01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToAttachAudioFiles$lambda$65(Function1.this, obj);
            }
        };
        final ChatController$subscribeToAttachAudioFiles$2 chatController$subscribeToAttachAudioFiles$2 = ChatController$subscribeToAttachAudioFiles$2.INSTANCE;
        z33 P = attachAudioFilesProcessor.P(wr1Var, new wr1() { // from class: m01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToAttachAudioFiles$lambda$66(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToA… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToAttachAudioFiles$lambda$65(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToAttachAudioFiles$lambda$66(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToCampaignMessageReplySuccess() {
        l04 m = l04.C(getChatUpdateProcessor().getCampaignMessageReplySuccessProcessor()).H(dw9.b()).m(1000L, TimeUnit.MILLISECONDS);
        final ChatController$subscribeToCampaignMessageReplySuccess$1 chatController$subscribeToCampaignMessageReplySuccess$1 = new ChatController$subscribeToCampaignMessageReplySuccess$1(this);
        wr1 wr1Var = new wr1() { // from class: rz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToCampaignMessageReplySuccess$lambda$26(Function1.this, obj);
            }
        };
        final ChatController$subscribeToCampaignMessageReplySuccess$2 chatController$subscribeToCampaignMessageReplySuccess$2 = ChatController$subscribeToCampaignMessageReplySuccess$2.INSTANCE;
        z33 P = m.P(wr1Var, new wr1() { // from class: sz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToCampaignMessageReplySuccess$lambda$27(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToC…        }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToCampaignMessageReplySuccess$lambda$26(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToCampaignMessageReplySuccess$lambda$27(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToChatEvents() {
        subscribeToTyping();
        subscribeToOutgoingMessageStatusChanged();
        subscribeToIncomingMessageRead();
        subscribeToNewMessage();
        subscribeToUpdateAttachments();
        subscribeToMessageSendSuccess();
        subscribeToCampaignMessageReplySuccess();
        subscribeToMessageSendError();
        subscribeToSurveySendSuccess();
        subscribeToRemoveChatItem();
        subscribeToDeviceAddressChanged();
        subscribeToQuickReplies();
        subscribeToAttachAudioFiles();
        subscribeToClientNotificationDisplayTypeProcessor();
        subscribeSpeechMessageUpdated();
        subscribeForResendMessage();
        subscribeOnClientIdChange();
        subscribeOnMessageError();
        subscribeOnFileUploadResult();
        subscribeToTransportException();
        subscribeOnChatState();
        subscribeForPermissionsGranted();
    }

    private final void subscribeToClientNotificationDisplayTypeProcessor() {
        l04<ClientNotificationDisplayType> H = getChatUpdateProcessor().getClientNotificationDisplayTypeProcessor().H(ti.c());
        final ChatController$subscribeToClientNotificationDisplayTypeProcessor$1 chatController$subscribeToClientNotificationDisplayTypeProcessor$1 = new ChatController$subscribeToClientNotificationDisplayTypeProcessor$1(this);
        wr1<? super ClientNotificationDisplayType> wr1Var = new wr1() { // from class: ty0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToClientNotificationDisplayTypeProcessor$lambda$67(Function1.this, obj);
            }
        };
        final ChatController$subscribeToClientNotificationDisplayTypeProcessor$2 chatController$subscribeToClientNotificationDisplayTypeProcessor$2 = ChatController$subscribeToClientNotificationDisplayTypeProcessor$2.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: uy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToClientNotificationDisplayTypeProcessor$lambda$68(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToC…message }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToClientNotificationDisplayTypeProcessor$lambda$67(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToClientNotificationDisplayTypeProcessor$lambda$68(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToDeviceAddressChanged() {
        l04 H = l04.C(getChatUpdateProcessor().getDeviceAddressChangedProcessor()).H(ti.c());
        final ChatController$subscribeToDeviceAddressChanged$1 chatController$subscribeToDeviceAddressChanged$1 = new ChatController$subscribeToDeviceAddressChanged$1(this);
        wr1 wr1Var = new wr1() { // from class: gy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToDeviceAddressChanged$lambda$61(Function1.this, obj);
            }
        };
        final ChatController$subscribeToDeviceAddressChanged$2 chatController$subscribeToDeviceAddressChanged$2 = ChatController$subscribeToDeviceAddressChanged$2.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: hy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToDeviceAddressChanged$lambda$62(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToD…        }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToDeviceAddressChanged$lambda$61(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToDeviceAddressChanged$lambda$62(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToDisableInput() {
        sh0.d(rx1.a(v33.d()), null, null, new ChatController$subscribeToDisableInput$1(this, null), 3, null);
    }

    private final void subscribeToIncomingMessageRead() {
        l04 J = l04.C(getChatUpdateProcessor().getIncomingMessageReadProcessor()).H(dw9.b()).J();
        final ChatController$subscribeToIncomingMessageRead$1 chatController$subscribeToIncomingMessageRead$1 = new ChatController$subscribeToIncomingMessageRead$1(this);
        wr1 wr1Var = new wr1() { // from class: r01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToIncomingMessageRead$lambda$35(Function1.this, obj);
            }
        };
        final ChatController$subscribeToIncomingMessageRead$2 chatController$subscribeToIncomingMessageRead$2 = ChatController$subscribeToIncomingMessageRead$2.INSTANCE;
        z33 P = J.P(wr1Var, new wr1() { // from class: t01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToIncomingMessageRead$lambda$36(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToI… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToIncomingMessageRead$lambda$35(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToIncomingMessageRead$lambda$36(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToMessageSendError() {
        l04 H = l04.C(getChatUpdateProcessor().getMessageSendErrorProcessor()).H(dw9.b());
        final ChatController$subscribeToMessageSendError$1 chatController$subscribeToMessageSendError$1 = new ChatController$subscribeToMessageSendError$1(this);
        l04 H2 = H.z(new z84() { // from class: h01
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                xa6 subscribeToMessageSendError$lambda$51;
                subscribeToMessageSendError$lambda$51 = ChatController.subscribeToMessageSendError$lambda$51(Function1.this, obj);
                return subscribeToMessageSendError$lambda$51;
            }
        }).H(ti.c());
        final ChatController$subscribeToMessageSendError$2 chatController$subscribeToMessageSendError$2 = new ChatController$subscribeToMessageSendError$2(this);
        wr1 wr1Var = new wr1() { // from class: s01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToMessageSendError$lambda$52(Function1.this, obj);
            }
        };
        final ChatController$subscribeToMessageSendError$3 chatController$subscribeToMessageSendError$3 = ChatController$subscribeToMessageSendError$3.INSTANCE;
        z33 P = H2.P(wr1Var, new wr1() { // from class: x01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToMessageSendError$lambda$53(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToM… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final xa6 subscribeToMessageSendError$lambda$51(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (xa6) function1.invoke(obj);
    }

    public static final void subscribeToMessageSendError$lambda$52(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToMessageSendError$lambda$53(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToMessageSendSuccess() {
        l04 H = l04.C(getChatUpdateProcessor().getMessageSendSuccessProcessor()).H(dw9.b());
        final ChatController$subscribeToMessageSendSuccess$1 chatController$subscribeToMessageSendSuccess$1 = new ChatController$subscribeToMessageSendSuccess$1(this);
        l04 H2 = H.z(new z84() { // from class: i01
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                xa6 subscribeToMessageSendSuccess$lambda$48;
                subscribeToMessageSendSuccess$lambda$48 = ChatController.subscribeToMessageSendSuccess$lambda$48(Function1.this, obj);
                return subscribeToMessageSendSuccess$lambda$48;
            }
        }).H(ti.c());
        final ChatController$subscribeToMessageSendSuccess$2 chatController$subscribeToMessageSendSuccess$2 = new ChatController$subscribeToMessageSendSuccess$2(this);
        wr1 wr1Var = new wr1() { // from class: j01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToMessageSendSuccess$lambda$49(Function1.this, obj);
            }
        };
        final ChatController$subscribeToMessageSendSuccess$3 chatController$subscribeToMessageSendSuccess$3 = ChatController$subscribeToMessageSendSuccess$3.INSTANCE;
        z33 P = H2.P(wr1Var, new wr1() { // from class: k01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToMessageSendSuccess$lambda$50(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToM… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final xa6 subscribeToMessageSendSuccess$lambda$48(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (xa6) function1.invoke(obj);
    }

    public static final void subscribeToMessageSendSuccess$lambda$49(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToMessageSendSuccess$lambda$50(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToNewMessage() {
        l04 H = l04.C(getChatUpdateProcessor().getNewMessageProcessor()).H(ti.c());
        final ChatController$subscribeToNewMessage$1 chatController$subscribeToNewMessage$1 = new ChatController$subscribeToNewMessage$1(this);
        l04 s = H.s(new wr1() { // from class: zz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToNewMessage$lambda$42(Function1.this, obj);
            }
        });
        final ChatController$subscribeToNewMessage$2 chatController$subscribeToNewMessage$2 = ChatController$subscribeToNewMessage$2.INSTANCE;
        l04 v = s.v(new oh8() { // from class: a01
            @Override // defpackage.oh8
            public final boolean b(Object obj) {
                boolean subscribeToNewMessage$lambda$43;
                subscribeToNewMessage$lambda$43 = ChatController.subscribeToNewMessage$lambda$43(Function1.this, obj);
                return subscribeToNewMessage$lambda$43;
            }
        });
        final ChatController$subscribeToNewMessage$3 chatController$subscribeToNewMessage$3 = ChatController$subscribeToNewMessage$3.INSTANCE;
        l04 G = v.G(new z84() { // from class: b01
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                Hidable subscribeToNewMessage$lambda$44;
                subscribeToNewMessage$lambda$44 = ChatController.subscribeToNewMessage$lambda$44(Function1.this, obj);
                return subscribeToNewMessage$lambda$44;
            }
        });
        final ChatController$subscribeToNewMessage$4 chatController$subscribeToNewMessage$4 = ChatController$subscribeToNewMessage$4.INSTANCE;
        l04 H2 = G.o(new z84() { // from class: c01
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                ls8 subscribeToNewMessage$lambda$45;
                subscribeToNewMessage$lambda$45 = ChatController.subscribeToNewMessage$lambda$45(Function1.this, obj);
                return subscribeToNewMessage$lambda$45;
            }
        }).H(ti.c());
        final ChatController$subscribeToNewMessage$5 chatController$subscribeToNewMessage$5 = new ChatController$subscribeToNewMessage$5(this);
        wr1 wr1Var = new wr1() { // from class: d01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToNewMessage$lambda$46(Function1.this, obj);
            }
        };
        final ChatController$subscribeToNewMessage$6 chatController$subscribeToNewMessage$6 = ChatController$subscribeToNewMessage$6.INSTANCE;
        z33 P = H2.P(wr1Var, new wr1() { // from class: e01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToNewMessage$lambda$47(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToN…message }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToNewMessage$lambda$42(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final boolean subscribeToNewMessage$lambda$43(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final Hidable subscribeToNewMessage$lambda$44(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (Hidable) function1.invoke(obj);
    }

    public static final ls8 subscribeToNewMessage$lambda$45(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (ls8) function1.invoke(obj);
    }

    public static final void subscribeToNewMessage$lambda$46(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToNewMessage$lambda$47(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final void subscribeToOutgoingMessageStatusChanged() {
        l04 C = l04.C(getChatUpdateProcessor().getOutgoingMessageStatusChangedProcessor());
        final ChatController$subscribeToOutgoingMessageStatusChanged$1 chatController$subscribeToOutgoingMessageStatusChanged$1 = ChatController$subscribeToOutgoingMessageStatusChanged$1.INSTANCE;
        l04 H = C.g(new z84() { // from class: n01
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                ls8 subscribeToOutgoingMessageStatusChanged$lambda$31;
                subscribeToOutgoingMessageStatusChanged$lambda$31 = ChatController.subscribeToOutgoingMessageStatusChanged$lambda$31(Function1.this, obj);
                return subscribeToOutgoingMessageStatusChanged$lambda$31;
            }
        }).H(dw9.b());
        final ChatController$subscribeToOutgoingMessageStatusChanged$2 chatController$subscribeToOutgoingMessageStatusChanged$2 = new ChatController$subscribeToOutgoingMessageStatusChanged$2(this);
        l04 H2 = H.s(new wr1() { // from class: o01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToOutgoingMessageStatusChanged$lambda$32(Function1.this, obj);
            }
        }).H(ti.c());
        final ChatController$subscribeToOutgoingMessageStatusChanged$3 chatController$subscribeToOutgoingMessageStatusChanged$3 = new ChatController$subscribeToOutgoingMessageStatusChanged$3(this);
        wr1 wr1Var = new wr1() { // from class: p01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToOutgoingMessageStatusChanged$lambda$33(Function1.this, obj);
            }
        };
        final ChatController$subscribeToOutgoingMessageStatusChanged$4 chatController$subscribeToOutgoingMessageStatusChanged$4 = ChatController$subscribeToOutgoingMessageStatusChanged$4.INSTANCE;
        z33 P = H2.P(wr1Var, new wr1() { // from class: q01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToOutgoingMessageStatusChanged$lambda$34(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToO…        }\n        )\n    }");
        subscribe(P);
    }

    public static final ls8 subscribeToOutgoingMessageStatusChanged$lambda$31(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (ls8) function1.invoke(obj);
    }

    public static final void subscribeToOutgoingMessageStatusChanged$lambda$32(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToOutgoingMessageStatusChanged$lambda$33(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToOutgoingMessageStatusChanged$lambda$34(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToQuickReplies() {
        i14<QuickReplyItem> quickRepliesProcessor = getChatUpdateProcessor().getQuickRepliesProcessor();
        final ChatController$subscribeToQuickReplies$1 chatController$subscribeToQuickReplies$1 = new ChatController$subscribeToQuickReplies$1(this);
        wr1<? super QuickReplyItem> wr1Var = new wr1() { // from class: gz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToQuickReplies$lambda$63(Function1.this, obj);
            }
        };
        final ChatController$subscribeToQuickReplies$2 chatController$subscribeToQuickReplies$2 = ChatController$subscribeToQuickReplies$2.INSTANCE;
        z33 P = quickRepliesProcessor.P(wr1Var, new wr1() { // from class: hz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToQuickReplies$lambda$64(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToQ… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToQuickReplies$lambda$63(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToQuickReplies$lambda$64(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToRemoveChatItem() {
        l04 H = l04.C(getChatUpdateProcessor().getRemoveChatItemProcessor()).H(ti.c());
        final ChatController$subscribeToRemoveChatItem$1 chatController$subscribeToRemoveChatItem$1 = ChatController$subscribeToRemoveChatItem$1.INSTANCE;
        l04 v = H.v(new oh8() { // from class: u01
            @Override // defpackage.oh8
            public final boolean b(Object obj) {
                boolean subscribeToRemoveChatItem$lambda$58;
                subscribeToRemoveChatItem$lambda$58 = ChatController.subscribeToRemoveChatItem$lambda$58(Function1.this, obj);
                return subscribeToRemoveChatItem$lambda$58;
            }
        });
        final ChatController$subscribeToRemoveChatItem$2 chatController$subscribeToRemoveChatItem$2 = new ChatController$subscribeToRemoveChatItem$2(this);
        wr1 wr1Var = new wr1() { // from class: v01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToRemoveChatItem$lambda$59(Function1.this, obj);
            }
        };
        final ChatController$subscribeToRemoveChatItem$3 chatController$subscribeToRemoveChatItem$3 = ChatController$subscribeToRemoveChatItem$3.INSTANCE;
        z33 P = v.P(wr1Var, new wr1() { // from class: w01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToRemoveChatItem$lambda$60(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToR…        }\n        )\n    }");
        subscribe(P);
    }

    public static final boolean subscribeToRemoveChatItem$lambda$58(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void subscribeToRemoveChatItem$lambda$59(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToRemoveChatItem$lambda$60(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToSurveyCompletion() {
        sa6 c = l04.C(this.surveyCompletionProcessor).W(Config.Companion.getInstance().getSurveyCompletionDelay(), TimeUnit.MILLISECONDS).w().c(ti.c());
        final ChatController$subscribeToSurveyCompletion$1 chatController$subscribeToSurveyCompletion$1 = ChatController$subscribeToSurveyCompletion$1.INSTANCE;
        wr1 wr1Var = new wr1() { // from class: ez0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToSurveyCompletion$lambda$54(Function1.this, obj);
            }
        };
        final ChatController$subscribeToSurveyCompletion$2 chatController$subscribeToSurveyCompletion$2 = ChatController$subscribeToSurveyCompletion$2.INSTANCE;
        z33 d = c.d(wr1Var, new wr1() { // from class: fz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToSurveyCompletion$lambda$55(Function1.this, obj);
            }
        });
        z65.g(d, "fromPublisher(surveyComp…ssage\")\n                }");
        subscribe(d);
    }

    public static final void subscribeToSurveyCompletion$lambda$54(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToSurveyCompletion$lambda$55(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToSurveySendSuccess() {
        l04 H = l04.C(getChatUpdateProcessor().getSurveySendSuccessProcessor()).H(dw9.b()).H(ti.c());
        final ChatController$subscribeToSurveySendSuccess$1 chatController$subscribeToSurveySendSuccess$1 = new ChatController$subscribeToSurveySendSuccess$1(this);
        wr1 wr1Var = new wr1() { // from class: nz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToSurveySendSuccess$lambda$56(Function1.this, obj);
            }
        };
        final ChatController$subscribeToSurveySendSuccess$2 chatController$subscribeToSurveySendSuccess$2 = ChatController$subscribeToSurveySendSuccess$2.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: oz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToSurveySendSuccess$lambda$57(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToS… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToSurveySendSuccess$lambda$56(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToSurveySendSuccess$lambda$57(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToTransportException() {
        l04 H = l04.C(getChatUpdateProcessor().getErrorProcessor()).H(ti.c());
        final ChatController$subscribeToTransportException$1 chatController$subscribeToTransportException$1 = new ChatController$subscribeToTransportException$1(this);
        z33 O = H.O(new wr1() { // from class: vy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToTransportException$lambda$25(Function1.this, obj);
            }
        });
        z65.g(O, "private fun subscribeToT…        }\n        )\n    }");
        subscribe(O);
    }

    public static final void subscribeToTransportException$lambda$25(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToTyping() {
        l04 C = l04.C(getChatUpdateProcessor().getTypingProcessor());
        final ChatController$subscribeToTyping$1 chatController$subscribeToTyping$1 = new ChatController$subscribeToTyping$1(this);
        l04 H = C.G(new z84() { // from class: y01
            @Override // defpackage.z84
            public final Object apply(Object obj) {
                ConsultTyping subscribeToTyping$lambda$28;
                subscribeToTyping$lambda$28 = ChatController.subscribeToTyping$lambda$28(Function1.this, obj);
                return subscribeToTyping$lambda$28;
            }
        }).H(ti.c());
        final ChatController$subscribeToTyping$2 chatController$subscribeToTyping$2 = new ChatController$subscribeToTyping$2(this);
        wr1 wr1Var = new wr1() { // from class: z01
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToTyping$lambda$29(Function1.this, obj);
            }
        };
        final ChatController$subscribeToTyping$3 chatController$subscribeToTyping$3 = ChatController$subscribeToTyping$3.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: fy0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToTyping$lambda$30(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToT… error) }\n        )\n    }");
        subscribe(P);
    }

    public static final ConsultTyping subscribeToTyping$lambda$28(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        return (ConsultTyping) function1.invoke(obj);
    }

    public static final void subscribeToTyping$lambda$29(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToTyping$lambda$30(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final void subscribeToUpdateAttachments() {
        l04 H = l04.C(getChatUpdateProcessor().getUpdateAttachmentsProcessor()).H(ti.c());
        final ChatController$subscribeToUpdateAttachments$1 chatController$subscribeToUpdateAttachments$1 = new ChatController$subscribeToUpdateAttachments$1(this);
        wr1 wr1Var = new wr1() { // from class: lz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToUpdateAttachments$lambda$40(Function1.this, obj);
            }
        };
        final ChatController$subscribeToUpdateAttachments$2 chatController$subscribeToUpdateAttachments$2 = ChatController$subscribeToUpdateAttachments$2.INSTANCE;
        z33 P = H.P(wr1Var, new wr1() { // from class: wz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.subscribeToUpdateAttachments$lambda$41(Function1.this, obj);
            }
        });
        z65.g(P, "private fun subscribeToU…rror(e) }\n        )\n    }");
        subscribe(P);
    }

    public static final void subscribeToUpdateAttachments$lambda$40(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void subscribeToUpdateAttachments$lambda$41(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    public final boolean updateAttachmentSettings(ContentAttachmentSettings contentAttachmentSettings) {
        AttachmentSettings content;
        if (contentAttachmentSettings != null && (content = contentAttachmentSettings.getContent()) != null) {
            FileHelper.INSTANCE.subscribeToAttachments();
            getChatUpdateProcessor().postAttachmentSettings(content);
            return true;
        }
        return false;
    }

    public final void updateSchedule(ContentScheduleInfoContent contentScheduleInfoContent) {
        ScheduleInfo scheduleInfo;
        QuickReplyItem quickReplyItem;
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        ChatFragment chatFragment3;
        ChatFragment chatFragment4;
        ChatFragment chatFragment5;
        ChatFragment chatFragment6;
        if (contentScheduleInfoContent != null) {
            ContentScheduleInfo content = contentScheduleInfoContent.getContent();
            QuickReplyItem quickReplyItem2 = null;
            if (content != null) {
                scheduleInfo = content.getContent();
            } else {
                scheduleInfo = null;
            }
            if (scheduleInfo != null) {
                this.currentScheduleInfo = scheduleInfo;
                scheduleInfo.calculateServerTimeDiff();
                refreshUserInputState$default(this, null, 1, null);
                if (!isChatWorking$threads_release()) {
                    getConsultWriter().setSearchingConsult(false);
                    WeakReference<ChatFragment> weakReference2 = this.fragment;
                    if (weakReference2 != null && (chatFragment6 = weakReference2.get()) != null) {
                        chatFragment6.removeSearching();
                    }
                    WeakReference<ChatFragment> weakReference3 = this.fragment;
                    if (weakReference3 != null && (chatFragment5 = weakReference3.get()) != null) {
                        chatFragment5.setTitleStateDefault();
                    }
                    hideQuickReplies$threads_release();
                } else {
                    WeakReference<ChatFragment> weakReference4 = this.fragment;
                    if (weakReference4 != null && (chatFragment3 = weakReference4.get()) != null) {
                        quickReplyItem = chatFragment3.getQuickReplyItem();
                    } else {
                        quickReplyItem = null;
                    }
                    if (quickReplyItem != null && (weakReference = this.fragment) != null && (chatFragment = weakReference.get()) != null) {
                        WeakReference<ChatFragment> weakReference5 = this.fragment;
                        if (weakReference5 != null && (chatFragment2 = weakReference5.get()) != null) {
                            quickReplyItem2 = chatFragment2.getQuickReplyItem();
                        }
                        chatFragment.showQuickReplies(quickReplyItem2);
                    }
                }
                ScheduleInfo scheduleInfo2 = this.currentScheduleInfo;
                if (scheduleInfo2 != null) {
                    scheduleInfo2.setTimeStamp(System.currentTimeMillis());
                }
                WeakReference<ChatFragment> weakReference6 = this.fragment;
                if (weakReference6 != null && (chatFragment4 = weakReference6.get()) != null) {
                    chatFragment4.addChatItem(this.currentScheduleInfo);
                }
            }
        }
    }

    public final boolean updateSettings(SettingsResponse settingsResponse) {
        String str;
        ChatFragment chatFragment;
        if (settingsResponse != null) {
            Integer typingMessagesIntervalSeconds = settingsResponse.getTypingMessagesIntervalSeconds();
            if (typingMessagesIntervalSeconds != null) {
                Preferences preferences = getPreferences();
                String typing_messages_interval_seconds = PreferencesCoreKeys.INSTANCE.getTYPING_MESSAGES_INTERVAL_SECONDS();
                if (typingMessagesIntervalSeconds instanceof String) {
                    str = (String) typingMessagesIntervalSeconds;
                } else {
                    str = new Gson().t(typingMessagesIntervalSeconds).toString();
                }
                Preferences.Companion.savePreferenceToRam(typing_messages_interval_seconds, str);
                sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, typing_messages_interval_seconds, str, null), 3, null);
                WeakReference<ChatFragment> weakReference = this.fragment;
                if (weakReference != null && (chatFragment = weakReference.get()) != null) {
                    chatFragment.configureUserTypingSubscription();
                }
            }
            String clientNotificationDisplayType = settingsResponse.getClientNotificationDisplayType();
            if (clientNotificationDisplayType != null && clientNotificationDisplayType.length() != 0) {
                ClientNotificationDisplayType fromString = ClientNotificationDisplayType.Companion.fromString(clientNotificationDisplayType);
                Preferences preferences2 = getPreferences();
                String client_notification_display_type = PreferencesUiKeys.INSTANCE.getCLIENT_NOTIFICATION_DISPLAY_TYPE();
                String name = fromString.name();
                if (name == null) {
                    name = null;
                }
                Preferences.Companion.savePreferenceToRam(client_notification_display_type, name);
                sh0.d(preferences2.getCoroutineScope(), null, null, new Preferences$save$1(preferences2, client_notification_display_type, name, null), 3, null);
                getChatUpdateProcessor().postClientNotificationDisplayType(fromString);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void bindFragment$threads_release(ChatFragment chatFragment) {
        ChatFragment chatFragment2;
        d activity;
        ChatFragment chatFragment3;
        ChatFragment chatFragment4;
        ChatFragment chatFragment5;
        ChatFragment chatFragment6;
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment7;
        ChatFragment chatFragment8;
        WeakReference<ChatFragment> weakReference2 = new WeakReference<>(chatFragment);
        this.fragment = weakReference2;
        LoggerEdna.info("bindFragment: " + weakReference2.get());
        WeakReference<ChatFragment> weakReference3 = this.fragment;
        if (weakReference3 != null && (chatFragment2 = weakReference3.get()) != null && (activity = chatFragment2.getActivity()) != null) {
            if (getDemoModeProvider().isDemoModeEnabled()) {
                getDatabase().cleanDatabase();
            }
            WeakReference<ChatFragment> weakReference4 = this.fragment;
            if (weakReference4 != null && (chatFragment8 = weakReference4.get()) != null) {
                chatFragment8.showProgressBar();
            }
            if (getConsultWriter().isSearchingConsult() && (weakReference = this.fragment) != null && (chatFragment7 = weakReference.get()) != null) {
                chatFragment7.setStateSearchingConsult();
            }
            bma h = bma.f(new Callable() { // from class: ey0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List bindFragment$lambda$7;
                    bindFragment$lambda$7 = ChatController.bindFragment$lambda$7(ChatController.this);
                    return bindFragment$lambda$7;
                }
            }).k(dw9.b()).h(ti.c());
            final ChatController$bindFragment$2 chatController$bindFragment$2 = new ChatController$bindFragment$2(this);
            wr1 wr1Var = new wr1() { // from class: py0
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatController.bindFragment$lambda$8(Function1.this, obj);
                }
            };
            final ChatController$bindFragment$3 chatController$bindFragment$3 = ChatController$bindFragment$3.INSTANCE;
            z33 i = h.i(wr1Var, new wr1() { // from class: az0
                @Override // defpackage.wr1
                public final void accept(Object obj) {
                    ChatController.bindFragment$lambda$9(Function1.this, obj);
                }
            });
            z65.g(i, "internal fun bindFragmen…ibeToDisableInput()\n    }");
            subscribe(i);
            if (getConsultWriter().isConsultConnected()) {
                WeakReference<ChatFragment> weakReference5 = this.fragment;
                if (weakReference5 != null && (chatFragment6 = weakReference5.get()) != null) {
                    chatFragment6.setStateConsultConnected(getConsultWriter().getCurrentConsultInfo());
                }
            } else if (getConsultWriter().isSearchingConsult()) {
                WeakReference<ChatFragment> weakReference6 = this.fragment;
                if (weakReference6 != null && (chatFragment4 = weakReference6.get()) != null) {
                    chatFragment4.setStateSearchingConsult();
                }
            } else {
                WeakReference<ChatFragment> weakReference7 = this.fragment;
                if (weakReference7 != null && (chatFragment3 = weakReference7.get()) != null) {
                    chatFragment3.setTitleStateDefault();
                }
            }
            WeakReference<ChatFragment> weakReference8 = this.fragment;
            if (weakReference8 != null) {
                chatFragment5 = weakReference8.get();
            } else {
                chatFragment5 = null;
            }
            this.progressReceiver = new ProgressReceiver(chatFragment5);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ProgressReceiver.PROGRESS_BROADCAST);
            intentFilter.addAction(ProgressReceiver.DOWNLOADED_SUCCESSFULLY_BROADCAST);
            intentFilter.addAction(ProgressReceiver.DOWNLOAD_ERROR_BROADCAST);
            ProgressReceiver progressReceiver = this.progressReceiver;
            if (progressReceiver != null) {
                cs5.b(activity).c(progressReceiver, intentFilter);
            }
            subscribeToDisableInput();
        }
    }

    public final void cleanAll$threads_release(boolean z) {
        ChatFragment chatFragment;
        LoggerEdna.info("cleanAll!");
        this.isAllMessagesDownloaded = false;
        this.messenger.clearSendQueue();
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null) {
            chatFragment.cleanChat();
        }
        setThreadId(-1L);
        getConsultWriter().setCurrentConsultLeft();
        getConsultWriter().setSearchingConsult(false);
        removePushNotification();
        getClientUseCase().cleanUserInfoFromRam();
        clearPreferences(z);
        UnreadMessagesController.INSTANCE.refreshUnreadMessagesCount();
        this.localUserMessages.clear();
        getDatabase().cleanDatabase();
    }

    public final void clearUnreadPushCount$threads_release() {
        String str;
        Preferences preferences = getPreferences();
        String unread_push_count = PreferencesCoreKeys.INSTANCE.getUNREAD_PUSH_COUNT();
        int i = 0;
        if (i instanceof String) {
            str = (String) 0;
        } else {
            str = new Gson().t(0).toString();
        }
        Preferences.Companion.savePreferenceToRam(unread_push_count, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, unread_push_count, str, null), 3, null);
    }

    public final bma<List<ChatItem>> downloadMessagesTillEnd$threads_release() {
        return this.messenger.downloadMessagesTillEnd();
    }

    public final void forceResend$threads_release(UserPhrase userPhrase) {
        if (isScheduleActive(this.currentScheduleInfo) && userPhrase != null) {
            this.messenger.forceResend(userPhrase);
        }
    }

    public final CampaignMessage getCampaignMessage() {
        boolean O;
        Object l;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String campaign_message = PreferencesCoreKeys.INSTANCE.getCAMPAIGN_MESSAGE();
        Type type = new TypeToken<CampaignMessage>() { // from class: im.threads.ui.controllers.ChatController$special$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(campaign_message);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(campaign_message, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(campaign_message, preferenceFromRam);
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(preferenceFromRam, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(preferenceFromRam, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(preferenceFromRam, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 != null) {
                            l = (CampaignMessage) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type im.threads.business.models.CampaignMessage");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    l = (CampaignMessage) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type im.threads.business.models.CampaignMessage");
                }
            } else {
                l = new Gson().l(preferenceFromRam, type);
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(l, "null")) {
                obj = l;
            }
        } catch (Exception unused) {
        }
        return (CampaignMessage) obj;
    }

    public final ChatItem getChatItemByCorrelationIdFromDb$threads_release(String str) {
        z65.h(str, "id");
        return getDatabase().getChatItemByCorrelationId(str);
    }

    public final ConsultInfo getCurrentConsultInfo() {
        return getConsultWriter().getCurrentConsultInfo();
    }

    public final FileDescription getFileDescriptionDraft() {
        boolean O;
        Object l;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String file_description_draft = PreferencesCoreKeys.INSTANCE.getFILE_DESCRIPTION_DRAFT();
        Type type = new TypeToken<FileDescription>() { // from class: im.threads.ui.controllers.ChatController$special$$inlined$get$default$2
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(file_description_draft);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(file_description_draft, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(file_description_draft, preferenceFromRam);
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(preferenceFromRam, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(preferenceFromRam, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(preferenceFromRam, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 != null) {
                            l = (FileDescription) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type im.threads.business.models.FileDescription");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    l = (FileDescription) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type im.threads.business.models.FileDescription");
                }
            } else {
                l = new Gson().l(preferenceFromRam, type);
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(l, "null")) {
                obj = l;
            }
        } catch (Exception unused) {
        }
        return (FileDescription) obj;
    }

    public final String getFirstUnreadUuidId() {
        return this.firstUnreadUuidId;
    }

    public final ks8<Long> getMessageErrorProcessor() {
        return this.messageErrorProcessor;
    }

    public final int getStateOfConsult() {
        if (getConsultWriter().isSearchingConsult()) {
            return 2;
        }
        if (getConsultWriter().isConsultConnected()) {
            return 1;
        }
        return 3;
    }

    public final Long getThreadId() {
        boolean O;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = getPreferences();
        String thread_id = PreferencesCoreKeys.INSTANCE.getTHREAD_ID();
        Object obj = 0L;
        Type type = new TypeToken<Long>() { // from class: im.threads.ui.controllers.ChatController$special$$inlined$get$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(thread_id);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(thread_id, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(thread_id, preferenceFromRam);
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(preferenceFromRam, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(preferenceFromRam, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(preferenceFromRam, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 != null) {
                            obj = (Long) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    obj = (Long) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
            } else {
                Object l = new Gson().l(preferenceFromRam, type);
                if (l != null) {
                    obj = l;
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (Long) obj2;
    }

    public final int getUnreadMessagesCount$threads_release() {
        return getDatabase().getUnreadMessagesCount();
    }

    public final void hideQuickReplies$threads_release() {
        getChatUpdateProcessor().postQuickRepliesChanged(new QuickReplyItem(new ArrayList(), 0L));
    }

    public final boolean isAllMessagesDownloaded$threads_release() {
        return this.isAllMessagesDownloaded;
    }

    public final boolean isChatReady$threads_release() {
        return getChatState().isChatReady();
    }

    public final boolean isChatWorking$threads_release() {
        ScheduleInfo scheduleInfo = this.currentScheduleInfo;
        if (scheduleInfo == null) {
            return true;
        }
        if (scheduleInfo != null && scheduleInfo.isChatWorking()) {
            return true;
        }
        return false;
    }

    public final boolean isConsultFound() {
        if (isChatWorking$threads_release() && getConsultWriter().isConsultConnected()) {
            return true;
        }
        return false;
    }

    public final boolean isInputDisabled() {
        return this.isInputDisabled;
    }

    public final boolean isMessageSent$threads_release(String str) {
        Object obj;
        Iterator<T> it = getDatabase().getNotDeliveredChatItems().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((UserPhrase) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public final boolean isNeedToShowWelcome() {
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment;
        if (getDatabase().getMessagesCount() == 0 && (weakReference = this.fragment) != null && (chatFragment = weakReference.get()) != null && chatFragment.getDisplayedMessagesCount$threads_release() == 0 && isChatReady$threads_release() && !this.isDownloadingMessages) {
            return true;
        }
        return false;
    }

    public final boolean isSendDuringInactive$threads_release() {
        ScheduleInfo scheduleInfo = this.currentScheduleInfo;
        if (scheduleInfo == null || !scheduleInfo.getSendDuringInactive()) {
            return false;
        }
        return true;
    }

    public final synchronized void loadHistory$threads_release(final Long l, final Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super List<? extends ChatItem>, Boolean> function1, HistoryLoader.HistoryLoadingCallback historyLoadingCallback) {
        if (!z2) {
            if (this.isAllMessagesDownloaded) {
                sh0.d(this.coroutineScope, null, null, new ChatController$loadHistory$1(this, null), 3, null);
                return;
            }
        }
        if (!getChatState().isChatReady() && !z4) {
            return;
        }
        synchronized (this) {
            if (!this.isDownloadingMessages) {
                this.isDownloadingMessages = true;
                bma h = bma.f(new Callable() { // from class: wy0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Pair loadHistory$lambda$21$lambda$18;
                        loadHistory$lambda$21$lambda$18 = ChatController.loadHistory$lambda$21$lambda$18(bool, l, this);
                        return loadHistory$lambda$21$lambda$18;
                    }
                }).k(dw9.b()).h(ti.c());
                final ChatController$loadHistory$2$2 chatController$loadHistory$2$2 = new ChatController$loadHistory$2$2(this, function1, z, z3, bool, historyLoadingCallback);
                wr1 wr1Var = new wr1() { // from class: xy0
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ChatController.loadHistory$lambda$21$lambda$19(Function1.this, obj);
                    }
                };
                final ChatController$loadHistory$2$3 chatController$loadHistory$2$3 = new ChatController$loadHistory$2$3(this);
                z33 i = h.i(wr1Var, new wr1() { // from class: yy0
                    @Override // defpackage.wr1
                    public final void accept(Object obj) {
                        ChatController.loadHistory$lambda$21$lambda$20(Function1.this, obj);
                    }
                });
                z65.g(i, "@Synchronized\n    intern…        }\n        }\n    }");
                subscribe(i);
            } else {
                LoggerEdna.info(ThreadsApi.REST_TAG, "Loading history cancelled. isDownloadingMessages = true");
                Unit unit = Unit.a;
            }
        }
    }

    public final void loadHistoryAfterWithLastMessageCheck$threads_release(boolean z, boolean z2, boolean z3, HistoryLoader.HistoryLoadingCallback historyLoadingCallback) {
        sh0.d(this.coroutineScope, null, null, new ChatController$loadHistoryAfterWithLastMessageCheck$1(this, z, z3, historyLoadingCallback, z2, null), 3, null);
    }

    public final void onConsultChoose$threads_release(Activity activity, String str) {
        if (str == null) {
            LoggerEdna.warning("Can't show consult info: consultId == null");
            return;
        }
        ConsultInfo consultInfo = getDatabase().getConsultInfo(str);
        if (consultInfo != null) {
            ConsultActivity.Companion.startActivity(activity, consultInfo);
        } else {
            ConsultActivity.Companion.startActivity(activity);
        }
    }

    public final void onFileClick$threads_release(FileDescription fileDescription) {
        ChatFragment chatFragment;
        d dVar;
        ChatFragment chatFragment2;
        ChatFragment chatFragment3;
        ChatFragment chatFragment4;
        ChatFragment chatFragment5;
        z65.h(fileDescription, "fileDescription");
        LoggerEdna.info("onFileClick " + fileDescription);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null && chatFragment.isAdded()) {
            WeakReference<ChatFragment> weakReference2 = this.fragment;
            if (weakReference2 != null && (chatFragment5 = weakReference2.get()) != null) {
                dVar = chatFragment5.getActivity();
            } else {
                dVar = null;
            }
            d dVar2 = dVar;
            if (dVar2 != null) {
                if (fileDescription.getFileUri() == null) {
                    FileDownloadWorker.Companion.startDownload$default(FileDownloadWorker.Companion, dVar2, fileDescription, false, false, 12, null);
                } else if (FileUtils.isImage(fileDescription)) {
                    WeakReference<ChatFragment> weakReference3 = this.fragment;
                    if (weakReference3 != null && (chatFragment4 = weakReference3.get()) != null) {
                        chatFragment4.setupStartSecondLevelScreen();
                    }
                    dVar2.startActivity(ImagesActivity.Companion.getStartIntent(dVar2, fileDescription));
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fileDescription.getFileUri(), FileUtils.getMimeType(fileDescription));
                    intent.setFlags(1073741825);
                    try {
                        WeakReference<ChatFragment> weakReference4 = this.fragment;
                        if (weakReference4 != null && (chatFragment3 = weakReference4.get()) != null) {
                            chatFragment3.setupStartSecondLevelScreen();
                        }
                        dVar2.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        WeakReference<ChatFragment> weakReference5 = this.fragment;
                        if (weakReference5 != null && (chatFragment2 = weakReference5.get()) != null) {
                            chatFragment2.showBalloon("No application support this type of file");
                        }
                    }
                }
            }
        }
    }

    public final void onFileDownloadRequest$threads_release(FileDescription fileDescription, boolean z) {
        ChatFragment chatFragment;
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment2;
        d activity;
        WeakReference<ChatFragment> weakReference2 = this.fragment;
        if (weakReference2 != null && (chatFragment = weakReference2.get()) != null && chatFragment.isAdded() && (weakReference = this.fragment) != null && (chatFragment2 = weakReference.get()) != null && (activity = chatFragment2.getActivity()) != null && fileDescription != null) {
            FileDownloadWorker.Companion.startDownload(activity, fileDescription, true, z);
        }
    }

    public final void onRatingClick$threads_release(Survey survey) {
        z65.h(survey, "survey");
        if (!this.surveyCompletionInProgress) {
            this.surveyCompletionInProgress = true;
            subscribeToSurveyCompletion();
        }
        this.surveyCompletionProcessor.d(survey);
    }

    public final void onResolveThreadClick$threads_release(boolean z) {
        BaseConfig.Companion.getInstance().transport.sendResolveThread(z);
    }

    public final void onRetryInitChatClick$threads_release() {
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        getChatState().stopTimeoutObserver$threads_release();
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment2 = weakReference.get()) != null) {
            ChatFragment.hideErrorView$threads_release$default(chatFragment2, false, 1, null);
        }
        WeakReference<ChatFragment> weakReference2 = this.fragment;
        if (weakReference2 != null && (chatFragment = weakReference2.get()) != null) {
            chatFragment.showProgressBar();
        }
        Preferences preferences = getPreferences();
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Preferences.Companion.savePreferenceToRam(device_address, null);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, device_address, null, null), 3, null);
        this.transport.closeWebSocket();
        this.transport.sendRegisterDevice(false);
    }

    public final void onSearchResultsClick$threads_release(final String str, String str2) {
        List<ChatItem> list;
        ChatFragment chatFragment;
        ChatFragment chatFragment2;
        ChatFragment chatFragment3;
        z65.h(str, MessageAttributes.UUID);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment3 = weakReference.get()) != null) {
            list = chatFragment3.getElements();
        } else {
            list = null;
        }
        int itemPositionByUuid = getItemPositionByUuid(list, str);
        if (itemPositionByUuid >= 0) {
            WeakReference<ChatFragment> weakReference2 = this.fragment;
            if (weakReference2 != null && (chatFragment2 = weakReference2.get()) != null) {
                chatFragment2.scrollToPosition$threads_release(itemPositionByUuid, true);
                return;
            }
            return;
        }
        WeakReference<ChatFragment> weakReference3 = this.fragment;
        if (weakReference3 != null && (chatFragment = weakReference3.get()) != null) {
            chatFragment.showBalloon$threads_release(R.string.ecc_history_loading_message);
        }
        long messageTimestampFromDateString = DateHelper.INSTANCE.getMessageTimestampFromDateString(str2);
        loadHistory$threads_release$default(this, Long.valueOf(1 + messageTimestampFromDateString), null, false, false, false, false, new ChatController$onSearchResultsClick$1(messageTimestampFromDateString, this, str), new HistoryLoader.HistoryLoadingCallback() { // from class: im.threads.ui.controllers.ChatController$onSearchResultsClick$2
            @Override // im.threads.business.transport.HistoryLoader.HistoryLoadingCallback
            public void onLoaded(List<? extends ChatItem> list2) {
                qx1 qx1Var;
                z65.h(list2, "items");
                qx1Var = ChatController.this.coroutineScope;
                sh0.d(qx1Var, v33.c(), null, new ChatController$onSearchResultsClick$2$onLoaded$1(ChatController.this, str, null), 2, null);
            }
        }, 62, null);
    }

    public final void onUserInput$threads_release(UpcomingUserMessage upcomingUserMessage) {
        z65.h(upcomingUserMessage, "upcomingUserMessage");
        removeResolveRequest();
        removeActiveSurvey();
        UserPhrase convert = convert(upcomingUserMessage);
        if (convert.getFileDescription() != null) {
            this.localUserMessages.add(convert);
        }
        addMessage(convert);
        this.messenger.queueMessageSending(convert);
    }

    public final void onUserTyping$threads_release(String str) {
        if (str != null && isChatReady$threads_release()) {
            BaseConfig.Companion.getInstance().transport.sendUserTying(str);
        }
    }

    public final void onViewDestroy() {
        this.messenger.onViewDestroy();
    }

    public final void onViewStart() {
        checkStateOnViewStart();
        this.messenger.onViewStart();
        checkEmptyStateVisibility();
    }

    public final void onViewStop() {
        this.isAllMessagesDownloaded = false;
        this.messenger.onViewStop();
    }

    public final void removeCorruptedFiles$threads_release(List<? extends ChatItem> list, Function0<Unit> function0) {
        z65.h(list, StatisticManager.LIST);
        sh0.d(this.coroutineScope, v33.b(), null, new ChatController$removeCorruptedFiles$1(list, function0, null), 2, null);
    }

    public final void removeUserPhraseFromDatabaseAsync$threads_release(UserPhrase userPhrase) {
        z65.h(userPhrase, "userPhrase");
        sh0.d(this.coroutineScope, v33.b(), null, new ChatController$removeUserPhraseFromDatabaseAsync$1(this, userPhrase, null), 2, null);
    }

    public final void setActivityIsForeground$threads_release(boolean z) {
        WeakReference<ChatFragment> weakReference;
        ChatFragment chatFragment;
        String str;
        LoggerEdna.info("setActivityIsForeground");
        this.isActive = z;
        if (z && (weakReference = this.fragment) != null && (chatFragment = weakReference.get()) != null && chatFragment.isAdded()) {
            Object systemService = getAppContext().getSystemService("connectivity");
            z65.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (connectivityManager.getActiveNetworkInfo() != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                z65.e(activeNetworkInfo);
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    List<String> unreadMessagesUuid = getDatabase().getUnreadMessagesUuid();
                    if (true ^ unreadMessagesUuid.isEmpty()) {
                        BaseConfig.Companion.getInstance().transport.markMessagesAsRead(unreadMessagesUuid);
                        str = unreadMessagesUuid.get(0);
                    } else {
                        str = null;
                    }
                    this.firstUnreadUuidId = str;
                }
            }
        }
        r57<Long> v = r57.v(1500L, TimeUnit.MILLISECONDS);
        final ChatController$setActivityIsForeground$1 chatController$setActivityIsForeground$1 = new ChatController$setActivityIsForeground$1(this);
        r57<Long> m = v.k(new oh8() { // from class: jy0
            @Override // defpackage.oh8
            public final boolean b(Object obj) {
                boolean activityIsForeground$lambda$0;
                activityIsForeground$lambda$0 = ChatController.setActivityIsForeground$lambda$0(Function1.this, obj);
                return activityIsForeground$lambda$0;
            }
        }).m(ti.c());
        final ChatController$setActivityIsForeground$2 chatController$setActivityIsForeground$2 = new ChatController$setActivityIsForeground$2(this);
        wr1<? super Long> wr1Var = new wr1() { // from class: ky0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.setActivityIsForeground$lambda$1(Function1.this, obj);
            }
        };
        final ChatController$setActivityIsForeground$3 chatController$setActivityIsForeground$3 = ChatController$setActivityIsForeground$3.INSTANCE;
        z33 p = m.p(wr1Var, new wr1() { // from class: ly0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.setActivityIsForeground$lambda$2(Function1.this, obj);
            }
        });
        z65.g(p, "internal fun setActivity…message }\n        )\n    }");
        subscribe(p);
    }

    public final void setAllMessagesDownloaded$threads_release(boolean z) {
        this.isAllMessagesDownloaded = z;
    }

    public final void setAllMessagesWereRead$threads_release() {
        ChatFragment chatFragment;
        removePushNotification();
        sk1 allConsultMessagesWereRead = getDatabase().setAllConsultMessagesWereRead();
        t4 t4Var = new t4() { // from class: iz0
            @Override // defpackage.t4
            public final void run() {
                ChatController.setAllMessagesWereRead$lambda$15();
            }
        };
        final ChatController$setAllMessagesWereRead$2 chatController$setAllMessagesWereRead$2 = ChatController$setAllMessagesWereRead$2.INSTANCE;
        z33 e = allConsultMessagesWereRead.e(t4Var, new wr1() { // from class: jz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.setAllMessagesWereRead$lambda$16(Function1.this, obj);
            }
        });
        z65.g(e, "database.setAllConsultMe…gesWereRead() \", error) }");
        subscribe(e);
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null) {
            chatFragment.setAllMessagesWereRead();
        }
    }

    public final void setCampaignMessage(CampaignMessage campaignMessage) {
        String str;
        Preferences preferences = getPreferences();
        String campaign_message = PreferencesCoreKeys.INSTANCE.getCAMPAIGN_MESSAGE();
        if (campaignMessage == null) {
            str = null;
        } else if (campaignMessage instanceof String) {
            str = (String) campaignMessage;
        } else {
            str = new Gson().t(campaignMessage).toString();
        }
        Preferences.Companion.savePreferenceToRam(campaign_message, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, campaign_message, str, null), 3, null);
    }

    public final void setFileDescriptionDraft(FileDescription fileDescription) {
        String str;
        Preferences preferences = getPreferences();
        String file_description_draft = PreferencesCoreKeys.INSTANCE.getFILE_DESCRIPTION_DRAFT();
        if (fileDescription == null) {
            str = null;
        } else if (fileDescription instanceof String) {
            str = (String) fileDescription;
        } else {
            str = new Gson().t(fileDescription).toString();
        }
        Preferences.Companion.savePreferenceToRam(file_description_draft, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, file_description_draft, str, null), 3, null);
    }

    public final void setFormattedDurations$threads_release(List<? extends ChatItem> list, MediaMetadataRetriever mediaMetadataRetriever, Function0<Unit> function0) {
        z65.h(mediaMetadataRetriever, "mediaMetadataRetriever");
        z65.h(function0, "callback");
        if (list != null) {
            sh0.d(this.coroutineScope, v33.b(), null, new ChatController$setFormattedDurations$1(list, this, mediaMetadataRetriever, function0, null), 2, null);
        } else {
            function0.invoke();
        }
    }

    public final void setMessageAsRead$threads_release(ChatItem chatItem, boolean z) {
        if (chatItem instanceof ConsultPhrase) {
            if (z) {
                sh0.d(this.coroutineScope, v33.b(), null, new ChatController$setMessageAsRead$1(this, chatItem, null), 2, null);
            } else {
                getDatabase().setMessageWasRead(((ConsultPhrase) chatItem).getId());
            }
        }
    }

    public final void setMessagesInCurrentThreadAsReadInDB$threads_release() {
        sk1 allConsultMessagesWereReadInThread = getDatabase().setAllConsultMessagesWereReadInThread(getThreadId());
        t4 t4Var = new t4() { // from class: pz0
            @Override // defpackage.t4
            public final void run() {
                ChatController.setMessagesInCurrentThreadAsReadInDB$lambda$13();
            }
        };
        final ChatController$setMessagesInCurrentThreadAsReadInDB$2 chatController$setMessagesInCurrentThreadAsReadInDB$2 = ChatController$setMessagesInCurrentThreadAsReadInDB$2.INSTANCE;
        z33 e = allConsultMessagesWereReadInThread.e(t4Var, new wr1() { // from class: qz0
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatController.setMessagesInCurrentThreadAsReadInDB$lambda$14(Function1.this, obj);
            }
        });
        z65.g(e, "database.setAllConsultMe…gesWereRead() \", error) }");
        subscribe(e);
    }

    public final void setThreadId(Long l) {
        String str;
        Preferences preferences = getPreferences();
        String thread_id = PreferencesCoreKeys.INSTANCE.getTHREAD_ID();
        if (l == null) {
            str = null;
        } else if (l instanceof String) {
            str = (String) l;
        } else {
            str = new Gson().t(l).toString();
        }
        Preferences.Companion.savePreferenceToRam(thread_id, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, thread_id, str, null), 3, null);
    }

    public final void unbindFragment$threads_release() {
        ChatFragment chatFragment;
        d activity;
        WeakReference<ChatFragment> weakReference = this.fragment;
        if (weakReference != null && (chatFragment = weakReference.get()) != null && (activity = chatFragment.getActivity()) != null && this.progressReceiver != null) {
            cs5 b = cs5.b(activity);
            ProgressReceiver progressReceiver = this.progressReceiver;
            z65.e(progressReceiver);
            b.e(progressReceiver);
        }
        this.fragment = null;
    }

    private ChatController() {
        rn5 b;
        rn5 b2;
        rn5 b3;
        rn5 b4;
        rn5 b5;
        rn5 b6;
        rn5 b7;
        rn5 b8;
        rn5 b9;
        ks8<Long> z = ks8.z();
        z65.g(z, "create<Long>()");
        this.messageErrorProcessor = z;
        b = yn5.b(ChatController$special$$inlined$inject$1.INSTANCE);
        this.chatUpdateProcessor$delegate = b;
        b2 = yn5.b(ChatController$special$$inlined$inject$2.INSTANCE);
        this.database$delegate = b2;
        b3 = yn5.b(ChatController$special$$inlined$inject$3.INSTANCE);
        this.consultWriter$delegate = b3;
        Config.Companion companion = Config.Companion;
        ChatStyle chatStyle = companion.getInstance().getChatStyle();
        this.chatStyle = chatStyle;
        b4 = yn5.b(ChatController$special$$inlined$inject$4.INSTANCE);
        this.appContext$delegate = b4;
        b5 = yn5.b(ChatController$special$$inlined$inject$5.INSTANCE);
        this.preferences$delegate = b5;
        b6 = yn5.b(ChatController$special$$inlined$inject$6.INSTANCE);
        this.historyLoader$delegate = b6;
        b7 = yn5.b(ChatController$special$$inlined$inject$7.INSTANCE);
        this.clientUseCase$delegate = b7;
        b8 = yn5.b(ChatController$special$$inlined$inject$8.INSTANCE);
        this.chatState$delegate = b8;
        b9 = yn5.b(ChatController$special$$inlined$inject$9.INSTANCE);
        this.demoModeProvider$delegate = b9;
        this.transport = companion.getInstance().transport;
        this.coroutineScope = rx1.a(v33.c());
        js8<Survey> e0 = js8.e0();
        z65.g(e0, "create<Survey>()");
        this.surveyCompletionProcessor = e0;
        this.inputEnabledDuringQuickReplies = chatStyle.inputEnabledDuringQuickReplies;
        wn1 wn1Var = new wn1();
        this.compositeDisposable = wn1Var;
        this.messenger = new MessengerImpl(wn1Var, getClientUseCase());
        this.localUserMessages = new ArrayList<>();
        this.attachmentsHistory = new HashMap<>();
        subscribeToChatEvents();
    }

    public static final void removeActiveSurvey$lambda$73() {
    }

    public static final void removeResolveRequest$lambda$71() {
    }
}
