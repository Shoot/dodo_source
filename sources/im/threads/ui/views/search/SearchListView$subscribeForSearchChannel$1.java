package im.threads.ui.views.search;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.views.search.SearchListView$subscribeForSearchChannel$1", f = "SearchListView.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SearchListView$subscribeForSearchChannel$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchListView$subscribeForSearchChannel$1(SearchListView searchListView, cv1<? super SearchListView$subscribeForSearchChannel$1> cv1Var) {
        super(2, cv1Var);
        this.this$0 = searchListView;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        SearchListView$subscribeForSearchChannel$1 searchListView$subscribeForSearchChannel$1 = new SearchListView$subscribeForSearchChannel$1(this.this$0, cv1Var);
        searchListView$subscribeForSearchChannel$1.L$0 = obj;
        return searchListView$subscribeForSearchChannel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((SearchListView$subscribeForSearchChannel$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
            fr6Var = this.this$0.searchChannel;
            if (fr6Var != null) {
                final SearchListView searchListView = this.this$0;
                pz3 pz3Var = new pz3() { // from class: im.threads.ui.views.search.SearchListView$subscribeForSearchChannel$1.1
                    @Override // defpackage.pz3
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, cv1 cv1Var) {
                        return emit((String) obj2, (cv1<? super Unit>) cv1Var);
                    }

                    public final Object emit(String str, cv1<? super Unit> cv1Var) {
                        String str2;
                        CharSequence R0;
                        if (str != null) {
                            R0 = m0b.R0(str);
                            str2 = R0.toString();
                        } else {
                            str2 = null;
                        }
                        boolean z = rx1.g(qx1.this) && searchListView.isAttachedToWindow();
                        if (z && str2 != null && str2.length() != 0 && str2.length() > 2) {
                            searchListView.loadSearchResults(str2, 1);
                        } else if (z) {
                            searchListView.lastSearchResults = null;
                            searchListView.lastSearchString = null;
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
