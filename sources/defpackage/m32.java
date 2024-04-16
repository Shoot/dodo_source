package defpackage;

import android.database.Cursor;
import android.widget.Filter;
/* compiled from: CursorFilter.java */
/* renamed from: m32  reason: default package */
/* loaded from: classes.dex */
class m32 extends Filter {
    a a;

    /* compiled from: CursorFilter.java */
    /* renamed from: m32$a */
    /* loaded from: classes.dex */
    interface a {
        void a(Cursor cursor);

        CharSequence b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m32(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c = this.a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c != null) {
            filterResults.count = c.getCount();
            filterResults.values = c;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d = this.a.d();
        Object obj = filterResults.values;
        if (obj != null && obj != d) {
            this.a.a((Cursor) obj);
        }
    }
}
