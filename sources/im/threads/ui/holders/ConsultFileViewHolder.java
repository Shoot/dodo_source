package im.threads.ui.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.threads.R;
import im.threads.business.models.ConsultPhrase;
import im.threads.business.models.FileDescription;
import im.threads.business.models.Quote;
import im.threads.business.models.enums.AttachmentStateEnum;
import im.threads.business.utils.FileUtilsKt;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.views.CircularProgressButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: ConsultFileViewHolder.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u00102\u001a\u000201\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020403\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J6\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010/\u001a\n \u001e*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001aR\u001c\u00100\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010 ¨\u0006:"}, d2 = {"Lim/threads/ui/holders/ConsultFileViewHolder;", "Lim/threads/ui/holders/BaseHolder;", "", "applyBubbleLayoutStyle", "Lim/threads/business/models/FileDescription;", "fileDescription", "showFile", "showImageLayout", "showPendingState", "showErrorLayout", "Lim/threads/business/models/ConsultPhrase;", "consultPhrase", "", "highlighted", "Landroid/view/View$OnClickListener;", "buttonClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "onQuoteClickListener", "onAvatarClickListener", "onBind", "Landroid/widget/LinearLayout;", "quoteLayout", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "quoteTextHeader", "Landroid/widget/TextView;", "quoteTextDescription", "quoteTextTimeStamp", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "quoteFileImage", "Landroid/widget/ImageView;", "Lim/threads/ui/views/CircularProgressButton;", "quoteProgressButton", "Lim/threads/ui/views/CircularProgressButton;", "mCircularProgressButton", "errorText", "loader", "mFileHeader", "mSizeTextView", "Landroid/widget/RelativeLayout;", "rootLayout", "Landroid/widget/RelativeLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bubbleLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "timeStampTextView", "mConsultAvatar", "Landroid/view/ViewGroup;", "parent", "Lks8;", "Lim/threads/business/models/ChatItem;", "highlightingStream", "Lim/threads/business/ogParser/OpenGraphParser;", "openGraphParser", "<init>", "(Landroid/view/ViewGroup;Lks8;Lim/threads/business/ogParser/OpenGraphParser;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ConsultFileViewHolder extends BaseHolder {
    private final ConstraintLayout bubbleLayout;
    private final TextView errorText;
    private final ImageView loader;
    private final CircularProgressButton mCircularProgressButton;
    private final ImageView mConsultAvatar;
    private final TextView mFileHeader;
    private final TextView mSizeTextView;
    private final ImageView quoteFileImage;
    private final LinearLayout quoteLayout;
    private final CircularProgressButton quoteProgressButton;
    private final TextView quoteTextDescription;
    private final TextView quoteTextHeader;
    private final TextView quoteTextTimeStamp;
    private final RelativeLayout rootLayout;
    private final TextView timeStampTextView;

    /* compiled from: ConsultFileViewHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentStateEnum.values().length];
            try {
                iArr[AttachmentStateEnum.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentStateEnum.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConsultFileViewHolder(android.view.ViewGroup r7, defpackage.ks8<im.threads.business.models.ChatItem> r8, im.threads.business.ogParser.OpenGraphParser r9) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.holders.ConsultFileViewHolder.<init>(android.view.ViewGroup, ks8, im.threads.business.ogParser.OpenGraphParser):void");
    }

    private final void applyBubbleLayoutStyle() {
        this.bubbleLayout.setBackground(on.b(this.itemView.getContext(), getStyle().incomingMessageBubbleBackground));
        setPaddings(true, this.bubbleLayout);
        setLayoutMargins(true, this.bubbleLayout);
        this.bubbleLayout.getBackground().setColorFilter(qc0.a(getColorInt(getStyle().incomingMessageBubbleColor), uc0.SRC_ATOP));
    }

    private final void showErrorLayout(FileDescription fileDescription) {
        this.mCircularProgressButton.setVisibility(4);
        this.loader.setVisibility(0);
        this.errorText.setVisibility(0);
        this.loader.setImageResource(getErrorImageResByErrorCode(fileDescription.getErrorCode()));
        String errorMessage = fileDescription.getErrorMessage();
        if (errorMessage != null && errorMessage.length() != 0) {
            this.errorText.setText(fileDescription.getErrorMessage());
        } else {
            this.errorText.setText(getConfig().context.getString(R.string.ecc_some_error_during_load_file));
        }
    }

    private final void showFile(FileDescription fileDescription) {
        boolean v;
        if (fileDescription != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[fileDescription.getState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    showImageLayout(fileDescription);
                } else {
                    showPendingState();
                }
            } else {
                showErrorLayout(fileDescription);
            }
            fileNameFromDescription(fileDescription, new ConsultFileViewHolder$showFile$1(this));
            v = l0b.v(this.mFileHeader.getText().toString(), "null", true);
            if (v) {
                this.mFileHeader.setText("");
            }
            long size = fileDescription.getSize();
            this.mSizeTextView.setText(FileUtilsKt.toFileSize$default(size, null, 1, null));
            if (size > 0) {
                ViewExtensionsKt.visible(this.mSizeTextView);
                this.mSizeTextView.setText(FileUtilsKt.toFileSize$default(size, null, 1, null));
                return;
            }
            ViewExtensionsKt.gone(this.mSizeTextView);
        }
    }

    private final void showImageLayout(FileDescription fileDescription) {
        int downloadProgress;
        this.loader.setVisibility(4);
        this.errorText.setVisibility(8);
        this.mCircularProgressButton.setVisibility(0);
        CircularProgressButton circularProgressButton = this.mCircularProgressButton;
        if (fileDescription.getFileUri() != null) {
            downloadProgress = 100;
        } else {
            downloadProgress = fileDescription.getDownloadProgress();
        }
        circularProgressButton.setProgress(downloadProgress);
    }

    private final void showPendingState() {
        this.mCircularProgressButton.setVisibility(4);
        this.loader.setVisibility(0);
        this.errorText.setVisibility(8);
        initAnimation(this.loader, true);
    }

    public final void onBind(ConsultPhrase consultPhrase, boolean z, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        Unit unit;
        List<? extends TextView> e;
        z65.h(consultPhrase, "consultPhrase");
        z65.h(onClickListener, "buttonClickListener");
        z65.h(onLongClickListener, "onLongClickListener");
        z65.h(onClickListener2, "onQuoteClickListener");
        z65.h(onClickListener3, "onAvatarClickListener");
        subscribeForHighlighting(consultPhrase, this.rootLayout);
        applyBubbleLayoutStyle();
        Quote quote = consultPhrase.getQuote();
        if (quote != null) {
            LinearLayout linearLayout = this.quoteLayout;
            TextView textView = this.quoteTextHeader;
            TextView textView2 = this.quoteTextDescription;
            TextView textView3 = this.quoteTextTimeStamp;
            ImageView imageView = this.quoteFileImage;
            z65.g(imageView, "quoteFileImage");
            showQuote(quote, onClickListener2, linearLayout, textView, textView2, textView3, imageView, this.quoteProgressButton);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.quoteLayout.setVisibility(8);
        }
        showFile(consultPhrase.getFileDescription());
        e = jc1.e(this.timeStampTextView);
        showConsultTimeStamp(consultPhrase, e);
        View view = this.itemView;
        z65.f(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setOnLongClickListener(onLongClickListener);
        }
        this.mCircularProgressButton.setOnClickListener(onClickListener);
        changeHighlighting(z);
        ImageView imageView2 = this.mConsultAvatar;
        z65.g(imageView2, "mConsultAvatar");
        showAvatar(imageView2, consultPhrase, onClickListener3);
    }
}
