package im.threads.ui.fragments;

import android.content.Context;
import android.os.Build;
import im.threads.R;
import im.threads.business.audio.audioRecorder.AudioRecorder;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.media.ChatCenterAudioConverter;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.business.utils.Balloon;
import im.threads.ui.fragments.ChatFragment;
import im.threads.ui.fragments.ChatFragment$initRecording$1;
import im.threads.ui.views.recordview.VoiceOnRecordListener;
import im.threads.ui.views.recordview.VoiceRecordButton;
import im.threads.ui.views.recordview.VoiceRecordView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"im/threads/ui/fragments/ChatFragment$initRecording$1", "Lim/threads/ui/views/recordview/VoiceOnRecordListener;", "", "startRecorder", "Lsk1;", "releaseRecorder", "onStart", "onCancel", "", "recordTime", "", "limitReached", "onFinish", "onLessThanSecond", "onLock", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatFragment$initRecording$1 implements VoiceOnRecordListener {
    final /* synthetic */ VoiceRecordButton $recordButton;
    final /* synthetic */ VoiceRecordView $recordView;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatFragment$initRecording$1(ChatFragment chatFragment, VoiceRecordView voiceRecordView, VoiceRecordButton voiceRecordButton) {
        this.this$0 = chatFragment;
        this.$recordView = voiceRecordView;
        this.$recordButton = voiceRecordButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCancel$lambda$1(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFinish$lambda$3(ChatFragment chatFragment) {
        AudioRecorder audioRecorder;
        Unit unit;
        ChatCenterAudioConverter chatCenterAudioConverter;
        z65.h(chatFragment, "this$0");
        audioRecorder = chatFragment.recorder;
        if (audioRecorder != null) {
            if (chatFragment.isResumed()) {
                File file = new File(audioRecorder.getVoiceFilePath());
                if (Build.VERSION.SDK_INT >= 29) {
                    chatFragment.addVoiceMessagePreview(file);
                } else {
                    chatCenterAudioConverter = chatFragment.audioConverter;
                    chatCenterAudioConverter.convertToWav(file, chatFragment);
                }
            }
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            LoggerEdna.error("error finishing voice message recording");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFinish$lambda$4(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLessThanSecond$lambda$6(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    private final sk1 releaseRecorder() {
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.this$0.fdMediaPlayer;
        if (fileDescriptionMediaPlayer != null) {
            fileDescriptionMediaPlayer.abandonAudioFocus();
        }
        final ChatFragment chatFragment = this.this$0;
        sk1 b = sk1.b(new t4() { // from class: p21
            @Override // defpackage.t4
            public final void run() {
                ChatFragment$initRecording$1.releaseRecorder$lambda$12(ChatFragment$initRecording$1.this, chatFragment);
            }
        });
        z65.g(b, "fromAction {\n           …      }\n                }");
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseRecorder$lambda$12(ChatFragment$initRecording$1 chatFragment$initRecording$1, ChatFragment chatFragment) {
        AudioRecorder audioRecorder;
        z65.h(chatFragment$initRecording$1, "this$0");
        z65.h(chatFragment, "this$1");
        synchronized (chatFragment$initRecording$1) {
            try {
                audioRecorder = chatFragment.recorder;
                if (audioRecorder != null) {
                    audioRecorder.stop();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void startRecorder() {
        final ChatFragment chatFragment = this.this$0;
        sk1 g = sk1.b(new t4() { // from class: s21
            @Override // defpackage.t4
            public final void run() {
                ChatFragment$initRecording$1.startRecorder$lambda$8(ChatFragment$initRecording$1.this, chatFragment);
            }
        }).g(dw9.b());
        t4 t4Var = new t4() { // from class: t21
            @Override // defpackage.t4
            public final void run() {
                ChatFragment$initRecording$1.startRecorder$lambda$9();
            }
        };
        final ChatFragment$initRecording$1$startRecorder$3 chatFragment$initRecording$1$startRecorder$3 = ChatFragment$initRecording$1$startRecorder$3.INSTANCE;
        chatFragment.subscribe(g.e(t4Var, new wr1() { // from class: u21
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment$initRecording$1.startRecorder$lambda$10(Function1.this, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecorder$lambda$10(Function1 function1, Object obj) {
        z65.h(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecorder$lambda$8(ChatFragment$initRecording$1 chatFragment$initRecording$1, ChatFragment chatFragment) {
        AudioRecorder audioRecorder;
        AudioRecorder audioRecorder2;
        SimpleDateFormat simpleDateFormat;
        z65.h(chatFragment$initRecording$1, "this$0");
        z65.h(chatFragment, "this$1");
        synchronized (chatFragment$initRecording$1) {
            try {
                Context context = chatFragment.getContext();
                if (context == null) {
                    return;
                }
                z65.g(context, "context ?: return@fromAction");
                chatFragment.recorder = new AudioRecorder(context);
                audioRecorder = chatFragment.recorder;
                if (audioRecorder != null) {
                    simpleDateFormat = chatFragment.fileNameDateFormat;
                    audioRecorder.prepareWithDefaultConfig(simpleDateFormat);
                }
                audioRecorder2 = chatFragment.recorder;
                if (audioRecorder2 != null) {
                    audioRecorder2.start();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // im.threads.ui.views.recordview.VoiceOnRecordListener
    public void onCancel() {
        Date date = new Date();
        LoggerEdna.debug("RecordView: onCancel");
        ChatFragment chatFragment = this.this$0;
        sk1 g = releaseRecorder().g(dw9.b());
        t4 t4Var = new t4() { // from class: q21
            @Override // defpackage.t4
            public final void run() {
                ChatFragment$initRecording$1.onCancel$lambda$0();
            }
        };
        final ChatFragment$initRecording$1$onCancel$2 chatFragment$initRecording$1$onCancel$2 = ChatFragment$initRecording$1$onCancel$2.INSTANCE;
        chatFragment.subscribe(g.e(t4Var, new wr1() { // from class: r21
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment$initRecording$1.onCancel$lambda$1(Function1.this, obj);
            }
        }));
        VoiceRecordButton voiceRecordButton = this.$recordButton;
        if (voiceRecordButton != null) {
            voiceRecordButton.performHapticFeedback(1);
        }
        LoggerEdna.info("onStart performance: " + (new Date().getTime() - date.getTime()));
    }

    @Override // im.threads.ui.views.recordview.VoiceOnRecordListener
    public void onFinish(long j, boolean z) {
        Date date = new Date();
        ChatFragment chatFragment = this.this$0;
        sk1 d = releaseRecorder().g(dw9.b()).d(ti.c());
        final ChatFragment chatFragment2 = this.this$0;
        t4 t4Var = new t4() { // from class: v21
            @Override // defpackage.t4
            public final void run() {
                ChatFragment$initRecording$1.onFinish$lambda$3(ChatFragment.this);
            }
        };
        final ChatFragment$initRecording$1$onFinish$2 chatFragment$initRecording$1$onFinish$2 = ChatFragment$initRecording$1$onFinish$2.INSTANCE;
        chatFragment.subscribe(d.e(t4Var, new wr1() { // from class: w21
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment$initRecording$1.onFinish$lambda$4(Function1.this, obj);
            }
        }));
        this.$recordView.setVisibility(4);
        LoggerEdna.debug("RecordView: onFinish");
        LoggerEdna.debug("RecordTime: " + j);
        VoiceRecordButton voiceRecordButton = this.$recordButton;
        if (voiceRecordButton != null) {
            voiceRecordButton.performHapticFeedback(1);
        }
        LoggerEdna.info("onFinish performance: " + (new Date().getTime() - date.getTime()));
    }

    @Override // im.threads.ui.views.recordview.VoiceOnRecordListener
    public void onLessThanSecond() {
        this.$recordView.setVisibility(4);
        ChatFragment chatFragment = this.this$0;
        sk1 g = releaseRecorder().g(dw9.b());
        t4 t4Var = new t4() { // from class: x21
            @Override // defpackage.t4
            public final void run() {
                ChatFragment$initRecording$1.onLessThanSecond$lambda$5();
            }
        };
        final ChatFragment$initRecording$1$onLessThanSecond$2 chatFragment$initRecording$1$onLessThanSecond$2 = ChatFragment$initRecording$1$onLessThanSecond$2.INSTANCE;
        chatFragment.subscribe(g.e(t4Var, new wr1() { // from class: y21
            @Override // defpackage.wr1
            public final void accept(Object obj) {
                ChatFragment$initRecording$1.onLessThanSecond$lambda$6(Function1.this, obj);
            }
        }));
        Context requireContext = this.this$0.requireContext();
        z65.g(requireContext, "requireContext()");
        String string = this.this$0.getString(R.string.ecc_hold_button_to_record_audio);
        z65.g(string, "getString(R.string.ecc_h…d_button_to_record_audio)");
        Balloon.show(requireContext, string);
        LoggerEdna.debug("RecordView: onLessThanSecond");
        VoiceRecordButton voiceRecordButton = this.$recordButton;
        if (voiceRecordButton != null) {
            voiceRecordButton.performHapticFeedback(1);
        }
    }

    @Override // im.threads.ui.views.recordview.VoiceOnRecordListener
    public void onStart() {
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer = this.this$0.fdMediaPlayer;
        if (fileDescriptionMediaPlayer != null) {
            fileDescriptionMediaPlayer.reset();
        }
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer2 = this.this$0.fdMediaPlayer;
        if (fileDescriptionMediaPlayer2 != null) {
            fileDescriptionMediaPlayer2.requestAudioFocus();
        }
        this.$recordView.setVisibility(0);
        startRecorder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCancel$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLessThanSecond$lambda$5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecorder$lambda$9() {
    }

    @Override // im.threads.ui.views.recordview.VoiceOnRecordListener
    public void onLock() {
    }
}
