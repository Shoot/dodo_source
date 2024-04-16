package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: PaginatorBuilder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0018"}, d2 = {"Lip7;", "", "Ll87;", "loadMoreCallback", e.a, "Las5;", "creator", DateTokenConverter.CONVERTER_KEY, "Lgp7;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "I", "loadingTriggerThreshold", c.a, "Las5;", "loadingItemCreator", "Ll87;", "loadMoreListener", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ip7  reason: default package */
/* loaded from: classes.dex */
public final class ip7 {
    private final RecyclerView a;
    private int b;
    private as5 c;
    private l87 d;

    public ip7(RecyclerView recyclerView) {
        z65.h(recyclerView, "recyclerView");
        this.a = recyclerView;
        this.b = 5;
    }

    public final gp7 b() {
        if (this.a.getAdapter() != null) {
            if (this.a.getLayoutManager() != null) {
                if (this.b >= 0) {
                    return new gp7(this.a, (l87) mh5.c(this.d, new l87() { // from class: hp7
                        @Override // defpackage.l87
                        public final void a() {
                            ip7.c();
                        }
                    }), this.b, this.c);
                }
                throw new IllegalStateException("loadingTriggerThreshold cannot be negative".toString());
            }
            throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView".toString());
        }
        throw new IllegalStateException("Adapter needs to be set!".toString());
    }

    public final ip7 d(as5 as5Var) {
        z65.h(as5Var, "creator");
        this.c = as5Var;
        return this;
    }

    public final ip7 e(l87 l87Var) {
        z65.h(l87Var, "loadMoreCallback");
        this.d = l87Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
    }
}
