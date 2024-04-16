package im.threads.ui.views.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import im.threads.business.config.BaseConfig;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.MessageFromHistory;
import im.threads.business.rest.models.SearchResponse;
import im.threads.business.rest.queries.BackendApi;
import im.threads.databinding.EccViewSearchListBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.adapters.search.SearchListViewAdapter;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ViewExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* compiled from: SearchListView.kt */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001(\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b1\u00105B#\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00106\u001a\u00020\n¢\u0006\u0004\b1\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\"\u0010\u0014\u001a\u00020\u00022\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00020\u0012J(\u0010\u0018\u001a\u00020\u00022\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R,\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.¨\u00068"}, d2 = {"Lim/threads/ui/views/search/SearchListView;", "Landroid/widget/FrameLayout;", "", "init", "subscribeForSearchChannel", "", "value", "setLoadingChannelValue", "", "searchString", "", "page", "loadSearchResults", "checkListSize", "isLastVisibleItemPosition", "initNoResultsView", "subscribeForListScroll", "onListScrolled", "Lkotlin/Function2;", "listener", "setOnClickListener", "Lfr6;", "searchChannel", "loadingChannel", "setSearchChannels", "Lim/threads/databinding/EccViewSearchListBinding;", "binding", "Lim/threads/databinding/EccViewSearchListBinding;", "Lfr6;", "Lqx1;", "searchChannelCoroutineScope", "Lqx1;", "Lim/threads/ui/adapters/search/SearchListViewAdapter;", "searchListViewAdapter", "Lim/threads/ui/adapters/search/SearchListViewAdapter;", "Lim/threads/business/rest/models/SearchResponse;", "lastSearchResults", "Lim/threads/business/rest/models/SearchResponse;", "lastSearchString", "Ljava/lang/String;", "im/threads/ui/views/search/SearchListView$onScrollListener$1", "onScrollListener", "Lim/threads/ui/views/search/SearchListView$onScrollListener$1;", "onListItemClickCallback", "Lkotlin/jvm/functions/Function2;", "invisibleMessagesCount", "I", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SearchListView extends FrameLayout {
    private EccViewSearchListBinding binding;
    private final int invisibleMessagesCount;
    private SearchResponse lastSearchResults;
    private String lastSearchString;
    private fr6<Boolean> loadingChannel;
    private Function2<? super String, ? super String, Unit> onListItemClickCallback;
    private SearchListView$onScrollListener$1 onScrollListener;
    private fr6<String> searchChannel;
    private qx1 searchChannelCoroutineScope;
    private SearchListViewAdapter searchListViewAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [im.threads.ui.views.search.SearchListView$onScrollListener$1] */
    public SearchListView(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.loadingChannel = mua.a(Boolean.FALSE);
        this.onScrollListener = new RecyclerView.u() { // from class: im.threads.ui.views.search.SearchListView$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                z65.h(recyclerView, "recyclerView");
                SearchListView.this.onListScrolled();
            }
        };
        this.invisibleMessagesCount = 3;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkListSize() {
        SearchListViewAdapter searchListViewAdapter = this.searchListViewAdapter;
        EccViewSearchListBinding eccViewSearchListBinding = null;
        if (searchListViewAdapter != null && searchListViewAdapter.getItemCount() == 0) {
            EccViewSearchListBinding eccViewSearchListBinding2 = this.binding;
            if (eccViewSearchListBinding2 == null) {
                z65.z("binding");
            } else {
                eccViewSearchListBinding = eccViewSearchListBinding2;
            }
            ViewExtensionsKt.visible(eccViewSearchListBinding.noResultsView);
            return;
        }
        EccViewSearchListBinding eccViewSearchListBinding3 = this.binding;
        if (eccViewSearchListBinding3 == null) {
            z65.z("binding");
        } else {
            eccViewSearchListBinding = eccViewSearchListBinding3;
        }
        ViewExtensionsKt.gone(eccViewSearchListBinding.noResultsView);
    }

    private final void init() {
        EccViewSearchListBinding inflate = EccViewSearchListBinding.inflate(LayoutInflater.from(getContext()), this, true);
        z65.g(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        this.searchListViewAdapter = new SearchListViewAdapter(new SearchListView$init$1(this));
        EccViewSearchListBinding eccViewSearchListBinding = this.binding;
        if (eccViewSearchListBinding == null) {
            z65.z("binding");
            eccViewSearchListBinding = null;
        }
        eccViewSearchListBinding.searchResultsListView.setAdapter(this.searchListViewAdapter);
        initNoResultsView();
        subscribeForListScroll();
    }

    private final void initNoResultsView() {
        EccViewSearchListBinding eccViewSearchListBinding = this.binding;
        if (eccViewSearchListBinding == null) {
            z65.z("binding");
            eccViewSearchListBinding = null;
        }
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        Context context = eccViewSearchListBinding.noResultsImage.getContext();
        ImageView imageView = eccViewSearchListBinding.noResultsImage;
        imageView.setImageDrawable(iu1.e(imageView.getContext(), chatStyle.searchResultNoItemsImageDrawable));
        eccViewSearchListBinding.noResultsTextView.setText(context.getString(chatStyle.searchResultNoItemsText));
        eccViewSearchListBinding.noResultsTextView.setTextColor(iu1.c(context, chatStyle.searchResultNoItemsTextColor));
    }

    private final boolean isLastVisibleItemPosition() {
        if (!isAttachedToWindow()) {
            return false;
        }
        EccViewSearchListBinding eccViewSearchListBinding = this.binding;
        if (eccViewSearchListBinding == null) {
            z65.z("binding");
            eccViewSearchListBinding = null;
        }
        RecyclerView.p layoutManager = eccViewSearchListBinding.searchResultsListView.getLayoutManager();
        z65.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int k2 = ((LinearLayoutManager) layoutManager).k2();
        SearchListViewAdapter searchListViewAdapter = this.searchListViewAdapter;
        if (searchListViewAdapter == null || (searchListViewAdapter.getItemCount() - 1) - k2 >= this.invisibleMessagesCount) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadSearchResults(final String str, int i) {
        boolean y;
        y = l0b.y(str);
        if (!y && !this.loadingChannel.getValue().booleanValue()) {
            setLoadingChannelValue(true);
            Call<SearchResponse> search = BackendApi.Companion.get().search(BaseConfig.Companion.getInstance().transport.getToken(), str, i);
            if (search == null) {
                setLoadingChannelValue(false);
            } else {
                search.enqueue(new Callback<SearchResponse>() { // from class: im.threads.ui.views.search.SearchListView$loadSearchResults$1
                    @Override // retrofit2.Callback
                    public void onFailure(Call<SearchResponse> call, Throwable th) {
                        z65.h(call, "call");
                        z65.h(th, "t");
                        SearchListView.this.setLoadingChannelValue(false);
                        LoggerEdna.error("Error when search", th);
                    }

                    @Override // retrofit2.Callback
                    public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                        String str2;
                        SearchListViewAdapter searchListViewAdapter;
                        SearchResponse searchResponse;
                        List<MessageFromHistory> list;
                        boolean y2;
                        String str3;
                        SearchResponse searchResponse2;
                        z65.h(call, "call");
                        z65.h(response, "response");
                        if (response.isSuccessful()) {
                            SearchResponse body = response.body();
                            SearchListView searchListView = SearchListView.this;
                            str2 = searchListView.lastSearchString;
                            if (str2 != null) {
                                y2 = l0b.y(str2);
                                if (!y2) {
                                    String str4 = str;
                                    str3 = SearchListView.this.lastSearchString;
                                    z65.e(str3);
                                    if (z65.c(str4, str3)) {
                                        searchResponse2 = SearchListView.this.lastSearchResults;
                                        body = BusinessExtensionsKt.plus(searchResponse2, body);
                                    }
                                }
                            }
                            searchListView.lastSearchResults = body;
                            SearchListView.this.lastSearchString = str;
                            searchListViewAdapter = SearchListView.this.searchListViewAdapter;
                            if (searchListViewAdapter != null) {
                                searchResponse = SearchListView.this.lastSearchResults;
                                if (searchResponse != null) {
                                    list = searchResponse.getContent();
                                } else {
                                    list = null;
                                }
                                searchListViewAdapter.updateData(list);
                            }
                            SearchListView.this.setLoadingChannelValue(false);
                            SearchListView.this.checkListSize();
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onListScrolled() {
        int i;
        List<MessageFromHistory> content;
        Integer pages;
        Integer total;
        SearchResponse searchResponse = this.lastSearchResults;
        if (searchResponse != null && (total = searchResponse.getTotal()) != null) {
            total.intValue();
        }
        SearchResponse searchResponse2 = this.lastSearchResults;
        int i2 = 0;
        if (searchResponse2 != null && (pages = searchResponse2.getPages()) != null) {
            i = pages.intValue();
        } else {
            i = 0;
        }
        SearchResponse searchResponse3 = this.lastSearchResults;
        if (searchResponse3 != null && (content = searchResponse3.getContent()) != null) {
            i2 = content.size();
        }
        double ceil = Math.ceil(i2 / 20);
        if (isLastVisibleItemPosition() && i - ceil > 0.0d) {
            String str = this.lastSearchString;
            if (str == null) {
                str = "";
            }
            loadSearchResults(str, ((int) ceil) + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void setLoadingChannelValue(boolean z) {
        this.loadingChannel.setValue(Boolean.valueOf(z));
    }

    private final void subscribeForListScroll() {
        EccViewSearchListBinding eccViewSearchListBinding = this.binding;
        EccViewSearchListBinding eccViewSearchListBinding2 = null;
        if (eccViewSearchListBinding == null) {
            z65.z("binding");
            eccViewSearchListBinding = null;
        }
        eccViewSearchListBinding.searchResultsListView.removeOnScrollListener(this.onScrollListener);
        EccViewSearchListBinding eccViewSearchListBinding3 = this.binding;
        if (eccViewSearchListBinding3 == null) {
            z65.z("binding");
        } else {
            eccViewSearchListBinding2 = eccViewSearchListBinding3;
        }
        eccViewSearchListBinding2.searchResultsListView.addOnScrollListener(this.onScrollListener);
    }

    private final void subscribeForSearchChannel() {
        qx1 qx1Var = this.searchChannelCoroutineScope;
        if (qx1Var != null) {
            rx1.d(qx1Var, null, 1, null);
        }
        qx1 a = rx1.a(v33.c());
        this.searchChannelCoroutineScope = a;
        if (a != null) {
            sh0.d(a, null, null, new SearchListView$subscribeForSearchChannel$1(this, null), 3, null);
        }
    }

    public final void setOnClickListener(Function2<? super String, ? super String, Unit> function2) {
        z65.h(function2, "listener");
        this.onListItemClickCallback = function2;
    }

    public final void setSearchChannels(fr6<String> fr6Var, fr6<Boolean> fr6Var2) {
        this.searchChannel = fr6Var;
        if (fr6Var2 != null) {
            this.loadingChannel = fr6Var2;
        }
        subscribeForSearchChannel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [im.threads.ui.views.search.SearchListView$onScrollListener$1] */
    public SearchListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.loadingChannel = mua.a(Boolean.FALSE);
        this.onScrollListener = new RecyclerView.u() { // from class: im.threads.ui.views.search.SearchListView$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                z65.h(recyclerView, "recyclerView");
                SearchListView.this.onListScrolled();
            }
        };
        this.invisibleMessagesCount = 3;
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [im.threads.ui.views.search.SearchListView$onScrollListener$1] */
    public SearchListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.loadingChannel = mua.a(Boolean.FALSE);
        this.onScrollListener = new RecyclerView.u() { // from class: im.threads.ui.views.search.SearchListView$onScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.u
            public void onScrolled(RecyclerView recyclerView, int i2, int i22) {
                z65.h(recyclerView, "recyclerView");
                SearchListView.this.onListScrolled();
            }
        };
        this.invisibleMessagesCount = 3;
        init();
    }
}
