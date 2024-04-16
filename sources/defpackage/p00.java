package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AutoCompleteAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB-\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0018\u00010\rR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0017"}, d2 = {"Lp00;", "Landroid/widget/ArrayAdapter;", "Lss3;", "", "newItems", "", "b", "Landroid/widget/Filter;", "getFilter", "", "a", "Ljava/util/List;", "items", "Lp00$a;", "Lp00$a;", "filter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "resource", "textViewResourceId", "<init>", "(Landroid/content/Context;IILjava/util/List;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: p00  reason: default package */
/* loaded from: classes4.dex */
public final class p00 extends ArrayAdapter<ss3> {
    private final List<ss3> a;
    private a b;

    /* compiled from: AutoCompleteAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lp00$a;", "Landroid/widget/Filter;", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "results", "", "publishResults", "<init>", "(Lp00;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p00$a */
    /* loaded from: classes4.dex */
    public final class a extends Filter {
        public a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            z65.h(charSequence, "constraint");
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = p00.this.a;
            filterResults.count = p00.this.a.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults != null && filterResults.count > 0) {
                p00.this.notifyDataSetChanged();
            } else {
                p00.this.notifyDataSetInvalidated();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(Context context, int i, int i2, List<ss3> list) {
        super(context, i, i2, list);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(list, "items");
        this.a = list;
    }

    public final void b(List<? extends ss3> list) {
        z65.h(list, "newItems");
        this.a.clear();
        this.a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        a aVar = this.b;
        if (aVar == null) {
            aVar = new a();
        }
        this.b = aVar;
        return aVar;
    }
}
