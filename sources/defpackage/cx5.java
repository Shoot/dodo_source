package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LogResponseDataManagerImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J<\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcx5;", "Lbx5;", "", "Lax5;", "filteredLogs", "firstLog", "lastLog", "Lddc;", RemoteMessageConst.FROM, RemoteMessageConst.TO, "", "a", "b", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cx5  reason: default package */
/* loaded from: classes.dex */
public final class cx5 implements bx5 {
    public static final a a = new a(null);

    /* compiled from: LogResponseDataManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcx5$a;", "", "", "OPERATION_LIMIT", "I", "", "STATUS_NO_LOGS", "Ljava/lang/String;", "STATUS_NO_NEW_LOGS", "STATUS_NO_OLD_LOGS", "STATUS_OK", "STATUS_REQUESTED_LOG_IS_TOO_LARGE", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: cx5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.bx5
    public String a(List<ax5> list, ax5 ax5Var, ax5 ax5Var2, ddc ddcVar, ddc ddcVar2) {
        String i0;
        z65.h(list, "filteredLogs");
        z65.h(ax5Var, "firstLog");
        z65.h(ax5Var2, "lastLog");
        z65.h(ddcVar, RemoteMessageConst.FROM);
        z65.h(ddcVar2, RemoteMessageConst.TO);
        if (ax5Var2.b().f0(ddcVar)) {
            return "No data found. The latest log has date: " + ax5Var2.b();
        } else if (ax5Var.b().e0(ddcVar2)) {
            return "No data found. The elder log has date: " + ax5Var.b();
        } else if (!list.isEmpty()) {
            i0 = sc1.i0(list, null, null, null, 0, null, null, 63, null);
            if (i0.length() * 2 > 819200) {
                return "The requested log size is too large.";
            }
            return "Ok";
        } else {
            return "No data found.";
        }
    }

    @Override // defpackage.bx5
    public List<ax5> b(List<ax5> list, ax5 ax5Var, ax5 ax5Var2, ddc ddcVar, ddc ddcVar2) {
        String i0;
        List T;
        String i02;
        List<ax5> T2;
        List<ax5> l;
        List<ax5> l2;
        List<ax5> l3;
        z65.h(list, "filteredLogs");
        z65.h(ax5Var, "firstLog");
        z65.h(ax5Var2, "lastLog");
        z65.h(ddcVar, RemoteMessageConst.FROM);
        z65.h(ddcVar2, RemoteMessageConst.TO);
        if (ax5Var.b().e0(ddcVar2)) {
            l3 = kc1.l();
            return l3;
        } else if (ax5Var2.b().f0(ddcVar)) {
            l2 = kc1.l();
            return l2;
        } else if (list.isEmpty()) {
            l = kc1.l();
            return l;
        } else {
            i0 = sc1.i0(list, null, null, null, 0, null, null, 63, null);
            if (i0.length() * 2 >= 819200) {
                int i = 1;
                while (true) {
                    T = sc1.T(list, i);
                    i02 = sc1.i0(T, null, null, null, 0, null, null, 63, null);
                    if (i02.length() * 2 <= 819200) {
                        T2 = sc1.T(list, i);
                        return T2;
                    }
                    i++;
                }
            } else {
                return list;
            }
        }
    }
}
