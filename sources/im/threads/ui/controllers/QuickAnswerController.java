package im.threads.ui.controllers;

import androidx.fragment.app.Fragment;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.UpcomingUserMessage;
import im.threads.business.secureDatabase.DatabaseHolder;
import im.threads.business.transport.HistoryLoader;
import im.threads.ui.activities.QuickAnswerActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: QuickAnswerController.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lim/threads/ui/controllers/QuickAnswerController;", "Landroidx/fragment/app/Fragment;", "Lim/threads/ui/activities/QuickAnswerActivity;", "activity", "", "onBind", "onDestroyView", "Lim/threads/business/models/UpcomingUserMessage;", "upcomingUserMessage", "onUserAnswer", "Lim/threads/business/secureDatabase/DatabaseHolder;", "database$delegate", "Lrn5;", "getDatabase", "()Lim/threads/business/secureDatabase/DatabaseHolder;", "database", "Lqx1;", "coroutineScope", "Lqx1;", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class QuickAnswerController extends Fragment {
    public static final Companion Companion = new Companion(null);
    private final qx1 coroutineScope;
    private final rn5 database$delegate;

    public QuickAnswerController() {
        rn5 b;
        b = yn5.b(QuickAnswerController$special$$inlined$inject$1.INSTANCE);
        this.database$delegate = b;
        this.coroutineScope = rx1.a(v33.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DatabaseHolder getDatabase() {
        return (DatabaseHolder) this.database$delegate.getValue();
    }

    public static final QuickAnswerController getInstance() {
        return Companion.getInstance();
    }

    public final void onBind(final QuickAnswerActivity quickAnswerActivity) {
        z65.h(quickAnswerActivity, "activity");
        String simpleName = QuickAnswerController.class.getSimpleName();
        LoggerEdna.info("onBind in " + simpleName);
        ChatController.Companion.getInstance().loadHistoryAfterWithLastMessageCheck$threads_release(false, true, true, new HistoryLoader.HistoryLoadingCallback() { // from class: im.threads.ui.controllers.QuickAnswerController$onBind$1
            @Override // im.threads.business.transport.HistoryLoader.HistoryLoadingCallback
            public void onLoaded(List<? extends ChatItem> list) {
                qx1 qx1Var;
                z65.h(list, "items");
                qx1Var = QuickAnswerController.this.coroutineScope;
                sh0.d(qx1Var, null, null, new QuickAnswerController$onBind$1$onLoaded$1(quickAnswerActivity, QuickAnswerController.this, list, null), 3, null);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        rx1.d(this.coroutineScope, null, 1, null);
    }

    public final void onUserAnswer(UpcomingUserMessage upcomingUserMessage) {
        z65.h(upcomingUserMessage, "upcomingUserMessage");
        LoggerEdna.info("onUserAnswer");
        ChatController companion = ChatController.Companion.getInstance();
        companion.onUserInput$threads_release(upcomingUserMessage);
        companion.setAllMessagesWereRead$threads_release();
    }

    /* compiled from: QuickAnswerController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lim/threads/ui/controllers/QuickAnswerController$Companion;", "", "()V", "instance", "Lim/threads/ui/controllers/QuickAnswerController;", "getInstance$annotations", "getInstance", "()Lim/threads/ui/controllers/QuickAnswerController;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final QuickAnswerController getInstance() {
            return new QuickAnswerController();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }
    }
}
