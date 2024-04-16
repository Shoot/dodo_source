package im.threads.ui.views.search;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchListView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "messageUuid", "", "date", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchListView$init$1 extends ej5 implements Function2<String, String, Unit> {
    final /* synthetic */ SearchListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchListView$init$1(SearchListView searchListView) {
        super(2);
        this.this$0 = searchListView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r0 = r1.this$0.onListItemClickCallback;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r2 == 0) goto Ld
            im.threads.ui.views.search.SearchListView r0 = r1.this$0
            kotlin.jvm.functions.Function2 r0 = im.threads.ui.views.search.SearchListView.access$getOnListItemClickCallback$p(r0)
            if (r0 == 0) goto Ld
            r0.invoke(r2, r3)
        Ld:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.views.search.SearchListView$init$1.invoke2(java.lang.String, java.lang.String):void");
    }
}
