package im.threads.ui.views.search;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: SearchBarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@nn2(c = "im.threads.ui.views.search.SearchBarView$initSearchListener$1$1$1", f = "SearchBarView.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SearchBarView$initSearchListener$1$1$1 extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
    final /* synthetic */ String $newText;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SearchBarView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView$initSearchListener$1$1$1(String str, SearchBarView searchBarView, cv1<? super SearchBarView$initSearchListener$1$1$1> cv1Var) {
        super(2, cv1Var);
        this.$newText = str;
        this.this$0 = searchBarView;
    }

    @Override // defpackage.e70
    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
        SearchBarView$initSearchListener$1$1$1 searchBarView$initSearchListener$1$1$1 = new SearchBarView$initSearchListener$1$1$1(this.$newText, this.this$0, cv1Var);
        searchBarView$initSearchListener$1$1$1.L$0 = obj;
        return searchBarView$initSearchListener$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
        return ((SearchBarView$initSearchListener$1$1$1) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.e70
    public final Object invokeSuspend(Object obj) {
        Object d;
        String str;
        SearchBarView searchBarView;
        long j;
        String str2;
        fr6 fr6Var;
        d = c75.d();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                str2 = (String) this.L$1;
                searchBarView = (SearchBarView) this.L$0;
                vk9.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            vk9.b(obj);
            if (rx1.g((qx1) this.L$0) && (str = this.$newText) != null) {
                searchBarView = this.this$0;
                j = searchBarView.debouncePeriod;
                this.L$0 = searchBarView;
                this.L$1 = str;
                this.label = 1;
                if (xt2.a(j, this) == d) {
                    return d;
                }
                str2 = str;
            }
            return Unit.a;
        }
        fr6Var = searchBarView.searchChannel;
        if (fr6Var != null) {
            fr6Var.setValue(str2);
        }
        return Unit.a;
    }
}
