package im.threads.ui.views.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.databinding.EccViewSearchbarBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorFilterKotlinExtKt;
import im.threads.ui.utils.ColorFilterMode;
import im.threads.ui.utils.ColorsHelper;
import im.threads.ui.utils.KeyboardKt;
import im.threads.ui.views.search.SearchBarView;
import im.threads.ui.widget.CustomFontEditText;
import kotlin.Metadata;
/* compiled from: SearchBarView.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b+\u0010/B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b+\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\u0014\u001a\u00020\u00022\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010J\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0016\u0010!\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u00062"}, d2 = {"Lim/threads/ui/views/search/SearchBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "init", "initSearchTexts", "Landroid/text/TextWatcher;", "initSearchListener", "initClearSearchBtn", "initLoader", "subscribeForLoading", "", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "requestFocus", "Lfr6;", "", "searchChannel", "loadingChannel", "setSearchChannels", "clearSearch", "", "delay", "showKeyboard", "hideKeyboard", "Lim/threads/databinding/EccViewSearchbarBinding;", "binding", "Lim/threads/databinding/EccViewSearchbarBinding;", "Lim/threads/ui/ChatStyle;", "chatStyle", "Lim/threads/ui/ChatStyle;", "Lfr6;", "debouncePeriod", "J", "Ll95;", "textWatcherJob", "Ll95;", "Lqx1;", "loaderCoroutineScope", "Lqx1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SearchBarView extends ConstraintLayout {
    private EccViewSearchbarBinding binding;
    private final ChatStyle chatStyle;
    private long debouncePeriod;
    private qx1 loaderCoroutineScope;
    private fr6<Boolean> loadingChannel;
    private fr6<String> searchChannel;
    private l95 textWatcherJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.chatStyle = Config.Companion.getInstance().getChatStyle();
        this.debouncePeriod = 500L;
        init();
    }

    private final void init() {
        EccViewSearchbarBinding inflate = EccViewSearchbarBinding.inflate(LayoutInflater.from(getContext()), this, true);
        z65.g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        initSearchTexts();
        initSearchListener();
        initClearSearchBtn();
        initLoader();
    }

    private final void initClearSearchBtn() {
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        eccViewSearchbarBinding.searchClearButton.setImageResource(this.chatStyle.searchClearIconDrawable);
        ColorsHelper.setTint(getContext(), eccViewSearchbarBinding.searchClearButton, this.chatStyle.searchClearIconTintColor);
        eccViewSearchbarBinding.searchClearButton.setOnClickListener(new View.OnClickListener() { // from class: by9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchBarView.initClearSearchBtn$lambda$4$lambda$3(SearchBarView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClearSearchBtn$lambda$4$lambda$3(SearchBarView searchBarView, View view) {
        z65.h(searchBarView, "this$0");
        searchBarView.clearSearch();
    }

    private final void initLoader() {
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        Integer num = this.chatStyle.searchLoaderDrawable;
        if (num != null) {
            z65.g(num, "searchLoaderDrawable");
            eccViewSearchbarBinding.searchProgressBar.setIndeterminateDrawable(iu1.e(getContext(), num.intValue()));
        }
        Drawable mutate = eccViewSearchbarBinding.searchProgressBar.getIndeterminateDrawable().mutate();
        z65.g(mutate, "searchProgressBar.indeterminateDrawable.mutate()");
        ColorFilterKotlinExtKt.applyColorFilter(mutate, iu1.c(getContext(), this.chatStyle.searchLoaderColorTint), ColorFilterMode.SRC_ATOP);
        eccViewSearchbarBinding.searchProgressBar.setProgressDrawable(mutate);
    }

    private final TextWatcher initSearchListener() {
        final EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        CustomFontEditText customFontEditText = eccViewSearchbarBinding.searchInput;
        z65.g(customFontEditText, "searchInput");
        TextWatcher textWatcher = new TextWatcher() { // from class: im.threads.ui.views.search.SearchBarView$initSearchListener$lambda$2$$inlined$addTextChangedListener$default$1
            /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void afterTextChanged(android.text.Editable r10) {
                /*
                    r9 = this;
                    r0 = 0
                    if (r10 == 0) goto L8
                    java.lang.String r10 = r10.toString()
                    goto L9
                L8:
                    r10 = r0
                L9:
                    if (r10 == 0) goto L2e
                    int r1 = r10.length()
                    if (r1 != 0) goto L12
                    goto L2e
                L12:
                    im.threads.databinding.EccViewSearchbarBinding r1 = im.threads.databinding.EccViewSearchbarBinding.this
                    android.widget.ProgressBar r1 = r1.searchProgressBar
                    boolean r1 = im.threads.ui.utils.ViewExtensionsKt.isNotVisible(r1)
                    if (r1 == 0) goto L2e
                    im.threads.ui.views.search.SearchBarView r1 = r2
                    im.threads.ui.ChatStyle r1 = im.threads.ui.views.search.SearchBarView.access$getChatStyle$p(r1)
                    boolean r1 = r1.isClearSearchBtnVisible
                    if (r1 == 0) goto L2e
                    im.threads.databinding.EccViewSearchbarBinding r1 = im.threads.databinding.EccViewSearchbarBinding.this
                    android.widget.ImageButton r1 = r1.searchClearButton
                    im.threads.ui.utils.ViewExtensionsKt.visible(r1)
                    goto L35
                L2e:
                    im.threads.databinding.EccViewSearchbarBinding r1 = im.threads.databinding.EccViewSearchbarBinding.this
                    android.widget.ImageButton r1 = r1.searchClearButton
                    im.threads.ui.utils.ViewExtensionsKt.invisible(r1)
                L35:
                    im.threads.ui.views.search.SearchBarView r1 = r2
                    l95 r1 = im.threads.ui.views.search.SearchBarView.access$getTextWatcherJob$p(r1)
                    if (r1 == 0) goto L41
                    r2 = 1
                    defpackage.l95.a.a(r1, r0, r2, r0)
                L41:
                    im.threads.ui.views.search.SearchBarView r1 = r2
                    androidx.lifecycle.d r2 = im.threads.ui.extensions.UiExtensionsKt.lifecycle(r1)
                    if (r2 == 0) goto L5e
                    ip5 r3 = defpackage.lp5.a(r2)
                    if (r3 == 0) goto L5e
                    r4 = 0
                    r5 = 0
                    im.threads.ui.views.search.SearchBarView$initSearchListener$1$1$1 r6 = new im.threads.ui.views.search.SearchBarView$initSearchListener$1$1$1
                    im.threads.ui.views.search.SearchBarView r2 = r2
                    r6.<init>(r10, r2, r0)
                    r7 = 3
                    r8 = 0
                    l95 r0 = defpackage.qh0.d(r3, r4, r5, r6, r7, r8)
                L5e:
                    im.threads.ui.views.search.SearchBarView.access$setTextWatcherJob$p(r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.views.search.SearchBarView$initSearchListener$lambda$2$$inlined$addTextChangedListener$default$1.afterTextChanged(android.text.Editable):void");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        customFontEditText.addTextChangedListener(textWatcher);
        return textWatcher;
    }

    private final void initSearchTexts() {
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        EccViewSearchbarBinding eccViewSearchbarBinding2 = null;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        Context context = eccViewSearchbarBinding.searchInput.getContext();
        EccViewSearchbarBinding eccViewSearchbarBinding3 = this.binding;
        if (eccViewSearchbarBinding3 == null) {
            z65.z("binding");
        } else {
            eccViewSearchbarBinding2 = eccViewSearchbarBinding3;
        }
        CustomFontEditText customFontEditText = eccViewSearchbarBinding2.searchInput;
        customFontEditText.setHint(chatStyle.searchMessageHintText);
        customFontEditText.setHintTextColor(iu1.c(context, chatStyle.chatToolbarHintTextColor));
        customFontEditText.setTextColor(iu1.c(context, chatStyle.searchBarTextColor));
    }

    private final void subscribeForLoading() {
        qx1 qx1Var = this.loaderCoroutineScope;
        if (qx1Var != null) {
            rx1.d(qx1Var, null, 1, null);
        }
        qx1 a = rx1.a(v33.c());
        this.loaderCoroutineScope = a;
        if (a != null) {
            sh0.d(a, null, null, new SearchBarView$subscribeForLoading$1(this, null), 3, null);
        }
    }

    public final void clearSearch() {
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        eccViewSearchbarBinding.searchInput.setText("");
    }

    public final void hideKeyboard(long j) {
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        CustomFontEditText customFontEditText = eccViewSearchbarBinding.searchInput;
        z65.g(customFontEditText, "binding.searchInput");
        KeyboardKt.hideKeyboard(customFontEditText, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        return eccViewSearchbarBinding.searchInput.requestFocus(i, rect);
    }

    public final void setSearchChannels(fr6<String> fr6Var, fr6<Boolean> fr6Var2) {
        this.searchChannel = fr6Var;
        this.loadingChannel = fr6Var2;
        subscribeForLoading();
    }

    public final void showKeyboard(long j) {
        EccViewSearchbarBinding eccViewSearchbarBinding = this.binding;
        if (eccViewSearchbarBinding == null) {
            z65.z("binding");
            eccViewSearchbarBinding = null;
        }
        CustomFontEditText customFontEditText = eccViewSearchbarBinding.searchInput;
        z65.g(customFontEditText, "binding.searchInput");
        KeyboardKt.showKeyboard(customFontEditText, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.chatStyle = Config.Companion.getInstance().getChatStyle();
        this.debouncePeriod = 500L;
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.chatStyle = Config.Companion.getInstance().getChatStyle();
        this.debouncePeriod = 500L;
        init();
    }
}
