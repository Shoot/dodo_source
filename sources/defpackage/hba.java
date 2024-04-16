package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a2\u0010\n\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001a\u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u001a&\u0010\f\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b\u001a&\u0010\r\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b\u001a&\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b\"(\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\"/\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019*\u0004\b\u001a\u0010\u001b\"2\u0010#\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001d8F@FX\u0086\u008e\u0002ø\u0001\u0000¢\u0006\u0012\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!*\u0004\b\"\u0010\u001b\"(\u0010)\u001a\u00020$*\u00020\u00002\u0006\u0010\u000f\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Ljba;", "", "a", "", "label", "Lkotlin/Function1;", "", "Lbcb;", "", "action", "b", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, e.a, "f", "value", "getContentDescription", "(Ljba;)Ljava/lang/String;", Image.TYPE_HIGH, "(Ljba;Ljava/lang/String;)V", "contentDescription", "<set-?>", "getFocused", "(Ljba;)Z", "i", "(Ljba;Z)V", "getFocused$delegate", "(Ljba;)Ljava/lang/Object;", "focused", "Lgn9;", "getRole", "(Ljba;)I", "j", "(Ljba;I)V", "getRole$delegate", "role", "Lml;", "getText", "(Ljba;)Lml;", "k", "(Ljba;Lml;)V", "text", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: hba  reason: default package */
/* loaded from: classes.dex */
public final class hba {
    static final /* synthetic */ je5<Object>[] a = {bc9.d(new wq6(hba.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), bc9.d(new wq6(hba.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), bc9.d(new wq6(hba.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), bc9.d(new wq6(hba.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), bc9.d(new wq6(hba.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), bc9.d(new wq6(hba.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), bc9.d(new wq6(hba.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), bc9.d(new wq6(hba.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), bc9.d(new wq6(hba.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), bc9.d(new wq6(hba.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), bc9.d(new wq6(hba.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), bc9.d(new wq6(hba.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), bc9.d(new wq6(hba.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), bc9.d(new wq6(hba.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), bc9.d(new wq6(hba.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), bc9.d(new wq6(hba.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), bc9.d(new wq6(hba.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), bc9.d(new wq6(hba.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), bc9.d(new wq6(hba.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), bc9.d(new wq6(hba.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static {
        eba ebaVar = eba.a;
        ebaVar.t();
        ebaVar.p();
        ebaVar.n();
        ebaVar.m();
        ebaVar.g();
        ebaVar.l();
        ebaVar.l();
        ebaVar.y();
        ebaVar.i();
        ebaVar.z();
        ebaVar.q();
        ebaVar.u();
        ebaVar.e();
        ebaVar.w();
        ebaVar.j();
        ebaVar.s();
        ebaVar.a();
        ebaVar.b();
        ebaVar.x();
        saa.a.c();
    }

    public static final void a(jba jbaVar) {
        z65.h(jbaVar, "<this>");
        jbaVar.d(eba.a.d(), Unit.a);
    }

    public static final void b(jba jbaVar, String str, Function1<? super List<bcb>, Boolean> function1) {
        z65.h(jbaVar, "<this>");
        jbaVar.d(saa.a.g(), new q2(str, function1));
    }

    public static /* synthetic */ void c(jba jbaVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        b(jbaVar, str, function1);
    }

    public static final void d(jba jbaVar, String str, Function0<Boolean> function0) {
        z65.h(jbaVar, "<this>");
        jbaVar.d(saa.a.h(), new q2(str, function0));
    }

    public static final void e(jba jbaVar, String str, Function0<Boolean> function0) {
        z65.h(jbaVar, "<this>");
        jbaVar.d(saa.a.i(), new q2(str, function0));
    }

    public static final void f(jba jbaVar, String str, Function0<Boolean> function0) {
        z65.h(jbaVar, "<this>");
        jbaVar.d(saa.a.p(), new q2(str, function0));
    }

    public static /* synthetic */ void g(jba jbaVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        f(jbaVar, str, function0);
    }

    public static final void h(jba jbaVar, String str) {
        List e;
        z65.h(jbaVar, "<this>");
        z65.h(str, "value");
        iba<List<String>> c = eba.a.c();
        e = jc1.e(str);
        jbaVar.d(c, e);
    }

    public static final void i(jba jbaVar, boolean z) {
        z65.h(jbaVar, "<this>");
        eba.a.g().c(jbaVar, a[4], Boolean.valueOf(z));
    }

    public static final void j(jba jbaVar, int i) {
        z65.h(jbaVar, "$this$role");
        eba.a.q().c(jbaVar, a[10], gn9.h(i));
    }

    public static final void k(jba jbaVar, ml mlVar) {
        List e;
        z65.h(jbaVar, "<this>");
        z65.h(mlVar, "value");
        iba<List<ml>> v = eba.a.v();
        e = jc1.e(mlVar);
        jbaVar.d(v, e);
    }
}
