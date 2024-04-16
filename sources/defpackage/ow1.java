package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CookieJar.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Low1;", "", "Lsq4;", RemoteMessageConst.Notification.URL, "", "Lnw1;", "cookies", "", "a", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ow1  reason: default package */
/* loaded from: classes3.dex */
public interface ow1 {
    public static final a a = a.a;
    public static final ow1 b = new a.C0472a();

    /* compiled from: CookieJar.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Low1$a;", "", "Low1;", "NO_COOKIES", "Low1;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ow1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* compiled from: CookieJar.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Low1$a$a;", "Low1;", "Lsq4;", RemoteMessageConst.Notification.URL, "", "Lnw1;", "cookies", "", "a", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ow1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C0472a implements ow1 {
            @Override // defpackage.ow1
            public void a(sq4 sq4Var, List<nw1> list) {
                z65.h(sq4Var, RemoteMessageConst.Notification.URL);
                z65.h(list, "cookies");
            }

            @Override // defpackage.ow1
            public List<nw1> b(sq4 sq4Var) {
                List<nw1> l;
                z65.h(sq4Var, RemoteMessageConst.Notification.URL);
                l = kc1.l();
                return l;
            }
        }

        private a() {
        }
    }

    void a(sq4 sq4Var, List<nw1> list);

    List<nw1> b(sq4 sq4Var);
}
