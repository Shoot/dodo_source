package im.threads.ui.adapters.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.imageLoading.ImageModifications;
import im.threads.business.models.ExtractedLink;
import im.threads.business.models.MessageFromHistory;
import im.threads.business.models.Operator;
import im.threads.business.utils.DateHelper;
import im.threads.business.utils.FileUtils;
import im.threads.business.utils.UrlUtils;
import im.threads.databinding.EccItemSearchResultBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.adapters.search.SearchListViewAdapter;
import im.threads.ui.holders.BaseHolder;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.ViewExtensionsKt;
import im.threads.ui.widget.CustomFontTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: SearchListViewAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B%\u0012\u001c\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016R*\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lim/threads/ui/adapters/search/SearchListViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lim/threads/ui/adapters/search/SearchListViewAdapter$SearchListViewHolder;", "", "Lim/threads/business/models/MessageFromHistory;", "newData", "", "updateData", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "Lkotlin/Function2;", "", "onClickCallback", "Lkotlin/jvm/functions/Function2;", "data", "Ljava/util/List;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "SearchListViewHolder", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SearchListViewAdapter extends RecyclerView.h<SearchListViewHolder> {
    private List<MessageFromHistory> data;
    private final Function2<String, String, Unit> onClickCallback;

    /* compiled from: SearchListViewAdapter.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lim/threads/ui/adapters/search/SearchListViewAdapter$SearchListViewHolder;", "Lim/threads/ui/holders/BaseHolder;", "binding", "Lim/threads/databinding/EccItemSearchResultBinding;", "(Lim/threads/ui/adapters/search/SearchListViewAdapter;Lim/threads/databinding/EccItemSearchResultBinding;)V", "getBinding", "()Lim/threads/databinding/EccItemSearchResultBinding;", "chatStyle", "Lim/threads/ui/ChatStyle;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "kotlin.jvm.PlatformType", "bind", "", "message", "Lim/threads/business/models/MessageFromHistory;", "isLastItem", "", "loadAvatar", "setDate", "dateTextView", "Lim/threads/ui/widget/CustomFontTextView;", "setDivider", "dividerView", "Landroid/view/View;", "setMessageText", "messageTextView", "setNameTextView", "nameTextView", "setOnItemClick", "clickableView", "messageUuid", "", "date", "setRightArrow", "rightArrowImageView", "Landroid/widget/ImageView;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class SearchListViewHolder extends BaseHolder {
        private final EccItemSearchResultBinding binding;
        private final ChatStyle chatStyle;
        private final Context context;
        final /* synthetic */ SearchListViewAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SearchListViewHolder(im.threads.ui.adapters.search.SearchListViewAdapter r8, im.threads.databinding.EccItemSearchResultBinding r9) {
            /*
                r7 = this;
                java.lang.String r0 = "binding"
                defpackage.z65.h(r9, r0)
                r7.this$0 = r8
                androidx.constraintlayout.widget.ConstraintLayout r2 = r9.getRoot()
                java.lang.String r8 = "binding.root"
                defpackage.z65.g(r2, r8)
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.binding = r9
                androidx.constraintlayout.widget.ConstraintLayout r8 = r9.getRoot()
                android.content.Context r8 = r8.getContext()
                r7.context = r8
                im.threads.ui.config.Config$Companion r8 = im.threads.ui.config.Config.Companion
                im.threads.ui.config.Config r8 = r8.getInstance()
                im.threads.ui.ChatStyle r8 = r8.getChatStyle()
                r7.chatStyle = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.adapters.search.SearchListViewAdapter.SearchListViewHolder.<init>(im.threads.ui.adapters.search.SearchListViewAdapter, im.threads.databinding.EccItemSearchResultBinding):void");
        }

        private final void loadAvatar(MessageFromHistory messageFromHistory) {
            String str;
            String photoUrl;
            Operator operator = messageFromHistory.getOperator();
            if (operator != null && (photoUrl = operator.getPhotoUrl()) != null) {
                str = FileUtils.INSTANCE.toAbsoluteUrl$threads_release(photoUrl);
            } else {
                str = null;
            }
            if (str != null) {
                ImageLoader modifications = ImageLoader.Companion.get().load(str).modifications(ImageModifications.CircleCropModification.INSTANCE);
                ImageView imageView = this.binding.avatarImage;
                z65.g(imageView, "binding.avatarImage");
                modifications.into(imageView);
                return;
            }
            this.binding.avatarImage.setImageDrawable(null);
        }

        private final void setDate(CustomFontTextView customFontTextView, MessageFromHistory messageFromHistory) {
            customFontTextView.setText(new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()).format(new Date(DateHelper.INSTANCE.getMessageTimestampFromDateString(messageFromHistory.getReceivedDate()))));
            customFontTextView.setTextColor(iu1.c(this.context, this.chatStyle.searchResultsItemDateTextColor));
        }

        private final void setDivider(View view, boolean z) {
            if (z) {
                ViewExtensionsKt.invisible(view);
                return;
            }
            view.setBackgroundColor(iu1.c(this.context, this.chatStyle.searchResultsDividerColor));
            ViewExtensionsKt.visible(view);
        }

        private final void setMessageText(CustomFontTextView customFontTextView, MessageFromHistory messageFromHistory) {
            List<String> l;
            List<String> list;
            String str;
            String str2;
            if (messageFromHistory.getOperator() != null) {
                l = kc1.l();
                String text = messageFromHistory.getText();
                String str3 = null;
                if (text != null) {
                    String extractDeepLink = UrlUtils.extractDeepLink(text);
                    ExtractedLink extractLink = UrlUtils.extractLink(text);
                    if (extractLink != null) {
                        str3 = extractLink.getLink();
                    }
                    list = UrlUtils.extractEmailAddresses(text);
                    String str4 = str3;
                    str3 = extractDeepLink;
                    str = str4;
                } else {
                    list = l;
                    str = null;
                }
                String formattedText = messageFromHistory.getFormattedText();
                String text2 = messageFromHistory.getText();
                if (str3 == null) {
                    str2 = str;
                } else {
                    str2 = str3;
                }
                highlightOperatorText(customFontTextView, formattedText, text2, str2, list);
            } else {
                customFontTextView.setText(messageFromHistory.getText());
            }
            customFontTextView.setTextColor(iu1.c(this.context, this.chatStyle.searchResultsItemMessageTextColor));
        }

        private final void setNameTextView(CustomFontTextView customFontTextView, MessageFromHistory messageFromHistory) {
            String string;
            customFontTextView.setTextColor(iu1.c(this.context, this.chatStyle.searchResultsItemNameTextColor));
            Operator operator = messageFromHistory.getOperator();
            if (operator == null || (string = operator.getName()) == null) {
                string = this.itemView.getContext().getString(R.string.ecc_I);
            }
            customFontTextView.setText(string);
        }

        private final void setOnItemClick(View view, final String str, final String str2) {
            final SearchListViewAdapter searchListViewAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: jy9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchListViewAdapter.SearchListViewHolder.setOnItemClick$lambda$2(SearchListViewAdapter.this, str, str2, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setOnItemClick$lambda$2(SearchListViewAdapter searchListViewAdapter, String str, String str2, View view) {
            z65.h(searchListViewAdapter, "this$0");
            searchListViewAdapter.onClickCallback.invoke(str, str2);
        }

        private final void setRightArrow(ImageView imageView) {
            imageView.setImageDrawable(iu1.e(this.context, this.chatStyle.searchResultsItemRightArrowDrawable));
            ColorsHelper.setTint(this.context, imageView, this.chatStyle.searchResultsItemRightArrowTintColor);
        }

        public final void bind(MessageFromHistory messageFromHistory, boolean z) {
            z65.h(messageFromHistory, "message");
            EccItemSearchResultBinding eccItemSearchResultBinding = this.binding;
            loadAvatar(messageFromHistory);
            CustomFontTextView customFontTextView = eccItemSearchResultBinding.nameTextView;
            z65.g(customFontTextView, "nameTextView");
            setNameTextView(customFontTextView, messageFromHistory);
            CustomFontTextView customFontTextView2 = eccItemSearchResultBinding.messageTextView;
            z65.g(customFontTextView2, "messageTextView");
            setMessageText(customFontTextView2, messageFromHistory);
            CustomFontTextView customFontTextView3 = eccItemSearchResultBinding.dateTextView;
            z65.g(customFontTextView3, "dateTextView");
            setDate(customFontTextView3, messageFromHistory);
            View view = eccItemSearchResultBinding.dividerView;
            z65.g(view, "dividerView");
            setDivider(view, z);
            ImageView imageView = eccItemSearchResultBinding.rightArrowImageView;
            z65.g(imageView, "rightArrowImageView");
            setRightArrow(imageView);
            View view2 = this.binding.clickableView;
            z65.g(view2, "binding.clickableView");
            setOnItemClick(view2, messageFromHistory.getUuid(), messageFromHistory.getReceivedDate());
        }

        public final EccItemSearchResultBinding getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchListViewAdapter(Function2<? super String, ? super String, Unit> function2) {
        List<MessageFromHistory> l;
        z65.h(function2, "onClickCallback");
        this.onClickCallback = function2;
        l = kc1.l();
        this.data = l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.data.size();
    }

    public final void updateData(List<MessageFromHistory> list) {
        if (list == null) {
            list = kc1.l();
        }
        e.C0047e b = e.b(new SearchListDiffCallback(this.data, list));
        z65.g(b, "calculateDiff(SearchList…ack(data, dataForUpdate))");
        this.data = list;
        b.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(SearchListViewHolder searchListViewHolder, int i) {
        z65.h(searchListViewHolder, "holder");
        searchListViewHolder.bind(this.data.get(i), getItemCount() - i == 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public SearchListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        z65.h(viewGroup, "parent");
        EccItemSearchResultBinding inflate = EccItemSearchResultBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        z65.g(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new SearchListViewHolder(this, inflate);
    }
}
