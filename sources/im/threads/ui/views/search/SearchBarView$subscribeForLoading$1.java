package im.threads.ui.views.search;

import android.text.Editable;
import im.threads.business.logger.LoggerEdna;
import im.threads.databinding.EccViewSearchbarBinding;
import im.threads.ui.ChatStyle;
import im.threads.ui.utils.ViewExtensionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchBarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.views.search.SearchBarView$subscribeForLoading$1", f = "SearchBarView.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SearchBarView$subscribeForLoading$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchBarView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView$subscribeForLoading$1(SearchBarView searchBarView, cv1<? super SearchBarView$subscribeForLoading$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = searchBarView;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        SearchBarView$subscribeForLoading$1 searchBarView$subscribeForLoading$1 = new SearchBarView$subscribeForLoading$1(this.this$0, cv1Var);
        searchBarView$subscribeForLoading$1.L$0 = obj;
        return searchBarView$subscribeForLoading$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((SearchBarView$subscribeForLoading$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        fr6 fr6Var;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
        } else {
            vk9.b(obj);
            final qx1 qx1Var = (qx1) this.L$0;
            fr6Var = this.this$0.loadingChannel;
            if (fr6Var != null) {
                final SearchBarView searchBarView = this.this$0;
                pz3 pz3Var = new pz3() { // from class: im.threads.ui.views.search.SearchBarView$subscribeForLoading$1.1
                    @Override // defpackage.pz3
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                        return emit(((Boolean) obj2).booleanValue(), cv1Var);
                    }

                    public final Object emit(boolean z, cv1<? super Unit> cv1Var) {
                        ChatStyle chatStyle;
                        EccViewSearchbarBinding eccViewSearchbarBinding;
                        EccViewSearchbarBinding eccViewSearchbarBinding2;
                        String obj2;
                        EccViewSearchbarBinding eccViewSearchbarBinding3;
                        EccViewSearchbarBinding eccViewSearchbarBinding4;
                        EccViewSearchbarBinding eccViewSearchbarBinding5;
                        if (rx1.g(qx1.this) && searchBarView.isAttachedToWindow()) {
                            chatStyle = searchBarView.chatStyle;
                            if (chatStyle.isSearchLoaderVisible) {
                                LoggerEdna.info("showLoader");
                                EccViewSearchbarBinding eccViewSearchbarBinding6 = null;
                                if (z) {
                                    eccViewSearchbarBinding4 = searchBarView.binding;
                                    if (eccViewSearchbarBinding4 == null) {
                                        z65.z("binding");
                                        eccViewSearchbarBinding4 = null;
                                    }
                                    ViewExtensionsKt.invisible(eccViewSearchbarBinding4.searchClearButton);
                                    eccViewSearchbarBinding5 = searchBarView.binding;
                                    if (eccViewSearchbarBinding5 == null) {
                                        z65.z("binding");
                                    } else {
                                        eccViewSearchbarBinding6 = eccViewSearchbarBinding5;
                                    }
                                    ViewExtensionsKt.visible(eccViewSearchbarBinding6.searchProgressBar);
                                } else {
                                    eccViewSearchbarBinding = searchBarView.binding;
                                    if (eccViewSearchbarBinding == null) {
                                        z65.z("binding");
                                        eccViewSearchbarBinding = null;
                                    }
                                    ViewExtensionsKt.invisible(eccViewSearchbarBinding.searchProgressBar);
                                    eccViewSearchbarBinding2 = searchBarView.binding;
                                    if (eccViewSearchbarBinding2 == null) {
                                        z65.z("binding");
                                        eccViewSearchbarBinding2 = null;
                                    }
                                    Editable text = eccViewSearchbarBinding2.searchInput.getText();
                                    if (text != null && (obj2 = text.toString()) != null && obj2.length() > 0) {
                                        eccViewSearchbarBinding3 = searchBarView.binding;
                                        if (eccViewSearchbarBinding3 == null) {
                                            z65.z("binding");
                                        } else {
                                            eccViewSearchbarBinding6 = eccViewSearchbarBinding3;
                                        }
                                        ViewExtensionsKt.visible(eccViewSearchbarBinding6.searchClearButton);
                                    }
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                this.label = 1;
                if (fr6Var.collect(pz3Var, this) == d) {
                    return d;
                }
            } else {
                return Unit.a;
            }
        }
        throw new KotlinNothingValueException();
    }
}
