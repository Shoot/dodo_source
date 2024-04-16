package im.threads.ui.holders;

import android.media.MediaPlayer;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.business.models.FileDescription;
import im.threads.business.models.FileDescriptionUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VoiceMessageBaseHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "fileDescriptionUri", "Lim/threads/business/models/FileDescriptionUri;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$1 extends ej5 implements Function1<FileDescriptionUri, Unit> {
    final /* synthetic */ VoiceMessageBaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageBaseHolder$subscribeForVoiceMessageDownloaded$2$1(VoiceMessageBaseHolder voiceMessageBaseHolder) {
        super(1);
        this.this$0 = voiceMessageBaseHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FileDescriptionUri fileDescriptionUri) {
        invoke2(fileDescriptionUri);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FileDescriptionUri fileDescriptionUri) {
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer;
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer2;
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer3;
        FileDescriptionMediaPlayer fileDescriptionMediaPlayer4;
        z65.h(fileDescriptionUri, "fileDescriptionUri");
        FileDescription fileDescription = this.this$0.getFileDescription();
        String downloadPath = fileDescription != null ? fileDescription.getDownloadPath() : null;
        boolean c = z65.c(downloadPath, fileDescriptionUri.getDownloadPath());
        fileDescriptionMediaPlayer = this.this$0.fdMediaPlayer;
        boolean c2 = z65.c(downloadPath, fileDescriptionMediaPlayer.getClickedDownloadPath());
        this.this$0.resetTintForPlayPauseButton();
        if (c && c2) {
            this.this$0.stopLoader();
            FileDescription fileDescription2 = this.this$0.getFileDescription();
            if (fileDescription2 != null) {
                fileDescription2.setFileUri(fileDescriptionUri.getFileUri());
            }
            fileDescriptionMediaPlayer2 = this.this$0.fdMediaPlayer;
            FileDescription fileDescription3 = this.this$0.getFileDescription();
            z65.e(fileDescription3);
            MediaPlayer restartMediaPlayer = fileDescriptionMediaPlayer2.restartMediaPlayer(fileDescription3);
            if (restartMediaPlayer != null) {
                fileDescriptionMediaPlayer3 = this.this$0.fdMediaPlayer;
                int duration = fileDescriptionMediaPlayer3.getDuration();
                int currentPosition = restartMediaPlayer.getCurrentPosition();
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                this.this$0.init(duration, currentPosition, restartMediaPlayer.isPlaying());
                fileDescriptionMediaPlayer4 = this.this$0.fdMediaPlayer;
                FileDescription fileDescription4 = this.this$0.getFileDescription();
                z65.e(fileDescription4);
                fileDescriptionMediaPlayer4.processPlayPause(fileDescription4);
            }
        }
    }
}
