package im.threads.business.extensions;

import android.os.Build;
import im.threads.business.models.MessageFromHistory;
import im.threads.business.rest.models.SearchResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: BusinessExtensions.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\u001f\u0010\f\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u000e*\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086\u0004\u001a\u0006\u0010\u0012\u001a\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Lkotlin/Function1;", "Lqx1;", "block", "withMainContext", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "", "", "fullLogString", "", "Ljava/lang/StackTraceElement;", "elements", "buildStackTraceString", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "Lim/threads/business/rest/models/SearchResponse;", "newResponse", "plus", "", "isUnitTest", "threads_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class BusinessExtensionsKt {
    private static final String buildStackTraceString(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            Iterator a = jr.a(stackTraceElementArr);
            while (a.hasNext()) {
                sb.append(((StackTraceElement) a.next()) + "\n");
            }
        }
        String sb2 = sb.toString();
        z65.g(sb2, "sb.toString()");
        return sb2;
    }

    public static final String fullLogString(Throwable th) {
        z65.h(th, "<this>");
        th.printStackTrace(new PrintWriter(new StringWriter()));
        String buildStackTraceString = buildStackTraceString(th.getStackTrace());
        String message = th.getMessage();
        return "Message: " + message + ", stacktrace:\n" + buildStackTraceString;
    }

    public static final boolean isUnitTest() {
        if (z65.c(Build.DEVICE, "robolectric") && z65.c(Build.PRODUCT, "robolectric")) {
            return true;
        }
        return false;
    }

    public static final SearchResponse plus(SearchResponse searchResponse, SearchResponse searchResponse2) {
        List<MessageFromHistory> l;
        Integer num;
        if (searchResponse2 != null) {
            Integer num2 = null;
            if (searchResponse2.getTotal() == null) {
                if (searchResponse != null) {
                    num = searchResponse.getTotal();
                } else {
                    num = null;
                }
                searchResponse2.setTotal(num);
            }
            if (searchResponse2.getPages() == null) {
                if (searchResponse != null) {
                    num2 = searchResponse.getPages();
                }
                searchResponse2.setPages(num2);
            }
            ArrayList arrayList = new ArrayList();
            if (searchResponse == null || (l = searchResponse.getContent()) == null) {
                l = kc1.l();
            }
            arrayList.addAll(l);
            List<MessageFromHistory> content = searchResponse2.getContent();
            if (content == null) {
                content = kc1.l();
            }
            arrayList.addAll(content);
            searchResponse2.setContent(arrayList);
            return searchResponse2;
        } else if (searchResponse == null) {
            return new SearchResponse();
        } else {
            return searchResponse;
        }
    }

    public static final <T> Object withMainContext(Function1<? super qx1, ? extends T> function1, cv1<? super T> cv1Var) {
        return qh0.g(v33.c(), new BusinessExtensionsKt$withMainContext$2(function1), cv1Var);
    }
}
