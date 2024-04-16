package im.threads.ui.fragments;

import android.media.MediaPlayer;
import im.threads.business.media.FileDescriptionMediaPlayer;
import im.threads.ui.adapters.ChatAdapter;
import im.threads.ui.fragments.ChatFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatFragment$initMediaPlayer$1$1 extends ej5 implements Function1<Boolean, Unit> {
    final /* synthetic */ FileDescriptionMediaPlayer $player;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$initMediaPlayer$1$1(ChatFragment chatFragment, FileDescriptionMediaPlayer fileDescriptionMediaPlayer) {
        super(1);
        this.this$0 = chatFragment;
        this.$player = fileDescriptionMediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        ChatFragment.QuoteLayoutHolder quoteLayoutHolder;
        ChatFragment.QuoteLayoutHolder quoteLayoutHolder2;
        ChatFragment.QuoteLayoutHolder quoteLayoutHolder3;
        ChatFragment.QuoteLayoutHolder quoteLayoutHolder4;
        if (this.this$0.fdMediaPlayer == null) {
            return;
        }
        if (this.this$0.isPreviewPlaying()) {
            quoteLayoutHolder2 = this.this$0.quoteLayoutHolder;
            z65.e(quoteLayoutHolder2);
            if (quoteLayoutHolder2.getIgnorePlayerUpdates()) {
                return;
            }
            MediaPlayer mediaPlayer = this.$player.getMediaPlayer();
            if (mediaPlayer != null) {
                quoteLayoutHolder3 = this.this$0.quoteLayoutHolder;
                if (quoteLayoutHolder3 != null) {
                    quoteLayoutHolder3.updateProgress(mediaPlayer.getCurrentPosition());
                }
                quoteLayoutHolder4 = this.this$0.quoteLayoutHolder;
                if (quoteLayoutHolder4 != null) {
                    quoteLayoutHolder4.updateIsPlaying(mediaPlayer.isPlaying());
                }
            }
            ChatAdapter chatAdapter = this.this$0.chatAdapter;
            if (chatAdapter != null) {
                chatAdapter.resetPlayingHolder();
                return;
            }
            return;
        }
        ChatAdapter chatAdapter2 = this.this$0.chatAdapter;
        if (chatAdapter2 != null) {
            chatAdapter2.playerUpdate();
        }
        quoteLayoutHolder = this.this$0.quoteLayoutHolder;
        if (quoteLayoutHolder != null) {
            quoteLayoutHolder.resetProgress();
        }
    }
}
