package im.threads.ui.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import im.threads.R;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.imageLoading.LoadImageKt;
import im.threads.business.models.ConsultTyping;
import im.threads.business.utils.FileUtils;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ConsultIsTypingViewHolderNew.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lim/threads/ui/holders/ConsultIsTypingViewHolderNew;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lim/threads/business/models/ConsultTyping;", "consultTyping", "Landroid/view/View$OnClickListener;", "consultClickListener", "", "onBind", "Lim/threads/ui/config/Config;", "config$delegate", "Lrn5;", "getConfig", "()Lim/threads/ui/config/Config;", "config", "Lim/threads/ui/ChatStyle;", "style", "Lim/threads/ui/ChatStyle;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "mConsultAvatar", "Landroid/widget/ImageView;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConsultIsTypingViewHolderNew extends RecyclerView.d0 {
    private final rn5 config$delegate;
    private final ImageView mConsultAvatar;
    private final ChatStyle style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultIsTypingViewHolderNew(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ecc_item_consult_typing, viewGroup, false));
        rn5 b;
        z65.h(viewGroup, "parent");
        b = yn5.b(ConsultIsTypingViewHolderNew$config$2.INSTANCE);
        this.config$delegate = b;
        ChatStyle chatStyle = getConfig().getChatStyle();
        this.style = chatStyle;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.image);
        imageView.getLayoutParams().height = (int) this.itemView.getContext().getResources().getDimension(chatStyle.operatorSystemAvatarSize);
        imageView.getLayoutParams().width = (int) this.itemView.getContext().getResources().getDimension(chatStyle.operatorSystemAvatarSize);
        this.mConsultAvatar = imageView;
        ((TextView) this.itemView.findViewById(R.id.typing_in_progress)).setTextColor(iu1.c(this.itemView.getContext(), chatStyle.chatSystemMessageTextColor));
    }

    private final Config getConfig() {
        return (Config) this.config$delegate.getValue();
    }

    public final void onBind(ConsultTyping consultTyping, View.OnClickListener onClickListener) {
        List o;
        List e;
        z65.h(consultTyping, "consultTyping");
        z65.h(onClickListener, "consultClickListener");
        this.mConsultAvatar.setOnClickListener(onClickListener);
        this.mConsultAvatar.setImageResource(this.style.defaultOperatorAvatar);
        ImageView imageView = this.mConsultAvatar;
        z65.g(imageView, "mConsultAvatar");
        String convertRelativeUrlToAbsolute = FileUtils.convertRelativeUrlToAbsolute(consultTyping.getAvatarPath());
        o = kc1.o(ImageView.ScaleType.FIT_XY, ImageView.ScaleType.CENTER_CROP);
        e = jc1.e(ImageModifications.CircleCropModification.INSTANCE);
        LoadImageKt.loadImage$default(imageView, convertRelativeUrlToAbsolute, o, null, e, null, false, false, false, 244, null);
    }
}
